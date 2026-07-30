package p149l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class yt0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f199879a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m215992a(String str) {
        return f199879a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m215993b(String str) {
        return f199879a.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m215994c() {
        return !f199879a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public static void m215995d(String str, String str2) {
        f199879a.put(str, str2);
    }
}
