package p153l;

/* JADX INFO: loaded from: classes.dex */
public class foi<T> extends fb5<T> {
    public foi(T t, w4d0<T> w4d0Var, fb5.InterfaceC16935c interfaceC16935c, Throwable th) {
        super(t, w4d0Var, interfaceC16935c, th, true);
    }

    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f98045a) {
                    super.finalize();
                    return;
                }
                T tM8219f = this.f98046b.m8219f();
                huf.m137198z("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f98046b)), tM8219f == null ? null : tM8219f.getClass().getName());
                this.f98046b.m8217d();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p153l.fb5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p153l.fb5
    /* JADX INFO: renamed from: m */
    public fb5<T> clone() {
        return this;
    }
}
