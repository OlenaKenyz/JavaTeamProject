package com.team1.project;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class App {
	public static void main(String[] args) {
		List<Song> listSong;
		try {
			listSong = JsonParser.parse("album.json");
			for (Song song :listSong) {
				System.out.println(song.getSong()+" "+song.getArtist() + " "+ song.getDuration());
		}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}
