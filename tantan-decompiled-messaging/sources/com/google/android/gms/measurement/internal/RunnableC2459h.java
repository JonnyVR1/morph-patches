package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2459h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService.C2450a f10507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f10508b;

    public RunnableC2459h(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.C2450a c2450a) {
        this.f10507a = c2450a;
        this.f10508b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10508b.f10443a.m194102C().m15212i0(this.f10507a);
    }
}
