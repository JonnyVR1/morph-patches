package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public final class ley {

    /* JADX INFO: renamed from: A */
    public int f127782A;

    /* JADX INFO: renamed from: B */
    public int f127783B;

    /* JADX INFO: renamed from: C */
    public int f127784C;

    /* JADX INFO: renamed from: D */
    public int f127785D;

    /* JADX INFO: renamed from: E */
    public int f127786E;

    /* JADX INFO: renamed from: F */
    public int f127787F;

    /* JADX INFO: renamed from: G */
    public int f127788G;

    /* JADX INFO: renamed from: H */
    public int f127789H = 0;

    /* JADX INFO: renamed from: I */
    public long f127790I;

    /* JADX INFO: renamed from: J */
    public long f127791J;

    /* JADX INFO: renamed from: K */
    public long f127792K;

    /* JADX INFO: renamed from: a */
    public long f127793a;

    /* JADX INFO: renamed from: b */
    public long f127794b;

    /* JADX INFO: renamed from: c */
    public long f127795c;

    /* JADX INFO: renamed from: d */
    public long f127796d;

    /* JADX INFO: renamed from: e */
    public long f127797e;

    /* JADX INFO: renamed from: f */
    public long f127798f;

    /* JADX INFO: renamed from: g */
    public long f127799g;

    /* JADX INFO: renamed from: h */
    public long f127800h;

    /* JADX INFO: renamed from: i */
    public long f127801i;

    /* JADX INFO: renamed from: j */
    public int f127802j;

    /* JADX INFO: renamed from: k */
    public int f127803k;

    /* JADX INFO: renamed from: l */
    public int f127804l;

    /* JADX INFO: renamed from: m */
    public int f127805m;

    /* JADX INFO: renamed from: n */
    public int f127806n;

    /* JADX INFO: renamed from: o */
    public int f127807o;

    /* JADX INFO: renamed from: p */
    public int f127808p;

    /* JADX INFO: renamed from: q */
    public long f127809q;

    /* JADX INFO: renamed from: r */
    public boolean f127810r;

    /* JADX INFO: renamed from: s */
    public boolean f127811s;

    /* JADX INFO: renamed from: t */
    public int f127812t;

    /* JADX INFO: renamed from: u */
    public int f127813u;

    /* JADX INFO: renamed from: v */
    private int f127814v;

    /* JADX INFO: renamed from: w */
    private int f127815w;

    /* JADX INFO: renamed from: x */
    private long f127816x;

    /* JADX INFO: renamed from: y */
    private long f127817y;

    /* JADX INFO: renamed from: z */
    public int f127818z;

    public ley(long j) {
        m149623e(j, 0L);
    }

    /* JADX INFO: renamed from: f */
    private String m149618f(Object... objArr) {
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
    public long m149619a() {
        return this.f127799g;
    }

    /* JADX INFO: renamed from: b */
    public String m149620b() {
        return m149621c();
    }

    /* JADX INFO: renamed from: c */
    public String m149621c() {
        int i;
        int i2;
        long j;
        long j2;
        long j3 = this.f127796d - this.f127790I;
        long j4 = this.f127797e - this.f127791J;
        long j5 = this.f127798f - this.f127792K;
        long j6 = this.f127806n - this.f127807o;
        int i3 = this.f127812t - this.f127814v;
        int i4 = this.f127813u - this.f127815w;
        int i5 = this.f127783B;
        if (i5 != 0) {
            i = this.f127782A / i5;
            i2 = this.f127802j / i5;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = this.f127784C;
        int i7 = i6 != 0 ? (int) (this.f127795c / ((long) i6)) : 0;
        int i8 = this.f127786E;
        int i9 = i8 != 0 ? this.f127785D / i8 : 0;
        if (257 == this.f127817y) {
            j = 0;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f127816x;
            if (jCurrentTimeMillis > 0) {
                if (j5 > 0) {
                    j2 = 8;
                    this.f127793a = (j5 / jCurrentTimeMillis) * 8;
                } else {
                    j2 = 8;
                }
                if (j4 > 0) {
                    this.f127794b = (j4 / jCurrentTimeMillis) * j2;
                }
                this.f127816x = System.currentTimeMillis();
            }
        } else {
            j = 0;
        }
        Long lValueOf = Long.valueOf(this.f127793a);
        Long lValueOf2 = Long.valueOf(this.f127794b);
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
        Long lValueOf6 = Long.valueOf(this.f127799g);
        Long lValueOf7 = Long.valueOf(this.f127811s ? j : this.f127800h);
        Long lValueOf8 = Long.valueOf(this.f127811s ? j : this.f127801i);
        Integer numValueOf2 = Integer.valueOf(i2);
        Integer numValueOf3 = Integer.valueOf(this.f127803k);
        Integer numValueOf4 = Integer.valueOf(this.f127804l);
        Integer numValueOf5 = Integer.valueOf(this.f127805m);
        if (j6 <= j) {
            j6 = j;
        }
        String strM149618f = m149618f(lValueOf, lValueOf2, numValueOf, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, numValueOf2, numValueOf3, numValueOf4, numValueOf5, Long.valueOf(j6), Integer.valueOf(this.f127808p), Long.valueOf(this.f127809q), Integer.valueOf(this.f127810r ? 1 : 0), Integer.valueOf(this.f127811s ? 1 : 0), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(this.f127818z), Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(this.f127787F), Integer.valueOf(this.f127788G));
        long j7 = j;
        this.f127793a = j7;
        this.f127794b = j7;
        this.f127800h = j7;
        this.f127801i = j7;
        this.f127790I = this.f127796d;
        this.f127791J = this.f127797e;
        this.f127792K = this.f127798f;
        this.f127807o = this.f127806n;
        this.f127814v = this.f127812t;
        this.f127815w = this.f127813u;
        this.f127782A = 0;
        this.f127802j = 0;
        this.f127818z = 0;
        this.f127795c = 0L;
        this.f127784C = 0;
        this.f127783B = 0;
        this.f127809q = 0L;
        this.f127808p = 0;
        this.f127804l = 0;
        this.f127787F = 0;
        this.f127788G = 0;
        return strM149618f;
    }

    /* JADX INFO: renamed from: d */
    public long m149622d() {
        return this.f127817y;
    }

    /* JADX INFO: renamed from: e */
    public void m149623e(long j, long j2) {
        m149626i();
        this.f127816x = System.currentTimeMillis();
        this.f127799g = j;
        this.f127817y = j2;
    }

    /* JADX INFO: renamed from: g */
    public void m149624g(boolean z) {
        this.f127810r = z;
    }

    /* JADX INFO: renamed from: h */
    public void m149625h(boolean z) {
        this.f127811s = z;
    }

    /* JADX INFO: renamed from: i */
    public void m149626i() {
        this.f127793a = 0L;
        this.f127794b = 0L;
        this.f127795c = 0L;
        this.f127796d = 0L;
        this.f127797e = 0L;
        this.f127798f = 0L;
        this.f127799g = 0L;
        this.f127800h = 0L;
        this.f127801i = 0L;
        this.f127811s = false;
        this.f127810r = false;
        this.f127802j = 0;
        this.f127803k = 0;
        this.f127807o = 0;
        this.f127812t = 0;
        this.f127813u = 0;
        this.f127783B = 0;
        this.f127784C = 0;
        this.f127818z = 0;
        this.f127782A = 0;
        this.f127785D = 0;
        this.f127786E = 0;
        this.f127787F = 0;
        this.f127788G = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m149627j(int i, int i2) {
        this.f127803k = i2;
    }

    /* JADX INFO: renamed from: k */
    public void m149628k(int i, int i2, int i3, int i4) {
        this.f127794b = i;
        this.f127800h = i3;
        this.f127801i = i4;
    }
}
