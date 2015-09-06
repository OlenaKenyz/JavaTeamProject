package com.team1.project;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class App {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Song> listSong;
		try {
			listSong = JsonParser.parse("album.json");
			Collections.sort(listSong);
			for (Song song :listSong) {
				System.out.println("\"" + song.getSong()+ "\""+ " by "+song.getArtist() + " ("+ song.getDuration()+")");
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
