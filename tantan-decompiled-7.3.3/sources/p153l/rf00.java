package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class rf00 {
    /* JADX INFO: renamed from: a */
    public static <T extends l6t> boolean m181160a(T t, T t2, HashMap<String, uwl> map) {
        try {
            if (m181161b(map, t2)) {
                throw new IllegalStateException("you can't register a stable module twice");
            }
            if (m181162c(t, t2)) {
                throw new IllegalStateException("you can't register a stable module in a unstable parent");
            }
            return false;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m181161b(HashMap<String, uwl> map, l6t l6tVar) {
        return (map == null || !(l6tVar instanceof c6m) || map.get(l6tVar.m153100v2()) == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static <T extends uwl> boolean m181162c(T t, T t2) {
        return (!(t2 instanceof c6m) || (t instanceof d5m) || (t instanceof c6m)) ? false : true;
    }
}
