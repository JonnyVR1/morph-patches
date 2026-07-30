package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class pfe0 extends x6s<ho2, rfe0> {

    /* JADX INFO: renamed from: j */
    public final LinkedList<BLiveGiftBubbleConfig> f148543j;

    /* JADX INFO: renamed from: k */
    public boolean f148544k;

    /* JADX INFO: renamed from: l */
    public c4g0 f148545l;

    /* JADX INFO: renamed from: l.pfe0$a */
    public class C19200a implements zfv.C21687a.a {
        public C19200a() {
        }
    }

    public pfe0(bsm bsmVar) {
        super(bsmVar);
        this.f148543j = new LinkedList<>();
        mo51532C(new rfe0());
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m168614X3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m168617m4(Long l2) {
        if (this.f148544k || m206032L2() || !m206027E2().m149820r() || w220.m201015b()) {
            return;
        }
        m168630n4();
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final boolean m168618a4() {
        return m206031K2().m182469l(LiveDialogEnum.CHAT_INPUT, LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.GIFT_REMINDER, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW, LiveDialogEnum.FOLLOW, LiveDialogEnum.HOUR_LEADER_BOARD, LiveDialogEnum.SIGN_IN) || m206027E2().m149821s();
    }

    /* JADX INFO: renamed from: b4 */
    public final boolean m168619b4(long j) {
        fld0<bgv> fld0Var = fld0.f98151f;
        return ((bgv) ypv.m215673l(fld0Var)).m101733m() == 0 || mqi0.m155944o() - ((bgv) ypv.m215673l(fld0Var)).m101733m() > j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public final void m168621d4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (m168618a4()) {
            m168620c4("和其他功能冲突了，送礼引导不弹出");
        } else {
            duringCreated(zfv.m218528R0(m206027E2().mo132054A0(), m206027E2().m149818o(), m206027E2().m149814k(), bLiveGiftBubbleConfig.remindID)).subscribe(ffw.m121197h(new e30() { // from class: l.nfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138768a.m168624g4(bLiveGiftBubbleConfig, (BLiveGivenGiftRemindStatus) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m168622e4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (NullChecker.m81303a(bLiveGiftBubbleConfig)) {
            this.f148543j.add(bLiveGiftBubbleConfig);
        }
        if (((rfe0) this.viewModel).isShowing()) {
            return;
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfigPoll = this.f148543j.poll();
        if (NullChecker.m81303a(bLiveGiftBubbleConfigPoll)) {
            boolean z = bLiveGiftBubbleConfigPoll.isFromLongLink;
            V v2 = this.viewModel;
            if (z) {
                ((rfe0) v2).m179131e(bLiveGiftBubbleConfigPoll);
            } else {
                ((rfe0) v2).m179132f(bLiveGiftBubbleConfigPoll);
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m168623f4(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(3900).m206701e(str).m206699c());
        m168634r4(str2);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m168624g4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus) {
        if (m168618a4()) {
            m168620c4("和其他功能冲突了，送礼引导不弹出");
        } else if (!bLiveGivenGiftRemindStatus.canGuide) {
            m168620c4("服务端不允许弹出送礼引导");
        } else {
            m168622e4(bLiveGiftBubbleConfig);
            ((bgv) ypv.m215673l(fld0.f98151f)).m101713A(mqi0.m155944o());
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m168625h4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, List list) {
        m168633q4(bLiveGiftBubbleConfig.toast.successText);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m168626i4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Throwable th) {
        m168633q4(bLiveGiftBubbleConfig.toast.failText);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m168627j4() {
        m168622e4(null);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m168628k4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Long l2) {
        m168621d4(bLiveGiftBubbleConfig);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m168629l4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (m168619b4(bLiveGiftBubbleConfig.displayRules.displayInterval * 1000)) {
            m129299H3(m206027E2().m132135h2(bLiveGiftBubbleConfig.bubbleShowAfterWatch, TimeUnit.SECONDS)).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.kfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f122920a.m168628k4(bLiveGiftBubbleConfig, (Long) obj);
                }
            }));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((rfe0) this.viewModel).destroy();
        mkd0.m154992z(this.f148545l);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public final void m168630n4() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", "touchMeEnterRoomSpell");
            jSONObject.put("roomId", m206027E2().m149818o());
            jSONObject.put("roomType", "video");
            jSONObject.put("anchorUserId", m206027E2().m132146l0().f56011id);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        LivingNormalApiProvider.m71537o6(jSONObject.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public void m168631o4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (bLiveGiftBubbleConfig.isTurboCoupon()) {
            duringCreated(LivingNormalApiProvider.m71544p4(m206027E2().mo97490p(), bLiveGiftBubbleConfig.extra, String.valueOf(mqi0.m155944o() / 1000), "60", "receive-reward")).subscribe(ffw.m121194e(new e30() { // from class: l.lfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127868a.m168625h4(bLiveGiftBubbleConfig, (List) obj);
                }
            }, new e30() { // from class: l.mfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133588a.m168626i4(bLiveGiftBubbleConfig, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m168632p4(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106530u(String.valueOf(i), new C19200a(), i2, "sendGiftNotice", "sendGiftNotice", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.giftguide), "")).m106525A(false).m106529t());
        zvf0.m220396r("e_live_gift_guide", mo77274R2());
    }

    /* JADX INFO: renamed from: q4 */
    public final void m168633q4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        osi0.m165783g(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r4 */
    public void m168634r4(String str) {
        zvf0.m220399u("e_live_bottom_popup", "p_user_live_room", vwb.m200311Y("anchor_id", m206027E2().m132146l0().f56011id), vwb.m200311Y("live_id", m206027E2().m149814k()), vwb.m200311Y("live_category", str), vwb.m200311Y("is_not_show_required", 0), vwb.m200311Y("mc_type", "default"));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: s4 */
    public void m168635s4(boolean z, String str, String str2) {
        String str3 = "";
        String str4 = (m206027E2() == 0 || m206027E2().m132146l0() == null) ? "" : m206027E2().m132146l0().f56011id;
        if (m206027E2() != 0 && m206027E2().m132152n0() != null) {
            str3 = m206027E2().m132152n0().f44323id;
        }
        axj.m99446t(mo77274R2(), z, str4, str3, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132169v0("live")).subscribe(ffw.m121194e(new e30() { // from class: l.gfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102389a.m168629l4((BLiveGiftBubbleConfig) obj);
            }
        }, new e30() { // from class: l.hfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                pfe0.m168614X3((Throwable) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189096d0()).subscribe(new e30() { // from class: l.ife0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112990a.m168622e4((BLiveGiftBubbleConfig) obj);
            }
        });
        this.f148545l = C22306c.timer(90L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.jfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117653a.m168617m4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public void m168636t4(boolean z, String str) {
        String str2 = "";
        String str3 = (m206027E2() == 0 || m206027E2().m132146l0() == null) ? "" : m206027E2().m132146l0().f56011id;
        if (m206027E2() != 0 && m206027E2().m132152n0() != null) {
            str2 = m206027E2().m132152n0().f44323id;
        }
        axj.m99447u(mo77274R2(), z, str3, str2, str);
    }

    /* JADX INFO: renamed from: u4 */
    public void m168637u4() {
        m129320z3(500L, new Runnable() { // from class: l.ofe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f143640a.m168627j4();
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final void m168620c4(String str) {
    }
}
