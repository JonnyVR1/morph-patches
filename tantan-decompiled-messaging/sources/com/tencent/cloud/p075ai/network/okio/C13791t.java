package com.tencent.cloud.p075ai.network.okio;

import p149l.x9g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.t */
/* JADX INFO: loaded from: classes13.dex */
public final class C13791t {

    /* JADX INFO: renamed from: a */
    public static C13790s f57012a;

    /* JADX INFO: renamed from: b */
    public static long f57013b;

    /* JADX INFO: renamed from: a */
    public static void m81976a(C13790s c13790s) {
        if (c13790s.f57010f != null || c13790s.f57011g != null) {
            x9g0.m207497a();
            return;
        }
        if (c13790s.f57008d) {
            return;
        }
        synchronized (C13791t.class) {
            try {
                long j = f57013b;
                if (j + 8192 > 65536) {
                    return;
                }
                f57013b = j + 8192;
                c13790s.f57010f = f57012a;
                c13790s.f57007c = 0;
                c13790s.f57006b = 0;
                f57012a = c13790s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C13790s m81975a() {
        synchronized (C13791t.class) {
            try {
                C13790s c13790s = f57012a;
                if (c13790s != null) {
                    f57012a = c13790s.f57010f;
                    c13790s.f57010f = null;
                    f57013b -= 8192;
                    return c13790s;
                }
                return new C13790s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
