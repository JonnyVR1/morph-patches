package p149l;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes6.dex */
public final class a7y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r6y0 f67965a;

    public a7y0(r6y0 r6y0Var) {
        this.f67965a = r6y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b3y0.m100124M(this.f67965a.f157992c, new ComponentName(this.f67965a.f157992c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
