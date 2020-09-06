package com.example.sample;

import lombok.Data;

@Data
public class MatchResult {
    private boolean result;

    public MatchResult(final boolean result) {
        this.result = result;
    }
}
