package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import l.a34;
import l.q0s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iz3 extends qgv {

    /* JADX INFO: renamed from: d */
    public final a34 f13494d;

    /* JADX INFO: renamed from: e */
    public q0s f13495e;

    public iz3(MotionType motionType, w4t w4tVar, bsm bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f13494d = (a34) nxlVar;
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: e */
    public void mo10160e() {
        super.mo10160e();
        this.f13495e = m21271d(new q0s(this.f17987c, this.f13494d));
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: f */
    public void mo10161f() {
        super.mo10161f();
        q0s q0sVar = this.f13495e;
        if (q0sVar != null) {
            m21272g(q0sVar);
        }
    }
}
