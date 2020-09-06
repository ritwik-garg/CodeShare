package com.example.sample.dataTypes;

import lombok.NonNull;

import java.math.BigDecimal;

public class BigDecimalDataType extends DataType<BigDecimal> {
    public BigDecimalDataType() {
        super(BigDecimal::new);
    }

    @Override
    public Class<BigDecimal> getDateTypeClass() {
        return BigDecimal.class;
    }

    @Override
    public Boolean applyGTOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue).compareTo(this.parseData(sourceValue)) > 0;
    }

    @Override
    public Boolean applyGTEOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue).compareTo(this.parseData(sourceValue)) >= 0;
    }

    @Override
    public Boolean applyLTOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue).compareTo(this.parseData(sourceValue)) < 0;
    }

    @Override
    public Boolean applyLTEOperator(@NonNull String sourceValue, @NonNull String targetValue) {
        return this.parseData(targetValue).compareTo(this.parseData(sourceValue)) <= 0;
    }
}
