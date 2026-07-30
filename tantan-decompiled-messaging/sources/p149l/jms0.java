package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class jms0 implements r3t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pls0 f118706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f118707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n3t0 f118708c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ums0 f118709d;

    public jms0(ums0 ums0Var, pls0 pls0Var, Object obj, n3t0 n3t0Var) {
        this.f118706a = pls0Var;
        this.f118707b = obj;
        this.f118708c = n3t0Var;
        this.f118709d = ums0Var;
    }

    @Override // p149l.r3t0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        xsu0.m210834k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f118707b;
        n3t0 n3t0Var = this.f118708c;
        ums0.m194406b(this.f118709d, this.f118706a, (wls0) obj, obj2, n3t0Var);
    }
}
