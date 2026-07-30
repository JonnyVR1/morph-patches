package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2482h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService.C2473a f10544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f10545b;

    public RunnableC2482h(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.C2473a c2473a) {
        this.f10544a = c2473a;
        this.f10545b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10545b.f10480a.m100282C().m15266i0(this.f10544a);
    }
}
