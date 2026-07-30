package p149l;

import com.facebook.common.references.SharedReference;

/* JADX INFO: loaded from: classes.dex */
public class kmd<T> extends fa5<T> {
    public kmd(T t, twc0<T> twc0Var, fa5.InterfaceC16786c interfaceC16786c, Throwable th) {
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
                tsf.m190560z("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f96566b)), tM8165f == null ? null : tM8165f.getClass().getName());
                fa5.InterfaceC16786c interfaceC16786c = this.f96567c;
                if (interfaceC16786c != null) {
                    interfaceC16786c.mo120161b(this.f96566b, this.f96568d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // p149l.fa5
    /* JADX INFO: renamed from: m */
    public fa5<T> clone() {
        rf80.m179118i(mo120157N());
        return new kmd(this.f96566b, this.f96567c, this.f96568d != null ? new Throwable() : null);
    }

    public kmd(SharedReference<T> sharedReference, fa5.InterfaceC16786c interfaceC16786c, Throwable th) {
        super(sharedReference, interfaceC16786c, th);
    }
}
