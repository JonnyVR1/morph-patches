package p153l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class r8y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmu0 f161779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f161780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f161781c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f161782d;

    public r8y0(AppMeasurementDynamiteService appMeasurementDynamiteService, wmu0 wmu0Var, String str, String str2) {
        this.f161779a = wmu0Var;
        this.f161780b = str;
        this.f161781c = str2;
        this.f161782d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f161782d.f10480a.m100284E().m134539H(this.f161779a, this.f161780b, this.f161781c);
    }
}
