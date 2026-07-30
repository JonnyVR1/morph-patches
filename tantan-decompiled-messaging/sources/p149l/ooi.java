package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ooi {

    /* JADX INFO: renamed from: c */
    public boolean f144877c;

    /* JADX INFO: renamed from: d */
    public boolean f144878d;

    /* JADX INFO: renamed from: f */
    public int f144880f;

    /* JADX INFO: renamed from: a */
    public C18987a f144875a = new C18987a();

    /* JADX INFO: renamed from: b */
    public C18987a f144876b = new C18987a();

    /* JADX INFO: renamed from: e */
    public long f144879e = -9223372036854775807L;

    /* JADX INFO: renamed from: l.ooi$a */
    public static final class C18987a {

        /* JADX INFO: renamed from: a */
        public long f144881a;

        /* JADX INFO: renamed from: b */
        public long f144882b;

        /* JADX INFO: renamed from: c */
        public long f144883c;

        /* JADX INFO: renamed from: d */
        public long f144884d;

        /* JADX INFO: renamed from: e */
        public long f144885e;

        /* JADX INFO: renamed from: f */
        public long f144886f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f144887g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f144888h;

        /* JADX INFO: renamed from: c */
        public static int m165265c(long j) {
            return (int) (j % 15);
        }

        /* JADX INFO: renamed from: a */
        public long m165266a() {
            long j = this.f144885e;
            if (j == 0) {
                return 0L;
            }
            return this.f144886f / j;
        }

        /* JADX INFO: renamed from: b */
        public long m165267b() {
            return this.f144886f;
        }

        /* JADX INFO: renamed from: d */
        public boolean m165268d() {
            long j = this.f144884d;
            if (j == 0) {
                return false;
            }
            return this.f144887g[m165265c(j - 1)];
        }

        /* JADX INFO: renamed from: e */
        public boolean m165269e() {
            return this.f144884d > 15 && this.f144888h == 0;
        }

        /* JADX INFO: renamed from: f */
        public void m165270f(long j) {
            long j2 = this.f144884d;
            if (j2 == 0) {
                this.f144881a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f144881a;
                this.f144882b = j3;
                this.f144886f = j3;
                this.f144885e = 1L;
            } else {
                long j4 = j - this.f144883c;
                int iM165265c = m165265c(j2);
                if (Math.abs(j4 - this.f144882b) <= 1000000) {
                    this.f144885e++;
                    this.f144886f += j4;
                    boolean[] zArr = this.f144887g;
                    if (zArr[iM165265c]) {
                        zArr[iM165265c] = false;
                        this.f144888h--;
                    }
                } else {
                    boolean[] zArr2 = this.f144887g;
                    if (!zArr2[iM165265c]) {
                        zArr2[iM165265c] = true;
                        this.f144888h++;
                    }
                }
            }
            this.f144884d++;
            this.f144883c = j;
        }

        /* JADX INFO: renamed from: g */
        public void m165271g() {
            this.f144884d = 0L;
            this.f144885e = 0L;
            this.f144886f = 0L;
            this.f144888h = 0;
            Arrays.fill(this.f144887g, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m165258a() {
        if (m165262e()) {
            return this.f144875a.m165266a();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public float m165259b() {
        if (m165262e()) {
            return (float) (1.0E9d / this.f144875a.m165266a());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: c */
    public int m165260c() {
        return this.f144880f;
    }

    /* JADX INFO: renamed from: d */
    public long m165261d() {
        if (m165262e()) {
            return this.f144875a.m165267b();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: e */
    public boolean m165262e() {
        return this.f144875a.m165269e();
    }

    /* JADX INFO: renamed from: f */
    public void m165263f(long j) {
        this.f144875a.m165270f(j);
        if (this.f144875a.m165269e() && !this.f144878d) {
            this.f144877c = false;
        } else if (this.f144879e != -9223372036854775807L) {
            if (!this.f144877c || this.f144876b.m165268d()) {
                this.f144876b.m165271g();
                this.f144876b.m165270f(this.f144879e);
            }
            this.f144877c = true;
            this.f144876b.m165270f(j);
        }
        if (this.f144877c && this.f144876b.m165269e()) {
            C18987a c18987a = this.f144875a;
            this.f144875a = this.f144876b;
            this.f144876b = c18987a;
            this.f144877c = false;
            this.f144878d = false;
        }
        this.f144879e = j;
        this.f144880f = this.f144875a.m165269e() ? 0 : this.f144880f + 1;
    }

    /* JADX INFO: renamed from: g */
    public void m165264g() {
        this.f144875a.m165271g();
        this.f144876b.m165271g();
        this.f144877c = false;
        this.f144879e = -9223372036854775807L;
        this.f144880f = 0;
    }
}
