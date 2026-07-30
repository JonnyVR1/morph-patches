package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class pjr0 implements sir0 {

    /* JADX INFO: renamed from: b */
    public m7r0 f149872b;

    /* JADX INFO: renamed from: c */
    public boolean f149873c;

    /* JADX INFO: renamed from: e */
    public int f149875e;

    /* JADX INFO: renamed from: f */
    public int f149876f;

    /* JADX INFO: renamed from: a */
    public final v6w0 f149871a = new v6w0(10);

    /* JADX INFO: renamed from: d */
    public long f149874d = -9223372036854775807L;

    @Override // p149l.sir0
    /* JADX INFO: renamed from: a */
    public final void mo121625a(boolean z) {
        int i;
        f5v0.m119531b(this.f149872b);
        if (this.f149873c && (i = this.f149875e) != 0 && this.f149876f == i) {
            f5v0.m119535f(this.f149874d != -9223372036854775807L);
            this.f149872b.mo134530c(this.f149874d, 1, this.f149875e, 0, null);
            this.f149873c = false;
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: b */
    public final void mo121626b(v6w0 v6w0Var) {
        f5v0.m119531b(this.f149872b);
        if (this.f149873c) {
            int iM197268q = v6w0Var.m197268q();
            int i = this.f149876f;
            if (i < 10) {
                int iMin = Math.min(iM197268q, 10 - i);
                System.arraycopy(v6w0Var.m197264m(), v6w0Var.m197270s(), this.f149871a.m197264m(), this.f149876f, iMin);
                if (this.f149876f + iMin == 10) {
                    this.f149871a.m197262k(0);
                    if (this.f149871a.m197238B() != 73 || this.f149871a.m197238B() != 68 || this.f149871a.m197238B() != 51) {
                        svv0.m186111f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f149873c = false;
                        return;
                    } else {
                        this.f149871a.m197263l(3);
                        this.f149875e = this.f149871a.m197237A() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM197268q, this.f149875e - this.f149876f);
            this.f149872b.mo134533f(v6w0Var, iMin2);
            this.f149876f += iMin2;
        }
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: c */
    public final void mo121627c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f149873c = true;
        this.f149874d = j;
        this.f149875e = 0;
        this.f149876f = 0;
    }

    @Override // p149l.sir0
    /* JADX INFO: renamed from: d */
    public final void mo121628d(m5r0 m5r0Var, alr0 alr0Var) {
        alr0Var.m97444c();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(alr0Var.m97442a(), 5);
        this.f149872b = m7r0VarMo129454i;
        ter0 ter0Var = new ter0();
        ter0Var.m188604k(alr0Var.m97443b());
        ter0Var.m188618w("application/id3");
        m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
    }

    @Override // p149l.sir0
    public final void zze() {
        this.f149873c = false;
        this.f149874d = -9223372036854775807L;
    }
}
