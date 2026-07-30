package p153l;

import android.net.NetworkInfo;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cpb0 extends i6t<mu40, LivePusherView> implements a4m, b4m {

    /* JADX INFO: renamed from: i */
    public final iob0 f82986i;

    /* JADX INFO: renamed from: j */
    public final imb0 f82987j;

    /* JADX INFO: renamed from: k */
    public final t7g0 f82988k;

    /* JADX INFO: renamed from: l */
    public final ggl0 f82989l;

    public cpb0(dum dumVar, LivePusherView livePusherView) {
        super(dumVar);
        mo52715C(livePusherView);
        this.f82986i = (iob0) m153103z2(new iob0(dumVar, this));
        this.f82987j = (imb0) m153103z2(new imb0(dumVar, this, (d4m) this.viewModel));
        this.f82988k = (t7g0) m153103z2(new t7g0(dumVar));
        this.f82989l = (ggl0) m153103z2(new ggl0(dumVar, this, (LivePusherView) this.viewModel));
        ((LivePusherView) this.viewModel).setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ Object m111735P3(NetworkInfo networkInfo) {
        return networkInfo == null ? vxj0.f186265a : Integer.valueOf(networkInfo.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m111740W3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("live_update_video_quality")) {
            mo95984q1(RefreshCause.UpdateQuality, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m111741Y3(jsv jsvVar) {
        nsh0.m164608j(v2t.f182112b, "start push by living state changed");
        lej0.INSTANCE.m153910d("live_anchor_call");
        this.f82989l.m130161W3();
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: J */
    public void mo102470J() {
        this.f82986i.m141291R3(4);
        m111748d4(4);
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: N0 */
    public void mo102471N0(int i) {
        if (this.f82987j.m140898J3(i)) {
            return;
        }
        this.f82986i.m141291R3(i);
        m111748d4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((wsl) m138856F3(new w1f(2600))).mo161149b(new qdt(this, new pcj() { // from class: l.vob0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f185020a.m111744Z3());
            }
        }));
        duringCreated(((mu40) m213810E2()).m202192l()).filter(new qcj() { // from class: l.wob0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f190020a.m111745a4((jsv) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.xob0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195567a.m111741Y3((jsv) obj);
            }
        }));
        ((szl) m138856F3(new c210(2600))).mo101606y0(new z20() { // from class: l.yob0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f200965a.m111746b4((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m111742V3(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f82987j.m140900L3()) {
            mo95984q1(RefreshCause.NetworkStateChange, ((LivePusherView) this.viewModel).getErrorCode());
        } else {
            this.f82987j.m140902r0("no network connection", R$string.f47524F9, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m111743X3(BLive bLive) {
        String str = v2t.f182112b;
        nsh0.m164608j(str, "refreshStreamAddress success, new address:" + bLive.streamUrl.push + ", ipv6: " + bLive.streamUrl.pushIpv6);
        ((mu40) m213810E2()).mo183431g(bLive);
        mo95983d(false);
        if (bLive.isLiving()) {
            this.f82989l.m130161W3();
        } else if (TEnum.equals(bLive.state, "suspended")) {
            nsh0.m164608j(str, "send recover event");
            m213811F2().LivePusherEvent.recoverLive().m199277p();
        } else {
            nsh0.m164608j(str, "change living state to end");
            ((mu40) m213810E2()).mo160116h(v9s.f183031e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final boolean m111744Z3() {
        boolean z = ((lifecycle_() != C4470c.f16267i && !(lifecycle_() instanceof C4470c.a)) || !((mu40) m213810E2()).m202193m().m146878d() || ((Boolean) m138856F3(new qc80(2600))).booleanValue() || ((Boolean) m138856F3(new ml50(2600))).booleanValue() || this.f196918e.f90824j.m209548L3(MotionType.multi_call)) ? false : true;
        nsh0.m164608j(v2t.f182112b, "check push enable: " + z);
        return z;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m111745a4(jsv jsvVar) {
        return Boolean.valueOf(m111744Z3());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m111746b4(String str, String str2) {
        m111749e4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m111747c4(int i, Throwable th) {
        this.f82987j.m140902r0("refresh StreamAddress error", R$string.f47524F9, i);
    }

    @Override // p153l.a4m, p153l.b4m
    /* JADX INFO: renamed from: d */
    public void mo95983d(boolean z) {
        ((LivePusherView) this.viewModel).m73161i(z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m111748d4(final int i) {
        fgt.m125530b(this, "anchor_pusher_error", new y20() { // from class: l.sob0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("error_msg", "errorCode:" + i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m111749e4() {
        String strM202191k = ((mu40) m213810E2()).m202191k();
        String strM168526j0 = ((mu40) m213810E2()).m168526j0();
        String strM202194o = ((mu40) m213810E2()).m202194o();
        final String str = "reportStreamingHeartBeat :" + strM202191k + ":" + strM168526j0 + ":" + strM202194o;
        LivingNormalApiProvider.m72622d7(strM202191k, strM168526j0, strM202194o).subscribe(dhw.m115825d(new y20() { // from class: l.bpb0
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164608j(v2t.f182112b, str);
            }
        }));
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: l */
    public void mo102472l() {
        this.f82986i.m141292T3();
        this.f82987j.m140899K3();
        mo95983d(false);
        this.f82988k.m189573P3();
        this.f82989l.m130164l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.a4m
    /* JADX INFO: renamed from: q1 */
    public void mo95984q1(RefreshCause refreshCause, final int i) {
        this.f82987j.m140899K3();
        mo95983d(true);
        nsh0.m164608j(v2t.f182112b, "retryPushStream cause: " + refreshCause.name() + " extraCode: " + i);
        duringCreated(LivingNormalApiProvider.m72477N6(((mu40) m213810E2()).m202191k(), i, "refresh-stream-address")).subscribe(dhw.m115826e(new y20() { // from class: l.zob0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205309a.m111743X3((BLive) obj);
            }
        }, new y20() { // from class: l.apb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72713a.m111747c4(i, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.a4m
    /* JADX INFO: renamed from: r0 */
    public void mo95985r0(String str, int i, int i2) {
        this.f82987j.m140902r0(str, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((LivePusherView) this.viewModel).setWaterMarkVisible(true);
        ((LivePusherView) this.viewModel).setWaterMarkUserId(((mu40) m213810E2()).m168532l0().publicId);
        duringCreated(((mu40) m213810E2()).m168541o1(this.f196919f)).subscribe(dhw.m115825d(new y20() { // from class: l.rob0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164169a.m111740W3((LiveControlMessage) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).distinctUntilChanged(new qcj() { // from class: l.tob0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cpb0.m111735P3((NetworkInfo) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.uob0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180031a.m111742V3((NetworkInfo) obj);
            }
        }));
    }

    @Override // p153l.b4m
    /* JADX INFO: renamed from: y */
    public void mo102473y(int i) {
        this.f82987j.m140902r0("onSysError", R$string.f47418Ad, i);
        m111748d4(i);
    }
}
