package p153l;

import com.google.android.gms.measurement.internal.C2484j;

/* JADX INFO: loaded from: classes6.dex */
public final class rgy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2484j f163065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f163066b;

    public rgy0(pgy0 pgy0Var, C2484j c2484j, Runnable runnable) {
        this.f163065a = c2484j;
        this.f163066b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f163065a.m15364u0();
        this.f163065a.m15363u(this.f163066b);
        this.f163065a.m15373z0();
    }
}
