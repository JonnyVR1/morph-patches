package p149l;

import com.google.android.gms.internal.ads.zzbrm;

/* JADX INFO: loaded from: classes6.dex */
public final class kms0 implements p3t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n3t0 f123825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pls0 f123826b;

    public kms0(ums0 ums0Var, n3t0 n3t0Var, pls0 pls0Var) {
        this.f123825a = n3t0Var;
        this.f123826b = pls0Var;
    }

    @Override // p149l.p3t0
    public final void zza() {
        xsu0.m210834k("callJs > getEngine: Promise rejected");
        this.f123825a.m157775c(new zzbrm("Unable to obtain a JavascriptEngine."));
        this.f123826b.m170255g();
    }
}
