package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vus0 extends kdt0 {

    /* JADX INFO: renamed from: c */
    public final Object f185845c = new Object();

    /* JADX INFO: renamed from: d */
    public final avs0 f185846d;

    /* JADX INFO: renamed from: e */
    public boolean f185847e;

    public vus0(avs0 avs0Var) {
        this.f185846d = avs0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m202889g() {
        d2v0.m113737k("release: Trying to acquire lock");
        synchronized (this.f185845c) {
            try {
                d2v0.m113737k("release: Lock acquired");
                if (this.f185847e) {
                    d2v0.m113737k("release: Lock already released");
                    return;
                }
                this.f185847e = true;
                m149269e(new sus0(this), new wct0());
                m149269e(new tus0(this), new uus0(this));
                d2v0.m113737k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
