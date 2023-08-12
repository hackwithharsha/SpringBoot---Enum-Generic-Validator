package com.example.demo.converters;

import com.example.demo.constants.Names;

public class NameConverter extends BaseEnumConverter<Names> {
    public NameConverter() {
        super(Names.class, "name");
    }
}
