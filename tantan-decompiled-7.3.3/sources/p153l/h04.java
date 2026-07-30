package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class h04 extends riv {

    /* JADX INFO: renamed from: d */
    public final z34 f107268d;

    /* JADX INFO: renamed from: e */
    public r2s f107269e;

    public h04(MotionType motionType, x6t x6tVar, dum dumVar, g0m g0mVar) {
        super(motionType, x6tVar, dumVar);
        this.f107268d = (z34) g0mVar;
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: e */
    public void mo129510e() {
        super.mo129510e();
        this.f107269e = (r2s) m181606d(new r2s(this.f163398c, this.f107268d));
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: f */
    public void mo129511f() {
        super.mo129511f();
        r2s r2sVar = this.f107269e;
        if (r2sVar != null) {
            m181607g(r2sVar);
        }
    }
}
