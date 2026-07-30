package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p149l.rmw0;
import p149l.smw0;
import p149l.vmw0;
import p149l.xmw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2260u3 {
    /* JADX INFO: renamed from: a */
    public static rmw0 m13340a(ExecutorService executorService) {
        if (executorService instanceof rmw0) {
            return (rmw0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new xmw0((ScheduledExecutorService) executorService) : new vmw0(executorService);
    }

    /* JADX INFO: renamed from: b */
    public static Executor m13341b() {
        return zzgeb.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m13342c(Executor executor, AbstractC2204n3 abstractC2204n3) {
        executor.getClass();
        return executor == zzgeb.INSTANCE ? executor : new smw0(executor, abstractC2204n3);
    }
}
