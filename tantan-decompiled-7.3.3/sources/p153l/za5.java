package p153l;

/* JADX INFO: loaded from: classes.dex */
public class za5 extends pnd {

    /* JADX INFO: renamed from: d */
    public oq0 f203538d;

    /* JADX INFO: renamed from: e */
    public boolean f203539e;

    public za5(oq0 oq0Var, boolean z) {
        this.f203538d = oq0Var;
        this.f203539e = z;
    }

    /* JADX INFO: renamed from: J */
    public synchronized jq0 m219099J() {
        oq0 oq0Var;
        oq0Var = this.f203538d;
        return oq0Var == null ? null : oq0Var.m168782d();
    }

    /* JADX INFO: renamed from: M */
    public synchronized oq0 m219100M() {
        return this.f203538d;
    }

    @Override // p153l.db5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                oq0 oq0Var = this.f203538d;
                if (oq0Var == null) {
                    return;
                }
                this.f203538d = null;
                oq0Var.m168780a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.ai2, p153l.db5
    /* JADX INFO: renamed from: g0 */
    public boolean mo97951g0() {
        return this.f203539e;
    }

    @Override // p153l.db5, p153l.qim
    public synchronized int getHeight() {
        oq0 oq0Var;
        oq0Var = this.f203538d;
        return oq0Var == null ? 0 : oq0Var.m168782d().getHeight();
    }

    @Override // p153l.db5
    public synchronized int getSizeInBytes() {
        oq0 oq0Var;
        oq0Var = this.f203538d;
        return oq0Var == null ? 0 : oq0Var.m168782d().getSizeInBytes();
    }

    @Override // p153l.db5, p153l.qim
    public synchronized int getWidth() {
        oq0 oq0Var;
        oq0Var = this.f203538d;
        return oq0Var == null ? 0 : oq0Var.m168782d().getWidth();
    }

    @Override // p153l.db5
    public synchronized boolean isClosed() {
        return this.f203538d == null;
    }
}
