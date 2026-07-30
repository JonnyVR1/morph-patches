package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class h75 {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Class<?>> f106194a;

    static {
        HashMap map = new HashMap();
        f106194a = map;
        map.put("Integer", Integer.TYPE);
        map.put("Byte", Byte.TYPE);
        map.put("Charactor", Character.TYPE);
        map.put("Short", Short.TYPE);
        map.put("Long", Long.TYPE);
        map.put("Float", Float.TYPE);
        map.put("Double", Double.TYPE);
        map.put("Boolean", Boolean.TYPE);
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m129620a(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        Map<String, Class<?>> map = f106194a;
        return map.containsKey(simpleName) ? map.get(simpleName) : obj.getClass();
    }
}
