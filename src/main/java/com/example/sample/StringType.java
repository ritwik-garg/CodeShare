package com.example.sample;

public class StringType extends DataType<String> {
    public StringType() {
        super((arg) -> arg);
    }

    @Override
    public Class<String> getDateTypeClass() {
        return String.class;
    }
}
