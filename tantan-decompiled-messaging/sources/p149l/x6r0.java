package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class x6r0 implements j5r0 {

    /* JADX INFO: renamed from: a */
    public final int f191261a;

    /* JADX INFO: renamed from: b */
    public final int f191262b;

    /* JADX INFO: renamed from: c */
    public final String f191263c;

    /* JADX INFO: renamed from: d */
    public int f191264d;

    /* JADX INFO: renamed from: e */
    public int f191265e;

    /* JADX INFO: renamed from: f */
    public m5r0 f191266f;

    /* JADX INFO: renamed from: g */
    public m7r0 f191267g;

    public x6r0(int i, int i2, String str) {
        this.f191261a = i;
        this.f191262b = i2;
        this.f191263c = str;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        if (j == 0 || this.f191265e == 1) {
            this.f191265e = 1;
            this.f191264d = 0;
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        f5v0.m119535f((this.f191261a == -1 || this.f191262b == -1) ? false : true);
        v6w0 v6w0Var = new v6w0(this.f191262b);
        ((z4r0) k5r0Var).mo140051c(v6w0Var.m197264m(), 0, this.f191262b, false);
        return v6w0Var.m197242F() == this.f191261a;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f191266f = m5r0Var;
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(1024, 4);
        this.f191267g = m7r0VarMo129454i;
        ter0 ter0Var = new ter0();
        ter0Var.m188593b(this.f191263c);
        m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
        this.f191266f.mo129453c();
        this.f191266f.mo129455j(new y6r0(-9223372036854775807L));
        this.f191265e = 1;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        int i = this.f191265e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            ohg0.m164364a();
            return 0;
        }
        m7r0 m7r0Var = this.f191267g;
        m7r0Var.getClass();
        int iM217415a = z6r0.m217415a(m7r0Var, k5r0Var, 1024, true);
        if (iM217415a == -1) {
            this.f191265e = 2;
            this.f191267g.mo134530c(0L, 1, this.f191264d, 0, null);
            this.f191264d = 0;
        } else {
            this.f191264d += iM217415a;
        }
        return 0;
    }
}
