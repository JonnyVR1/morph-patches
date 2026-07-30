package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class pvs0 implements xct0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vus0 f154324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f154325b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tct0 f154326c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aws0 f154327d;

    public pvs0(aws0 aws0Var, vus0 vus0Var, Object obj, tct0 tct0Var) {
        this.f154324a = vus0Var;
        this.f154325b = obj;
        this.f154326c = tct0Var;
        this.f154327d = aws0Var;
    }

    @Override // p153l.xct0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        d2v0.m113737k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f154325b;
        tct0 tct0Var = this.f154326c;
        aws0.m100714b(this.f154327d, this.f154324a, (cvs0) obj, obj2, tct0Var);
    }
}
