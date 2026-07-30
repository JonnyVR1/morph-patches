package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class mde0 extends lqi0 {

    /* JADX INFO: renamed from: P */
    protected volatile boolean f136367P;

    /* JADX INFO: renamed from: Q */
    private String f136368Q;

    /* JADX INFO: renamed from: O */
    private final Object f136366O = new Object();

    /* JADX INFO: renamed from: R */
    int f136369R = 0;

    /* JADX INFO: renamed from: S */
    int f136370S = 0;

    /* JADX INFO: renamed from: T */
    int f136371T = 0;

    /* JADX INFO: renamed from: U */
    int f136372U = 0;

    /* JADX INFO: renamed from: V */
    int f136373V = 0;

    /* JADX INFO: renamed from: N */
    private b3i0 f136365N = new b3i0();

    @Override // p153l.lqi0
    /* JADX INFO: renamed from: O */
    public void mo155491O() throws Throwable {
        super.mo155491O();
        this.f136365N.m102340h(this.f136368Q, this.f136369R, this.f136370S, this.f136371T, this.f136372U, this.f136373V);
    }

    /* JADX INFO: renamed from: R */
    public void m157974R(qpw qpwVar) {
        b3i0 b3i0Var = this.f136365N;
        if (b3i0Var != null) {
            b3i0Var.m102339g(qpwVar);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m157975S(ppw ppwVar) {
        b3i0 b3i0Var = this.f136365N;
        if (b3i0Var != null) {
            b3i0Var.m102338f(ppwVar);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m157976T(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.f136365N == null || m210702r() <= 0 || m210701n() <= 0 || str == null || str.length() <= 0) {
            return;
        }
        this.f136368Q = str;
        this.f136369R = i;
        this.f136370S = Math.min(Math.max(i2, 0), m210702r());
        this.f136371T = Math.min(Math.max(i3, 0), m210701n());
        int iMin = Math.min(Math.max(i4, 0), m210702r());
        int iMin2 = Math.min(Math.max(i5, 0), m210701n());
        if (iMin + i2 > m210702r() || iMin == 0) {
            iMin = m210702r() - i2;
        }
        this.f136372U = iMin;
        if (iMin2 + i3 > m210701n() || iMin2 == 0) {
            iMin2 = m210701n() - i3;
        }
        this.f136373V = iMin2;
        this.f136365N.m102337d(z);
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        synchronized (this.f136366O) {
            this.f136367P = true;
            super.mo96080f();
        }
    }

    @Override // p153l.lqi0, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: h */
    public void mo134805h() {
        b3i0 b3i0Var;
        synchronized (this.f136366O) {
            try {
                if (!this.f136367P && (b3i0Var = this.f136365N) != null && !b3i0Var.m102336c()) {
                    super.mo134805h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
