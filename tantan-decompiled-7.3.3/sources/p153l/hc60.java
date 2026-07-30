package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;

/* JADX INFO: loaded from: classes4.dex */
public class hc60 extends riv {

    /* JADX INFO: renamed from: d */
    public final PkLaunchData f108675d;

    /* JADX INFO: renamed from: e */
    public i6t f108676e;

    public hc60(MotionType motionType, x6t x6tVar, dum dumVar, g0m g0mVar) {
        super(motionType, x6tVar, dumVar);
        this.f108675d = (PkLaunchData) g0mVar;
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: e */
    public void mo129510e() {
        super.mo129510e();
        boolean zM206159b = wft.m206159b(2);
        dum dumVar = this.f163398c;
        if (zM206159b) {
            this.f108676e = (i6t) m181606d(new l980(dumVar, this.f108675d));
        } else {
            this.f108676e = (i6t) m181606d(new w980(dumVar, this.f108675d));
        }
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: f */
    public void mo129511f() {
        super.mo129511f();
        i6t i6tVar = this.f108676e;
        if (i6tVar != null) {
            m181607g(i6tVar);
            this.f108676e = null;
        }
    }
}
