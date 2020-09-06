package com.example.sample;

import lombok.*;

/**
 * Class to represent the operation. config.
 * <p>
 * OperationAlias - The string match the aliases defined in {@link MGOperator} class.
 * <p>
 * MGParameterConfig - As defined in the structure {@link MGParameterConfig}
 */
@Builder(toBuilder = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class MGOperationConfig {

    /**
     * Alias of Operator to be applied to evaluate the operation.
     */
    @NonNull
    private String operator;

    /**
     * Parameters of this operation.
     */
    @NonNull
    private MGParameterConfig parameterConfig;

    /**
     * Matching type/algorithm applicable on this operation.
     * An operator can apply multiple types of matching types .
     * The client must specify which matching type needs to be executed.
     */
    @NonNull
    private String mgMatchingType;

}
