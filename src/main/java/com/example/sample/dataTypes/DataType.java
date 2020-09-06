package com.example.sample.dataTypes;

import lombok.NonNull;

import java.util.Objects;
import java.util.function.Function;

public abstract class DataType<T> {
    private final Function<String, T> parser;

    public DataType(final @NonNull Function<String, T> parser) {
        this.parser = parser;
    }

    public abstract Class<T> getDateTypeClass();

    public T parseData(final String data) {
        if (Objects.isNull(data)) {
            throw new IllegalArgumentException("input data is null");
        }
        return this.parser.apply(data);
    }

    public abstract Boolean applyGTOperator(final @NonNull String sourceValue, final @NonNull String targetValue);

    public abstract Boolean applyGTEOperator(final @NonNull String sourceValue, final @NonNull String targetValue);

    public abstract Boolean applyLTOperator(final @NonNull String sourceValue, final @NonNull String targetValue);

    public abstract Boolean applyLTEOperator(final @NonNull String sourceValue, final @NonNull String targetValue);
}