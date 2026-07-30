package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p153l.bww0;
import p153l.dww0;
import p153l.xvw0;
import p153l.yvw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2283u3 {
    /* JADX INFO: renamed from: a */
    public static xvw0 m13394a(ExecutorService executorService) {
        if (executorService instanceof xvw0) {
            return (xvw0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new dww0((ScheduledExecutorService) executorService) : new bww0(executorService);
    }

    /* JADX INFO: renamed from: b */
    public static Executor m13395b() {
        return zzgeb.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m13396c(Executor executor, AbstractC2227n3 abstractC2227n3) {
        executor.getClass();
        return executor == zzgeb.INSTANCE ? executor : new yvw0(executor, abstractC2227n3);
    }
}
