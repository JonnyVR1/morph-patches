package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wkt0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s5w0 f186826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f186827b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xkt0 f186828c;

    public wkt0(xkt0 xkt0Var, s5w0 s5w0Var, String str) {
        this.f186826a = s5w0Var;
        this.f186827b = str;
        this.f186828c = xkt0Var;
    }

    @Override // p149l.fmw0
    public final void zza(final Throwable th) {
        rmw0 rmw0Var = this.f186828c.f193356e;
        final s5w0 s5w0Var = this.f186826a;
        final String str = this.f186827b;
        rmw0Var.mo122103a(new Runnable() { // from class: l.ukt0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132082T9)).booleanValue();
                wkt0 wkt0Var = this.f176962a;
                Throwable th2 = th;
                if (zBooleanValue) {
                    xkt0 xkt0Var = wkt0Var.f186828c;
                    xkt0Var.f193360i = qts0.m176479e(xkt0Var.f193352a);
                    wkt0Var.f186828c.f193360i.mo176483b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    xkt0 xkt0Var2 = wkt0Var.f186828c;
                    xkt0Var2.f193359h = qts0.m176477c(xkt0Var2.f193352a);
                    wkt0Var.f186828c.f193359h.mo176483b(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                }
                s5w0Var.m182382c(str, null);
            }
        });
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        xkt0 xkt0Var = this.f186828c;
        final s5w0 s5w0Var = this.f186826a;
        final String str = (String) obj;
        xkt0Var.f193356e.mo122103a(new Runnable() { // from class: l.vkt0
            @Override // java.lang.Runnable
            public final void run() {
                s5w0Var.m182382c(str, null);
            }
        });
    }
}
