package p153l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class kqf extends hqf<e5m> {

    /* JADX INFO: renamed from: g */
    private final float f128215g;

    /* JADX INFO: renamed from: h */
    private final float f128216h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f128217i;

    public kqf(e5m e5mVar, float f, float f2, TimeInterpolator timeInterpolator) {
        super(e5mVar);
        this.f128215g = f;
        this.f128216h = f2;
        this.f128217i = timeInterpolator;
    }

    @Override // p153l.hqf
    /* JADX INFO: renamed from: d */
    public void mo131372d(float f) {
        if (this.f111117a != 0) {
            TimeInterpolator timeInterpolator = this.f128217i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            e5m e5mVar = (e5m) this.f111117a;
            float f2 = this.f128215g;
            e5mVar.mo119547e(f2 + ((this.f128216h - f2) * f));
        }
    }
}
