package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class wyt0 {

    /* JADX INFO: renamed from: A */
    public static final String f191674A;

    /* JADX INFO: renamed from: B */
    public static final String f191675B;

    /* JADX INFO: renamed from: C */
    public static final String f191676C;

    /* JADX INFO: renamed from: D */
    public static final String f191677D;

    /* JADX INFO: renamed from: E */
    public static final String f191678E;

    /* JADX INFO: renamed from: F */
    @Deprecated
    public static final mhy0 f191679F;

    /* JADX INFO: renamed from: p */
    public static final Object f191680p = new Object();

    /* JADX INFO: renamed from: q */
    public static final Object f191681q = new Object();

    /* JADX INFO: renamed from: r */
    public static final trs0 f191682r;

    /* JADX INFO: renamed from: s */
    public static final String f191683s;

    /* JADX INFO: renamed from: t */
    public static final String f191684t;

    /* JADX INFO: renamed from: u */
    public static final String f191685u;

    /* JADX INFO: renamed from: v */
    public static final String f191686v;

    /* JADX INFO: renamed from: w */
    public static final String f191687w;

    /* JADX INFO: renamed from: x */
    public static final String f191688x;

    /* JADX INFO: renamed from: y */
    public static final String f191689y;

    /* JADX INFO: renamed from: z */
    public static final String f191690z;

    /* JADX INFO: renamed from: b */
    @Nullable
    @Deprecated
    public Object f191692b;

    /* JADX INFO: renamed from: d */
    public long f191694d;

    /* JADX INFO: renamed from: e */
    public long f191695e;

    /* JADX INFO: renamed from: f */
    public long f191696f;

    /* JADX INFO: renamed from: g */
    public boolean f191697g;

    /* JADX INFO: renamed from: h */
    public boolean f191698h;

    /* JADX INFO: renamed from: i */
    @Deprecated
    public boolean f191699i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public jfs0 f191700j;

    /* JADX INFO: renamed from: k */
    public boolean f191701k;

    /* JADX INFO: renamed from: l */
    public long f191702l;

    /* JADX INFO: renamed from: m */
    public long f191703m;

    /* JADX INFO: renamed from: n */
    public int f191704n;

    /* JADX INFO: renamed from: o */
    public int f191705o;

    /* JADX INFO: renamed from: a */
    public Object f191691a = f191680p;

    /* JADX INFO: renamed from: c */
    public trs0 f191693c = f191682r;

    static {
        lxr0 lxr0Var = new lxr0();
        lxr0Var.m156235a("androidx.media3.common.Timeline");
        lxr0Var.m156236b(Uri.EMPTY);
        f191682r = lxr0Var.m156237c();
        f191683s = Integer.toString(1, 36);
        f191684t = Integer.toString(2, 36);
        f191685u = Integer.toString(3, 36);
        f191686v = Integer.toString(4, 36);
        f191687w = Integer.toString(5, 36);
        f191688x = Integer.toString(6, 36);
        f191689y = Integer.toString(7, 36);
        f191690z = Integer.toString(8, 36);
        f191674A = Integer.toString(9, 36);
        f191675B = Integer.toString(10, 36);
        f191676C = Integer.toString(11, 36);
        f191677D = Integer.toString(12, 36);
        f191678E = Integer.toString(13, 36);
        f191679F = new mhy0() { // from class: l.qxt0
        };
    }

    /* JADX INFO: renamed from: a */
    public final wyt0 m208628a(Object obj, @Nullable trs0 trs0Var, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable jfs0 jfs0Var, long j4, long j5, int i, int i2, long j6) {
        this.f191691a = obj;
        if (trs0Var == null) {
            trs0Var = f191682r;
        }
        this.f191693c = trs0Var;
        this.f191692b = null;
        this.f191694d = -9223372036854775807L;
        this.f191695e = -9223372036854775807L;
        this.f191696f = -9223372036854775807L;
        this.f191697g = z;
        this.f191698h = z2;
        this.f191699i = jfs0Var != null;
        this.f191700j = jfs0Var;
        this.f191702l = 0L;
        this.f191703m = j5;
        this.f191704n = 0;
        this.f191705o = 0;
        this.f191701k = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m208629b() {
        lev0.m153958f(this.f191699i == (this.f191700j != null));
        return this.f191700j != null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wyt0.class.equals(obj.getClass())) {
            wyt0 wyt0Var = (wyt0) obj;
            if (mpw0.m159408f(this.f191691a, wyt0Var.f191691a) && mpw0.m159408f(this.f191693c, wyt0Var.f191693c) && mpw0.m159408f(null, null) && mpw0.m159408f(this.f191700j, wyt0Var.f191700j) && this.f191694d == wyt0Var.f191694d && this.f191695e == wyt0Var.f191695e && this.f191696f == wyt0Var.f191696f && this.f191697g == wyt0Var.f191697g && this.f191698h == wyt0Var.f191698h && this.f191701k == wyt0Var.f191701k && this.f191703m == wyt0Var.f191703m && this.f191704n == wyt0Var.f191704n && this.f191705o == wyt0Var.f191705o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f191691a.hashCode() + 217) * 31) + this.f191693c.hashCode();
        jfs0 jfs0Var = this.f191700j;
        int iHashCode2 = ((iHashCode * 961) + (jfs0Var == null ? 0 : jfs0Var.hashCode())) * 31;
        long j = this.f191694d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f191695e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f191696f;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f191697g ? 1 : 0)) * 31) + (this.f191698h ? 1 : 0)) * 31) + (this.f191701k ? 1 : 0);
        long j4 = this.f191703m;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f191704n) * 31) + this.f191705o) * 31;
    }
}
