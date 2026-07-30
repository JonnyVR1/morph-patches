package p149l;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
class a600 {

    /* JADX INFO: renamed from: a */
    private static boolean f67734a = false;

    /* JADX INFO: renamed from: b */
    private static Map<String, String> f67735b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static String m95106a(String str) {
        String str2;
        if (!f67734a) {
            return null;
        }
        synchronized (a600.class) {
            str2 = f67735b.get(str);
        }
        return str2;
    }
}
