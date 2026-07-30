package p153l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class eu0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f95833a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m122518a(String str) {
        return f95833a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m122519b(String str) {
        return f95833a.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m122520c() {
        return !f95833a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public static void m122521d(String str, String str2) {
        f95833a.put(str, str2);
    }
}
