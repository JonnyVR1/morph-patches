package p153l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bnj0<T> {
    public final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        xn80.m212106k(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
