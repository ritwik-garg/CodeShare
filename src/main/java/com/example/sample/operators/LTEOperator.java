package com.example.sample.operators;

import com.example.sample.ExecutionContext;
import com.example.sample.OperationExecutorInput;
import com.example.sample.OperationExecutorOutput;
import com.example.sample.OperatorExecutor;
import lombok.NonNull;

import java.util.Objects;

public class LTEOperator implements OperatorExecutor {
    public OperationExecutorOutput execute(final @NonNull OperationExecutorInput input,
                                           final @NonNull ExecutionContext executionContext) {
        if (!validateArgs(input)) {
            return OperationExecutorOutput.builder().output(null).build();
        }
        String sourceValue;
        String targetValue;
        try {
            sourceValue = input.getSourceAttributeValueMap().get(input.getOperationConfig().getParameterConfig().getSourceAttribute().getAttributeName());
            targetValue = input.getTargetAttributeValueMap().get(input.getOperationConfig().getParameterConfig().getTargetAttribute().getAttributeName());
        } catch (Exception e) {
            return OperationExecutorOutput.builder().output(null).build();
        }
        if (Objects.isNull(sourceValue) || Objects.isNull(targetValue)) {
            return OperationExecutorOutput.builder().output(null).build();
        }
        return OperationExecutorOutput.builder().output(input.getOperationConfig().getParameterConfig()
                .getSourceAttribute().getDataType().applyLTEOperator(sourceValue, targetValue)).build();
    }
}
