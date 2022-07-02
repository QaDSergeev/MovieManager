package ru.netology.manager;


import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class MovieData {

    private String title;
    private String imgUrl;
    private String releaseDate;
}
