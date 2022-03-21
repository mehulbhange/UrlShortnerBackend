package com.urlshortner.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urlshortner.entity.Url;

public interface IUrlRepository extends JpaRepository<Url, Long> {
	public Url findByShortUrl(String shortUrl);
	public Url deleteByShortUrl(String shortUrl);
}
