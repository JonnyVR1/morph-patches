package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class i700 {
    /* JADX INFO: renamed from: a */
    public static <T extends k4t> boolean m134719a(T t, T t2, HashMap<String, gul> map) {
        try {
            if (m134720b(map, t2)) {
                throw new IllegalStateException("you can't register a stable module twice");
            }
            if (m134721c(t, t2)) {
                throw new IllegalStateException("you can't register a stable module in a unstable parent");
            }
            return false;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m134720b(HashMap<String, gul> map, k4t k4tVar) {
        return (map == null || !(k4tVar instanceof l3m) || map.get(k4tVar.m144509v2()) == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends gul> boolean m134721c(T t, T t2) {
        return (!(t2 instanceof l3m) || (t instanceof k2m) || (t instanceof l3m)) ? false : true;
    }
}
