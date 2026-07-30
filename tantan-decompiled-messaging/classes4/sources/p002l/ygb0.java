package p002l;

import android.net.NetworkInfo;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Map;
import l.bwr;
import l.e30;
import l.f30;
import l.fd50;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.k480;
import l.soj0;
import l.u0t;
import l.v9j;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ygb0 extends h4t<yl40, LivePusherView> implements h1m, i1m {

    /* JADX INFO: renamed from: i */
    public final egb0 f22868i;

    /* JADX INFO: renamed from: j */
    public final eeb0 f22869j;

    /* JADX INFO: renamed from: k */
    public final mzf0 f22870k;

    /* JADX INFO: renamed from: l */
    public final c7l0 f22871l;

    public ygb0(bsm bsmVar, LivePusherView livePusherView) {
        super(bsmVar);
        C(livePusherView);
        this.f22868i = (egb0) z2(new egb0(bsmVar, this));
        this.f22869j = (eeb0) z2(new eeb0(bsmVar, this, ((bwr) this).viewModel));
        this.f22870k = (mzf0) z2(new mzf0(bsmVar));
        this.f22871l = (c7l0) z2(new c7l0(bsmVar, this, (LivePusherView) ((bwr) this).viewModel));
        ((LivePusherView) ((bwr) this).viewModel).setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ Object m26685P3(NetworkInfo networkInfo) {
        return networkInfo == null ? soj0.a : Integer.valueOf(networkInfo.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m26690W3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("live_update_video_quality")) {
            mo10198q1(RefreshCause.UpdateQuality, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m26691Y3(iqv iqvVar) {
        gkh0.j(u0t.b, "start push by living state changed");
        h5j0.INSTANCE.d("live_anchor_call");
        this.f22871l.m10806W3();
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: J */
    public void mo10193J() {
        this.f22868i.m12477R3(4);
        m26699d4(4);
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: N0 */
    public void mo10194N0(int i) {
        if (this.f22869j.m12428J3(i)) {
            return;
        }
        this.f22868i.m12477R3(i);
        m26699d4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m26692T() {
        super.T();
        ((kql) m14184F3(new s0f(2600))).mo12701b(new pbt(this, new v9j() { // from class: l.rgb0
            public final Object call() {
                return Boolean.valueOf(this.f18504a.m26695Z3());
            }
        }));
        duringCreated(((yl40) m25547E2()).m17236l()).filter(new w9j() { // from class: l.sgb0
            public final Object call(Object obj) {
                return this.f19010a.m26696a4((iqv) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.tgb0
            public final void call(Object obj) {
                this.f20227a.m26691Y3((iqv) obj);
            }
        }));
        ((zwl) m14184F3(new tt00(2600))).mo22673y0(new f30() { // from class: l.ugb0
            public final void call(Object obj, Object obj2) {
                this.f20631a.m26697b4((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m26693V3(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f22869j.m12430L3()) {
            mo10198q1(RefreshCause.NetworkStateChange, ((LivePusherView) ((bwr) this).viewModel).getErrorCode());
        } else {
            this.f22869j.m12432r0("no network connection", R$string.f2718F9, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m26694X3(BLive bLive) {
        String str = u0t.b;
        gkh0.j(str, "refreshStreamAddress success, new address:" + ((BLiveAbsData) bLive).streamUrl.push + ", ipv6: " + ((BLiveAbsData) bLive).streamUrl.pushIpv6);
        ((yl40) m25547E2()).m17232g(bLive);
        mo10196d(false);
        if (bLive.isLiving()) {
            this.f22871l.m10806W3();
        } else if (TEnum.equals(((BLiveAbsData) bLive).state, "suspended")) {
            gkh0.j(str, "send recover event");
            m25548F2().LivePusherEvent.recoverLive().p();
        } else {
            gkh0.j(str, "change living state to end");
            ((yl40) m25547E2()).mo17233h(u7s.f20528e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final boolean m26695Z3() {
        boolean z = ((lifecycle_() != c.i && !(lifecycle_() instanceof c.a)) || !((yl40) m25547E2()).m17237m().m15301d() || ((Boolean) m14184F3(new k480(2600))).booleanValue() || ((Boolean) m14184F3(new fd50(2600))).booleanValue() || this.f22036e.f8341j.m24319L3(MotionType.multi_call)) ? false : true;
        gkh0.j(u0t.b, "check push enable: " + z);
        return z;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m26696a4(iqv iqvVar) {
        return Boolean.valueOf(m26695Z3());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m26697b4(String str, String str2) {
        m26700e4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m26698c4(int i, Throwable th) {
        this.f22869j.m12432r0("refresh StreamAddress error", R$string.f2718F9, i);
    }

    @Override // p002l.h1m, p002l.i1m
    /* JADX INFO: renamed from: d */
    public void mo10196d(boolean z) {
        ((LivePusherView) ((bwr) this).viewModel).m5366i(z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m26699d4(final int i) {
        eet.m12448b(this, "anchor_pusher_error", new e30() { // from class: l.ogb0
            public final void call(Object obj) {
                ((Map) obj).put("error_msg", "errorCode:" + i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m26700e4() {
        String strM17235k = ((yl40) m25547E2()).m17235k();
        String strM14576j0 = ((yl40) m25547E2()).m14576j0();
        String strM17239o = ((yl40) m25547E2()).m17239o();
        final String str = "reportStreamingHeartBeat :" + strM17235k + ":" + strM14576j0 + ":" + strM17239o;
        LivingNormalApiProvider.m4805d7(strM17235k, strM14576j0, strM17239o).subscribe(ffw.d(new e30() { // from class: l.xgb0
            public final void call(Object obj) {
                gkh0.j(u0t.b, str);
            }
        }));
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: l */
    public void mo10197l() {
        this.f22868i.m12479T3();
        this.f22869j.m12429K3();
        mo10196d(false);
        this.f22870k.m18322P3();
        this.f22871l.m10809l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.h1m
    /* JADX INFO: renamed from: q1 */
    public void mo10198q1(RefreshCause refreshCause, final int i) {
        this.f22869j.m12429K3();
        mo10196d(true);
        gkh0.j(u0t.b, "retryPushStream cause: " + refreshCause.name() + " extraCode: " + i);
        duringCreated(LivingNormalApiProvider.m4660N6(((yl40) m25547E2()).m17235k(), i, "refresh-stream-address")).subscribe(ffw.e(new e30() { // from class: l.vgb0
            public final void call(Object obj) {
                this.f21119a.m26694X3((BLive) obj);
            }
        }, new e30() { // from class: l.wgb0
            public final void call(Object obj) {
                this.f21745a.m26698c4(i, (Throwable) obj);
            }
        }));
    }

    @Override // p002l.h1m
    /* JADX INFO: renamed from: r0 */
    public void mo10199r0(String str, int i, int i2) {
        this.f22869j.m12432r0(str, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m26701t() {
        super.t();
        ((LivePusherView) ((bwr) this).viewModel).setWaterMarkVisible(true);
        ((LivePusherView) ((bwr) this).viewModel).setWaterMarkUserId(((yl40) m25547E2()).m14582l0().publicId);
        duringCreated(((yl40) m25547E2()).m14592o1(this.f22037f)).subscribe(ffw.d(new e30() { // from class: l.ngb0
            public final void call(Object obj) {
                this.f16017a.m26690W3((LiveControlMessage) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged(new w9j() { // from class: l.pgb0
            public final Object call(Object obj) {
                return ygb0.m26685P3((NetworkInfo) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.qgb0
            public final void call(Object obj) {
                this.f17976a.m26693V3((NetworkInfo) obj);
            }
        }));
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: y */
    public void mo10201y(int i) {
        this.f22869j.m12432r0("onSysError", R$string.f2612Ad, i);
        m26699d4(i);
    }
}
