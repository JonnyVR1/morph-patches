package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class a2y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f67304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q1y0 f67305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q1y0 f67306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f67307d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m1y0 f67308e;

    public a2y0(m1y0 m1y0Var, Bundle bundle, q1y0 q1y0Var, q1y0 q1y0Var2, long j) {
        this.f67304a = bundle;
        this.f67305b = q1y0Var;
        this.f67306c = q1y0Var2;
        this.f67307d = j;
        this.f67308e = m1y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1y0.m152626D(this.f67308e, this.f67304a, this.f67305b, this.f67306c, this.f67307d);
    }
}
