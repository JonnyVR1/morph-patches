package p153l;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class h94 {

    /* JADX INFO: renamed from: a */
    public final float f108307a;

    /* JADX INFO: renamed from: b */
    public final float f108308b;

    /* JADX INFO: renamed from: c */
    public final float f108309c;

    /* JADX INFO: renamed from: d */
    public final float f108310d;

    /* JADX INFO: renamed from: e */
    public final float f108311e;

    /* JADX INFO: renamed from: f */
    public final float f108312f;

    /* JADX INFO: renamed from: g */
    public final float f108313g;

    /* JADX INFO: renamed from: h */
    public final float f108314h;

    /* JADX INFO: renamed from: i */
    public final float f108315i;

    public h94(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f108307a = f;
        this.f108308b = f2;
        this.f108309c = f3;
        this.f108310d = f4;
        this.f108311e = f5;
        this.f108312f = f6;
        this.f108313g = f7;
        this.f108314h = f8;
        this.f108315i = f9;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static h94 m134021b(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        h94 h94Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iM134036p = m134024e(f8, f2, f).m134036p();
            float fM139067b = i94.m139067b(iM134036p);
            float fAbs = Math.abs(f3 - fM139067b);
            if (fAbs < 0.2f) {
                h94 h94VarM134022c = m134022c(iM134036p);
                float fM134028a = h94VarM134022c.m134028a(m134024e(h94VarM134022c.m134033k(), h94VarM134022c.m134031i(), f));
                if (fM134028a <= 1.0f) {
                    h94Var = h94VarM134022c;
                    f5 = fAbs;
                    f7 = fM134028a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                return h94Var;
            }
            if (fM139067b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return h94Var;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static h94 m134022c(@ColorInt int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m134023d(i, xnl0.f195409k, fArr, fArr2);
        return new h94(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: d */
    public static void m134023d(@ColorInt int i, @NonNull xnl0 xnl0Var, @Nullable @Size(7) float[] fArr, @NonNull @Size(3) float[] fArr2) {
        i94.m139071f(i, fArr2);
        float[][] fArr3 = i94.f113408a;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = xnl0Var.m212224i()[0] * f6;
        float f10 = xnl0Var.m212224i()[1] * f7;
        float f11 = xnl0Var.m212224i()[2] * f8;
        float fPow = (float) Math.pow(((double) (xnl0Var.m212218c() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (xnl0Var.m212218c() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (xnl0Var.m212218c() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * xnl0Var.m212221f()) / xnl0Var.m212216a(), xnl0Var.m212217b() * xnl0Var.m212225j())) * 100.0f;
        float fM212217b = (4.0f / xnl0Var.m212217b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (xnl0Var.m212216a() + 4.0f) * xnl0Var.m212219d();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, xnl0Var.m212220e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * xnl0Var.m212222g()) * xnl0Var.m212223h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fM212219d = xnl0Var.m212219d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * xnl0Var.m212217b()) / (xnl0Var.m212216a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM212219d) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM212217b;
            fArr[2] = fM212219d;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static h94 m134024e(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f3) {
        return m134025f(f, f2, f3, xnl0.f195409k);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static h94 m134025f(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f3, xnl0 xnl0Var) {
        double d = ((double) f) / 100.0d;
        float fM212217b = (4.0f / xnl0Var.m212217b()) * ((float) Math.sqrt(d)) * (xnl0Var.m212216a() + 4.0f) * xnl0Var.m212219d();
        float fM212219d = xnl0Var.m212219d() * f2;
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * xnl0Var.m212217b()) / (xnl0Var.m212216a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM212219d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new h94(f3, f2, f, fM212217b, fM212219d, fSqrt, f4, ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: m */
    public static int m134026m(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f3) {
        return m134027n(f, f2, f3, xnl0.f195409k);
    }

    @ColorInt
    /* JADX INFO: renamed from: n */
    public static int m134027n(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f3, @NonNull xnl0 xnl0Var) {
        if (f2 < 1.0d || Math.round(f3) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.round(f3) >= 100.0d) {
            return i94.m139066a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        h94 h94Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            h94 h94VarM134021b = m134021b(fMin, f5, f3);
            if (!z) {
                if (h94VarM134021b == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    h94Var = h94VarM134021b;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (h94VarM134021b != null) {
                    return h94VarM134021b.m134035o(xnl0Var);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return h94Var == null ? i94.m139066a(f3) : h94Var.m134035o(xnl0Var);
    }

    /* JADX INFO: renamed from: a */
    public float m134028a(@NonNull h94 h94Var) {
        float fM134034l = m134034l() - h94Var.m134034l();
        float fM134029g = m134029g() - h94Var.m134029g();
        float fM134030h = m134030h() - h94Var.m134030h();
        return (float) (Math.pow(Math.sqrt((fM134034l * fM134034l) + (fM134029g * fM134029g) + (fM134030h * fM134030h)), 0.63d) * 1.41d);
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: g */
    public float m134029g() {
        return this.f108314h;
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: h */
    public float m134030h() {
        return this.f108315i;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: i */
    public float m134031i() {
        return this.f108308b;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d, toInclusive = false)
    /* JADX INFO: renamed from: j */
    public float m134032j() {
        return this.f108307a;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d)
    /* JADX INFO: renamed from: k */
    public float m134033k() {
        return this.f108309c;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d)
    /* JADX INFO: renamed from: l */
    public float m134034l() {
        return this.f108313g;
    }

    @ColorInt
    /* JADX INFO: renamed from: o */
    public int m134035o(@NonNull xnl0 xnl0Var) {
        float fPow = (float) Math.pow(((double) ((((double) m134031i()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || ((double) m134033k()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? 0.0f : m134031i() / ((float) Math.sqrt(((double) m134033k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, xnl0Var.m212220e()), 0.73d), 1.1111111111111112d);
        double dM134032j = (m134032j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM134032j) + 3.8d)) * 0.25f;
        float fM212216a = xnl0Var.m212216a() * ((float) Math.pow(((double) m134033k()) / 100.0d, (1.0d / ((double) xnl0Var.m212217b())) / ((double) xnl0Var.m212225j())));
        float fM212222g = fCos * 3846.1538f * xnl0Var.m212222g() * xnl0Var.m212223h();
        float fM212221f = fM212216a / xnl0Var.m212221f();
        float fSin = (float) Math.sin(dM134032j);
        float fCos2 = (float) Math.cos(dM134032j);
        float f = (((0.305f + fM212221f) * 23.0f) * fPow) / (((fM212222g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fM212221f * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float f7 = ((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / xnl0Var.m212218c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / xnl0Var.m212218c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f7) * (100.0f / xnl0Var.m212218c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float f8 = fSignum / xnl0Var.m212224i()[0];
        float f9 = fSignum2 / xnl0Var.m212224i()[1];
        float f10 = fSignum3 / xnl0Var.m212224i()[2];
        float[][] fArr = i94.f113409b;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return gf5.m130040c(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    @ColorInt
    /* JADX INFO: renamed from: p */
    public int m134036p() {
        return m134035o(xnl0.f195409k);
    }
}
