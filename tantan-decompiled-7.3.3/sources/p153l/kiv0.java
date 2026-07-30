package p153l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;

/* JADX INFO: loaded from: classes6.dex */
public final class kiv0 implements wiu0 {

    /* JADX INFO: renamed from: a */
    public final Context f127038a;

    /* JADX INFO: renamed from: b */
    public final ltu0 f127039b;

    /* JADX INFO: renamed from: c */
    public final o7w0 f127040c;

    /* JADX INFO: renamed from: d */
    public final zzcei f127041d;

    /* JADX INFO: renamed from: e */
    public final q6w0 f127042e;

    /* JADX INFO: renamed from: f */
    public final hpr f127043f;

    /* JADX INFO: renamed from: g */
    public final wit0 f127044g;

    /* JADX INFO: renamed from: h */
    public final dqs0 f127045h;

    /* JADX INFO: renamed from: i */
    public final boolean f127046i;

    /* JADX INFO: renamed from: j */
    public final qbv0 f127047j;

    public kiv0(Context context, ltu0 ltu0Var, o7w0 o7w0Var, zzcei zzceiVar, q6w0 q6w0Var, hpr hprVar, wit0 wit0Var, dqs0 dqs0Var, boolean z, qbv0 qbv0Var) {
        this.f127038a = context;
        this.f127039b = ltu0Var;
        this.f127040c = o7w0Var;
        this.f127041d = zzceiVar;
        this.f127042e = q6w0Var;
        this.f127043f = hprVar;
        this.f127044g = wit0Var;
        this.f127045h = dqs0Var;
        this.f127046i = z;
        this.f127047j = qbv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.wiu0
    /* JADX INFO: renamed from: a */
    public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) {
        wit0 wit0Var;
        wit0 wit0Var2;
        boolean zM117572e;
        float fM117568a;
        lsu0 lsu0Var = (lsu0) pvw0.m173990q(this.f127043f);
        try {
            q6w0 q6w0Var = this.f127042e;
            if (this.f127044g.mo13734c0()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168060M0)).booleanValue()) {
                    final wit0 wit0VarM155812a = this.f127039b.m155812a(this.f127040c.f145319e, null, null);
                    sqs0.m187562b(wit0VarM155812a, lsu0Var.mo111983i());
                    final otu0 otu0Var = new otu0();
                    otu0Var.m169182a(this.f127038a, (View) wit0VarM155812a);
                    lsu0Var.mo111986l().m151408i(wit0VarM155812a, true, this.f127046i ? this.f127045h : null);
                    wit0VarM155812a.zzN().zzB(new lkt0() { // from class: l.iiv0
                        @Override // p153l.lkt0
                        /* JADX INFO: renamed from: a */
                        public final void mo99557a(boolean z2, int i, String str, String str2) {
                            otu0Var.m169183b();
                            wit0 wit0Var3 = wit0VarM155812a;
                            wit0Var3.mo13758p0();
                            wit0Var3.zzN().zzr();
                        }
                    });
                    wit0VarM155812a.zzN().zzH(new mkt0() { // from class: l.jiv0
                        @Override // p153l.mkt0
                        public final void zza() {
                            wit0VarM155812a.mo13754n0();
                        }
                    });
                    u6w0 u6w0Var = q6w0Var.f155911t;
                    wit0VarM155812a.mo13773x0(u6w0Var.f177810b, u6w0Var.f177809a, null);
                    wit0Var = wit0VarM155812a;
                } else {
                    wit0Var2 = this.f127044g;
                }
                wit0Var.mo13775y0(true);
                if (this.f127046i) {
                    zM117572e = this.f127045h.m117572e(false);
                } else {
                    zM117572e = false;
                }
                bxy0.m106934r();
                Context context2 = this.f127038a;
                boolean z2 = this.f127046i;
                boolean zM12369h = C2098b.m12369h(context2);
                boolean zM117571d = z2 ? this.f127045h.m117571d() : false;
                if (this.f127046i) {
                    fM117568a = this.f127045h.m117568a();
                } else {
                    fM117568a = 0.0f;
                }
                float f = fM117568a;
                q6w0 q6w0Var2 = this.f127042e;
                zzj zzjVar = new zzj(zM117572e, zM12369h, zM117571d, f, -1, z, q6w0Var2.f155862P, q6w0Var2.f155863Q);
                if (c7u0Var != null) {
                    c7u0Var.zzf();
                }
                bxy0.m106927k();
                miu0 miu0VarMo111984j = lsu0Var.mo111984j();
                q6w0 q6w0Var3 = this.f127042e;
                zzcei zzceiVar = this.f127041d;
                int i = q6w0Var3.f155864R;
                String str = q6w0Var3.f155849C;
                u6w0 u6w0Var2 = q6w0Var3.f155911t;
                ghy0.m130283a(context, new AdOverlayInfoParcel((har0) null, miu0VarMo111984j, (rar0) null, wit0Var, i, zzceiVar, str, zzjVar, u6w0Var2.f177810b, u6w0Var2.f177809a, this.f127040c.f145320f, c7u0Var, q6w0Var3.f155892j0 ? this.f127047j : null), true);
            }
            wit0Var2 = this.f127044g;
            wit0Var = wit0Var2;
            wit0Var.mo13775y0(true);
            if (this.f127046i) {
                zM117572e = this.f127045h.m117572e(false);
            } else {
                zM117572e = false;
            }
            bxy0.m106934r();
            Context context3 = this.f127038a;
            boolean z3 = this.f127046i;
            boolean zM12369h2 = C2098b.m12369h(context3);
            boolean zM117571d2 = z3 ? this.f127045h.m117571d() : false;
            if (this.f127046i) {
                fM117568a = this.f127045h.m117568a();
            } else {
                fM117568a = 0.0f;
            }
            float f2 = fM117568a;
            q6w0 q6w0Var4 = this.f127042e;
            zzj zzjVar2 = new zzj(zM117572e, zM12369h2, zM117571d2, f2, -1, z, q6w0Var4.f155862P, q6w0Var4.f155863Q);
            if (c7u0Var != null) {
                c7u0Var.zzf();
            }
            bxy0.m106927k();
            miu0 miu0VarMo111984j2 = lsu0Var.mo111984j();
            q6w0 q6w0Var5 = this.f127042e;
            zzcei zzceiVar2 = this.f127041d;
            int i2 = q6w0Var5.f155864R;
            String str2 = q6w0Var5.f155849C;
            u6w0 u6w0Var3 = q6w0Var5.f155911t;
            ghy0.m130283a(context, new AdOverlayInfoParcel((har0) null, miu0VarMo111984j2, (rar0) null, wit0Var, i2, zzceiVar2, str2, zzjVar2, u6w0Var3.f177810b, u6w0Var3.f177809a, this.f127040c.f145320f, c7u0Var, q6w0Var5.f155892j0 ? this.f127047j : null), true);
        } catch (zzcjw e) {
            dct0.m115296e("", e);
        }
    }
}
