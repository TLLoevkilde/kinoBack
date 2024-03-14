package tll.kinoback.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tll.kinoback.movie.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
