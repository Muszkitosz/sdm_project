package com.example.movie_management.movie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchLaterRepository extends CrudRepository<WatchLater, String> {
}
