package p002l;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p000p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import l.e30;
import l.e51;
import l.ffw;
import l.h5j0;
import l.osi0;
import l.rwb;
import l.uvr;
import l.vdt;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class egd0 extends pat<am40> {

    /* JADX INFO: renamed from: i */
    public final RoomPusherView f9750i;

    /* JADX INFO: renamed from: j */
    public final LivePlayerView f9751j;

    /* JADX INFO: renamed from: k */
    public int f9752k;

    /* JADX INFO: renamed from: l */
    public final Runnable f9753l;

    /* JADX INFO: renamed from: m */
    public final Gson f9754m;

    /* JADX INFO: renamed from: n */
    public rwb f9755n;

    /* JADX INFO: renamed from: o */
    public ufd0 f9756o;

    /* JADX INFO: renamed from: p */
    public BLiveRtcToken f9757p;

    /* JADX INFO: renamed from: q */
    public ww00 f9758q;

    /* JADX WARN: Multi-variable type inference failed */
    public egd0(bsm<am40> bsmVar, RoomPusherView roomPusherView, LiveRtcPlayErrorView liveRtcPlayErrorView, LivePlayerView livePlayerView) {
        super(bsmVar);
        this.f9752k = 0;
        this.f9753l = new Runnable() { // from class: l.xfd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22254a.m12489b4();
            }
        };
        this.f9755n = new rwb(-1, -1, 0.0f);
        this.f9750i = roomPusherView;
        this.f9751j = livePlayerView;
        this.f9754m = new Gson();
        this.f9758q = (ww00) z2(new ww00(bsmVar));
        this.f9756o = (ufd0) z2(new ufd0(bsmVar, liveRtcPlayErrorView, this));
        ((am40) m25547E2()).m9887P2(false);
        ((am40) m25547E2()).m9885N2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m12489b4() {
        m12504g4(false);
    }

    /* JADX INFO: renamed from: f4 */
    private void m12490f4() {
        fgd0.m13158a("rtc拉流成功 停止播放器pausePlayer");
        m25548F2().PlayerEvent.pausePlay().p();
        m25548F2().PlayerEvent.playerVisible().j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m12491S3() {
        LivePlayerView livePlayerView = this.f9751j;
        if (livePlayerView == null || !livePlayerView.m5307j()) {
            return;
        }
        m25548F2().PlayerEvent.showLoading().j(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m12492T() {
        super.T();
        duringCreated((c) m25548F2().PlayerEvent.reqRtcToken().g()).subscribe(ffw.d(new e30() { // from class: l.vfd0
            public final void call(Object obj) {
                this.f21102a.m12499Z3((BLive) obj);
            }
        }));
        duringCreated(((am40) m25547E2()).m17236l()).subscribe(ffw.d(new e30() { // from class: l.wfd0
            public final void call(Object obj) {
                this.f21717a.m12495V3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final c<BLiveRtcToken> m12493T3(String str, String str2, String str3) {
        return LivingNormalApiProvider.m4913p7(str, str2, str3, "", "audience");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m12494U3(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f9754m.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        int i = mMLiveTranscoding.ctyp;
        int i2 = this.f9755n.a;
        if (i != i2) {
            this.f9755n = new rwb(i, i2, mMLiveTranscoding.ts, bLiveCallVolume == null ? 0 : bLiveCallVolume.mode);
            e51.M(new Runnable() { // from class: l.dgd0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9214a.m12500a4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m12495V3(iqv iqvVar) {
        if (iqvVar.m15298a() != 4) {
            return;
        }
        hy00 hy00Var = (hy00) m14184F3(new rv00(3400));
        if (hy00Var != null && hy00Var.mo14924a() != null && (hy00Var.mo14924a() instanceof ygd0)) {
            ((ygd0) hy00Var.mo14924a()).m26713p1();
        }
        this.f9755n = new rwb(-1, -1, 0.0f);
        m25548F2().PlayerEvent.audienceCtypData().j(this.f9755n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public y74 m12496W3(y74 y74Var) {
        int iM26414b = y74Var.m26414b();
        if (iM26414b == 1) {
            m12504g4(y74Var.m26422j());
            return y74Var;
        }
        if (iM26414b == 6) {
            this.f9752k = 0;
            this.f9756o.m23441K3();
            m12491S3();
            e51.J(this.f9753l);
            return y74Var;
        }
        if (iM26414b != 16) {
            switch (iM26414b) {
                case ExpLoopInputType.PROFESSION /* 12 */:
                    m12506i4();
                    break;
                case ExpLoopInputType.HEIGHT /* 13 */:
                    m12490f4();
                    e51.J(this.f9753l);
                    h5j0 h5j0Var = h5j0.INSTANCE;
                    h5j0Var.a("live_enter_room_rtc", "get first video frame");
                    h5j0Var.a("live_swipe_in_room_rtc", "get first video frame");
                    q880.m21065e(this);
                    break;
                case ExpLoopInputType.SIGNATURE /* 14 */:
                    m12494U3(y74Var.m26417e());
                    this.f9756o.m23441K3();
                    m12491S3();
                    break;
            }
            return y74Var;
        }
        if (((am40) m25547E2()).m17241r()) {
            this.f9756o.m23443M3();
            return y74Var;
        }
        return y74Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final boolean m12497X3() {
        BLiveStreamUrl bLiveStreamUrl;
        BLive bLiveMo19690l = ((am40) m25547E2()).m20501A2().mo19690l();
        return (bLiveMo19690l == null || (bLiveStreamUrl = ((BLiveAbsData) bLiveMo19690l).streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv) || vdt.b(2) || !rht.m21994a(((BLiveAbsData) bLiveMo19690l).streamUrl.pullFlv, "rtc")) ? false : true;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m12498Y3(BLiveRtcToken bLiveRtcToken) {
        this.f9757p = bLiveRtcToken;
        fgd0.m13158a("提前获取到token");
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m12499Z3(BLive bLive) {
        o2(m12493T3(((BLiveAbsData) bLive).room.id, "live", bLive.rtcInfo.provider), false).subscribe(ffw.d(new e30() { // from class: l.zfd0
            public final void call(Object obj) {
                this.f23372a.m12498Y3((BLiveRtcToken) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m12500a4() {
        m25548F2().PlayerEvent.audienceCtypData().j(this.f9755n);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m12501c4(boolean z, BLiveRtcToken bLiveRtcToken) {
        if (z) {
            this.f9758q.m25535a4(bLiveRtcToken);
        } else {
            m12508k4(bLiveRtcToken);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m12502d4(Throwable th) {
        m12506i4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m12503e4(Boolean bool) {
        if (bool.booleanValue()) {
            if (((am40) m25547E2()).m9883L2()) {
                return;
            }
            fgd0.m13158a("收到播放event");
            m12504g4(false);
            return;
        }
        if (((am40) m25547E2()).m9883L2()) {
            fgd0.m13158a("收到停止播放event");
            m12505h4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m12504g4(final boolean z) {
        ((am40) m25547E2()).m9887P2(true);
        BLive bLiveMo19690l = ((am40) m25547E2()).m20501A2().mo19690l();
        fgd0.m13158a("reqRtcTokenAndStartPlay pkinfo:" + bLiveMo19690l.pkInfo);
        o2(m12493T3(((am40) m25547E2()).m17239o(), "live", bLiveMo19690l.rtcInfo.provider), false).subscribe(ffw.e(new e30() { // from class: l.agd0
            public final void call(Object obj) {
                this.f7591a.m12501c4(z, (BLiveRtcToken) obj);
            }
        }, new e30() { // from class: l.bgd0
            public final void call(Object obj) {
                this.f8114a.m12502d4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m12505h4() {
        osi0.g("观众退出rtc");
        m12509l4();
        fgd0.m13158a("stopMotion restartPlayer 降级到播放器拉流");
        m25548F2().PlayerEvent.restorePlayerView().p();
        m25548F2().PlayerEvent.restartPlay().p();
        m25548F2().PlayerEvent.playerVisible().j(Boolean.TRUE);
        this.f9750i.setVisible(false);
        this.f9756o.m23441K3();
        ((am40) m25547E2()).m9887P2(false);
        e51.J(this.f9753l);
        this.f9752k = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m12506i4() {
        fgd0.m13158a("重试  重试次数：" + this.f9752k);
        int i = this.f9752k;
        this.f9752k = i + 1;
        if (i >= uvr.d().J0()) {
            ((am40) m25547E2()).m9885N2(true);
            m12505h4();
        } else {
            if (e51.o(this.f9753l)) {
                return;
            }
            e51.H(act(), this.f9753l, 2000L);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m12507j4(hy00 hy00Var) {
        hy00Var.m14937n(new y74.InterfaceC0911a() { // from class: l.cgd0
            @Override // p002l.y74.InterfaceC0911a
            /* JADX INFO: renamed from: a */
            public final y74 mo11030a(y74 y74Var) {
                return this.f8659a.m12496W3(y74Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m12508k4(BLiveRtcToken bLiveRtcToken) {
        this.f9750i.setVisible(true);
        ((am40) m25547E2()).m9887P2(true);
        fgd0.m13158a(" startMotion");
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.c("live_enter_room_rtc", "startMotion");
        h5j0Var.c("live_swipe_in_room_rtc", "startMotion");
        hy00 hy00Var = (hy00) m14184F3(new rv00(3400));
        m12507j4(hy00Var);
        String strM17239o = ((am40) m25547E2()).m17239o();
        String strM14576j0 = ((am40) m25547E2()).m14576j0();
        String str = bLiveRtcToken.appId;
        String strValueOf = String.valueOf(((am40) m25547E2()).m17234j().streamCdnInfo.provider);
        String str2 = bLiveRtcToken.channelKey;
        String str3 = bLiveRtcToken.channel;
        String str4 = bLiveRtcToken.rtcProvider;
        String str5 = bLiveRtcToken.userSig;
        RoomPusherView roomPusherView = this.f9750i;
        hy00Var.mo14927d(new zgd0(strM17239o, strM14576j0, str, strValueOf, str2, str3, str4, str5, roomPusherView.a, roomPusherView.b, ((am40) m25547E2()).m20501A2().mo19690l().pkInfo));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m12509l4() {
        hy00 hy00Var = (hy00) m14184F3(new rv00(3400));
        if (hy00Var == null || hy00Var.mo14924a() == null || !(hy00Var.mo14924a() instanceof ygd0)) {
            return;
        }
        hy00Var.mo14925b();
        fgd0.m13158a(" stopMotion");
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        e51.J(this.f9753l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m12510t() {
        super.t();
        this.f9756o.m23441K3();
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.c("live_enter_room_rtc", "validState");
        h5j0Var.c("live_swipe_in_room_rtc", "validState");
        duringCreated((c) m25548F2().PlayerEvent.audienceRtcPull().g()).subscribe(ffw.d(new e30() { // from class: l.yfd0
            public final void call(Object obj) {
                this.f22844a.m12503e4((Boolean) obj);
            }
        }));
        fgd0.m13158a("audience rtc开关：" + m12497X3() + "  isPlaying:" + ((am40) m25547E2()).m9883L2());
        if (!m12497X3() || ((am40) m25547E2()).m9883L2()) {
            return;
        }
        BLiveRtcToken bLiveRtcToken = this.f9757p;
        if (bLiveRtcToken != null) {
            m12508k4(bLiveRtcToken);
        } else {
            m12504g4(false);
        }
    }
}
