package p149l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class w7y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qdu0 f185120a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f185121b;

    public w7y0(AppMeasurementDynamiteService appMeasurementDynamiteService, qdu0 qdu0Var) {
        this.f185120a = qdu0Var;
        this.f185121b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f185121b.f10443a.m194106G().m101475P(this.f185120a, this.f185121b.f10443a.m194117j());
    }
}
