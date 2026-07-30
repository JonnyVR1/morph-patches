package p149l;

import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes5.dex */
public class kxb extends AccelerateDecelerateInterpolator {
    @Override // android.view.animation.AccelerateDecelerateInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return ((float) (Math.cos(((double) (f + 3.0f)) * 3.141592653589793d) / 2.0d)) + 0.5f;
    }
}
