package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class kzu0 extends hss0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f129463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f129464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f129465c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rdw0 f129466d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tct0 f129467e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ lzu0 f129468f;

    public kzu0(lzu0 lzu0Var, Object obj, String str, long j, rdw0 rdw0Var, tct0 tct0Var) {
        this.f129463a = obj;
        this.f129464b = str;
        this.f129465c = j;
        this.f129466d = rdw0Var;
        this.f129467e = tct0Var;
        this.f129468f = lzu0Var;
    }

    @Override // p153l.iss0
    /* JADX INFO: renamed from: c */
    public final void mo132149c(String str) {
        synchronized (this.f129463a) {
            this.f129468f.m156498v(this.f129464b, false, str, (int) (bxy0.m106918b().elapsedRealtime() - this.f129465c));
            this.f129468f.f134275l.m137653b(this.f129464b, "error");
            this.f129468f.f134278o.mo97568b(this.f129464b, "error");
            hew0 hew0Var = this.f129468f.f134279p;
            rdw0 rdw0Var = this.f129466d;
            rdw0Var.zzc(str);
            rdw0Var.mo162910S(false);
            hew0Var.m134677b(rdw0Var.zzl());
            this.f129467e.m190494b(Boolean.FALSE);
        }
    }

    @Override // p153l.iss0
    public final void zzf() {
        synchronized (this.f129463a) {
            this.f129468f.m156498v(this.f129464b, true, "", (int) (bxy0.m106918b().elapsedRealtime() - this.f129465c));
            this.f129468f.f134275l.m137655d(this.f129464b);
            this.f129468f.f134278o.mo97569z(this.f129464b);
            hew0 hew0Var = this.f129468f.f134279p;
            rdw0 rdw0Var = this.f129466d;
            rdw0Var.mo162910S(true);
            hew0Var.m134677b(rdw0Var.zzl());
            this.f129467e.m190494b(Boolean.TRUE);
        }
    }
}
