package tll.kinoback.movie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tll.kinoback.movie.models.Movie;
import tll.kinoback.movie.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return movieService.getMovieById(id);
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createOrUpdateMovie(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        movie.setMovieId(id);
        return movieService.createOrUpdateMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
    }
}
