package p149l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class unw {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f177468a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static int f177469b = 0;

    /* JADX INFO: renamed from: c */
    public static int f177470c = 200;

    /* JADX INFO: renamed from: d */
    private static int f177471d = 0;

    /* JADX INFO: renamed from: a */
    public static boolean m194526a(String str) {
        if (!m194528c() || m194529d(str)) {
            return false;
        }
        Map<String, String> map = f177468a;
        if (map.isEmpty()) {
            return false;
        }
        return !TextUtils.isEmpty(map.get(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m194527b(String str) {
        if (m194529d(str)) {
            return "";
        }
        Map<String, String> map = f177468a;
        return map.isEmpty() ? "" : map.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m194528c() {
        return f177471d == f177470c;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m194529d(String str) {
        return TextUtils.isEmpty(str) || "0".equals(str);
    }
}
