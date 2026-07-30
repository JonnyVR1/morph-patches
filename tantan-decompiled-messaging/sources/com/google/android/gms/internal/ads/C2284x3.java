package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p149l.gnr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2284x3 extends C2236r3 {

    /* JADX INFO: renamed from: h */
    public gnr f10104h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f10105i;

    public C2284x3(gnr gnrVar) {
        gnrVar.getClass();
        this.f10104h = gnrVar;
    }

    /* JADX INFO: renamed from: E */
    public static gnr m13449E(gnr gnrVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2284x3 c2284x3 = new C2284x3(gnrVar);
        RunnableC2276w3 runnableC2276w3 = new RunnableC2276w3(c2284x3);
        c2284x3.f10105i = scheduledExecutorService.schedule(runnableC2276w3, j, timeUnit);
        gnrVar.addListener(runnableC2276w3, zzgeb.INSTANCE);
        return c2284x3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: c */
    public final String mo13019c() {
        gnr gnrVar = this.f10104h;
        ScheduledFuture scheduledFuture = this.f10105i;
        if (gnrVar == null) {
            return null;
        }
        String str = "inputFuture=[" + gnrVar.toString() + Constants.AES_SUFFIX;
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: d */
    public final void mo13020d() {
        m13024t(this.f10104h);
        ScheduledFuture scheduledFuture = this.f10105i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10104h = null;
        this.f10105i = null;
    }
}
