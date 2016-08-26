package com.acrcloud.data.basic;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Deezer {
	private List<Genre> genres;
	private Album album;
	private List<Artist> artists;
	private Track track;

	public Album getAlbum() {
		return album;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public Track getTrack() {
		return track;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public void setTrack(Track track) {
		this.track = track;
	}
}
