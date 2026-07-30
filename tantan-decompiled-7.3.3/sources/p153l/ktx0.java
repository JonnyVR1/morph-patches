package p153l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class ktx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmu0 f128771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f128772b;

    public ktx0(AppMeasurementDynamiteService appMeasurementDynamiteService, wmu0 wmu0Var) {
        this.f128771a = wmu0Var;
        this.f128772b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128772b.f10480a.m100284E().m134537F(this.f128771a);
    }
}
