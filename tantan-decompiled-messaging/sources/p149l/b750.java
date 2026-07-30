package p149l;

import android.net.NetworkInfo;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.p046p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b750 extends h4t<x350, OfficialShowPusherView> implements h1m, i1m {

    /* JADX INFO: renamed from: i */
    public final egb0 f73903i;

    /* JADX INFO: renamed from: j */
    public final eeb0 f73904j;

    /* JADX INFO: renamed from: k */
    public final mzf0 f73905k;

    /* JADX INFO: renamed from: l */
    public final n750 f73906l;

    /* JADX WARN: Multi-variable type inference failed */
    public b750(bsm bsmVar, OfficialShowPusherView officialShowPusherView) {
        super(bsmVar);
        mo51532C(officialShowPusherView);
        this.f73903i = (egb0) m144512z2(new egb0(bsmVar, this));
        this.f73904j = (eeb0) m144512z2(new eeb0(bsmVar, this, (k1m) this.viewModel));
        this.f73905k = (mzf0) m144512z2(new mzf0(bsmVar));
        this.f73906l = (n750) m144512z2(new n750(bsmVar, this, (OfficialShowPusherView) this.viewModel));
        xdl0.m208344M((View) this.viewModel, true);
        ((OfficialShowPusherView) this.viewModel).setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ Object m100504S3(NetworkInfo networkInfo) {
        return networkInfo == null ? soj0.f165695a : Integer.valueOf(networkInfo.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public void m100507V3(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f73904j.m115961L3()) {
            mo100521q1(RefreshCause.NetworkStateChange, ((OfficialShowPusherView) this.viewModel).getErrorCode());
        } else {
            this.f73904j.m115963r0("no network connection", R$string.f46676F9, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m100508W3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("live_update_video_quality")) {
            mo100521q1(RefreshCause.UpdateQuality, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m100509X3(BLive bLive) {
        String str = u0t.f172943b;
        gkh0.m126627j(str, "refreshStreamAddress success, new address:" + bLive.streamUrl.push + ",ipv6: " + bLive.streamUrl.pushIpv6);
        ((x350) m206027E2()).mo149811g(bLive);
        mo100519d(false);
        if (bLive.isLiving()) {
            this.f73906l.m158115O3();
        } else if (TEnum.equals(bLive.state, "suspended")) {
            gkh0.m126627j(str, "send recover event");
            m206028F2().LivePusherEvent.recoverLive().m172467p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m100510Y3(iqv iqvVar) {
        gkh0.m126627j(u0t.f172943b, "start push by living state changed");
        h5j0.INSTANCE.m129405d("live_anchor_call");
        this.f73906l.m158115O3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public boolean m100511Z3() {
        boolean z = (lifecycle_() == C4319c.f15548i || (lifecycle_() instanceof C4319c.a)) && ((x350) m206027E2()).m149816m().m137797d();
        gkh0.m126627j(u0t.f172943b, "check push enable: " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ Boolean m100512a4(iqv iqvVar) {
        return Boolean.valueOf(m100511Z3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m100513b4(String str, String str2) {
        m100516e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m100514c4(int i, Throwable th) {
        this.f73904j.m115963r0("refresh StreamAddress error", R$string.f46676F9, i);
    }

    /* JADX INFO: renamed from: d4 */
    private void m100515d4(final int i) {
        eet.m116003b(this, "anchor_pusher_error", new e30() { // from class: l.r650
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("error_msg", "errorCode:" + i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private void m100516e4() {
        String strM149814k = ((x350) m206027E2()).m149814k();
        String strM132140j0 = ((x350) m206027E2()).m132140j0();
        String strM149818o = ((x350) m206027E2()).m149818o();
        final String str = "reportStreamingHeartBeat :" + strM149814k + ":" + strM132140j0 + ":" + strM149818o;
        LivingNormalApiProvider.m71439d7(strM149814k, strM132140j0, strM149818o).subscribe(ffw.m121193d(new e30() { // from class: l.a750
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j(u0t.f172943b, str);
            }
        }));
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: J */
    public void mo100517J() {
        this.f73903i.m116244R3(4);
        m100515d4(4);
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: N0 */
    public void mo100518N0(int i) {
        if (this.f73904j.m115959J3(i)) {
            return;
        }
        this.f73903i.m116244R3(i);
        m100515d4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((kql) m129297F3(new s0f(2600))).mo118144b(new pbt(this, new v9j() { // from class: l.u650
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f174797a.m100511Z3());
            }
        }));
        duringCreated(((x350) m206027E2()).m149815l()).filter(new w9j() { // from class: l.v650
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180156a.m100512a4((iqv) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.w650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184810a.m100510Y3((iqv) obj);
            }
        }));
        ((zwl) m129297F3(new tt00(2600))).mo185843y0(new f30() { // from class: l.x650
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f191214a.m100513b4((String) obj, (String) obj2);
            }
        });
    }

    @Override // p149l.h1m, p149l.i1m
    /* JADX INFO: renamed from: d */
    public void mo100519d(boolean z) {
        ((OfficialShowPusherView) this.viewModel).m75398i(z);
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: l */
    public void mo100520l() {
        this.f73903i.m116245T3();
        this.f73904j.m115960K3();
        mo100519d(false);
        this.f73905k.m157141P3();
        this.f73906l.m158116l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h1m
    /* JADX INFO: renamed from: q1 */
    public void mo100521q1(RefreshCause refreshCause, final int i) {
        this.f73904j.m115960K3();
        mo100519d(true);
        gkh0.m126627j(u0t.f172943b, "officialshow retryPushStream cause: " + refreshCause.name() + " extraCode: " + i);
        duringCreated(LivingNormalApiProvider.m71294N6(((x350) m206027E2()).m149814k(), i, "official-show-refresh-stream-address")).subscribe(ffw.m121194e(new e30() { // from class: l.y650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196524a.m100509X3((BLive) obj);
            }
        }, new e30() { // from class: l.z650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201887a.m100514c4(i, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.h1m
    /* JADX INFO: renamed from: r0 */
    public void mo100522r0(String str, int i, int i2) {
        this.f73904j.m115963r0(str, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((OfficialShowPusherView) this.viewModel).setWaterMarkVisible(true);
        ((OfficialShowPusherView) this.viewModel).setWaterMarkUserId(((x350) m206027E2()).m132146l0().publicId);
        duringCreated(((x350) m206027E2()).m132156o1(this.f188513f)).subscribe(ffw.m121193d(new e30() { // from class: l.q650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152852a.m100508W3((LiveControlMessage) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged(new w9j() { // from class: l.s650
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return b750.m100504S3((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.t650
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167925a.m100507V3((NetworkInfo) obj);
            }
        }));
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: y */
    public void mo100523y(int i) {
        this.f73904j.m115963r0("onSysError", R$string.f46570Ad, i);
        m100515d4(i);
    }
}
