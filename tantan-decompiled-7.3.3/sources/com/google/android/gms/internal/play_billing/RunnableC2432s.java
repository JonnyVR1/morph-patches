package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p153l.lqv0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2432s implements Runnable {

    /* JADX INFO: renamed from: a */
    public C2434t f10408a;

    public RunnableC2432s(C2434t c2434t) {
        this.f10408a = c2434t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lqv0 lqv0Var;
        C2434t c2434t = this.f10408a;
        if (c2434t == null || (lqv0Var = c2434t.f10409h) == null) {
            return;
        }
        this.f10408a = null;
        if (lqv0Var.isDone()) {
            c2434t.m14952p(lqv0Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c2434t.f10410i;
            c2434t.f10410i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    c2434t.m14951o(new zzfd(str, null));
                    throw th;
                }
            }
            c2434t.m14951o(new zzfd(str + ": " + lqv0Var.toString(), null));
            lqv0Var.cancel(true);
        } catch (Throwable th2) {
            lqv0Var.cancel(true);
            throw th2;
        }
    }
}
