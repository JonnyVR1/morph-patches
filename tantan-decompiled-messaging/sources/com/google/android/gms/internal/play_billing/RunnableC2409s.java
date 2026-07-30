package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p149l.fhv0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2409s implements Runnable {

    /* JADX INFO: renamed from: a */
    public C2411t f10371a;

    public RunnableC2409s(C2411t c2411t) {
        this.f10371a = c2411t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fhv0 fhv0Var;
        C2411t c2411t = this.f10371a;
        if (c2411t == null || (fhv0Var = c2411t.f10372h) == null) {
            return;
        }
        this.f10371a = null;
        if (fhv0Var.isDone()) {
            c2411t.m14898p(fhv0Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c2411t.f10373i;
            c2411t.f10373i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    c2411t.m14897o(new zzfd(str, null));
                    throw th;
                }
            }
            c2411t.m14897o(new zzfd(str + ": " + fhv0Var.toString(), null));
            fhv0Var.cancel(true);
        } catch (Throwable th2) {
            fhv0Var.cancel(true);
            throw th2;
        }
    }
}
