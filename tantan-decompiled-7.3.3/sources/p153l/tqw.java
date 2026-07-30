package p153l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class tqw {

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f175785a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static int f175786b = 0;

    /* JADX INFO: renamed from: c */
    public static int f175787c = 200;

    /* JADX INFO: renamed from: d */
    private static int f175788d = 0;

    /* JADX INFO: renamed from: a */
    public static boolean m192363a(String str) {
        if (!m192365c() || m192366d(str)) {
            return false;
        }
        Map<String, String> map = f175785a;
        if (map.isEmpty()) {
            return false;
        }
        return !TextUtils.isEmpty(map.get(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m192364b(String str) {
        if (m192366d(str)) {
            return "";
        }
        Map<String, String> map = f175785a;
        return map.isEmpty() ? "" : map.get(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m192365c() {
        return f175788d == f175787c;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m192366d(String str) {
        return TextUtils.isEmpty(str) || "0".equals(str);
    }
}
