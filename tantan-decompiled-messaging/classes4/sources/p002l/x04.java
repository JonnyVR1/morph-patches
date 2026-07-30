package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import l.a34;
import l.w6d0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x04 extends qgv {

    /* JADX INFO: renamed from: d */
    public final a34 f22061d;

    /* JADX INFO: renamed from: e */
    public w6d0 f22062e;

    public x04(MotionType motionType, w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f22061d = (a34) nxlVar;
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: e */
    public void mo10160e() {
        super.mo10160e();
        this.f22062e = m21271d(new w6d0(this.f17987c, this.f22061d));
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: f */
    public void mo10161f() {
        super.mo10161f();
        w6d0 w6d0Var = this.f22062e;
        if (w6d0Var != null) {
            m21272g(w6d0Var);
            this.f22062e = null;
        }
    }
}
