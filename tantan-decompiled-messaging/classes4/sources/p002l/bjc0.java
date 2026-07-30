package p002l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bjc0 extends mfc0 implements gjc0 {

    /* JADX INFO: renamed from: d */
    public nec0 f8184d;

    /* JADX INFO: renamed from: e */
    public final List<bxm> f8185e = new ArrayList();

    @Override // p002l.mfc0, com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo9128e() throws Exception {
        if (this.f8184d == null) {
            this.f8184d = new nec0();
        }
        this.f8185e.clear();
        this.f8185e.add(this.f7256b.m17158n());
        this.f8185e.add(this.f7256b.m17146b());
        this.f8185e.addAll(this.f7256b.m17154j());
        this.f8185e.add(this.f7256b.m17156l());
        this.f8185e.add(this.f7256b.m17155k());
        nec0 nec0Var = this.f8184d;
        lec0 lec0Var = this.f7256b;
        List<bxm> list = this.f8185e;
        nec0Var.m18696d(lec0Var, list, list.size() - 1, m9129f(), this);
        this.f8184d.mo18693a(m9129f());
        this.f8184d.mo18695c();
    }

    @Override // p002l.mfc0, com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall, p002l.rx3
    public void execute() throws Exception {
        super.execute();
    }

    @Override // p002l.gjc0
    public void recycle() {
        m9125b();
        this.f7256b = null;
        this.f8184d.m18696d(null, null, 0, null, null);
    }
}
