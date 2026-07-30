package p149l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class pog0 {

    /* JADX INFO: renamed from: a */
    public dgg0 f150503a;

    /* JADX INFO: renamed from: a */
    public final void m170557a(slg0 slg0Var, int i, Exception exc, ocg0 ocg0Var) {
        q6g0 q6g0Var = ((kmg0) ocg0Var).f123793e;
        if (q6g0Var != null) {
            synchronized (q6g0Var) {
                SystemClock.uptimeMillis();
            }
        }
        dgg0 dgg0Var = this.f150503a;
        if (dgg0Var != null) {
            dgg0Var.mo135981a(slg0Var, i, exc);
        }
    }
}
