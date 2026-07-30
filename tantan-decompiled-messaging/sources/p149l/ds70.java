package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.GameOperate;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ds70 extends pat<ho2> implements a0m {

    /* JADX INFO: renamed from: i */
    public b280 f87724i;

    /* JADX INFO: renamed from: j */
    public u080 f87725j;

    /* JADX INFO: renamed from: k */
    public f480 f87726k;

    /* JADX INFO: renamed from: l */
    public e30<PkData> f87727l;

    /* JADX INFO: renamed from: m */
    public boolean f87728m;

    /* JADX INFO: renamed from: n */
    public c4g0 f87729n;

    /* JADX INFO: renamed from: o */
    public c4g0 f87730o;

    /* JADX INFO: renamed from: p */
    public BLive f87731p;

    public ds70(bsm bsmVar) {
        super(bsmVar);
        this.f87725j = new u080(bsmVar);
        this.f87726k = new f480(bsmVar);
    }

    /* JADX INFO: renamed from: A4 */
    private void m113379A4(BLive bLive, BLiveRtcToken bLiveRtcToken, PkData pkData) {
        final long jM155944o = mqi0.m155944o();
        oxl oxlVar = (oxl) m129297F3(new rv00(2600));
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        String str = bLiveStreamUrl.push;
        String str2 = bLiveStreamUrl.pushIpv6;
        String str3 = bLive.room.f44419id;
        String strValueOf = String.valueOf(bLive.streamCdnInfo.provider);
        String strValueOf2 = String.valueOf(bLive.streamCdnInfo.businessType);
        BLiveVideoQualityConf bLiveVideoQualityConf = bLive.videoQualityConf;
        BLivePk bLivePk = pkData.f51567pk;
        oxlVar.mo133474d(new k080(str, str2, str3, strValueOf, strValueOf2, bLiveVideoQualityConf, bLiveRtcToken, bLivePk.otherChannel, bLivePk.peerChannelKey, Integer.valueOf(pkData.otherUserId()).intValue(), new f30() { // from class: l.qr70
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f155969a.m113407r4(jM155944o, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m113388S3(boolean z, d30 d30Var, Throwable th) {
        if (!z) {
            ht70.m132853j("change stream error " + th.toString());
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m113394Y3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m113395Z3() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    private void m113397c4(final boolean z, e30<BLive> e30Var, final d30 d30Var) {
        duringCreated(LivingNormalApiProvider.m71390Y3(m206027E2().m149814k(), z)).subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.sr70
            @Override // p149l.e30
            public final void call(Object obj) {
                ds70.m113388S3(z, d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    private PkData m113398f4() {
        return this.f87724i.m99904N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ Boolean m113399j4() {
        return m113398f4().isTargetState(BLivePkStage.get("preparing"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m113400k4() {
        m113419h4(GameOperate.quit, "prepare 30s timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ Boolean m113401l4() {
        return Boolean.valueOf(this.f87728m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m113402m4() {
        m113419h4(GameOperate.quit, "other add timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m113403n4(String str, Throwable th) {
        u280.m191442a(th);
        if (TextUtils.equals(str, "leave")) {
            return;
        }
        m113412x4(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ Boolean m113404o4() {
        return m113398f4().isTargetState(BLivePkStage.get("playing"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m113405p4() {
        m113419h4(GameOperate.quit, "playing countdown timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m113407r4(long j, Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            m113422y4();
            this.f87724i.m99915Z3();
            h5j0.INSTANCE.m129404c("pk_anchor_start_trace", "other_add");
            final long jM155944o = mqi0.m155944o() - j;
            eet.m116003b(this, "anchor_pk_other_enter", new e30() { // from class: l.tr70
                @Override // p149l.e30
                public final void call(Object obj2) {
                    ((Map) obj2).put("watch_duration", Long.valueOf(jM155944o));
                }
            });
            return;
        }
        if (iIntValue == 2) {
            m113418g4("other-leave");
            return;
        }
        if (iIntValue == 3) {
            h5j0.INSTANCE.m129404c("pk_anchor_start_trace", "local_add");
        } else {
            if (iIntValue != 4) {
                return;
            }
            m206028F2().MomoSdkEvent.renewRtcToken().mo172463j(new xw00(m206027E2().mo149813j().room.f44419id, "pk", String.valueOf(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m113408s4(PkData pkData, BLiveRtcToken bLiveRtcToken) {
        m113379A4(this.f87731p, bLiveRtcToken, pkData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m113409t4(BLive bLive) {
        bLive.setFrom(600);
        m206028F2().LivePusherEvent.switchPushToNormal().mo172463j(bLive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m113410u4() {
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public void m113406q4(BLive bLive, PkData pkData) {
        this.f87731p = bLive;
        m113416d4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m113412x4(BLivePk bLivePk) {
        PkData pkDataM113398f4 = m113398f4();
        pkDataM113398f4.f51567pk.situation.currentStageInfo.stage = BLivePkStage.get("ended");
        this.f87727l.call(pkDataM113398f4.updatePk(bLivePk));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: B4 */
    public void m113413B4(final PkData pkData) {
        if (this.f87731p == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71538o7(m206027E2().mo149813j().room.f44419id, "pk", this.f87731p.rtcInfo.provider)).subscribe(ffw.m121194e(new e30() { // from class: l.bs70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77011a.m113408s4(pkData, (BLiveRtcToken) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: C4 */
    public void m113414C4() {
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(2600))).mo133471a();
        if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_PK)) {
            ((j080) c12714bMo133471a.m71891T0(j080.class)).m139149D1();
        }
        m113397c4(false, new e30() { // from class: l.xr70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194097a.m113409t4((BLive) obj);
            }
        }, new d30() { // from class: l.yr70
            @Override // p149l.d30
            public final void call() {
                this.f199644a.m113410u4();
            }
        });
    }

    @Override // p149l.a0m
    /* JADX INFO: renamed from: G */
    public void mo94443G(b280 b280Var) {
        this.f87724i = b280Var;
    }

    /* JADX INFO: renamed from: b4 */
    public void m113415b4(PkData pkData) {
        if (pkData == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pkId", pkData.f51567pk.f44421id);
        h5j0.INSTANCE.m129406e("pk_anchor_start_trace", ork.m165672d(map));
        m113423z4(pkData);
    }

    /* JADX INFO: renamed from: d4 */
    public void m113416d4() {
        if (this.f87724i.m99904N3().isOnceMore() || TextUtils.isEmpty(this.f87724i.m99904N3().f51567pk.f44421id)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71510l6(this.f87724i.m99904N3().f51567pk.f44421id)).subscribe(ffw.m121194e(new e30() { // from class: l.rr70
            @Override // p149l.e30
            public final void call(Object obj) {
                ds70.m113394Y3((BLivePk) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: e4 */
    public void m113417e4(String str, final String str2) {
        duringCreated(LivingNormalApiProvider.m71528n6(str, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.zr70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204461a.m113412x4((BLivePk) obj);
            }
        }, new e30() { // from class: l.as70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71396a.m113403n4(str2, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.a0m
    /* JADX INFO: renamed from: f */
    public void mo94444f(PkData pkData) {
        if (pkData.isPreparing()) {
            this.f87725j.m191310i(pkData.f51567pk.f44421id, BLivePkStage.get("preparing"), this.f87727l, new a280());
            this.f87726k.m119290e(new v9j() { // from class: l.cs70
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f82331a.m113399j4();
                }
            }, new d30() { // from class: l.nr70
                @Override // p149l.d30
                public final void call() {
                    this.f140163a.m113400k4();
                }
            });
        } else if (pkData.isPlaying()) {
            this.f87726k.m119290e(new v9j() { // from class: l.or70
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f145238a.m113401l4();
                }
            }, new d30() { // from class: l.pr70
                @Override // p149l.d30
                public final void call() {
                    this.f150859a.m113402m4();
                }
            });
        } else if (pkData.isEnded()) {
            m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135197b(-1, m113398f4().lastState));
            this.f87725j.m191311j();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m113418g4(String str) {
        m113419h4(str, "");
    }

    /* JADX INFO: renamed from: h4 */
    public void m113419h4(String str, String str2) {
        if (!m206032L2() || m113398f4().isEnded() || m113398f4().isUnknown()) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            lsi0.m151578h(R$string.f46700Gb);
        }
        ht70.m132853j("handle exit " + str + " reason = " + str2);
        m113417e4(m113398f4().f51567pk.f44421id, str);
    }

    /* JADX INFO: renamed from: i4 */
    public void m113420i4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_cdn_fail") && TextUtils.equals(livePkMessage.f47752id, m113398f4().f51567pk.f44421id)) {
            m113419h4(GameOperate.quit, "cdn fail");
        }
    }

    @Override // p149l.a0m
    /* JADX INFO: renamed from: k */
    public void mo94445k(e30<PkData> e30Var) {
        this.f87727l = e30Var;
    }

    @Override // p149l.a0m
    public void reset() {
        this.f87725j.m191311j();
        this.f87726k.m119289d();
        this.f87728m = false;
        mkd0.m154992z(this.f87729n);
        mkd0.m154992z(this.f87730o);
    }

    /* JADX INFO: renamed from: v4 */
    public void m113421v4(BLivePkStage bLivePkStage) {
        if (TEnum.equals(bLivePkStage, BLivePkStage.punishing)) {
            m113418g4("end-leave");
        } else if (TEnum.equals(bLivePkStage, "playing")) {
            this.f87725j.m191310i(this.f87724i.m99904N3().f51567pk.f44421id, BLivePkStage.get("playing"), this.f87727l, new a280());
            this.f87726k.m119290e(new v9j() { // from class: l.mr70
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f135344a.m113404o4();
                }
            }, new d30() { // from class: l.ur70
                @Override // p149l.d30
                public final void call() {
                    this.f177812a.m113405p4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y4 */
    public void m113422y4() {
        this.f87728m = true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m113423z4(final PkData pkData) {
        m113397c4(true, new e30() { // from class: l.vr70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182704a.m113406q4(pkData, (BLive) obj);
            }
        }, new d30() { // from class: l.wr70
            @Override // p149l.d30
            public final void call() {
                ds70.m113395Z3();
            }
        });
    }
}
