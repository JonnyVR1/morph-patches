package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class fiy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public long f99278a;

    /* JADX INFO: renamed from: b */
    public long f99279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iiy0 f99280c;

    public fiy0(iiy0 iiy0Var, long j, long j2) {
        this.f99280c = iiy0Var;
        this.f99278a = j;
        this.f99279b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f99280c.f115160b.zzl().m177841w(new Runnable() { // from class: l.oiy0
            @Override // java.lang.Runnable
            public final void run() {
                fiy0 fiy0Var = this.f147595a;
                iiy0 iiy0Var = fiy0Var.f99280c;
                long j = fiy0Var.f99278a;
                long j2 = fiy0Var.f99279b;
                iiy0Var.f115160b.mo15146h();
                iiy0Var.f115160b.zzj().m114570z().m153300a("Application going to the background");
                iiy0Var.f115160b.mo15142d().f71914u.m115832a(true);
                iiy0Var.f115160b.m191306x(true);
                if (!iiy0Var.f115160b.mo15139a().m98431P()) {
                    boolean zM98440n = iiy0Var.f115160b.mo15139a().m98440n(whs0.f189225Q0);
                    thy0 thy0Var = iiy0Var.f115160b;
                    if (zM98440n) {
                        thy0Var.m191307y(false, false, j2);
                        iiy0Var.f115160b.f174433f.m154435e(j2);
                    } else {
                        thy0Var.f174433f.m154435e(j2);
                        iiy0Var.f115160b.m191307y(false, false, j2);
                    }
                }
                iiy0Var.f115160b.zzj().m114561D().m153301b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                if (iiy0Var.f115160b.mo15139a().m98440n(whs0.f189258e1)) {
                    iiy0Var.f115160b.mo15150l().m15279v0();
                }
            }
        });
    }
}
