package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class emr0 implements cmr0 {

    /* JADX INFO: renamed from: a */
    public final int f94687a;

    /* JADX INFO: renamed from: b */
    public final int f94688b;

    /* JADX INFO: renamed from: c */
    public final bgw0 f94689c;

    public emr0(ylr0 ylr0Var, sqr0 sqr0Var) {
        bgw0 bgw0Var = ylr0Var.f200580b;
        this.f94689c = bgw0Var;
        bgw0Var.m104269k(12);
        int iM104248E = bgw0Var.m104248E();
        if ("audio/raw".equals(sqr0Var.f170251l)) {
            int iM159388A = mpw0.m159388A(sqr0Var.f170233A, sqr0Var.f170264y);
            if (iM104248E == 0 || iM104248E % iM159388A != 0) {
                y4w0.m214278f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM159388A + ", stsz sample size: " + iM104248E);
                iM104248E = iM159388A;
            }
        }
        this.f94687a = iM104248E == 0 ? -1 : iM104248E;
        this.f94688b = bgw0Var.m104248E();
    }

    @Override // p153l.cmr0
    public final int zza() {
        return this.f94687a;
    }

    @Override // p153l.cmr0
    public final int zzb() {
        return this.f94688b;
    }

    @Override // p153l.cmr0
    public final int zzc() {
        int i = this.f94687a;
        return i == -1 ? this.f94689c.m104248E() : i;
    }
}
