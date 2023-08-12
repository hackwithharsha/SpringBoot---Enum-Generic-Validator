package com.example.demo.converters;

import com.example.demo.exceptions.InvalidEnumValueException;
import org.springframework.core.convert.converter.Converter;

public abstract class BaseEnumConverter<T extends Enum<T>> implements Converter<String, T> {
    private final Class<T> enumType;
    private final String paramName;

    protected BaseEnumConverter(Class<T> enumType, String paramName) {
        this.enumType = enumType;
        this.paramName = paramName;
    }

    @Override
    public T convert(String source) {
        for (T enumValue : enumType.getEnumConstants()) {
            System.out.println(enumValue.name());
            String target = enumValue.name().replace("_", "").toLowerCase();
            String sourceFormatted = source.replace("_", "").toLowerCase();
            if (target.equals(sourceFormatted)) {
                return enumValue;
            }
        }
        throw new InvalidEnumValueException("Invalid Parameter for " + paramName + ": " + source);

    }

}