package com.example.sample;

import lombok.NonNull;

import java.util.Objects;
import java.util.function.Function;

public abstract class DataType<T> {
    private final Function<String, T> parser;
    public abstract Class<T> getDateTypeClass();

    public DataType(final @NonNull Function<String, T> parser) {
        this.parser = parser;
    }

    public T parseData(final String data) {
        if (Objects.isNull(data)) {
            throw new IllegalArgumentException("input data is null");
        }
        return this.parser.apply(data);
    }
}