package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes5.dex */
public class k910 extends ue10<yl40> {
    public k910(bsm<yl40> bsmVar, j510<yl40> j510Var) {
        super(bsmVar, j510Var);
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: W3 */
    public void mo144988W3(b610 b610Var) {
        vwb.m200354z(b610Var.m100376v(), new e30() { // from class: l.f910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96441a.m144993p4((BLiveMultiCall) obj);
            }
        });
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: Y3 */
    public y74 mo144989Y3(y74 y74Var) {
        super.mo144989Y3(y74Var);
        if (y74Var.m213285b() == 6) {
            m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(3));
            return y74Var;
        }
        if (y74Var.m213285b() == 4) {
            BLiveMultiCall bLiveMultiCallM100373s = this.f175983i.m139800b4().m100373s(y74Var.m213290g());
            if (ve10.m198128b(bLiveMultiCallM100373s) || ve10.m198136j(bLiveMultiCallM100373s)) {
                boolean zM200337m = vwb.m200337m(bLiveMultiCallM100373s.mutedByUserIds, new w9j() { // from class: l.j910
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(r610.m177988W((String) obj));
                    }
                });
                y74Var.m213296m(zM200337m);
                yi10.m214879a("live handleSDKCallback mute:" + zM200337m);
            }
        }
        return y74Var;
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: f4 */
    public void mo144990f4() {
        oxl oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (oxlVar != null && oxlVar.mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((f110) oxlVar.mo133471a().m71891T0(f110.class)).m119089K1();
        }
    }

    @Override // p149l.ue10
    /* JADX INFO: renamed from: i4 */
    public void mo144991i4(String str) {
        hfw.m130790a(s410.f162235a, "setRestartWithURL:" + str);
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a();
        if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((f110) c12714bMo133471a).m119086H1(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    @Override // p149l.ue10
    /* JADX INFO: renamed from: k4 */
    public void mo144992k4() {
        C12714b c12714bMo133471a;
        yi10.m214879a("real stop multi call push");
        oxl oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (oxlVar == null || (c12714bMo133471a = oxlVar.mo133471a()) == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71312P6(m206027E2().m149814k(), s410.f162234X)).doOnError(new e30() { // from class: l.g910
            @Override // p149l.e30
            public final void call(Object obj) {
                yi10.m214879a("refreshStreamUrl to normal failed");
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.h910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106508a.mo144995r4((BLive) obj);
            }
        }, new e30() { // from class: l.i910
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112096a.m144994q4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(0));
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m144993p4(BLiveMultiCall bLiveMultiCall) {
        if (r610.m177988W(bLiveMultiCall.userId) || !ve10.m198128b(bLiveMultiCall)) {
            return;
        }
        ((exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo118676Y(Integer.parseInt(bLiveMultiCall.userId), r610.m177982Q(bLiveMultiCall));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m144994q4(Throwable th) {
        this.f175983i.m139799a4("refreshStreamUrl to normal failed");
    }

    /* JADX INFO: renamed from: r4 */
    public void mo144995r4(BLive bLive) {
        this.f175983i.m139799a4("start normal push");
        if (!vdt.m198092b(2)) {
            bLive.setFrom(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            m206028F2().LivePusherEvent.switchPushToNormal().mo172463j(bLive);
        } else {
            oxl oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
            oxlVar.mo133474d(zn40.m219447b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf));
        }
    }
}
