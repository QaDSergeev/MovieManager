package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    MovieData movie1 = MovieData.builder()
            .title("movie 1")
            .imgUrl("/1.img")
            .releaseDate("12.12.2023")
            .build();

    MovieData movie2 = MovieData.builder()
            .title("movie 2")
            .imgUrl("/2.img")
            .releaseDate("22.02.2022")
            .build();

    MovieData movie3 = MovieData.builder()
            .title("movie 3")
            .imgUrl("/3.img")
            .releaseDate("22.05.2022")
            .build();

    MovieData movie4 = MovieData.builder()
            .title("movie 4")
            .imgUrl("/4.img")
            .releaseDate("22.07.2022")
            .build();

    MovieData movie5 = MovieData.builder()
            .title("movie 5")
            .imgUrl("/5.img")
            .releaseDate("22.08.2022")
            .build();

    MovieData movie6 = MovieData.builder()
            .title("movie 6")
            .imgUrl("/6.img")
            .releaseDate("12.06.2023")
            .build();

    MovieData movie7 = MovieData.builder()
            .title("movie 7")
            .imgUrl("/7.img")
            .releaseDate("22.05.2022")
            .build();

    MovieData movie8 = MovieData.builder()
            .title("movie 8")
            .imgUrl("/8.img")
            .releaseDate("22.09.2022")
            .build();

    MovieData movie9 = MovieData.builder()
            .title("movie 9")
            .imgUrl("/9.img")
            .releaseDate("22.10.2022")
            .build();

    MovieData movie10 = MovieData.builder()
            .title("movie 10")
            .imgUrl("/10.img")
            .releaseDate("22.12.2023")
            .build();


    @Test
    public void findAllMovieTest() {

        MovieManager manager = new MovieManager();

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        MovieData[] expectedMovies = {movie1, movie2, movie3, movie4, movie5};
        MovieData[] actualMovies = manager.findAll();

        assertArrayEquals(expectedMovies, actualMovies);
    }

    @Test
    public void findLastMovieTestIfLimitLessCountMovies() {

        MovieManager manager = new MovieManager(3);

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);

        MovieData[] expectedMovies = {movie10, movie9, movie8};
        MovieData[] actualLastMovies = manager.findLast();

        assertArrayEquals(expectedMovies, actualLastMovies);
    }

    @Test
    public void findLastMovieTestIfLimitGreatCountMovies() {

        MovieManager manager = new MovieManager(6);

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        MovieData[] expectedMovies = {movie5, movie4, movie3, movie2, movie1};
        MovieData[] actualLastMovies = manager.findLast();

        assertArrayEquals(expectedMovies, actualLastMovies);
    }
}
