package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vsr0 implements yrr0 {

    /* JADX INFO: renamed from: b */
    public sgr0 f185660b;

    /* JADX INFO: renamed from: c */
    public boolean f185661c;

    /* JADX INFO: renamed from: e */
    public int f185663e;

    /* JADX INFO: renamed from: f */
    public int f185664f;

    /* JADX INFO: renamed from: a */
    public final bgw0 f185659a = new bgw0(10);

    /* JADX INFO: renamed from: d */
    public long f185662d = -9223372036854775807L;

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: a */
    public final void mo155728a(boolean z) {
        int i;
        lev0.m153954b(this.f185660b);
        if (this.f185661c && (i = this.f185663e) != 0 && this.f185664f == i) {
            lev0.m153958f(this.f185662d != -9223372036854775807L);
            this.f185660b.mo99372c(this.f185662d, 1, this.f185663e, 0, null);
            this.f185661c = false;
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: b */
    public final void mo155729b(bgw0 bgw0Var) {
        lev0.m153954b(this.f185660b);
        if (this.f185661c) {
            int iM104275q = bgw0Var.m104275q();
            int i = this.f185664f;
            if (i < 10) {
                int iMin = Math.min(iM104275q, 10 - i);
                System.arraycopy(bgw0Var.m104271m(), bgw0Var.m104277s(), this.f185659a.m104271m(), this.f185664f, iMin);
                if (this.f185664f + iMin == 10) {
                    this.f185659a.m104269k(0);
                    if (this.f185659a.m104245B() != 73 || this.f185659a.m104245B() != 68 || this.f185659a.m104245B() != 51) {
                        y4w0.m214278f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f185661c = false;
                        return;
                    } else {
                        this.f185659a.m104270l(3);
                        this.f185663e = this.f185659a.m104244A() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM104275q, this.f185663e - this.f185664f);
            this.f185660b.mo99375f(bgw0Var, iMin2);
            this.f185664f += iMin2;
        }
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: c */
    public final void mo155730c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f185661c = true;
        this.f185662d = j;
        this.f185663e = 0;
        this.f185664f = 0;
    }

    @Override // p153l.yrr0
    /* JADX INFO: renamed from: d */
    public final void mo155731d(ser0 ser0Var, gur0 gur0Var) {
        gur0Var.m132386c();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 5);
        this.f185660b = sgr0VarMo101550i;
        znr0 znr0Var = new znr0();
        znr0Var.m220658k(gur0Var.m132385b());
        znr0Var.m220672w("application/id3");
        sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
    }

    @Override // p153l.yrr0
    public final void zze() {
        this.f185661c = false;
        this.f185662d = -9223372036854775807L;
    }
}
