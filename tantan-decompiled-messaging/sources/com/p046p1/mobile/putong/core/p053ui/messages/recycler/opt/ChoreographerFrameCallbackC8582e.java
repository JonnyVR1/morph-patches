package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

import android.view.Choreographer;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p149l.eoi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.e */
/* JADX INFO: loaded from: classes4.dex */
public class ChoreographerFrameCallbackC8582e implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: p */
    public static int f32244p = 0;

    /* JADX INFO: renamed from: q */
    public static int f32245q = 1;

    /* JADX INFO: renamed from: r */
    public static int f32246r = 2;

    /* JADX INFO: renamed from: a */
    public boolean f32247a;

    /* JADX INFO: renamed from: b */
    public int f32248b;

    /* JADX INFO: renamed from: c */
    public int f32249c;

    /* JADX INFO: renamed from: d */
    public int f32250d;

    /* JADX INFO: renamed from: e */
    public int f32251e;

    /* JADX INFO: renamed from: f */
    public long f32252f;

    /* JADX INFO: renamed from: h */
    public long f32254h;

    /* JADX INFO: renamed from: i */
    public WeakReference<a> f32255i;

    /* JADX INFO: renamed from: k */
    public int f32257k;

    /* JADX INFO: renamed from: l */
    public long f32258l;

    /* JADX INFO: renamed from: m */
    public int f32259m;

    /* JADX INFO: renamed from: g */
    public float f32253g = 0.0f;

    /* JADX INFO: renamed from: j */
    public boolean f32256j = false;

    /* JADX INFO: renamed from: n */
    public AccelerateDecelerateInterpolator f32260n = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: o */
    public DecelerateInterpolator f32261o = new DecelerateInterpolator(1.7f);

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        default void mo49628a() {
        }

        /* JADX INFO: renamed from: b */
        default void mo49629b(boolean z) {
        }

        /* JADX INFO: renamed from: c */
        default void mo49630c(int i, float f, int i2, int i3, boolean z) {
        }

        /* JADX INFO: renamed from: f */
        default void mo49696f() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m49723a(float f) {
        return this.f32251e != 0 ? this.f32261o.getInterpolation(f) : (float) (1.0d - Math.pow(1.0f - f, 4.0d));
    }

    /* JADX INFO: renamed from: b */
    public void m49724b() {
        eoi0.m117340a();
        this.f32256j = false;
        m49732j();
        Choreographer.getInstance().removeFrameCallback(this);
        if (m49729g()) {
            this.f32255i.get().mo49696f();
            this.f32255i.get().mo49629b(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m49725c() {
        this.f32252f = this.f32258l * 1000000;
        this.f32248b = this.f32257k;
        this.f32251e = this.f32259m;
        if (this.f32256j) {
            this.f32249c = 0;
        } else {
            this.f32249c = 0;
        }
        this.f32250d = 0;
        this.f32253g = 0.0f;
        this.f32247a = false;
        this.f32254h = System.nanoTime();
    }

    /* JADX INFO: renamed from: d */
    public boolean m49726d() {
        return this.f32251e == 2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f32247a) {
            return;
        }
        if (j > this.f32254h + this.f32252f) {
            this.f32247a = true;
            a aVar = this.f32255i.get();
            if (aVar != null) {
                int i = this.f32248b;
                int i2 = i - this.f32250d;
                this.f32250d = i;
                this.f32253g = 100.0f;
                aVar.mo49630c(i, 100.0f, i2, this.f32251e, false);
                aVar.mo49629b(false);
                this.f32251e = 1;
                return;
            }
            return;
        }
        a aVar2 = this.f32255i.get();
        if (aVar2 != null) {
            float f = (float) ((j - this.f32254h) / this.f32252f);
            this.f32253g = f;
            if (f < 0.0f) {
                this.f32253g = 0.0f;
            } else if (f > 1.0f) {
                this.f32253g = 1.0f;
            }
            float fM49723a = m49723a(this.f32253g);
            this.f32253g = fM49723a;
            int i3 = (int) (this.f32248b * fM49723a);
            int i4 = i3 - this.f32250d;
            this.f32250d = i3;
            aVar2.mo49630c(i3, fM49723a, i4, this.f32251e, false);
            if (this.f32247a) {
                return;
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m49727e() {
        return m49726d() && m49728f();
    }

    /* JADX INFO: renamed from: f */
    public boolean m49728f() {
        return this.f32256j;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m49729g() {
        WeakReference<a> weakReference = this.f32255i;
        if (weakReference != null) {
            weakReference.get();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m49730h(a aVar) {
        this.f32255i = new WeakReference<>(aVar);
    }

    /* JADX INFO: renamed from: i */
    public ChoreographerFrameCallbackC8582e m49731i(long j) {
        this.f32258l = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m49732j() {
        this.f32247a = true;
        int i = this.f32248b;
        int i2 = i - this.f32250d;
        this.f32250d = i;
        this.f32251e = 1;
        this.f32253g = 100.0f;
        if (m49729g()) {
            this.f32255i.get().mo49630c(this.f32248b, 100.0f, i2, this.f32251e, true);
        }
    }

    /* JADX INFO: renamed from: k */
    public ChoreographerFrameCallbackC8582e m49733k(int i, int i2) {
        this.f32257k = i;
        this.f32259m = i2;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void m49734l() {
        eoi0.m117340a();
        this.f32256j = true;
        m49725c();
        a aVar = this.f32255i.get();
        if (NullChecker.m81303a(aVar)) {
            aVar.mo49628a();
        }
        Choreographer.getInstance().postFrameCallback(this);
    }
}
