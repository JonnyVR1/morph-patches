package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import android.view.Choreographer;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p153l.fxi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.e */
/* JADX INFO: loaded from: classes4.dex */
public class ChoreographerFrameCallbackC8745e implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: p */
    public static int f33092p = 0;

    /* JADX INFO: renamed from: q */
    public static int f33093q = 1;

    /* JADX INFO: renamed from: r */
    public static int f33094r = 2;

    /* JADX INFO: renamed from: a */
    public boolean f33095a;

    /* JADX INFO: renamed from: b */
    public int f33096b;

    /* JADX INFO: renamed from: c */
    public int f33097c;

    /* JADX INFO: renamed from: d */
    public int f33098d;

    /* JADX INFO: renamed from: e */
    public int f33099e;

    /* JADX INFO: renamed from: f */
    public long f33100f;

    /* JADX INFO: renamed from: h */
    public long f33102h;

    /* JADX INFO: renamed from: i */
    public WeakReference<a> f33103i;

    /* JADX INFO: renamed from: k */
    public int f33105k;

    /* JADX INFO: renamed from: l */
    public long f33106l;

    /* JADX INFO: renamed from: m */
    public int f33107m;

    /* JADX INFO: renamed from: g */
    public float f33101g = 0.0f;

    /* JADX INFO: renamed from: j */
    public boolean f33104j = false;

    /* JADX INFO: renamed from: n */
    public AccelerateDecelerateInterpolator f33108n = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: o */
    public DecelerateInterpolator f33109o = new DecelerateInterpolator(1.7f);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void mo50811a() {
        }

        /* JADX INFO: renamed from: b */
        default void mo50812b(boolean z) {
        }

        /* JADX INFO: renamed from: c */
        default void mo50813c(int i, float f, int i2, int i3, boolean z) {
        }

        /* JADX INFO: renamed from: f */
        default void mo50879f() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m50906a(float f) {
        return this.f33099e != 0 ? this.f33109o.getInterpolation(f) : (float) (1.0d - Math.pow(1.0f - f, 4.0d));
    }

    /* JADX INFO: renamed from: b */
    public void m50907b() {
        fxi0.m127981a();
        this.f33104j = false;
        m50915j();
        Choreographer.getInstance().removeFrameCallback(this);
        if (m50912g()) {
            this.f33103i.get().mo50879f();
            this.f33103i.get().mo50812b(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m50908c() {
        this.f33100f = this.f33106l * 1000000;
        this.f33096b = this.f33105k;
        this.f33099e = this.f33107m;
        if (this.f33104j) {
            this.f33097c = 0;
        } else {
            this.f33097c = 0;
        }
        this.f33098d = 0;
        this.f33101g = 0.0f;
        this.f33095a = false;
        this.f33102h = System.nanoTime();
    }

    /* JADX INFO: renamed from: d */
    public boolean m50909d() {
        return this.f33099e == 2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f33095a) {
            return;
        }
        if (j > this.f33102h + this.f33100f) {
            this.f33095a = true;
            a aVar = this.f33103i.get();
            if (aVar != null) {
                int i = this.f33096b;
                int i2 = i - this.f33098d;
                this.f33098d = i;
                this.f33101g = 100.0f;
                aVar.mo50813c(i, 100.0f, i2, this.f33099e, false);
                aVar.mo50812b(false);
                this.f33099e = 1;
                return;
            }
            return;
        }
        a aVar2 = this.f33103i.get();
        if (aVar2 != null) {
            float f = (float) ((j - this.f33102h) / this.f33100f);
            this.f33101g = f;
            if (f < 0.0f) {
                this.f33101g = 0.0f;
            } else if (f > 1.0f) {
                this.f33101g = 1.0f;
            }
            float fM50906a = m50906a(this.f33101g);
            this.f33101g = fM50906a;
            int i3 = (int) (this.f33096b * fM50906a);
            int i4 = i3 - this.f33098d;
            this.f33098d = i3;
            aVar2.mo50813c(i3, fM50906a, i4, this.f33099e, false);
            if (this.f33095a) {
                return;
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m50910e() {
        return m50909d() && m50911f();
    }

    /* JADX INFO: renamed from: f */
    public boolean m50911f() {
        return this.f33104j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m50912g() {
        WeakReference<a> weakReference = this.f33103i;
        if (weakReference != null) {
            weakReference.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m50913h(a aVar) {
        this.f33103i = new WeakReference<>(aVar);
    }

    /* JADX INFO: renamed from: i */
    public ChoreographerFrameCallbackC8745e m50914i(long j) {
        this.f33106l = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m50915j() {
        this.f33095a = true;
        int i = this.f33096b;
        int i2 = i - this.f33098d;
        this.f33098d = i;
        this.f33099e = 1;
        this.f33101g = 100.0f;
        if (m50912g()) {
            this.f33103i.get().mo50813c(this.f33096b, 100.0f, i2, this.f33099e, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public ChoreographerFrameCallbackC8745e m50916k(int i, int i2) {
        this.f33105k = i;
        this.f33107m = i2;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m50917l() {
        fxi0.m127981a();
        this.f33104j = true;
        m50908c();
        a aVar = this.f33103i.get();
        if (NullChecker.m82486a(aVar)) {
            aVar.mo50811a();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }
}
