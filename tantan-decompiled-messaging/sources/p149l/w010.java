package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class w010 extends qgv {

    /* JADX INFO: renamed from: d */
    public final ta10 f183699d;

    /* JADX INFO: renamed from: e */
    public j510<yl40> f183700e;

    public w010(MotionType motionType, w4t w4tVar, bsm<yl40> bsmVar, nxl nxlVar) {
        super(motionType, w4tVar, bsmVar);
        this.f183699d = (ta10) nxlVar;
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: e */
    public void mo100214e() {
        super.mo100214e();
        if (ve10.m198137k(this.f183699d.m187694b())) {
            this.f183700e = (j510) m174460d(new zc10(this.f154385c, this.f183699d));
        } else if (ve10.m198129c(this.f183699d.m187694b())) {
            this.f183700e = (j510) m174460d(new iyp(this.f154385c, this.f183699d));
        }
    }

    @Override // p149l.qgv
    /* JADX INFO: renamed from: f */
    public void mo100215f() {
        super.mo100215f();
        j510<yl40> j510Var = this.f183700e;
        if (j510Var != null) {
            m174461g(j510Var);
            this.f183700e = null;
        }
    }
}
