package p003l;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wqf0 implements Interpolator {

    /* JADX INFO: renamed from: a */
    public float f8221a;

    public wqf0(float f) {
        this.f8221a = f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        double dPow = Math.pow(2.0d, (-10.0f) * f);
        float f2 = this.f8221a;
        return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
    }
}
