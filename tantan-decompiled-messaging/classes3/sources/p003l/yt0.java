package p003l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class yt0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f9132a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m9227a(String str) {
        return f9132a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9228b(String str) {
        return f9132a.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9229c() {
        return !f9132a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public static void m9230d(String str, String str2) {
        f9132a.put(str, str2);
    }
}
