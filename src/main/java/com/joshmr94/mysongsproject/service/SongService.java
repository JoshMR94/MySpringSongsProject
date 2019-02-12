package com.joshmr94.mysongsproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.joshmr94.mysongsproject.converter.Converter;
import com.joshmr94.mysongsproject.entity.Song;
import com.joshmr94.mysongsproject.model.MSong;
import com.joshmr94.mysongsproject.repository.SongRepository;

@Service("SongService")
public class SongService {
	
	@Autowired
	@Qualifier("SongRepository")
	private SongRepository songRepository;
	
	@Autowired
	@Qualifier("Converter")
	private Converter converter;
	
	public List<MSong> findAll() {
		List<MSong> mSongList = new ArrayList<MSong>();
		try {
			List songList = new ArrayList<Song>();
			songList = songRepository.findAll();
			mSongList = converter.convertList(songList);
			return mSongList;
		} catch (Exception e) {
			return null;
		}
	}
	
	public MSong findByTitle(String title) {
		MSong mSongByTitle;
		try {
			Song songByTitle = songRepository.findByTitle(title);
			mSongByTitle = new MSong(songByTitle);
			return mSongByTitle;
		} catch (Exception e) {
			return null;
		}
	}
	
	public MSong findById(long id) {
		MSong mSongById;
		try {
			Song songById = songRepository.findById(id);
			mSongById = new MSong(songById);
			return mSongById;
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean insertSong(Song song) {
		try {
			songRepository.save(song);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean updateSong(Song song) {
		try {
			Song songExists = songRepository.findById(song.getId());
			
			if (songExists != null) {
				songRepository.save(song);
				return true;
			}
	
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean deleteSong(long songId) {
		try {
			songRepository.deleteById(songId);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
