package p153l;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class eo10 extends en10<ou40> {

    /* JADX INFO: renamed from: k */
    public final RoomPusherView f94862k;

    /* JADX INFO: renamed from: l */
    public boolean f94863l;

    public eo10(dum<ou40> dumVar, RoomPusherView roomPusherView, jn10 jn10Var) {
        super(dumVar, jn10Var);
        this.f94862k = roomPusherView;
        if (wft.m206159b(2)) {
            m153103z2(new e510(dumVar));
        }
        this.f94718j = (sc10) m153103z2(new sc10(dumVar, this.f94717i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4, reason: merged with bridge method [inline-methods] */
    public void m121707C4() {
        ir10.m141746a("pausePlayer");
        m213811F2().PlayerEvent.pausePlay().m199277p();
        m213811F2().PlayerEvent.playerVisible().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I4 */
    private void m121692I4() {
        ir10.m141746a("restartPlayer");
        m213811F2().PlayerEvent.restorePlayerView().m199277p();
        m213811F2().PlayerEvent.restartPlay().m199277p();
        m213811F2().PlayerEvent.playerVisible().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: J4 */
    private void m121693J4(r610 r610Var) {
        r610Var.m179990n(new x84.InterfaceC21264a() { // from class: l.ao10
            @Override // p153l.x84.InterfaceC21264a
            /* JADX INFO: renamed from: a */
            public final x84 mo99054a(x84 x84Var) {
                return this.f72411a.mo121404Y3(x84Var);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m121697p4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m121704x4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m121710F4();
        } else if (c4470c == C4470c.f16269k) {
            m121711G4();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m121705A4(String str) {
        m213811F2().MultiCallEvent.showAudienceApplyIcon().mo199274m(Boolean.TRUE);
        duringCreated(LivingNormalApiProvider.m72630e6(str, "anchor-close-multi")).subscribe(dhw.m115829h(new y20() { // from class: l.bo10
            @Override // p153l.y20
            public final void call(Object obj) {
                eo10.m121697p4((BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m121706B4(final BLiveMultiCall bLiveMultiCall) {
        if (bf10.m103817W(bLiveMultiCall.userId)) {
            ((xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo170536n(jyb.m147520m(bLiveMultiCall.mutedByUserIds, new qcj() { // from class: l.co10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    BLiveMultiCall bLiveMultiCall2 = bLiveMultiCall;
                    String str = (String) obj;
                    return Boolean.valueOf(TextUtils.equals(bLiveMultiCall2.ownerUserId, str) || TextUtils.equals(bLiveMultiCall2.userId, str));
                }
            }));
        } else if (fn10.m126334b(bLiveMultiCall)) {
            ((xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo170518Y(Integer.parseInt(bLiveMultiCall.userId), jyb.m147520m(bLiveMultiCall.mutedByUserIds, new qcj() { // from class: l.do10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, bLiveMultiCall.ownerUserId));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m121708D4(BLiveMultiCall bLiveMultiCall) {
        m121705A4(bLiveMultiCall.f45248id);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m121709E4(BLiveRtcToken bLiveRtcToken) {
        r610 r610Var = (r610) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        m121693J4(r610Var);
        String strM202194o = m213810E2().m202194o();
        String str = bLiveRtcToken.appId;
        String strValueOf = String.valueOf(m213810E2().mo183435j().streamCdnInfo.provider);
        String str2 = bLiveRtcToken.channelKey;
        String str3 = bLiveRtcToken.channel;
        String str4 = bLiveRtcToken.rtcProvider;
        int i = bLiveRtcToken.bitrate;
        String str5 = bLiveRtcToken.userSig;
        String strM153853u = this.f94717i.m190584b4().m153853u();
        boolean zM126518e = fp10.m126518e(this.f94717i.m190587e4());
        RoomPusherView roomPusherView = this.f94862k;
        r610Var.mo133185d(new wa10(strM202194o, str, strValueOf, str2, str3, str4, i, str5, strM153853u, zM126518e, roomPusherView.f52368a, roomPusherView.f52369b));
        m213811F2().MultiCallEvent.showAudienceApplyIcon().mo199274m(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F4 */
    public void m121710F4() {
        if (this.f94863l) {
            return;
        }
        this.f94863l = true;
        m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(2);
    }

    /* JADX INFO: renamed from: G4 */
    public void m121711G4() {
        this.f94863l = false;
        if (act().isFinishing()) {
            return;
        }
        m213811F2().MomoSdkEvent.sdkActionEvent().mo199273j(1);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m121712K4(final BLiveMultiCall bLiveMultiCall) {
        Dialog.C4460e c4460eM21553s0 = this.f196919f.dialog().m21499D(R$string.f47752Q0).m21553s0(R$string.f48494y5);
        c4460eM21553s0.m21541l0(R$string.f48204l1, new Runnable() { // from class: l.xn10
            @Override // java.lang.Runnable
            public final void run() {
                this.f195352a.m121708D4(bLiveMultiCall);
            }
        });
        c4460eM21553s0.m21567z0();
    }

    /* JADX INFO: renamed from: L4 */
    public void m121713L4() {
        ab10 ab10VarM121714w4 = m121714w4();
        if (NullChecker.m82486a(ab10VarM121714w4)) {
            ab10VarM121714w4.m96695z1();
        }
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: W3 */
    public void mo121402W3(le10 le10Var) {
        jyb.m147537z(le10Var.m153854v(), new y20() { // from class: l.yn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200767a.m121706B4((BLiveMultiCall) obj);
            }
        });
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: Y3 */
    public x84 mo121404Y3(x84 x84Var) {
        x84 x84VarMo121404Y3 = super.mo121404Y3(x84Var);
        int iM209669b = x84VarMo121404Y3.m209669b();
        if (iM209669b == 5) {
            ir10.m141746a("room push handle sdk local leave channel");
            m121692I4();
            return x84VarMo121404Y3;
        }
        if (iM209669b != 6) {
            return x84VarMo121404Y3;
        }
        ir10.m141746a("room push handle sdk local join channel");
        l51.m152888H(act(), new Runnable() { // from class: l.un10
            @Override // java.lang.Runnable
            public final void run() {
                this.f179695a.m121707C4();
            }
        }, 1500L);
        return x84VarMo121404Y3;
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: f4 */
    public void mo121411f4() {
        if (fp10.m126517d(this.f94717i.m190587e4())) {
            ab10 ab10VarM121714w4 = m121714w4();
            if (NullChecker.m82486a(ab10VarM121714w4)) {
                ab10VarM121714w4.m96692x1();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2, l.vp20] */
    @Override // p153l.en10
    /* JADX INFO: renamed from: j4 */
    public void mo121415j4() {
        ir10.m141746a("startMultiCallPush");
        if (((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
            return;
        }
        this.f94862k.setVisible(true);
        m121413h4(m213810E2().m202194o(), "", new y20() { // from class: l.zn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205170a.m121709E4((BLiveRtcToken) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    @Override // p153l.en10
    /* JADX INFO: renamed from: k4 */
    public void mo121416k4() {
        ir10.m141746a("stopCallPushMotion");
        m213811F2().MultiCallEvent.showAudienceApplyIcon().mo199274m(Boolean.TRUE);
        if (m213810E2().m202193m().m146878d()) {
            m121692I4();
        }
        m121715y4(true);
        m213811F2().MultiCallEvent.closeMultiCallMotion().m199277p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        if (m213810E2().m202193m().m146878d()) {
            m121692I4();
        } else {
            m121707C4();
        }
        super.mo70300n();
    }

    @Override // p153l.en10, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        szl szlVar = (szl) m138856F3(new c210(2600));
        if (szlVar != null) {
            szlVar.mo101596m0(act());
        }
        m138860d3(jc10.class, new qcj() { // from class: l.tn10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175218a.m121716z4((jc10) obj);
            }
        });
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.vn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184801a.m121704x4((C4470c) obj);
            }
        }));
        duringCreated(m213811F2().MultiCallEvent.selfLeaveCall().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.wn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189848a.m121715y4(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final ab10 m121714w4() {
        h0m h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (h0mVar == null) {
            return null;
        }
        C12877b c12877bMo133182a = h0mVar.mo133182a();
        if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
            return (ab10) c12877bMo133182a.m73074T0(ab10.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m121715y4(boolean z) {
        h0m h0mVar;
        if (!z || (h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))) == null) {
            return;
        }
        ir10.m141746a("self leave and stop call motion");
        h0mVar.mo133183b();
    }

    /* JADX INFO: renamed from: z4 */
    public final Boolean m121716z4(jc10 jc10Var) {
        String str = cd10.f81073a;
        jc10Var.getAction();
        BLiveMultiCall bLiveMultiCallM190587e4 = this.f94717i.m190587e4();
        if (!NullChecker.m82486a(bLiveMultiCallM190587e4) || !fp10.m126517d(this.f94717i.m190587e4())) {
            return Boolean.FALSE;
        }
        if (jc10Var.m144343e() || jc10Var.m144345g()) {
            o1j0.m165649w(R$string.f47773R0);
            return Boolean.TRUE;
        }
        if (!jc10Var.m144344f()) {
            return Boolean.valueOf(jc10Var.m144342d());
        }
        m121712K4(bLiveMultiCallM190587e4);
        return Boolean.TRUE;
    }
}
