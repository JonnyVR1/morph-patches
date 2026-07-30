package p153l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class jyx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmu0 f123208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f123209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f123210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f123211d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f123212e;

    public jyx0(AppMeasurementDynamiteService appMeasurementDynamiteService, wmu0 wmu0Var, String str, String str2, boolean z) {
        this.f123208a = wmu0Var;
        this.f123209b = str;
        this.f123210c = str2;
        this.f123211d = z;
        this.f123212e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f123212e.f10480a.m100284E().m134540I(this.f123208a, this.f123209b, this.f123210c, this.f123211d);
    }
}
