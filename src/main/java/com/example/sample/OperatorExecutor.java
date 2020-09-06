package com.example.sample;

import lombok.NonNull;

import java.util.Objects;

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

    default boolean validateArgs(final @NonNull OperationExecutorInput input) {
        final MGAttribute sourceAttribute = input.getOperationConfig().getParameterConfig().getSourceAttribute();
        final MGAttribute targetAttribute = input.getOperationConfig().getParameterConfig().getTargetAttribute();
        if (Objects.isNull(sourceAttribute) || Objects.isNull(targetAttribute)) {
            return false;
        }
        if (Objects.isNull(sourceAttribute.getDataType()) || StringUtils.isBlank(sourceAttribute.getAttributeName())) {
            return false;
        }
        return sourceAttribute.getDataType().getDateTypeClass().equals(targetAttribute.getDataType().getDateTypeClass());
    }
}
