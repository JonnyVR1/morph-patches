package p153l;

import android.net.NetworkInfo;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.p051p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class qf50 extends i6t<mc50, OfficialShowPusherView> implements a4m, b4m {

    /* JADX INFO: renamed from: i */
    public final iob0 f157241i;

    /* JADX INFO: renamed from: j */
    public final imb0 f157242j;

    /* JADX INFO: renamed from: k */
    public final t7g0 f157243k;

    /* JADX INFO: renamed from: l */
    public final cg50 f157244l;

    /* JADX WARN: Multi-variable type inference failed */
    public qf50(dum dumVar, OfficialShowPusherView officialShowPusherView) {
        super(dumVar);
        mo52715C(officialShowPusherView);
        this.f157241i = (iob0) m153103z2(new iob0(dumVar, this));
        this.f157242j = (imb0) m153103z2(new imb0(dumVar, this, (d4m) this.viewModel));
        this.f157243k = (t7g0) m153103z2(new t7g0(dumVar));
        this.f157244l = (cg50) m153103z2(new cg50(dumVar, this, (OfficialShowPusherView) this.viewModel));
        bnl0.m105524M((View) this.viewModel, true);
        ((OfficialShowPusherView) this.viewModel).setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ Object m176311S3(NetworkInfo networkInfo) {
        return networkInfo == null ? vxj0.f186265a : Integer.valueOf(networkInfo.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public void m176314V3(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f157242j.m140900L3()) {
            mo95984q1(RefreshCause.NetworkStateChange, ((OfficialShowPusherView) this.viewModel).getErrorCode());
        } else {
            this.f157242j.m140902r0("no network connection", R$string.f47524F9, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m176315W3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("live_update_video_quality")) {
            mo95984q1(RefreshCause.UpdateQuality, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m176316X3(BLive bLive) {
        String str = v2t.f182112b;
        nsh0.m164608j(str, "refreshStreamAddress success, new address:" + bLive.streamUrl.push + ",ipv6: " + bLive.streamUrl.pushIpv6);
        ((mc50) m213810E2()).mo183431g(bLive);
        mo95983d(false);
        if (bLive.isLiving()) {
            this.f157244l.m109682O3();
        } else if (TEnum.equals(bLive.state, "suspended")) {
            nsh0.m164608j(str, "send recover event");
            m213811F2().LivePusherEvent.recoverLive().m199277p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m176317Y3(jsv jsvVar) {
        nsh0.m164608j(v2t.f182112b, "start push by living state changed");
        lej0.INSTANCE.m153910d("live_anchor_call");
        this.f157244l.m109682O3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public boolean m176318Z3() {
        boolean z = (lifecycle_() == C4470c.f16267i || (lifecycle_() instanceof C4470c.a)) && ((mc50) m213810E2()).m202193m().m146878d();
        nsh0.m164608j(v2t.f182112b, "check push enable: " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ Boolean m176319a4(jsv jsvVar) {
        return Boolean.valueOf(m176318Z3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m176320b4(String str, String str2) {
        m176323e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m176321c4(int i, Throwable th) {
        this.f157242j.m140902r0("refresh StreamAddress error", R$string.f47524F9, i);
    }

    /* JADX INFO: renamed from: d4 */
    private void m176322d4(final int i) {
        fgt.m125530b(this, "anchor_pusher_error", new y20() { // from class: l.gf50
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("error_msg", "errorCode:" + i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private void m176323e4() {
        String strM202191k = ((mc50) m213810E2()).m202191k();
        String strM168526j0 = ((mc50) m213810E2()).m168526j0();
        String strM202194o = ((mc50) m213810E2()).m202194o();
        final String str = "reportStreamingHeartBeat :" + strM202191k + ":" + strM168526j0 + ":" + strM202194o;
        LivingNormalApiProvider.m72622d7(strM202191k, strM168526j0, strM202194o).subscribe(dhw.m115825d(new y20() { // from class: l.pf50
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j(v2t.f182112b, str);
            }
        }));
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: J */
    public void mo102470J() {
        this.f157241i.m141291R3(4);
        m176322d4(4);
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: N0 */
    public void mo102471N0(int i) {
        if (this.f157242j.m140898J3(i)) {
            return;
        }
        this.f157241i.m141291R3(i);
        m176322d4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((wsl) m138856F3(new w1f(2600))).mo161149b(new qdt(this, new pcj() { // from class: l.jf50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f120566a.m176318Z3());
            }
        }));
        duringCreated(((mc50) m213810E2()).m202192l()).filter(new qcj() { // from class: l.kf50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126249a.m176319a4((jsv) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.lf50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131808a.m176317Y3((jsv) obj);
            }
        }));
        ((szl) m138856F3(new c210(2600))).mo101606y0(new z20() { // from class: l.mf50
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136614a.m176320b4((String) obj, (String) obj2);
            }
        });
    }

    @Override // p153l.a4m, p153l.b4m
    /* JADX INFO: renamed from: d */
    public void mo95983d(boolean z) {
        ((OfficialShowPusherView) this.viewModel).m76581i(z);
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: l */
    public void mo102472l() {
        this.f157241i.m141292T3();
        this.f157242j.m140899K3();
        mo95983d(false);
        this.f157243k.m189573P3();
        this.f157244l.m109683l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.a4m
    /* JADX INFO: renamed from: q1 */
    public void mo95984q1(RefreshCause refreshCause, final int i) {
        this.f157242j.m140899K3();
        mo95983d(true);
        nsh0.m164608j(v2t.f182112b, "officialshow retryPushStream cause: " + refreshCause.name() + " extraCode: " + i);
        duringCreated(LivingNormalApiProvider.m72477N6(((mc50) m213810E2()).m202191k(), i, "official-show-refresh-stream-address")).subscribe(dhw.m115826e(new y20() { // from class: l.nf50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141711a.m176316X3((BLive) obj);
            }
        }, new y20() { // from class: l.of50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147039a.m176321c4(i, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.a4m
    /* JADX INFO: renamed from: r0 */
    public void mo95985r0(String str, int i, int i2) {
        this.f157242j.m140902r0(str, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((OfficialShowPusherView) this.viewModel).setWaterMarkVisible(true);
        ((OfficialShowPusherView) this.viewModel).setWaterMarkUserId(((mc50) m213810E2()).m168532l0().publicId);
        duringCreated(((mc50) m213810E2()).m168541o1(this.f196919f)).subscribe(dhw.m115825d(new y20() { // from class: l.ff50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98744a.m176315W3((LiveControlMessage) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged(new qcj() { // from class: l.hf50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qf50.m176311S3((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.if50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114647a.m176314V3((NetworkInfo) obj);
            }
        }));
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: y */
    public void mo102473y(int i) {
        this.f157242j.m140902r0("onSysError", R$string.f47418Ad, i);
        m176322d4(i);
    }
}
