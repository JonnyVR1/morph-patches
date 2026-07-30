package p153l;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public class o4b0 {
    /* JADX INFO: renamed from: a */
    public static void m165975a(int i) {
        if (i < 0 || i > 360) {
            gzi0.m133102a("Illegal angle %d: must be >=0 and <= 360", new Object[]{Integer.valueOf(i)});
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m165976b(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            wg3.m206174a("You must provide at least 1 color");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m165977c(float f, String str) {
        if (f >= 0.0f) {
            return;
        }
        gzi0.m133102a("%s %d must be positive", new Object[]{str, Float.valueOf(f)});
    }

    /* JADX INFO: renamed from: d */
    public static void m165978d(float f) {
        if (f > 0.0f) {
            return;
        }
        wg3.m206174a("Speed must be >= 0");
    }

    /* JADX INFO: renamed from: e */
    public static float m165979e(ValueAnimator valueAnimator) {
        return valueAnimator.getInterpolator().getInterpolation(Math.min(valueAnimator.getDuration() > 0 ? valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration() : 0.0f, 1.0f));
    }
}
