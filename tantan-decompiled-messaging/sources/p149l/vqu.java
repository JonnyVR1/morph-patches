package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes13.dex */
public class vqu {

    /* JADX INFO: renamed from: a */
    public final jlu f182677a;

    /* JADX INFO: renamed from: b */
    public c4g0 f182678b;

    public vqu(jlu jluVar) {
        this.f182677a = jluVar;
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m199598f(BLiveVideoChat bLiveVideoChat, String str) {
        return Boolean.valueOf(wlu.m203900x(bLiveVideoChat.status) > wlu.m203900x(str));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22306c m199599g(final String str, e30 e30Var, Long l2) {
        return this.f182677a.f118587d.duringCreated(new v9j() { // from class: l.tqu
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return iuu.m138445F(str);
            }
        }, false).filter(new w9j() { // from class: l.uqu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveVideoChat) obj));
            }
        }).doOnError(e30Var).materialize();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m199600h(String str, Notification notification) {
        return m199598f((BLiveVideoChat) notification.m221295f(), str);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m199601i(BLiveVideoChat bLiveVideoChat) {
        m199603k();
    }

    /* JADX INFO: renamed from: j */
    public void m199602j(final int i, final String str, final String str2, e30<BLiveVideoChat> e30Var, final e30<Throwable> e30Var2) {
        mkd0.m154992z(this.f182678b);
        gkh0.m126627j("videoChat", "status:" + str2 + ",interval:" + i);
        this.f182678b = this.f182677a.f118587d.duringCreated(new v9j() { // from class: l.nqu
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.interval(i, TimeUnit.SECONDS);
            }
        }, false).take(30).onBackpressureLatest().observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.oqu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145194a.m199599g(str, e30Var2, (Long) obj);
            }
        }).onBackpressureLatest().filter(new vs20()).filter(new pqu()).filter(new w9j() { // from class: l.qqu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f155935a.m199600h(str2, (Notification) obj);
            }
        }).map(new w9j() { // from class: l.rqu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return (BLiveVideoChat) ((Notification) obj).m221295f();
            }
        }).take(1).doOnNext(new e30() { // from class: l.squ
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166023a.m199601i((BLiveVideoChat) obj);
            }
        }).subscribe(ffw.m121194e(e30Var, e30Var2));
    }

    /* JADX INFO: renamed from: k */
    public void m199603k() {
        gkh0.m126627j("videoChat", " stop looper ");
        mkd0.m154992z(this.f182678b);
    }
}
