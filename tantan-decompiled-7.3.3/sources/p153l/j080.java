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
public class j080 extends qct<oo2> implements u2m {

    /* JADX INFO: renamed from: i */
    public ha80 f117792i;

    /* JADX INFO: renamed from: j */
    public a980 f117793j;

    /* JADX INFO: renamed from: k */
    public lc80 f117794k;

    /* JADX INFO: renamed from: l */
    public y20<PkData> f117795l;

    /* JADX INFO: renamed from: m */
    public boolean f117796m;

    /* JADX INFO: renamed from: n */
    public kcg0 f117797n;

    /* JADX INFO: renamed from: o */
    public kcg0 f117798o;

    /* JADX INFO: renamed from: p */
    public BLive f117799p;

    public j080(dum dumVar) {
        super(dumVar);
        this.f117793j = new a980(dumVar);
        this.f117794k = new lc80(dumVar);
    }

    /* JADX INFO: renamed from: A4 */
    private void m142911A4(BLive bLive, BLiveRtcToken bLiveRtcToken, PkData pkData) {
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
        h0mVar.mo133185d(new q880(str, str2, str3, strValueOf, strValueOf2, bLiveVideoQualityConf, bLiveRtcToken, bLivePk.otherChannel, bLivePk.peerChannelKey, Integer.valueOf(pkData.otherUserId()).intValue(), new z20() { // from class: l.wz70
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f191732a.m142939r4(jM174454o, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m142920S3(boolean z, x20 x20Var, Throwable th) {
        if (!z) {
            n180.m161093j("change stream error " + th.toString());
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m142926Y3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m142927Z3() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c4 */
    private void m142929c4(final boolean z, y20<BLive> y20Var, final x20 x20Var) {
        duringCreated(LivingNormalApiProvider.m72573Y3(m213810E2().m202191k(), z)).subscribe(dhw.m115826e(y20Var, new y20() { // from class: l.yz70
            @Override // p153l.y20
            public final void call(Object obj) {
                j080.m142920S3(z, x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    private PkData m142930f4() {
        return this.f117792i.m134135N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ Boolean m142931j4() {
        return m142930f4().isTargetState(BLivePkStage.get("preparing"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m142932k4() {
        m142953h4(GameOperate.quit, "prepare 30s timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ Boolean m142933l4() {
        return Boolean.valueOf(this.f117796m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m142934m4() {
        m142953h4(GameOperate.quit, "other add timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m142935n4(String str, Throwable th) {
        ab80.m96733a(th);
        if (TextUtils.equals(str, "leave")) {
            return;
        }
        m142944x4(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ Boolean m142936o4() {
        return m142930f4().isTargetState(BLivePkStage.get("playing"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m142937p4() {
        m142953h4(GameOperate.quit, "playing countdown timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m142939r4(long j, Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            m142957y4();
            this.f117792i.m134146Z3();
            lej0.INSTANCE.m153909c("pk_anchor_start_trace", "other_add");
            final long jM174454o = pzi0.m174454o() - j;
            fgt.m125530b(this, "anchor_pk_other_enter", new y20() { // from class: l.zz70
                @Override // p153l.y20
                public final void call(Object obj2) {
                    ((Map) obj2).put("watch_duration", Long.valueOf(jM174454o));
                }
            });
            return;
        }
        if (iIntValue == 2) {
            m142952g4("other-leave");
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m142940s4(PkData pkData, BLiveRtcToken bLiveRtcToken) {
        m142911A4(this.f117799p, bLiveRtcToken, pkData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m142941t4(BLive bLive) {
        bLive.setFrom(600);
        m213811F2().LivePusherEvent.switchPushToNormal().mo199273j(bLive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m142942u4() {
        ((h0m) m138856F3(new z310(2600))).mo133183b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public void m142938q4(BLive bLive, PkData pkData) {
        this.f117799p = bLive;
        m142949d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m142944x4(BLivePk bLivePk) {
        PkData pkDataM142930f4 = m142930f4();
        pkDataM142930f4.f52415pk.situation.currentStageInfo.stage = BLivePkStage.get("ended");
        this.f117795l.call(pkDataM142930f4.updatePk(bLivePk));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: B4 */
    public void m142945B4(final PkData pkData) {
        if (this.f117799p == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72721o7(m213810E2().mo183435j().room.f45267id, "pk", this.f117799p.rtcInfo.provider)).subscribe(dhw.m115826e(new y20() { // from class: l.h080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107277a.m142940s4(pkData, (BLiveRtcToken) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: C4 */
    public void m142946C4() {
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(2600))).mo133182a();
        if (c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_PK)) {
            ((p880) c12877bMo133182a.m73074T0(p880.class)).m171197D1();
        }
        m142929c4(false, new y20() { // from class: l.d080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84538a.m142941t4((BLive) obj);
            }
        }, new x20() { // from class: l.e080
            @Override // p153l.x20
            public final void call() {
                this.f91428a.m142942u4();
            }
        });
    }

    @Override // p153l.u2m
    /* JADX INFO: renamed from: G */
    public void mo142947G(ha80 ha80Var) {
        this.f117792i = ha80Var;
    }

    /* JADX INFO: renamed from: b4 */
    public void m142948b4(PkData pkData) {
        if (pkData == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pkId", pkData.f52415pk.f45269id);
        lej0.INSTANCE.m153911e("pk_anchor_start_trace", euk.m122578d(map));
        m142958z4(pkData);
    }

    /* JADX INFO: renamed from: d4 */
    public void m142949d4() {
        if (this.f117792i.m134135N3().isOnceMore() || TextUtils.isEmpty(this.f117792i.m134135N3().f52415pk.f45269id)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72693l6(this.f117792i.m134135N3().f52415pk.f45269id)).subscribe(dhw.m115826e(new y20() { // from class: l.xz70
            @Override // p153l.y20
            public final void call(Object obj) {
                j080.m142926Y3((BLivePk) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: e4 */
    public void m142950e4(String str, final String str2) {
        duringCreated(LivingNormalApiProvider.m72711n6(str, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.f080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96664a.m142944x4((BLivePk) obj);
            }
        }, new y20() { // from class: l.g080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101617a.m142935n4(str2, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.u2m
    /* JADX INFO: renamed from: f */
    public void mo142951f(PkData pkData) {
        if (pkData.isPreparing()) {
            this.f117793j.m96548i(pkData.f52415pk.f45269id, BLivePkStage.get("preparing"), this.f117795l, new ga80());
            this.f117794k.m153642e(new pcj() { // from class: l.i080
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f112340a.m142931j4();
                }
            }, new x20() { // from class: l.tz70
                @Override // p153l.x20
                public final void call() {
                    this.f176746a.m142932k4();
                }
            });
        } else if (pkData.isPlaying()) {
            this.f117794k.m153642e(new pcj() { // from class: l.uz70
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f181708a.m142933l4();
                }
            }, new x20() { // from class: l.vz70
                @Override // p153l.x20
                public final void call() {
                    this.f186452a.m142934m4();
                }
            });
        } else if (pkData.isEnded()) {
            m213811F2().LivePkEvent.pkStateEvent().mo199273j(jct.m144375b(-1, m142930f4().lastState));
            this.f117793j.m96549j();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m142952g4(String str) {
        m142953h4(str, "");
    }

    /* JADX INFO: renamed from: h4 */
    public void m142953h4(String str, String str2) {
        if (!m213815L2() || m142930f4().isEnded() || m142930f4().isUnknown()) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            o1j0.m165634h(R$string.f47548Gb);
        }
        n180.m161093j("handle exit " + str + " reason = " + str2);
        m142950e4(m142930f4().f52415pk.f45269id, str);
    }

    /* JADX INFO: renamed from: i4 */
    public void m142954i4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_cdn_fail") && TextUtils.equals(livePkMessage.f48600id, m142930f4().f52415pk.f45269id)) {
            m142953h4(GameOperate.quit, "cdn fail");
        }
    }

    @Override // p153l.u2m
    /* JADX INFO: renamed from: k */
    public void mo142955k(y20<PkData> y20Var) {
        this.f117795l = y20Var;
    }

    @Override // p153l.u2m
    public void reset() {
        this.f117793j.m96549j();
        this.f117794k.m153641d();
        this.f117796m = false;
        psd0.m173633z(this.f117797n);
        psd0.m173633z(this.f117798o);
    }

    /* JADX INFO: renamed from: v4 */
    public void m142956v4(BLivePkStage bLivePkStage) {
        if (TEnum.equals(bLivePkStage, BLivePkStage.punishing)) {
            m142952g4("end-leave");
        } else if (TEnum.equals(bLivePkStage, "playing")) {
            this.f117793j.m96548i(this.f117792i.m134135N3().f52415pk.f45269id, BLivePkStage.get("playing"), this.f117795l, new ga80());
            this.f117794k.m153642e(new pcj() { // from class: l.sz70
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f171363a.m142936o4();
                }
            }, new x20() { // from class: l.a080
                @Override // p153l.x20
                public final void call() {
                    this.f67695a.m142937p4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m142957y4() {
        this.f117796m = true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m142958z4(final PkData pkData) {
        m142929c4(true, new y20() { // from class: l.b080
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74254a.m142938q4(pkData, (BLive) obj);
            }
        }, new x20() { // from class: l.c080
            @Override // p153l.x20
            public final void call() {
                j080.m142927Z3();
            }
        });
    }
}
