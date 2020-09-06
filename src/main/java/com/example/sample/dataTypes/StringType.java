package com.example.sample.dataTypes;

import lombok.NonNull;

public class StringType extends DataType<String> {
    public StringType() {
        super((arg) -> arg);
    }

    @Override
    public Class<String> getDateTypeClass() {
        return String.class;
    }

    @Override
    public Boolean applyGTOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return null;
    }

    @Override
    public Boolean applyGTEOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return null;
    }

    @Override
    public Boolean applyLTOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return null;
    }

    @Override
    public Boolean applyLTEOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return null;
    }
}
