package p149l;

/* JADX INFO: loaded from: classes.dex */
public class jli<T> extends fa5<T> {
    public jli(T t, twc0<T> twc0Var, fa5.InterfaceC16786c interfaceC16786c, Throwable th) {
        super(t, twc0Var, interfaceC16786c, th, true);
    }

    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f96565a) {
                    super.finalize();
                    return;
                }
                T tM8165f = this.f96566b.m8165f();
                tsf.m190560z("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f96566b)), tM8165f == null ? null : tM8165f.getClass().getName());
                this.f96566b.m8163d();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p149l.fa5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p149l.fa5
    /* JADX INFO: renamed from: m */
    public fa5<T> clone() {
        return this;
    }
}
