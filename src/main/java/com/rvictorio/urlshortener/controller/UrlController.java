package com.rvictorio.urlshortener.controller;


import com.rvictorio.urlshortener.dto.ShortenUrlReponse;
import com.rvictorio.urlshortener.dto.ShortenUrlRequest;
import com.rvictorio.urlshortener.entities.UrlEntity;
import com.rvictorio.urlshortener.repository.UrlRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UrlController {
    private final UrlRepository urlRepository;

    public UrlController(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @PostMapping(value ="/shorten-url")
    public ResponseEntity<ShortenUrlReponse> shortenUrl(@RequestBody ShortenUrlRequest request,
                                           HttpServletRequest servletRequest){

       String id;
       do {
           id= RandomStringUtils.randomAlphanumeric(5,10);
       } while(urlRepository.existsById(id));

       urlRepository.save(new UrlEntity(id, request.url(), LocalDateTime.now().plusMinutes(1)));

        var redirectUrl = servletRequest.getRequestURL().toString().replace("shorten-url", id);


        return ResponseEntity.ok(new ShortenUrlReponse(redirectUrl));
    }

}
