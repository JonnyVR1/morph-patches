package p002l;

import android.net.NetworkInfo;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.p000p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Map;
import l.bwr;
import l.e30;
import l.f30;
import l.ffw;
import l.gkh0;
import l.h5j0;
import l.soj0;
import l.u0t;
import l.v9j;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b750 extends h4t<x350, OfficialShowPusherView> implements h1m, i1m {

    /* JADX INFO: renamed from: i */
    public final egb0 f8011i;

    /* JADX INFO: renamed from: j */
    public final eeb0 f8012j;

    /* JADX INFO: renamed from: k */
    public final mzf0 f8013k;

    /* JADX INFO: renamed from: l */
    public final n750 f8014l;

    public b750(bsm bsmVar, OfficialShowPusherView officialShowPusherView) {
        super(bsmVar);
        C(officialShowPusherView);
        this.f8011i = (egb0) z2(new egb0(bsmVar, this));
        this.f8012j = (eeb0) z2(new eeb0(bsmVar, this, ((bwr) this).viewModel));
        this.f8013k = (mzf0) z2(new mzf0(bsmVar));
        this.f8014l = (n750) z2(new n750(bsmVar, this, (OfficialShowPusherView) ((bwr) this).viewModel));
        xdl0.M(((bwr) this).viewModel, true);
        ((OfficialShowPusherView) ((bwr) this).viewModel).setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ Object m10180S3(NetworkInfo networkInfo) {
        return networkInfo == null ? soj0.a : Integer.valueOf(networkInfo.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public void m10183V3(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f8012j.m12430L3()) {
            mo10198q1(RefreshCause.NetworkStateChange, ((OfficialShowPusherView) ((bwr) this).viewModel).getErrorCode());
        } else {
            this.f8012j.m12432r0("no network connection", R$string.f2718F9, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m10184W3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("live_update_video_quality")) {
            mo10198q1(RefreshCause.UpdateQuality, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m10185X3(BLive bLive) {
        String str = u0t.b;
        gkh0.j(str, "refreshStreamAddress success, new address:" + ((BLiveAbsData) bLive).streamUrl.push + ",ipv6: " + ((BLiveAbsData) bLive).streamUrl.pushIpv6);
        ((x350) m25547E2()).m17232g(bLive);
        mo10196d(false);
        if (bLive.isLiving()) {
            this.f8014l.m18522O3();
        } else if (TEnum.equals(((BLiveAbsData) bLive).state, "suspended")) {
            gkh0.j(str, "send recover event");
            m25548F2().LivePusherEvent.recoverLive().p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m10186Y3(iqv iqvVar) {
        gkh0.j(u0t.b, "start push by living state changed");
        h5j0.INSTANCE.d("live_anchor_call");
        this.f8014l.m18522O3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public boolean m10187Z3() {
        boolean z = (lifecycle_() == c.i || (lifecycle_() instanceof c.a)) && ((x350) m25547E2()).m17237m().m15301d();
        gkh0.j(u0t.b, "check push enable: " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ Boolean m10188a4(iqv iqvVar) {
        return Boolean.valueOf(m10187Z3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m10189b4(String str, String str2) {
        m10192e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m10190c4(int i, Throwable th) {
        this.f8012j.m12432r0("refresh StreamAddress error", R$string.f2718F9, i);
    }

    /* JADX INFO: renamed from: d4 */
    private void m10191d4(final int i) {
        eet.m12448b(this, "anchor_pusher_error", new e30() { // from class: l.r650
            public final void call(Object obj) {
                ((Map) obj).put("error_msg", "errorCode:" + i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private void m10192e4() {
        String strM17235k = ((x350) m25547E2()).m17235k();
        String strM14576j0 = ((x350) m25547E2()).m14576j0();
        String strM17239o = ((x350) m25547E2()).m17239o();
        final String str = "reportStreamingHeartBeat :" + strM17235k + ":" + strM14576j0 + ":" + strM17239o;
        LivingNormalApiProvider.m4805d7(strM17235k, strM14576j0, strM17239o).subscribe(ffw.d(new e30() { // from class: l.a750
            public final void call(Object obj) {
                gkh0.j(u0t.b, str);
            }
        }));
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: J */
    public void mo10193J() {
        this.f8011i.m12477R3(4);
        m10191d4(4);
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: N0 */
    public void mo10194N0(int i) {
        if (this.f8012j.m12428J3(i)) {
            return;
        }
        this.f8011i.m12477R3(i);
        m10191d4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m10195T() {
        super.T();
        ((kql) m14184F3(new s0f(2600))).mo12701b(new pbt(this, new v9j() { // from class: l.u650
            public final Object call() {
                return Boolean.valueOf(this.f20503a.m10187Z3());
            }
        }));
        duringCreated(((x350) m25547E2()).m17236l()).filter(new w9j() { // from class: l.v650
            public final Object call(Object obj) {
                return this.f21008a.m10188a4((iqv) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.w650
            public final void call(Object obj) {
                this.f21478a.m10186Y3((iqv) obj);
            }
        }));
        ((zwl) m14184F3(new tt00(2600))).mo22673y0(new f30() { // from class: l.x650
            public final void call(Object obj, Object obj2) {
                this.f22137a.m10189b4((String) obj, (String) obj2);
            }
        });
    }

    @Override // p002l.h1m, p002l.i1m
    /* JADX INFO: renamed from: d */
    public void mo10196d(boolean z) {
        ((OfficialShowPusherView) ((bwr) this).viewModel).m9026i(z);
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: l */
    public void mo10197l() {
        this.f8011i.m12479T3();
        this.f8012j.m12429K3();
        mo10196d(false);
        this.f8013k.m18322P3();
        this.f8014l.m18524l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.h1m
    /* JADX INFO: renamed from: q1 */
    public void mo10198q1(RefreshCause refreshCause, final int i) {
        this.f8012j.m12429K3();
        mo10196d(true);
        gkh0.j(u0t.b, "officialshow retryPushStream cause: " + refreshCause.name() + " extraCode: " + i);
        duringCreated(LivingNormalApiProvider.m4660N6(((x350) m25547E2()).m17235k(), i, "official-show-refresh-stream-address")).subscribe(ffw.e(new e30() { // from class: l.y650
            public final void call(Object obj) {
                this.f22681a.m10185X3((BLive) obj);
            }
        }, new e30() { // from class: l.z650
            public final void call(Object obj) {
                this.f23274a.m10190c4(i, (Throwable) obj);
            }
        }));
    }

    @Override // p002l.h1m
    /* JADX INFO: renamed from: r0 */
    public void mo10199r0(String str, int i, int i2) {
        this.f8012j.m12432r0(str, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m10200t() {
        super.t();
        ((OfficialShowPusherView) ((bwr) this).viewModel).setWaterMarkVisible(true);
        ((OfficialShowPusherView) ((bwr) this).viewModel).setWaterMarkUserId(((x350) m25547E2()).m14582l0().publicId);
        duringCreated(((x350) m25547E2()).m14592o1(this.f22037f)).subscribe(ffw.d(new e30() { // from class: l.q650
            public final void call(Object obj) {
                this.f17821a.m10184W3((LiveControlMessage) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).distinctUntilChanged(new w9j() { // from class: l.s650
            public final Object call(Object obj) {
                return b750.m10180S3((NetworkInfo) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.t650
            public final void call(Object obj) {
                this.f19453a.m10183V3((NetworkInfo) obj);
            }
        }));
    }

    @Override // p002l.i1m
    /* JADX INFO: renamed from: y */
    public void mo10201y(int i) {
        this.f8012j.m12432r0("onSysError", R$string.f2612Ad, i);
        m10191d4(i);
    }
}
