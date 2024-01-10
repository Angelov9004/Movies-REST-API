package com.Angelov.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired

    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }
    public Optional <Movie> singleMovie(String imdbId) { return movieRepository.findMovieByImdbId(imdbId); }
}
