package com.urlshortner.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urlshortner.dao.IUrlRepository;
import com.urlshortner.entity.Url;
import com.urlshortner.exception.UrlNotFoundException;

@Service
public class UrlServiceImpl implements IUrlService {

	@Autowired
	IUrlRepository urlRepository;
	
	@Override
	public Url createUrl(String longUrl) {
		Url url = new Url();
		long id = url.generateId();
		Optional<Url> temp = urlRepository.findById(id);
		while(temp.isPresent()) {
			id = url.generateId();
			temp = urlRepository.findById(id);
		}
			
		url.setId(id);
		url.setShortUrl(url.generateUrl(id));
		url.setLongUrl(longUrl);
		url.setCreatedAt(LocalDate.now());
		
		return urlRepository.save(url);
	}
	
	
	public Url createUrl(String longUrl, long urlId) {
		Url url = new Url();
		long id = urlId;
			
		url.setId(id);
		url.setShortUrl(url.generateUrl(id));
		url.setLongUrl(longUrl);
		url.setCreatedAt(LocalDate.now());
		
		return urlRepository.save(url);
	}

	@Override
	public Url deleteUrl(String shortUrl) {
		Url url = urlRepository.findByShortUrl(shortUrl);
		if(url != null) {
			urlRepository.delete(url);
			return url;
		}
		else
			throw new UrlNotFoundException("Url not found for "+ shortUrl +" short url.");
	}

	@Override
	public String redirectUrl(String shortUrl) {
		Url url = urlRepository.findByShortUrl(shortUrl);
		//return url.getLongUrl();
		if(url == null) {
	    	 throw new UrlNotFoundException("Url not found for "+ shortUrl +" short url.");
	     }else {
	    	 return url.getLongUrl();
	    	 
	     }
	}

}
