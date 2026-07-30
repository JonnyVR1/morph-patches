package p149l;

import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.appset.C2305a;

/* JADX INFO: loaded from: classes6.dex */
public final class lpx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2305a f129259a;

    public /* synthetic */ lpx0(C2305a c2305a, pkx0 pkx0Var) {
        this.f129259a = c2305a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jM13756b = this.f129259a.m13756b();
        if (jM13756b == -1 || DefaultClock.getInstance().currentTimeMillis() <= jM13756b) {
            return;
        }
        C2305a.m13752f(this.f129259a.f10234a);
    }
}
