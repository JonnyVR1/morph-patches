package p153l;

import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes8.dex */
public class jqi0 {

    /* JADX INFO: renamed from: a */
    public float f122215a;

    /* JADX INFO: renamed from: b */
    public float f122216b;

    /* JADX INFO: renamed from: c */
    public C18006a f122217c;

    /* JADX INFO: renamed from: d */
    public C18006a f122218d;

    /* JADX INFO: renamed from: e */
    public Interpolator f122219e = new DecelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: f */
    public float f122220f;

    /* JADX INFO: renamed from: g */
    public float f122221g;

    /* JADX INFO: renamed from: l.jqi0$a */
    public static class C18006a {

        /* JADX INFO: renamed from: a */
        public float f122222a;

        /* JADX INFO: renamed from: b */
        public float f122223b;

        public C18006a(float f, float f2) {
            this.f122222a = Math.max(f, 0.0f);
            this.f122223b = Math.max(f2, 0.0f);
        }

        /* JADX INFO: renamed from: a */
        public float m146589a() {
            return this.f122222a;
        }

        /* JADX INFO: renamed from: b */
        public float m146590b() {
            return this.f122223b;
        }

        public String toString() {
            return "TensionBorder{negativeTensionStart=" + this.f122222a + ", positiveTensionStart=" + this.f122223b + '}';
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m146585a(float f, C18006a c18006a) {
        float fAbs = Math.abs(f);
        float f2 = f >= 0.0f ? 1.0f : -1.0f;
        float fM146590b = f2 == 1.0f ? c18006a.m146590b() : c18006a.m146589a();
        if (fAbs < fM146590b) {
            return f;
        }
        float f3 = fAbs - fM146590b;
        float f4 = this.f122215a + fM146590b;
        float f5 = this.f122216b;
        if (fAbs >= f5 + fM146590b) {
            return f4 * f2;
        }
        return (fM146590b + (this.f122219e.getInterpolation(f3 / f5) * this.f122215a)) * f2;
    }

    /* JADX INFO: renamed from: b */
    public float m146586b(float f) {
        float f2 = this.f122220f;
        return f2 + m146585a(f - f2, this.f122218d);
    }

    /* JADX INFO: renamed from: c */
    public float m146587c(float f) {
        float f2 = this.f122221g;
        return f2 + m146585a(f - f2, this.f122217c);
    }

    /* JADX INFO: renamed from: d */
    public void m146588d(float f, float f2, RectF rectF, RectF rectF2) {
        this.f122220f = f;
        this.f122221g = f2;
        float fMin = Math.min(rectF.width(), rectF.height()) * 0.2f;
        this.f122215a = fMin;
        this.f122216b = fMin * 10.0f;
        this.f122218d = new C18006a(rectF.right - rectF2.right, rectF2.left - rectF.left);
        this.f122217c = new C18006a(rectF.bottom - rectF2.bottom, rectF2.top - rectF.top);
    }
}
