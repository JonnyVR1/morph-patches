package p149l;

import android.net.NetworkInfo;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ygb0 extends h4t<yl40, LivePusherView> implements h1m, i1m {

    /* JADX INFO: renamed from: i */
    public final egb0 f198151i;

    /* JADX INFO: renamed from: j */
    public final eeb0 f198152j;

    /* JADX INFO: renamed from: k */
    public final mzf0 f198153k;

    /* JADX INFO: renamed from: l */
    public final c7l0 f198154l;

    public ygb0(bsm bsmVar, LivePusherView livePusherView) {
        super(bsmVar);
        mo51532C(livePusherView);
        this.f198151i = (egb0) m144512z2(new egb0(bsmVar, this));
        this.f198152j = (eeb0) m144512z2(new eeb0(bsmVar, this, (k1m) this.viewModel));
        this.f198153k = (mzf0) m144512z2(new mzf0(bsmVar));
        this.f198154l = (c7l0) m144512z2(new c7l0(bsmVar, this, (LivePusherView) this.viewModel));
        ((LivePusherView) this.viewModel).setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ Object m214619P3(NetworkInfo networkInfo) {
        return networkInfo == null ? soj0.f165695a : Integer.valueOf(networkInfo.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m214624W3(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("live_update_video_quality")) {
            mo100521q1(RefreshCause.UpdateQuality, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public void m214625Y3(iqv iqvVar) {
        gkh0.m126627j(u0t.f172943b, "start push by living state changed");
        h5j0.INSTANCE.m129405d("live_anchor_call");
        this.f198154l.m105605W3();
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: J */
    public void mo100517J() {
        this.f198151i.m116244R3(4);
        m214632d4(4);
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: N0 */
    public void mo100518N0(int i) {
        if (this.f198152j.m115959J3(i)) {
            return;
        }
        this.f198151i.m116244R3(i);
        m214632d4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((kql) m129297F3(new s0f(2600))).mo118144b(new pbt(this, new v9j() { // from class: l.rgb0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f159237a.m214628Z3());
            }
        }));
        duringCreated(((yl40) m206027E2()).m149815l()).filter(new w9j() { // from class: l.sgb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164382a.m214629a4((iqv) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.tgb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170082a.m214625Y3((iqv) obj);
            }
        }));
        ((zwl) m129297F3(new tt00(2600))).mo185843y0(new f30() { // from class: l.ugb0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f176369a.m214630b4((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final void m214626V3(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected() && this.f198152j.m115961L3()) {
            mo100521q1(RefreshCause.NetworkStateChange, ((LivePusherView) this.viewModel).getErrorCode());
        } else {
            this.f198152j.m115963r0("no network connection", R$string.f46676F9, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m214627X3(BLive bLive) {
        String str = u0t.f172943b;
        gkh0.m126627j(str, "refreshStreamAddress success, new address:" + bLive.streamUrl.push + ", ipv6: " + bLive.streamUrl.pushIpv6);
        ((yl40) m206027E2()).mo149811g(bLive);
        mo100519d(false);
        if (bLive.isLiving()) {
            this.f198154l.m105605W3();
        } else if (TEnum.equals(bLive.state, "suspended")) {
            gkh0.m126627j(str, "send recover event");
            m206028F2().LivePusherEvent.recoverLive().m172467p();
        } else {
            gkh0.m126627j(str, "change living state to end");
            ((yl40) m206027E2()).mo149812h(u7s.f175055e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public final boolean m214628Z3() {
        boolean z = ((lifecycle_() != C4319c.f15548i && !(lifecycle_() instanceof C4319c.a)) || !((yl40) m206027E2()).m149816m().m137797d() || ((Boolean) m129297F3(new k480(2600))).booleanValue() || ((Boolean) m129297F3(new fd50(2600))).booleanValue() || this.f188512e.f77104j.m201577L3(MotionType.multi_call)) ? false : true;
        gkh0.m126627j(u0t.f172943b, "check push enable: " + z);
        return z;
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m214629a4(iqv iqvVar) {
        return Boolean.valueOf(m214628Z3());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m214630b4(String str, String str2) {
        m214633e4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m214631c4(int i, Throwable th) {
        this.f198152j.m115963r0("refresh StreamAddress error", R$string.f46676F9, i);
    }

    @Override // p149l.h1m, p149l.i1m
    /* JADX INFO: renamed from: d */
    public void mo100519d(boolean z) {
        ((LivePusherView) this.viewModel).m71978i(z);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m214632d4(final int i) {
        eet.m116003b(this, "anchor_pusher_error", new e30() { // from class: l.ogb0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("error_msg", "errorCode:" + i);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m214633e4() {
        String strM149814k = ((yl40) m206027E2()).m149814k();
        String strM132140j0 = ((yl40) m206027E2()).m132140j0();
        String strM149818o = ((yl40) m206027E2()).m149818o();
        final String str = "reportStreamingHeartBeat :" + strM149814k + ":" + strM132140j0 + ":" + strM149818o;
        LivingNormalApiProvider.m71439d7(strM149814k, strM132140j0, strM149818o).subscribe(ffw.m121193d(new e30() { // from class: l.xgb0
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126627j(u0t.f172943b, str);
            }
        }));
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: l */
    public void mo100520l() {
        this.f198151i.m116245T3();
        this.f198152j.m115960K3();
        mo100519d(false);
        this.f198153k.m157141P3();
        this.f198154l.m105608l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h1m
    /* JADX INFO: renamed from: q1 */
    public void mo100521q1(RefreshCause refreshCause, final int i) {
        this.f198152j.m115960K3();
        mo100519d(true);
        gkh0.m126627j(u0t.f172943b, "retryPushStream cause: " + refreshCause.name() + " extraCode: " + i);
        duringCreated(LivingNormalApiProvider.m71294N6(((yl40) m206027E2()).m149814k(), i, "refresh-stream-address")).subscribe(ffw.m121194e(new e30() { // from class: l.vgb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181362a.m214627X3((BLive) obj);
            }
        }, new e30() { // from class: l.wgb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186178a.m214631c4(i, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.h1m
    /* JADX INFO: renamed from: r0 */
    public void mo100522r0(String str, int i, int i2) {
        this.f198152j.m115963r0(str, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((LivePusherView) this.viewModel).setWaterMarkVisible(true);
        ((LivePusherView) this.viewModel).setWaterMarkUserId(((yl40) m206027E2()).m132146l0().publicId);
        duringCreated(((yl40) m206027E2()).m132156o1(this.f188513f)).subscribe(ffw.m121193d(new e30() { // from class: l.ngb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138854a.m214624W3((LiveControlMessage) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).distinctUntilChanged(new w9j() { // from class: l.pgb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ygb0.m214619P3((NetworkInfo) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.qgb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154320a.m214626V3((NetworkInfo) obj);
            }
        }));
    }

    @Override // p149l.i1m
    /* JADX INFO: renamed from: y */
    public void mo100523y(int i) {
        this.f198152j.m115963r0("onSysError", R$string.f46570Ad, i);
        m214632d4(i);
    }
}
