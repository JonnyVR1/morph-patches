package p149l;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class qyp extends k910 {
    public qyp(bsm<yl40> bsmVar, iyp iypVar) {
        super(bsmVar, iypVar);
        this.f175984j = (i410) m144512z2(new i410(bsmVar, this.f175983i));
    }

    /* JADX INFO: renamed from: C4 */
    private void m177046C4(hy00 hy00Var) {
        hy00Var.m133484n(new y74.InterfaceC21330a() { // from class: l.pyp
            @Override // p149l.y74.InterfaceC21330a
            /* JADX INFO: renamed from: a */
            public final y74 mo106704a(y74 y74Var) {
                return this.f151869a.mo144989Y3(y74Var);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ j760 m177048t4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        return new j760(bLive, bLiveRtcToken);
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ BLive m177049u4(List list, BLive bLive) {
        return bLive;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public void m177053y4(Throwable th) {
        lsi0.m151595y(w8u.m202217t(R$string.f46675F8));
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ C22306c m177054A4(final BLive bLive) {
        return m193179U3(this.f175983i.m139803e4().ownerRoomId, bLive.rtcInfo.provider).map(new w9j() { // from class: l.oyp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qyp.m177048t4(bLive, (BLiveRtcToken) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m177055B4(j760 j760Var) {
        m177056D4((BLive) j760Var.f116564a, (BLiveRtcToken) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: D4 */
    public void m177056D4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        l610.m148692i(this, "multiCallAnchor");
        hy00 hy00Var = (hy00) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        m177046C4(hy00Var);
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        hy00Var.mo133474d(new x010(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, this.f175983i.m139803e4().roomId, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf, bLiveRtcToken, this.f175983i.m139800b4().m100375u(), vg10.m198313e(this.f175983i.m139803e4())));
        m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
    }

    @Override // p149l.k910, p149l.ue10
    /* JADX INFO: renamed from: Y3 */
    public y74 mo144989Y3(y74 y74Var) {
        if (y74Var.m213285b() == 2 && TextUtils.equals(y74Var.m213290g(), this.f175983i.m139803e4().ownerUserId)) {
            mo144992k4();
        }
        return super.mo144989Y3(y74Var);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    @Override // p149l.ue10
    /* JADX INFO: renamed from: j4 */
    public void mo154057j4() {
        super.mo154057j4();
        if (((oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        yi10.m214879a("owner request call token and refresh Stream Url");
        duringCreated(C22306c.zip(LivingNormalApiProvider.m71185B5(this.f175983i.m139803e4().ownerLiveId).doOnNext(new e30() { // from class: l.jyp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120319a.m177057z4((List) obj);
            }
        }), LivingNormalApiProvider.m71312P6(m206027E2().m149814k(), s410.f162233W), new x9j() { // from class: l.kyp
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return qyp.m177049u4((List) obj, (BLive) obj2);
            }
        }).flatMap(new w9j() { // from class: l.lyp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130591a.m177054A4((BLive) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.myp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136323a.m177055B4((j760) obj);
            }
        }, new e30() { // from class: l.nyp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141141a.m177053y4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k910
    /* JADX INFO: renamed from: r4 */
    public void mo144995r4(BLive bLive) {
        this.f175983i.m139799a4("start normal push");
        if (!vdt.m198092b(2)) {
            m206028F2().LivePusherEvent.switchPushToNormal().mo172463j(bLive);
            return;
        }
        oxl oxlVar = (oxl) m129297F3(new rv00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        oxlVar.mo133474d(zn40.m219447b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m177057z4(List list) {
        this.f175983i.m139821w4((List<BLiveMultiCall>) list);
    }
}
