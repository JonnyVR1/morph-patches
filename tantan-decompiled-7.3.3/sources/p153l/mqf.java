package p153l;

import android.animation.TimeInterpolator;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes7.dex */
public class mqf extends hqf<i7m> {

    /* JADX INFO: renamed from: g */
    private final PointF f138046g;

    /* JADX INFO: renamed from: h */
    private final PointF f138047h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f138048i;

    public mqf(i7m i7mVar, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        super(i7mVar);
        this.f138046g = new PointF(f, f2);
        this.f138047h = new PointF(f3, f4);
        this.f138048i = timeInterpolator;
    }

    @Override // p153l.hqf
    /* JADX INFO: renamed from: d */
    public void mo131372d(float f) {
        if (this.f111117a != 0) {
            TimeInterpolator timeInterpolator = this.f138048i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            PointF pointF = this.f138046g;
            float f2 = pointF.x;
            PointF pointF2 = this.f138047h;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            float f5 = f4 + ((pointF2.y - f4) * f);
            ((i7m) this.f111117a).mo138965c(f3);
            ((i7m) this.f111117a).mo138964b(f5);
        }
    }
}
