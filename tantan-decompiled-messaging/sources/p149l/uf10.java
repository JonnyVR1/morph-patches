package p149l;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class uf10 extends ue10<am40> {

    /* JADX INFO: renamed from: k */
    public final RoomPusherView f176223k;

    /* JADX INFO: renamed from: l */
    public boolean f176224l;

    public uf10(bsm<am40> bsmVar, RoomPusherView roomPusherView, ze10 ze10Var) {
        super(bsmVar, ze10Var);
        this.f176223k = roomPusherView;
        if (vdt.m198092b(2)) {
            m144512z2(new ww00(bsmVar));
        }
        this.f175984j = (i410) m144512z2(new i410(bsmVar, this.f175983i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4, reason: merged with bridge method [inline-methods] */
    public void m193360C4() {
        yi10.m214879a("pausePlayer");
        m206028F2().PlayerEvent.pausePlay().m172467p();
        m206028F2().PlayerEvent.playerVisible().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: I4 */
    private void m193345I4() {
        yi10.m214879a("restartPlayer");
        m206028F2().PlayerEvent.restorePlayerView().m172467p();
        m206028F2().PlayerEvent.restartPlay().m172467p();
        m206028F2().PlayerEvent.playerVisible().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: J4 */
    private void m193346J4(hy00 hy00Var) {
        hy00Var.m133484n(new y74.InterfaceC21330a() { // from class: l.qf10
            @Override // p149l.y74.InterfaceC21330a
            /* JADX INFO: renamed from: a */
            public final y74 mo106704a(y74 y74Var) {
                return this.f154075a.mo144989Y3(y74Var);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m193350p4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m193357x4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m193363F4();
        } else if (c4319c == C4319c.f15550k) {
            m193364G4();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public void m193358A4(String str) {
        m206028F2().MultiCallEvent.showAudienceApplyIcon().mo172464m(Boolean.TRUE);
        duringCreated(LivingNormalApiProvider.m71447e6(str, "anchor-close-multi")).subscribe(ffw.m121197h(new e30() { // from class: l.rf10
            @Override // p149l.e30
            public final void call(Object obj) {
                uf10.m193350p4((BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m193359B4(final BLiveMultiCall bLiveMultiCall) {
        if (r610.m177988W(bLiveMultiCall.userId)) {
            ((exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo118679n(vwb.m200337m(bLiveMultiCall.mutedByUserIds, new w9j() { // from class: l.sf10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    BLiveMultiCall bLiveMultiCall2 = bLiveMultiCall;
                    String str = (String) obj;
                    return Boolean.valueOf(TextUtils.equals(bLiveMultiCall2.ownerUserId, str) || TextUtils.equals(bLiveMultiCall2.userId, str));
                }
            }));
        } else if (ve10.m198128b(bLiveMultiCall)) {
            ((exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo118676Y(Integer.parseInt(bLiveMultiCall.userId), vwb.m200337m(bLiveMultiCall.mutedByUserIds, new w9j() { // from class: l.tf10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, bLiveMultiCall.ownerUserId));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m193361D4(BLiveMultiCall bLiveMultiCall) {
        m193358A4(bLiveMultiCall.f44400id);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m193362E4(BLiveRtcToken bLiveRtcToken) {
        hy00 hy00Var = (hy00) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        m193346J4(hy00Var);
        String strM149818o = m206027E2().m149818o();
        String str = bLiveRtcToken.appId;
        String strValueOf = String.valueOf(m206027E2().mo149813j().streamCdnInfo.provider);
        String str2 = bLiveRtcToken.channelKey;
        String str3 = bLiveRtcToken.channel;
        String str4 = bLiveRtcToken.rtcProvider;
        int i = bLiveRtcToken.bitrate;
        String str5 = bLiveRtcToken.userSig;
        String strM100375u = this.f175983i.m139800b4().m100375u();
        boolean zM198313e = vg10.m198313e(this.f175983i.m139803e4());
        RoomPusherView roomPusherView = this.f176223k;
        hy00Var.mo133474d(new m210(strM149818o, str, strValueOf, str2, str3, str4, i, str5, strM100375u, zM198313e, roomPusherView.f51520a, roomPusherView.f51521b));
        m206028F2().MultiCallEvent.showAudienceApplyIcon().mo172464m(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F4 */
    public void m193363F4() {
        if (this.f176224l) {
            return;
        }
        this.f176224l = true;
        m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(2);
    }

    /* JADX INFO: renamed from: G4 */
    public void m193364G4() {
        this.f176224l = false;
        if (act().isFinishing()) {
            return;
        }
        m206028F2().MomoSdkEvent.sdkActionEvent().mo172463j(1);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m193365K4(final BLiveMultiCall bLiveMultiCall) {
        Dialog.C4309e c4309eM20554s0 = this.f188513f.dialog().m20500D(R$string.f46904Q0).m20554s0(R$string.f47646y5);
        c4309eM20554s0.m20542l0(R$string.f47356l1, new Runnable() { // from class: l.nf10
            @Override // java.lang.Runnable
            public final void run() {
                this.f138677a.m193361D4(bLiveMultiCall);
            }
        });
        c4309eM20554s0.m20568z0();
    }

    /* JADX INFO: renamed from: L4 */
    public void m193366L4() {
        q210 q210VarM193367w4 = m193367w4();
        if (NullChecker.m81303a(q210VarM193367w4)) {
            q210VarM193367w4.m172431z1();
        }
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: W3 */
    public void mo144988W3(b610 b610Var) {
        vwb.m200354z(b610Var.m100376v(), new e30() { // from class: l.of10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143617a.m193359B4((BLiveMultiCall) obj);
            }
        });
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: Y3 */
    public y74 mo144989Y3(y74 y74Var) {
        y74 y74VarMo144989Y3 = super.mo144989Y3(y74Var);
        int iM213285b = y74VarMo144989Y3.m213285b();
        if (iM213285b == 5) {
            yi10.m214879a("room push handle sdk local leave channel");
            m193345I4();
            return y74VarMo144989Y3;
        }
        if (iM213285b != 6) {
            return y74VarMo144989Y3;
        }
        yi10.m214879a("room push handle sdk local join channel");
        e51.m114743H(act(), new Runnable() { // from class: l.kf10
            @Override // java.lang.Runnable
            public final void run() {
                this.f122890a.m193360C4();
            }
        }, 1500L);
        return y74VarMo144989Y3;
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: f4 */
    public void mo144990f4() {
        if (vg10.m198312d(this.f175983i.m139803e4())) {
            q210 q210VarM193367w4 = m193367w4();
            if (NullChecker.m81303a(q210VarM193367w4)) {
                q210VarM193367w4.m172429x1();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    @Override // p149l.ue10
    /* JADX INFO: renamed from: j4 */
    public void mo154057j4() {
        yi10.m214879a("startMultiCallPush");
        if (((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
            return;
        }
        this.f176223k.setVisible(true);
        m193189h4(m206027E2().m149818o(), "", new e30() { // from class: l.pf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148509a.m193362E4((BLiveRtcToken) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    @Override // p149l.ue10
    /* JADX INFO: renamed from: k4 */
    public void mo144992k4() {
        yi10.m214879a("stopCallPushMotion");
        m206028F2().MultiCallEvent.showAudienceApplyIcon().mo172464m(Boolean.TRUE);
        if (m206027E2().m149816m().m137797d()) {
            m193345I4();
        }
        m193368y4(true);
        m206028F2().MultiCallEvent.closeMultiCallMotion().m172467p();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        if (m206027E2().m149816m().m137797d()) {
            m193345I4();
        } else {
            m193360C4();
        }
        super.mo69117n();
    }

    @Override // p149l.ue10, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        zwl zwlVar = (zwl) m129297F3(new tt00(2600));
        if (zwlVar != null) {
            zwlVar.mo185833m0(act());
        }
        m129301d3(z310.class, new w9j() { // from class: l.jf10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f117624a.m193369z4((z310) obj);
            }
        });
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.lf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127825a.m193357x4((C4319c) obj);
            }
        }));
        duringCreated(m206028F2().MultiCallEvent.selfLeaveCall().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.mf10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133553a.m193368y4(((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final q210 m193367w4() {
        oxl oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (oxlVar == null) {
            return null;
        }
        C12714b c12714bMo133471a = oxlVar.mo133471a();
        if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE)) {
            return (q210) c12714bMo133471a.m71891T0(q210.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m193368y4(boolean z) {
        oxl oxlVar;
        if (!z || (oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))) == null) {
            return;
        }
        yi10.m214879a("self leave and stop call motion");
        oxlVar.mo133472b();
    }

    /* JADX INFO: renamed from: z4 */
    public final Boolean m193369z4(z310 z310Var) {
        String str = s410.f162235a;
        z310Var.getAction();
        BLiveMultiCall bLiveMultiCallM139803e4 = this.f175983i.m139803e4();
        if (!NullChecker.m81303a(bLiveMultiCallM139803e4) || !vg10.m198312d(this.f175983i.m139803e4())) {
            return Boolean.FALSE;
        }
        if (z310Var.m217007e() || z310Var.m217009g()) {
            lsi0.m151593w(R$string.f46925R0);
            return Boolean.TRUE;
        }
        if (!z310Var.m217008f()) {
            return Boolean.valueOf(z310Var.m217006d());
        }
        m193365K4(bLiveMultiCallM139803e4);
        return Boolean.TRUE;
    }
}
