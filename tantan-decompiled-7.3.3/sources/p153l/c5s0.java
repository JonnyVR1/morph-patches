package p153l;

import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.internal.ads.zzhag;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class c5s0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final b4s0 f79895a;

    /* JADX INFO: renamed from: b */
    public final fzr0 f79896b;

    public c5s0(b4s0 b4s0Var, fzr0 fzr0Var) {
        this.f79895a = b4s0Var;
        this.f79896b = fzr0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f79895a.m102526l() != null) {
            this.f79895a.m102526l().get();
        }
        C2223n c2223nM102518c = this.f79895a.m102518c();
        if (c2223nM102518c == null) {
            return null;
        }
        try {
            synchronized (this.f79896b) {
                try {
                    fzr0 fzr0Var = this.f79896b;
                    byte[] bArrM12798h = c2223nM102518c.m12798h();
                    fzr0Var.m185949l(bArrM12798h, 0, bArrM12798h.length, jhx0.m144944a());
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
