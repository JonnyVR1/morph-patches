package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class iz3 extends qgv {

    /* JADX INFO: renamed from: d */
    public final a34 f115528d;

    /* JADX INFO: renamed from: e */
    public q0s f115529e;

    public iz3(MotionType motionType, w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f115528d = (a34) nxlVar;
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: e */
    public void mo100214e() {
        super.mo100214e();
        this.f115529e = (q0s) m174460d(new q0s(this.f154385c, this.f115528d));
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: f */
    public void mo100215f() {
        super.mo100215f();
        q0s q0sVar = this.f115529e;
        if (q0sVar != null) {
            m174461g(q0sVar);
        }
    }
}
