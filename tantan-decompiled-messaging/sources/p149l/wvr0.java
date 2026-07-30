package p149l;

import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.internal.ads.zzhag;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class wvr0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final vur0 f188280a;

    /* JADX INFO: renamed from: b */
    public final zpr0 f188281b;

    public wvr0(vur0 vur0Var, zpr0 zpr0Var) {
        this.f188280a = vur0Var;
        this.f188281b = zpr0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f188280a.m200110l() != null) {
            this.f188280a.m200110l().get();
        }
        C2200n c2200nM200102c = this.f188280a.m200102c();
        if (c2200nM200102c == null) {
            return null;
        }
        try {
            synchronized (this.f188281b) {
                try {
                    zpr0 zpr0Var = this.f188281b;
                    byte[] bArrM12744h = c2200nM200102c.m12744h();
                    zpr0Var.m153520l(bArrM12744h, 0, bArrM12744h.length, d8x0.m110397a());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzhag | NullPointerException unused) {
            return null;
        }
    }
}
