package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import android.view.Choreographer;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p002l.eoi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.e */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ChoreographerFrameCallbackC0007e implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: p */
    public static int f66p = 0;

    /* JADX INFO: renamed from: q */
    public static int f67q = 1;

    /* JADX INFO: renamed from: r */
    public static int f68r = 2;

    /* JADX INFO: renamed from: a */
    public boolean f69a;

    /* JADX INFO: renamed from: b */
    public int f70b;

    /* JADX INFO: renamed from: c */
    public int f71c;

    /* JADX INFO: renamed from: d */
    public int f72d;

    /* JADX INFO: renamed from: e */
    public int f73e;

    /* JADX INFO: renamed from: f */
    public long f74f;

    /* JADX INFO: renamed from: h */
    public long f76h;

    /* JADX INFO: renamed from: i */
    public WeakReference<a> f77i;

    /* JADX INFO: renamed from: k */
    public int f79k;

    /* JADX INFO: renamed from: l */
    public long f80l;

    /* JADX INFO: renamed from: m */
    public int f81m;

    /* JADX INFO: renamed from: g */
    public float f75g = 0.0f;

    /* JADX INFO: renamed from: j */
    public boolean f78j = false;

    /* JADX INFO: renamed from: n */
    public AccelerateDecelerateInterpolator f82n = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: o */
    public DecelerateInterpolator f83o = new DecelerateInterpolator(1.7f);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void mo42a() {
        }

        /* JADX INFO: renamed from: b */
        default void mo43b(boolean z) {
        }

        /* JADX INFO: renamed from: c */
        default void mo44c(int i, float f, int i2, int i3, boolean z) {
        }

        /* JADX INFO: renamed from: f */
        default void mo110f() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m137a(float f) {
        return this.f73e != 0 ? this.f83o.getInterpolation(f) : (float) (1.0d - Math.pow(1.0f - f, 4.0d));
    }

    /* JADX INFO: renamed from: b */
    public void m138b() {
        eoi0.m12628a();
        this.f78j = false;
        m146j();
        Choreographer.getInstance().removeFrameCallback(this);
        if (m143g()) {
            this.f77i.get().mo110f();
            this.f77i.get().mo43b(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m139c() {
        this.f74f = this.f80l * 1000000;
        this.f70b = this.f79k;
        this.f73e = this.f81m;
        if (this.f78j) {
            this.f71c = 0;
        } else {
            this.f71c = 0;
        }
        this.f72d = 0;
        this.f75g = 0.0f;
        this.f69a = false;
        this.f76h = System.nanoTime();
    }

    /* JADX INFO: renamed from: d */
    public boolean m140d() {
        return this.f73e == 2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f69a) {
            return;
        }
        if (j > this.f76h + this.f74f) {
            this.f69a = true;
            a aVar = this.f77i.get();
            if (aVar != null) {
                int i = this.f70b;
                int i2 = i - this.f72d;
                this.f72d = i;
                this.f75g = 100.0f;
                aVar.mo44c(i, 100.0f, i2, this.f73e, false);
                aVar.mo43b(false);
                this.f73e = 1;
                return;
            }
            return;
        }
        a aVar2 = this.f77i.get();
        if (aVar2 != null) {
            float f = (float) ((j - this.f76h) / this.f74f);
            this.f75g = f;
            if (f < 0.0f) {
                this.f75g = 0.0f;
            } else if (f > 1.0f) {
                this.f75g = 1.0f;
            }
            float fM137a = m137a(this.f75g);
            this.f75g = fM137a;
            int i3 = (int) (this.f70b * fM137a);
            int i4 = i3 - this.f72d;
            this.f72d = i3;
            aVar2.mo44c(i3, fM137a, i4, this.f73e, false);
            if (this.f69a) {
                return;
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m141e() {
        return m140d() && m142f();
    }

    /* JADX INFO: renamed from: f */
    public boolean m142f() {
        return this.f78j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m143g() {
        WeakReference<a> weakReference = this.f77i;
        if (weakReference != null) {
            weakReference.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m144h(a aVar) {
        this.f77i = new WeakReference<>(aVar);
    }

    /* JADX INFO: renamed from: i */
    public ChoreographerFrameCallbackC0007e m145i(long j) {
        this.f80l = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m146j() {
        this.f69a = true;
        int i = this.f70b;
        int i2 = i - this.f72d;
        this.f72d = i;
        this.f73e = 1;
        this.f75g = 100.0f;
        if (m143g()) {
            this.f77i.get().mo44c(this.f70b, 100.0f, i2, this.f73e, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public ChoreographerFrameCallbackC0007e m147k(int i, int i2) {
        this.f79k = i;
        this.f81m = i2;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m148l() {
        eoi0.m12628a();
        this.f78j = true;
        m139c();
        a aVar = this.f77i.get();
        if (NullChecker.a(aVar)) {
            aVar.mo42a();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }
}
