package com.team1.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Song {
	public Song() {
	};

	private String song;
	private String artist;
	private String duration;

	@JsonCreator
	public Song(@JsonProperty("song") String song, @JsonProperty("artist") String artist,
			@JsonProperty("duration") String duration) {
		this.song = song;
		this.artist = artist;
		this.duration = duration;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
