package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;

/* JADX INFO: loaded from: classes4.dex */
public class g910 extends riv {

    /* JADX INFO: renamed from: d */
    public final dj10 f102750d;

    /* JADX INFO: renamed from: e */
    public td10<mu40> f102751e;

    public g910(MotionType motionType, x6t x6tVar, dum<mu40> dumVar, g0m g0mVar) {
        super(motionType, x6tVar, dumVar);
        this.f102750d = (dj10) g0mVar;
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: e */
    public void mo129510e() {
        super.mo129510e();
        if (fn10.m126343k(this.f102750d.m116014b())) {
            this.f102751e = (td10) m181606d(new jl10(this.f163398c, this.f102750d));
        } else if (fn10.m126335c(this.f102750d.m116014b())) {
            this.f102751e = (td10) m181606d(new i0q(this.f163398c, this.f102750d));
        }
    }

    @Override // p153l.riv
    /* JADX INFO: renamed from: f */
    public void mo129511f() {
        super.mo129511f();
        td10<mu40> td10Var = this.f102751e;
        if (td10Var != null) {
            m181607g(td10Var);
            this.f102751e = null;
        }
    }
}
