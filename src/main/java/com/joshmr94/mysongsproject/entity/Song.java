package com.joshmr94.mysongsproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="songs")
@Entity
public class Song implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="artist")
	private String artist;
	
	@Column(name="album")
	private String album;
	
	@Column(name="liked")
	private boolean liked;
	
	public Song(long id, String title, String genre, String artist, String album, boolean liked) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.artist = artist;
		this.album = album;
		this.liked = liked;
	}

	public Song() {
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
