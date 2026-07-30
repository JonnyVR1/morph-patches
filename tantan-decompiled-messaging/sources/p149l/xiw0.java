package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xiw0 {
    /* JADX INFO: renamed from: a */
    public static Object m209680a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m209681b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
