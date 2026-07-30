package p009l;

import android.text.TextUtils;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.zvf0;

/* JADX INFO: renamed from: l.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0836d {
    /* JADX INFO: renamed from: a */
    public static void m12877a(Map<String, Object> map, Map<String, String> map2, double d) {
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (d != -1.0d && TextUtils.equals(key, "ad_actual_value")) {
                value = d + "";
            }
            map.put(key, value);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12878b(String str, String str2, Map<String, String> map, double d) {
        if (!NullChecker.a(map) || map.size() <= 0) {
            zvf0.r(str, str2);
            return;
        }
        HashMap map2 = new HashMap();
        m12877a(map2, map, d);
        zvf0.s(str, str2, map2);
    }
}
