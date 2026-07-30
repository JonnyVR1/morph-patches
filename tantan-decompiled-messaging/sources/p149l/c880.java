package p149l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes4.dex */
public class c880<D extends ho2> extends h4t<D, LivePlayerView> implements l3m, bul, e0m {

    /* JADX INFO: renamed from: i */
    public bs5 f79711i;

    /* JADX INFO: renamed from: j */
    public final nph0 f79712j;

    /* JADX INFO: renamed from: k */
    public y680 f79713k;

    /* JADX INFO: renamed from: l */
    public k880 f79714l;

    /* JADX INFO: renamed from: m */
    public boolean f79715m;

    /* JADX INFO: renamed from: n */
    public long f79716n;

    /* JADX INFO: renamed from: o */
    public long f79717o;

    public c880(bsm bsmVar, LivePlayerView livePlayerView) {
        super(bsmVar);
        this.f79714l = (k880) m144512z2(new k880(bsmVar, this));
        this.f79713k = new y680();
        this.f79712j = new nph0();
        mo51532C(livePlayerView);
        m105725Q4();
    }

    /* JADX INFO: renamed from: L4 */
    private void m105679L4() {
        act().progressDismiss();
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        ((LivePlayerView) this.viewModel).m71931s(false);
        if (this.f79713k.m213094a() == 0) {
            m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(0));
        }
        if (!vdt.m198092b(2)) {
            D d = this.f188512e.f77102h;
            if (d instanceof am40) {
                am40 am40Var = (am40) d;
                if (m105735p4(bLiveAbsDataMo149813j) && !am40Var.m97479K2()) {
                    if (am40Var.m97480L2()) {
                        return;
                    }
                    fgd0.m121206a("PlayerPresenter:onLiving:播放器切rtc");
                    m206028F2().PlayerEvent.audienceRtcPull().mo172463j(Boolean.TRUE);
                    return;
                }
                if (am40Var.m97480L2()) {
                    fgd0.m121206a("PlayerPresenter:onLiving:检查停止rtc");
                    m206028F2().PlayerEvent.audienceRtcPull().mo172463j(Boolean.FALSE);
                }
            }
        }
        if (bLiveAbsDataMo149813j.streamUrl.useCurrentPullStream || !this.f79712j.m160488k()) {
            m105707m4(bLiveAbsDataMo149813j);
        } else {
            gkh0.m126627j(u0t.f172944c, "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX INFO: renamed from: M4 */
    private int m105681M4(BLiveAbsData bLiveAbsData) {
        return this.f79712j.m160492o(bLiveAbsData, ((LivePlayerView) this.viewModel).f47850a, this, m206027E2().m149826x(), m206027E2().mo132155o0());
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m105682N3(Throwable th) {
    }

    /* JADX INFO: renamed from: P4 */
    private void m105685P4() {
        duringCreated(m206027E2().m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.z680
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201896a.m105708n4((iqv) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().PlayerEvent.showLoading().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.b780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73951a.mo105733m(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((C22306c) m206028F2().PlayerEvent.quickPlay().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.e780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89676a.m105723O4((BLiveAbsData) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().PlayerEvent.showErrorText().m172460g()).doOnNext(new e30() { // from class: l.f780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96223a.m105736q4((String) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.g780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101336a.m105729V4((String) obj);
            }
        }));
        m129301d3(f980.class, new w9j() { // from class: l.h780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f106204a.m105737r4((f980) obj);
            }
        });
        m129301d3(vza0.class, new w9j() { // from class: l.i780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111839a.m105745z4((vza0) obj);
            }
        });
        duringCreated((C22306c) m206028F2().PlayerEvent.restartPlay().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.j780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116572a.m105710A4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().PlayerEvent.pausePlay().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.l780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126700a.m105711B4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().PlayerEvent.playerVisible().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.m780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131797a.m105712C4((Boolean) obj);
            }
        }));
        m129301d3(swb.class, new w9j() { // from class: l.k780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121557a.m105713D4((swb) obj);
            }
        });
        m129301d3(cm70.class, new w9j() { // from class: l.u780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f174948a.m105714E4((cm70) obj);
            }
        });
        duringCreated((C22306c) m206028F2().PlayerEvent.enterRoomFail().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.v780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180315a.m105715F4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().PlayerEvent.switchMute().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.w780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185029a.m105716G4((Boolean) obj);
            }
        }));
        m129301d3(hzf0.class, new w9j() { // from class: l.x780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191327a.m105738s4((hzf0) obj);
            }
        });
        m129301d3(bqi.class, new w9j() { // from class: l.y780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f196685a.m105739t4((bqi) obj);
            }
        });
        duringCreated((C22306c) m206028F2().PlayerEvent.showSuspendText().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.z780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201992a.m105740u4((String) obj);
            }
        }));
        if (!vdt.m198092b(2)) {
            duringCreated(m206027E2().m132133h0()).filter(new w9j() { // from class: l.a880
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f68005a.m105741v4((User) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.b880
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74075a.m105742w4((User) obj);
                }
            }, new e30() { // from class: l.a780
                @Override // p149l.e30
                public final void call(Object obj) {
                    c880.m105682N3((Throwable) obj);
                }
            }));
        } else {
            m129304h3(m206028F2().PlayerEvent.updatePlayerContainer(), new e30() { // from class: l.c780
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79599a.m105743x4((soj0) obj);
                }
            });
            m129301d3(fxb.class, new w9j() { // from class: l.d780
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f84716a.m105744y4((fxb) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R4 */
    private void m105687R4() {
        ((LivePlayerView) this.viewModel).m71927m();
        this.f79713k.m213107n(false);
        this.f79712j.m160498u(true);
    }

    /* JADX INFO: renamed from: W4 */
    private void m105693W4(iqv iqvVar) {
        if (iqvVar.m137801h()) {
            return;
        }
        ((LivePlayerView) this.viewModel).setWaterMarkVisible(true);
        ((LivePlayerView) this.viewModel).setWaterMarkUserId(m206027E2().m132146l0().publicId);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m105701e4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: i4 */
    private void m105705i4() {
        if (pqi.m170914f()) {
            return;
        }
        this.f79712j.m160482e("live");
    }

    /* JADX INFO: renamed from: k4 */
    private void m105706k4() {
        String string = !ConnectivityReceiver.m81284g() ? ypv.f199497e.getString(R$string.f46676F9) : null;
        if (ConnectivityReceiver.m81288k()) {
            string = ypv.f199497e.getString(R$string.f46632D9);
        }
        if (string != null) {
            m105729V4(string);
        } else {
            gkh0.m126627j(u0t.f172944c, "audience retryConnect");
            this.f79714l.m144923c4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    private void m105707m4(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData.isOfficialShowRoom() && (m206027E2() instanceof x350) && ((x350) m206027E2()).m206897S2() == null) {
            return;
        }
        this.f79714l.m144924d4(bLiveAbsData.callback);
        int iM105681M4 = m105681M4(bLiveAbsData);
        if (iM105681M4 != 0) {
            m105731j4(String.valueOf(iM105681M4));
        } else {
            ((LivePlayerView) this.viewModel).m71922f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public void m105708n4(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m105679L4();
        } else if (iM137794a == 3) {
            this.f79712j.m160498u(false);
            if (!this.f188512e.f77104j.m201577L3(MotionType.multi_call) || !r610.m177981P(this)) {
                ((LivePlayerView) this.viewModel).m71933v("");
            }
        } else if (iM137794a == 4) {
            m105687R4();
            ((jv00) this.f79712j.m160484g()).m143391e0();
        }
        m105693W4(iqvVar);
    }

    /* JADX INFO: renamed from: o4 */
    private void m105709o4() {
        if (this.f79712j.m160486i()) {
            if (this.f79712j.m160488k()) {
                this.f79712j.m160497t(false);
            } else {
                mo105733m(true);
            }
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m105710A4(soj0 soj0Var) {
        m105707m4(m206027E2().mo149813j());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m105711B4(soj0 soj0Var) {
        this.f79712j.m160498u(true);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m105712C4(Boolean bool) {
        ((LivePlayerView) this.viewModel).m71928n(bool.booleanValue());
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: D0 */
    public void mo103933D0() {
        ((LivePlayerView) this.viewModel).m71921e();
        ((LivePlayerView) this.viewModel).setPlayerCoverVisible(false);
        q880.m173351g(this, this.f79713k.m213098e(), !this.f79713k.m213100g());
        if (vdt.m198092b(2)) {
            q880.m173349e(this);
        } else if (m206027E2().m132146l0() == null) {
            this.f79715m = true;
        } else {
            this.f79715m = false;
            q880.m173349e(this);
        }
        this.f79712j.m160493p(this);
        h5j0.INSTANCE.m129402a("live_enter_room_cdn", "onReceiveFirstIFrame");
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ rwb m105713D4(swb swbVar) {
        return m105732l4();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ rwb m105714E4(cm70 cm70Var) {
        if (this.f79712j.m160486i() && (this.f79712j.m160484g() instanceof jv00)) {
            return ((jv00) this.f79712j.m160484g()).m143373M();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m105715F4(soj0 soj0Var) {
        this.f79713k.m213105l(true);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m105716G4(Boolean bool) {
        this.f79712j.m160497t(bool.booleanValue());
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m105717H4(soj0 soj0Var) {
        m105726S4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m105718I4(rwb rwbVar) {
        if (this.f79712j.m160486i() && (this.f79712j.m160484g() instanceof jv00)) {
            ((jv00) this.f79712j.m160484g()).m143392f0(rwbVar);
        }
        mo103938c0(rwbVar);
    }

    /* JADX INFO: renamed from: J4 */
    public void m105719J4(boolean z) {
        ((LivePlayerView) this.viewModel).m71934w(z);
    }

    /* JADX INFO: renamed from: K4 */
    public void m105720K4() {
        eet.m116003b(this, "audience_player_retry", null);
        if (mqi0.m155944o() - this.f79714l.f121786k >= ((long) ypv.m215672k().m195760W4()) * 1000) {
            this.f79714l.m144920Z3(this.f79713k.m213095b());
        } else {
            lsi0.m151595y("操作频繁，请稍后再试");
            eet.m116003b(this, "audience_player_retry_frequent", null);
        }
    }

    @Override // p149l.e0m
    /* JADX INFO: renamed from: M0 */
    public y680 mo105721M0() {
        return this.f79713k;
    }

    /* JADX INFO: renamed from: N4 */
    public void m105722N4(BLiveAbsData bLiveAbsData) {
        if (this.f79712j.m160486i() && TEnum.equals(bLiveAbsData.state, "onlive")) {
            this.f79712j.m160497t(true);
            ((LivePlayerView) this.viewModel).m71931s(false);
            this.f79713k.m213106m(bLiveAbsData);
            m105707m4(bLiveAbsData);
        }
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: O */
    public void mo103935O() {
        ((LivePlayerView) this.viewModel).m71932u(true);
        q880.m173352h(this);
        m105727T4(15);
        this.f79716n = mqi0.m155944o();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: O0 */
    public void mo103936O0(BLiveCallVolume bLiveCallVolume) {
        m206028F2().PlayerEvent.callVolumeChanged().mo172463j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: O4 */
    public void m105723O4(BLiveAbsData bLiveAbsData) {
        BLive bLive;
        BLiveRtcInfo bLiveRtcInfo;
        if (m105735p4(bLiveAbsData)) {
            if (!(bLiveAbsData instanceof BLive) || (bLiveRtcInfo = (bLive = (BLive) bLiveAbsData).rtcInfo) == null || TextUtils.isEmpty(bLiveRtcInfo.provider)) {
                return;
            }
            m206028F2().PlayerEvent.reqRtcToken().mo172463j(bLive);
            return;
        }
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        if (bLiveStreamUrl != null) {
            if ((TextUtils.isEmpty(bLiveStreamUrl.pullFlv) && TextUtils.isEmpty(bLiveAbsData.streamUrl.pullFlvIpv6)) || bLiveAbsData.streamCdnInfo == null || TextUtils.equals(new uqd0("ARTICULATION_SELECT_LIVE_ID", "").get(), bLiveAbsData.f44323id)) {
                return;
            }
            gkh0.m126627j(u0t.f172944c, "quickPlay:" + bLiveAbsData.streamUrl.pullFlv + ", ipv6: " + bLiveAbsData.streamUrl.pullFlvIpv6);
            m105707m4(bLiveAbsData);
        }
    }

    @Override // p149l.e0m
    /* JADX INFO: renamed from: P0 */
    public void mo105724P0(boolean z, String str) {
        this.f79713k.m213107n(z);
        m105731j4(str);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m105725Q4() {
        this.f79711i = h4g0.m129242c(m206028F2().PlayerEvent.prePlay().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.q780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153020a.m105722N4((BLiveAbsData) obj);
            }
        })), m206028F2().PlayerEvent.restorePlayerView().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.r780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158016a.m105717H4((soj0) obj);
            }
        })), m206028F2().PlayerEvent.updatePlayer().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.s780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162898a.m105730X4((cul) obj);
            }
        })), m206028F2().PlayerEvent.jumpInfoVisible().m172460g().subscribe(ffw.m121193d(new e30() { // from class: l.t780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168673a.m105719J4(((Boolean) obj).booleanValue());
            }
        })));
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: R1 */
    public void mo103937R1(float f) {
        this.f79713k.m213109p(f);
        m206028F2().PlayerEvent.videoSizeChanged().mo172463j(Float.valueOf(f));
    }

    /* JADX INFO: renamed from: S4 */
    public void m105726S4() {
        ((LivePlayerView) this.viewModel).m71929p();
        this.f79712j.m160499v();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m105709o4();
        m105705i4();
        m105685P4();
        ((LivePlayerView) this.viewModel).m71922f();
        this.f79713k.m213107n(false);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m105727T4(int i) {
        m206028F2().PlayerEvent.playState().mo172463j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: U4 */
    public void m105728U4(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 0;
            }
        }
        m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(i2));
    }

    /* JADX INFO: renamed from: V4 */
    public void m105729V4(String str) {
        ((LivePlayerView) this.viewModel).m71930q(str);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m105730X4(cul culVar) {
        this.f79712j.m160502y(culVar);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: c0 */
    public void mo103938c0(rwb rwbVar) {
        this.f79713k.m213103j(rwbVar.f161324a, rwbVar.f161325b);
        m105728U4(rwbVar.f161324a);
        m206028F2().PlayerEvent.ctypChanged().mo172463j(rwbVar);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: f2 */
    public void mo103939f2() {
        this.f79713k.m213107n(false);
        ((LivePlayerView) this.viewModel).m71921e();
        eet.m116003b(this, "audience_live_stream_buffer", null);
        m105727T4(16);
        long jM155944o = mqi0.m155944o();
        if (this.f79716n == 0) {
            this.f79716n = jM155944o;
        }
        long j = jM155944o - this.f79716n;
        if (j <= ypv.m215672k().m195680M4() || jM155944o - this.f79717o <= ypv.m215672k().m195957u5()) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71421b7(m206027E2(), this.f188512e.f77104j.m201578M3(), j)).subscribe(ffw.m121197h(new e30() { // from class: l.p780
            @Override // p149l.e30
            public final void call(Object obj) {
                c880.m105701e4((roj0) obj);
            }
        }));
        this.f79717o = jM155944o;
    }

    /* JADX INFO: renamed from: j4 */
    public void m105731j4(String str) {
        this.f79713k.m213104k(str);
        this.f79713k.m213105l(true);
        if (!ConnectivityReceiver.m81284g()) {
            m105729V4(ypv.f199497e.getString(R$string.f46676F9));
        } else if (ConnectivityReceiver.m81288k()) {
            m105729V4(ypv.f199497e.getString(R$string.f46632D9));
        } else {
            m105729V4(ypv.f199497e.getString(R$string.f46632D9));
        }
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: l0 */
    public void mo103940l0(int i) {
        if (m206027E2().m149820r()) {
            this.f79713k.m213107n(true);
            this.f79713k.m213105l(true);
            m105706k4();
            m105727T4(17);
            this.f79712j.m160494q(this, i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final rwb m105732l4() {
        float fM160485h = this.f79712j.m160485h();
        if (fM160485h != 0.0f) {
            this.f79713k.m213109p(fM160485h);
        }
        return new rwb(this.f79713k.m213094a(), this.f79713k.m213096c(), this.f79713k.m213099f());
    }

    @Override // p149l.e0m
    /* JADX INFO: renamed from: m */
    public void mo105733m(boolean z) {
        ((LivePlayerView) this.viewModel).m71932u(z);
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
        bs5 bs5Var = this.f79711i;
        if (bs5Var != null && bs5Var.isUnsubscribed()) {
            this.f79711i.unsubscribe();
        }
        this.f79712j.m160483f();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        this.f79713k.m213102i();
        this.f79712j.m160496s();
        this.f79712j.m160501x();
        m105726S4();
        s91.m182689b();
        super.mo69117n();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: p0 */
    public void mo103941p0() {
        mo105733m(false);
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: p1 */
    public void mo103942p1(int i) {
        m206028F2().PlayerEvent.onReceiveMultiCallMode().mo172463j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m105735p4(BLiveAbsData bLiveAbsData) {
        BLiveStreamUrl bLiveStreamUrl;
        if (bLiveAbsData == null || (bLiveStreamUrl = bLiveAbsData.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv)) {
            return false;
        }
        boolean zM179462a = rht.m179462a(bLiveAbsData.streamUrl.pullFlv, "rtc");
        String str = bLiveAbsData.streamUrl.pullFlv;
        return !vdt.m198092b(2) && zM179462a;
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: q0 */
    public void mo103943q0() {
        lsi0.m151563A(ypv.f199497e.getString(R$string.f46786K9), true);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m105736q4(String str) {
        this.f79713k.m213107n(true);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ ViewGroup m105737r4(f980 f980Var) {
        return ((LivePlayerView) this.viewModel).f47850a;
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: s1 */
    public void mo103944s1(ArrayList<String> arrayList) {
        this.f79713k.m213108o(arrayList);
        m206028F2().PlayerEvent.onReceiveStreamMembers().mo172463j(arrayList);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ List m105738s4(hzf0 hzf0Var) {
        return this.f79713k.m213097d();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f79713k.m213106m(null);
        duringCreated((C22306c) m206028F2().PlayerEvent.audienceCtypData().m172460g()).filter(new w9j() { // from class: l.n780
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwb) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.o780
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142474a.m105718I4((rwb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ cul m105739t4(bqi bqiVar) {
        return this.f79712j.m160500w();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: u1 */
    public void mo103945u1() {
        this.f79713k.m213107n(false);
        ((LivePlayerView) this.viewModel).m71928n(true);
        ((LivePlayerView) this.viewModel).m71921e();
        m105727T4(18);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m105740u4(String str) {
        ((LivePlayerView) this.viewModel).m71933v(str);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Boolean m105741v4(User user) {
        return Boolean.valueOf(user != null && this.f79715m);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m105742w4(User user) {
        q880.m173349e(this);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m105743x4(soj0 soj0Var) {
        this.f79712j.m160503z(((LivePlayerView) this.viewModel).f47850a);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ cul m105744y4(fxb fxbVar) {
        return this.f79712j.m160484g();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ PullWatchInfo m105745z4(vza0 vza0Var) {
        return this.f79712j.m160484g().mo108789a();
    }

    @Override // p149l.bul
    /* JADX INFO: renamed from: F1 */
    public void mo103934F1() {
    }
}
