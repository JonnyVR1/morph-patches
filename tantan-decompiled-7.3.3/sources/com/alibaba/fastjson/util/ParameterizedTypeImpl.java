package com.alibaba.fastjson.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ParameterizedTypeImpl implements ParameterizedType {
    private final Type[] actualTypeArguments;
    private final Type ownerType;
    private final Type rawType;

    public ParameterizedTypeImpl(Type[] typeArr, Type type, Type type2) {
        this.actualTypeArguments = typeArr;
        this.ownerType = type;
        this.rawType = type2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ParameterizedTypeImpl parameterizedTypeImpl = (ParameterizedTypeImpl) obj;
            if (!Arrays.equals(this.actualTypeArguments, parameterizedTypeImpl.actualTypeArguments)) {
                return false;
            }
            Type type = this.ownerType;
            Type type2 = parameterizedTypeImpl.ownerType;
            if (type == null ? type2 != null : !type.equals(type2)) {
                return false;
            }
            Type type3 = this.rawType;
            Type type4 = parameterizedTypeImpl.rawType;
            if (type3 != null) {
                return type3.equals(type4);
            }
            if (type4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.actualTypeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        Type[] typeArr = this.actualTypeArguments;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.ownerType;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.rawType;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
