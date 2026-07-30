package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class une0 extends y8s<oo2, wne0> {

    /* JADX INFO: renamed from: j */
    public final LinkedList<BLiveGiftBubbleConfig> f179721j;

    /* JADX INFO: renamed from: k */
    public boolean f179722k;

    /* JADX INFO: renamed from: l */
    public kcg0 f179723l;

    /* JADX INFO: renamed from: l.une0$a */
    public class C20602a implements aiv.C15716a.a {
        public C20602a() {
        }
    }

    public une0(dum dumVar) {
        super(dumVar);
        this.f179721j = new LinkedList<>();
        mo52715C(new wne0());
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m196840X3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m196843m4(Long l2) {
        if (this.f179722k || m213815L2() || !m213810E2().m202195r() || eb20.m120149b()) {
            return;
        }
        m196856n4();
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: a4 */
    public final boolean m196844a4() {
        return m213814K2().m189705l(LiveDialogEnum.CHAT_INPUT, LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.GIFT_REMINDER, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW, LiveDialogEnum.FOLLOW, LiveDialogEnum.HOUR_LEADER_BOARD, LiveDialogEnum.SIGN_IN) || m213810E2().m202196s();
    }

    /* JADX INFO: renamed from: b4 */
    public final boolean m196845b4(long j) {
        htd0<civ> htd0Var = htd0.f111524f;
        return ((civ) zrv.m221194l(htd0Var)).m109969m() == 0 || pzi0.m174454o() - ((civ) zrv.m221194l(htd0Var)).m109969m() > j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    public final void m196847d4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (m196844a4()) {
            m196846c4("和其他功能冲突了，送礼引导不弹出");
        } else {
            duringCreated(aiv.m98062R0(m213810E2().mo118362A0(), m213810E2().m202194o(), m213810E2().m202191k(), bLiveGiftBubbleConfig.remindID)).subscribe(dhw.m115829h(new y20() { // from class: l.sne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f169677a.m196850g4(bLiveGiftBubbleConfig, (BLiveGivenGiftRemindStatus) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m196848e4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (NullChecker.m82486a(bLiveGiftBubbleConfig)) {
            this.f179721j.add(bLiveGiftBubbleConfig);
        }
        if (((wne0) this.viewModel).isShowing()) {
            return;
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfigPoll = this.f179721j.poll();
        if (NullChecker.m82486a(bLiveGiftBubbleConfigPoll)) {
            boolean z = bLiveGiftBubbleConfigPoll.isFromLongLink;
            V v2 = this.viewModel;
            if (z) {
                ((wne0) v2).m207196e(bLiveGiftBubbleConfigPoll);
            } else {
                ((wne0) v2).m207197f(bLiveGiftBubbleConfigPoll);
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m196849f4(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(3900).m103154e(str).m103152c());
        m196860r4(str2);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m196850g4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus) {
        if (m196844a4()) {
            m196846c4("和其他功能冲突了，送礼引导不弹出");
        } else if (!bLiveGivenGiftRemindStatus.canGuide) {
            m196846c4("服务端不允许弹出送礼引导");
        } else {
            m196848e4(bLiveGiftBubbleConfig);
            ((civ) zrv.m221194l(htd0.f111524f)).m109949A(pzi0.m174454o());
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m196851h4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, List list) {
        m196859q4(bLiveGiftBubbleConfig.toast.successText);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m196852i4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Throwable th) {
        m196859q4(bLiveGiftBubbleConfig.toast.failText);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m196853j4() {
        m196848e4(null);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m196854k4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Long l2) {
        m196847d4(bLiveGiftBubbleConfig);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m196855l4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (m196845b4(bLiveGiftBubbleConfig.displayRules.displayInterval * 1000)) {
            m138858H3(m213810E2().m168521h2(bLiveGiftBubbleConfig.bubbleShowAfterWatch, TimeUnit.SECONDS)).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.pne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f153297a.m196854k4(bLiveGiftBubbleConfig, (Long) obj);
                }
            }));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((wne0) this.viewModel).destroy();
        psd0.m173633z(this.f179723l);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.oo2] */
    /* JADX INFO: renamed from: n4 */
    public final void m196856n4() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", "touchMeEnterRoomSpell");
            jSONObject.put("roomId", m213810E2().m202194o());
            jSONObject.put("roomType", "video");
            jSONObject.put("anchorUserId", m213810E2().m168532l0().f56859id);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        LivingNormalApiProvider.m72720o6(jSONObject.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: o4 */
    public void m196857o4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (bLiveGiftBubbleConfig.isTurboCoupon()) {
            duringCreated(LivingNormalApiProvider.m72727p4(m213810E2().mo118373p(), bLiveGiftBubbleConfig.extra, String.valueOf(pzi0.m174454o() / 1000), "60", "receive-reward")).subscribe(dhw.m115826e(new y20() { // from class: l.qne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158479a.m196851h4(bLiveGiftBubbleConfig, (List) obj);
                }
            }, new y20() { // from class: l.rne0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164016a.m196852i4(bLiveGiftBubbleConfig, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m196858p4(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136084u(String.valueOf(i), new C20602a(), i2, "sendGiftNotice", "sendGiftNotice", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.giftguide), "")).m136079A(false).m136083t());
        i4g0.m138520r("e_live_gift_guide", mo78457R2());
    }

    /* JADX INFO: renamed from: q4 */
    public final void m196859q4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        r1j0.m179420g(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: r4 */
    public void m196860r4(String str) {
        i4g0.m138523u("e_live_bottom_popup", "p_user_live_room", jyb.m147494Y("anchor_id", m213810E2().m168532l0().f56859id), jyb.m147494Y("live_id", m213810E2().m202191k()), jyb.m147494Y("live_category", str), jyb.m147494Y("is_not_show_required", 0), jyb.m147494Y("mc_type", "default"));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    /* JADX INFO: renamed from: s4 */
    public void m196861s4(boolean z, String str, String str2) {
        String str3 = "";
        String str4 = (m213810E2() == 0 || m213810E2().m168532l0() == null) ? "" : m213810E2().m168532l0().f56859id;
        if (m213810E2() != 0 && m213810E2().m168538n0() != null) {
            str3 = m213810E2().m168538n0().f45171id;
        }
        qzj.m178803t(mo78457R2(), z, str4, str3, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168553v0("live")).subscribe(dhw.m115826e(new y20() { // from class: l.lne0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132769a.m196855l4((BLiveGiftBubbleConfig) obj);
            }
        }, new y20() { // from class: l.mne0
            @Override // p153l.y20
            public final void call(Object obj) {
                une0.m196840X3((Throwable) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98278d0()).subscribe(new y20() { // from class: l.nne0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142782a.m196848e4((BLiveGiftBubbleConfig) obj);
            }
        });
        this.f179723l = C22421c.timer(90L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.one0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148082a.m196843m4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: t4 */
    public void m196862t4(boolean z, String str) {
        String str2 = "";
        String str3 = (m213810E2() == 0 || m213810E2().m168532l0() == null) ? "" : m213810E2().m168532l0().f56859id;
        if (m213810E2() != 0 && m213810E2().m168538n0() != null) {
            str2 = m213810E2().m168538n0().f45171id;
        }
        qzj.m178804u(mo78457R2(), z, str3, str2, str);
    }

    /* JADX INFO: renamed from: u4 */
    public void m196863u4() {
        m138879z3(500L, new Runnable() { // from class: l.tne0
            @Override // java.lang.Runnable
            public final void run() {
                this.f175247a.m196853j4();
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final void m196846c4(String str) {
    }
}
