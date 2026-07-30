package p149l;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p046p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class egd0 extends pat<am40> {

    /* JADX INFO: renamed from: i */
    public final RoomPusherView f90923i;

    /* JADX INFO: renamed from: j */
    public final LivePlayerView f90924j;

    /* JADX INFO: renamed from: k */
    public int f90925k;

    /* JADX INFO: renamed from: l */
    public final Runnable f90926l;

    /* JADX INFO: renamed from: m */
    public final Gson f90927m;

    /* JADX INFO: renamed from: n */
    public rwb f90928n;

    /* JADX INFO: renamed from: o */
    public ufd0 f90929o;

    /* JADX INFO: renamed from: p */
    public BLiveRtcToken f90930p;

    /* JADX INFO: renamed from: q */
    public ww00 f90931q;

    /* JADX WARN: Multi-variable type inference failed */
    public egd0(bsm<am40> bsmVar, RoomPusherView roomPusherView, LiveRtcPlayErrorView liveRtcPlayErrorView, LivePlayerView livePlayerView) {
        super(bsmVar);
        this.f90925k = 0;
        this.f90926l = new Runnable() { // from class: l.xfd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192680a.m116255b4();
            }
        };
        this.f90928n = new rwb(-1, -1, 0.0f);
        this.f90923i = roomPusherView;
        this.f90924j = livePlayerView;
        this.f90927m = new Gson();
        this.f90931q = (ww00) m144512z2(new ww00(bsmVar));
        this.f90929o = (ufd0) m144512z2(new ufd0(bsmVar, liveRtcPlayErrorView, this));
        ((am40) m206027E2()).m97484P2(false);
        ((am40) m206027E2()).m97482N2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m116255b4() {
        m116269g4(false);
    }

    /* JADX INFO: renamed from: f4 */
    private void m116256f4() {
        fgd0.m121206a("rtc拉流成功 停止播放器pausePlayer");
        m206028F2().PlayerEvent.pausePlay().m172467p();
        m206028F2().PlayerEvent.playerVisible().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m116257S3() {
        LivePlayerView livePlayerView = this.f90924j;
        if (livePlayerView == null || !livePlayerView.m71924j()) {
            return;
        }
        m206028F2().PlayerEvent.showLoading().mo172463j(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().PlayerEvent.reqRtcToken().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vfd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181261a.m116264Z3((BLive) obj);
            }
        }));
        duringCreated(((am40) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.wfd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186075a.m116260V3((iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final C22306c<BLiveRtcToken> m116258T3(String str, String str2, String str3) {
        return LivingNormalApiProvider.m71547p7(str, str2, str3, "", "audience");
    }

    /* JADX INFO: renamed from: U3 */
    public final void m116259U3(MMLiveTranscoding mMLiveTranscoding) {
        BLiveCallVolume bLiveCallVolume = (BLiveCallVolume) this.f90927m.fromJson(mMLiveTranscoding.extString, BLiveCallVolume.class);
        int i = mMLiveTranscoding.ctyp;
        int i2 = this.f90928n.f161324a;
        if (i != i2) {
            this.f90928n = new rwb(i, i2, mMLiveTranscoding.f13955ts, bLiveCallVolume == null ? 0 : bLiveCallVolume.mode);
            e51.m114748M(new Runnable() { // from class: l.dgd0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86072a.m116265a4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m116260V3(iqv iqvVar) {
        if (iqvVar.m137794a() != 4) {
            return;
        }
        hy00 hy00Var = (hy00) m129297F3(new rv00(3400));
        if (hy00Var != null && hy00Var.mo133471a() != null && (hy00Var.mo133471a() instanceof ygd0)) {
            ((ygd0) hy00Var.mo133471a()).m214639p1();
        }
        this.f90928n = new rwb(-1, -1, 0.0f);
        m206028F2().PlayerEvent.audienceCtypData().mo172463j(this.f90928n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public y74 m116261W3(y74 y74Var) {
        int iM213285b = y74Var.m213285b();
        if (iM213285b == 1) {
            m116269g4(y74Var.m213293j());
            return y74Var;
        }
        if (iM213285b == 6) {
            this.f90925k = 0;
            this.f90929o.m193377K3();
            m116257S3();
            e51.m114745J(this.f90926l);
            return y74Var;
        }
        if (iM213285b != 16) {
            switch (iM213285b) {
                case 12:
                    m116271i4();
                    break;
                case 13:
                    m116256f4();
                    e51.m114745J(this.f90926l);
                    h5j0 h5j0Var = h5j0.INSTANCE;
                    h5j0Var.m129402a("live_enter_room_rtc", "get first video frame");
                    h5j0Var.m129402a("live_swipe_in_room_rtc", "get first video frame");
                    q880.m173349e(this);
                    break;
                case 14:
                    m116259U3(y74Var.m213288e());
                    this.f90929o.m193377K3();
                    m116257S3();
                    break;
            }
            return y74Var;
        }
        if (((am40) m206027E2()).m149820r()) {
            this.f90929o.m193379M3();
            return y74Var;
        }
        return y74Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final boolean m116262X3() {
        BLiveStreamUrl bLiveStreamUrl;
        BLive bLiveMo165470l = ((am40) m206027E2()).m170393A2().mo165470l();
        return (bLiveMo165470l == null || (bLiveStreamUrl = bLiveMo165470l.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv) || vdt.m198092b(2) || !rht.m179462a(bLiveMo165470l.streamUrl.pullFlv, "rtc")) ? false : true;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m116263Y3(BLiveRtcToken bLiveRtcToken) {
        this.f90930p = bLiveRtcToken;
        fgd0.m121206a("提前获取到token");
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m116264Z3(BLive bLive) {
        m104250o2(m116258T3(bLive.room.f44419id, "live", bLive.rtcInfo.provider), false).subscribe(ffw.m121193d(new e30() { // from class: l.zfd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202933a.m116263Y3((BLiveRtcToken) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m116265a4() {
        m206028F2().PlayerEvent.audienceCtypData().mo172463j(this.f90928n);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m116266c4(boolean z, BLiveRtcToken bLiveRtcToken) {
        if (z) {
            this.f90931q.m205817a4(bLiveRtcToken);
        } else {
            m116273k4(bLiveRtcToken);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m116267d4(Throwable th) {
        m116271i4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m116268e4(Boolean bool) {
        if (bool.booleanValue()) {
            if (((am40) m206027E2()).m97480L2()) {
                return;
            }
            fgd0.m121206a("收到播放event");
            m116269g4(false);
            return;
        }
        if (((am40) m206027E2()).m97480L2()) {
            fgd0.m121206a("收到停止播放event");
            m116270h4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m116269g4(final boolean z) {
        ((am40) m206027E2()).m97484P2(true);
        BLive bLiveMo165470l = ((am40) m206027E2()).m170393A2().mo165470l();
        fgd0.m121206a("reqRtcTokenAndStartPlay pkinfo:" + bLiveMo165470l.pkInfo);
        m104250o2(m116258T3(((am40) m206027E2()).m149818o(), "live", bLiveMo165470l.rtcInfo.provider), false).subscribe(ffw.m121194e(new e30() { // from class: l.agd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69351a.m116266c4(z, (BLiveRtcToken) obj);
            }
        }, new e30() { // from class: l.bgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75423a.m116267d4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m116270h4() {
        osi0.m165783g("观众退出rtc");
        m116274l4();
        fgd0.m121206a("stopMotion restartPlayer 降级到播放器拉流");
        m206028F2().PlayerEvent.restorePlayerView().m172467p();
        m206028F2().PlayerEvent.restartPlay().m172467p();
        m206028F2().PlayerEvent.playerVisible().mo172463j(Boolean.TRUE);
        this.f90923i.setVisible(false);
        this.f90929o.m193377K3();
        ((am40) m206027E2()).m97484P2(false);
        e51.m114745J(this.f90926l);
        this.f90925k = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void m116271i4() {
        fgd0.m121206a("重试  重试次数：" + this.f90925k);
        int i = this.f90925k;
        this.f90925k = i + 1;
        if (i >= uvr.m196087d().m162675J0()) {
            ((am40) m206027E2()).m97482N2(true);
            m116270h4();
        } else {
            if (e51.m114764o(this.f90926l)) {
                return;
            }
            e51.m114743H(act(), this.f90926l, 2000L);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m116272j4(hy00 hy00Var) {
        hy00Var.m133484n(new y74.InterfaceC21330a() { // from class: l.cgd0
            @Override // p149l.y74.InterfaceC21330a
            /* JADX INFO: renamed from: a */
            public final y74 mo106704a(y74 y74Var) {
                return this.f80736a.m116261W3(y74Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m116273k4(BLiveRtcToken bLiveRtcToken) {
        this.f90923i.setVisible(true);
        ((am40) m206027E2()).m97484P2(true);
        fgd0.m121206a(" startMotion");
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129404c("live_enter_room_rtc", "startMotion");
        h5j0Var.m129404c("live_swipe_in_room_rtc", "startMotion");
        hy00 hy00Var = (hy00) m129297F3(new rv00(3400));
        m116272j4(hy00Var);
        String strM149818o = ((am40) m206027E2()).m149818o();
        String strM132140j0 = ((am40) m206027E2()).m132140j0();
        String str = bLiveRtcToken.appId;
        String strValueOf = String.valueOf(((am40) m206027E2()).mo149813j().streamCdnInfo.provider);
        String str2 = bLiveRtcToken.channelKey;
        String str3 = bLiveRtcToken.channel;
        String str4 = bLiveRtcToken.rtcProvider;
        String str5 = bLiveRtcToken.userSig;
        RoomPusherView roomPusherView = this.f90923i;
        hy00Var.mo133474d(new zgd0(strM149818o, strM132140j0, str, strValueOf, str2, str3, str4, str5, roomPusherView.f51520a, roomPusherView.f51521b, ((am40) m206027E2()).m170393A2().mo165470l().pkInfo));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m116274l4() {
        hy00 hy00Var = (hy00) m129297F3(new rv00(3400));
        if (hy00Var == null || hy00Var.mo133471a() == null || !(hy00Var.mo133471a() instanceof ygd0)) {
            return;
        }
        hy00Var.mo133472b();
        fgd0.m121206a(" stopMotion");
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        e51.m114745J(this.f90926l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f90929o.m193377K3();
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129404c("live_enter_room_rtc", "validState");
        h5j0Var.m129404c("live_swipe_in_room_rtc", "validState");
        duringCreated(m206028F2().PlayerEvent.audienceRtcPull().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yfd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198049a.m116268e4((Boolean) obj);
            }
        }));
        fgd0.m121206a("audience rtc开关：" + m116262X3() + "  isPlaying:" + ((am40) m206027E2()).m97480L2());
        if (!m116262X3() || ((am40) m206027E2()).m97480L2()) {
            return;
        }
        BLiveRtcToken bLiveRtcToken = this.f90930p;
        if (bLiveRtcToken != null) {
            m116273k4(bLiveRtcToken);
        } else {
            m116269g4(false);
        }
    }
}
