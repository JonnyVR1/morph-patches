package p149l;

import android.os.Handler;
import android.os.SystemClock;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gqg0 implements nbg0 {

    /* JADX INFO: renamed from: a */
    public final Handler f103937a;

    public gqg0(Handler handler) {
        this.f103937a = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m127586a(slg0 slg0Var, int i, int i2, Map map) {
        int i3 = slg0Var.f165190b;
        Objects.toString(map);
        if (slg0Var.f165202n) {
            this.f103937a.post(new eeg0(slg0Var, i, i2, map));
        } else {
            slg0Var.f165204p.getClass();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m127587b(slg0 slg0Var, int i, long j) {
        if (slg0Var.f165203o > 0) {
            slg0Var.f165205q.set(SystemClock.uptimeMillis());
        }
        if (slg0Var.f165202n) {
            this.f103937a.post(new dng0(slg0Var, i, j));
        } else {
            slg0Var.f165204p.m140923h(slg0Var, i, j);
        }
    }

    @Override // p149l.nbg0
    /* JADX INFO: renamed from: c */
    public final void mo127588c(slg0 slg0Var) {
        int i = slg0Var.f165190b;
        bog0.m102944a().getClass();
        if (slg0Var.f165202n) {
            this.f103937a.post(new elg0(slg0Var));
        } else {
            slg0Var.f165204p.mo127588c(slg0Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m127589d(slg0 slg0Var, int i, Exception exc) {
        if (i == 2) {
            int i2 = slg0Var.f165190b;
            Objects.toString(exc);
        }
        bog0.m102944a().getClass();
        if (slg0Var.f165202n) {
            this.f103937a.post(new bfg0(slg0Var, i, exc));
        } else {
            slg0Var.f165204p.m140924i(slg0Var, i, exc);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m127590e(slg0 slg0Var, int i, Map map) {
        int i2 = slg0Var.f165190b;
        Objects.toString(map);
        if (slg0Var.f165202n) {
            this.f103937a.post(new d9g0(slg0Var, i, map));
        } else {
            slg0Var.f165204p.getClass();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m127591f(slg0 slg0Var, Map map) {
        int i = slg0Var.f165190b;
        Objects.toString(map);
        if (slg0Var.f165202n) {
            this.f103937a.post(new zog0(slg0Var, map));
        } else {
            slg0Var.f165204p.getClass();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m127592g(slg0 slg0Var, tfg0 tfg0Var, int i) {
        int i2 = slg0Var.f165190b;
        bog0.m102944a().getClass();
        if (slg0Var.f165202n) {
            this.f103937a.post(new h7g0(slg0Var, tfg0Var, i));
        } else {
            slg0Var.f165204p.m140922g(slg0Var, tfg0Var, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m127593h(slg0 slg0Var, int i, Map map) {
        int i2 = slg0Var.f165190b;
        Objects.toString(map);
        if (slg0Var.f165202n) {
            this.f103937a.post(new org0(slg0Var, i, map));
        } else {
            slg0Var.f165204p.getClass();
        }
    }
}
