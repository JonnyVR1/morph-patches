package p153l;

import com.google.android.gms.internal.ads.zzbrm;

/* JADX INFO: loaded from: classes6.dex */
public final class qvs0 implements vct0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tct0 f159805a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vus0 f159806b;

    public qvs0(aws0 aws0Var, tct0 tct0Var, vus0 vus0Var) {
        this.f159805a = tct0Var;
        this.f159806b = vus0Var;
    }

    @Override // p153l.vct0
    public final void zza() {
        d2v0.m113737k("callJs > getEngine: Promise rejected");
        this.f159805a.m190495c(new zzbrm("Unable to obtain a JavascriptEngine."));
        this.f159806b.m202889g();
    }
}
