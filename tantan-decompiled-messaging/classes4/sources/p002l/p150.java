package p002l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.d30;
import l.e30;
import l.ffw;
import l.hfw;
import l.r8d0;
import l.s25;
import l.soj0;
import l.u0t;
import l.w9j;
import l.wq2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p150 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public e0m f16952i;

    /* JADX INFO: renamed from: j */
    public String f16953j;

    public p150(bsm bsmVar, e0m e0mVar) {
        super(bsmVar);
        this.f16953j = "";
        this.f16952i = e0mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public void m19948Z3(BLive bLive, r8d0 r8d0Var) {
        hfw.a(u0t.c, "changeLiveInfo. new address:" + ((wq2) r8d0Var).c.streamUrl.pullFlv + ",ipv6: " + ((wq2) r8d0Var).c.streamUrl.pullFlvIpv6);
        m25548F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        ((pn40) m25547E2()).m14538W(((wq2) r8d0Var).c, TextUtils.equals(((BLiveAbsData) bLive).id, ((wq2) r8d0Var).c.id) ? 0 : 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m19938W3(NetworkInfo networkInfo) {
        m19941e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m19939c4(soj0 soj0Var) {
        m19952i4();
    }

    /* JADX INFO: renamed from: d4 */
    private void m19940d4() {
        m25548F2().FragProxyEvent.initRoomInfo().p();
    }

    /* JADX INFO: renamed from: e4 */
    private void m19941e4() {
        if (this.f16952i.mo10859M0().m26373h()) {
            m19951h4(this.f16952i.mo10859M0().m26367b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public void m19942f4(Throwable th) {
        hfw.a(u0t.c, "refresh address fail");
        this.f16952i.mo10864P0(true, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m19943g4(BLive bLive) {
        if (bLive == null) {
            this.f16952i.mo10864P0(true, "0");
            return;
        }
        hfw.a(u0t.c, "refresh address success:" + ((BLiveAbsData) bLive).streamUrl.pullFlv + ",ipv6: " + ((BLiveAbsData) bLive).streamUrl.pullFlvIpv6);
        int i = ((BLiveAbsData) bLive).id.equals(((pn40) m25547E2()).m17235k()) ? 0 : 2;
        ((pn40) m25547E2()).m17232g(bLive);
        ((pn40) m25547E2()).m14538W(bLive, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m19944j4(Throwable th) {
        this.f16952i.mo10864P0(true, "0");
        hfw.a(u0t.c, " getLiveInfo fail. reason:" + s25.b(th));
    }

    /* JADX INFO: renamed from: T */
    public void m19945T() {
        super.T();
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.j150
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(ffw.d(new e30() { // from class: l.k150
            public final void call(Object obj) {
                this.f14165a.m19938W3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m19946X3() {
        this.f16952i.mo10878m(true);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m19947Y3() {
        this.f16952i.mo10878m(false);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m19949a4() {
        this.f16952i.mo10878m(true);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m19950b4() {
        this.f16952i.mo10878m(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m19951h4(String str) {
        final BLive bLiveMo19690l = ((pn40) m25547E2()).m20501A2().mo19690l();
        if (bLiveMo19690l == null) {
            m19940d4();
        } else {
            this.f16952i.mo10864P0(false, "0");
            duringCreated(LivingNormalApiProvider.m4857j5(bLiveMo19690l, str)).doOnSubscribe(new d30() { // from class: l.m150
                public final void call() {
                    this.f15198a.m19946X3();
                }
            }).doOnUnsubscribe(new d30() { // from class: l.n150
                public final void call() {
                    this.f15780a.m19947Y3();
                }
            }).subscribe(ffw.e(new e30() { // from class: l.o150
                public final void call(Object obj) {
                    this.f16329a.m19948Z3(bLiveMo19690l, (r8d0) obj);
                }
            }, new e30() { // from class: l.f150
                public final void call(Object obj) {
                    this.f10095a.m19944j4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m19952i4() {
        duringCreated(LivingNormalApiProvider.m4651M6(((pn40) m25547E2()).m17235k(), this.f16953j)).doOnSubscribe(new d30() { // from class: l.e150
            public final void call() {
                this.f9514a.m19949a4();
            }
        }).doOnUnsubscribe(new d30() { // from class: l.g150
            public final void call() {
                this.f10718a.m19950b4();
            }
        }).subscribe(ffw.e(new e30() { // from class: l.h150
            public final void call(Object obj) {
                this.f11712a.m19943g4((BLive) obj);
            }
        }, new e30() { // from class: l.i150
            public final void call(Object obj) {
                this.f12391a.m19942f4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m19953t() {
        super.t();
        duringCreated((c) m25548F2().PlayerEvent.refreshPlayAddress().g()).subscribe(ffw.d(new e30() { // from class: l.l150
            public final void call(Object obj) {
                this.f14641a.m19939c4((soj0) obj);
            }
        }));
    }
}
