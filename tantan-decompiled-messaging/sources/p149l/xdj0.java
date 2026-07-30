package p149l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xdj0<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        sf80.m183889k(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
