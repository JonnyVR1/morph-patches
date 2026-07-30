package p153l;

import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class q0q extends uh10 {
    public q0q(dum<mu40> dumVar, i0q i0qVar) {
        super(dumVar, i0qVar);
        this.f94718j = (sc10) m153103z2(new sc10(dumVar, this.f94717i));
    }

    /* JADX INFO: renamed from: C4 */
    private void m174733C4(r610 r610Var) {
        r610Var.m179990n(new x84.InterfaceC21264a() { // from class: l.p0q
            @Override // p153l.x84.InterfaceC21264a
            /* JADX INFO: renamed from: a */
            public final x84 mo99054a(x84 x84Var) {
                return this.f150083a.mo121404Y3(x84Var);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ pf60 m174735t4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        return new pf60(bLive, bLiveRtcToken);
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ BLive m174736u4(List list, BLive bLive) {
        return bLive;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public void m174740y4(Throwable th) {
        o1j0.m165651y(xau.m209910t(R$string.f47523F8));
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ C22421c m174741A4(final BLive bLive) {
        return m121400U3(this.f94717i.m190587e4().ownerRoomId, bLive.rtcInfo.provider).map(new qcj() { // from class: l.o0q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q0q.m174735t4(bLive, (BLiveRtcToken) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m174742B4(pf60 pf60Var) {
        m174743D4((BLive) pf60Var.f152156a, (BLiveRtcToken) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: D4 */
    public void m174743D4(BLive bLive, BLiveRtcToken bLiveRtcToken) {
        ve10.m201029i(this, "multiCallAnchor");
        r610 r610Var = (r610) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        m174733C4(r610Var);
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        r610Var.mo133185d(new h910(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, this.f94717i.m190587e4().roomId, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf, bLiveRtcToken, this.f94717i.m190584b4().m153853u(), fp10.m126518e(this.f94717i.m190587e4())));
        m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
    }

    @Override // p153l.uh10, p153l.en10
    /* JADX INFO: renamed from: Y3 */
    public x84 mo121404Y3(x84 x84Var) {
        if (x84Var.m209669b() == 2 && TextUtils.equals(x84Var.m209674g(), this.f94717i.m190587e4().ownerUserId)) {
            mo121416k4();
        }
        return super.mo121404Y3(x84Var);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    @Override // p153l.en10
    /* JADX INFO: renamed from: j4 */
    public void mo121415j4() {
        super.mo121415j4();
        if (((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        ir10.m141746a("owner request call token and refresh Stream Url");
        duringCreated(C22421c.zip(LivingNormalApiProvider.m72368B5(this.f94717i.m190587e4().ownerLiveId).doOnNext(new y20() { // from class: l.j0q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117839a.m174745z4((List) obj);
            }
        }), LivingNormalApiProvider.m72495P6(m213810E2().m202191k(), cd10.f81071W), new rcj() { // from class: l.k0q
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return q0q.m174736u4((List) obj, (BLive) obj2);
            }
        }).flatMap(new qcj() { // from class: l.l0q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129582a.m174741A4((BLive) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.m0q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134326a.m174742B4((pf60) obj);
            }
        }, new y20() { // from class: l.n0q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139644a.m174740y4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.uh10
    /* JADX INFO: renamed from: r4 */
    public void mo174744r4(BLive bLive) {
        this.f94717i.m190583a4("start normal push");
        if (!wft.m206159b(2)) {
            m213811F2().LivePusherEvent.switchPushToNormal().mo199273j(bLive);
            return;
        }
        h0m h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        h0mVar.mo133185d(nw40.m164939b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m174745z4(List list) {
        this.f94717i.m190605w4((List<BLiveMultiCall>) list);
    }
}
