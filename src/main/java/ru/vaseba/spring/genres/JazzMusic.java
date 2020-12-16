package ru.vaseba.spring.genres;


import ru.vaseba.spring.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take five";
    }
}