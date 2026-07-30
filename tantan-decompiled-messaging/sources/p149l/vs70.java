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
public class vs70 extends pat<ho2> implements b0m {

    /* JADX INFO: renamed from: i */
    public rp70 f182803i;

    /* JADX INFO: renamed from: j */
    public u080 f182804j;

    /* JADX INFO: renamed from: k */
    public f480 f182805k;

    /* JADX INFO: renamed from: l */
    public e30<PkData> f182806l;

    /* JADX INFO: renamed from: m */
    public boolean f182807m;

    /* JADX INFO: renamed from: n */
    public c4g0 f182808n;

    /* JADX INFO: renamed from: o */
    public c4g0 f182809o;

    /* JADX INFO: renamed from: p */
    public BLive f182810p;

    public vs70(bsm bsmVar) {
        super(bsmVar);
        this.f182804j = new u080(bsmVar);
        this.f182805k = new f480(bsmVar);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m199818V3(boolean z, d30 d30Var, Throwable th) {
        if (!z) {
            ht70.m132853j("change stream error " + th.toString());
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m199820X3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m199822Z3() {
    }

    /* JADX INFO: renamed from: A4 */
    public final void m199824A4(BLive bLive, BLiveRtcToken bLiveRtcToken, PkData pkData) {
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
        oxlVar.mo133474d(new k080(str, str2, str3, strValueOf, strValueOf2, bLiveVideoQualityConf, bLiveRtcToken, bLivePk.otherChannel, bLivePk.peerChannelKey, Integer.valueOf(pkData.otherUserId()).intValue(), new f30() { // from class: l.js70
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f119478a.m199843r4(jM155944o, (Integer) obj, obj2);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: B4 */
    public void m199825B4(final PkData pkData) {
        if (this.f182810p == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71538o7(m206027E2().mo149813j().room.f44419id, "pk", this.f182810p.rtcInfo.provider)).subscribe(ffw.m121194e(new e30() { // from class: l.fs70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99049a.m199844s4(pkData, (BLiveRtcToken) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: C4 */
    public void m199826C4() {
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(2600))).mo133471a();
        if (c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_PK)) {
            ((j080) c12714bMo133471a.m71891T0(j080.class)).m139149D1();
        }
        m199828c4(false, new e30() { // from class: l.ps70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150977a.m199845t4((BLive) obj);
            }
        }, new d30() { // from class: l.qs70
            @Override // p149l.d30
            public final void call() {
                this.f156105a.m199846u4();
            }
        });
    }

    @Override // p149l.b0m
    /* JADX INFO: renamed from: a0 */
    public void mo99782a0(rp70 rp70Var) {
        this.f182803i = rp70Var;
    }

    /* JADX INFO: renamed from: b4 */
    public void m199827b4(PkData pkData) {
        if (pkData == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("pkId", pkData.f51567pk.f44421id);
        h5j0.INSTANCE.m129406e("pk_anchor_start_trace", ork.m165672d(map));
        m199851z4(pkData);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final void m199828c4(final boolean z, e30<BLive> e30Var, final d30 d30Var) {
        duringCreated(LivingNormalApiProvider.m71390Y3(m206027E2().m149814k(), z)).subscribe(ffw.m121194e(e30Var, new e30() { // from class: l.ks70
            @Override // p149l.e30
            public final void call(Object obj) {
                vs70.m199818V3(z, d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public void m199829d4() {
        if (this.f182803i.m180303N3().isOnceMore() || TextUtils.isEmpty(this.f182803i.m180303N3().f51567pk.f44421id)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71510l6(this.f182803i.m180303N3().f51567pk.f44421id)).subscribe(ffw.m121194e(new e30() { // from class: l.is70
            @Override // p149l.e30
            public final void call(Object obj) {
                vs70.m199820X3((BLivePk) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: e4 */
    public void m199830e4(String str, final String str2) {
        duringCreated(LivingNormalApiProvider.m71528n6(str, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.es70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92995a.m199849x4((BLivePk) obj);
            }
        }, new e30() { // from class: l.ms70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135452a.m199839n4(str2, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.b0m
    /* JADX INFO: renamed from: f */
    public void mo99783f(PkData pkData) {
        if (pkData.isPreparing()) {
            this.f182804j.m191310i(pkData.f51567pk.f44421id, BLivePkStage.get("preparing"), this.f182806l, new a280());
            this.f182805k.m119290e(new v9j() { // from class: l.rs70
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f160816a.m199835j4();
                }
            }, new d30() { // from class: l.ss70
                @Override // p149l.d30
                public final void call() {
                    this.f166168a.m199836k4();
                }
            });
        } else if (pkData.isPlaying()) {
            this.f182805k.m119290e(new v9j() { // from class: l.ts70
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f171916a.m199837l4();
                }
            }, new d30() { // from class: l.us70
                @Override // p149l.d30
                public final void call() {
                    this.f177946a.m199838m4();
                }
            });
        } else if (pkData.isEnded()) {
            m206028F2().LivePkEvent.pkStateEvent().mo172463j(iat.m135197b(-1, m199831f4().lastState));
            this.f182804j.m191311j();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final PkData m199831f4() {
        return this.f182803i.m180303N3();
    }

    /* JADX INFO: renamed from: g4 */
    public void m199832g4(String str) {
        m199833h4(str, "");
    }

    /* JADX INFO: renamed from: h4 */
    public void m199833h4(String str, String str2) {
        if (!m206032L2() || m199831f4().isEnded() || m199831f4().isUnknown()) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            lsi0.m151578h(R$string.f46700Gb);
        }
        ht70.m132853j("handle exit " + str + " reason = " + str2);
        m199830e4(m199831f4().f51567pk.f44421id, str);
    }

    /* JADX INFO: renamed from: i4 */
    public void m199834i4(LivePkMessage livePkMessage) {
        if (TextUtils.equals(livePkMessage.type, "pk_cdn_fail") && TextUtils.equals(livePkMessage.f47752id, m199831f4().f51567pk.f44421id)) {
            m199833h4(GameOperate.quit, "cdn fail");
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ Boolean m199835j4() {
        return m199831f4().isTargetState(BLivePkStage.get("preparing"));
    }

    @Override // p149l.b0m
    /* JADX INFO: renamed from: k */
    public void mo99784k(e30<PkData> e30Var) {
        this.f182806l = e30Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m199836k4() {
        m199833h4(GameOperate.quit, "prepare 30s timeout");
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ Boolean m199837l4() {
        return Boolean.valueOf(this.f182807m);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m199838m4() {
        m199833h4(GameOperate.quit, "other add timeout");
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m199839n4(String str, Throwable th) {
        u280.m191442a(th);
        if (TextUtils.equals(str, "leave")) {
            return;
        }
        m199849x4(null);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ Boolean m199840o4() {
        return m199831f4().isTargetState(BLivePkStage.get("playing"));
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m199841p4() {
        m199833h4(GameOperate.quit, "playing countdown timeout");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m199843r4(long j, Integer num, Object obj) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            m199850y4();
            this.f182803i.m180311Z3();
            h5j0.INSTANCE.m129404c("pk_anchor_start_trace", "other_add");
            final long jM155944o = mqi0.m155944o() - j;
            eet.m116003b(this, "anchor_pk_other_enter", new e30() { // from class: l.ls70
                @Override // p149l.e30
                public final void call(Object obj2) {
                    ((Map) obj2).put("watch_duration", Long.valueOf(jM155944o));
                }
            });
            return;
        }
        if (iIntValue == 2) {
            m199832g4("other-leave");
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

    @Override // p149l.b0m
    public void reset() {
        this.f182804j.m191311j();
        this.f182805k.m119289d();
        this.f182807m = false;
        mkd0.m154992z(this.f182808n);
        mkd0.m154992z(this.f182809o);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m199844s4(PkData pkData, BLiveRtcToken bLiveRtcToken) {
        m199824A4(this.f182810p, bLiveRtcToken, pkData);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m199845t4(BLive bLive) {
        bLive.setFrom(600);
        m206028F2().LivePusherEvent.switchPushToNormal().mo172463j(bLive);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m199846u4() {
        ((oxl) m129297F3(new rv00(2600))).mo133472b();
    }

    /* JADX INFO: renamed from: v4 */
    public void m199847v4(BLivePkStage bLivePkStage) {
        if (TEnum.equals(bLivePkStage, BLivePkStage.punishing)) {
            m199832g4("end-leave");
        } else if (TEnum.equals(bLivePkStage, "playing")) {
            this.f182804j.m191310i(this.f182803i.m180303N3().f51567pk.f44421id, BLivePkStage.get("playing"), this.f182806l, new a280());
            this.f182805k.m119290e(new v9j() { // from class: l.gs70
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f104154a.m199840o4();
                }
            }, new d30() { // from class: l.hs70
                @Override // p149l.d30
                public final void call() {
                    this.f109306a.m199841p4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w4, reason: merged with bridge method [inline-methods] */
    public final void m199842q4(BLive bLive, PkData pkData) {
        this.f182810p = bLive;
        m199829d4();
    }

    /* JADX INFO: renamed from: x4 */
    public final void m199849x4(BLivePk bLivePk) {
        PkData pkDataM199831f4 = m199831f4();
        pkDataM199831f4.f51567pk.situation.currentStageInfo.stage = BLivePkStage.get("ended");
        this.f182806l.call(pkDataM199831f4.updatePk(bLivePk));
    }

    /* JADX INFO: renamed from: y4 */
    public void m199850y4() {
        this.f182807m = true;
    }

    /* JADX INFO: renamed from: z4 */
    public void m199851z4(final PkData pkData) {
        m199828c4(true, new e30() { // from class: l.ns70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140243a.m199842q4(pkData, (BLive) obj);
            }
        }, new d30() { // from class: l.os70
            @Override // p149l.d30
            public final void call() {
                vs70.m199822Z3();
            }
        });
    }
}
