package com.ote.common;

import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class NullAwareBeanUtilsBean extends BeanUtilsBean {

    private final List<String> propertiesToKeepEvenIfNull;

    public NullAwareBeanUtilsBean(String... propertiesToKeepEvenIfNull) {
        this.propertiesToKeepEvenIfNull = Arrays.asList(propertiesToKeepEvenIfNull);
    }

    @Override
    public void copyProperty(Object dest, String name, Object value) throws IllegalAccessException, InvocationTargetException {
        if (propertiesToKeepEvenIfNull.contains(name) || value == null) return;
        super.copyProperty(dest, name, value);
    }

}