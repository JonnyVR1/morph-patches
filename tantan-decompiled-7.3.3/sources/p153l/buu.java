package p153l;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class buu {

    /* JADX INFO: renamed from: a */
    public final knu f78544a;

    /* JADX INFO: renamed from: b */
    public ArrayList<kcg0> f78545b = new ArrayList<>();

    public buu(knu knuVar) {
        this.f78544a = knuVar;
    }

    /* JADX INFO: renamed from: d */
    public void m106540d() {
        jyb.m147537z(this.f78545b, new auu());
    }

    /* JADX INFO: renamed from: e */
    public void m106541e(final int i, final pcj<Boolean> pcjVar, final x20 x20Var) {
        nsh0.m164608j("videoChat", "createWatchDog: " + i);
        this.f78545b.add(this.f78544a.f127641d.duringCreated(new pcj() { // from class: l.xtu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.interval(i, TimeUnit.SECONDS).take(1);
            }
        }, false).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.ytu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) pcjVar.call()).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ztu
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        })));
    }
}
