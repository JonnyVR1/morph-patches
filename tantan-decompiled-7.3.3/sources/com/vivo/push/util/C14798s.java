package com.vivo.push.util;

import com.vivo.push.p116b.C14685c;

/* JADX INFO: renamed from: com.vivo.push.util.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C14798s {
    /* JADX INFO: renamed from: a */
    public static int m86198a(C14685c c14685c) {
        C14802w c14802wM86216b = C14802w.m86216b();
        int iM86104b = c14685c.m86104b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM86132a = c14802wM86216b.m86132a("com.vivo.push_preferences.operate." + iM86104b + "OPERATE_COUNT");
        long jM86138b = jCurrentTimeMillis - c14802wM86216b.m86138b("com.vivo.push_preferences.operate." + iM86104b + "START_TIME", 0L);
        if (jM86138b <= 86400000 && jM86138b >= 0) {
            if (iM86132a >= c14685c.m85921f()) {
                return 1001;
            }
            c14802wM86216b.m86135a("com.vivo.push_preferences.operate." + iM86104b + "OPERATE_COUNT", iM86132a + 1);
            return 0;
        }
        c14802wM86216b.m86136a("com.vivo.push_preferences.operate." + iM86104b + "START_TIME", System.currentTimeMillis());
        c14802wM86216b.m86135a("com.vivo.push_preferences.operate." + iM86104b + "OPERATE_COUNT", 1);
        return 0;
    }
}
