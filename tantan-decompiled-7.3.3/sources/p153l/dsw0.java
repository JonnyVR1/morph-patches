package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dsw0 {
    /* JADX INFO: renamed from: a */
    public static Object m117779a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m117780b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
