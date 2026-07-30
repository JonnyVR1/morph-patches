package p149l;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class zof extends apf<iml> {

    /* JADX INFO: renamed from: g */
    float f204104g;

    /* JADX INFO: renamed from: h */
    float f204105h;

    /* JADX INFO: renamed from: i */
    TimeInterpolator f204106i;

    public zof(iml imlVar, float f, float f2, TimeInterpolator timeInterpolator) {
        super(imlVar);
        this.f204104g = f;
        this.f204105h = f2;
        this.f204106i = timeInterpolator;
    }

    @Override // p149l.apf
    /* JADX INFO: renamed from: d */
    public void mo98112d(float f) {
        if (this.f71029a != 0) {
            TimeInterpolator timeInterpolator = this.f204106i;
            if (timeInterpolator != null) {
                f = timeInterpolator.getInterpolation(f);
            }
            iml imlVar = (iml) this.f71029a;
            float f2 = this.f204104g;
            imlVar.mo99408d(f2 + ((this.f204105h - f2) * f));
        }
    }
}
