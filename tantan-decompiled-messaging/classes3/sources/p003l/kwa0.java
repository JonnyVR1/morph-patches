package p003l;

import android.animation.ValueAnimator;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kwa0 {
    /* JADX INFO: renamed from: a */
    public static void m5866a(int i) {
        if (i < 0 || i > 360) {
            dqi0.m3632a("Illegal angle %d: must be >=0 and <= 360", new Object[]{Integer.valueOf(i)});
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5867b(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            ig3.a("You must provide at least 1 color");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5868c(float f, String str) {
        if (f >= 0.0f) {
            return;
        }
        dqi0.m3632a("%s %d must be positive", new Object[]{str, Float.valueOf(f)});
    }

    /* JADX INFO: renamed from: d */
    public static void m5869d(float f) {
        if (f > 0.0f) {
            return;
        }
        ig3.a("Speed must be >= 0");
    }

    /* JADX INFO: renamed from: e */
    public static float m5870e(ValueAnimator valueAnimator) {
        return valueAnimator.getInterpolator().getInterpolation(Math.min(valueAnimator.getDuration() > 0 ? valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration() : 0.0f, 1.0f));
    }
}
