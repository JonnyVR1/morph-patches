package p002l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p1.mobile.putong.live.base.data.BLiveRtcInfo;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.List;
import l.bs5;
import l.bul;
import l.bwr;
import l.c4g0;
import l.cm70;
import l.cul;
import l.e30;
import l.ffw;
import l.gkh0;
import l.h4g0;
import l.h5j0;
import l.l3m;
import l.lsi0;
import l.mqi0;
import l.r610;
import l.roj0;
import l.rwb;
import l.soj0;
import l.u0t;
import l.uqd0;
import l.vdt;
import l.w9j;
import l.ypv;
import p002l.ho2;
import rx.c;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c880<D extends ho2> extends h4t<D, LivePlayerView> implements l3m, bul, e0m {

    /* JADX INFO: renamed from: i */
    public bs5 f8535i;

    /* JADX INFO: renamed from: j */
    public final nph0 f8536j;

    /* JADX INFO: renamed from: k */
    public y680 f8537k;

    /* JADX INFO: renamed from: l */
    public k880 f8538l;

    /* JADX INFO: renamed from: m */
    public boolean f8539m;

    /* JADX INFO: renamed from: n */
    public long f8540n;

    /* JADX INFO: renamed from: o */
    public long f8541o;

    public c880(bsm bsmVar, LivePlayerView livePlayerView) {
        super(bsmVar);
        this.f8538l = (k880) z2(new k880(bsmVar, this));
        this.f8537k = new y680();
        this.f8536j = new nph0();
        C(livePlayerView);
        m10865Q4();
    }

    /* JADX INFO: renamed from: L4 */
    private void m10815L4() {
        act().progressDismiss();
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        ((LivePlayerView) ((bwr) this).viewModel).m5314s(false);
        if (this.f8537k.m26366a() == 0) {
            m25548F2().LiveBgEvent.showBg().j(new uwr(0));
        }
        if (!vdt.b(2)) {
            D d = this.f22036e.f8339h;
            if (d instanceof am40) {
                am40 am40Var = (am40) d;
                if (m10882p4(bLiveAbsDataM17234j) && !am40Var.m9882K2()) {
                    if (am40Var.m9883L2()) {
                        return;
                    }
                    fgd0.m13158a("PlayerPresenter:onLiving:播放器切rtc");
                    m25548F2().PlayerEvent.audienceRtcPull().j(Boolean.TRUE);
                    return;
                }
                if (am40Var.m9883L2()) {
                    fgd0.m13158a("PlayerPresenter:onLiving:检查停止rtc");
                    m25548F2().PlayerEvent.audienceRtcPull().j(Boolean.FALSE);
                }
            }
        }
        if (bLiveAbsDataM17234j.streamUrl.useCurrentPullStream || !this.f8536j.m18893k()) {
            m10843m4(bLiveAbsDataM17234j);
        } else {
            gkh0.j(u0t.c, "useCurrentPull : false, isStartPlay:true");
        }
    }

    /* JADX INFO: renamed from: M4 */
    private int m10817M4(BLiveAbsData bLiveAbsData) {
        return this.f8536j.m18897o(bLiveAbsData, ((LivePlayerView) ((bwr) this).viewModel).f3892a, this, m25547E2().m17247x(), m25547E2().mo14591o0());
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m10818N3(Throwable th) {
    }

    /* JADX INFO: renamed from: P4 */
    private void m10821P4() {
        duringCreated(m25547E2().m17236l()).subscribe(ffw.d(new e30() { // from class: l.z680
            public final void call(Object obj) {
                this.f23277a.m10844n4((iqv) obj);
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.showLoading().g()).subscribe(ffw.d(new e30() { // from class: l.b780
            public final void call(Object obj) {
                this.f8015a.mo10878m(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.quickPlay().g()).subscribe(ffw.d(new e30() { // from class: l.e780
            public final void call(Object obj) {
                this.f9603a.m10863O4((BLiveAbsData) obj);
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.showErrorText().g()).doOnNext(new e30() { // from class: l.f780
            public final void call(Object obj) {
                this.f10163a.m10884q4((String) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.g780
            public final void call(Object obj) {
                this.f11292a.m10871V4((String) obj);
            }
        }));
        m14188d3(f980.class, new w9j() { // from class: l.h780
            public final Object call(Object obj) {
                return this.f11904a.m10885r4((f980) obj);
            }
        });
        m14188d3(vza0.class, new w9j() { // from class: l.i780
            public final Object call(Object obj) {
                return this.f13086a.m10896z4((vza0) obj);
            }
        });
        duringCreated((c) m25548F2().PlayerEvent.restartPlay().g()).subscribe(ffw.d(new e30() { // from class: l.j780
            public final void call(Object obj) {
                this.f13614a.m10846A4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.pausePlay().g()).subscribe(ffw.d(new e30() { // from class: l.l780
            public final void call(Object obj) {
                this.f14702a.m10847B4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.playerVisible().g()).subscribe(ffw.d(new e30() { // from class: l.m780
            public final void call(Object obj) {
                this.f15258a.m10848C4((Boolean) obj);
            }
        }));
        m14188d3(swb.class, new w9j() { // from class: l.k780
            public final Object call(Object obj) {
                return this.f14224a.m10850D4((swb) obj);
            }
        });
        m14188d3(cm70.class, new w9j() { // from class: l.u780
            public final Object call(Object obj) {
                return this.f20524a.m10851E4((cm70) obj);
            }
        });
        duringCreated((c) m25548F2().PlayerEvent.enterRoomFail().g()).subscribe(ffw.h(new e30() { // from class: l.v780
            public final void call(Object obj) {
                this.f21023a.m10853F4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().PlayerEvent.switchMute().g()).subscribe(ffw.h(new e30() { // from class: l.w780
            public final void call(Object obj) {
                this.f21546a.m10854G4((Boolean) obj);
            }
        }));
        m14188d3(hzf0.class, new w9j() { // from class: l.x780
            public final Object call(Object obj) {
                return this.f22151a.m10887s4((hzf0) obj);
            }
        });
        m14188d3(bqi.class, new w9j() { // from class: l.y780
            public final Object call(Object obj) {
                return this.f22727a.m10889t4((bqi) obj);
            }
        });
        duringCreated((c) m25548F2().PlayerEvent.showSuspendText().g()).subscribe(ffw.d(new e30() { // from class: l.z780
            public final void call(Object obj) {
                this.f23292a.m10891u4((String) obj);
            }
        }));
        if (!vdt.b(2)) {
            duringCreated(m25547E2().m14569h0()).filter(new w9j() { // from class: l.a880
                public final Object call(Object obj) {
                    return this.f7441a.m10892v4((User) obj);
                }
            }).subscribe(ffw.e(new e30() { // from class: l.b880
                public final void call(Object obj) {
                    this.f8030a.m10893w4((User) obj);
                }
            }, new e30() { // from class: l.a780
                public final void call(Object obj) {
                    c880.m10818N3((Throwable) obj);
                }
            }));
        } else {
            m14191h3(m25548F2().PlayerEvent.updatePlayerContainer(), new e30() { // from class: l.c780
                public final void call(Object obj) {
                    this.f8518a.m10894x4((soj0) obj);
                }
            });
            m14188d3(fxb.class, new w9j() { // from class: l.d780
                public final Object call(Object obj) {
                    return this.f9083a.m10895y4((fxb) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R4 */
    private void m10823R4() {
        ((LivePlayerView) ((bwr) this).viewModel).m5310m();
        this.f8537k.m26379n(false);
        this.f8536j.m18903u(true);
    }

    /* JADX INFO: renamed from: W4 */
    private void m10829W4(iqv iqvVar) {
        if (iqvVar.m15305h()) {
            return;
        }
        ((LivePlayerView) ((bwr) this).viewModel).setWaterMarkVisible(true);
        ((LivePlayerView) ((bwr) this).viewModel).setWaterMarkUserId(m25547E2().m14582l0().publicId);
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ void m10837e4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: i4 */
    private void m10841i4() {
        if (pqi.m20636f()) {
            return;
        }
        this.f8536j.m18887e("live");
    }

    /* JADX INFO: renamed from: k4 */
    private void m10842k4() {
        String string = !ConnectivityReceiver.g() ? ypv.e.getString(R$string.f2718F9) : null;
        if (ConnectivityReceiver.k()) {
            string = ypv.e.getString(R$string.f2674D9);
        }
        if (string != null) {
            m10871V4(string);
        } else {
            gkh0.j(u0t.c, "audience retryConnect");
            this.f8538l.m16538c4();
        }
    }

    /* JADX INFO: renamed from: m4 */
    private void m10843m4(BLiveAbsData bLiveAbsData) {
        if (bLiveAbsData.isOfficialShowRoom() && (m25547E2() instanceof x350) && ((x350) m25547E2()).m25674S2() == null) {
            return;
        }
        this.f8538l.m16539d4(bLiveAbsData.callback);
        int iM10817M4 = m10817M4(bLiveAbsData);
        if (iM10817M4 != 0) {
            m10875j4(String.valueOf(iM10817M4));
        } else {
            ((LivePlayerView) ((bwr) this).viewModel).m5304f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public void m10844n4(iqv iqvVar) {
        int iM15298a = iqvVar.m15298a();
        if (iM15298a == 2) {
            m10815L4();
        } else if (iM15298a == 3) {
            this.f8536j.m18903u(false);
            if (!this.f22036e.f8341j.m24319L3(MotionType.multi_call) || !r610.P(this)) {
                ((LivePlayerView) ((bwr) this).viewModel).m5316v("");
            }
        } else if (iM15298a == 4) {
            m10823R4();
            ((jv00) this.f8536j.m18889g()).m16320e0();
        }
        m10829W4(iqvVar);
    }

    /* JADX INFO: renamed from: o4 */
    private void m10845o4() {
        if (this.f8536j.m18891i()) {
            if (this.f8536j.m18893k()) {
                this.f8536j.m18902t(false);
            } else {
                mo10878m(true);
            }
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m10846A4(soj0 soj0Var) {
        m10843m4(m25547E2().m17234j());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m10847B4(soj0 soj0Var) {
        this.f8536j.m18903u(true);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m10848C4(Boolean bool) {
        ((LivePlayerView) ((bwr) this).viewModel).m5311n(bool.booleanValue());
    }

    /* JADX INFO: renamed from: D0 */
    public void m10849D0() {
        ((LivePlayerView) ((bwr) this).viewModel).m5303e();
        ((LivePlayerView) ((bwr) this).viewModel).setPlayerCoverVisible(false);
        q880.m21067g(this, this.f8537k.m26370e(), !this.f8537k.m26372g());
        if (vdt.b(2)) {
            q880.m21065e(this);
        } else if (m25547E2().m14582l0() == null) {
            this.f8539m = true;
        } else {
            this.f8539m = false;
            q880.m21065e(this);
        }
        this.f8536j.m18898p(this);
        h5j0.INSTANCE.a("live_enter_room_cdn", "onReceiveFirstIFrame");
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ rwb m10850D4(swb swbVar) {
        return m10877l4();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ rwb m10851E4(cm70 cm70Var) {
        if (this.f8536j.m18891i() && (this.f8536j.m18889g() instanceof jv00)) {
            return ((jv00) this.f8536j.m18889g()).m16297M();
        }
        return null;
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m10853F4(soj0 soj0Var) {
        this.f8537k.m26377l(true);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m10854G4(Boolean bool) {
        this.f8536j.m18902t(bool.booleanValue());
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m10855H4(soj0 soj0Var) {
        m10867S4();
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m10856I4(rwb rwbVar) {
        if (this.f8536j.m18891i() && (this.f8536j.m18889g() instanceof jv00)) {
            ((jv00) this.f8536j.m18889g()).m16322f0(rwbVar);
        }
        m10873c0(rwbVar);
    }

    /* JADX INFO: renamed from: J4 */
    public void m10857J4(boolean z) {
        ((LivePlayerView) ((bwr) this).viewModel).m5317w(z);
    }

    /* JADX INFO: renamed from: K4 */
    public void m10858K4() {
        eet.m12448b(this, "audience_player_retry", null);
        if (mqi0.o() - this.f8538l.f14237k >= ((long) ypv.k().W4()) * 1000) {
            this.f8538l.m16535Z3(this.f8537k.m26367b());
        } else {
            lsi0.y("操作频繁，请稍后再试");
            eet.m12448b(this, "audience_player_retry_frequent", null);
        }
    }

    @Override // p002l.e0m
    /* JADX INFO: renamed from: M0 */
    public y680 mo10859M0() {
        return this.f8537k;
    }

    /* JADX INFO: renamed from: N4 */
    public void m10860N4(BLiveAbsData bLiveAbsData) {
        if (this.f8536j.m18891i() && TEnum.equals(bLiveAbsData.state, "onlive")) {
            this.f8536j.m18902t(true);
            ((LivePlayerView) ((bwr) this).viewModel).m5314s(false);
            this.f8537k.m26378m(bLiveAbsData);
            m10843m4(bLiveAbsData);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m10861O() {
        ((LivePlayerView) ((bwr) this).viewModel).m5315u(true);
        q880.m21068h(this);
        m10869T4(15);
        this.f8540n = mqi0.o();
    }

    /* JADX INFO: renamed from: O0 */
    public void m10862O0(BLiveCallVolume bLiveCallVolume) {
        m25548F2().PlayerEvent.callVolumeChanged().j(bLiveCallVolume);
    }

    /* JADX INFO: renamed from: O4 */
    public void m10863O4(BLiveAbsData bLiveAbsData) {
        BLive bLive;
        BLiveRtcInfo bLiveRtcInfo;
        if (m10882p4(bLiveAbsData)) {
            if (!(bLiveAbsData instanceof BLive) || (bLiveRtcInfo = (bLive = (BLive) bLiveAbsData).rtcInfo) == null || TextUtils.isEmpty(bLiveRtcInfo.provider)) {
                return;
            }
            m25548F2().PlayerEvent.reqRtcToken().j(bLive);
            return;
        }
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        if (bLiveStreamUrl != null) {
            if ((TextUtils.isEmpty(bLiveStreamUrl.pullFlv) && TextUtils.isEmpty(bLiveAbsData.streamUrl.pullFlvIpv6)) || bLiveAbsData.streamCdnInfo == null || TextUtils.equals((CharSequence) new uqd0("ARTICULATION_SELECT_LIVE_ID", "").get(), bLiveAbsData.id)) {
                return;
            }
            gkh0.j(u0t.c, "quickPlay:" + bLiveAbsData.streamUrl.pullFlv + ", ipv6: " + bLiveAbsData.streamUrl.pullFlvIpv6);
            m10843m4(bLiveAbsData);
        }
    }

    @Override // p002l.e0m
    /* JADX INFO: renamed from: P0 */
    public void mo10864P0(boolean z, String str) {
        this.f8537k.m26379n(z);
        m10875j4(str);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m10865Q4() {
        this.f8535i = h4g0.c(new c4g0[]{((c) m25548F2().PlayerEvent.prePlay().g()).subscribe(ffw.d(new e30() { // from class: l.q780
            public final void call(Object obj) {
                this.f17833a.m10860N4((BLiveAbsData) obj);
            }
        })), ((c) m25548F2().PlayerEvent.restorePlayerView().g()).subscribe(ffw.d(new e30() { // from class: l.r780
            public final void call(Object obj) {
                this.f18406a.m10855H4((soj0) obj);
            }
        })), ((c) m25548F2().PlayerEvent.updatePlayer().g()).subscribe(ffw.d(new e30() { // from class: l.s780
            public final void call(Object obj) {
                this.f18816a.m10872X4((cul) obj);
            }
        })), ((c) m25548F2().PlayerEvent.jumpInfoVisible().g()).subscribe(ffw.d(new e30() { // from class: l.t780
            public final void call(Object obj) {
                this.f20117a.m10857J4(((Boolean) obj).booleanValue());
            }
        }))});
    }

    /* JADX INFO: renamed from: R1 */
    public void m10866R1(float f) {
        this.f8537k.m26381p(f);
        m25548F2().PlayerEvent.videoSizeChanged().j(Float.valueOf(f));
    }

    /* JADX INFO: renamed from: S4 */
    public void m10867S4() {
        ((LivePlayerView) ((bwr) this).viewModel).m5312p();
        this.f8536j.m18904v();
    }

    /* JADX INFO: renamed from: T */
    public void m10868T() {
        super.T();
        m10845o4();
        m10841i4();
        m10821P4();
        ((LivePlayerView) ((bwr) this).viewModel).m5304f();
        this.f8537k.m26379n(false);
    }

    /* JADX INFO: renamed from: T4 */
    public final void m10869T4(int i) {
        m25548F2().PlayerEvent.playState().j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: U4 */
    public void m10870U4(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 0;
            }
        }
        m25548F2().LiveBgEvent.showBg().j(new uwr(i2));
    }

    /* JADX INFO: renamed from: V4 */
    public void m10871V4(String str) {
        ((LivePlayerView) ((bwr) this).viewModel).m5313q(str);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m10872X4(cul culVar) {
        this.f8536j.m18907y(culVar);
    }

    /* JADX INFO: renamed from: c0 */
    public void m10873c0(rwb rwbVar) {
        this.f8537k.m26375j(rwbVar.a, rwbVar.b);
        m10870U4(rwbVar.a);
        m25548F2().PlayerEvent.ctypChanged().j(rwbVar);
    }

    /* JADX INFO: renamed from: f2 */
    public void m10874f2() {
        this.f8537k.m26379n(false);
        ((LivePlayerView) ((bwr) this).viewModel).m5303e();
        eet.m12448b(this, "audience_live_stream_buffer", null);
        m10869T4(16);
        long jO = mqi0.o();
        if (this.f8540n == 0) {
            this.f8540n = jO;
        }
        long j = jO - this.f8540n;
        if (j <= ypv.k().M4() || jO - this.f8541o <= ypv.k().u5()) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m4787b7(m25547E2(), this.f22036e.f8341j.m24320M3(), j)).subscribe(ffw.h(new e30() { // from class: l.p780
            public final void call(Object obj) {
                c880.m10837e4((roj0) obj);
            }
        }));
        this.f8541o = jO;
    }

    /* JADX INFO: renamed from: j4 */
    public void m10875j4(String str) {
        this.f8537k.m26376k(str);
        this.f8537k.m26377l(true);
        if (!ConnectivityReceiver.g()) {
            m10871V4(ypv.e.getString(R$string.f2718F9));
        } else if (ConnectivityReceiver.k()) {
            m10871V4(ypv.e.getString(R$string.f2674D9));
        } else {
            m10871V4(ypv.e.getString(R$string.f2674D9));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m10876l0(int i) {
        if (m25547E2().m17241r()) {
            this.f8537k.m26379n(true);
            this.f8537k.m26377l(true);
            m10842k4();
            m10869T4(17);
            this.f8536j.m18899q(this, i);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final rwb m10877l4() {
        float fM18890h = this.f8536j.m18890h();
        if (fM18890h != 0.0f) {
            this.f8537k.m26381p(fM18890h);
        }
        return new rwb(this.f8537k.m26366a(), this.f8537k.m26368c(), this.f8537k.m26371f());
    }

    @Override // p002l.e0m
    /* JADX INFO: renamed from: m */
    public void mo10878m(boolean z) {
        ((LivePlayerView) ((bwr) this).viewModel).m5315u(z);
    }

    /* JADX INFO: renamed from: m1 */
    public void m10879m1() {
        bs5 bs5Var = this.f8535i;
        if (bs5Var != null && bs5Var.isUnsubscribed()) {
            this.f8535i.unsubscribe();
        }
        this.f8536j.m18888f();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        this.f8537k.m26374i();
        this.f8536j.m18901s();
        this.f8536j.m18906x();
        m10867S4();
        s91.m22253b();
        super.mo5949n();
    }

    /* JADX INFO: renamed from: p0 */
    public void m10880p0() {
        mo10878m(false);
    }

    /* JADX INFO: renamed from: p1 */
    public void m10881p1(int i) {
        m25548F2().PlayerEvent.onReceiveMultiCallMode().j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: p4 */
    public final boolean m10882p4(BLiveAbsData bLiveAbsData) {
        BLiveStreamUrl bLiveStreamUrl;
        if (bLiveAbsData == null || (bLiveStreamUrl = bLiveAbsData.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv)) {
            return false;
        }
        boolean zM21994a = rht.m21994a(bLiveAbsData.streamUrl.pullFlv, "rtc");
        String str = bLiveAbsData.streamUrl.pullFlv;
        return !vdt.b(2) && zM21994a;
    }

    /* JADX INFO: renamed from: q0 */
    public void m10883q0() {
        lsi0.A(ypv.e.getString(R$string.f2828K9), true);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m10884q4(String str) {
        this.f8537k.m26379n(true);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ ViewGroup m10885r4(f980 f980Var) {
        return ((LivePlayerView) ((bwr) this).viewModel).f3892a;
    }

    /* JADX INFO: renamed from: s1 */
    public void m10886s1(ArrayList<String> arrayList) {
        this.f8537k.m26380o(arrayList);
        m25548F2().PlayerEvent.onReceiveStreamMembers().j(arrayList);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ List m10887s4(hzf0 hzf0Var) {
        return this.f8537k.m26369d();
    }

    /* JADX INFO: renamed from: t */
    public void m10888t() {
        super.t();
        this.f8537k.m26378m(null);
        duringCreated((c) m25548F2().PlayerEvent.audienceCtypData().g()).filter(new w9j() { // from class: l.n780
            public final Object call(Object obj) {
                return Boolean.valueOf(((rwb) obj) != null);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.o780
            public final void call(Object obj) {
                this.f16414a.m10856I4((rwb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ cul m10889t4(bqi bqiVar) {
        return this.f8536j.m18905w();
    }

    /* JADX INFO: renamed from: u1 */
    public void m10890u1() {
        this.f8537k.m26379n(false);
        ((LivePlayerView) ((bwr) this).viewModel).m5311n(true);
        ((LivePlayerView) ((bwr) this).viewModel).m5303e();
        m10869T4(18);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m10891u4(String str) {
        ((LivePlayerView) ((bwr) this).viewModel).m5316v(str);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Boolean m10892v4(User user) {
        return Boolean.valueOf(user != null && this.f8539m);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m10893w4(User user) {
        q880.m21065e(this);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m10894x4(soj0 soj0Var) {
        this.f8536j.m18908z(((LivePlayerView) ((bwr) this).viewModel).f3892a);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ cul m10895y4(fxb fxbVar) {
        return this.f8536j.m18889g();
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ PullWatchInfo m10896z4(vza0 vza0Var) {
        return this.f8536j.m18889g().a();
    }

    /* JADX INFO: renamed from: F1 */
    public void m10852F1() {
    }
}
