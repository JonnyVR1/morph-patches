package com.tencent.iliveroom.p085a.p087b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14117b {

    /* JADX INFO: renamed from: a */
    private static Map<Integer, Long> f58674a;

    static {
        HashMap map = new HashMap();
        f58674a = map;
        f58674a = Collections.synchronizedMap(map);
    }

    /* JADX INFO: renamed from: a */
    public static long m83794a(int i) {
        Long l2 = f58674a.get(Integer.valueOf(i));
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static void m83795a(int i, long j) {
        f58674a.put(Integer.valueOf(i), Long.valueOf(j));
    }
}
