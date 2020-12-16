package ru.vaseba.spring.genres;

import org.springframework.stereotype.Component;
import ru.vaseba.spring.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
