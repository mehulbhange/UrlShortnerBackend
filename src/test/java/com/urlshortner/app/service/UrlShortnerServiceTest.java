package com.urlshortner.app.service;



import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.urlshortner.dao.IUrlRepository;
import com.urlshortner.entity.Url;
import com.urlshortner.exception.UrlNotFoundException;
import com.urlshortner.service.UrlServiceImpl;

/*

@ExtendWith(SpringExtension.class)
public class UrlShortnerServiceTest {
	
	@InjectMocks
	UrlServiceImpl urlService;
	
	@MockBean
	IUrlRepository urlRespository;
	
	// Initialization of mock objects
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}
		
	
	@Test
	void test() {
		assertEquals(true, true);
		
	}
	
	@Test
	public void testCreateUrl() {
		Url url = new Url();
		String shortUrl = url.generateUrl(1234567890L);
		String longUrl = "https://www.learninglad.com/p/java-programming-free-video-tutorials.html";
		url.setId(1234567890L);
		url.setCreatedAt(LocalDate.now());
		url.setLongUrl(longUrl);
		url.setShortUrl(shortUrl);
		
		Mockito.when(urlRespository.save(url)).thenReturn(url);
		Url returnedUrl = urlService.createUrl(longUrl, 1234567890L);
		
		assertEquals(url.getId(), returnedUrl.getId());
		assertEquals(url.getShortUrl(), returnedUrl.getShortUrl());
		assertEquals(url.getLongUrl(), returnedUrl.getLongUrl());
		
	}
	
	@Test
	public void testRedirect() {
		Url url = new Url();
		String shortUrl = url.generateUrl(1234567890L);
		String longUrl = "https://www.learninglad.com/p/java-programming-free-video-tutorials.html";
		url.setId(1234567890L);
		url.setCreatedAt(LocalDate.now());
		url.setLongUrl(longUrl);
		url.setShortUrl(shortUrl);
		
		Mockito.when(urlRespository.findByShortUrl(shortUrl)).thenReturn(url);
		String returnedLongUrl = urlService.redirectUrl(shortUrl);
		
		assertEquals(url.getLongUrl(), returnedLongUrl);
	}
	
	@Test
	public void testRedirectExceptionThrown() {
		Url url = new Url();
		String shortUrl = url.generateUrl(1234567890L);
		url.setShortUrl(shortUrl);
		boolean t = false;
		
		Mockito.when(urlRespository.findByShortUrl(shortUrl)).thenThrow(UrlNotFoundException.class);
		try {
			Url returnedUrl = urlService.deleteUrl(shortUrl);
		}catch(UrlNotFoundException exception){
			t = true;
		}
	
		assertEquals(true, t);
		
	}
	
	@Test
	public void testDelete() {
		Url url = new Url();
		String shortUrl = url.generateUrl(1234567890L);
		String longUrl = "https://www.learninglad.com/p/java-programming-free-video-tutorials.html";
		url.setId(1234567890L);
		url.setCreatedAt(LocalDate.now());
		url.setLongUrl(longUrl);
		url.setShortUrl(shortUrl);
		
		Mockito.when(urlRespository.findByShortUrl(shortUrl)).thenReturn(url);
		Url returnedUrl = urlService.deleteUrl(shortUrl);
		
		assertEquals(url.getShortUrl(),returnedUrl.getShortUrl());
		assertEquals(url.getLongUrl(), returnedUrl.getLongUrl());
	}
	
	@Test()
	public void testDeleteExceptionThrown() {
		Url url = new Url();
		String shortUrl = url.generateUrl(1234567890L);
		url.setShortUrl(shortUrl);
		boolean t = false;
		
		Mockito.when(urlRespository.findByShortUrl(shortUrl)).thenThrow(UrlNotFoundException.class);
		//Mockito.when(urlRespository.findByShortUrl(shortUrl)).thenReturn(url);
		try {
			Url returnedUrl = urlService.deleteUrl(shortUrl);
		}catch(UrlNotFoundException exception){
			t = true;
		}
	
		assertEquals(true, t);
		
	}

}

*/
