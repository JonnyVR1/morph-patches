package p153l;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class lc80 {

    /* JADX INFO: renamed from: a */
    public final dum f131281a;

    /* JADX INFO: renamed from: b */
    public ArrayList<kcg0> f131282b = new ArrayList<>();

    public lc80(dum dumVar) {
        this.f131281a = dumVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Long m153640c(Long l2) {
        return (Long) n180.m161092i("watchDog execute callback", l2);
    }

    /* JADX INFO: renamed from: d */
    public void m153641d() {
        jyb.m147537z(this.f131282b, new auu());
    }

    /* JADX INFO: renamed from: e */
    public void m153642e(final pcj<Boolean> pcjVar, final x20 x20Var) {
        n180.m161093j("createWatchDog");
        dum dumVar = this.f131281a;
        this.f131282b.add(dumVar.f90821g.duringCreated(dumVar.f90822h.m168521h2(30, TimeUnit.SECONDS).take(1)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.ic80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) pcjVar.call()).booleanValue());
            }
        }).map(new qcj() { // from class: l.jc80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return lc80.m153640c((Long) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.kc80
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        })));
    }
}
