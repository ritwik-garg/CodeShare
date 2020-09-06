package com.example.sample;

import lombok.NonNull;

/**
 * Interface class for operators . All operators will implement this interface.
 */
public interface OperatorExecutor {

    /**
     * Apply the given operation for the given input and optionally use or update execution context.
     * @param input - {@link OperationExecutorInput}
     * @param executionContext - {@link ExecutionContext}
     * @return {@link OperationExecutorOutput}
     */
    OperationExecutorOutput execute(
            @NonNull final OperationExecutorInput input,
            @NonNull final ExecutionContext executionContext);
}
