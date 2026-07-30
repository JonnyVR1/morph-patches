package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class ywt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final xwt0 f200541a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f200542b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f200543c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f200544d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f200545e;

    public ywt0(xwt0 xwt0Var, ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4) {
        this.f200541a = xwt0Var;
        this.f200542b = ehx0Var;
        this.f200543c = ehx0Var2;
        this.f200544d = ehx0Var3;
        this.f200545e = ehx0Var4;
    }

    @Override // p149l.ehx0
    @Nullable
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.f200542b.zzb();
        zzcei zzceiVarM168371a = ((pct0) this.f200543c).m168371a();
        kxv0 kxv0VarM199592a = ((vqt0) this.f200544d).m199592a();
        nzs0 nzs0Var = new nzs0();
        zzcbp zzcbpVar = kxv0VarM199592a.f125158B;
        if (zzcbpVar == null) {
            return null;
        }
        oxv0 oxv0Var = kxv0VarM199592a.f125221t;
        return new mzs0(context, zzceiVarM168371a, zzcbpVar, oxv0Var != null ? oxv0Var.f146254b : null, nzs0Var);
    }
}
