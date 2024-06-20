package com.rvictorio.urlshortener.controller;


import com.rvictorio.urlshortener.dto.shortenUrlRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
    @PostMapping(value ="/shorten-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody shortenUrlRequest request){
        return ResponseEntity.ok().build();
    }
}
