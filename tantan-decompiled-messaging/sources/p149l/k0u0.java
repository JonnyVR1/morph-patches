package p149l;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class k0u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final WeakReference f120516a;

    @Override // java.lang.Runnable
    public final void run() {
        l0u0 l0u0Var = (l0u0) this.f120516a.get();
        if (l0u0Var != null) {
            l0u0Var.m114712v0(new d4u0() { // from class: l.i0u0
                @Override // p149l.d4u0
                public final void zza(Object obj) {
                    ((m0u0) obj).zza();
                }
            });
        }
    }
}
