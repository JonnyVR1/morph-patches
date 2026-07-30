package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class x04 extends qgv {

    /* JADX INFO: renamed from: d */
    public final a34 f188923d;

    /* JADX INFO: renamed from: e */
    public w6d0 f188924e;

    public x04(MotionType motionType, w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f188923d = (a34) nxlVar;
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: e */
    public void mo100214e() {
        super.mo100214e();
        this.f188924e = (w6d0) m174460d(new w6d0(this.f154385c, this.f188923d));
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: f */
    public void mo100215f() {
        super.mo100215f();
        w6d0 w6d0Var = this.f188924e;
        if (w6d0Var != null) {
            m174461g(w6d0Var);
            this.f188924e = null;
        }
    }
}
