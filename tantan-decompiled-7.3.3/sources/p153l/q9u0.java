package p153l;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class q9u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final WeakReference f156266a;

    @Override // java.lang.Runnable
    public final void run() {
        r9u0 r9u0Var = (r9u0) this.f156266a.get();
        if (r9u0Var != null) {
            r9u0Var.m149285v0(new jdu0() { // from class: l.o9u0
                @Override // p153l.jdu0
                public final void zza(Object obj) {
                    ((s9u0) obj).zza();
                }
            });
        }
    }
}
