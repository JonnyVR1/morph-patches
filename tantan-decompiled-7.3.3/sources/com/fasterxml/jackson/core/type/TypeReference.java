package com.fasterxml.jackson.core.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TypeReference<T> implements Comparable<TypeReference<T>> {
    protected final Type _type;

    public TypeReference() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            wg3.m206174a("Internal error: TypeReference constructed without actual type information");
            throw null;
        }
        this._type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public Type getType() {
        return this._type;
    }

    @Override // java.lang.Comparable
    public int compareTo(TypeReference<T> typeReference) {
        return 0;
    }
}
