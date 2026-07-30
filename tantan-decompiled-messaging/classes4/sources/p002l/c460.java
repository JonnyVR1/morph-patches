package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p1.mobile.putong.live.livingroom.recreation.pk.bean.PkLaunchData;
import l.f180;
import l.q180;
import l.vdt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c460 extends qgv {

    /* JADX INFO: renamed from: d */
    public final PkLaunchData f8477d;

    /* JADX INFO: renamed from: e */
    public h4t f8478e;

    public c460(MotionType motionType, w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f8477d = (PkLaunchData) nxlVar;
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: e */
    public void mo10160e() {
        super.mo10160e();
        boolean zB = vdt.b(2);
        bsm bsmVar = this.f17987c;
        if (zB) {
            this.f8478e = (h4t) m21271d(new f180(bsmVar, this.f8477d));
        } else {
            this.f8478e = (h4t) m21271d(new q180(bsmVar, this.f8477d));
        }
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: f */
    public void mo10161f() {
        super.mo10161f();
        h4t h4tVar = this.f8478e;
        if (h4tVar != null) {
            m21272g(h4tVar);
            this.f8478e = null;
        }
    }
}
