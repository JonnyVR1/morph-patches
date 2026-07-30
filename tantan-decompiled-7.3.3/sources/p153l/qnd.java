package p153l;

import com.facebook.common.references.SharedReference;

/* JADX INFO: loaded from: classes.dex */
public class qnd<T> extends fb5<T> {
    public qnd(T t, w4d0<T> w4d0Var, fb5.InterfaceC16935c interfaceC16935c, Throwable th) {
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
                huf.m137198z("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f98046b)), tM8219f == null ? null : tM8219f.getClass().getName());
                fb5.InterfaceC16935c interfaceC16935c = this.f98047c;
                if (interfaceC16935c != null) {
                    interfaceC16935c.mo124882b(this.f98046b, this.f98048d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p153l.fb5
    /* JADX INFO: renamed from: m */
    public fb5<T> clone() {
        wn80.m207184i(mo124877N());
        return new qnd(this.f98046b, this.f98047c, this.f98048d != null ? new Throwable() : null);
    }

    public qnd(SharedReference<T> sharedReference, fb5.InterfaceC16935c interfaceC16935c, Throwable th) {
        super(sharedReference, interfaceC16935c, th);
    }
}
