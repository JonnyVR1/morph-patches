package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Logger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class zw3 {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m221851a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.contains(".")) {
                String[] strArrM221852b = m221852b(key);
                int length = strArrM221852b.length - 1;
                Map map3 = map2;
                for (int i = 0; i < strArrM221852b.length; i++) {
                    String str = strArrM221852b[i];
                    if (i == length) {
                        map3.put(str, entry.getValue());
                    } else if (map3.get(str) instanceof Map) {
                        map3 = (Map) wrq.m207623j(map3.get(str));
                    } else {
                        HashMap map4 = new HashMap();
                        map3.put(str, map4);
                        map3 = map4;
                    }
                }
            } else {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: b */
    public static String[] m221852b(String str) {
        try {
            return str.split("\\.");
        } catch (Throwable th) {
            Logger.m5921d("CTVariableUtils", "Error splitting variable name: " + str, th);
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m221853c(Object obj, Object obj2) {
        if (obj2 == null) {
            return obj;
        }
        if ((obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof String) || (obj2 instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Character)) {
            return obj2;
        }
        boolean z = obj2 instanceof Map;
        Iterable iterableKeySet = z ? ((Map) obj2).keySet() : (Iterable) obj2;
        boolean z2 = obj instanceof Map;
        Iterable iterableKeySet2 = z2 ? ((Map) obj).keySet() : (Iterable) obj;
        Map map = z ? (Map) obj2 : null;
        Map map2 = z2 ? (Map) obj : null;
        if (!z2 && !z) {
            return null;
        }
        HashMap map3 = new HashMap();
        if (iterableKeySet2 != null) {
            for (Object obj3 : iterableKeySet2) {
                if (map != null && map2 != null) {
                    Object obj4 = map.get(obj3);
                    Object obj5 = map2.get(obj3);
                    if (obj4 == null && obj5 != null) {
                        map3.put(obj3, obj5);
                    }
                }
            }
        }
        for (Object obj6 : iterableKeySet) {
            map3.put(obj6, m221853c(map2 != null ? map2.get(obj6) : null, map != null ? map.get(obj6) : null));
        }
        return map3;
    }

    /* JADX INFO: renamed from: d */
    public static Object m221854d(Object obj, Object obj2, boolean z) {
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) wrq.m207623j(obj);
            obj3 = map.get(obj2);
            if (z && obj3 == null && (obj2 instanceof String)) {
                HashMap map2 = new HashMap();
                map.put(obj2, map2);
                return map2;
            }
        }
        return obj3;
    }
}
