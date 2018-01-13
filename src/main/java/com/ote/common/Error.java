package com.ote.common;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Error {
    @Getter
    private final List<String> messages = new ArrayList<>();

    public Error(String... msg) {
        messages.addAll(Arrays.asList(msg));
    }
}