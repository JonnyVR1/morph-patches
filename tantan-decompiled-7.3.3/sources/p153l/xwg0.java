package p153l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class xwg0 {

    /* JADX INFO: renamed from: a */
    public log0 f196499a;

    /* JADX INFO: renamed from: a */
    public final void m213351a(aug0 aug0Var, int i, Exception exc, wkg0 wkg0Var) {
        yeg0 yeg0Var = ((sug0) wkg0Var).f170685e;
        if (yeg0Var != null) {
            synchronized (yeg0Var) {
                SystemClock.uptimeMillis();
            }
        }
        log0 log0Var = this.f196499a;
        if (log0Var != null) {
            log0Var.mo177302a(aug0Var, i, exc);
        }
    }
}
