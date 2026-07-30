package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class ntt0 implements k7u0 {

    /* JADX INFO: renamed from: a */
    public final r8w0 f143634a;

    public ntt0(r8w0 r8w0Var) {
        this.f143634a = r8w0Var;
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: B */
    public final void mo107083B(@Nullable Context context) {
        try {
            this.f143634a.m180266l();
        } catch (zzfho e) {
            dct0.m115299h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: K */
    public final void mo107084K(@Nullable Context context) {
        try {
            this.f143634a.m180279y();
        } catch (zzfho e) {
            dct0.m115299h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: P */
    public final void mo107086P(@Nullable Context context) {
        try {
            this.f143634a.m180280z();
            if (context != null) {
                this.f143634a.m180278x(context);
            }
        } catch (zzfho e) {
            dct0.m115299h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
