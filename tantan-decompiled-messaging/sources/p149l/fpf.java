package p149l;

import android.animation.TimeInterpolator;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes7.dex */
public class fpf extends apf<s4m> {

    /* JADX INFO: renamed from: g */
    private final PointF f98689g;

    /* JADX INFO: renamed from: h */
    private final PointF f98690h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f98691i;

    public fpf(s4m s4mVar, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        super(s4mVar);
        this.f98689g = new PointF(f, f2);
        this.f98690h = new PointF(f3, f4);
        this.f98691i = timeInterpolator;
    }

    @Override // p149l.apf
    /* JADX INFO: renamed from: d */
    public void mo98112d(float f) {
        if (this.f71029a != 0) {
            TimeInterpolator timeInterpolator = this.f98691i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            PointF pointF = this.f98689g;
            float f2 = pointF.x;
            PointF pointF2 = this.f98690h;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            float f5 = f4 + ((pointF2.y - f4) * f);
            ((s4m) this.f71029a).mo99407c(f3);
            ((s4m) this.f71029a).mo99406b(f5);
        }
    }
}
