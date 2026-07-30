package p153l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public final class iny {

    /* JADX INFO: renamed from: A */
    public int f116012A;

    /* JADX INFO: renamed from: B */
    public int f116013B;

    /* JADX INFO: renamed from: C */
    public int f116014C;

    /* JADX INFO: renamed from: D */
    public int f116015D;

    /* JADX INFO: renamed from: E */
    public int f116016E;

    /* JADX INFO: renamed from: F */
    public int f116017F;

    /* JADX INFO: renamed from: G */
    public int f116018G;

    /* JADX INFO: renamed from: H */
    public int f116019H = 0;

    /* JADX INFO: renamed from: I */
    public long f116020I;

    /* JADX INFO: renamed from: J */
    public long f116021J;

    /* JADX INFO: renamed from: K */
    public long f116022K;

    /* JADX INFO: renamed from: a */
    public long f116023a;

    /* JADX INFO: renamed from: b */
    public long f116024b;

    /* JADX INFO: renamed from: c */
    public long f116025c;

    /* JADX INFO: renamed from: d */
    public long f116026d;

    /* JADX INFO: renamed from: e */
    public long f116027e;

    /* JADX INFO: renamed from: f */
    public long f116028f;

    /* JADX INFO: renamed from: g */
    public long f116029g;

    /* JADX INFO: renamed from: h */
    public long f116030h;

    /* JADX INFO: renamed from: i */
    public long f116031i;

    /* JADX INFO: renamed from: j */
    public int f116032j;

    /* JADX INFO: renamed from: k */
    public int f116033k;

    /* JADX INFO: renamed from: l */
    public int f116034l;

    /* JADX INFO: renamed from: m */
    public int f116035m;

    /* JADX INFO: renamed from: n */
    public int f116036n;

    /* JADX INFO: renamed from: o */
    public int f116037o;

    /* JADX INFO: renamed from: p */
    public int f116038p;

    /* JADX INFO: renamed from: q */
    public long f116039q;

    /* JADX INFO: renamed from: r */
    public boolean f116040r;

    /* JADX INFO: renamed from: s */
    public boolean f116041s;

    /* JADX INFO: renamed from: t */
    public int f116042t;

    /* JADX INFO: renamed from: u */
    public int f116043u;

    /* JADX INFO: renamed from: v */
    private int f116044v;

    /* JADX INFO: renamed from: w */
    private int f116045w;

    /* JADX INFO: renamed from: x */
    private long f116046x;

    /* JADX INFO: renamed from: y */
    private long f116047y;

    /* JADX INFO: renamed from: z */
    public int f116048z;

    public iny(long j) {
        m141179e(j, 0L);
    }

    /* JADX INFO: renamed from: f */
    private String m141174f(Object... objArr) {
        StringBuilder sb = new StringBuilder("(");
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                sb.append(objArr[i]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public long m141175a() {
        return this.f116029g;
    }

    /* JADX INFO: renamed from: b */
    public String m141176b() {
        return m141177c();
    }

    /* JADX INFO: renamed from: c */
    public String m141177c() {
        int i;
        int i2;
        long j;
        long j2;
        long j3 = this.f116026d - this.f116020I;
        long j4 = this.f116027e - this.f116021J;
        long j5 = this.f116028f - this.f116022K;
        long j6 = this.f116036n - this.f116037o;
        int i3 = this.f116042t - this.f116044v;
        int i4 = this.f116043u - this.f116045w;
        int i5 = this.f116013B;
        if (i5 != 0) {
            i = this.f116012A / i5;
            i2 = this.f116032j / i5;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = this.f116014C;
        int i7 = i6 != 0 ? (int) (this.f116025c / ((long) i6)) : 0;
        int i8 = this.f116016E;
        int i9 = i8 != 0 ? this.f116015D / i8 : 0;
        if (257 == this.f116047y) {
            j = 0;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f116046x;
            if (jCurrentTimeMillis > 0) {
                if (j5 > 0) {
                    j2 = 8;
                    this.f116023a = (j5 / jCurrentTimeMillis) * 8;
                } else {
                    j2 = 8;
                }
                if (j4 > 0) {
                    this.f116024b = (j4 / jCurrentTimeMillis) * j2;
                }
                this.f116046x = System.currentTimeMillis();
            }
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(this.f116023a);
        Long lValueOf2 = Long.valueOf(this.f116024b);
        Integer numValueOf = Integer.valueOf(i7);
        Long lValueOf3 = Long.valueOf(j3 > j ? j3 : j);
        if (j4 <= j) {
            j4 = j;
        }
        Long lValueOf4 = Long.valueOf(j4);
        if (j5 <= j) {
            j5 = j;
        }
        Long lValueOf5 = Long.valueOf(j5);
        Long lValueOf6 = Long.valueOf(this.f116029g);
        Long lValueOf7 = Long.valueOf(this.f116041s ? j : this.f116030h);
        Long lValueOf8 = Long.valueOf(this.f116041s ? j : this.f116031i);
        Integer numValueOf2 = Integer.valueOf(i2);
        Integer numValueOf3 = Integer.valueOf(this.f116033k);
        Integer numValueOf4 = Integer.valueOf(this.f116034l);
        Integer numValueOf5 = Integer.valueOf(this.f116035m);
        if (j6 <= j) {
            j6 = j;
        }
        String strM141174f = m141174f(lValueOf, lValueOf2, numValueOf, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, numValueOf2, numValueOf3, numValueOf4, numValueOf5, Long.valueOf(j6), Integer.valueOf(this.f116038p), Long.valueOf(this.f116039q), Integer.valueOf(this.f116040r ? 1 : 0), Integer.valueOf(this.f116041s ? 1 : 0), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(this.f116048z), Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(this.f116017F), Integer.valueOf(this.f116018G));
        long j7 = j;
        this.f116023a = j7;
        this.f116024b = j7;
        this.f116030h = j7;
        this.f116031i = j7;
        this.f116020I = this.f116026d;
        this.f116021J = this.f116027e;
        this.f116022K = this.f116028f;
        this.f116037o = this.f116036n;
        this.f116044v = this.f116042t;
        this.f116045w = this.f116043u;
        this.f116012A = 0;
        this.f116032j = 0;
        this.f116048z = 0;
        this.f116025c = 0L;
        this.f116014C = 0;
        this.f116013B = 0;
        this.f116039q = 0L;
        this.f116038p = 0;
        this.f116034l = 0;
        this.f116017F = 0;
        this.f116018G = 0;
        return strM141174f;
    }

    /* JADX INFO: renamed from: d */
    public long m141178d() {
        return this.f116047y;
    }

    /* JADX INFO: renamed from: e */
    public void m141179e(long j, long j2) {
        m141182i();
        this.f116046x = System.currentTimeMillis();
        this.f116029g = j;
        this.f116047y = j2;
    }

    /* JADX INFO: renamed from: g */
    public void m141180g(boolean z) {
        this.f116040r = z;
    }

    /* JADX INFO: renamed from: h */
    public void m141181h(boolean z) {
        this.f116041s = z;
    }

    /* JADX INFO: renamed from: i */
    public void m141182i() {
        this.f116023a = 0L;
        this.f116024b = 0L;
        this.f116025c = 0L;
        this.f116026d = 0L;
        this.f116027e = 0L;
        this.f116028f = 0L;
        this.f116029g = 0L;
        this.f116030h = 0L;
        this.f116031i = 0L;
        this.f116041s = false;
        this.f116040r = false;
        this.f116032j = 0;
        this.f116033k = 0;
        this.f116037o = 0;
        this.f116042t = 0;
        this.f116043u = 0;
        this.f116013B = 0;
        this.f116014C = 0;
        this.f116048z = 0;
        this.f116012A = 0;
        this.f116015D = 0;
        this.f116016E = 0;
        this.f116017F = 0;
        this.f116018G = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m141183j(int i, int i2) {
        this.f116033k = i2;
    }

    /* JADX INFO: renamed from: k */
    public void m141184k(int i, int i2, int i3, int i4) {
        this.f116024b = i;
        this.f116030h = i3;
        this.f116031i = i4;
    }
}
