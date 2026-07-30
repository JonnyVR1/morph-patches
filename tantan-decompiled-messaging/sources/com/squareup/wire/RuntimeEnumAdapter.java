package com.squareup.wire;

import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p149l.y9g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    private Method fromValueMethod;
    private final Class<E> type;

    public RuntimeEnumAdapter(Class<E> cls) {
        super(cls);
        this.type = cls;
    }

    private Method getFromValueMethod() {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.type.getMethod("fromValue", Integer.TYPE);
            this.fromValueMethod = method2;
            return method2;
        } catch (NoSuchMethodException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && ((RuntimeEnumAdapter) obj).type == this.type;
    }

    @Override // com.squareup.wire.EnumAdapter
    public E fromValue(int i) {
        try {
            return (E) getFromValueMethod().invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | InvocationTargetException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    public int hashCode() {
        return this.type.hashCode();
    }
}
