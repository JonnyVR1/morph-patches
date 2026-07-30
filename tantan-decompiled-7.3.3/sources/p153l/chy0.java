package p153l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class chy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmu0 f81884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f81885b;

    public chy0(AppMeasurementDynamiteService appMeasurementDynamiteService, wmu0 wmu0Var) {
        this.f81884a = wmu0Var;
        this.f81885b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f81885b.f10480a.m100286G().m136342P(this.f81884a, this.f81885b.f10480a.m100297j());
    }
}
