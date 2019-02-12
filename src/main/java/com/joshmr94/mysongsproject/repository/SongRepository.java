package com.joshmr94.mysongsproject.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joshmr94.mysongsproject.entity.Song;

@Repository("SongRepository")
public interface SongRepository extends JpaRepository<Song, Serializable>{
	//public abstract List<Song> findAll();
	public abstract Song findByTitle(String title);
	public abstract Song findById(long id);
}
