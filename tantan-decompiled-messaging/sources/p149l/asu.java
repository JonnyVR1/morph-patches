package p149l;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class asu {

    /* JADX INFO: renamed from: a */
    public final jlu f71481a;

    /* JADX INFO: renamed from: b */
    public ArrayList<c4g0> f71482b = new ArrayList<>();

    public asu(jlu jluVar) {
        this.f71481a = jluVar;
    }

    /* JADX INFO: renamed from: d */
    public void m98614d() {
        vwb.m200354z(this.f71482b, new zru());
    }

    /* JADX INFO: renamed from: e */
    public void m98615e(final int i, final v9j<Boolean> v9jVar, final d30 d30Var) {
        gkh0.m126627j("videoChat", "createWatchDog: " + i);
        this.f71482b.add(this.f71481a.f118587d.duringCreated(new v9j() { // from class: l.wru
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.interval(i, TimeUnit.SECONDS).take(1);
            }
        }, false).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.xru
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) v9jVar.call()).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.yru
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        })));
    }
}
