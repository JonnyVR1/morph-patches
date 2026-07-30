package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class rhu0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final lhu0 f163199a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f163200b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f163201c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f163202d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f163203e;

    public rhu0(lhu0 lhu0Var, kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f163199a = lhu0Var;
        this.f163200b = kqx0Var;
        this.f163201c = kqx0Var2;
        this.f163202d = kqx0Var3;
        this.f163203e = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f163200b.zzb();
        final zzcei zzceiVarM201659a = ((vlt0) this.f163201c).m201659a();
        final q6w0 q6w0VarM101357a = ((b0u0) this.f163202d).m101357a();
        final o7w0 o7w0VarM218742a = ((z5u0) this.f163203e).m218742a();
        return new yfu0(new k8u0() { // from class: l.jhu0
            @Override // p153l.k8u0
            public final void zzr() {
                bxy0.m106937u().m114545n(context, zzceiVarM201659a.zza, q6w0VarM101357a.f155850D.toString(), o7w0VarM218742a.f145320f);
            }
        }, oct0.f146738f);
    }
}
