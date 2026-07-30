package p002l;

import androidx.annotation.NonNull;
import l.gkh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pxm {

    /* JADX INFO: renamed from: a */
    public pxs f17714a;

    /* JADX INFO: renamed from: b */
    public e9t f17715b;

    /* JADX INFO: renamed from: l.pxm$a */
    public static final class C0762a {
        private static final pxm INSTANCE = new pxm();
    }

    public pxm() {
        this.f17714a = new pxs();
        this.f17715b = new e9t();
    }

    /* JADX INFO: renamed from: c */
    public static pxm m20743c() {
        return C0762a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m20744a(boolean z) {
        m20746d(z).dismiss();
    }

    /* JADX INFO: renamed from: b */
    public void m20745b() {
        m20746d(true).dismiss();
        m20746d(false).dismiss();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public wtl m20746d(boolean z) {
        return z ? this.f17714a : this.f17715b;
    }

    /* JADX INFO: renamed from: e */
    public void m20747e(boolean z) {
        m20746d(z).mo12299q();
    }

    /* JADX INFO: renamed from: f */
    public boolean m20748f(lqi lqiVar, boolean z) {
        gkh0.j("live_float_window", "showFloatingWindow:" + z);
        return m20746d(z).mo12298p(lqiVar);
    }
}
