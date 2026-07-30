package p153l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class i85 {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Class<?>> f113320a;

    static {
        HashMap map = new HashMap();
        f113320a = map;
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
    public static Class<?> m138994a(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        Map<String, Class<?>> map = f113320a;
        return map.containsKey(simpleName) ? map.get(simpleName) : obj.getClass();
    }
}
