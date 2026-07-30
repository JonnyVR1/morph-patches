package p153l;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p051p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class hod0 extends qct<ou40> {

    /* JADX INFO: renamed from: i */
    public final RoomPusherView f110888i;

    /* JADX INFO: renamed from: j */
    public final LivePlayerView f110889j;

    /* JADX INFO: renamed from: k */
    public int f110890k;

    /* JADX INFO: renamed from: l */
    public final Runnable f110891l;

    /* JADX INFO: renamed from: m */
    public final Gson f110892m;

    /* JADX INFO: renamed from: n */
    public fyb f110893n;

    /* JADX INFO: renamed from: o */
    public xnd0 f110894o;

    /* JADX INFO: renamed from: p */
    public BLiveRtcToken f110895p;

    /* JADX INFO: renamed from: q */
    public e510 f110896q;

    /* JADX WARN: Multi-variable type inference failed */
    public hod0(dum<ou40> dumVar, RoomPusherView roomPusherView, LiveRtcPlayErrorView liveRtcPlayErrorView, LivePlayerView livePlayerView) {
        super(dumVar);
        this.f110890k = 0;
        this.f110891l = new Runnable() { // from class: l.aod0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72444a.m136395b4();
            }
        };
        this.f110893n = new fyb(-1, -1, 0.0f);
        this.f110888i = roomPusherView;
        this.f110889j = livePlayerView;
        this.f110892m = new Gson();
        this.f110896q = (e510) m153103z2(new e510(dumVar));
        this.f110894o = (xnd0) m153103z2(new xnd0(dumVar, liveRtcPlayErrorView, this));
        ((ou40) m213810E2()).m169231P2(false);
        ((ou40) m213810E2()).m169229N2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m136395b4() {
        m136409g4(false);
    }

    /* JADX INFO: renamed from: f4 */
    private void m136396f4() {
        iod0.m141294a("rtc拉流成功 停止播放器pausePlayer");
        m213811F2().PlayerEvent.pausePlay().m199277p();
        m213811F2().PlayerEvent.playerVisible().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m136397S3() {
        LivePlayerView livePlayerView = this.f110889j;
        if (livePlayerView == null || !livePlayerView.m73107j()) {
            return;
        }
        m213811F2().PlayerEvent.showLoading().mo199273j(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().PlayerEvent.reqRtcToken().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ynd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200820a.m136404Z3((BLive) obj);
            }
        }));
        duringCreated(((ou40) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.znd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205191a.m136400V3((jsv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final C22421c<BLiveRtcToken> m136398T3(String str, String str2, String str3) {
        return LivingNormalApiProvider.m72730p7(str, str2, str3, "", "audience");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m136399U3(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f110892m.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        int i = mMLiveTranscoding.ctyp;
        int i2 = this.f110893n.f101357a;
        if (i != i2) {
            this.f110893n = new fyb(i, i2, mMLiveTranscoding.f14649ts, bLiveCallVolume == null ? 0 : bLiveCallVolume.mode);
            l51.m152893M(new Runnable() { // from class: l.god0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105283a.m136405a4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m136400V3(jsv jsvVar) {
        if (jsvVar.m146875a() != 4) {
            return;
        }
        r610 r610Var = (r610) m138856F3(new z310(3400));
        if (r610Var != null && r610Var.mo133182a() != null && (r610Var.mo133182a() instanceof bpd0)) {
            ((bpd0) r610Var.mo133182a()).m105806p1();
        }
        this.f110893n = new fyb(-1, -1, 0.0f);
        m213811F2().PlayerEvent.audienceCtypData().mo199273j(this.f110893n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public x84 m136401W3(x84 x84Var) {
        int iM209669b = x84Var.m209669b();
        if (iM209669b == 1) {
            m136409g4(x84Var.m209677j());
            return x84Var;
        }
        if (iM209669b == 6) {
            this.f110890k = 0;
            this.f110894o.m212143K3();
            m136397S3();
            l51.m152890J(this.f110891l);
            return x84Var;
        }
        if (iM209669b != 16) {
            switch (iM209669b) {
                case 12:
                    m136411i4();
                    break;
                case 13:
                    m136396f4();
                    l51.m152890J(this.f110891l);
                    lej0 lej0Var = lej0.INSTANCE;
                    lej0Var.m153907a("live_enter_room_rtc", "get first video frame");
                    lej0Var.m153907a("live_swipe_in_room_rtc", "get first video frame");
                    wg80.m206185e(this);
                    break;
                case 14:
                    m136399U3(x84Var.m209672e());
                    this.f110894o.m212143K3();
                    m136397S3();
                    break;
            }
            return x84Var;
        }
        if (((ou40) m213810E2()).m202195r()) {
            this.f110894o.m212145M3();
            return x84Var;
        }
        return x84Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final boolean m136402X3() {
        BLiveStreamUrl bLiveStreamUrl;
        BLive bLiveMo122892l = ((ou40) m213810E2()).m118363A2().mo122892l();
        return (bLiveMo122892l == null || (bLiveStreamUrl = bLiveMo122892l.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv) || wft.m206159b(2) || !sjt.m186307a(bLiveMo122892l.streamUrl.pullFlv, "rtc")) ? false : true;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m136403Y3(BLiveRtcToken bLiveRtcToken) {
        this.f110895p = bLiveRtcToken;
        iod0.m141294a("提前获取到token");
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m136404Z3(BLive bLive) {
        m113231o2(m136398T3(bLive.room.f45267id, "live", bLive.rtcInfo.provider), false).subscribe(dhw.m115825d(new y20() { // from class: l.cod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82860a.m136403Y3((BLiveRtcToken) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m136405a4() {
        m213811F2().PlayerEvent.audienceCtypData().mo199273j(this.f110893n);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m136406c4(boolean z, BLiveRtcToken bLiveRtcToken) {
        if (z) {
            this.f110896q.m119503a4(bLiveRtcToken);
        } else {
            m136413k4(bLiveRtcToken);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m136407d4(Throwable th) {
        m136411i4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m136408e4(Boolean bool) {
        if (bool.booleanValue()) {
            if (((ou40) m213810E2()).m169227L2()) {
                return;
            }
            iod0.m141294a("收到播放event");
            m136409g4(false);
            return;
        }
        if (((ou40) m213810E2()).m169227L2()) {
            iod0.m141294a("收到停止播放event");
            m136410h4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m136409g4(final boolean z) {
        ((ou40) m213810E2()).m169231P2(true);
        BLive bLiveMo122892l = ((ou40) m213810E2()).m118363A2().mo122892l();
        iod0.m141294a("reqRtcTokenAndStartPlay pkinfo:" + bLiveMo122892l.pkInfo);
        m113231o2(m136398T3(((ou40) m213810E2()).m202194o(), "live", bLiveMo122892l.rtcInfo.provider), false).subscribe(dhw.m115826e(new y20() { // from class: l.dod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89913a.m136406c4(z, (BLiveRtcToken) obj);
            }
        }, new y20() { // from class: l.eod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94924a.m136407d4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m136410h4() {
        r1j0.m179420g("观众退出rtc");
        m136414l4();
        iod0.m141294a("stopMotion restartPlayer 降级到播放器拉流");
        m213811F2().PlayerEvent.restorePlayerView().m199277p();
        m213811F2().PlayerEvent.restartPlay().m199277p();
        m213811F2().PlayerEvent.playerVisible().mo199273j(Boolean.TRUE);
        this.f110888i.setVisible(false);
        this.f110894o.m212143K3();
        ((ou40) m213810E2()).m169231P2(false);
        l51.m152890J(this.f110891l);
        this.f110890k = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m136411i4() {
        iod0.m141294a("重试  重试次数：" + this.f110890k);
        int i = this.f110890k;
        this.f110890k = i + 1;
        if (i >= vxr.m203876d().m170982J0()) {
            ((ou40) m213810E2()).m169229N2(true);
            m136410h4();
        } else {
            if (l51.m152909o(this.f110891l)) {
                return;
            }
            l51.m152888H(act(), this.f110891l, 2000L);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m136412j4(r610 r610Var) {
        r610Var.m179990n(new x84.InterfaceC21264a() { // from class: l.fod0
            @Override // p153l.x84.InterfaceC21264a
            /* JADX INFO: renamed from: a */
            public final x84 mo99054a(x84 x84Var) {
                return this.f100048a.m136401W3(x84Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m136413k4(BLiveRtcToken bLiveRtcToken) {
        this.f110888i.setVisible(true);
        ((ou40) m213810E2()).m169231P2(true);
        iod0.m141294a(" startMotion");
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153909c("live_enter_room_rtc", "startMotion");
        lej0Var.m153909c("live_swipe_in_room_rtc", "startMotion");
        r610 r610Var = (r610) m138856F3(new z310(3400));
        m136412j4(r610Var);
        String strM202194o = ((ou40) m213810E2()).m202194o();
        String strM168526j0 = ((ou40) m213810E2()).m168526j0();
        String str = bLiveRtcToken.appId;
        String strValueOf = String.valueOf(((ou40) m213810E2()).mo183435j().streamCdnInfo.provider);
        String str2 = bLiveRtcToken.channelKey;
        String str3 = bLiveRtcToken.channel;
        String str4 = bLiveRtcToken.rtcProvider;
        String str5 = bLiveRtcToken.userSig;
        RoomPusherView roomPusherView = this.f110888i;
        r610Var.mo133185d(new cpd0(strM202194o, strM168526j0, str, strValueOf, str2, str3, str4, str5, roomPusherView.f52368a, roomPusherView.f52369b, ((ou40) m213810E2()).m118363A2().mo122892l().pkInfo));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m136414l4() {
        r610 r610Var = (r610) m138856F3(new z310(3400));
        if (r610Var == null || r610Var.mo133182a() == null || !(r610Var.mo133182a() instanceof bpd0)) {
            return;
        }
        r610Var.mo133183b();
        iod0.m141294a(" stopMotion");
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        l51.m152890J(this.f110891l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f110894o.m212143K3();
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153909c("live_enter_room_rtc", "validState");
        lej0Var.m153909c("live_swipe_in_room_rtc", "validState");
        duringCreated(m213811F2().PlayerEvent.audienceRtcPull().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.bod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77667a.m136408e4((Boolean) obj);
            }
        }));
        iod0.m141294a("audience rtc开关：" + m136402X3() + "  isPlaying:" + ((ou40) m213810E2()).m169227L2());
        if (!m136402X3() || ((ou40) m213810E2()).m169227L2()) {
            return;
        }
        BLiveRtcToken bLiveRtcToken = this.f110895p;
        if (bLiveRtcToken != null) {
            m136413k4(bLiveRtcToken);
        } else {
            m136409g4(false);
        }
    }
}
