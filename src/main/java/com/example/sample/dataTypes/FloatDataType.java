package com.example.sample.dataTypes;

import lombok.NonNull;

public class FloatDataType extends DataType<Float> {
    public FloatDataType() {
        super(Float::parseFloat);
    }

    @Override
    public Class<Float> getDateTypeClass() {
        return Float.class;
    }

    @Override
    public Boolean applyGTOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue) > this.parseData(sourceValue);
    }

    @Override
    public Boolean applyGTEOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue) >= this.parseData(sourceValue);
    }

    @Override
    public Boolean applyLTOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue) < this.parseData(sourceValue);
    }

    @Override
    public Boolean applyLTEOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue) <= this.parseData(sourceValue);
    }
}
