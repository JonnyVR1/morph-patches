package com.momo.mcamera.filtermanager;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ClassUtil {
    private static final String BOOLEAN = "Boolean";
    private static final String BYTE = "Byte";
    private static final String CHARACTOR = "Charactor";
    private static final String DOUBLE = "Double";
    private static final String FLOAT = "Float";
    private static final String INTEGER = "Integer";
    private static final String LONG = "Long";
    private static final String SHORT = "Short";
    private static final Map<String, Class<?>> primitiveClazz;

    static {
        HashMap map = new HashMap();
        primitiveClazz = map;
        map.put(INTEGER, Integer.TYPE);
        map.put(BYTE, Byte.TYPE);
        map.put(CHARACTOR, Character.TYPE);
        map.put(SHORT, Short.TYPE);
        map.put(LONG, Long.TYPE);
        map.put(FLOAT, Float.TYPE);
        map.put(DOUBLE, Double.TYPE);
        map.put(BOOLEAN, Boolean.TYPE);
    }

    public static Class<?> getUsefulClass(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        Map<String, Class<?>> map = primitiveClazz;
        return map.containsKey(simpleName) ? map.get(simpleName) : obj.getClass();
    }
}
