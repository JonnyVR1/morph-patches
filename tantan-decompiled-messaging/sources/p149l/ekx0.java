package p149l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class ekx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qdu0 f92037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f92038b;

    public ekx0(AppMeasurementDynamiteService appMeasurementDynamiteService, qdu0 qdu0Var) {
        this.f92037a = qdu0Var;
        this.f92038b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92038b.f10443a.m194104E().m100137F(this.f92037a);
    }
}
