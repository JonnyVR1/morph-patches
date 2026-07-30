package p149l;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class rm80 {

    /* JADX INFO: renamed from: a */
    public static final Map<Class<?>, Class<?>> f160070a;

    /* JADX INFO: renamed from: b */
    public static final Map<Class<?>, Class<?>> f160071b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        m179967a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        m179967a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        m179967a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        m179967a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        m179967a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        m179967a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        m179967a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        m179967a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        m179967a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f160070a = Collections.unmodifiableMap(linkedHashMap);
        f160071b = Collections.unmodifiableMap(linkedHashMap2);
    }

    /* JADX INFO: renamed from: a */
    public static void m179967a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* JADX INFO: renamed from: b */
    public static Set<Class<?>> m179968b() {
        return f160071b.keySet();
    }

    /* JADX INFO: renamed from: c */
    public static <T> Class<T> m179969c(Class<T> cls) {
        sf80.m183894p(cls);
        Class<T> cls2 = (Class) f160071b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* JADX INFO: renamed from: d */
    public static <T> Class<T> m179970d(Class<T> cls) {
        sf80.m183894p(cls);
        Class<T> cls2 = (Class) f160070a.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
