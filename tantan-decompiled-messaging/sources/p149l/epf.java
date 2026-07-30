package p149l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class epf extends apf<s2m> {

    /* JADX INFO: renamed from: g */
    private final float f92648g;

    /* JADX INFO: renamed from: h */
    private final float f92649h;

    /* JADX INFO: renamed from: i */
    private TimeInterpolator f92650i;

    public epf(s2m s2mVar, float f, float f2, TimeInterpolator timeInterpolator) {
        super(s2mVar);
        this.f92648g = f;
        this.f92649h = f2;
        this.f92650i = timeInterpolator;
    }

    @Override // p149l.apf
    /* JADX INFO: renamed from: d */
    public void mo98112d(float f) {
        if (this.f71029a != 0) {
            TimeInterpolator timeInterpolator = this.f92650i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            float f2 = this.f92648g;
            ((s2m) this.f71029a).mo99405a(f2 + ((this.f92649h - f2) * f));
        }
    }
}
