package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ryv0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q9t0 f161587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xkt0 f161588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s5w0 f161589c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z1v0 f161590d;

    public ryv0(q9t0 q9t0Var, xkt0 xkt0Var, s5w0 s5w0Var, z1v0 z1v0Var) {
        this.f161587a = q9t0Var;
        this.f161588b = xkt0Var;
        this.f161589c = s5w0Var;
        this.f161590d = z1v0Var;
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.f161587a.mo13679c().f125202j0) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131986L9)).booleanValue() && this.f161588b != null && xkt0.m209826h(str)) {
                this.f161588b.m209831g(str, this.f161589c, exr0.m118706e());
                return;
            } else {
                this.f161589c.m182382c(str, null);
                return;
            }
        }
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
        String str2 = this.f161587a.mo13689h().f141055b;
        int i = 2;
        if (!vny0.m199079q().m212293z(this.f161587a.getContext())) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132345o6)).booleanValue() || !this.f161587a.mo13679c().f125176T) {
                i = 1;
            }
        }
        this.f161590d.m216820g(new b2v0(jCurrentTimeMillis, str2, str, i));
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
    }
}
