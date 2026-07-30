package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes5.dex */
public class uh10 extends en10<mu40> {
    public uh10(dum<mu40> dumVar, td10<mu40> td10Var) {
        super(dumVar, td10Var);
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: W3 */
    public void mo121402W3(le10 le10Var) {
        jyb.m147537z(le10Var.m153854v(), new y20() { // from class: l.ph10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152390a.m196017p4((BLiveMultiCall) obj);
            }
        });
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: Y3 */
    public x84 mo121404Y3(x84 x84Var) {
        super.mo121404Y3(x84Var);
        if (x84Var.m209669b() == 6) {
            m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(3));
            return x84Var;
        }
        if (x84Var.m209669b() == 4) {
            BLiveMultiCall bLiveMultiCallM153851s = this.f94717i.m190584b4().m153851s(x84Var.m209674g());
            if (fn10.m126334b(bLiveMultiCallM153851s) || fn10.m126342j(bLiveMultiCallM153851s)) {
                boolean zM147520m = jyb.m147520m(bLiveMultiCallM153851s.mutedByUserIds, new qcj() { // from class: l.th10
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(bf10.m103817W((String) obj));
                    }
                });
                x84Var.m209680m(zM147520m);
                ir10.m141746a("live handleSDKCallback mute:" + zM147520m);
            }
        }
        return x84Var;
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: f4 */
    public void mo121411f4() {
        h0m h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (h0mVar != null && h0mVar.mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((p910) h0mVar.mo133182a().m73074T0(p910.class)).m171314K1();
        }
    }

    @Override // p153l.en10
    /* JADX INFO: renamed from: i4 */
    public void mo121414i4(String str) {
        fhw.m125605a(cd10.f81073a, "setRestartWithURL:" + str);
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo133182a();
        if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            ((p910) c12877bMo133182a).m171311H1(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2, l.vp20] */
    @Override // p153l.en10
    /* JADX INFO: renamed from: k4 */
    public void mo121416k4() {
        C12877b c12877bMo133182a;
        ir10.m141746a("real stop multi call push");
        h0m h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
        if (h0mVar == null || (c12877bMo133182a = h0mVar.mo133182a()) == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72495P6(m213810E2().m202191k(), cd10.f81072X)).doOnError(new y20() { // from class: l.qh10
            @Override // p153l.y20
            public final void call(Object obj) {
                ir10.m141746a("refreshStreamUrl to normal failed");
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.rh10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163070a.mo174744r4((BLive) obj);
            }
        }, new y20() { // from class: l.sh10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168574a.m196018q4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(0));
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m196017p4(BLiveMultiCall bLiveMultiCall) {
        if (bf10.m103817W(bLiveMultiCall.userId) || !fn10.m126334b(bLiveMultiCall)) {
            return;
        }
        ((xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo170518Y(Integer.parseInt(bLiveMultiCall.userId), bf10.m103811Q(bLiveMultiCall));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m196018q4(Throwable th) {
        this.f94717i.m190583a4("refreshStreamUrl to normal failed");
    }

    /* JADX INFO: renamed from: r4 */
    public void mo174744r4(BLive bLive) {
        this.f94717i.m190583a4("start normal push");
        if (!wft.m206159b(2)) {
            bLive.setFrom(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
            m213811F2().LivePusherEvent.switchPushToNormal().mo199273j(bLive);
        } else {
            h0m h0mVar = (h0m) m138856F3(new z310(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED));
            BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
            h0mVar.mo133185d(nw40.m164939b(bLiveStreamUrl.push, bLiveStreamUrl.pushIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType), bLive.videoQualityConf));
        }
    }
}
