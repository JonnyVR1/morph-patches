package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class cut0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yew0 f83896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f83897b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dut0 f83898c;

    public cut0(dut0 dut0Var, yew0 yew0Var, String str) {
        this.f83896a = yew0Var;
        this.f83897b = str;
        this.f83898c = dut0Var;
    }

    @Override // p153l.lvw0
    public final void zza(final Throwable th) {
        xvw0 xvw0Var = this.f83898c.f90856e;
        final yew0 yew0Var = this.f83896a;
        final String str = this.f83897b;
        xvw0Var.mo155970a(new Runnable() { // from class: l.aut0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168153T9)).booleanValue();
                cut0 cut0Var = this.f73546a;
                Throwable th2 = th;
                if (zBooleanValue) {
                    dut0 dut0Var = cut0Var.f83898c;
                    dut0Var.f90860i = w2t0.m204594e(dut0Var.f90852a);
                    cut0Var.f83898c.f90860i.mo204598b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    dut0 dut0Var2 = cut0Var.f83898c;
                    dut0Var2.f90859h = w2t0.m204592c(dut0Var2.f90852a);
                    cut0Var.f83898c.f90859h.mo204598b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                }
                yew0Var.m215479c(str, null);
            }
        });
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        dut0 dut0Var = this.f83898c;
        final yew0 yew0Var = this.f83896a;
        final String str = (String) obj;
        dut0Var.f90856e.mo155970a(new Runnable() { // from class: l.but0
            @Override // java.lang.Runnable
            public final void run() {
                yew0Var.m215479c(str, null);
            }
        });
    }
}
