package p149l;

import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mee0 extends RealCall {

    /* JADX INFO: renamed from: d */
    public Object f133402d;

    public mee0(Object obj) {
        this.f133402d = obj;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: d */
    public s460 mo75492d() {
        qg3 qg3Var = new qg3();
        qg3Var.m182213f(String.valueOf(m75491c().m149494h().m207579a()));
        mo128638g(qg3Var, this.f133402d);
        return qg3Var;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo75493e() throws Exception {
        ArrayList arrayList = new ArrayList(this.f51214b.m149496j());
        arrayList.add(this.f51214b.m149497k());
        new nec0().m159108d(this.f51214b, arrayList, 0, m75494f(), this).mo159105a(m75494f());
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo128638g(qg3 qg3Var, Object obj);

    public mee0() {
    }
}
