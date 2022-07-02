package ru.netology.manager;

import javax.swing.*;

public class MovieManager {

    private MovieData[] movies = new MovieData[0];
    private final int limit;

    public MovieManager() {

        limit = 10;
    }

    public MovieManager(int limit) {

        this.limit = limit;
    }

    public void addMovie(MovieData movie) {

        MovieData[] tmp = new MovieData[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {

            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieData[] findAll() {

        return movies;
    }

    public MovieData[] findLast() {

        int resultLength = Math.min(movies.length, limit);

        MovieData[] tmp = new MovieData[resultLength];

        for (int i = 0; i < tmp.length; i++) {

            tmp[i] = movies[movies.length - i - 1];
        }

        return tmp;
    }
}
