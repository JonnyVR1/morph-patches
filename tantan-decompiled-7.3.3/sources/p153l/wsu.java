package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes9.dex */
public class wsu {

    /* JADX INFO: renamed from: a */
    public final knu f190693a;

    /* JADX INFO: renamed from: b */
    public kcg0 f190694b;

    public wsu(knu knuVar) {
        this.f190693a = knuVar;
    }

    /* JADX INFO: renamed from: f */
    public final Boolean m207796f(BLiveVideoChat bLiveVideoChat, String str) {
        return Boolean.valueOf(xnu.m212307x(bLiveVideoChat.status) > xnu.m212307x(str));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22421c m207797g(final String str, y20 y20Var, Long l2) {
        return this.f190693a.f127641d.duringCreated(new pcj() { // from class: l.usu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jwu.m147231F(str);
            }
        }, false).filter(new qcj() { // from class: l.vsu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveVideoChat) obj));
            }
        }).doOnError(y20Var).materialize();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m207798h(String str, Notification notification) {
        return m207796f((BLiveVideoChat) notification.m222541f(), str);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m207799i(BLiveVideoChat bLiveVideoChat) {
        m207801k();
    }

    /* JADX INFO: renamed from: j */
    public void m207800j(final int i, final String str, final String str2, y20<BLiveVideoChat> y20Var, final y20<Throwable> y20Var2) {
        psd0.m173633z(this.f190694b);
        nsh0.m164608j("videoChat", "status:" + str2 + ",interval:" + i);
        this.f190694b = this.f190693a.f127641d.duringCreated(new pcj() { // from class: l.osu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.interval(i, TimeUnit.SECONDS);
            }
        }, false).take(30).onBackpressureLatest().observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.psu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153974a.m207797g(str, y20Var2, (Long) obj);
            }
        }).onBackpressureLatest().filter(new f130()).filter(new qsu()).filter(new qcj() { // from class: l.rsu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164730a.m207798h(str2, (Notification) obj);
            }
        }).map(new qcj() { // from class: l.ssu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return (BLiveVideoChat) ((Notification) obj).m222541f();
            }
        }).take(1).doOnNext(new y20() { // from class: l.tsu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176041a.m207799i((BLiveVideoChat) obj);
            }
        }).subscribe(dhw.m115826e(y20Var, y20Var2));
    }

    /* JADX INFO: renamed from: k */
    public void m207801k() {
        nsh0.m164608j("videoChat", " stop looper ");
        psd0.m173633z(this.f190694b);
    }
}
