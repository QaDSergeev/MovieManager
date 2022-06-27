package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void findAllMovieTest(){

        MovieManager manager = new MovieManager();

        manager.addMovie("movie 1");
        manager.addMovie("movie 2");
        manager.addMovie("movie 3");
        manager.addMovie("movie 4");
        manager.addMovie("movie 5");

        String[] expectedMovies = {"movie 1", "movie 2", "movie 3", "movie 4", "movie 5"};
        String[] actualMovies = manager.findAll();

        assertArrayEquals(expectedMovies, actualMovies);
    }

    @Test
    public void findLastMovieTestIfLimitLessCountMovies(){

        MovieManager manager = new MovieManager(3);

        manager.addMovie("movie 1");
        manager.addMovie("movie 2");
        manager.addMovie("movie 3");
        manager.addMovie("movie 4");
        manager.addMovie("movie 5");
        manager.addMovie("movie 6");
        manager.addMovie("movie 7");
        manager.addMovie("movie 8");
        manager.addMovie("movie 9");
        manager.addMovie("movie 10");

        String[] expectedMovies = {"movie 10", "movie 9", "movie 8"};
        String[] actualLastMovies = manager.findLast();

        assertArrayEquals(expectedMovies, actualLastMovies);
    }

    @Test
    public void findLastMovieTestIfLimitGreatCountMovies(){

        MovieManager manager = new MovieManager(6);

        manager.addMovie("movie 1");
        manager.addMovie("movie 2");
        manager.addMovie("movie 3");
        manager.addMovie("movie 4");
        manager.addMovie("movie 5");

        String[] expectedMovies = {"movie 5", "movie 4", "movie 3", "movie 2", "movie 1"};
        String[] actualLastMovies = manager.findLast();

        assertArrayEquals(expectedMovies, actualLastMovies);
    }
}
