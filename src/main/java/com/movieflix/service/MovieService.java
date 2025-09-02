package com.movieflix.service;

import com.movieflix.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MovieService {

    private final MovieRepository movieRepository;
}
