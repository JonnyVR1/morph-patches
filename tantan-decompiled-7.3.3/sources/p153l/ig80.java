package p153l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes4.dex */
public class ig80<D extends oo2> extends i6t<D, LivePlayerView> implements c6m, pwl, y2m {

    /* JADX INFO: renamed from: i */
    public ft5 f114760i;

    /* JADX INFO: renamed from: j */
    public final uxh0 f114761j;

    /* JADX INFO: renamed from: k */
    public ef80 f114762k;

    /* JADX INFO: renamed from: l */
    public qg80 f114763l;

    /* JADX INFO: renamed from: m */
    public boolean f114764m;

    /* JADX INFO: renamed from: n */
    public long f114765n;

    /* JADX INFO: renamed from: o */
    public long f114766o;

    public ig80(dum dumVar, LivePlayerView livePlayerView) {
        super(dumVar);
        this.f114763l = (qg80) m153103z2(new qg80(dumVar, this));
        this.f114762k = new ef80();
        this.f114761j = new uxh0();
        mo52715C(livePlayerView);
        m139888Q4();
    }

    /* JADX INFO: renamed from: L4 */
    private void m139840L4() {
        act().progressDismiss();
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        ((LivePlayerView) this.viewModel).m73114s(false);
        if (this.f114762k.m120632a() == 0) {
            m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(0));
        }
        if (!wft.m206159b(2)) {
            D d = this.f196918e.f90822h;
            if (d instanceof ou40) {
                ou40 ou40Var = (ou40) d;
                if (m139900p4(bLiveAbsDataMo183435j) && !ou40Var.m169226K2()) {
                    if (ou40Var.m169227L2()) {
                        return;
                    }
                    iod0.m141294a("PlayerPresenter:onLiving:播放器切rtc");
                    m213811F2().PlayerEvent.audienceRtcPull().mo199273j(Boolean.TRUE);
                    return;
                }
                if (ou40Var.m169227L2()) {
                    iod0.m141294a("PlayerPresenter:onLiving:检查停止rtc");
                    m213811F2().PlayerEvent.audienceRtcPull().mo199273j(Boolean.FALSE);
                }
            }
        }
        if (bLiveAbsDataMo183435j.streamUrl.useCurrentPullStream || !this.f114761j.m198467k()) {
            m139868m4(bLiveAbsDataMo183435j);
        } else {
            nsh0.m164608j(v2t.f182113c, "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX INFO: renamed from: M4 */
    private int m139842M4(BLiveAbsData bLiveAbsData) {
        return this.f114761j.m198471o(bLiveAbsData, ((LivePlayerView) this.viewModel).f48698a, this, m213810E2().m202200x(), m213810E2().mo160117o0());
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m139843N3(Throwable th) {
    }

    /* JADX INFO: renamed from: P4 */
    private void m139846P4() {
        duringCreated(m213810E2().m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.ff80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98752a.m139869n4((jsv) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().PlayerEvent.showLoading().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109260a.mo139897m(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((C22421c) m213811F2().PlayerEvent.quickPlay().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.kf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126255a.m139886O4((BLiveAbsData) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().PlayerEvent.showErrorText().m199270g()).doOnNext(new y20() { // from class: l.lf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131829a.m139902q4((String) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.mf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136618a.m139892V4((String) obj);
            }
        }));
        m138860d3(lh80.class, new qcj() { // from class: l.nf80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141716a.m139903r4((lh80) obj);
            }
        });
        m138860d3(z7b0.class, new qcj() { // from class: l.of80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f147055a.m139912z4((z7b0) obj);
            }
        });
        duringCreated((C22421c) m213811F2().PlayerEvent.restartPlay().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.pf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152160a.m139871A4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().PlayerEvent.pausePlay().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.rf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162767a.m139872B4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().PlayerEvent.playerVisible().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.sf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167674a.m139873C4((Boolean) obj);
            }
        }));
        m138860d3(gyb.class, new qcj() { // from class: l.qf80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157275a.m139874D4((gyb) obj);
            }
        });
        m138860d3(iu70.class, new qcj() { // from class: l.ag80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71101a.m139875E4((iu70) obj);
            }
        });
        duringCreated((C22421c) m213811F2().PlayerEvent.enterRoomFail().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.bg80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76572a.m139877F4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().PlayerEvent.switchMute().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.cg80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81637a.m139878G4((Boolean) obj);
            }
        }));
        m138860d3(o7g0.class, new qcj() { // from class: l.dg80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88271a.m139905s4((o7g0) obj);
            }
        });
        m138860d3(xsi.class, new qcj() { // from class: l.eg80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f93907a.m139906t4((xsi) obj);
            }
        });
        duringCreated((C22421c) m213811F2().PlayerEvent.showSuspendText().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fg80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98892a.m139907u4((String) obj);
            }
        }));
        if (!wft.m206159b(2)) {
            duringCreated(m213810E2().m168519h0()).filter(new qcj() { // from class: l.gg80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f103998a.m139908v4((User) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.hg80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109377a.m139909w4((User) obj);
                }
            }, new y20() { // from class: l.gf80
                @Override // p153l.y20
                public final void call(Object obj) {
                    ig80.m139843N3((Throwable) obj);
                }
            }));
        } else {
            m138863h3(m213811F2().PlayerEvent.updatePlayerContainer(), new y20() { // from class: l.if80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114651a.m139910x4((vxj0) obj);
                }
            });
            m138860d3(tyb.class, new qcj() { // from class: l.jf80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f120570a.m139911y4((tyb) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R4 */
    private void m139848R4() {
        ((LivePlayerView) this.viewModel).m73110m();
        this.f114762k.m120645n(false);
        this.f114761j.m198477u(true);
    }

    /* JADX INFO: renamed from: W4 */
    private void m139854W4(jsv jsvVar) {
        if (jsvVar.m146882h()) {
            return;
        }
        ((LivePlayerView) this.viewModel).setWaterMarkVisible(true);
        ((LivePlayerView) this.viewModel).setWaterMarkUserId(m213810E2().m168532l0().publicId);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m139862e4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: i4 */
    private void m139866i4() {
        if (lti.m155791f()) {
            return;
        }
        this.f114761j.m198461e("live");
    }

    /* JADX INFO: renamed from: k4 */
    private void m139867k4() {
        String string = !ConnectivityReceiver.m82467g() ? zrv.f205803e.getString(R$string.f47524F9) : null;
        if (ConnectivityReceiver.m82471k()) {
            string = zrv.f205803e.getString(R$string.f47480D9);
        }
        if (string != null) {
            m139892V4(string);
        } else {
            nsh0.m164608j(v2t.f182113c, "audience retryConnect");
            this.f114763l.m176456c4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    private void m139868m4(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData.isOfficialShowRoom() && (m213810E2() instanceof mc50) && ((mc50) m213810E2()).m157913S2() == null) {
            return;
        }
        this.f114763l.m176457d4(bLiveAbsData.callback);
        int iM139842M4 = m139842M4(bLiveAbsData);
        if (iM139842M4 != 0) {
            m139895j4(String.valueOf(iM139842M4));
        } else {
            ((LivePlayerView) this.viewModel).m73105f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public void m139869n4(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m139840L4();
        } else if (iM146875a == 3) {
            this.f114761j.m198477u(false);
            if (!this.f196918e.f90824j.m209548L3(MotionType.multi_call) || !bf10.m103810P(this)) {
                ((LivePlayerView) this.viewModel).m73116v("");
            }
        } else if (iM146875a == 4) {
            m139848R4();
            ((s310) this.f114761j.m198463g()).m184203e0();
        }
        m139854W4(jsvVar);
    }

    /* JADX INFO: renamed from: o4 */
    private void m139870o4() {
        if (this.f114761j.m198465i()) {
            if (this.f114761j.m198467k()) {
                this.f114761j.m198476t(false);
            } else {
                mo139897m(true);
            }
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m139871A4(vxj0 vxj0Var) {
        m139868m4(m213810E2().mo183435j());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m139872B4(vxj0 vxj0Var) {
        this.f114761j.m198477u(true);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m139873C4(Boolean bool) {
        ((LivePlayerView) this.viewModel).m73111n(bool.booleanValue());
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: D0 */
    public void mo120245D0() {
        ((LivePlayerView) this.viewModel).m73104e();
        ((LivePlayerView) this.viewModel).setPlayerCoverVisible(false);
        wg80.m206187g(this, this.f114762k.m120636e(), !this.f114762k.m120638g());
        if (wft.m206159b(2)) {
            wg80.m206185e(this);
        } else if (m213810E2().m168532l0() == null) {
            this.f114764m = true;
        } else {
            this.f114764m = false;
            wg80.m206185e(this);
        }
        this.f114761j.m198472p(this);
        lej0.INSTANCE.m153907a("live_enter_room_cdn", "onReceiveFirstIFrame");
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ fyb m139874D4(gyb gybVar) {
        return m139896l4();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ fyb m139875E4(iu70 iu70Var) {
        if (this.f114761j.m198465i() && (this.f114761j.m198463g() instanceof s310)) {
            return ((s310) this.f114761j.m198463g()).m184185M();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m139877F4(vxj0 vxj0Var) {
        this.f114762k.m120643l(true);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m139878G4(Boolean bool) {
        this.f114761j.m198476t(bool.booleanValue());
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m139879H4(vxj0 vxj0Var) {
        m139889S4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m139880I4(fyb fybVar) {
        if (this.f114761j.m198465i() && (this.f114761j.m198463g() instanceof s310)) {
            ((s310) this.f114761j.m198463g()).m184204f0(fybVar);
        }
        mo139894c0(fybVar);
    }

    /* JADX INFO: renamed from: J4 */
    public void m139881J4(boolean z) {
        ((LivePlayerView) this.viewModel).m73117w(z);
    }

    /* JADX INFO: renamed from: K4 */
    public void m139882K4() {
        fgt.m125530b(this, "audience_player_retry", null);
        if (pzi0.m174454o() - this.f114763l.f157387k >= ((long) zrv.m221193k().m203547W4()) * 1000) {
            this.f114763l.m176453Z3(this.f114762k.m120633b());
        } else {
            o1j0.m165651y("操作频繁，请稍后再试");
            fgt.m125530b(this, "audience_player_retry_frequent", null);
        }
    }

    @Override // p153l.y2m
    /* JADX INFO: renamed from: M0 */
    public ef80 mo139883M0() {
        return this.f114762k;
    }

    /* JADX INFO: renamed from: N4 */
    public void m139884N4(BLiveAbsData bLiveAbsData) {
        if (this.f114761j.m198465i() && TEnum.equals(bLiveAbsData.state, "onlive")) {
            this.f114761j.m198476t(true);
            ((LivePlayerView) this.viewModel).m73114s(false);
            this.f114762k.m120644m(bLiveAbsData);
            m139868m4(bLiveAbsData);
        }
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: O */
    public void mo120246O() {
        ((LivePlayerView) this.viewModel).m73115u(true);
        wg80.m206188h(this);
        m139890T4(15);
        this.f114765n = pzi0.m174454o();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: O0 */
    public void mo139885O0(BLiveCallVolume bLiveCallVolume) {
        m213811F2().PlayerEvent.callVolumeChanged().mo199273j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: O4 */
    public void m139886O4(BLiveAbsData bLiveAbsData) {
        BLive bLive;
        BLiveRtcInfo bLiveRtcInfo;
        if (m139900p4(bLiveAbsData)) {
            if (!(bLiveAbsData instanceof BLive) || (bLiveRtcInfo = (bLive = (BLive) bLiveAbsData).rtcInfo) == null || TextUtils.isEmpty(bLiveRtcInfo.provider)) {
                return;
            }
            m213811F2().PlayerEvent.reqRtcToken().mo199273j(bLive);
            return;
        }
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        if (bLiveStreamUrl != null) {
            if ((TextUtils.isEmpty(bLiveStreamUrl.pullFlv) && TextUtils.isEmpty(bLiveAbsData.streamUrl.pullFlvIpv6)) || bLiveAbsData.streamCdnInfo == null || TextUtils.equals(new wyd0("ARTICULATION_SELECT_LIVE_ID", "").get(), bLiveAbsData.f45171id)) {
                return;
            }
            nsh0.m164608j(v2t.f182113c, "quickPlay:" + bLiveAbsData.streamUrl.pullFlv + ", ipv6: " + bLiveAbsData.streamUrl.pullFlvIpv6);
            m139868m4(bLiveAbsData);
        }
    }

    @Override // p153l.y2m
    /* JADX INFO: renamed from: P0 */
    public void mo139887P0(boolean z, String str) {
        this.f114762k.m120645n(z);
        m139895j4(str);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m139888Q4() {
        this.f114760i = pcg0.m171650c(m213811F2().PlayerEvent.prePlay().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.wf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188772a.m139884N4((BLiveAbsData) obj);
            }
        })), m213811F2().PlayerEvent.restorePlayerView().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.xf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194010a.m139879H4((vxj0) obj);
            }
        })), m213811F2().PlayerEvent.updatePlayer().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.yf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199453a.m139893X4((qwl) obj);
            }
        })), m213811F2().PlayerEvent.jumpInfoVisible().m199270g().subscribe(dhw.m115825d(new y20() { // from class: l.zf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204111a.m139881J4(((Boolean) obj).booleanValue());
            }
        })));
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: R1 */
    public void mo120247R1(float f) {
        this.f114762k.m120647p(f);
        m213811F2().PlayerEvent.videoSizeChanged().mo199273j(Float.valueOf(f));
    }

    /* JADX INFO: renamed from: S4 */
    public void m139889S4() {
        ((LivePlayerView) this.viewModel).m73112p();
        this.f114761j.m198478v();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m139870o4();
        m139866i4();
        m139846P4();
        ((LivePlayerView) this.viewModel).m73105f();
        this.f114762k.m120645n(false);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m139890T4(int i) {
        m213811F2().PlayerEvent.playState().mo199273j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: U4 */
    public void m139891U4(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 0;
            }
        }
        m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(i2));
    }

    /* JADX INFO: renamed from: V4 */
    public void m139892V4(String str) {
        ((LivePlayerView) this.viewModel).m73113q(str);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m139893X4(qwl qwlVar) {
        this.f114761j.m198481y(qwlVar);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: c0 */
    public void mo139894c0(fyb fybVar) {
        this.f114762k.m120641j(fybVar.f101357a, fybVar.f101358b);
        m139891U4(fybVar.f101357a);
        m213811F2().PlayerEvent.ctypChanged().mo199273j(fybVar);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: f2 */
    public void mo120248f2() {
        this.f114762k.m120645n(false);
        ((LivePlayerView) this.viewModel).m73104e();
        fgt.m125530b(this, "audience_live_stream_buffer", null);
        m139890T4(16);
        long jM174454o = pzi0.m174454o();
        if (this.f114765n == 0) {
            this.f114765n = jM174454o;
        }
        long j = jM174454o - this.f114765n;
        if (j <= zrv.m221193k().m203467M4() || jM174454o - this.f114766o <= zrv.m221193k().m203744u5()) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72604b7(m213810E2(), this.f196918e.f90824j.m209549M3(), j)).subscribe(dhw.m115829h(new y20() { // from class: l.vf80
            @Override // p153l.y20
            public final void call(Object obj) {
                ig80.m139862e4((uxj0) obj);
            }
        }));
        this.f114766o = jM174454o;
    }

    /* JADX INFO: renamed from: j4 */
    public void m139895j4(String str) {
        this.f114762k.m120642k(str);
        this.f114762k.m120643l(true);
        if (!ConnectivityReceiver.m82467g()) {
            m139892V4(zrv.f205803e.getString(R$string.f47524F9));
        } else if (ConnectivityReceiver.m82471k()) {
            m139892V4(zrv.f205803e.getString(R$string.f47480D9));
        } else {
            m139892V4(zrv.f205803e.getString(R$string.f47480D9));
        }
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: l0 */
    public void mo123267l0(int i) {
        if (m213810E2().m202195r()) {
            this.f114762k.m120645n(true);
            this.f114762k.m120643l(true);
            m139867k4();
            m139890T4(17);
            this.f114761j.m198473q(this, i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final fyb m139896l4() {
        float fM198464h = this.f114761j.m198464h();
        if (fM198464h != 0.0f) {
            this.f114762k.m120647p(fM198464h);
        }
        return new fyb(this.f114762k.m120632a(), this.f114762k.m120634c(), this.f114762k.m120637f());
    }

    @Override // p153l.y2m
    /* JADX INFO: renamed from: m */
    public void mo139897m(boolean z) {
        ((LivePlayerView) this.viewModel).m73115u(z);
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
        ft5 ft5Var = this.f114760i;
        if (ft5Var != null && ft5Var.isUnsubscribed()) {
            this.f114760i.unsubscribe();
        }
        this.f114761j.m198462f();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        this.f114762k.m120640i();
        this.f114761j.m198475s();
        this.f114761j.m198480x();
        m139889S4();
        z91.m219042b();
        super.mo70300n();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: p0 */
    public void mo139898p0() {
        mo139897m(false);
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: p1 */
    public void mo139899p1(int i) {
        m213811F2().PlayerEvent.onReceiveMultiCallMode().mo199273j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m139900p4(BLiveAbsData bLiveAbsData) {
        BLiveStreamUrl bLiveStreamUrl;
        if (bLiveAbsData == null || (bLiveStreamUrl = bLiveAbsData.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv)) {
            return false;
        }
        boolean zM186307a = sjt.m186307a(bLiveAbsData.streamUrl.pullFlv, "rtc");
        String str = bLiveAbsData.streamUrl.pullFlv;
        return !wft.m206159b(2) && zM186307a;
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: q0 */
    public void mo139901q0() {
        o1j0.m165619A(zrv.f205803e.getString(R$string.f47634K9), true);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m139902q4(String str) {
        this.f114762k.m120645n(true);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ ViewGroup m139903r4(lh80 lh80Var) {
        return ((LivePlayerView) this.viewModel).f48698a;
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: s1 */
    public void mo139904s1(ArrayList<String> arrayList) {
        this.f114762k.m120646o(arrayList);
        m213811F2().PlayerEvent.onReceiveStreamMembers().mo199273j(arrayList);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ List m139905s4(o7g0 o7g0Var) {
        return this.f114762k.m120635d();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f114762k.m120644m(null);
        duringCreated((C22421c) m213811F2().PlayerEvent.audienceCtypData().m199270g()).filter(new qcj() { // from class: l.tf80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((fyb) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.uf80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178741a.m139880I4((fyb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ qwl m139906t4(xsi xsiVar) {
        return this.f114761j.m198479w();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: u1 */
    public void mo120249u1() {
        this.f114762k.m120645n(false);
        ((LivePlayerView) this.viewModel).m73111n(true);
        ((LivePlayerView) this.viewModel).m73104e();
        m139890T4(18);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m139907u4(String str) {
        ((LivePlayerView) this.viewModel).m73116v(str);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Boolean m139908v4(User user) {
        return Boolean.valueOf(user != null && this.f114764m);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m139909w4(User user) {
        wg80.m206185e(this);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m139910x4(vxj0 vxj0Var) {
        this.f114761j.m198482z(((LivePlayerView) this.viewModel).f48698a);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ qwl m139911y4(tyb tybVar) {
        return this.f114761j.m198463g();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ PullWatchInfo m139912z4(z7b0 z7b0Var) {
        return this.f114761j.m198463g().mo178521a();
    }

    @Override // p153l.pwl
    /* JADX INFO: renamed from: F1 */
    public void mo139876F1() {
    }
}
