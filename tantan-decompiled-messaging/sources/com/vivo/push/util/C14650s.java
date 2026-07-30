package com.vivo.push.util;

import com.vivo.push.p111b.C14537c;

/* JADX INFO: renamed from: com.vivo.push.util.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C14650s {
    /* JADX INFO: renamed from: a */
    public static int m85027a(C14537c c14537c) {
        C14654w c14654wM85045b = C14654w.m85045b();
        int iM84933b = c14537c.m84933b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM84961a = c14654wM85045b.m84961a("com.vivo.push_preferences.operate." + iM84933b + "OPERATE_COUNT");
        long jM84967b = jCurrentTimeMillis - c14654wM85045b.m84967b("com.vivo.push_preferences.operate." + iM84933b + "START_TIME", 0L);
        if (jM84967b <= 86400000 && jM84967b >= 0) {
            if (iM84961a >= c14537c.m84750f()) {
                return 1001;
            }
            c14654wM85045b.m84964a("com.vivo.push_preferences.operate." + iM84933b + "OPERATE_COUNT", iM84961a + 1);
            return 0;
        }
        c14654wM85045b.m84965a("com.vivo.push_preferences.operate." + iM84933b + "START_TIME", System.currentTimeMillis());
        c14654wM85045b.m84964a("com.vivo.push_preferences.operate." + iM84933b + "OPERATE_COUNT", 1);
        return 0;
    }
}
