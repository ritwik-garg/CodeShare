package com.example.sample.operators;

import com.example.sample.*;
import lombok.NonNull;

import java.util.Objects;

public class GTOperator implements OperatorExecutor {
    public OperationExecutorOutput execute(final @NonNull OperationExecutorInput input,
                                           final @NonNull ExecutionContext executionContext) {
        if (!validateArgs(input)) {
            return OperationExecutorOutput.builder().output(null).build();
        }
        String sourceValue;
        String targetValue;
        try {
            sourceValue = input.getSourceAttributeValueMap().get(input.getOperatorConfig().getParameterConfig().getSourceAttribute().getAttributeName());
            targetValue = input.getTargetAttributeValueMap().get(input.getOperatorConfig().getParameterConfig().getTargetAttribute().getAttributeName());
        } catch (Exception e) {
            return OperationExecutorOutput.builder().output(null).build();
        }
        if (Objects.isNull(sourceValue) || Objects.isNull(targetValue)) {
            return OperationExecutorOutput.builder().output(null).build();
        }
        final DataType dataType = input.getOperatorConfig().getParameterConfig().getSourceAttribute().getDataType();
        return OperationExecutorOutput.builder().output(
            dataType.parseData(targetValue) > dataType.parseData(sourceValue)
        ).build();
    }
}
