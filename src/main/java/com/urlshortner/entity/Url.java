package com.urlshortner.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class Url {
	
	@Id
	long id;
	@Column(length = 6)
	String shortUrl;
	String longUrl;
	LocalDate createdAt;
	
	public long generateId() {
		return (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
	}

	public String generateUrl(long id) {
		// Map to store 62 possible characters
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
     
        StringBuffer shorturl = new StringBuffer();
     
        // Convert given integer id to a base 62 number
        while (id > 0)
        {
            long x = id % 62;
            // use above map to store actual character
            // in short url
            shorturl.append(map[(int)x]);
            id = id / 62;
        }
     
        // Reverse shortURL to complete base conversion
        return shorturl.reverse().toString();

	}
}
