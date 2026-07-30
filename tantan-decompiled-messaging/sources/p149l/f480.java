package p149l;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class f480 {

    /* JADX INFO: renamed from: a */
    public final bsm f94743a;

    /* JADX INFO: renamed from: b */
    public ArrayList<c4g0> f94744b = new ArrayList<>();

    public f480(bsm bsmVar) {
        this.f94743a = bsmVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Long m119288c(Long l2) {
        return (Long) ht70.m132852i("watchDog execute callback", l2);
    }

    /* JADX INFO: renamed from: d */
    public void m119289d() {
        vwb.m200354z(this.f94744b, new zru());
    }

    /* JADX INFO: renamed from: e */
    public void m119290e(final v9j<Boolean> v9jVar, final d30 d30Var) {
        ht70.m132853j("createWatchDog");
        bsm bsmVar = this.f94743a;
        this.f94744b.add(bsmVar.f77101g.duringCreated(bsmVar.f77102h.m132135h2(30, TimeUnit.SECONDS).take(1)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.c480
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) v9jVar.call()).booleanValue());
            }
        }).map(new w9j() { // from class: l.d480
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f480.m119288c((Long) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.e480
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        })));
    }
}
