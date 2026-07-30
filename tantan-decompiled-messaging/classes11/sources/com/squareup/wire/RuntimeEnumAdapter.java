package com.squareup.wire;

import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.y9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
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
            y9g0.a(e);
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
            y9g0.a(e);
            return null;
        }
    }

    public int hashCode() {
        return this.type.hashCode();
    }
}
