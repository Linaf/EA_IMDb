package dataaccess;

import java.util.Collection;

import Model.Artist;

public interface IArtistDAO {
	public void saveArtist(Artist Artist);

	public void updateArtist(Artist Artist);

	public Artist loadArtist(String name);

	public Collection<Artist> getArtists();
}
