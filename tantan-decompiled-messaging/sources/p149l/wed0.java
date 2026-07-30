package p149l;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class wed0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f185927a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m202888a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f185927a) * ((double) f2))) : f;
    }

    /* JADX INFO: renamed from: b */
    public static float m202889b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f185927a) * ((double) f2))) : f * 1.5f;
    }
}
