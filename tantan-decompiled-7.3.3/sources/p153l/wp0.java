package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class wp0 extends Drawable implements Animatable, hde {

    /* JADX INFO: renamed from: r */
    public static final Class<?> f190211r = wp0.class;

    /* JADX INFO: renamed from: s */
    public static final lr0 f190212s = new ye2();

    /* JADX INFO: renamed from: a */
    public yq0 f190213a;

    /* JADX INFO: renamed from: b */
    public u7j f190214b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f190215c;

    /* JADX INFO: renamed from: d */
    public long f190216d;

    /* JADX INFO: renamed from: e */
    public long f190217e;

    /* JADX INFO: renamed from: f */
    public long f190218f;

    /* JADX INFO: renamed from: g */
    public int f190219g;

    /* JADX INFO: renamed from: h */
    public long f190220h;

    /* JADX INFO: renamed from: i */
    public long f190221i;

    /* JADX INFO: renamed from: j */
    public int f190222j;

    /* JADX INFO: renamed from: k */
    public long f190223k;

    /* JADX INFO: renamed from: l */
    public long f190224l;

    /* JADX INFO: renamed from: m */
    public int f190225m;

    /* JADX INFO: renamed from: n */
    public volatile lr0 f190226n;

    /* JADX INFO: renamed from: o */
    public final yq0.InterfaceC21665a f190227o;

    /* JADX INFO: renamed from: p */
    public vce f190228p;

    /* JADX INFO: renamed from: q */
    public final Runnable f190229q;

    /* JADX INFO: renamed from: l.wp0$a */
    public class RunnableC21160a implements Runnable {
        public RunnableC21160a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wp0 wp0Var = wp0.this;
            wp0Var.unscheduleSelf(wp0Var.f190229q);
            wp0.this.invalidateSelf();
        }
    }

    public wp0(yq0 yq0Var) {
        this.f190223k = 8L;
        this.f190224l = 0L;
        this.f190226n = f190212s;
        yq0.InterfaceC21665a interfaceC21665a = new yq0.InterfaceC21665a() { // from class: l.vp0
        };
        this.f190227o = interfaceC21665a;
        this.f190229q = new RunnableC21160a();
        this.f190213a = yq0Var;
        this.f190214b = m207389c(yq0Var);
        if (yq0Var != null) {
            yq0Var.mo143071e(interfaceC21665a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static u7j m207389c(yq0 yq0Var) {
        if (yq0Var == null) {
            return null;
        }
        return new mfe(yq0Var);
    }

    @Override // p153l.hde
    /* JADX INFO: renamed from: a */
    public void mo134586a() {
        yq0 yq0Var = this.f190213a;
        if (yq0Var != null) {
            yq0Var.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public yq0 m207390d() {
        return this.f190213a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f190213a == null || this.f190214b == null) {
            return;
        }
        long jM207392f = m207392f();
        long jMax = this.f190215c ? (jM207392f - this.f190216d) + this.f190224l : Math.max(this.f190217e, 0L);
        int iMo158167b = this.f190214b.mo158167b(jMax, this.f190217e);
        if (iMo158167b == -1) {
            iMo158167b = this.f190213a.getFrameCount() - 1;
            this.f190226n.mo155514b(this);
            this.f190215c = false;
        } else if (iMo158167b == 0 && this.f190219g != -1 && jM207392f >= this.f190218f) {
            this.f190226n.onAnimationRepeat(this);
        }
        boolean zMo99580i = this.f190213a.mo99580i(this, canvas, iMo158167b);
        if (zMo99580i) {
            this.f190226n.mo77568a(this, iMo158167b);
            this.f190219g = iMo158167b;
        }
        if (!zMo99580i) {
            m207393g();
        }
        long jM207392f2 = m207392f();
        if (this.f190215c) {
            long jMo158166a = this.f190214b.mo158166a(jM207392f2 - this.f190216d);
            if (jMo158166a != -1) {
                m207394h(jMo158166a + this.f190223k);
            } else {
                this.f190226n.mo155514b(this);
                this.f190215c = false;
            }
        }
        this.f190217e = jMax;
    }

    /* JADX INFO: renamed from: e */
    public int m207391e() {
        yq0 yq0Var = this.f190213a;
        if (yq0Var == null) {
            return 0;
        }
        return yq0Var.getFrameCount();
    }

    /* JADX INFO: renamed from: f */
    public final long m207392f() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: g */
    public final void m207393g() {
        this.f190225m++;
        if (huf.m137185m(2)) {
            huf.m137187o(f190211r, "Dropped a frame. Count: %s", Integer.valueOf(this.f190225m));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        yq0 yq0Var = this.f190213a;
        return yq0Var == null ? super.getIntrinsicHeight() : yq0Var.mo143068b();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        yq0 yq0Var = this.f190213a;
        return yq0Var == null ? super.getIntrinsicWidth() : yq0Var.mo143067a();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m207394h(long j) {
        long j2 = this.f190216d + j;
        this.f190218f = j2;
        scheduleSelf(this.f190229q, j2);
    }

    /* JADX INFO: renamed from: i */
    public void m207395i(yq0 yq0Var) {
        yq0 yq0Var2 = this.f190213a;
        if (yq0Var2 != null) {
            yq0Var2.mo143071e(null);
        }
        this.f190213a = yq0Var;
        if (yq0Var != null) {
            this.f190214b = new mfe(this.f190213a);
            this.f190213a.mo143071e(this.f190227o);
            this.f190213a.mo143069c(getBounds());
            vce vceVar = this.f190228p;
            if (vceVar != null) {
                vceVar.m200797a(this);
            }
        }
        this.f190214b = m207389c(this.f190213a);
        stop();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f190215c;
    }

    /* JADX INFO: renamed from: j */
    public void m207396j(lr0 lr0Var) {
        if (lr0Var == null) {
            lr0Var = f190212s;
        }
        this.f190226n = lr0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        yq0 yq0Var = this.f190213a;
        if (yq0Var != null) {
            yq0Var.mo143069c(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.f190215c) {
            return false;
        }
        long j = i;
        if (this.f190217e == j) {
            return false;
        }
        this.f190217e = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f190228p == null) {
            this.f190228p = new vce();
        }
        this.f190228p.m200798b(i);
        yq0 yq0Var = this.f190213a;
        if (yq0Var != null) {
            yq0Var.mo143074h(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f190228p == null) {
            this.f190228p = new vce();
        }
        this.f190228p.m200799c(colorFilter);
        yq0 yq0Var = this.f190213a;
        if (yq0Var != null) {
            yq0Var.mo143070d(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        yq0 yq0Var;
        if (this.f190215c || (yq0Var = this.f190213a) == null || yq0Var.getFrameCount() <= 1) {
            return;
        }
        this.f190215c = true;
        long jM207392f = m207392f();
        long j = jM207392f - this.f190220h;
        this.f190216d = j;
        this.f190218f = j;
        this.f190217e = jM207392f - this.f190221i;
        this.f190219g = this.f190222j;
        invalidateSelf();
        this.f190226n.onAnimationStart(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f190215c) {
            long jM207392f = m207392f();
            this.f190220h = jM207392f - this.f190216d;
            this.f190221i = jM207392f - this.f190217e;
            this.f190222j = this.f190219g;
            this.f190215c = false;
            this.f190216d = 0L;
            this.f190218f = 0L;
            this.f190217e = -1L;
            this.f190219g = -1;
            unscheduleSelf(this.f190229q);
            this.f190226n.mo155514b(this);
        }
    }

    public wp0() {
        this(null);
    }
}
