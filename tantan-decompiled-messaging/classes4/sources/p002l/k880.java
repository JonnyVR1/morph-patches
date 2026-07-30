package p002l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.e30;
import l.ffw;
import l.gkh0;
import l.l3m;
import l.mqi0;
import l.r8d0;
import l.s25;
import l.soj0;
import l.u0t;
import l.w9j;
import l.wq2;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k880 extends pat<pn40> implements l3m {

    /* JADX INFO: renamed from: i */
    public e0m f14235i;

    /* JADX INFO: renamed from: j */
    public int f14236j;

    /* JADX INFO: renamed from: k */
    public long f14237k;

    /* JADX INFO: renamed from: l */
    public String f14238l;

    public k880(bsm bsmVar, e0m e0mVar) {
        super(bsmVar);
        this.f14236j = 0;
        this.f14237k = 0L;
        this.f14238l = "";
        this.f14235i = e0mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public final void m16529T3(BLive bLive, r8d0 r8d0Var) {
        gkh0.j(u0t.c, "changeLiveInfo. new address:" + ((wq2) r8d0Var).c.streamUrl.pullFlv + ", ipv6 " + ((wq2) r8d0Var).c.streamUrl.pullFlvIpv6);
        m25548F2().FragProxyEvent.changeRoomData().j(r8d0Var);
        ((pn40) m25547E2()).m14538W(((wq2) r8d0Var).c, TextUtils.equals(((BLiveAbsData) bLive).id, ((wq2) r8d0Var).c.id) ? 0 : 2);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m16527S3(NetworkInfo networkInfo) {
        m16532W3();
    }

    /* JADX INFO: renamed from: T */
    public void m16528T() {
        super.T();
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.g880
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(ffw.d(new e30() { // from class: l.h880
            public final void call(Object obj) {
                this.f11938a.m16527S3((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m16530U3(soj0 soj0Var) {
        m16536a4();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m16531V3() {
        m25548F2().FragProxyEvent.initRoomInfo().p();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m16532W3() {
        if (this.f14235i.mo10859M0().m26373h()) {
            m16535Z3(this.f14235i.mo10859M0().m26367b());
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m16533X3(Throwable th) {
        gkh0.j(u0t.c, "refresh address fail");
        this.f14235i.mo10864P0(true, "0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m16534Y3(BLive bLive) {
        if (bLive == null) {
            this.f14235i.mo10864P0(true, "0");
            return;
        }
        gkh0.j(u0t.c, "refresh address success:" + ((BLiveAbsData) bLive).streamUrl.pullFlv + ", ipv6: " + ((BLiveAbsData) bLive).streamUrl.pullFlvIpv6);
        int i = ((BLiveAbsData) bLive).id.equals(((pn40) m25547E2()).m17235k()) ? 0 : 2;
        ((pn40) m25547E2()).m17232g(bLive);
        ((pn40) m25547E2()).m14538W(bLive, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public void m16535Z3(String str) {
        this.f14236j = 0;
        this.f14237k = mqi0.o();
        final BLive bLiveMo19690l = ((pn40) m25547E2()).m20501A2().mo19690l();
        if (bLiveMo19690l == null) {
            m16531V3();
        } else {
            this.f14235i.mo10864P0(false, "0");
            duringCreated(LivingNormalApiProvider.m4857j5(bLiveMo19690l, str)).subscribe(ffw.e(new e30() { // from class: l.d880
                public final void call(Object obj) {
                    this.f9094a.m16529T3(bLiveMo19690l, (r8d0) obj);
                }
            }, new e30() { // from class: l.e880
                public final void call(Object obj) {
                    this.f9622a.m16537b4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m16536a4() {
        duringCreated(LivingNormalApiProvider.m4651M6(((pn40) m25547E2()).m17235k(), this.f14238l)).subscribe(ffw.e(new e30() { // from class: l.i880
            public final void call(Object obj) {
                this.f13101a.m16534Y3((BLive) obj);
            }
        }, new e30() { // from class: l.j880
            public final void call(Object obj) {
                this.f13634a.m16533X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m16537b4(Throwable th) {
        this.f14235i.mo10864P0(true, "0");
        gkh0.j(u0t.c, " getLiveInfo fail. reason:" + s25.b(th));
    }

    /* JADX INFO: renamed from: c4 */
    public void m16538c4() {
        int i = this.f14236j + 1;
        this.f14236j = i;
        if (i < ypv.k().X4()) {
            m16536a4();
        } else {
            this.f14235i.mo10864P0(true, "0");
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m16539d4(String str) {
        this.f14238l = str;
    }

    /* JADX INFO: renamed from: t */
    public void m16540t() {
        super.t();
        duringCreated((c) m25548F2().PlayerEvent.refreshPlayAddress().g()).subscribe(ffw.d(new e30() { // from class: l.f880
            public final void call(Object obj) {
                this.f10185a.m16530U3((soj0) obj);
            }
        }));
    }
}
