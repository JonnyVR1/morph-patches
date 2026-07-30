package p153l;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes6.dex */
public final class ggy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xfy0 f104055a;

    public ggy0(xfy0 xfy0Var) {
        this.f104055a = xfy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hcy0.m134524M(this.f104055a.f194121c, new ComponentName(this.f104055a.f194121c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
