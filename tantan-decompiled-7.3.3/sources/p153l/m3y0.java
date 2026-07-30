package p153l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class m3y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wmu0 f134719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbf f134720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f134721c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f134722d;

    public m3y0(AppMeasurementDynamiteService appMeasurementDynamiteService, wmu0 wmu0Var, zzbf zzbfVar, String str) {
        this.f134719a = wmu0Var;
        this.f134720b = zzbfVar;
        this.f134721c = str;
        this.f134722d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f134722d.f10480a.m100284E().m134538G(this.f134719a, this.f134720b, this.f134721c);
    }
}
