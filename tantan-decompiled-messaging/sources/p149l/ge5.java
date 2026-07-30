package p149l;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ge5 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<double[]> f102159a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static void m125664a(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @NonNull float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m125675l(f7, 0.0f, 360.0f);
        fArr[1] = m125675l(fAbs, 0.0f, 1.0f);
        fArr[2] = m125675l(f6, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static void m125665b(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            ig3.m135964a("outXyz must have a length of 3.");
            return;
        }
        double d = ((double) i) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static int m125666c(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 95.047d) double d, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 100.0d) double d2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 108.883d) double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m125676m((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m125676m((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), m125676m((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    /* JADX INFO: renamed from: d */
    public static double m125667d(@ColorInt int i, @ColorInt int i2) {
        if (Color.alpha(i2) != 255) {
            kg3.m145878a("background can not be translucent: #", Integer.toHexString(i2));
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (Color.alpha(i) < 255) {
            i = m125673j(i, i2);
        }
        double dM125668e = m125668e(i) + 0.05d;
        double dM125668e2 = m125668e(i2) + 0.05d;
        return Math.max(dM125668e, dM125668e2) / Math.min(dM125668e, dM125668e2);
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* JADX INFO: renamed from: e */
    public static double m125668e(@ColorInt int i) {
        double[] dArrM125677n = m125677n();
        m125671h(i, dArrM125677n);
        return dArrM125677n[1] / 100.0d;
    }

    /* JADX INFO: renamed from: f */
    public static int m125669f(@ColorInt int i, @ColorInt int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            kg3.m145878a("background can not be translucent: #", Integer.toHexString(i2));
            return 0;
        }
        double d = f;
        if (m125667d(m125678o(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m125667d(m125678o(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: g */
    public static void m125670g(@ColorInt int i, @NonNull float[] fArr) {
        m125664a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* JADX INFO: renamed from: h */
    public static void m125671h(@ColorInt int i, @NonNull double[] dArr) {
        m125665b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* JADX INFO: renamed from: i */
    public static int m125672i(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* JADX INFO: renamed from: j */
    public static int m125673j(@ColorInt int i, @ColorInt int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iM125672i = m125672i(iAlpha2, iAlpha);
        return Color.argb(iM125672i, m125674k(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iM125672i), m125674k(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iM125672i), m125674k(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iM125672i));
    }

    /* JADX INFO: renamed from: k */
    public static int m125674k(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* JADX INFO: renamed from: l */
    public static float m125675l(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    /* JADX INFO: renamed from: m */
    public static int m125676m(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* JADX INFO: renamed from: n */
    public static double[] m125677n() {
        ThreadLocal<double[]> threadLocal = f102159a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    @ColorInt
    /* JADX INFO: renamed from: o */
    public static int m125678o(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        ig3.m135964a("alpha must be between 0 and 255.");
        return 0;
    }
}
