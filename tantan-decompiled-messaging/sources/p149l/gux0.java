package p149l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class gux0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qdu0 f104481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbf f104482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f104483c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f104484d;

    public gux0(AppMeasurementDynamiteService appMeasurementDynamiteService, qdu0 qdu0Var, zzbf zzbfVar, String str) {
        this.f104481a = qdu0Var;
        this.f104482b = zzbfVar;
        this.f104483c = str;
        this.f104484d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104484d.f10443a.m194104E().m100138G(this.f104481a, this.f104482b, this.f104483c);
    }
}
