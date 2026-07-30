package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class md10 extends k910 {

    /* JADX INFO: renamed from: k */
    public final int f133204k;

    /* JADX INFO: renamed from: l */
    public final mzf0 f133205l;

    public md10(bsm<yl40> bsmVar, j510<yl40> j510Var, int i) {
        super(bsmVar, j510Var);
        this.f133204k = i;
        this.f175984j = (i410) m144512z2(new r410(bsmVar, j510Var));
        this.f133205l = (mzf0) m144512z2(new mzf0(bsmVar));
    }

    /* JADX INFO: renamed from: L4 */
    private void m154037L4(hy00 hy00Var) {
        hy00Var.m133484n(new y74.InterfaceC21330a() { // from class: l.kd10
            @Override // p149l.y74.InterfaceC21330a
            /* JADX INFO: renamed from: a */
            public final y74 mo106704a(y74 y74Var) {
                return this.f122532a.mo144989Y3(y74Var);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m154041v4(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: x4 */
    public static /* synthetic */ j760 m154043x4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        return new j760(bLive, bLiveRtcToken);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: B4 */
    public final String m154046B4() {
        return "friends".equals(m206027E2().mo149813j().liveMode) ? "start-live" : "multi-call-button";
    }

    /* JADX INFO: renamed from: C4 */
    public final void m154047C4(List<BLiveMultiCall> list) {
        vwb.m200354z(list, new e30() { // from class: l.gd10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102073a.m154050F4((BLiveMultiCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public final void m154048D4(BLiveMultiCall bLiveMultiCall) {
        yi10.m214879a("handleOwnerComeBack callId" + bLiveMultiCall.f44400id);
        l610.m148692i(this, "multiCallOwner");
        mo154057j4();
        this.f175984j.m134316K3(bLiveMultiCall);
        ((r410) this.f175984j).m177760Y3(bLiveMultiCall);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E4 */
    public final void m154049E4(Throwable th) {
        LivingNormalApiProvider.m71427c4(m206027E2().m149814k());
        this.f175983i.m139799a4(th.getMessage());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m154050F4(BLiveMultiCall bLiveMultiCall) {
        if (r610.m177988W(bLiveMultiCall.userId)) {
            m154048D4(bLiveMultiCall);
            return;
        }
        yi10.m214879a("handleOldData hangup" + bLiveMultiCall.f44400id);
        LivingNormalApiProvider.m71447e6(bLiveMultiCall.f44400id, "recover hangup");
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m154051G4(BLiveMultiCall bLiveMultiCall) {
        m206028F2().MultiCallEvent.addWatchList().mo172463j(bLiveMultiCall);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m154052H4(BLiveMultiCall bLiveMultiCall) {
        r610.m178004i0(this, bLiveMultiCall, "owner apply");
        l610.m148692i(this, "multiCallOwner");
        this.f175983i.m139798Z3(bLiveMultiCall);
        this.f175984j.m134316K3(bLiveMultiCall);
        ((r410) this.f175984j).m177760Y3(bLiveMultiCall);
        if ("friends".equals(m206027E2().mo149813j().liveMode)) {
            return;
        }
        m206028F2().MultiCallEvent.openManageDialog().mo172463j(Integer.valueOf(this.f133204k));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ C22306c m154053I4(final BLive bLive) {
        return m193179U3(m206027E2().m149818o(), bLive.rtcInfo.provider).map(new w9j() { // from class: l.ld10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return md10.m154043x4(bLive, (BLiveRtcToken) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: J4 */
    public final void m154054J4() {
        if ("friends".equals(m206027E2().mo149813j().liveMode) && ((Boolean) m129297F3(new pzf0(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).booleanValue()) {
            this.f133205l.m157141P3();
            yi10.m214879a("multi call owner onPushStarting");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: K4 */
    public final void m154055K4() {
        yi10.m214879a("ownerApplyCall");
        duringCreated(LivingNormalApiProvider.m71210E3(r610.m178009n(m206027E2(), this.f175983i.m139800b4().m100377w(), m206027E2().m149814k(), "", s410.f162243i, s410.f162246l, 1, m206027E2().m132060D0(), m154046B4()))).doOnNext(new e30() { // from class: l.dd10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85528a.m154051G4((BLiveMultiCall) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ed10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90582a.m154052H4((BLiveMultiCall) obj);
            }
        }, new fd10(this)));
    }

    /* JADX INFO: renamed from: M4 */
    public void m154056M4(j760<BLive, BLiveRtcToken> j760Var) {
        hy00 hy00Var = (hy00) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        m154037L4(hy00Var);
        BLive bLive = j760Var.f116564a;
        hy00Var.mo133474d(new x010(bLive.streamUrl.push, bLive.streamUrl.pushIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(j760Var.f116564a.streamCdnInfo.businessType), j760Var.f116564a.videoQualityConf, j760Var.f116565b, this.f175983i.m139800b4().m100375u(), true));
        m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2, l.lh20] */
    @Override // p149l.k910, p149l.ue10
    /* JADX INFO: renamed from: Y3 */
    public y74 mo144989Y3(y74 y74Var) {
        super.mo144989Y3(y74Var);
        int iM213285b = y74Var.m213285b();
        if (iM213285b == 2) {
            BLiveMultiCall bLiveMultiCallM100373s = this.f175983i.m139800b4().m100373s(y74Var.m213290g());
            if (NullChecker.m81303a(bLiveMultiCallM100373s)) {
                duringCreated(LivingNormalApiProvider.m71447e6(bLiveMultiCallM100373s.f44400id, "anchor-sdk-leave")).subscribe(ffw.m121197h(new e30() { // from class: l.cd10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        md10.m154041v4((BLiveMultiCall) obj);
                    }
                }));
            }
        } else {
            if (iM213285b == 3 || iM213285b == 6) {
                this.f175984j.mo134320O3(y74Var.m213290g());
                return y74Var;
            }
            if (iM213285b == 7) {
                m206028F2().LivePusherEvent.stopLive().mo172463j(m206027E2().m149814k());
                return y74Var;
            }
            if (iM213285b == 11) {
                m154054J4();
                return y74Var;
            }
        }
        return y74Var;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    @Override // p149l.ue10
    /* JADX INFO: renamed from: j4 */
    public void mo154057j4() {
        if (((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        yi10.m214879a("owner request call token and refresh Stream Url");
        duringCreated(LivingNormalApiProvider.m71312P6(m206027E2().m149814k(), s410.f162233W)).flatMap(new w9j() { // from class: l.hd10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f107190a.m154053I4((BLive) obj);
            }
        }).doOnError(new e30() { // from class: l.id10
            @Override // p149l.e30
            public final void call(Object obj) {
                yi10.m214879a("request multi cal push params failed");
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.jd10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117365a.m154056M4((j760) obj);
            }
        }, new fd10(this)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    @Override // p149l.k910, p149l.ue10
    /* JADX INFO: renamed from: k4 */
    public void mo144992k4() {
        C12714b c12714bMo133471a;
        yi10.m214879a("real stop multi call push");
        if (!"friends".equals(m206027E2().mo149813j().liveMode)) {
            super.mo144992k4();
            return;
        }
        oxl oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (oxlVar == null || (c12714bMo133471a = oxlVar.mo133471a()) == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        this.f175983i.m139799a4("close live");
        m206028F2().LivePusherEvent.stopLive().mo172463j(m206027E2().m149814k());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v13, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l.ho2, l.lh20] */
    @Override // p149l.ue10, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (!"friends".equals(m206027E2().mo149813j().liveMode)) {
            m154055K4();
            return;
        }
        BLiveMultiCallInfo bLiveMultiCallInfo = ((BLive) m206027E2().mo149813j()).multiCallInfo;
        if (bLiveMultiCallInfo == null || !bLiveMultiCallInfo.onGoing || !"friends".equals(m206027E2().mo149813j().liveMode)) {
            m154055K4();
        } else {
            duringCreated(LivingNormalApiProvider.m71185B5(m206027E2().m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.bd10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74997a.m154047C4((List) obj);
                }
            }));
            yi10.m214879a("friends live  getOnGoingCallList");
        }
    }
}
