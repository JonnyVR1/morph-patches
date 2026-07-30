package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class pxm {

    /* JADX INFO: renamed from: a */
    public pxs f151705a;

    /* JADX INFO: renamed from: b */
    public e9t f151706b;

    /* JADX INFO: renamed from: l.pxm$a */
    public static final class C19362a {
        private static final pxm INSTANCE = new pxm();
    }

    public pxm() {
        this.f151705a = new pxs();
        this.f151706b = new e9t();
    }

    /* JADX INFO: renamed from: c */
    public static pxm m171910c() {
        return C19362a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m171911a(boolean z) {
        m171913d(z).dismiss();
    }

    /* JADX INFO: renamed from: b */
    public void m171912b() {
        m171913d(true).dismiss();
        m171913d(false).dismiss();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public wtl m171913d(boolean z) {
        return z ? this.f151705a : this.f151706b;
    }

    /* JADX INFO: renamed from: e */
    public void m171914e(boolean z) {
        m171913d(z).mo115382q();
    }

    /* JADX INFO: renamed from: f */
    public boolean m171915f(lqi lqiVar, boolean z) {
        gkh0.m126627j("live_float_window", "showFloatingWindow:" + z);
        return m171913d(z).mo115381p(lqiVar);
    }
}
