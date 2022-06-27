package ru.netology.manager;

public class MovieManager {

    private String[] movies = new String[0];
    private final int limit;

    public MovieManager(){

        limit = 10;
    }

    public MovieManager(int limit){

        this.limit = limit;
    }

    public void addMovie(String movie){

        String[] tmp = new String[movies.length + 1];

        for(int i=0; i< movies.length; i++){

            tmp[i] = movies[i];
        }

        tmp[tmp.length-1] = movie;
        movies = tmp;
    }

    public String[] findAll(){

        return movies;
    }

    public String[] findLast(){

        int resultLength = Math.min(movies.length, limit);

        String[] tmp = new String[resultLength];

        for (int i=0; i < tmp.length; i++){

            tmp[i] = movies[movies.length-i-1];
        }

        return tmp;
    }
}
