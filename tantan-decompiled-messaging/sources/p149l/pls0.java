package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class pls0 extends e4t0 {

    /* JADX INFO: renamed from: c */
    public final Object f150163c = new Object();

    /* JADX INFO: renamed from: d */
    public final uls0 f150164d;

    /* JADX INFO: renamed from: e */
    public boolean f150165e;

    public pls0(uls0 uls0Var) {
        this.f150164d = uls0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m170255g() {
        xsu0.m210834k("release: Trying to acquire lock");
        synchronized (this.f150163c) {
            try {
                xsu0.m210834k("release: Lock acquired");
                if (this.f150165e) {
                    xsu0.m210834k("release: Lock already released");
                    return;
                }
                this.f150165e = true;
                m114708e(new mls0(this), new q3t0());
                m114708e(new nls0(this), new ols0(this));
                xsu0.m210834k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
