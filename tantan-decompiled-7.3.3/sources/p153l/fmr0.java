package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class fmr0 implements cmr0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f99828a;

    /* JADX INFO: renamed from: b */
    public final int f99829b;

    /* JADX INFO: renamed from: c */
    public final int f99830c;

    /* JADX INFO: renamed from: d */
    public int f99831d;

    /* JADX INFO: renamed from: e */
    public int f99832e;

    public fmr0(ylr0 ylr0Var) {
        bgw0 bgw0Var = ylr0Var.f200580b;
        this.f99828a = bgw0Var;
        bgw0Var.m104269k(12);
        this.f99830c = bgw0Var.m104248E() & 255;
        this.f99829b = bgw0Var.m104248E();
    }

    @Override // p153l.cmr0
    public final int zza() {
        return -1;
    }

    @Override // p153l.cmr0
    public final int zzb() {
        return this.f99829b;
    }

    @Override // p153l.cmr0
    public final int zzc() {
        int i = this.f99830c;
        if (i == 8) {
            return this.f99828a.m104245B();
        }
        if (i == 16) {
            return this.f99828a.m104249F();
        }
        int i2 = this.f99831d;
        this.f99831d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f99832e & 15;
        }
        int iM104245B = this.f99828a.m104245B();
        this.f99832e = iM104245B;
        return (iM104245B & 240) >> 4;
    }
}
