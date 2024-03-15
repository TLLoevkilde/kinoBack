package tll.kinoback.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tll.kinoback.movie.models.Movie;
import tll.kinoback.movie.services.MovieService;

@Component
public class MovieDataloader implements CommandLineRunner {

    @Autowired
    MovieService movieService;

    @Override
    public void run(String... args) throws Exception {
        if (movieService.getAllMovies().isEmpty()) {
            createMovie("Godzilla x Kong: The New Empire",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/b/be/Godzilla_x_kong_the_new_empire_poster.jpg/220px-Godzilla_x_kong_the_new_empire_poster.jpg");
            createMovie("Ghostbusters: Frozen Empire",
                    "https://upload.wikimedia.org/wikipedia/en/3/31/Ghostbusters_%282024%29_poster.jpg");
            createMovie("Perfect Days", "https://upload.wikimedia.org/wikipedia/en/c/c9/Perfect_Days_poster.jpg");
            createMovie("Birthday Girl",
                    "https://upload.wikimedia.org/wikipedia/en/0/06/Birthday_Girl_%28movie_poster%29.jpg?20081006102234");
            createMovie("Robot Dreams",
                    "https://upload.wikimedia.org/wikipedia/en/a/ac/Robot_Dreams_%28film%29_poster.jpg");
        }
    }

    public void createMovie(String title, String imageUrl) {
        Movie newMovie = new Movie();
        newMovie.setTitle(title);
        newMovie.setImageUrl(imageUrl);
        movieService.createOrUpdateMovie(newMovie);
    }

}
