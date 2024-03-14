package tll.kinoback.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tll.kinoback.movie.models.Movie;
import tll.kinoback.movie.repositories.MovieRepository;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie createOrUpdateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }
}
