package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class e6u0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final d6u0 f92360a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f92361b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f92362c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f92363d;

    /* JADX INFO: renamed from: e */
    public final kqx0 f92364e;

    public e6u0(d6u0 d6u0Var, kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f92360a = d6u0Var;
        this.f92361b = kqx0Var;
        this.f92362c = kqx0Var2;
        this.f92363d = kqx0Var3;
        this.f92364e = kqx0Var4;
    }

    @Override // p153l.kqx0
    @Nullable
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f92361b.zzb();
        zzcei zzceiVarM201659a = ((vlt0) this.f92362c).m201659a();
        q6w0 q6w0VarM101357a = ((b0u0) this.f92363d).m101357a();
        t8t0 t8t0Var = new t8t0();
        zzcbp zzcbpVar = q6w0VarM101357a.f155848B;
        if (zzcbpVar == null) {
            return null;
        }
        u6w0 u6w0Var = q6w0VarM101357a.f155911t;
        return new s8t0(context, zzceiVarM201659a, zzcbpVar, u6w0Var != null ? u6w0Var.f177810b : null, t8t0Var);
    }
}
