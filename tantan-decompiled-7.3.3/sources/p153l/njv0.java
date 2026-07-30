package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzflg;

/* JADX INFO: loaded from: classes6.dex */
public final class njv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    public final Context f142349a;

    /* JADX INFO: renamed from: b */
    public final zxt0 f142350b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final yhs0 f142351c;

    /* JADX INFO: renamed from: d */
    public final xvw0 f142352d;

    /* JADX INFO: renamed from: e */
    public final lcw0 f142353e;

    public njv0(Context context, zxt0 zxt0Var, lcw0 lcw0Var, xvw0 xvw0Var, @Nullable yhs0 yhs0Var) {
        this.f142349a = context;
        this.f142350b = zxt0Var;
        this.f142353e = lcw0Var;
        this.f142352d = xvw0Var;
        this.f142351c = yhs0Var;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        u6w0 u6w0Var;
        return (this.f142351c == null || (u6w0Var = q6w0Var.f155911t) == null || u6w0Var.f177809a == null) ? false : true;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(b7w0 b7w0Var, q6w0 q6w0Var) {
        ljv0 ljv0Var = new ljv0(this, new View(this.f142349a), null, new izt0() { // from class: l.jjv0
            @Override // p153l.izt0
            public final lpu0 zza() {
                return null;
            }
        }, (r6w0) q6w0Var.f155915v.get(0));
        vwt0 vwt0VarMo121814a = this.f142350b.mo121814a(new a0u0(b7w0Var, q6w0Var, null), ljv0Var);
        mjv0 mjv0VarMo99231k = vwt0VarMo121814a.mo99231k();
        u6w0 u6w0Var = q6w0Var.f155911t;
        final lhs0 lhs0Var = new lhs0(mjv0VarMo99231k, u6w0Var.f177810b, u6w0Var.f177809a);
        zzflg zzflgVar = zzflg.CUSTOM_RENDER_SYN;
        return rbw0.m180768d(new lbw0() { // from class: l.kjv0
            @Override // p153l.lbw0
            public final void zza() throws Exception {
                this.f127148a.m163468c(lhs0Var);
            }
        }, this.f142352d, zzflgVar, this.f142353e).m115304b(zzflg.CUSTOM_RENDER_ACK).m115306d(pvw0.m173981h(vwt0VarMo121814a.mo99228h())).m115303a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m163468c(lhs0 lhs0Var) throws Exception {
        this.f142351c.mo167740I2(lhs0Var);
    }
}
