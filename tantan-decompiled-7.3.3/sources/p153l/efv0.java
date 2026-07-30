package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzdkv;

/* JADX INFO: loaded from: classes6.dex */
public final class efv0 implements wiu0 {

    /* JADX INFO: renamed from: a */
    public final q6w0 f93870a;

    /* JADX INFO: renamed from: b */
    public final hzs0 f93871b;

    /* JADX INFO: renamed from: c */
    public final AdFormat f93872c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public h7u0 f93873d = null;

    public efv0(q6w0 q6w0Var, hzs0 hzs0Var, AdFormat adFormat) {
        this.f93870a = q6w0Var;
        this.f93871b = hzs0Var;
        this.f93872c = adFormat;
    }

    @Override // p153l.wiu0
    /* JADX INFO: renamed from: a */
    public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) throws zzdkv {
        boolean zMo113451o0;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.f93872c.ordinal();
            if (iOrdinal == 1) {
                zMo113451o0 = this.f93871b.mo113451o0(h950.m134038Y2(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zMo113451o0 = this.f93871b.mo113443H(h950.m134038Y2(context));
                    }
                    throw new zzdkv("Adapter failed to show.");
                }
                zMo113451o0 = this.f93871b.mo113450e6(h950.m134038Y2(context));
            }
            if (zMo113451o0) {
                if (this.f93873d == null) {
                    return;
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168511w1)).booleanValue() || this.f93870a.f155872Z != 2) {
                    return;
                }
                this.f93873d.zza();
                return;
            }
            throw new zzdkv("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdkv(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m120735b(h7u0 h7u0Var) {
        this.f93873d = h7u0Var;
    }
}
