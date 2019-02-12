package com.joshmr94.mysongsproject.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.joshmr94.mysongsproject.entity.Song;
import com.joshmr94.mysongsproject.model.MSong;

@Component("Converter")
public class Converter {
	
	public List<MSong> convertList(List<Song> songsList) {
		List<MSong> mSongsList = new ArrayList<MSong>();
		
		for (Song song : songsList) {
			mSongsList.add(new MSong(song));
		}
		
		return mSongsList;
	}
	
}
