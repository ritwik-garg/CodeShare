package com.example.sample.dataTypes;

import lombok.NonNull;

public class IntegerDataType extends DataType<Integer> {
    public IntegerDataType() {
        super(Integer::parseInt);
    }

    @Override
    public Class<Integer> getDateTypeClass() {
        return Integer.class;
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
