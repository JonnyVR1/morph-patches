package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import l.ta10;
import l.ze10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l210 extends qgv {

    /* JADX INFO: renamed from: d */
    public final ta10 f14652d;

    /* JADX INFO: renamed from: e */
    public ze10 f14653e;

    public l210(MotionType motionType, w4t w4tVar, bsm<am40> bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f14652d = (ta10) nxlVar;
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: e */
    public void mo10160e() {
        super.mo10160e();
        this.f14653e = m21271d(new ze10(this.f17987c, this.f14652d));
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: f */
    public void mo10161f() {
        super.mo10161f();
        ze10 ze10Var = this.f14653e;
        if (ze10Var != null) {
            m21272g(ze10Var);
            this.f14653e = null;
        }
    }
}
