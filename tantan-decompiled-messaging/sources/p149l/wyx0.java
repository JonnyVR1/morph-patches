package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wyx0 {

    /* JADX INFO: renamed from: a */
    public boolean f188688a;

    /* JADX INFO: renamed from: b */
    public y3y0 f188689b;

    /* JADX INFO: renamed from: c */
    public int f188690c;

    /* JADX INFO: renamed from: d */
    public boolean f188691d;

    /* JADX INFO: renamed from: e */
    public int f188692e;

    /* JADX INFO: renamed from: f */
    public boolean f188693f;

    /* JADX INFO: renamed from: g */
    public int f188694g;

    public wyx0(y3y0 y3y0Var) {
        this.f188689b = y3y0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m206238a(int i) {
        this.f188688a = 1 == ((this.f188688a ? 1 : 0) | i);
        this.f188690c += i;
    }

    /* JADX INFO: renamed from: b */
    public final void m206239b(int i) {
        this.f188688a = true;
        this.f188693f = true;
        this.f188694g = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m206240c(y3y0 y3y0Var) {
        this.f188688a |= this.f188689b != y3y0Var;
        this.f188689b = y3y0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m206241d(int i) {
        if (this.f188691d && this.f188692e != 5) {
            f5v0.m119533d(i == 5);
            return;
        }
        this.f188688a = true;
        this.f188691d = true;
        this.f188692e = i;
    }
}
