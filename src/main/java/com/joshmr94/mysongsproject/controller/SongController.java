package com.joshmr94.mysongsproject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joshmr94.mysongsproject.entity.Song;
import com.joshmr94.mysongsproject.model.MSong;
import com.joshmr94.mysongsproject.service.SongService;

@RestController
@RequestMapping("/v1")
public class SongController {

	@Autowired
	@Qualifier("SongService")
	private SongService songService;
	
	@GetMapping("/song") //also can use @RequestMapping(method=GET)
	public List<MSong> findAll() {
		return songService.findAll();
	} 
	
	@PutMapping("/song")
	public boolean updateSong(@RequestBody @Valid Song song) {
		return songService.updateSong(song);
	}
}
