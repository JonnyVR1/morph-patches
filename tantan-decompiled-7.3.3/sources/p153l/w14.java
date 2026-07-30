package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class w14 extends riv {

    /* JADX INFO: renamed from: d */
    public final z34 f186760d;

    /* JADX INFO: renamed from: e */
    public zed0 f186761e;

    public w14(MotionType motionType, x6t x6tVar, dum dumVar, g0m g0mVar) {
        super(motionType, x6tVar, dumVar);
        this.f186760d = (z34) g0mVar;
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: e */
    public void mo129510e() {
        super.mo129510e();
        this.f186761e = (zed0) m181606d(new zed0(this.f163398c, this.f186760d));
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: f */
    public void mo129511f() {
        super.mo129511f();
        zed0 zed0Var = this.f186761e;
        if (zed0Var != null) {
            m181607g(zed0Var);
            this.f186761e = null;
        }
    }
}
