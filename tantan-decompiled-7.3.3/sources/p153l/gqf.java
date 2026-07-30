package p153l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class gqf extends hqf<uol> {

    /* JADX INFO: renamed from: g */
    float f105677g;

    /* JADX INFO: renamed from: h */
    float f105678h;

    /* JADX INFO: renamed from: i */
    TimeInterpolator f105679i;

    public gqf(uol uolVar, float f, float f2, TimeInterpolator timeInterpolator) {
        super(uolVar);
        this.f105677g = f;
        this.f105678h = f2;
        this.f105679i = timeInterpolator;
    }

    @Override // p153l.hqf
    /* JADX INFO: renamed from: d */
    public void mo131372d(float f) {
        if (this.f111117a != 0) {
            TimeInterpolator timeInterpolator = this.f105679i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            uol uolVar = (uol) this.f111117a;
            float f2 = this.f105677g;
            uolVar.mo148364d(f2 + ((this.f105678h - f2) * f));
        }
    }
}
