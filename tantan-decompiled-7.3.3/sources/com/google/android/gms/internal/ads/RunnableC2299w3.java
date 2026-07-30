package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p153l.hpr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2299w3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public C2307x3 f10136a;

    public RunnableC2299w3(C2307x3 c2307x3) {
        this.f10136a = c2307x3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hpr hprVar;
        C2307x3 c2307x3 = this.f10136a;
        if (c2307x3 == null || (hprVar = c2307x3.f10141h) == null) {
            return;
        }
        this.f10136a = null;
        if (hprVar.isDone()) {
            c2307x3.m13079u(hprVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c2307x3.f10142i;
            c2307x3.f10142i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    c2307x3.mo13076f(new zzgfj(str, null));
                    throw th;
                }
            }
            c2307x3.mo13076f(new zzgfj(str + ": " + hprVar.toString(), null));
            hprVar.cancel(true);
        } catch (Throwable th2) {
            hprVar.cancel(true);
            throw th2;
        }
    }
}
