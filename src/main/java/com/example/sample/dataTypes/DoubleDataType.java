package com.example.sample.dataTypes;

import lombok.NonNull;

public class DoubleDataType extends DataType<Double> {
    public DoubleDataType() {
        super(Double::parseDouble);
    }

    @Override
    public Class<Double> getDateTypeClass() {
        return Double.class;
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
