package p149l;

import com.google.android.gms.measurement.internal.C2461j;

/* JADX INFO: loaded from: classes6.dex */
public final class l7y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2461j f126757a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f126758b;

    public l7y0(j7y0 j7y0Var, C2461j c2461j, Runnable runnable) {
        this.f126757a = c2461j;
        this.f126758b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f126757a.m15310u0();
        this.f126757a.m15309u(this.f126758b);
        this.f126757a.m15319z0();
    }
}
