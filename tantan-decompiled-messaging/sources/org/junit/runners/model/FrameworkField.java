package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import p149l.jfd0;

/* JADX INFO: loaded from: classes3.dex */
public class FrameworkField extends FrameworkMember<FrameworkField> {
    private final Field field;

    public FrameworkField(Field field) {
        if (field != null) {
            this.field = field;
        } else {
            jfd0.m141176a("FrameworkField cannot be created without an underlying field.");
            throw null;
        }
    }

    public Object get(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.field.get(obj);
    }

    @Override // org.junit.runners.model.Annotatable
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.field.getAnnotation(cls);
    }

    @Override // org.junit.runners.model.Annotatable
    public Annotation[] getAnnotations() {
        return this.field.getAnnotations();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getDeclaringClass() {
        return this.field.getDeclaringClass();
    }

    public Field getField() {
        return this.field;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public int getModifiers() {
        return this.field.getModifiers();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return getField().getName();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return this.field.getType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkField frameworkField) {
        return frameworkField.getName().equals(getName());
    }

    public String toString() {
        return this.field.toString();
    }
}
