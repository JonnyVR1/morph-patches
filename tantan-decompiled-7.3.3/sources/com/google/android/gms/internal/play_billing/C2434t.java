package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p153l.lqv0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C2434t extends C2428q {

    /* JADX INFO: renamed from: h */
    public lqv0 f10409h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f10410i;

    public C2434t(lqv0 lqv0Var) {
        this.f10409h = lqv0Var;
    }

    /* JADX INFO: renamed from: B */
    public static lqv0 m14991B(lqv0 lqv0Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2434t c2434t = new C2434t(lqv0Var);
        RunnableC2432s runnableC2432s = new RunnableC2432s(c2434t);
        c2434t.f10410i = scheduledExecutorService.schedule(runnableC2432s, 28500L, timeUnit);
        lqv0Var.mo14948h(runnableC2432s, zzed.INSTANCE);
        return c2434t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2424o
    /* JADX INFO: renamed from: g */
    public final String mo14947g() {
        lqv0 lqv0Var = this.f10409h;
        ScheduledFuture scheduledFuture = this.f10410i;
        if (lqv0Var == null) {
            return null;
        }
        String str = "inputFuture=[" + lqv0Var.toString() + Constants.AES_SUFFIX;
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2424o
    /* JADX INFO: renamed from: m */
    public final void mo14949m() {
        lqv0 lqv0Var = this.f10409h;
        if ((lqv0Var != null) & isCancelled()) {
            lqv0Var.cancel(m14953q());
        }
        ScheduledFuture scheduledFuture = this.f10410i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10409h = null;
        this.f10410i = null;
    }
}
