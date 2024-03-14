package tll.kinoback.movie.services;

import tll.kinoback.movie.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie getMovieById(int id);

    Movie createOrUpdateMovie(Movie movie);

    void deleteMovie(int id);
}
