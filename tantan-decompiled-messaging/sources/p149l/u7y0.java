package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class u7y0 extends xov0 {
    public u7y0() {
        super(null);
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: a */
    public final void mo147958a(mby0 mby0Var, mby0 mby0Var2) {
        mby0Var.f133070b = mby0Var2;
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: b */
    public final void mo147959b(mby0 mby0Var, Thread thread) {
        mby0Var.f133069a = thread;
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: c */
    public final boolean mo147960c(ohy0 ohy0Var, bpx0 bpx0Var, bpx0 bpx0Var2) {
        synchronized (ohy0Var) {
            try {
                if (ohy0Var.f144076b != bpx0Var) {
                    return false;
                }
                ohy0Var.f144076b = bpx0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: d */
    public final boolean mo147961d(ohy0 ohy0Var, Object obj, Object obj2) {
        synchronized (ohy0Var) {
            try {
                if (ohy0Var.f144075a != obj) {
                    return false;
                }
                ohy0Var.f144075a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: e */
    public final boolean mo147962e(ohy0 ohy0Var, mby0 mby0Var, mby0 mby0Var2) {
        synchronized (ohy0Var) {
            try {
                if (ohy0Var.f144077c != mby0Var) {
                    return false;
                }
                ohy0Var.f144077c = mby0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
