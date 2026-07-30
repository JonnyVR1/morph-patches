package p149l;

/* JADX INFO: loaded from: classes.dex */
public class z95 extends jmd {

    /* JADX INFO: renamed from: d */
    public sq0 f202269d;

    /* JADX INFO: renamed from: e */
    public boolean f202270e;

    public z95(sq0 sq0Var, boolean z) {
        this.f202269d = sq0Var;
        this.f202270e = z;
    }

    /* JADX INFO: renamed from: J */
    public synchronized nq0 m217664J() {
        sq0 sq0Var;
        sq0Var = this.f202269d;
        return sq0Var == null ? null : sq0Var.m185429d();
    }

    /* JADX INFO: renamed from: M */
    public synchronized sq0 m217665M() {
        return this.f202269d;
    }

    @Override // p149l.da5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                sq0 sq0Var = this.f202269d;
                if (sq0Var == null) {
                    return;
                }
                this.f202269d = null;
                sq0Var.m185427a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.th2, p149l.da5
    /* JADX INFO: renamed from: f0 */
    public boolean mo110566f0() {
        return this.f202270e;
    }

    @Override // p149l.da5, p149l.ngm
    public synchronized int getHeight() {
        sq0 sq0Var;
        sq0Var = this.f202269d;
        return sq0Var == null ? 0 : sq0Var.m185429d().getHeight();
    }

    @Override // p149l.da5
    public synchronized int getSizeInBytes() {
        sq0 sq0Var;
        sq0Var = this.f202269d;
        return sq0Var == null ? 0 : sq0Var.m185429d().getSizeInBytes();
    }

    @Override // p149l.da5, p149l.ngm
    public synchronized int getWidth() {
        sq0 sq0Var;
        sq0Var = this.f202269d;
        return sq0Var == null ? 0 : sq0Var.m185429d().getWidth();
    }

    @Override // p149l.da5
    public synchronized boolean isClosed() {
        return this.f202269d == null;
    }
}
