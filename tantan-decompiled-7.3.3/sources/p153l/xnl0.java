package p153l;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class xnl0 {

    /* JADX INFO: renamed from: k */
    public static final xnl0 f195409k = m212215k(i94.f113410c, (float) ((((double) i94.m139073h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a */
    public final float f195410a;

    /* JADX INFO: renamed from: b */
    public final float f195411b;

    /* JADX INFO: renamed from: c */
    public final float f195412c;

    /* JADX INFO: renamed from: d */
    public final float f195413d;

    /* JADX INFO: renamed from: e */
    public final float f195414e;

    /* JADX INFO: renamed from: f */
    public final float f195415f;

    /* JADX INFO: renamed from: g */
    public final float[] f195416g;

    /* JADX INFO: renamed from: h */
    public final float f195417h;

    /* JADX INFO: renamed from: i */
    public final float f195418i;

    /* JADX INFO: renamed from: j */
    public final float f195419j;

    public xnl0(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f195415f = f;
        this.f195410a = f2;
        this.f195411b = f3;
        this.f195412c = f4;
        this.f195413d = f5;
        this.f195414e = f6;
        this.f195416g = fArr;
        this.f195417h = f7;
        this.f195418i = f8;
        this.f195419j = f9;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static xnl0 m212215k(@NonNull float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = i94.f113408a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fM139069d = ((double) f12) >= 0.9d ? i94.m139069d(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : i94.m139069d(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f) * 5.0d)));
        float fM139073h = i94.m139073h(f2) / fArr[1];
        double d2 = fM139073h;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f11)) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new xnl0(fM139073h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM139069d, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: a */
    public float m212216a() {
        return this.f195410a;
    }

    /* JADX INFO: renamed from: b */
    public float m212217b() {
        return this.f195413d;
    }

    /* JADX INFO: renamed from: c */
    public float m212218c() {
        return this.f195417h;
    }

    /* JADX INFO: renamed from: d */
    public float m212219d() {
        return this.f195418i;
    }

    /* JADX INFO: renamed from: e */
    public float m212220e() {
        return this.f195415f;
    }

    /* JADX INFO: renamed from: f */
    public float m212221f() {
        return this.f195411b;
    }

    /* JADX INFO: renamed from: g */
    public float m212222g() {
        return this.f195414e;
    }

    /* JADX INFO: renamed from: h */
    public float m212223h() {
        return this.f195412c;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public float[] m212224i() {
        return this.f195416g;
    }

    /* JADX INFO: renamed from: j */
    public float m212225j() {
        return this.f195419j;
    }
}
