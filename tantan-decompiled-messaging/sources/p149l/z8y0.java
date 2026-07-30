package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class z8y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public long f202244a;

    /* JADX INFO: renamed from: b */
    public long f202245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c9y0 f202246c;

    public z8y0(c9y0 c9y0Var, long j, long j2) {
        this.f202246c = c9y0Var;
        this.f202244a = j;
        this.f202245b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f202246c.f79993b.zzl().m146305w(new Runnable() { // from class: l.i9y0
            @Override // java.lang.Runnable
            public final void run() {
                z8y0 z8y0Var = this.f112270a;
                c9y0 c9y0Var = z8y0Var.f202246c;
                long j = z8y0Var.f202244a;
                long j2 = z8y0Var.f202245b;
                c9y0Var.f79993b.mo15092h();
                c9y0Var.f79993b.zzj().m211424z().m123936a("Application going to the background");
                c9y0Var.f79993b.mo15088d().f175533u.m207309a(true);
                c9y0Var.f79993b.m158513x(true);
                if (!c9y0Var.f79993b.mo15085a().m192639P()) {
                    boolean zM192648n = c9y0Var.f79993b.mo15085a().m192648n(q8s0.f153249Q0);
                    n8y0 n8y0Var = c9y0Var.f79993b;
                    if (zM192648n) {
                        n8y0Var.m158514y(false, false, j2);
                        c9y0Var.f79993b.f137709f.m120136e(j2);
                    } else {
                        n8y0Var.f137709f.m120136e(j2);
                        c9y0Var.f79993b.m158514y(false, false, j2);
                    }
                }
                c9y0Var.f79993b.zzj().m211415D().m123937b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                if (c9y0Var.f79993b.mo15085a().m192648n(q8s0.f153282e1)) {
                    c9y0Var.f79993b.mo15096l().m15225v0();
                }
            }
        });
    }
}
