package com.sebastian_daschner.coffee_shop.entity;

import java.util.stream.Stream;

public enum BrewLocation {

    OFFICE,
    HOME;

    public static BrewLocation of(String string) {
        return Stream.of(BrewLocation.values())
                .filter(t -> t.name().equalsIgnoreCase(string))
                .findAny().orElse(null);
    }

}
