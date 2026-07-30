package p153l;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes12.dex */
public class fzf0 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public float f101479a;

    public fzf0(float f) {
        this.f101479a = f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        double dPow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = this.f101479a;
        return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
    }
}
