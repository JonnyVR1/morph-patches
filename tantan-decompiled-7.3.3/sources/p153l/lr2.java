package p153l;

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
import p153l.lr2;

/* JADX INFO: loaded from: classes.dex */
public abstract class lr2<T extends lr2<T>> implements Cloneable {

    /* JADX INFO: renamed from: a */
    private int f133261a;

    /* JADX INFO: renamed from: e */
    @Nullable
    private Drawable f133265e;

    /* JADX INFO: renamed from: f */
    private int f133266f;

    /* JADX INFO: renamed from: g */
    @Nullable
    private Drawable f133267g;

    /* JADX INFO: renamed from: h */
    private int f133268h;

    /* JADX INFO: renamed from: m */
    private boolean f133273m;

    /* JADX INFO: renamed from: o */
    @Nullable
    private Drawable f133275o;

    /* JADX INFO: renamed from: p */
    private int f133276p;

    /* JADX INFO: renamed from: t */
    private boolean f133280t;

    /* JADX INFO: renamed from: u */
    @Nullable
    private Resources.Theme f133281u;

    /* JADX INFO: renamed from: v */
    private boolean f133282v;

    /* JADX INFO: renamed from: w */
    private boolean f133283w;

    /* JADX INFO: renamed from: x */
    private boolean f133284x;

    /* JADX INFO: renamed from: z */
    private boolean f133286z;

    /* JADX INFO: renamed from: b */
    private float f133262b = 1.0f;

    /* JADX INFO: renamed from: c */
    @NonNull
    private d4e f133263c = d4e.f85037e;

    /* JADX INFO: renamed from: d */
    @NonNull
    private Priority f133264d = Priority.NORMAL;

    /* JADX INFO: renamed from: i */
    private boolean f133269i = true;

    /* JADX INFO: renamed from: j */
    private int f133270j = -1;

    /* JADX INFO: renamed from: k */
    private int f133271k = -1;

    /* JADX INFO: renamed from: l */
    @NonNull
    private kzq f133272l = g0f.m128426c();

    /* JADX INFO: renamed from: n */
    private boolean f133274n = true;

    /* JADX INFO: renamed from: q */
    @NonNull
    private u560 f133277q = new u560();

    /* JADX INFO: renamed from: r */
    @NonNull
    private Map<Class<?>, tgj0<?>> f133278r = new jy3();

    /* JADX INFO: renamed from: s */
    @NonNull
    private Class<?> f133279s = Object.class;

    /* JADX INFO: renamed from: y */
    private boolean f133285y = true;

    /* JADX INFO: renamed from: L */
    private boolean m155522L(int i) {
        return m155523M(this.f133261a, i);
    }

    /* JADX INFO: renamed from: M */
    private static boolean m155523M(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: V */
    private T m155524V(@NonNull DownsampleStrategy downsampleStrategy, @NonNull tgj0<Bitmap> tgj0Var) {
        return (T) m155525a0(downsampleStrategy, tgj0Var, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a0 */
    private T m155525a0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull tgj0<Bitmap> tgj0Var, boolean z) {
        T t = z ? (T) m155555h0(downsampleStrategy, tgj0Var) : (T) m155542W(downsampleStrategy, tgj0Var);
        t.f133285y = true;
        return t;
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public final Map<Class<?>, tgj0<?>> m155527A() {
        return this.f133278r;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m155528B() {
        return this.f133286z;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m155529C() {
        return this.f133283w;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m155530D() {
        return this.f133282v;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m155531E() {
        return this.f133269i;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m155532G() {
        return m155522L(8);
    }

    /* JADX INFO: renamed from: K */
    public boolean m155533K() {
        return this.f133285y;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m155534N() {
        return this.f133274n;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m155535O() {
        return this.f133273m;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m155536P() {
        return m155522L(2048);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m155537Q() {
        return ylk0.m216597u(this.f133271k, this.f133270j);
    }

    @NonNull
    /* JADX INFO: renamed from: R */
    public T m155538R() {
        this.f133280t = true;
        return (T) m155526b0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: S */
    public T m155539S() {
        return (T) m155542W(DownsampleStrategy.f4605e, new qo4());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: T */
    public T m155540T() {
        return (T) m155524V(DownsampleStrategy.f4604d, new ro4());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: U */
    public T m155541U() {
        return (T) m155524V(DownsampleStrategy.f4603c, new hri());
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public final T m155542W(@NonNull DownsampleStrategy downsampleStrategy, @NonNull tgj0<Bitmap> tgj0Var) {
        if (this.f133282v) {
            return (T) clone().m155542W(downsampleStrategy, tgj0Var);
        }
        m155552f(downsampleStrategy);
        return (T) m155560k0(tgj0Var, false);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: X */
    public T m155543X(int i, int i2) {
        if (this.f133282v) {
            return (T) clone().m155543X(i, i2);
        }
        this.f133271k = i;
        this.f133270j = i2;
        this.f133261a |= 512;
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Y */
    public T m155544Y(@DrawableRes int i) {
        if (this.f133282v) {
            return (T) clone().m155544Y(i);
        }
        this.f133268h = i;
        int i2 = this.f133261a | 128;
        this.f133267g = null;
        this.f133261a = i2 & (-65);
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Z */
    public T m155545Z(@NonNull Priority priority) {
        if (this.f133282v) {
            return (T) clone().m155545Z(priority);
        }
        this.f133264d = (Priority) vn80.m201944d(priority);
        this.f133261a |= 8;
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: a */
    public T mo95645a(@NonNull lr2<?> lr2Var) {
        if (this.f133282v) {
            return (T) clone().mo95645a(lr2Var);
        }
        if (m155523M(lr2Var.f133261a, 2)) {
            this.f133262b = lr2Var.f133262b;
        }
        if (m155523M(lr2Var.f133261a, 262144)) {
            this.f133283w = lr2Var.f133283w;
        }
        if (m155523M(lr2Var.f133261a, 1048576)) {
            this.f133286z = lr2Var.f133286z;
        }
        if (m155523M(lr2Var.f133261a, 4)) {
            this.f133263c = lr2Var.f133263c;
        }
        if (m155523M(lr2Var.f133261a, 8)) {
            this.f133264d = lr2Var.f133264d;
        }
        if (m155523M(lr2Var.f133261a, 16)) {
            this.f133265e = lr2Var.f133265e;
            this.f133266f = 0;
            this.f133261a &= -33;
        }
        if (m155523M(lr2Var.f133261a, 32)) {
            this.f133266f = lr2Var.f133266f;
            this.f133265e = null;
            this.f133261a &= -17;
        }
        if (m155523M(lr2Var.f133261a, 64)) {
            this.f133267g = lr2Var.f133267g;
            this.f133268h = 0;
            this.f133261a &= -129;
        }
        if (m155523M(lr2Var.f133261a, 128)) {
            this.f133268h = lr2Var.f133268h;
            this.f133267g = null;
            this.f133261a &= -65;
        }
        if (m155523M(lr2Var.f133261a, 256)) {
            this.f133269i = lr2Var.f133269i;
        }
        if (m155523M(lr2Var.f133261a, 512)) {
            this.f133271k = lr2Var.f133271k;
            this.f133270j = lr2Var.f133270j;
        }
        if (m155523M(lr2Var.f133261a, 1024)) {
            this.f133272l = lr2Var.f133272l;
        }
        if (m155523M(lr2Var.f133261a, 4096)) {
            this.f133279s = lr2Var.f133279s;
        }
        if (m155523M(lr2Var.f133261a, 8192)) {
            this.f133275o = lr2Var.f133275o;
            this.f133276p = 0;
            this.f133261a &= -16385;
        }
        if (m155523M(lr2Var.f133261a, 16384)) {
            this.f133276p = lr2Var.f133276p;
            this.f133275o = null;
            this.f133261a &= -8193;
        }
        if (m155523M(lr2Var.f133261a, 32768)) {
            this.f133281u = lr2Var.f133281u;
        }
        if (m155523M(lr2Var.f133261a, 65536)) {
            this.f133274n = lr2Var.f133274n;
        }
        if (m155523M(lr2Var.f133261a, 131072)) {
            this.f133273m = lr2Var.f133273m;
        }
        if (m155523M(lr2Var.f133261a, 2048)) {
            this.f133278r.putAll(lr2Var.f133278r);
            this.f133285y = lr2Var.f133285y;
        }
        if (m155523M(lr2Var.f133261a, 524288)) {
            this.f133284x = lr2Var.f133284x;
        }
        if (!this.f133274n) {
            this.f133278r.clear();
            int i = this.f133261a;
            this.f133273m = false;
            this.f133261a = i & (-133121);
            this.f133285y = true;
        }
        this.f133261a |= lr2Var.f133261a;
        this.f133277q.m194543d(lr2Var.f133277q);
        return (T) m155547c0();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public T m155546b() {
        if (!this.f133280t || this.f133282v) {
            this.f133282v = true;
            return (T) m155538R();
        }
        wtq0.m207906a("You cannot auto lock an already locked options object, try clone() first");
        return null;
    }

    @Override // 
    @CheckResult
    /* JADX INFO: renamed from: c */
    public T clone() {
        try {
            T t = (T) super.clone();
            u560 u560Var = new u560();
            t.f133277q = u560Var;
            u560Var.m194543d(this.f133277q);
            jy3 jy3Var = new jy3();
            t.f133278r = jy3Var;
            jy3Var.putAll(this.f133278r);
            t.f133280t = false;
            t.f133282v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c0 */
    public final T m155547c0() {
        if (!this.f133280t) {
            return (T) m155526b0();
        }
        wtq0.m207906a("You cannot modify locked T, consider clone()");
        return null;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d */
    public T m155548d(@NonNull Class<?> cls) {
        if (this.f133282v) {
            return (T) clone().m155548d(cls);
        }
        this.f133279s = (Class) vn80.m201944d(cls);
        this.f133261a |= 4096;
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: d0 */
    public <Y> T m155549d0(@NonNull q560<Y> q560Var, @NonNull Y y) {
        if (this.f133282v) {
            return (T) clone().m155549d0(q560Var, y);
        }
        vn80.m201944d(q560Var);
        vn80.m201944d(y);
        this.f133277q.m194544e(q560Var, y);
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: e */
    public T m155550e(@NonNull d4e d4eVar) {
        if (this.f133282v) {
            return (T) clone().m155550e(d4eVar);
        }
        this.f133263c = (d4e) vn80.m201944d(d4eVar);
        this.f133261a |= 4;
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: e0 */
    public T m155551e0(@NonNull kzq kzqVar) {
        if (this.f133282v) {
            return (T) clone().m155551e0(kzqVar);
        }
        this.f133272l = (kzq) vn80.m201944d(kzqVar);
        this.f133261a |= 1024;
        return (T) m155547c0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof lr2) {
            lr2 lr2Var = (lr2) obj;
            if (Float.compare(lr2Var.f133262b, this.f133262b) == 0 && this.f133266f == lr2Var.f133266f && ylk0.m216580d(this.f133265e, lr2Var.f133265e) && this.f133268h == lr2Var.f133268h && ylk0.m216580d(this.f133267g, lr2Var.f133267g) && this.f133276p == lr2Var.f133276p && ylk0.m216580d(this.f133275o, lr2Var.f133275o) && this.f133269i == lr2Var.f133269i && this.f133270j == lr2Var.f133270j && this.f133271k == lr2Var.f133271k && this.f133273m == lr2Var.f133273m && this.f133274n == lr2Var.f133274n && this.f133283w == lr2Var.f133283w && this.f133284x == lr2Var.f133284x && this.f133263c.equals(lr2Var.f133263c) && this.f133264d == lr2Var.f133264d && this.f133277q.equals(lr2Var.f133277q) && this.f133278r.equals(lr2Var.f133278r) && this.f133279s.equals(lr2Var.f133279s) && ylk0.m216580d(this.f133272l, lr2Var.f133272l) && ylk0.m216580d(this.f133281u, lr2Var.f133281u)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f */
    public T m155552f(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) m155549d0(DownsampleStrategy.f4608h, vn80.m201944d(downsampleStrategy));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: f0 */
    public T m155553f0(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (this.f133282v) {
            return (T) clone().m155553f0(f);
        }
        if (f < 0.0f || f > 1.0f) {
            wg3.m206174a("sizeMultiplier must be between 0 and 1");
            return null;
        }
        this.f133262b = f;
        this.f133261a |= 2;
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: g0 */
    public T m155554g0(boolean z) {
        if (this.f133282v) {
            return (T) clone().m155554g0(true);
        }
        this.f133269i = !z;
        this.f133261a |= 256;
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: h0 */
    public final T m155555h0(@NonNull DownsampleStrategy downsampleStrategy, @NonNull tgj0<Bitmap> tgj0Var) {
        if (this.f133282v) {
            return (T) clone().m155555h0(downsampleStrategy, tgj0Var);
        }
        m155552f(downsampleStrategy);
        return (T) m155558j0(tgj0Var);
    }

    public int hashCode() {
        return ylk0.m216592p(this.f133281u, ylk0.m216592p(this.f133272l, ylk0.m216592p(this.f133279s, ylk0.m216592p(this.f133278r, ylk0.m216592p(this.f133277q, ylk0.m216592p(this.f133264d, ylk0.m216592p(this.f133263c, ylk0.m216593q(this.f133284x, ylk0.m216593q(this.f133283w, ylk0.m216593q(this.f133274n, ylk0.m216593q(this.f133273m, ylk0.m216591o(this.f133271k, ylk0.m216591o(this.f133270j, ylk0.m216593q(this.f133269i, ylk0.m216592p(this.f133275o, ylk0.m216591o(this.f133276p, ylk0.m216592p(this.f133267g, ylk0.m216591o(this.f133268h, ylk0.m216592p(this.f133265e, ylk0.m216591o(this.f133266f, ylk0.m216588l(this.f133262b)))))))))))))))))))));
    }

    @NonNull
    /* JADX INFO: renamed from: i0 */
    public <Y> T m155556i0(@NonNull Class<Y> cls, @NonNull tgj0<Y> tgj0Var, boolean z) {
        if (this.f133282v) {
            return (T) clone().m155556i0(cls, tgj0Var, z);
        }
        vn80.m201944d(cls);
        vn80.m201944d(tgj0Var);
        this.f133278r.put(cls, tgj0Var);
        int i = this.f133261a;
        this.f133274n = true;
        this.f133261a = 67584 | i;
        this.f133285y = false;
        if (z) {
            this.f133261a = i | 198656;
            this.f133273m = true;
        }
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j */
    public T m155557j(@DrawableRes int i) {
        if (this.f133282v) {
            return (T) clone().m155557j(i);
        }
        this.f133266f = i;
        int i2 = this.f133261a | 32;
        this.f133265e = null;
        this.f133261a = i2 & (-17);
        return (T) m155547c0();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: j0 */
    public T m155558j0(@NonNull tgj0<Bitmap> tgj0Var) {
        return (T) m155560k0(tgj0Var, true);
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public final d4e m155559k() {
        return this.f133263c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: k0 */
    public T m155560k0(@NonNull tgj0<Bitmap> tgj0Var, boolean z) {
        if (this.f133282v) {
            return (T) clone().m155560k0(tgj0Var, z);
        }
        yce yceVar = new yce(tgj0Var, z);
        m155556i0(Bitmap.class, tgj0Var, z);
        m155556i0(Drawable.class, yceVar, z);
        m155556i0(BitmapDrawable.class, yceVar.m215146c(), z);
        m155556i0(bnj.class, new fnj(tgj0Var), z);
        return (T) m155547c0();
    }

    /* JADX INFO: renamed from: l */
    public final int m155561l() {
        return this.f133266f;
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: l0 */
    public T m155562l0(boolean z) {
        if (this.f133282v) {
            return (T) clone().m155562l0(z);
        }
        this.f133286z = z;
        this.f133261a |= 1048576;
        return (T) m155547c0();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Drawable m155563m() {
        return this.f133265e;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final Drawable m155564n() {
        return this.f133275o;
    }

    /* JADX INFO: renamed from: o */
    public final int m155565o() {
        return this.f133276p;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m155566p() {
        return this.f133284x;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public final u560 m155567q() {
        return this.f133277q;
    }

    /* JADX INFO: renamed from: r */
    public final int m155568r() {
        return this.f133270j;
    }

    /* JADX INFO: renamed from: s */
    public final int m155569s() {
        return this.f133271k;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Drawable m155570t() {
        return this.f133267g;
    }

    /* JADX INFO: renamed from: u */
    public final int m155571u() {
        return this.f133268h;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public final Priority m155572v() {
        return this.f133264d;
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public final Class<?> m155573w() {
        return this.f133279s;
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public final kzq m155574x() {
        return this.f133272l;
    }

    /* JADX INFO: renamed from: y */
    public final float m155575y() {
        return this.f133262b;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final Resources.Theme m155576z() {
        return this.f133281u;
    }

    /* JADX INFO: renamed from: b0 */
    private T m155526b0() {
        return this;
    }
}
