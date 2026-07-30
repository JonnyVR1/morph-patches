package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.GameOperate;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b180 extends qct<oo2> implements v2m {

    /* JADX INFO: renamed from: i */
    public xx70 f74328i;

    /* JADX INFO: renamed from: j */
    public a980 f74329j;

    /* JADX INFO: renamed from: k */
    public lc80 f74330k;

    /* JADX INFO: renamed from: l */
    public y20<PkData> f74331l;

    /* JADX INFO: renamed from: m */
    public boolean f74332m;

    /* JADX INFO: renamed from: n */
    public kcg0 f74333n;

    /* JADX INFO: renamed from: o */
    public kcg0 f74334o;

    /* JADX INFO: renamed from: p */
    public BLive f74335p;

    public b180(dum dumVar) {
        super(dumVar);
        this.f74329j = new a980(dumVar);
        this.f74330k = new lc80(dumVar);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m101422V3(boolean z, x20 x20Var, Throwable th) {
        if (!z) {
            n180.m161093j("change stream error " + th.toString());
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m101424X3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m101426Z3() {
    }

    /* JADX INFO: renamed from: A4 */
    public final void m101428A4(BLive bLive, BLiveRtcToken bLiveRtcToken, PkData pkData) {
        final long jM174454o = pzi0.m174454o();
        h0m h0mVar = (h0m) m138856F3(new z310(2600));
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        String str = bLiveStreamUrl.push;
        String str2 = bLiveStreamUrl.pushIpv6;
        String str3 = bLive.room.f45267id;
        String strValueOf = String.valueOf(bLive.streamCdnInfo.provider);
        String strValueOf2 = String.valueOf(bLive.streamCdnInfo.businessType);
        BLiveVideoQualityConf bLiveVideoQualityConf = bLive.videoQualityConf;
        BLivePk bLivePk = pkData.f52415pk;
        h0mVar.mo133185d(new q880(str, str2, str3, strValueOf, strValueOf2, bLiveVideoQualityConf, bLiveRtcToken, bLivePk.otherChannel, bLivePk.peerChannelKey, Integer.valueOf(pkData.otherUserId()).intValue(), new z20() { // from class: l.p080
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f150017a.m101450r4(jM174454o, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: B4 */
    public void m101429B4(final PkData pkData) {
        if (this.f74335p == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72721o7(m213810E2().mo183435j().room.f45267id, "pk", this.f74335p.rtcInfo.provider)).subscribe(dhw.m115826e(new y20() { // from class: l.l080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129546a.m101451s4(pkData, (BLiveRtcToken) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: C4 */
    public void m101430C4() {
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(2600))).mo133182a();
        if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_PK)) {
            ((p880) c12877bMo133182a.m73074T0(p880.class)).m171197D1();
        }
        m101433c4(false, new y20() { // from class: l.v080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181842a.m101452t4((BLive) obj);
            }
        }, new x20() { // from class: l.w080
            @Override // p153l.x20
            public final void call() {
                this.f186548a.m101453u4();
            }
        });
    }

    @Override // p153l.v2m
    /* JADX INFO: renamed from: a0 */
    public void mo101431a0(xx70 xx70Var) {
        this.f74328i = xx70Var;
    }

    /* JADX INFO: renamed from: b4 */
    public void m101432b4(PkData pkData) {
        if (pkData == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pkId", pkData.f52415pk.f45269id);
        lej0.INSTANCE.m153911e("pk_anchor_start_trace", euk.m122578d(map));
        m101458z4(pkData);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c4 */
    public final void m101433c4(final boolean z, y20<BLive> y20Var, final x20 x20Var) {
        duringCreated(LivingNormalApiProvider.m72573Y3(m213810E2().m202191k(), z)).subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.q080
            @Override // p153l.y20
            public final void call(Object obj) {
                b180.m101422V3(z, x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public void m101434d4() {
        if (this.f74328i.m213503N3().isOnceMore() || TextUtils.isEmpty(this.f74328i.m213503N3().f52415pk.f45269id)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72693l6(this.f74328i.m213503N3().f52415pk.f45269id)).subscribe(dhw.m115826e(new y20() { // from class: l.o080
            @Override // p153l.y20
            public final void call(Object obj) {
                b180.m101424X3((BLivePk) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: e4 */
    public void m101435e4(String str, final String str2) {
        duringCreated(LivingNormalApiProvider.m72711n6(str, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.k080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123373a.m101456x4((BLivePk) obj);
            }
        }, new y20() { // from class: l.s080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165668a.m101446n4(str2, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.v2m
    /* JADX INFO: renamed from: f */
    public void mo101436f(PkData pkData) {
        if (pkData.isPreparing()) {
            this.f74329j.m96548i(pkData.f52415pk.f45269id, BLivePkStage.get("preparing"), this.f74331l, new ga80());
            this.f74330k.m153642e(new pcj() { // from class: l.x080
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f191875a.m101441j4();
                }
            }, new x20() { // from class: l.y080
                @Override // p153l.x20
                public final void call() {
                    this.f196953a.m101443k4();
                }
            });
        } else if (pkData.isPlaying()) {
            this.f74330k.m153642e(new pcj() { // from class: l.z080
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f202290a.m101444l4();
                }
            }, new x20() { // from class: l.a180
                @Override // p153l.x20
                public final void call() {
                    this.f67801a.m101445m4();
                }
            });
        } else if (pkData.isEnded()) {
            m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144375b(-1, m101437f4().lastState));
            this.f74329j.m96549j();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final PkData m101437f4() {
        return this.f74328i.m213503N3();
    }

    /* JADX INFO: renamed from: g4 */
    public void m101438g4(String str) {
        m101439h4(str, "");
    }

    /* JADX INFO: renamed from: h4 */
    public void m101439h4(String str, String str2) {
        if (!m213815L2() || m101437f4().isEnded() || m101437f4().isUnknown()) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            o1j0.m165634h(R$string.f47548Gb);
        }
        n180.m161093j("handle exit " + str + " reason = " + str2);
        m101435e4(m101437f4().f52415pk.f45269id, str);
    }

    /* JADX INFO: renamed from: i4 */
    public void m101440i4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_cdn_fail") && TextUtils.equals(livePkMessage.f48600id, m101437f4().f52415pk.f45269id)) {
            m101439h4(GameOperate.quit, "cdn fail");
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ Boolean m101441j4() {
        return m101437f4().isTargetState(BLivePkStage.get("preparing"));
    }

    @Override // p153l.v2m
    /* JADX INFO: renamed from: k */
    public void mo101442k(y20<PkData> y20Var) {
        this.f74331l = y20Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m101443k4() {
        m101439h4(GameOperate.quit, "prepare 30s timeout");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m101444l4() {
        return Boolean.valueOf(this.f74332m);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m101445m4() {
        m101439h4(GameOperate.quit, "other add timeout");
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m101446n4(String str, Throwable th) {
        ab80.m96733a(th);
        if (TextUtils.equals(str, "leave")) {
            return;
        }
        m101456x4(null);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ Boolean m101447o4() {
        return m101437f4().isTargetState(BLivePkStage.get("playing"));
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m101448p4() {
        m101439h4(GameOperate.quit, "playing countdown timeout");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m101450r4(long j, Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            m101457y4();
            this.f74328i.m213511Z3();
            lej0.INSTANCE.m153909c("pk_anchor_start_trace", "other_add");
            final long jM174454o = pzi0.m174454o() - j;
            fgt.m125530b(this, "anchor_pk_other_enter", new y20() { // from class: l.r080
                @Override // p153l.y20
                public final void call(Object obj2) {
                    ((Map) obj2).put("watch_duration", Long.valueOf(jM174454o));
                }
            });
            return;
        }
        if (iIntValue == 2) {
            m101438g4("other-leave");
            return;
        }
        if (iIntValue == 3) {
            lej0.INSTANCE.m153909c("pk_anchor_start_trace", "local_add");
        } else {
            if (iIntValue != 4) {
                return;
            }
            m213811F2().MomoSdkEvent.renewRtcToken().mo199273j(new f510(m213810E2().mo183435j().room.f45267id, "pk", String.valueOf(obj)));
        }
    }

    @Override // p153l.v2m
    public void reset() {
        this.f74329j.m96549j();
        this.f74330k.m153641d();
        this.f74332m = false;
        psd0.m173633z(this.f74333n);
        psd0.m173633z(this.f74334o);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m101451s4(PkData pkData, BLiveRtcToken bLiveRtcToken) {
        m101428A4(this.f74335p, bLiveRtcToken, pkData);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m101452t4(BLive bLive) {
        bLive.setFrom(600);
        m213811F2().LivePusherEvent.switchPushToNormal().mo199273j(bLive);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m101453u4() {
        ((h0m) m138856F3(new z310(2600))).mo133183b();
    }

    /* JADX INFO: renamed from: v4 */
    public void m101454v4(BLivePkStage bLivePkStage) {
        if (TEnum.equals(bLivePkStage, BLivePkStage.punishing)) {
            m101438g4("end-leave");
        } else if (TEnum.equals(bLivePkStage, "playing")) {
            this.f74329j.m96548i(this.f74328i.m213503N3().f52415pk.f45269id, BLivePkStage.get("playing"), this.f74331l, new ga80());
            this.f74330k.m153642e(new pcj() { // from class: l.m080
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f134299a.m101447o4();
                }
            }, new x20() { // from class: l.n080
                @Override // p153l.x20
                public final void call() {
                    this.f139597a.m101448p4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m101449q4(BLive bLive, PkData pkData) {
        this.f74335p = bLive;
        m101434d4();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m101456x4(BLivePk bLivePk) {
        PkData pkDataM101437f4 = m101437f4();
        pkDataM101437f4.f52415pk.situation.currentStageInfo.stage = BLivePkStage.get("ended");
        this.f74331l.call(pkDataM101437f4.updatePk(bLivePk));
    }

    /* JADX INFO: renamed from: y4 */
    public void m101457y4() {
        this.f74332m = true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m101458z4(final PkData pkData) {
        m101433c4(true, new y20() { // from class: l.t080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171472a.m101449q4(pkData, (BLive) obj);
            }
        }, new x20() { // from class: l.u080
            @Override // p153l.x20
            public final void call() {
                b180.m101426Z3();
            }
        });
    }
}
