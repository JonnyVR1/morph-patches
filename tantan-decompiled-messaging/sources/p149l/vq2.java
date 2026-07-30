package p149l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import p149l.vq2;

/* JADX INFO: loaded from: classes.dex */
public abstract class vq2<T extends vq2<T>> implements Cloneable {

    /* JADX INFO: renamed from: a */
    private int f182564a;

    /* JADX INFO: renamed from: e */
    @Nullable
    private Drawable f182568e;

    /* JADX INFO: renamed from: f */
    private int f182569f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private Drawable f182570g;

    /* JADX INFO: renamed from: h */
    private int f182571h;

    /* JADX INFO: renamed from: m */
    private boolean f182576m;

    /* JADX INFO: renamed from: o */
    @Nullable
    private Drawable f182578o;

    /* JADX INFO: renamed from: p */
    private int f182579p;

    /* JADX INFO: renamed from: t */
    private boolean f182583t;

    /* JADX INFO: renamed from: u */
    @Nullable
    private Resources.Theme f182584u;

    /* JADX INFO: renamed from: v */
    private boolean f182585v;

    /* JADX INFO: renamed from: w */
    private boolean f182586w;

    /* JADX INFO: renamed from: x */
    private boolean f182587x;

    /* JADX INFO: renamed from: z */
    private boolean f182589z;

    /* JADX INFO: renamed from: b */
    private float f182565b = 1.0f;

    /* JADX INFO: renamed from: c */
    @NonNull
    private p2e f182566c = p2e.f146849e;

    /* JADX INFO: renamed from: d */
    @NonNull
    private Priority f182567d = Priority.NORMAL;

    /* JADX INFO: renamed from: i */
    private boolean f182572i = true;

    /* JADX INFO: renamed from: j */
    private int f182573j = -1;

    /* JADX INFO: renamed from: k */
    private int f182574k = -1;

    /* JADX INFO: renamed from: l */
    @NonNull
    private kxq f182575l = cze.m109409c();

    /* JADX INFO: renamed from: n */
    private boolean f182577n = true;

    /* JADX INFO: renamed from: q */
    @NonNull
    private px50 f182580q = new px50();

    /* JADX INFO: renamed from: r */
    @NonNull
    private Map<Class<?>, p7j0<?>> f182581r = new kx3();

    /* JADX INFO: renamed from: s */
    @NonNull
    private Class<?> f182582s = Object.class;

    /* JADX INFO: renamed from: y */
    private boolean f182588y = true;

    /* JADX INFO: renamed from: K */
    private boolean m199393K(int i) {
        return m199394L(this.f182564a, i);
    }

    /* JADX INFO: renamed from: L */
    private static boolean m199394L(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: U */
    private T m199395U(@NonNull DownsampleStrategy downsampleStrategy, @NonNull p7j0<Bitmap> p7j0Var) {
        return (T) m199396Z(downsampleStrategy, p7j0Var, false);
    }

    @NonNull
    /* JADX INFO: renamed from: Z */
    private T m199396Z(@NonNull DownsampleStrategy downsampleStrategy, @NonNull p7j0<Bitmap> p7j0Var, boolean z) {
        T t = z ? (T) m199427g0(downsampleStrategy, p7j0Var) : (T) m199413V(downsampleStrategy, p7j0Var);
        t.f182588y = true;
        return t;
    }

    @NonNull
    /* JADX INFO: renamed from: b0 */
    private T m199398b0() {
        if (!this.f182583t) {
            return (T) m199397a0();
        }
        qkq0.m175383a("You cannot modify locked T, consider clone()");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public final Map<Class<?>, p7j0<?>> m199399A() {
        return this.f182581r;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m199400B() {
        return this.f182589z;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m199401C() {
        return this.f182586w;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m199402D() {
        return this.f182572i;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m199403E() {
        return m199393K(8);
    }

    /* JADX INFO: renamed from: G */
    public boolean m199404G() {
        return this.f182588y;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m199405M() {
        return this.f182577n;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m199406N() {
        return this.f182576m;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m199407O() {
        return m199393K(2048);
    }

    /* JADX INFO: renamed from: P */
    public final boolean m199408P() {
        return sck0.m183419s(this.f182574k, this.f182573j);
    }

    @NonNull
    /* JADX INFO: renamed from: Q */
    public T m199409Q() {
        this.f182583t = true;
        return (T) m199397a0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: R */
    public T m199410R() {
        return (T) m199413V(DownsampleStrategy.f4593e, new rn4());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: S */
    public T m199411S() {
        return (T) m199395U(DownsampleStrategy.f4592d, new sn4());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: T */
    public T m199412T() {
        return (T) m199395U(DownsampleStrategy.f4591c, new loi());
    }

    @NonNull
    /* JADX INFO: renamed from: V */
    public final T m199413V(@NonNull DownsampleStrategy downsampleStrategy, @NonNull p7j0<Bitmap> p7j0Var) {
        if (this.f182585v) {
            return (T) clone().m199413V(downsampleStrategy, p7j0Var);
        }
        m199425f(downsampleStrategy);
        return (T) m199431j0(p7j0Var, false);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: W */
    public T m199414W(int i, int i2) {
        if (this.f182585v) {
            return (T) clone().m199414W(i, i2);
        }
        this.f182574k = i;
        this.f182573j = i2;
        this.f182564a |= 512;
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: X */
    public T m199415X(@DrawableRes int i) {
        if (this.f182585v) {
            return (T) clone().m199415X(i);
        }
        this.f182571h = i;
        int i2 = this.f182564a | 128;
        this.f182570g = null;
        this.f182564a = i2 & (-65);
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Y */
    public T m199416Y(@NonNull Priority priority) {
        if (this.f182585v) {
            return (T) clone().m199416Y(priority);
        }
        this.f182567d = (Priority) qf80.m174276d(priority);
        this.f182564a |= 8;
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public T mo199417a(@NonNull vq2<?> vq2Var) {
        if (this.f182585v) {
            return (T) clone().mo199417a(vq2Var);
        }
        if (m199394L(vq2Var.f182564a, 2)) {
            this.f182565b = vq2Var.f182565b;
        }
        if (m199394L(vq2Var.f182564a, 262144)) {
            this.f182586w = vq2Var.f182586w;
        }
        if (m199394L(vq2Var.f182564a, 1048576)) {
            this.f182589z = vq2Var.f182589z;
        }
        if (m199394L(vq2Var.f182564a, 4)) {
            this.f182566c = vq2Var.f182566c;
        }
        if (m199394L(vq2Var.f182564a, 8)) {
            this.f182567d = vq2Var.f182567d;
        }
        if (m199394L(vq2Var.f182564a, 16)) {
            this.f182568e = vq2Var.f182568e;
            this.f182569f = 0;
            this.f182564a &= -33;
        }
        if (m199394L(vq2Var.f182564a, 32)) {
            this.f182569f = vq2Var.f182569f;
            this.f182568e = null;
            this.f182564a &= -17;
        }
        if (m199394L(vq2Var.f182564a, 64)) {
            this.f182570g = vq2Var.f182570g;
            this.f182571h = 0;
            this.f182564a &= -129;
        }
        if (m199394L(vq2Var.f182564a, 128)) {
            this.f182571h = vq2Var.f182571h;
            this.f182570g = null;
            this.f182564a &= -65;
        }
        if (m199394L(vq2Var.f182564a, 256)) {
            this.f182572i = vq2Var.f182572i;
        }
        if (m199394L(vq2Var.f182564a, 512)) {
            this.f182574k = vq2Var.f182574k;
            this.f182573j = vq2Var.f182573j;
        }
        if (m199394L(vq2Var.f182564a, 1024)) {
            this.f182575l = vq2Var.f182575l;
        }
        if (m199394L(vq2Var.f182564a, 4096)) {
            this.f182582s = vq2Var.f182582s;
        }
        if (m199394L(vq2Var.f182564a, 8192)) {
            this.f182578o = vq2Var.f182578o;
            this.f182579p = 0;
            this.f182564a &= -16385;
        }
        if (m199394L(vq2Var.f182564a, 16384)) {
            this.f182579p = vq2Var.f182579p;
            this.f182578o = null;
            this.f182564a &= -8193;
        }
        if (m199394L(vq2Var.f182564a, 32768)) {
            this.f182584u = vq2Var.f182584u;
        }
        if (m199394L(vq2Var.f182564a, 65536)) {
            this.f182577n = vq2Var.f182577n;
        }
        if (m199394L(vq2Var.f182564a, 131072)) {
            this.f182576m = vq2Var.f182576m;
        }
        if (m199394L(vq2Var.f182564a, 2048)) {
            this.f182581r.putAll(vq2Var.f182581r);
            this.f182588y = vq2Var.f182588y;
        }
        if (m199394L(vq2Var.f182564a, 524288)) {
            this.f182587x = vq2Var.f182587x;
        }
        if (!this.f182577n) {
            this.f182581r.clear();
            int i = this.f182564a;
            this.f182576m = false;
            this.f182564a = i & (-133121);
            this.f182588y = true;
        }
        this.f182564a |= vq2Var.f182564a;
        this.f182580q.m171823d(vq2Var.f182580q);
        return (T) m199398b0();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public T m199418b() {
        if (!this.f182583t || this.f182585v) {
            this.f182585v = true;
            return (T) m199409Q();
        }
        qkq0.m175383a("You cannot auto lock an already locked options object, try clone() first");
        return null;
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            px50 px50Var = new px50();
            t.f182580q = px50Var;
            px50Var.m171823d(this.f182580q);
            kx3 kx3Var = new kx3();
            t.f182581r = kx3Var;
            kx3Var.putAll(this.f182581r);
            t.f182583t = false;
            t.f182585v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: c0 */
    public <Y> T m199420c0(@NonNull kx50<Y> kx50Var, @NonNull Y y) {
        if (this.f182585v) {
            return (T) clone().m199420c0(kx50Var, y);
        }
        qf80.m174276d(kx50Var);
        qf80.m174276d(y);
        this.f182580q.m171824e(kx50Var, y);
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d */
    public T m199421d(@NonNull Class<?> cls) {
        if (this.f182585v) {
            return (T) clone().m199421d(cls);
        }
        this.f182582s = (Class) qf80.m174276d(cls);
        this.f182564a |= 4096;
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d0 */
    public T m199422d0(@NonNull kxq kxqVar) {
        if (this.f182585v) {
            return (T) clone().m199422d0(kxqVar);
        }
        this.f182575l = (kxq) qf80.m174276d(kxqVar);
        this.f182564a |= 1024;
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: e */
    public T m199423e(@NonNull p2e p2eVar) {
        if (this.f182585v) {
            return (T) clone().m199423e(p2eVar);
        }
        this.f182566c = (p2e) qf80.m174276d(p2eVar);
        this.f182564a |= 4;
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: e0 */
    public T m199424e0(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (this.f182585v) {
            return (T) clone().m199424e0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            ig3.m135964a("sizeMultiplier must be between 0 and 1");
            return null;
        }
        this.f182565b = f;
        this.f182564a |= 2;
        return (T) m199398b0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof vq2) {
            vq2 vq2Var = (vq2) obj;
            if (Float.compare(vq2Var.f182565b, this.f182565b) == 0 && this.f182569f == vq2Var.f182569f && sck0.m183404d(this.f182568e, vq2Var.f182568e) && this.f182571h == vq2Var.f182571h && sck0.m183404d(this.f182570g, vq2Var.f182570g) && this.f182579p == vq2Var.f182579p && sck0.m183404d(this.f182578o, vq2Var.f182578o) && this.f182572i == vq2Var.f182572i && this.f182573j == vq2Var.f182573j && this.f182574k == vq2Var.f182574k && this.f182576m == vq2Var.f182576m && this.f182577n == vq2Var.f182577n && this.f182586w == vq2Var.f182586w && this.f182587x == vq2Var.f182587x && this.f182566c.equals(vq2Var.f182566c) && this.f182567d == vq2Var.f182567d && this.f182580q.equals(vq2Var.f182580q) && this.f182581r.equals(vq2Var.f182581r) && this.f182582s.equals(vq2Var.f182582s) && sck0.m183404d(this.f182575l, vq2Var.f182575l) && sck0.m183404d(this.f182584u, vq2Var.f182584u)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f */
    public T m199425f(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) m199420c0(DownsampleStrategy.f4596h, qf80.m174276d(downsampleStrategy));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f0 */
    public T m199426f0(boolean z) {
        if (this.f182585v) {
            return (T) clone().m199426f0(true);
        }
        this.f182572i = !z;
        this.f182564a |= 256;
        return (T) m199398b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: g0 */
    public final T m199427g0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull p7j0<Bitmap> p7j0Var) {
        if (this.f182585v) {
            return (T) clone().m199427g0(downsampleStrategy, p7j0Var);
        }
        m199425f(downsampleStrategy);
        return (T) m199429i0(p7j0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: h0 */
    public <Y> T m199428h0(@NonNull Class<Y> cls, @NonNull p7j0<Y> p7j0Var, boolean z) {
        if (this.f182585v) {
            return (T) clone().m199428h0(cls, p7j0Var, z);
        }
        qf80.m174276d(cls);
        qf80.m174276d(p7j0Var);
        this.f182581r.put(cls, p7j0Var);
        int i = this.f182564a;
        this.f182577n = true;
        this.f182564a = 67584 | i;
        this.f182588y = false;
        if (z) {
            this.f182564a = i | 198656;
            this.f182576m = true;
        }
        return (T) m199398b0();
    }

    public int hashCode() {
        return sck0.m183414n(this.f182584u, sck0.m183414n(this.f182575l, sck0.m183414n(this.f182582s, sck0.m183414n(this.f182581r, sck0.m183414n(this.f182580q, sck0.m183414n(this.f182567d, sck0.m183414n(this.f182566c, sck0.m183415o(this.f182587x, sck0.m183415o(this.f182586w, sck0.m183415o(this.f182577n, sck0.m183415o(this.f182576m, sck0.m183413m(this.f182574k, sck0.m183413m(this.f182573j, sck0.m183415o(this.f182572i, sck0.m183414n(this.f182578o, sck0.m183413m(this.f182579p, sck0.m183414n(this.f182570g, sck0.m183413m(this.f182571h, sck0.m183414n(this.f182568e, sck0.m183413m(this.f182569f, sck0.m183411k(this.f182565b)))))))))))))))))))));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: i0 */
    public T m199429i0(@NonNull p7j0<Bitmap> p7j0Var) {
        return (T) m199431j0(p7j0Var, true);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j */
    public T m199430j(@DrawableRes int i) {
        if (this.f182585v) {
            return (T) clone().m199430j(i);
        }
        this.f182569f = i;
        int i2 = this.f182564a | 32;
        this.f182568e = null;
        this.f182564a = i2 & (-17);
        return (T) m199398b0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: j0 */
    public T m199431j0(@NonNull p7j0<Bitmap> p7j0Var, boolean z) {
        if (this.f182585v) {
            return (T) clone().m199431j0(p7j0Var, z);
        }
        ube ubeVar = new ube(p7j0Var, z);
        m199428h0(Bitmap.class, p7j0Var, z);
        m199428h0(Drawable.class, ubeVar, z);
        m199428h0(BitmapDrawable.class, ubeVar.m192820c(), z);
        m199428h0(lkj.class, new pkj(p7j0Var), z);
        return (T) m199398b0();
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public final p2e m199432k() {
        return this.f182566c;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: k0 */
    public T m199433k0(boolean z) {
        if (this.f182585v) {
            return (T) clone().m199433k0(z);
        }
        this.f182589z = z;
        this.f182564a |= 1048576;
        return (T) m199398b0();
    }

    /* JADX INFO: renamed from: l */
    public final int m199434l() {
        return this.f182569f;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Drawable m199435m() {
        return this.f182568e;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Drawable m199436n() {
        return this.f182578o;
    }

    /* JADX INFO: renamed from: o */
    public final int m199437o() {
        return this.f182579p;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m199438p() {
        return this.f182587x;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public final px50 m199439q() {
        return this.f182580q;
    }

    /* JADX INFO: renamed from: r */
    public final int m199440r() {
        return this.f182573j;
    }

    /* JADX INFO: renamed from: s */
    public final int m199441s() {
        return this.f182574k;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Drawable m199442t() {
        return this.f182570g;
    }

    /* JADX INFO: renamed from: u */
    public final int m199443u() {
        return this.f182571h;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public final Priority m199444v() {
        return this.f182567d;
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public final Class<?> m199445w() {
        return this.f182582s;
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public final kxq m199446x() {
        return this.f182575l;
    }

    /* JADX INFO: renamed from: y */
    public final float m199447y() {
        return this.f182565b;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Resources.Theme m199448z() {
        return this.f182584u;
    }

    /* JADX INFO: renamed from: a0 */
    private T m199397a0() {
        return this;
    }
}
