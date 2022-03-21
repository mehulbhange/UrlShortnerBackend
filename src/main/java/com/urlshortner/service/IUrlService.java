package com.urlshortner.service;

import com.urlshortner.entity.Url;

public interface IUrlService {
	
	public Url createUrl(String longUrl);
	public String redirectUrl(String shortUrl);
	public Url deleteUrl(String shortUrl);
	
}
