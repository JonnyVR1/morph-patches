package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class irc0 extends tnc0 implements nrc0 {

    /* JADX INFO: renamed from: d */
    public umc0 f116521d;

    /* JADX INFO: renamed from: e */
    public final List<bzm> f116522e = new ArrayList();

    @Override // p153l.tnc0, com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo76676e() throws Exception {
        if (this.f116521d == null) {
            this.f116521d = new umc0();
        }
        this.f116522e.clear();
        this.f116522e.add(this.f52062b.m186796n());
        this.f116522e.add(this.f52062b.m186784b());
        this.f116522e.addAll(this.f52062b.m186792j());
        this.f116522e.add(this.f52062b.m186794l());
        this.f116522e.add(this.f52062b.m186793k());
        umc0 umc0Var = this.f116521d;
        smc0 smc0Var = this.f52062b;
        List<bzm> list = this.f116522e;
        umc0Var.m196645d(smc0Var, list, list.size() - 1, m76677f(), this);
        this.f116521d.mo196642a(m76677f());
        this.f116521d.mo196644c();
    }

    @Override // p153l.tnc0, com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall, p153l.qy3
    public void execute() throws Exception {
        super.execute();
    }

    @Override // p153l.nrc0
    public void recycle() {
        m76673b();
        this.f52062b = null;
        this.f116521d.m196645d(null, null, 0, null, null);
    }
}
