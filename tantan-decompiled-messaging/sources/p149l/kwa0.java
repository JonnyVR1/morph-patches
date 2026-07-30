package p149l;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public class kwa0 {
    /* JADX INFO: renamed from: a */
    public static void m147518a(int i) {
        if (i < 0 || i > 360) {
            dqi0.m113073a("Illegal angle %d: must be >=0 and <= 360", new Object[]{Integer.valueOf(i)});
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m147519b(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            ig3.m135964a("You must provide at least 1 color");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m147520c(float f, String str) {
        if (f >= 0.0f) {
            return;
        }
        dqi0.m113073a("%s %d must be positive", new Object[]{str, Float.valueOf(f)});
    }

    /* JADX INFO: renamed from: d */
    public static void m147521d(float f) {
        if (f > 0.0f) {
            return;
        }
        ig3.m135964a("Speed must be >= 0");
    }

    /* JADX INFO: renamed from: e */
    public static float m147522e(ValueAnimator valueAnimator) {
        return valueAnimator.getInterpolator().getInterpolation(Math.min(valueAnimator.getDuration() > 0 ? valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration() : 0.0f, 1.0f));
    }
}
