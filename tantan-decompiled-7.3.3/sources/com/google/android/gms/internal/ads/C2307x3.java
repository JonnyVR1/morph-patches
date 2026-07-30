package com.google.android.gms.internal.ads;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p153l.hpr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2307x3 extends C2259r3 {

    /* JADX INFO: renamed from: h */
    public hpr f10141h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f10142i;

    public C2307x3(hpr hprVar) {
        hprVar.getClass();
        this.f10141h = hprVar;
    }

    /* JADX INFO: renamed from: E */
    public static hpr m13503E(hpr hprVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2307x3 c2307x3 = new C2307x3(hprVar);
        RunnableC2299w3 runnableC2299w3 = new RunnableC2299w3(c2307x3);
        c2307x3.f10142i = scheduledExecutorService.schedule(runnableC2299w3, j, timeUnit);
        hprVar.addListener(runnableC2299w3, zzgeb.INSTANCE);
        return c2307x3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: c */
    public final String mo13073c() {
        hpr hprVar = this.f10141h;
        ScheduledFuture scheduledFuture = this.f10142i;
        if (hprVar == null) {
            return null;
        }
        String str = "inputFuture=[" + hprVar.toString() + Constants.AES_SUFFIX;
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: d */
    public final void mo13074d() {
        m13078t(this.f10141h);
        ScheduledFuture scheduledFuture = this.f10142i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f10141h = null;
        this.f10142i = null;
    }
}
