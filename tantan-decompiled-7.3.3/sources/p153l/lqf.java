package p153l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class lqf extends hqf<l5m> {

    /* JADX INFO: renamed from: g */
    private final float f133194g;

    /* JADX INFO: renamed from: h */
    private final float f133195h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f133196i;

    public lqf(l5m l5mVar, float f, float f2, TimeInterpolator timeInterpolator) {
        super(l5mVar);
        this.f133194g = f;
        this.f133195h = f2;
        this.f133196i = timeInterpolator;
    }

    @Override // p153l.hqf
    /* JADX INFO: renamed from: d */
    public void mo131372d(float f) {
        if (this.f111117a != 0) {
            TimeInterpolator timeInterpolator = this.f133196i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            float f2 = this.f133194g;
            ((l5m) this.f111117a).mo148363a(f2 + ((this.f133195h - f2) * f));
        }
    }
}
