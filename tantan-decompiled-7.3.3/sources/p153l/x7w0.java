package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class x7w0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wit0 f192760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dut0 f192761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yew0 f192762c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fbv0 f192763d;

    public x7w0(wit0 wit0Var, dut0 dut0Var, yew0 yew0Var, fbv0 fbv0Var) {
        this.f192760a = wit0Var;
        this.f192761b = dut0Var;
        this.f192762c = yew0Var;
        this.f192763d = fbv0Var;
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.f192760a.mo13733c().f155892j0) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168057L9)).booleanValue() && this.f192761b != null && dut0.m118172h(str)) {
                this.f192761b.m118177g(str, this.f192762c, k6s0.m148572e());
                return;
            } else {
                this.f192762c.m215479c(str, null);
                return;
            }
        }
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
        String str2 = this.f192760a.mo13743h().f172368b;
        int i = 2;
        if (!bxy0.m106933q().m120278z(this.f192760a.getContext())) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168416o6)).booleanValue() || !this.f192760a.mo13733c().f155866T) {
                i = 1;
            }
        }
        this.f192763d.m124959g(new hbv0(jCurrentTimeMillis, str2, str, i));
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
    }
}
