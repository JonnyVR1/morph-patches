package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p149l.gnr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2276w3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public C2284x3 f10099a;

    public RunnableC2276w3(C2284x3 c2284x3) {
        this.f10099a = c2284x3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gnr gnrVar;
        C2284x3 c2284x3 = this.f10099a;
        if (c2284x3 == null || (gnrVar = c2284x3.f10104h) == null) {
            return;
        }
        this.f10099a = null;
        if (gnrVar.isDone()) {
            c2284x3.m13025u(gnrVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c2284x3.f10105i;
            c2284x3.f10105i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    c2284x3.mo13022f(new zzgfj(str, null));
                    throw th;
                }
            }
            c2284x3.mo13022f(new zzgfj(str + ": " + gnrVar.toString(), null));
            gnrVar.cancel(true);
        } catch (Throwable th2) {
            gnrVar.cancel(true);
            throw th2;
        }
    }
}
