package com.joshmr94.mysongsproject.model;

import com.joshmr94.mysongsproject.entity.Song;

public class MSong {
	
	private long id;
	private String title;
	private String genre;
	private String artist;
	private String album;
	private boolean liked;
	
	public MSong() {
	}
	
	public MSong(Song song) {
		this.id = song.getId();
		this.title = song.getTitle();
		this.genre = song.getGenre();
		this.artist = song.getArtist();
		this.album = song.getAlbum();
		this.liked = song.isLiked();
	}

	public MSong(long id, String title, String genre, String artist, String album, boolean liked) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.artist = artist;
		this.album = album;
		this.liked = liked;
	}


	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public boolean isLiked() {
		return liked;
	}
	
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
}
