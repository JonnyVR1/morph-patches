package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfho;

/* JADX INFO: loaded from: classes6.dex */
public final class hkt0 implements eyt0 {

    /* JADX INFO: renamed from: a */
    public final lzv0 f108269a;

    public hkt0(lzv0 lzv0Var) {
        this.f108269a = lzv0Var;
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: B */
    public final void mo102676B(@Nullable Context context) {
        try {
            this.f108269a.m152382l();
        } catch (zzfho e) {
            x2t0.m206870h("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: K */
    public final void mo102677K(@Nullable Context context) {
        try {
            this.f108269a.m152395y();
        } catch (zzfho e) {
            x2t0.m206870h("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: P */
    public final void mo102680P(@Nullable Context context) {
        try {
            this.f108269a.m152396z();
            if (context != null) {
                this.f108269a.m152394x(context);
            }
        } catch (zzfho e) {
            x2t0.m206870h("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
