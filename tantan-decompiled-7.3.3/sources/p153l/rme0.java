package p153l;

import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rme0 extends RealCall {

    /* JADX INFO: renamed from: d */
    public Object f163863d;

    public rme0(Object obj) {
        this.f163863d = obj;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: d */
    public yc60 mo76675d() {
        eh3 eh3Var = new eh3();
        eh3Var.m215140f(String.valueOf(m76674c().m186790h().m162717a()));
        mo101382g(eh3Var, this.f163863d);
        return eh3Var;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.RealCall
    /* JADX INFO: renamed from: e */
    public void mo76676e() throws Exception {
        ArrayList arrayList = new ArrayList(this.f52062b.m186792j());
        arrayList.add(this.f52062b.m186793k());
        new umc0().m196645d(this.f52062b, arrayList, 0, m76677f(), this).mo196642a(m76677f());
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo101382g(eh3 eh3Var, Object obj);

    public rme0() {
    }
}
