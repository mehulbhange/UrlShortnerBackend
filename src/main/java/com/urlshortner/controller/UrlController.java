package com.urlshortner.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.urlshortner.dto.UrlDto;
import com.urlshortner.entity.Url;
import com.urlshortner.service.IUrlService;
import com.urlshortner.service.UrlServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UrlController {
	
	@Autowired
	UrlServiceImpl urlService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	/*
	@PostMapping("/addUrl")
	public ResponseEntity<Url> addUrl(@RequestParam(value = "longUrl") String longUrl) {
		System.out.println("Long url : "+longUrl);
		return new ResponseEntity<Url>(urlService.createUrl(longUrl),HttpStatus.ACCEPTED);
	}
	*/
	
	@PostMapping("/addUrl")
	public ResponseEntity<Url> addUrl(@RequestBody UrlDto urlDto){
		System.out.println("Long url : "+urlDto.getLongUrl());
		return new ResponseEntity<Url>(urlService.createUrl(urlDto.getLongUrl()),HttpStatus.ACCEPTED);
	}
	

	@GetMapping("/{shortUrl}")
	 public ResponseEntity<Void> redirect(@PathVariable String shortUrl){
	     String url = urlService.redirectUrl(shortUrl);
	     return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(url)).build();
	 }
	
	
	@DeleteMapping("/delete/{shortUrl}")
	public ResponseEntity<Url> deleteUrl(@PathVariable String shortUrl){
		return new ResponseEntity<Url>(urlService.deleteUrl(shortUrl),HttpStatus.NOT_FOUND);
	} 
    
	/*
	@DeleteMapping("/delete/{shortUrl}")
	public Url deleteUrl(@PathVariable String shortUrl) {
		return urlService.deleteUrl(shortUrl);
	}
	*/
  

}
