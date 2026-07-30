package com.tencent.cloud.p080ai.network.okio;

import p153l.fig0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.t */
/* JADX INFO: loaded from: classes12.dex */
public final class C13954t {

    /* JADX INFO: renamed from: a */
    public static C13953s f57860a;

    /* JADX INFO: renamed from: b */
    public static long f57861b;

    /* JADX INFO: renamed from: a */
    public static void m83159a(C13953s c13953s) {
        if (c13953s.f57858f != null || c13953s.f57859g != null) {
            fig0.m125680a();
            return;
        }
        if (c13953s.f57856d) {
            return;
        }
        synchronized (C13954t.class) {
            try {
                long j = f57861b;
                if (j + 8192 > 65536) {
                    return;
                }
                f57861b = j + 8192;
                c13953s.f57858f = f57860a;
                c13953s.f57855c = 0;
                c13953s.f57854b = 0;
                f57860a = c13953s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C13953s m83158a() {
        synchronized (C13954t.class) {
            try {
                C13953s c13953s = f57860a;
                if (c13953s != null) {
                    f57860a = c13953s.f57858f;
                    c13953s.f57858f = null;
                    f57861b -= 8192;
                    return c13953s;
                }
                return new C13953s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
