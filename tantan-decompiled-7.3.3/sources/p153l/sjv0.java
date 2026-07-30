package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzflg;

/* JADX INFO: loaded from: classes6.dex */
public final class sjv0 implements pcv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final yhs0 f169180a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f169181b;

    /* JADX INFO: renamed from: c */
    public final lcw0 f169182c;

    /* JADX INFO: renamed from: d */
    public final bkv0 f169183d;

    public sjv0(lcw0 lcw0Var, xvw0 xvw0Var, @Nullable yhs0 yhs0Var, bkv0 bkv0Var) {
        this.f169182c = lcw0Var;
        this.f169181b = xvw0Var;
        this.f169180a = yhs0Var;
        this.f169183d = bkv0Var;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        u6w0 u6w0Var;
        return (this.f169180a == null || (u6w0Var = q6w0Var.f155911t) == null || u6w0Var.f177809a == null) ? false : true;
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(b7w0 b7w0Var, q6w0 q6w0Var) {
        tct0 tct0Var = new tct0();
        xjv0 xjv0Var = new xjv0();
        xjv0Var.m211264b(new rjv0(this, tct0Var, b7w0Var, q6w0Var, xjv0Var));
        u6w0 u6w0Var = q6w0Var.f155911t;
        final lhs0 lhs0Var = new lhs0(xjv0Var, u6w0Var.f177810b, u6w0Var.f177809a);
        zzflg zzflgVar = zzflg.CUSTOM_RENDER_SYN;
        return rbw0.m180768d(new lbw0() { // from class: l.qjv0
            @Override // p153l.lbw0
            public final void zza() throws Exception {
                this.f158050a.m186311c(lhs0Var);
            }
        }, this.f169181b, zzflgVar, this.f169182c).m115304b(zzflg.CUSTOM_RENDER_ACK).m115306d(tct0Var).m115303a();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m186311c(lhs0 lhs0Var) throws Exception {
        this.f169180a.mo167740I2(lhs0Var);
    }
}
