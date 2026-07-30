package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;

/* JADX INFO: loaded from: classes4.dex */
public class b460 extends qgv {

    /* JADX INFO: renamed from: d */
    public final PkLaunchData f73317d;

    /* JADX INFO: renamed from: e */
    public h4t f73318e;

    public b460(MotionType motionType, w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f73317d = (PkLaunchData) nxlVar;
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: e */
    public void mo100214e() {
        super.mo100214e();
        boolean zM198092b = vdt.m198092b(2);
        bsm bsmVar = this.f154385c;
        if (zM198092b) {
            this.f73318e = (h4t) m174460d(new lr70(bsmVar, this.f73317d));
        } else {
            this.f73318e = (h4t) m174460d(new gt70(bsmVar, this.f73317d));
        }
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: f */
    public void mo100215f() {
        super.mo100215f();
        h4t h4tVar = this.f73318e;
        if (h4tVar != null) {
            m174461g(h4tVar);
            this.f73318e = null;
        }
    }
}
