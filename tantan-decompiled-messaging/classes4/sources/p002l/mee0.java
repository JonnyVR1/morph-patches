package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class mee0 extends RealCall {

    /* JADX INFO: renamed from: d */
    public Object f15358d;

    public mee0(Object obj) {
        this.f15358d = obj;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: d */
    public s460 mo9127d() {
        qg3 qg3Var = new qg3();
        qg3Var.m22198f(String.valueOf(m9126c().m17152h().m25816a()));
        mo14076g(qg3Var, this.f15358d);
        return qg3Var;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo9128e() throws Exception {
        ArrayList arrayList = new ArrayList(this.f7256b.m17154j());
        arrayList.add(this.f7256b.m17155k());
        new nec0().m18696d(this.f7256b, arrayList, 0, m9129f(), this).mo18693a(m9129f());
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo14076g(qg3 qg3Var, Object obj);

    public mee0() {
    }
}
