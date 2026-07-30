package p153l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class vu80 {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<?>, Class<?>> f185769a;

    /* JADX INFO: renamed from: b */
    public static final Map<Class<?>, Class<?>> f185770b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m202777a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m202777a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m202777a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m202777a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m202777a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m202777a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m202777a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m202777a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m202777a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f185769a = Collections.unmodifiableMap(linkedHashMap);
        f185770b = Collections.unmodifiableMap(linkedHashMap2);
    }

    /* JADX INFO: renamed from: a */
    public static void m202777a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* JADX INFO: renamed from: b */
    public static Set<Class<?>> m202778b() {
        return f185770b.keySet();
    }

    /* JADX INFO: renamed from: c */
    public static <T> Class<T> m202779c(Class<T> cls) {
        xn80.m212111p(cls);
        Class<T> cls2 = (Class) f185770b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* JADX INFO: renamed from: d */
    public static <T> Class<T> m202780d(Class<T> cls) {
        xn80.m212111p(cls);
        Class<T> cls2 = (Class) f185769a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
