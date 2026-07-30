package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class owq0 {
    /* JADX INFO: renamed from: a */
    public static Float m166425a(Map<? super String, Float> map) {
        float fFloatValue = 0.0f;
        for (Float f : map.values()) {
            if (f != null) {
                fFloatValue += f.floatValue();
            }
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: b */
    public static Long m166426b(Map<? super String, Long> map, String str, Long l2) {
        if (str == null || map == null) {
            return -1L;
        }
        Long l3 = map.get(str);
        if (l3 != null) {
            l2 = Long.valueOf(l3.longValue() + l2.longValue());
        }
        map.put(str, l2);
        return l2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m166427c(int i) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m166428d(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 16;
        }
        if (i == 3) {
            return 32;
        }
        if (i != 4) {
            return i != 5 ? 0 : 128;
        }
        return 64;
    }
}
