package p149l;

import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes8.dex */
public class jhi0 {

    /* JADX INFO: renamed from: a */
    public float f117942a;

    /* JADX INFO: renamed from: b */
    public float f117943b;

    /* JADX INFO: renamed from: c */
    public C17773a f117944c;

    /* JADX INFO: renamed from: d */
    public C17773a f117945d;

    /* JADX INFO: renamed from: e */
    public Interpolator f117946e = new DecelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: f */
    public float f117947f;

    /* JADX INFO: renamed from: g */
    public float f117948g;

    /* JADX INFO: renamed from: l.jhi0$a */
    public static class C17773a {

        /* JADX INFO: renamed from: a */
        public float f117949a;

        /* JADX INFO: renamed from: b */
        public float f117950b;

        public C17773a(float f, float f2) {
            this.f117949a = Math.max(f, 0.0f);
            this.f117950b = Math.max(f2, 0.0f);
        }

        /* JADX INFO: renamed from: a */
        public float m141529a() {
            return this.f117949a;
        }

        /* JADX INFO: renamed from: b */
        public float m141530b() {
            return this.f117950b;
        }

        public String toString() {
            return "TensionBorder{negativeTensionStart=" + this.f117949a + ", positiveTensionStart=" + this.f117950b + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m141525a(float f, C17773a c17773a) {
        float fAbs = Math.abs(f);
        float f2 = f >= 0.0f ? 1.0f : -1.0f;
        float fM141530b = f2 == 1.0f ? c17773a.m141530b() : c17773a.m141529a();
        if (fAbs < fM141530b) {
            return f;
        }
        float f3 = fAbs - fM141530b;
        float f4 = this.f117942a + fM141530b;
        float f5 = this.f117943b;
        if (fAbs >= f5 + fM141530b) {
            return f4 * f2;
        }
        return (fM141530b + (this.f117946e.getInterpolation(f3 / f5) * this.f117942a)) * f2;
    }

    /* JADX INFO: renamed from: b */
    public float m141526b(float f) {
        float f2 = this.f117947f;
        return f2 + m141525a(f - f2, this.f117945d);
    }

    /* JADX INFO: renamed from: c */
    public float m141527c(float f) {
        float f2 = this.f117948g;
        return f2 + m141525a(f - f2, this.f117944c);
    }

    /* JADX INFO: renamed from: d */
    public void m141528d(float f, float f2, RectF rectF, RectF rectF2) {
        this.f117947f = f;
        this.f117948g = f2;
        float fMin = Math.min(rectF.width(), rectF.height()) * 0.2f;
        this.f117942a = fMin;
        this.f117943b = fMin * 10.0f;
        this.f117945d = new C17773a(rectF.right - rectF2.right, rectF2.left - rectF.left);
        this.f117944c = new C17773a(rectF.bottom - rectF2.bottom, rectF2.top - rectF.top);
    }
}
