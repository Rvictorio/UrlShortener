package com.rvictorio.urlshortener.repository;

import com.rvictorio.urlshortener.entities.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String> {
}
