package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes4.dex */
public class p150 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public e0m f146652i;

    /* JADX INFO: renamed from: j */
    public String f146653j;

    public p150(bsm bsmVar, e0m e0mVar) {
        super(bsmVar);
        this.f146653j = "";
        this.f146652i = e0mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public void m167048Z3(BLive bLive, r8d0 r8d0Var) {
        hfw.m130790a(u0t.f172944c, "changeLiveInfo. new address:" + r8d0Var.f187610c.streamUrl.pullFlv + ",ipv6: " + r8d0Var.f187610c.streamUrl.pullFlvIpv6);
        m206028F2().FragProxyEvent.changeRoomData().mo172463j(r8d0Var);
        ((pn40) m206027E2()).m132102W(r8d0Var.f187610c, TextUtils.equals(bLive.f44323id, r8d0Var.f187610c.f44323id) ? 0 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m167039W3(NetworkInfo networkInfo) {
        m167042e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m167040c4(soj0 soj0Var) {
        m167052i4();
    }

    /* JADX INFO: renamed from: d4 */
    private void m167041d4() {
        m206028F2().FragProxyEvent.initRoomInfo().m172467p();
    }

    /* JADX INFO: renamed from: e4 */
    private void m167042e4() {
        if (this.f146652i.mo105721M0().m213101h()) {
            m167051h4(this.f146652i.mo105721M0().m213095b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public void m167043f4(Throwable th) {
        hfw.m130790a(u0t.f172944c, "refresh address fail");
        this.f146652i.mo105724P0(true, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m167044g4(BLive bLive) {
        if (bLive == null) {
            this.f146652i.mo105724P0(true, "0");
            return;
        }
        hfw.m130790a(u0t.f172944c, "refresh address success:" + bLive.streamUrl.pullFlv + ",ipv6: " + bLive.streamUrl.pullFlvIpv6);
        int i = bLive.f44323id.equals(((pn40) m206027E2()).m149814k()) ? 0 : 2;
        ((pn40) m206027E2()).mo149811g(bLive);
        ((pn40) m206027E2()).m132102W(bLive, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m167045j4(Throwable th) {
        this.f146652i.mo105724P0(true, "0");
        hfw.m130790a(u0t.f172944c, " getLiveInfo fail. reason:" + s25.m182057b(th));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.j150
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.k150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120539a.m167039W3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m167046X3() {
        this.f146652i.mo105733m(true);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m167047Y3() {
        this.f146652i.mo105733m(false);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m167049a4() {
        this.f146652i.mo105733m(true);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m167050b4() {
        this.f146652i.mo105733m(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m167051h4(String str) {
        final BLive bLiveMo165470l = ((pn40) m206027E2()).m170393A2().mo165470l();
        if (bLiveMo165470l == null) {
            m167041d4();
        } else {
            this.f146652i.mo105724P0(false, "0");
            duringCreated(LivingNormalApiProvider.m71491j5(bLiveMo165470l, str)).doOnSubscribe(new d30() { // from class: l.m150
                @Override // p149l.d30
                public final void call() {
                    this.f130800a.m167046X3();
                }
            }).doOnUnsubscribe(new d30() { // from class: l.n150
                @Override // p149l.d30
                public final void call() {
                    this.f136614a.m167047Y3();
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.o150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141405a.m167048Z3(bLiveMo165470l, (r8d0) obj);
                }
            }, new e30() { // from class: l.f150
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94043a.m167045j4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m167052i4() {
        duringCreated(LivingNormalApiProvider.m71285M6(((pn40) m206027E2()).m149814k(), this.f146653j)).doOnSubscribe(new d30() { // from class: l.e150
            @Override // p149l.d30
            public final void call() {
                this.f88710a.m167049a4();
            }
        }).doOnUnsubscribe(new d30() { // from class: l.g150
            @Override // p149l.d30
            public final void call() {
                this.f100118a.m167050b4();
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.h150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105281a.m167044g4((BLive) obj);
            }
        }, new e30() { // from class: l.i150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110421a.m167043f4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().PlayerEvent.refreshPlayAddress().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.l150
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125615a.m167040c4((soj0) obj);
            }
        }));
    }
}
