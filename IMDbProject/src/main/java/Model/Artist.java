package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.criteria.*;

@Entity
public class Artist {
	@Id @GeneratedValue
	private int artistId;
	private String name;
	@Basic(optional=true)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Temporal(TemporalType.DATE)
	private Date placeOfBirth;
	private String biography;
	
	@ManyToMany(mappedBy="artists")
	private List<Movie> movies= new ArrayList<Movie>();
	
	
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public int getArtistId() {
		return artistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(Date placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}

