package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class i5e0 extends lhi0 {

    /* JADX INFO: renamed from: P */
    protected volatile boolean f111565P;

    /* JADX INFO: renamed from: Q */
    private String f111566Q;

    /* JADX INFO: renamed from: O */
    private final Object f111564O = new Object();

    /* JADX INFO: renamed from: R */
    int f111567R = 0;

    /* JADX INFO: renamed from: S */
    int f111568S = 0;

    /* JADX INFO: renamed from: T */
    int f111569T = 0;

    /* JADX INFO: renamed from: U */
    int f111570U = 0;

    /* JADX INFO: renamed from: V */
    int f111571V = 0;

    /* JADX INFO: renamed from: N */
    private tuh0 f111563N = new tuh0();

    @Override // p149l.lhi0
    /* JADX INFO: renamed from: O */
    public void mo134471O() throws Throwable {
        super.mo134471O();
        this.f111563N.m190696h(this.f111566Q, this.f111567R, this.f111568S, this.f111569T, this.f111570U, this.f111571V);
    }

    /* JADX INFO: renamed from: R */
    public void m134472R(rmw rmwVar) {
        tuh0 tuh0Var = this.f111563N;
        if (tuh0Var != null) {
            tuh0Var.m190695g(rmwVar);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m134473S(qmw qmwVar) {
        tuh0 tuh0Var = this.f111563N;
        if (tuh0Var != null) {
            tuh0Var.m190694f(qmwVar);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m134474T(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.f111563N == null || m110705r() <= 0 || m110701n() <= 0 || str == null || str.length() <= 0) {
            return;
        }
        this.f111566Q = str;
        this.f111567R = i;
        this.f111568S = Math.min(Math.max(i2, 0), m110705r());
        this.f111569T = Math.min(Math.max(i3, 0), m110701n());
        int iMin = Math.min(Math.max(i4, 0), m110705r());
        int iMin2 = Math.min(Math.max(i5, 0), m110701n());
        if (iMin + i2 > m110705r() || iMin == 0) {
            iMin = m110705r() - i2;
        }
        this.f111570U = iMin;
        if (iMin2 + i3 > m110701n() || iMin2 == 0) {
            iMin2 = m110701n() - i3;
        }
        this.f111571V = iMin2;
        this.f111563N.m190693d(z);
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        synchronized (this.f111564O) {
            this.f111565P = true;
            super.mo102038f();
        }
    }

    @Override // p149l.lhi0, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: h */
    public void mo110696h() {
        tuh0 tuh0Var;
        synchronized (this.f111564O) {
            try {
                if (!this.f111565P && (tuh0Var = this.f111563N) != null && !tuh0Var.m190692c()) {
                    super.mo110696h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
