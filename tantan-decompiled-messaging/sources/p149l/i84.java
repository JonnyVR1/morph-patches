package p149l;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i84 {

    /* JADX INFO: renamed from: a */
    public final float f111976a;

    /* JADX INFO: renamed from: b */
    public final float f111977b;

    /* JADX INFO: renamed from: c */
    public final float f111978c;

    /* JADX INFO: renamed from: d */
    public final float f111979d;

    /* JADX INFO: renamed from: e */
    public final float f111980e;

    /* JADX INFO: renamed from: f */
    public final float f111981f;

    /* JADX INFO: renamed from: g */
    public final float f111982g;

    /* JADX INFO: renamed from: h */
    public final float f111983h;

    /* JADX INFO: renamed from: i */
    public final float f111984i;

    public i84(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f111976a = f;
        this.f111977b = f2;
        this.f111978c = f3;
        this.f111979d = f4;
        this.f111980e = f5;
        this.f111981f = f6;
        this.f111982g = f7;
        this.f111983h = f8;
        this.f111984i = f9;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static i84 m134938b(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        i84 i84Var = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iM134953p = m134941e(f8, f2, f).m134953p();
            float fM140183b = j84.m140183b(iM134953p);
            float fAbs = Math.abs(f3 - fM140183b);
            if (fAbs < 0.2f) {
                i84 i84VarM134939c = m134939c(iM134953p);
                float fM134945a = i84VarM134939c.m134945a(m134941e(i84VarM134939c.m134950k(), i84VarM134939c.m134948i(), f));
                if (fM134945a <= 1.0f) {
                    i84Var = i84VarM134939c;
                    f5 = fAbs;
                    f7 = fM134945a;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                return i84Var;
            }
            if (fM140183b < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return i84Var;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static i84 m134939c(@ColorInt int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m134940d(i, tel0.f169846k, fArr, fArr2);
        return new i84(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: d */
    public static void m134940d(@ColorInt int i, @NonNull tel0 tel0Var, @Nullable @Size(7) float[] fArr, @NonNull @Size(3) float[] fArr2) {
        j84.m140187f(i, fArr2);
        float[][] fArr3 = j84.f116677a;
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
        float f9 = tel0Var.m188533i()[0] * f6;
        float f10 = tel0Var.m188533i()[1] * f7;
        float f11 = tel0Var.m188533i()[2] * f8;
        float fPow = (float) Math.pow(((double) (tel0Var.m188527c() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (tel0Var.m188527c() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (tel0Var.m188527c() * Math.abs(f11))) / 100.0d, 0.42d);
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
        float fPow4 = ((float) Math.pow((f16 * tel0Var.m188530f()) / tel0Var.m188525a(), tel0Var.m188526b() * tel0Var.m188534j())) * 100.0f;
        float fM188526b = (4.0f / tel0Var.m188526b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (tel0Var.m188525a() + 4.0f) * tel0Var.m188528d();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, tel0Var.m188529e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * tel0Var.m188531g()) * tel0Var.m188532h()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fM188528d = tel0Var.m188528d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * tel0Var.m188526b()) / (tel0Var.m188525a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM188528d) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM188526b;
            fArr[2] = fM188528d;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static i84 m134941e(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f3) {
        return m134942f(f, f2, f3, tel0.f169846k);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static i84 m134942f(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f3, tel0 tel0Var) {
        double d = ((double) f) / 100.0d;
        float fM188526b = (4.0f / tel0Var.m188526b()) * ((float) Math.sqrt(d)) * (tel0Var.m188525a() + 4.0f) * tel0Var.m188528d();
        float fM188528d = tel0Var.m188528d() * f2;
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * tel0Var.m188526b()) / (tel0Var.m188525a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM188528d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new i84(f3, f2, f, fM188526b, fM188528d, fSqrt, f4, ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: m */
    public static int m134943m(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f3) {
        return m134944n(f, f2, f3, tel0.f169846k);
    }

    @ColorInt
    /* JADX INFO: renamed from: n */
    public static int m134944n(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d) float f, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) float f3, @NonNull tel0 tel0Var) {
        if (f2 < 1.0d || Math.round(f3) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Math.round(f3) >= 100.0d) {
            return j84.m140182a(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        i84 i84Var = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            i84 i84VarM134938b = m134938b(fMin, f5, f3);
            if (!z) {
                if (i84VarM134938b == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    i84Var = i84VarM134938b;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (i84VarM134938b != null) {
                    return i84VarM134938b.m134952o(tel0Var);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return i84Var == null ? j84.m140182a(f3) : i84Var.m134952o(tel0Var);
    }

    /* JADX INFO: renamed from: a */
    public float m134945a(@NonNull i84 i84Var) {
        float fM134951l = m134951l() - i84Var.m134951l();
        float fM134946g = m134946g() - i84Var.m134946g();
        float fM134947h = m134947h() - i84Var.m134947h();
        return (float) (Math.pow(Math.sqrt((fM134951l * fM134951l) + (fM134946g * fM134946g) + (fM134947h * fM134947h)), 0.63d) * 1.41d);
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: g */
    public float m134946g() {
        return this.f111983h;
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: h */
    public float m134947h() {
        return this.f111984i;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* JADX INFO: renamed from: i */
    public float m134948i() {
        return this.f111977b;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 360.0d, toInclusive = false)
    /* JADX INFO: renamed from: j */
    public float m134949j() {
        return this.f111976a;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d)
    /* JADX INFO: renamed from: k */
    public float m134950k() {
        return this.f111978c;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d)
    /* JADX INFO: renamed from: l */
    public float m134951l() {
        return this.f111982g;
    }

    @ColorInt
    /* JADX INFO: renamed from: o */
    public int m134952o(@NonNull tel0 tel0Var) {
        float fPow = (float) Math.pow(((double) ((((double) m134948i()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || ((double) m134950k()) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? 0.0f : m134948i() / ((float) Math.sqrt(((double) m134950k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, tel0Var.m188529e()), 0.73d), 1.1111111111111112d);
        double dM134949j = (m134949j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM134949j) + 3.8d)) * 0.25f;
        float fM188525a = tel0Var.m188525a() * ((float) Math.pow(((double) m134950k()) / 100.0d, (1.0d / ((double) tel0Var.m188526b())) / ((double) tel0Var.m188534j())));
        float fM188531g = fCos * 3846.1538f * tel0Var.m188531g() * tel0Var.m188532h();
        float fM188530f = fM188525a / tel0Var.m188530f();
        float fSin = (float) Math.sin(dM134949j);
        float fCos2 = (float) Math.cos(dM134949j);
        float f = (((0.305f + fM188530f) * 23.0f) * fPow) / (((fM188531g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fM188530f * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float f7 = ((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / tel0Var.m188527c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / tel0Var.m188527c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f7) * (100.0f / tel0Var.m188527c()) * ((float) Math.pow((float) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float f8 = fSignum / tel0Var.m188533i()[0];
        float f9 = fSignum2 / tel0Var.m188533i()[1];
        float f10 = fSignum3 / tel0Var.m188533i()[2];
        float[][] fArr = j84.f116678b;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return ge5.m125666c(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    @ColorInt
    /* JADX INFO: renamed from: p */
    public int m134953p() {
        return m134952o(tel0.f169846k);
    }
}
