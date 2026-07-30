package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bjc0 extends mfc0 implements gjc0 {

    /* JADX INFO: renamed from: d */
    public nec0 f75893d;

    /* JADX INFO: renamed from: e */
    public final List<bxm> f75894e = new ArrayList();

    @Override // p149l.mfc0, com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo75493e() throws Exception {
        if (this.f75893d == null) {
            this.f75893d = new nec0();
        }
        this.f75894e.clear();
        this.f75894e.add(this.f51214b.m149500n());
        this.f75894e.add(this.f51214b.m149488b());
        this.f75894e.addAll(this.f51214b.m149496j());
        this.f75894e.add(this.f51214b.m149498l());
        this.f75894e.add(this.f51214b.m149497k());
        nec0 nec0Var = this.f75893d;
        lec0 lec0Var = this.f51214b;
        List<bxm> list = this.f75894e;
        nec0Var.m159108d(lec0Var, list, list.size() - 1, m75494f(), this);
        this.f75893d.mo159105a(m75494f());
        this.f75893d.mo159107c();
    }

    @Override // p149l.mfc0, com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall, p149l.rx3
    public void execute() throws Exception {
        super.execute();
    }

    @Override // p149l.gjc0
    public void recycle() {
        m75490b();
        this.f51214b = null;
        this.f75893d.m159108d(null, null, 0, null, null);
    }
}
