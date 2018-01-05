package com.ote.common;

import org.apache.commons.beanutils.BeanUtilsBean;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class BeanUtils extends BeanUtilsBean {

    private final List<String> propertiesToKeep;

    public BeanUtils(String... propertiesToKeep) {
        this.propertiesToKeep = Arrays.asList(propertiesToKeep);
    }

    @Override
    public void copyProperty(Object dest, String name, Object value) throws IllegalAccessException, InvocationTargetException {
        if (propertiesToKeep.contains(name) || value == null) return;
        super.copyProperty(dest, name, value);
    }

}