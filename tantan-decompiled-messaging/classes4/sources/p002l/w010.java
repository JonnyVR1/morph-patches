package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import l.iyp;
import l.j510;
import l.ta10;
import l.ve10;
import l.zc10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w010 extends qgv {

    /* JADX INFO: renamed from: d */
    public final ta10 f21397d;

    /* JADX INFO: renamed from: e */
    public j510<yl40> f21398e;

    public w010(MotionType motionType, w4t w4tVar, bsm<yl40> bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f21397d = (ta10) nxlVar;
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: e */
    public void mo10160e() {
        super.mo10160e();
        if (ve10.k(this.f21397d.b())) {
            this.f21398e = m21271d(new zc10(this.f17987c, this.f21397d));
        } else if (ve10.c(this.f21397d.b())) {
            this.f21398e = m21271d(new iyp(this.f17987c, this.f21397d));
        }
    }

    @Override // p002l.qgv
    /* JADX INFO: renamed from: f */
    public void mo10161f() {
        super.mo10161f();
        j510<yl40> j510Var = this.f21398e;
        if (j510Var != null) {
            m21272g(j510Var);
            this.f21398e = null;
        }
    }
}
