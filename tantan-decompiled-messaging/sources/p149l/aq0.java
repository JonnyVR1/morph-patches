package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class aq0 extends Drawable implements Animatable, dce {

    /* JADX INFO: renamed from: r */
    public static final Class<?> f71097r = aq0.class;

    /* JADX INFO: renamed from: s */
    public static final hr0 f71098s = new qe2();

    /* JADX INFO: renamed from: a */
    public uq0 f71099a;

    /* JADX INFO: renamed from: b */
    public z4j f71100b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f71101c;

    /* JADX INFO: renamed from: d */
    public long f71102d;

    /* JADX INFO: renamed from: e */
    public long f71103e;

    /* JADX INFO: renamed from: f */
    public long f71104f;

    /* JADX INFO: renamed from: g */
    public int f71105g;

    /* JADX INFO: renamed from: h */
    public long f71106h;

    /* JADX INFO: renamed from: i */
    public long f71107i;

    /* JADX INFO: renamed from: j */
    public int f71108j;

    /* JADX INFO: renamed from: k */
    public long f71109k;

    /* JADX INFO: renamed from: l */
    public long f71110l;

    /* JADX INFO: renamed from: m */
    public int f71111m;

    /* JADX INFO: renamed from: n */
    public volatile hr0 f71112n;

    /* JADX INFO: renamed from: o */
    public final uq0.InterfaceC20483a f71113o;

    /* JADX INFO: renamed from: p */
    public rbe f71114p;

    /* JADX INFO: renamed from: q */
    public final Runnable f71115q;

    /* JADX INFO: renamed from: l.aq0$a */
    public class RunnableC15691a implements Runnable {
        public RunnableC15691a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            aq0 aq0Var = aq0.this;
            aq0Var.unscheduleSelf(aq0Var.f71115q);
            aq0.this.invalidateSelf();
        }
    }

    public aq0(uq0 uq0Var) {
        this.f71109k = 8L;
        this.f71110l = 0L;
        this.f71112n = f71098s;
        uq0.InterfaceC20483a interfaceC20483a = new uq0.InterfaceC20483a() { // from class: l.zp0
        };
        this.f71113o = interfaceC20483a;
        this.f71115q = new RunnableC15691a();
        this.f71099a = uq0Var;
        this.f71100b = m98206c(uq0Var);
        if (uq0Var != null) {
            uq0Var.mo191273e(interfaceC20483a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static z4j m98206c(uq0 uq0Var) {
        if (uq0Var == null) {
            return null;
        }
        return new iee(uq0Var);
    }

    @Override // p149l.dce
    /* JADX INFO: renamed from: a */
    public void mo98207a() {
        uq0 uq0Var = this.f71099a;
        if (uq0Var != null) {
            uq0Var.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public uq0 m98208d() {
        return this.f71099a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f71099a == null || this.f71100b == null) {
            return;
        }
        long jM98210f = m98210f();
        long jMax = this.f71101c ? (jM98210f - this.f71102d) + this.f71110l : Math.max(this.f71103e, 0L);
        int iMo135670b = this.f71100b.mo135670b(jMax, this.f71103e);
        if (iMo135670b == -1) {
            iMo135670b = this.f71099a.getFrameCount() - 1;
            this.f71112n.mo132610b(this);
            this.f71101c = false;
        } else if (iMo135670b == 0 && this.f71105g != -1 && jM98210f >= this.f71104f) {
            this.f71112n.onAnimationRepeat(this);
        }
        boolean zMo191275i = this.f71099a.mo191275i(this, canvas, iMo135670b);
        if (zMo191275i) {
            this.f71112n.mo76385a(this, iMo135670b);
            this.f71105g = iMo135670b;
        }
        if (!zMo191275i) {
            m98211g();
        }
        long jM98210f2 = m98210f();
        if (this.f71101c) {
            long jMo135669a = this.f71100b.mo135669a(jM98210f2 - this.f71102d);
            if (jMo135669a != -1) {
                m98212h(jMo135669a + this.f71109k);
            } else {
                this.f71112n.mo132610b(this);
                this.f71101c = false;
            }
        }
        this.f71103e = jMax;
    }

    /* JADX INFO: renamed from: e */
    public int m98209e() {
        uq0 uq0Var = this.f71099a;
        if (uq0Var == null) {
            return 0;
        }
        return uq0Var.getFrameCount();
    }

    /* JADX INFO: renamed from: f */
    public final long m98210f() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: g */
    public final void m98211g() {
        this.f71111m++;
        if (tsf.m190547m(2)) {
            tsf.m190549o(f71097r, "Dropped a frame. Count: %s", Integer.valueOf(this.f71111m));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        uq0 uq0Var = this.f71099a;
        return uq0Var == null ? super.getIntrinsicHeight() : uq0Var.mo191270b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        uq0 uq0Var = this.f71099a;
        return uq0Var == null ? super.getIntrinsicWidth() : uq0Var.mo191269a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m98212h(long j) {
        long j2 = this.f71102d + j;
        this.f71104f = j2;
        scheduleSelf(this.f71115q, j2);
    }

    /* JADX INFO: renamed from: i */
    public void m98213i(uq0 uq0Var) {
        uq0 uq0Var2 = this.f71099a;
        if (uq0Var2 != null) {
            uq0Var2.mo191273e(null);
        }
        this.f71099a = uq0Var;
        if (uq0Var != null) {
            this.f71100b = new iee(this.f71099a);
            this.f71099a.mo191273e(this.f71113o);
            this.f71099a.mo191271c(getBounds());
            rbe rbeVar = this.f71114p;
            if (rbeVar != null) {
                rbeVar.m178595a(this);
            }
        }
        this.f71100b = m98206c(this.f71099a);
        stop();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f71101c;
    }

    /* JADX INFO: renamed from: j */
    public void m98214j(hr0 hr0Var) {
        if (hr0Var == null) {
            hr0Var = f71098s;
        }
        this.f71112n = hr0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        uq0 uq0Var = this.f71099a;
        if (uq0Var != null) {
            uq0Var.mo191271c(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.f71101c) {
            return false;
        }
        long j = i;
        if (this.f71103e == j) {
            return false;
        }
        this.f71103e = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f71114p == null) {
            this.f71114p = new rbe();
        }
        this.f71114p.m178596b(i);
        uq0 uq0Var = this.f71099a;
        if (uq0Var != null) {
            uq0Var.mo191274h(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f71114p == null) {
            this.f71114p = new rbe();
        }
        this.f71114p.m178597c(colorFilter);
        uq0 uq0Var = this.f71099a;
        if (uq0Var != null) {
            uq0Var.mo191272d(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        uq0 uq0Var;
        if (this.f71101c || (uq0Var = this.f71099a) == null || uq0Var.getFrameCount() <= 1) {
            return;
        }
        this.f71101c = true;
        long jM98210f = m98210f();
        long j = jM98210f - this.f71106h;
        this.f71102d = j;
        this.f71104f = j;
        this.f71103e = jM98210f - this.f71107i;
        this.f71105g = this.f71108j;
        invalidateSelf();
        this.f71112n.onAnimationStart(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f71101c) {
            long jM98210f = m98210f();
            this.f71106h = jM98210f - this.f71102d;
            this.f71107i = jM98210f - this.f71103e;
            this.f71108j = this.f71105g;
            this.f71101c = false;
            this.f71102d = 0L;
            this.f71104f = 0L;
            this.f71103e = -1L;
            this.f71105g = -1;
            unscheduleSelf(this.f71115q);
            this.f71112n.mo132610b(this);
        }
    }

    public aq0() {
        this(null);
    }
}
