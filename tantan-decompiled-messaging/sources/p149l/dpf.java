package p149l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class dpf extends apf<l2m> {

    /* JADX INFO: renamed from: g */
    private final float f87267g;

    /* JADX INFO: renamed from: h */
    private final float f87268h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f87269i;

    public dpf(l2m l2mVar, float f, float f2, TimeInterpolator timeInterpolator) {
        super(l2mVar);
        this.f87267g = f;
        this.f87268h = f2;
        this.f87269i = timeInterpolator;
    }

    @Override // p149l.apf
    /* JADX INFO: renamed from: d */
    public void mo98112d(float f) {
        if (this.f71029a != 0) {
            TimeInterpolator timeInterpolator = this.f87269i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            l2m l2mVar = (l2m) this.f71029a;
            float f2 = this.f87267g;
            l2mVar.mo99409e(f2 + ((this.f87268h - f2) * f));
        }
    }
}
