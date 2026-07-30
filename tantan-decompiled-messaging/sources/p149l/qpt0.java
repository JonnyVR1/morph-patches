package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class qpt0 {

    /* JADX INFO: renamed from: A */
    public static final String f155797A;

    /* JADX INFO: renamed from: B */
    public static final String f155798B;

    /* JADX INFO: renamed from: C */
    public static final String f155799C;

    /* JADX INFO: renamed from: D */
    public static final String f155800D;

    /* JADX INFO: renamed from: E */
    public static final String f155801E;

    /* JADX INFO: renamed from: F */
    @Deprecated
    public static final g8y0 f155802F;

    /* JADX INFO: renamed from: p */
    public static final Object f155803p = new Object();

    /* JADX INFO: renamed from: q */
    public static final Object f155804q = new Object();

    /* JADX INFO: renamed from: r */
    public static final nis0 f155805r;

    /* JADX INFO: renamed from: s */
    public static final String f155806s;

    /* JADX INFO: renamed from: t */
    public static final String f155807t;

    /* JADX INFO: renamed from: u */
    public static final String f155808u;

    /* JADX INFO: renamed from: v */
    public static final String f155809v;

    /* JADX INFO: renamed from: w */
    public static final String f155810w;

    /* JADX INFO: renamed from: x */
    public static final String f155811x;

    /* JADX INFO: renamed from: y */
    public static final String f155812y;

    /* JADX INFO: renamed from: z */
    public static final String f155813z;

    /* JADX INFO: renamed from: b */
    @Nullable
    @Deprecated
    public Object f155815b;

    /* JADX INFO: renamed from: d */
    public long f155817d;

    /* JADX INFO: renamed from: e */
    public long f155818e;

    /* JADX INFO: renamed from: f */
    public long f155819f;

    /* JADX INFO: renamed from: g */
    public boolean f155820g;

    /* JADX INFO: renamed from: h */
    public boolean f155821h;

    /* JADX INFO: renamed from: i */
    @Deprecated
    public boolean f155822i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public d6s0 f155823j;

    /* JADX INFO: renamed from: k */
    public boolean f155824k;

    /* JADX INFO: renamed from: l */
    public long f155825l;

    /* JADX INFO: renamed from: m */
    public long f155826m;

    /* JADX INFO: renamed from: n */
    public int f155827n;

    /* JADX INFO: renamed from: o */
    public int f155828o;

    /* JADX INFO: renamed from: a */
    public Object f155814a = f155803p;

    /* JADX INFO: renamed from: c */
    public nis0 f155816c = f155805r;

    static {
        for0 for0Var = new for0();
        for0Var.m122516a("androidx.media3.common.Timeline");
        for0Var.m122517b(Uri.EMPTY);
        f155805r = for0Var.m122518c();
        f155806s = Integer.toString(1, 36);
        f155807t = Integer.toString(2, 36);
        f155808u = Integer.toString(3, 36);
        f155809v = Integer.toString(4, 36);
        f155810w = Integer.toString(5, 36);
        f155811x = Integer.toString(6, 36);
        f155812y = Integer.toString(7, 36);
        f155813z = Integer.toString(8, 36);
        f155797A = Integer.toString(9, 36);
        f155798B = Integer.toString(10, 36);
        f155799C = Integer.toString(11, 36);
        f155800D = Integer.toString(12, 36);
        f155801E = Integer.toString(13, 36);
        f155802F = new g8y0() { // from class: l.kot0
        };
    }

    /* JADX INFO: renamed from: a */
    public final qpt0 m175865a(Object obj, @Nullable nis0 nis0Var, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable d6s0 d6s0Var, long j4, long j5, int i, int i2, long j6) {
        this.f155814a = obj;
        if (nis0Var == null) {
            nis0Var = f155805r;
        }
        this.f155816c = nis0Var;
        this.f155815b = null;
        this.f155817d = -9223372036854775807L;
        this.f155818e = -9223372036854775807L;
        this.f155819f = -9223372036854775807L;
        this.f155820g = z;
        this.f155821h = z2;
        this.f155822i = d6s0Var != null;
        this.f155823j = d6s0Var;
        this.f155825l = 0L;
        this.f155826m = j5;
        this.f155827n = 0;
        this.f155828o = 0;
        this.f155824k = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m175866b() {
        f5v0.m119535f(this.f155822i == (this.f155823j != null));
        return this.f155823j != null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qpt0.class.equals(obj.getClass())) {
            qpt0 qpt0Var = (qpt0) obj;
            if (ggw0.m126064f(this.f155814a, qpt0Var.f155814a) && ggw0.m126064f(this.f155816c, qpt0Var.f155816c) && ggw0.m126064f(null, null) && ggw0.m126064f(this.f155823j, qpt0Var.f155823j) && this.f155817d == qpt0Var.f155817d && this.f155818e == qpt0Var.f155818e && this.f155819f == qpt0Var.f155819f && this.f155820g == qpt0Var.f155820g && this.f155821h == qpt0Var.f155821h && this.f155824k == qpt0Var.f155824k && this.f155826m == qpt0Var.f155826m && this.f155827n == qpt0Var.f155827n && this.f155828o == qpt0Var.f155828o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f155814a.hashCode() + 217) * 31) + this.f155816c.hashCode();
        d6s0 d6s0Var = this.f155823j;
        int iHashCode2 = ((iHashCode * 961) + (d6s0Var == null ? 0 : d6s0Var.hashCode())) * 31;
        long j = this.f155817d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f155818e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f155819f;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f155820g ? 1 : 0)) * 31) + (this.f155821h ? 1 : 0)) * 31) + (this.f155824k ? 1 : 0);
        long j4 = this.f155826m;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f155827n) * 31) + this.f155828o) * 31;
    }
}
