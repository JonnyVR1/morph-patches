package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class hdv0 implements wiu0 {

    /* JADX INFO: renamed from: a */
    public final zzcei f109040a;

    /* JADX INFO: renamed from: b */
    public final hpr f109041b;

    /* JADX INFO: renamed from: c */
    public final q6w0 f109042c;

    /* JADX INFO: renamed from: d */
    public final wit0 f109043d;

    /* JADX INFO: renamed from: e */
    public final o7w0 f109044e;

    /* JADX INFO: renamed from: f */
    public final dqs0 f109045f;

    /* JADX INFO: renamed from: g */
    public final boolean f109046g;

    /* JADX INFO: renamed from: h */
    public final qbv0 f109047h;

    public hdv0(zzcei zzceiVar, hpr hprVar, q6w0 q6w0Var, wit0 wit0Var, o7w0 o7w0Var, boolean z, dqs0 dqs0Var, qbv0 qbv0Var) {
        this.f109040a = zzceiVar;
        this.f109041b = hprVar;
        this.f109042c = q6w0Var;
        this.f109043d = wit0Var;
        this.f109044e = o7w0Var;
        this.f109046g = z;
        this.f109045f = dqs0Var;
        this.f109047h = qbv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    @Override // p153l.wiu0
    /* JADX INFO: renamed from: a */
    public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) {
        wvt0 wvt0Var = (wvt0) pvw0.m173990q(this.f109041b);
        this.f109043d.mo13775y0(true);
        boolean zM117572e = this.f109046g ? this.f109045f.m117572e(true) : true;
        boolean z2 = this.f109046g;
        zzj zzjVar = new zzj(zM117572e, true, z2 ? this.f109045f.m117571d() : false, z2 ? this.f109045f.m117568a() : 0.0f, -1, z, this.f109042c.f155862P, false);
        if (c7u0Var != null) {
            c7u0Var.zzf();
        }
        bxy0.m106927k();
        miu0 miu0VarMo177267i = wvt0Var.mo177267i();
        wit0 wit0Var = this.f109043d;
        int i = this.f109042c.f155864R;
        if (i == -1) {
            zzw zzwVar = this.f109044e.f145324j;
            if (zzwVar == null) {
                dct0.m115293b("Error setting app open orientation; no targeting orientation available.");
                i = this.f109042c.f155864R;
            } else {
                int i2 = zzwVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                } else {
                    dct0.m115293b("Error setting app open orientation; no targeting orientation available.");
                    i = this.f109042c.f155864R;
                }
            }
        }
        int i3 = i;
        zzcei zzceiVar = this.f109040a;
        q6w0 q6w0Var = this.f109042c;
        String str = q6w0Var.f155849C;
        u6w0 u6w0Var = q6w0Var.f155911t;
        ghy0.m130283a(context, new AdOverlayInfoParcel((har0) null, miu0VarMo177267i, (rar0) null, wit0Var, i3, zzceiVar, str, zzjVar, u6w0Var.f177810b, u6w0Var.f177809a, this.f109044e.f145320f, c7u0Var, q6w0Var.f155892j0 ? this.f109047h : null), true);
    }
}
