package com.example.sample.dataTypes;

import lombok.NonNull;

public class BooleanDataType extends DataType<Boolean> {
    public BooleanDataType() {
        super(Boolean::parseBoolean);
    }

    @Override
    public Class<Boolean> getDateTypeClass() {
        return Boolean.class;
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
