package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class l210 extends qgv {

    /* JADX INFO: renamed from: d */
    public final ta10 f125727d;

    /* JADX INFO: renamed from: e */
    public ze10 f125728e;

    public l210(MotionType motionType, w4t w4tVar, bsm<am40> bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f125727d = (ta10) nxlVar;
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: e */
    public void mo100214e() {
        super.mo100214e();
        this.f125728e = (ze10) m174460d(new ze10(this.f154385c, this.f125727d));
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: f */
    public void mo100215f() {
        super.mo100215f();
        ze10 ze10Var = this.f125728e;
        if (ze10Var != null) {
            m174461g(ze10Var);
            this.f125728e = null;
        }
    }
}
