package com.likeness.config.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.configuration.AbstractConfiguration;
import org.apache.commons.configuration.Configuration;

public final class ImmutableConfiguration extends AbstractConfiguration implements Configuration
{
    private final Configuration delegate;

    public ImmutableConfiguration(final Configuration delegate)
    {
        this.delegate = delegate;
    }

    @Override
    public Configuration subset(String prefix) {
        return new ImmutableConfiguration(delegate.subset(prefix));
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public boolean containsKey(String key) {
        return delegate.containsKey(key);
    }

    @Override
    public void addProperty(String key, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setProperty(String key, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearProperty(String key) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void addPropertyDirect(final String key, final Object value)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getProperty(String key) {
        return delegate.getProperty(key);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Iterator getKeys(String prefix) {
        return delegate.getKeys(prefix);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Iterator getKeys() {
        return delegate.getKeys();
    }

    @Override
    public Properties getProperties(String key) {
        return delegate.getProperties(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return delegate.getBoolean(key);
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return delegate.getBoolean(key, defaultValue);
    }

    @Override
    public Boolean getBoolean(String key, Boolean defaultValue) {
        return delegate.getBoolean(key, defaultValue);
    }

    @Override
    public byte getByte(String key) {
        return delegate.getByte(key);
    }

    @Override
    public byte getByte(String key, byte defaultValue) {
        return delegate.getByte(key, defaultValue);
    }

    @Override
    public Byte getByte(String key, Byte defaultValue) {
        return delegate.getByte(key, defaultValue);
    }

    @Override
    public double getDouble(String key) {
        return delegate.getDouble(key);
    }

    @Override
    public double getDouble(String key, double defaultValue) {
        return delegate.getDouble(key, defaultValue);
    }

    @Override
    public Double getDouble(String key, Double defaultValue) {
        return delegate.getDouble(key, defaultValue);
    }

    @Override
    public float getFloat(String key) {
        return delegate.getFloat(key);
    }

    @Override
    public float getFloat(String key, float defaultValue) {
        return delegate.getFloat(key, defaultValue);
    }

    @Override
    public Float getFloat(String key, Float defaultValue) {
        return delegate.getFloat(key, defaultValue);
    }

    @Override
    public int getInt(String key) {
        return delegate.getInt(key);
    }

    @Override
    public int getInt(String key, int defaultValue) {
        return delegate.getInt(key, defaultValue);
    }

    @Override
    public Integer getInteger(String key, Integer defaultValue) {
        return delegate.getInteger(key, defaultValue);
    }

    @Override
    public long getLong(String key) {
        return delegate.getLong(key);
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return delegate.getLong(key, defaultValue);
    }

    @Override
    public Long getLong(String key, Long defaultValue) {
        return delegate.getLong(key, defaultValue);
    }

    @Override
    public short getShort(String key) {
        return delegate.getShort(key);
    }

    @Override
    public short getShort(String key, short defaultValue) {
        return delegate.getShort(key, defaultValue);
    }

    @Override
    public Short getShort(String key, Short defaultValue) {
        return delegate.getShort(key, defaultValue);
    }

    @Override
    public BigDecimal getBigDecimal(String key) {
        return delegate.getBigDecimal(key);
    }

    @Override
    public BigDecimal getBigDecimal(String key, BigDecimal defaultValue) {
        return delegate.getBigDecimal(key, defaultValue);
    }

    @Override
    public BigInteger getBigInteger(String key) {
        return delegate.getBigInteger(key);
    }

    @Override
    public BigInteger getBigInteger(String key, BigInteger defaultValue) {
        return delegate.getBigInteger(key, defaultValue);
    }

    @Override
    public String getString(String key) {
        return delegate.getString(key);
    }

    @Override
    public String getString(String key, String defaultValue) {
        return delegate.getString(key, defaultValue);
    }

    @Override
    public String[] getStringArray(String key) {
        return delegate.getStringArray(key);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List getList(String key) {
        return delegate.getList(key);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public List getList(String key, List defaultValue) {
        return delegate.getList(key, defaultValue);
    }

}
