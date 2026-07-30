package p149l;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes6.dex */
public final class lzx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qdu0 f130689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f130690b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f130691c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f130692d;

    public lzx0(AppMeasurementDynamiteService appMeasurementDynamiteService, qdu0 qdu0Var, String str, String str2) {
        this.f130689a = qdu0Var;
        this.f130690b = str;
        this.f130691c = str2;
        this.f130692d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f130692d.f10443a.m194104E().m100139H(this.f130689a, this.f130690b, this.f130691c);
    }
}
