package com.google.common.base;

import java.io.Serializable;
import java.lang.Enum;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
final class Enums$StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<T> enumClass;

    public Enums$StringConverter(Class<T> cls) {
        this.enumClass = (Class) sf80.m183894p(cls);
    }

    @Override // com.google.common.base.Converter, p149l.gaj
    public boolean equals(Object obj) {
        if (obj instanceof Enums$StringConverter) {
            return this.enumClass.equals(((Enums$StringConverter) obj).enumClass);
        }
        return false;
    }

    public int hashCode() {
        return this.enumClass.hashCode();
    }

    public String toString() {
        String name = this.enumClass.getName();
        StringBuilder sb = new StringBuilder(name.length() + 29);
        sb.append("Enums.stringConverter(");
        sb.append(name);
        sb.append(".class)");
        return sb.toString();
    }

    @Override // com.google.common.base.Converter
    public String doBackward(T t) {
        return t.name();
    }

    @Override // com.google.common.base.Converter
    public T doForward(String str) {
        return (T) Enum.valueOf(this.enumClass, str);
    }
}
