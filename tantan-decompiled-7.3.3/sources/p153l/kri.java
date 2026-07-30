package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class kri {

    /* JADX INFO: renamed from: c */
    public boolean f128463c;

    /* JADX INFO: renamed from: d */
    public boolean f128464d;

    /* JADX INFO: renamed from: f */
    public int f128466f;

    /* JADX INFO: renamed from: a */
    public C18247a f128461a = new C18247a();

    /* JADX INFO: renamed from: b */
    public C18247a f128462b = new C18247a();

    /* JADX INFO: renamed from: e */
    public long f128465e = -9223372036854775807L;

    /* JADX INFO: renamed from: l.kri$a */
    public static final class C18247a {

        /* JADX INFO: renamed from: a */
        public long f128467a;

        /* JADX INFO: renamed from: b */
        public long f128468b;

        /* JADX INFO: renamed from: c */
        public long f128469c;

        /* JADX INFO: renamed from: d */
        public long f128470d;

        /* JADX INFO: renamed from: e */
        public long f128471e;

        /* JADX INFO: renamed from: f */
        public long f128472f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f128473g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f128474h;

        /* JADX INFO: renamed from: c */
        public static int m151086c(long j) {
            return (int) (j % 15);
        }

        /* JADX INFO: renamed from: a */
        public long m151087a() {
            long j = this.f128471e;
            if (j == 0) {
                return 0L;
            }
            return this.f128472f / j;
        }

        /* JADX INFO: renamed from: b */
        public long m151088b() {
            return this.f128472f;
        }

        /* JADX INFO: renamed from: d */
        public boolean m151089d() {
            long j = this.f128470d;
            if (j == 0) {
                return false;
            }
            return this.f128473g[m151086c(j - 1)];
        }

        /* JADX INFO: renamed from: e */
        public boolean m151090e() {
            return this.f128470d > 15 && this.f128474h == 0;
        }

        /* JADX INFO: renamed from: f */
        public void m151091f(long j) {
            long j2 = this.f128470d;
            if (j2 == 0) {
                this.f128467a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f128467a;
                this.f128468b = j3;
                this.f128472f = j3;
                this.f128471e = 1L;
            } else {
                long j4 = j - this.f128469c;
                int iM151086c = m151086c(j2);
                if (Math.abs(j4 - this.f128468b) <= 1000000) {
                    this.f128471e++;
                    this.f128472f += j4;
                    boolean[] zArr = this.f128473g;
                    if (zArr[iM151086c]) {
                        zArr[iM151086c] = false;
                        this.f128474h--;
                    }
                } else {
                    boolean[] zArr2 = this.f128473g;
                    if (!zArr2[iM151086c]) {
                        zArr2[iM151086c] = true;
                        this.f128474h++;
                    }
                }
            }
            this.f128470d++;
            this.f128469c = j;
        }

        /* JADX INFO: renamed from: g */
        public void m151092g() {
            this.f128470d = 0L;
            this.f128471e = 0L;
            this.f128472f = 0L;
            this.f128474h = 0;
            Arrays.fill(this.f128473g, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m151079a() {
        if (m151083e()) {
            return this.f128461a.m151087a();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public float m151080b() {
        if (m151083e()) {
            return (float) (1.0E9d / this.f128461a.m151087a());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: c */
    public int m151081c() {
        return this.f128466f;
    }

    /* JADX INFO: renamed from: d */
    public long m151082d() {
        if (m151083e()) {
            return this.f128461a.m151088b();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: e */
    public boolean m151083e() {
        return this.f128461a.m151090e();
    }

    /* JADX INFO: renamed from: f */
    public void m151084f(long j) {
        this.f128461a.m151091f(j);
        if (this.f128461a.m151090e() && !this.f128464d) {
            this.f128463c = false;
        } else if (this.f128465e != -9223372036854775807L) {
            if (!this.f128463c || this.f128462b.m151089d()) {
                this.f128462b.m151092g();
                this.f128462b.m151091f(this.f128465e);
            }
            this.f128463c = true;
            this.f128462b.m151091f(j);
        }
        if (this.f128463c && this.f128462b.m151090e()) {
            C18247a c18247a = this.f128461a;
            this.f128461a = this.f128462b;
            this.f128462b = c18247a;
            this.f128463c = false;
            this.f128464d = false;
        }
        this.f128465e = j;
        this.f128466f = this.f128461a.m151090e() ? 0 : this.f128466f + 1;
    }

    /* JADX INFO: renamed from: g */
    public void m151085g() {
        this.f128461a.m151092g();
        this.f128462b.m151092g();
        this.f128463c = false;
        this.f128465e = -9223372036854775807L;
        this.f128466f = 0;
    }
}
