package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class va10 extends riv {

    /* JADX INFO: renamed from: d */
    public final dj10 f183062d;

    /* JADX INFO: renamed from: e */
    public jn10 f183063e;

    public va10(MotionType motionType, x6t x6tVar, dum<ou40> dumVar, g0m g0mVar) {
        super(motionType, x6tVar, dumVar);
        this.f183062d = (dj10) g0mVar;
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: e */
    public void mo129510e() {
        super.mo129510e();
        this.f183063e = (jn10) m181606d(new jn10(this.f163398c, this.f183062d));
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: f */
    public void mo129511f() {
        super.mo129511f();
        jn10 jn10Var = this.f183063e;
        if (jn10Var != null) {
            m181607g(jn10Var);
            this.f183063e = null;
        }
    }
}
