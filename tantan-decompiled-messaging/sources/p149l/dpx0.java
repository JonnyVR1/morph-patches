package p149l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class dpx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qdu0 f87359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f87360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87361c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f87362d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f87363e;

    public dpx0(AppMeasurementDynamiteService appMeasurementDynamiteService, qdu0 qdu0Var, String str, String str2, boolean z) {
        this.f87359a = qdu0Var;
        this.f87360b = str;
        this.f87361c = str2;
        this.f87362d = z;
        this.f87363e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f87363e.f10443a.m194104E().m100140I(this.f87359a, this.f87360b, this.f87361c, this.f87362d);
    }
}
