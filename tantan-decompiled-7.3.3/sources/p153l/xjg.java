package p153l;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes8.dex */
public class xjg implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f * f;
        float f3 = f * f2;
        return ((-1.7f) * f3 * f2) + (8.1f * f2 * f2) + (f3 * (-13.1f)) + (f2 * 7.7f);
    }
}
