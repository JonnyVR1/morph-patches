package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class wl10 extends uh10 {

    /* JADX INFO: renamed from: k */
    public final int f189628k;

    /* JADX INFO: renamed from: l */
    public final t7g0 f189629l;

    public wl10(dum<mu40> dumVar, td10<mu40> td10Var, int i) {
        super(dumVar, td10Var);
        this.f189628k = i;
        this.f94718j = (sc10) m153103z2(new bd10(dumVar, td10Var));
        this.f189629l = (t7g0) m153103z2(new t7g0(dumVar));
    }

    /* JADX INFO: renamed from: L4 */
    private void m206891L4(r610 r610Var) {
        r610Var.m179990n(new x84.InterfaceC21264a() { // from class: l.ul10
            @Override // p153l.x84.InterfaceC21264a
            /* JADX INFO: renamed from: a */
            public final x84 mo99054a(x84 x84Var) {
                return this.f179476a.mo121404Y3(x84Var);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m206895v4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ pf60 m206897x4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        return new pf60(bLive, bLiveRtcToken);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: B4 */
    public final String m206900B4() {
        return "friends".equals(m213810E2().mo183435j().liveMode) ? "start-live" : "multi-call-button";
    }

    /* JADX INFO: renamed from: C4 */
    public final void m206901C4(List<BLiveMultiCall> list) {
        jyb.m147537z(list, new y20() { // from class: l.ql10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158196a.m206904F4((BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public final void m206902D4(BLiveMultiCall bLiveMultiCall) {
        ir10.m141746a("handleOwnerComeBack callId" + bLiveMultiCall.f45248id);
        ve10.m201029i(this, "multiCallOwner");
        mo121415j4();
        this.f94718j.m185360K3(bLiveMultiCall);
        ((bd10) this.f94718j).m103573Y3(bLiveMultiCall);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: E4 */
    public final void m206903E4(Throwable th) {
        LivingNormalApiProvider.m72610c4(m213810E2().m202191k());
        this.f94717i.m190583a4(th.getMessage());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m206904F4(BLiveMultiCall bLiveMultiCall) {
        if (bf10.m103817W(bLiveMultiCall.userId)) {
            m206902D4(bLiveMultiCall);
            return;
        }
        ir10.m141746a("handleOldData hangup" + bLiveMultiCall.f45248id);
        LivingNormalApiProvider.m72630e6(bLiveMultiCall.f45248id, "recover hangup");
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m206905G4(BLiveMultiCall bLiveMultiCall) {
        m213811F2().MultiCallEvent.addWatchList().mo199273j(bLiveMultiCall);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m206906H4(BLiveMultiCall bLiveMultiCall) {
        bf10.m103833i0(this, bLiveMultiCall, "owner apply");
        ve10.m201029i(this, "multiCallOwner");
        this.f94717i.m190582Z3(bLiveMultiCall);
        this.f94718j.m185360K3(bLiveMultiCall);
        ((bd10) this.f94718j).m103573Y3(bLiveMultiCall);
        if ("friends".equals(m213810E2().mo183435j().liveMode)) {
            return;
        }
        m213811F2().MultiCallEvent.openManageDialog().mo199273j(Integer.valueOf(this.f189628k));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ C22421c m206907I4(final BLive bLive) {
        return m121400U3(m213810E2().m202194o(), bLive.rtcInfo.provider).map(new qcj() { // from class: l.vl10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wl10.m206897x4(bLive, (BLiveRtcToken) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: J4 */
    public final void m206908J4() {
        if ("friends".equals(m213810E2().mo183435j().liveMode) && ((Boolean) m138856F3(new w7g0(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).booleanValue()) {
            this.f189629l.m189573P3();
            ir10.m141746a("multi call owner onPushStarting");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: K4 */
    public final void m206909K4() {
        ir10.m141746a("ownerApplyCall");
        duringCreated(LivingNormalApiProvider.m72393E3(bf10.m103838n(m213810E2(), this.f94717i.m190584b4().m153855w(), m213810E2().m202191k(), "", cd10.f81081i, cd10.f81084l, 1, m213810E2().m168449D0(), m206900B4()))).doOnNext(new y20() { // from class: l.nl10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142504a.m206905G4((BLiveMultiCall) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ol10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147808a.m206906H4((BLiveMultiCall) obj);
            }
        }, new pl10(this)));
    }

    /* JADX INFO: renamed from: M4 */
    public void m206910M4(pf60<BLive, BLiveRtcToken> pf60Var) {
        r610 r610Var = (r610) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        m206891L4(r610Var);
        BLive bLive = pf60Var.f152156a;
        r610Var.mo133185d(new h910(bLive.streamUrl.push, bLive.streamUrl.pushIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(pf60Var.f152156a.streamCdnInfo.businessType), pf60Var.f152156a.videoQualityConf, pf60Var.f152157b, this.f94717i.m190584b4().m153853u(), true));
        m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2, l.vp20] */
    @Override // p153l.uh10, p153l.en10
    /* JADX INFO: renamed from: Y3 */
    public x84 mo121404Y3(x84 x84Var) {
        super.mo121404Y3(x84Var);
        int iM209669b = x84Var.m209669b();
        if (iM209669b == 2) {
            BLiveMultiCall bLiveMultiCallM153851s = this.f94717i.m190584b4().m153851s(x84Var.m209674g());
            if (NullChecker.m82486a(bLiveMultiCallM153851s)) {
                duringCreated(LivingNormalApiProvider.m72630e6(bLiveMultiCallM153851s.f45248id, "anchor-sdk-leave")).subscribe(dhw.m115829h(new y20() { // from class: l.ml10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        wl10.m206895v4((BLiveMultiCall) obj);
                    }
                }));
            }
        } else {
            if (iM209669b == 3 || iM209669b == 6) {
                this.f94718j.mo103572O3(x84Var.m209674g());
                return x84Var;
            }
            if (iM209669b == 7) {
                m213811F2().LivePusherEvent.stopLive().mo199273j(m213810E2().m202191k());
                return x84Var;
            }
            if (iM209669b == 11) {
                m206908J4();
                return x84Var;
            }
        }
        return x84Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2, l.vp20] */
    @Override // p153l.en10
    /* JADX INFO: renamed from: j4 */
    public void mo121415j4() {
        if (((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        ir10.m141746a("owner request call token and refresh Stream Url");
        duringCreated(LivingNormalApiProvider.m72495P6(m213810E2().m202191k(), cd10.f81071W)).flatMap(new qcj() { // from class: l.rl10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163683a.m206907I4((BLive) obj);
            }
        }).doOnError(new y20() { // from class: l.sl10
            @Override // p153l.y20
            public final void call(Object obj) {
                ir10.m141746a("request multi cal push params failed");
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.tl10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174780a.m206910M4((pf60) obj);
            }
        }, new pl10(this)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    @Override // p153l.uh10, p153l.en10
    /* JADX INFO: renamed from: k4 */
    public void mo121416k4() {
        C12877b c12877bMo133182a;
        ir10.m141746a("real stop multi call push");
        if (!"friends".equals(m213810E2().mo183435j().liveMode)) {
            super.mo121416k4();
            return;
        }
        h0m h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (h0mVar == null || (c12877bMo133182a = h0mVar.mo133182a()) == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        this.f94717i.m190583a4("close live");
        m213811F2().LivePusherEvent.stopLive().mo199273j(m213810E2().m202191k());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v13, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l.oo2, l.vp20] */
    @Override // p153l.en10, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (!"friends".equals(m213810E2().mo183435j().liveMode)) {
            m206909K4();
            return;
        }
        BLiveMultiCallInfo bLiveMultiCallInfo = ((BLive) m213810E2().mo183435j()).multiCallInfo;
        if (bLiveMultiCallInfo == null || !bLiveMultiCallInfo.onGoing || !"friends".equals(m213810E2().mo183435j().liveMode)) {
            m206909K4();
        } else {
            duringCreated(LivingNormalApiProvider.m72368B5(m213810E2().m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.ll10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132519a.m206901C4((List) obj);
                }
            }));
            ir10.m141746a("friends live  getOnGoingCallList");
        }
    }
}
