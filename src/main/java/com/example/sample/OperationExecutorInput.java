package com.example.sample;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.Map;

/**
 * Input to be used for Operation Executor
 */
@Builder
@Value
public class OperationExecutorInput {

    /**
     * The configured operation config.
     */
    @NonNull
    private MGOperationConfig operationConfig;

    /**
     * The Source attribute value map to fetch the source operands for
     * the operation.
     */
    @NonNull
    private Map<String, String> sourceAttributeValueMap;


    /**
     * The Target attribute value map to fetch the target operands for
     * the operation.
     */
    @NonNull
    private Map<String, String> targetAttributeValueMap;
}
