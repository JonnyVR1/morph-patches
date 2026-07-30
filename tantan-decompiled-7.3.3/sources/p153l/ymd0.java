package p153l;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class ymd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f200655a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m216673a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f200655a) * ((double) f2))) : f;
    }

    /* JADX INFO: renamed from: b */
    public static float m216674b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f200655a) * ((double) f2))) : f * 1.5f;
    }
}
