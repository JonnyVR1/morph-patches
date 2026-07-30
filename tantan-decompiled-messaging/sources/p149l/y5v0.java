package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzdkv;

/* JADX INFO: loaded from: classes6.dex */
public final class y5v0 implements q9u0 {

    /* JADX INFO: renamed from: a */
    public final kxv0 f196481a;

    /* JADX INFO: renamed from: b */
    public final bqs0 f196482b;

    /* JADX INFO: renamed from: c */
    public final AdFormat f196483c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public byt0 f196484d = null;

    public y5v0(kxv0 kxv0Var, bqs0 bqs0Var, AdFormat adFormat) {
        this.f196481a = kxv0Var;
        this.f196482b = bqs0Var;
        this.f196483c = adFormat;
    }

    @Override // p149l.q9u0
    /* JADX INFO: renamed from: a */
    public final void mo100276a(boolean z, Context context, wxt0 wxt0Var) throws zzdkv {
        boolean zMo103418o0;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.f196483c.ordinal();
            if (iOrdinal == 1) {
                zMo103418o0 = this.f196482b.mo103418o0(s050.m181848Y2(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zMo103418o0 = this.f196482b.mo103410H(s050.m181848Y2(context));
                    }
                    throw new zzdkv("Adapter failed to show.");
                }
                zMo103418o0 = this.f196482b.mo103417e6(s050.m181848Y2(context));
            }
            if (zMo103418o0) {
                if (this.f196484d == null) {
                    return;
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132440w1)).booleanValue() || this.f196481a.f125182Z != 2) {
                    return;
                }
                this.f196484d.zza();
                return;
            }
            throw new zzdkv("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdkv(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m213020b(byt0 byt0Var) {
        this.f196484d = byt0Var;
    }
}
