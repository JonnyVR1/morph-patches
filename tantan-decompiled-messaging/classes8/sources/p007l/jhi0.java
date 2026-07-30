package p007l;

import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jhi0 {

    /* JADX INFO: renamed from: a */
    public float f2987a;

    /* JADX INFO: renamed from: b */
    public float f2988b;

    /* JADX INFO: renamed from: c */
    public C0577a f2989c;

    /* JADX INFO: renamed from: d */
    public C0577a f2990d;

    /* JADX INFO: renamed from: e */
    public Interpolator f2991e = new DecelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: f */
    public float f2992f;

    /* JADX INFO: renamed from: g */
    public float f2993g;

    /* JADX INFO: renamed from: l.jhi0$a */
    public static class C0577a {

        /* JADX INFO: renamed from: a */
        public float f2994a;

        /* JADX INFO: renamed from: b */
        public float f2995b;

        public C0577a(float f, float f2) {
            this.f2994a = Math.max(f, 0.0f);
            this.f2995b = Math.max(f2, 0.0f);
        }

        /* JADX INFO: renamed from: a */
        public float m9538a() {
            return this.f2994a;
        }

        /* JADX INFO: renamed from: b */
        public float m9539b() {
            return this.f2995b;
        }

        public String toString() {
            return "TensionBorder{negativeTensionStart=" + this.f2994a + ", positiveTensionStart=" + this.f2995b + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m9534a(float f, C0577a c0577a) {
        float fAbs = Math.abs(f);
        float f2 = f >= 0.0f ? 1.0f : -1.0f;
        float fM9539b = f2 == 1.0f ? c0577a.m9539b() : c0577a.m9538a();
        if (fAbs < fM9539b) {
            return f;
        }
        float f3 = fAbs - fM9539b;
        float f4 = this.f2987a + fM9539b;
        float f5 = this.f2988b;
        if (fAbs >= f5 + fM9539b) {
            return f4 * f2;
        }
        return (fM9539b + (this.f2991e.getInterpolation(f3 / f5) * this.f2987a)) * f2;
    }

    /* JADX INFO: renamed from: b */
    public float m9535b(float f) {
        float f2 = this.f2992f;
        return f2 + m9534a(f - f2, this.f2990d);
    }

    /* JADX INFO: renamed from: c */
    public float m9536c(float f) {
        float f2 = this.f2993g;
        return f2 + m9534a(f - f2, this.f2989c);
    }

    /* JADX INFO: renamed from: d */
    public void m9537d(float f, float f2, RectF rectF, RectF rectF2) {
        this.f2992f = f;
        this.f2993g = f2;
        float fMin = Math.min(rectF.width(), rectF.height()) * 0.2f;
        this.f2987a = fMin;
        this.f2988b = fMin * 10.0f;
        this.f2990d = new C0577a(rectF.right - rectF2.right, rectF2.left - rectF.left);
        this.f2989c = new C0577a(rectF.bottom - rectF2.bottom, rectF2.top - rectF.top);
    }
}
