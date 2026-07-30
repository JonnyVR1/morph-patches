package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p149l.fhv0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C2411t extends C2405q {

    /* JADX INFO: renamed from: h */
    public fhv0 f10372h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f10373i;

    public C2411t(fhv0 fhv0Var) {
        this.f10372h = fhv0Var;
    }

    /* JADX INFO: renamed from: B */
    public static fhv0 m14937B(fhv0 fhv0Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2411t c2411t = new C2411t(fhv0Var);
        RunnableC2409s runnableC2409s = new RunnableC2409s(c2411t);
        c2411t.f10373i = scheduledExecutorService.schedule(runnableC2409s, 28500L, timeUnit);
        fhv0Var.mo14894h(runnableC2409s, zzed.INSTANCE);
        return c2411t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2401o
    /* JADX INFO: renamed from: g */
    public final String mo14893g() {
        fhv0 fhv0Var = this.f10372h;
        ScheduledFuture scheduledFuture = this.f10373i;
        if (fhv0Var == null) {
            return null;
        }
        String str = "inputFuture=[" + fhv0Var.toString() + Constants.AES_SUFFIX;
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2401o
    /* JADX INFO: renamed from: m */
    public final void mo14895m() {
        fhv0 fhv0Var = this.f10372h;
        if ((fhv0Var != null) & isCancelled()) {
            fhv0Var.cancel(m14899q());
        }
        ScheduledFuture scheduledFuture = this.f10373i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10372h = null;
        this.f10373i = null;
    }
}
