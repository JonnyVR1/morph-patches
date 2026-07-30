package com.tencent.iliveroom.p080a.p082b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13954b {

    /* JADX INFO: renamed from: a */
    private static Map<Integer, Long> f57826a;

    static {
        HashMap map = new HashMap();
        f57826a = map;
        f57826a = Collections.synchronizedMap(map);
    }

    /* JADX INFO: renamed from: a */
    public static long m82611a(int i) {
        Long l2 = f57826a.get(Integer.valueOf(i));
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public static void m82612a(int i, long j) {
        f57826a.put(Integer.valueOf(i), Long.valueOf(j));
    }
}
