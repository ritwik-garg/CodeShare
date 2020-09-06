package com.example.sample;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * Class to represent the  parameter config.
 */
@Builder(toBuilder = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class MGParameterConfig {

    /**
     * The alias of targetAttribute that form the lefts part of the equation.
     * It is being matched against a value.
     */
    private String targetAttribute;

    /**
     * Either sourceAttribute name would be present or an independent source value
     * would be present.
     */
    private String sourceAttribute;

    /**
     * This is static configured value for handling use-case as.
     * Example:
     * Comparison of targetAttributeValue with a static value
     * targetAttribute > 10 like
     * Feedback > 99
     */
    private String configuredValue;

    /**
     * This is the list of values against which the target value
     * is to be matching.
     * <p>
     * Edition IN (V1, V2, V3)
     */
    private List<String> configuredValues;

    /**
     * This is the value map . Key is the target value and
     * value is the list of source of strings that can be matched for key.
     * <p>
     * Format.Paperback = [Format.Paperback, Format.Hardcover]
     */
    private Map<String, List<String>> configuredValueMap;

    /**
     * This is applicable in range operator: Left Size.
     * 3 < x < 5
     */
    private String rangeLeft;

    /**
     * This is applicable in range operator: Right Size.
     */
    private String rangeRight;

    /**
     * Boolean flag to indicate whether the configured values are independent
     * configurations or these values are accepted values of source.
     */
    private boolean isIndependentValue;
}
