package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class bfv0 implements wiu0 {

    /* JADX INFO: renamed from: a */
    public final Context f76541a;

    /* JADX INFO: renamed from: b */
    public final zzcei f76542b;

    /* JADX INFO: renamed from: c */
    public final hpr f76543c;

    /* JADX INFO: renamed from: d */
    public final q6w0 f76544d;

    /* JADX INFO: renamed from: e */
    public final wit0 f76545e;

    /* JADX INFO: renamed from: f */
    public final o7w0 f76546f;

    /* JADX INFO: renamed from: g */
    public final dqs0 f76547g;

    /* JADX INFO: renamed from: h */
    public final boolean f76548h;

    /* JADX INFO: renamed from: i */
    public final qbv0 f76549i;

    public bfv0(Context context, zzcei zzceiVar, hpr hprVar, q6w0 q6w0Var, wit0 wit0Var, o7w0 o7w0Var, boolean z, dqs0 dqs0Var, qbv0 qbv0Var) {
        this.f76541a = context;
        this.f76542b = zzceiVar;
        this.f76543c = hprVar;
        this.f76544d = q6w0Var;
        this.f76545e = wit0Var;
        this.f76546f = o7w0Var;
        this.f76547g = dqs0Var;
        this.f76548h = z;
        this.f76549i = qbv0Var;
    }

    @Override // p153l.wiu0
    /* JADX INFO: renamed from: a */
    public final void mo104077a(boolean z, Context context, c7u0 c7u0Var) {
        ihu0 ihu0Var = (ihu0) pvw0.m173990q(this.f76543c);
        this.f76545e.mo13775y0(true);
        boolean zM117572e = this.f76548h ? this.f76547g.m117572e(false) : false;
        bxy0.m106934r();
        zzj zzjVar = new zzj(zM117572e, C2098b.m12369h(this.f76541a), this.f76548h ? this.f76547g.m117571d() : false, this.f76548h ? this.f76547g.m117568a() : 0.0f, -1, z, this.f76544d.f155862P, false);
        if (c7u0Var != null) {
            c7u0Var.zzf();
        }
        bxy0.m106927k();
        miu0 miu0VarMo131320j = ihu0Var.mo131320j();
        wit0 wit0Var = this.f76545e;
        q6w0 q6w0Var = this.f76544d;
        zzcei zzceiVar = this.f76542b;
        int i = q6w0Var.f155864R;
        String str = q6w0Var.f155849C;
        u6w0 u6w0Var = q6w0Var.f155911t;
        ghy0.m130283a(context, new AdOverlayInfoParcel((har0) null, miu0VarMo131320j, (rar0) null, wit0Var, i, zzceiVar, str, zzjVar, u6w0Var.f177810b, u6w0Var.f177809a, this.f76546f.f145320f, c7u0Var, q6w0Var.f155892j0 ? this.f76549i : null), true);
    }
}
