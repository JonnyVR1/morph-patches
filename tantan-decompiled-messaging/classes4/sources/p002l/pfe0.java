package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bgv;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.fld0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.s7m;
import l.vwb;
import l.ypv;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pfe0 extends x6s<ho2, rfe0> {

    /* JADX INFO: renamed from: j */
    public final LinkedList<BLiveGiftBubbleConfig> f17238j;

    /* JADX INFO: renamed from: k */
    public boolean f17239k;

    /* JADX INFO: renamed from: l */
    public c4g0 f17240l;

    /* JADX INFO: renamed from: l.pfe0$a */
    public class C0745a implements zfv.C0940a.a {
        public C0745a() {
        }
    }

    public pfe0(bsm bsmVar) {
        super(bsmVar);
        this.f17238j = new LinkedList<>();
        C(new rfe0());
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m20201X3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m20204m4(Long l2) {
        if (this.f17239k || m25552L2() || !m25547E2().m17241r() || w220.m24291b()) {
            return;
        }
        m20217n4();
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final boolean m20205a4() {
        return m25551K2().m22224l(LiveDialogEnum.CHAT_INPUT, LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.GIFT_REMINDER, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW, LiveDialogEnum.FOLLOW, LiveDialogEnum.HOUR_LEADER_BOARD, LiveDialogEnum.SIGN_IN) || m25547E2().m17242s();
    }

    /* JADX INFO: renamed from: b4 */
    public final boolean m20206b4(long j) {
        fld0 fld0Var = fld0.f;
        return ((bgv) ypv.l(fld0Var)).m() == 0 || mqi0.o() - ((bgv) ypv.l(fld0Var)).m() > j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public final void m20208d4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (m20205a4()) {
            m20207c4("和其他功能冲突了，送礼引导不弹出");
        } else {
            duringCreated(zfv.m27231R0(m25547E2().mo14489A0(), m25547E2().m17239o(), m25547E2().m17235k(), bLiveGiftBubbleConfig.remindID)).subscribe(ffw.h(new e30() { // from class: l.nfe0
                public final void call(Object obj) {
                    this.f16007a.m20211g4(bLiveGiftBubbleConfig, (BLiveGivenGiftRemindStatus) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m20209e4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (NullChecker.a(bLiveGiftBubbleConfig)) {
            this.f17238j.add(bLiveGiftBubbleConfig);
        }
        if (((rfe0) ((bwr) this).viewModel).isShowing()) {
            return;
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfigPoll = this.f17238j.poll();
        if (NullChecker.a(bLiveGiftBubbleConfigPoll)) {
            boolean z = bLiveGiftBubbleConfigPoll.isFromLongLink;
            s7m s7mVar = ((bwr) this).viewModel;
            if (z) {
                ((rfe0) s7mVar).m21916e(bLiveGiftBubbleConfigPoll);
            } else {
                ((rfe0) s7mVar).m21917f(bLiveGiftBubbleConfigPoll);
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m20210f4(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(3900).m25610e(str).m25608c());
        m20221r4(str2);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m20211g4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, BLiveGivenGiftRemindStatus bLiveGivenGiftRemindStatus) {
        if (m20205a4()) {
            m20207c4("和其他功能冲突了，送礼引导不弹出");
        } else if (!bLiveGivenGiftRemindStatus.canGuide) {
            m20207c4("服务端不允许弹出送礼引导");
        } else {
            m20209e4(bLiveGiftBubbleConfig);
            ((bgv) ypv.l(fld0.f)).A(mqi0.o());
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m20212h4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, List list) {
        m20220q4(bLiveGiftBubbleConfig.toast.successText);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m20213i4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Throwable th) {
        m20220q4(bLiveGiftBubbleConfig.toast.failText);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m20214j4() {
        m20209e4(null);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m20215k4(BLiveGiftBubbleConfig bLiveGiftBubbleConfig, Long l2) {
        m20208d4(bLiveGiftBubbleConfig);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m20216l4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (m20206b4(bLiveGiftBubbleConfig.displayRules.displayInterval * 1000)) {
            m14186H3(m25547E2().m14571h2(bLiveGiftBubbleConfig.bubbleShowAfterWatch, TimeUnit.SECONDS)).take(1).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.kfe0
                public final void call(Object obj) {
                    this.f14309a.m20215k4(bLiveGiftBubbleConfig, (Long) obj);
                }
            }));
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((rfe0) ((bwr) this).viewModel).destroy();
        mkd0.z(this.f17240l);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public final void m20217n4() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reportType", "touchMeEnterRoomSpell");
            jSONObject.put("roomId", m25547E2().m17239o());
            jSONObject.put("roomType", "video");
            jSONObject.put("anchorUserId", ((DbObject) m25547E2().m14582l0()).id);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        LivingNormalApiProvider.m4903o6(jSONObject.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public void m20218o4(final BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (bLiveGiftBubbleConfig.isTurboCoupon()) {
            duringCreated(LivingNormalApiProvider.m4910p4(m25547E2().mo9893p(), bLiveGiftBubbleConfig.extra, String.valueOf(mqi0.o() / 1000), "60", "receive-reward")).subscribe(ffw.e(new e30() { // from class: l.lfe0
                public final void call(Object obj) {
                    this.f14837a.m20212h4(bLiveGiftBubbleConfig, (List) obj);
                }
            }, new e30() { // from class: l.mfe0
                public final void call(Object obj) {
                    this.f15364a.m20213i4(bLiveGiftBubbleConfig, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public void m20219p4(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10983u(String.valueOf(i), new C0745a(), i2, "sendGiftNotice", "sendGiftNotice", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("giftguide"), "")).m10978A(false).m10982t());
        zvf0.r("e_live_gift_guide", mo21430R2());
    }

    /* JADX INFO: renamed from: q4 */
    public final void m20220q4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        osi0.g(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r4 */
    public void m20221r4(String str) {
        zvf0.u("e_live_bottom_popup", "p_user_live_room", new j760[]{vwb.Y("anchor_id", ((DbObject) m25547E2().m14582l0()).id), vwb.Y("live_id", m25547E2().m17235k()), vwb.Y("live_category", str), vwb.Y("is_not_show_required", 0), vwb.Y("mc_type", "default")});
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: s4 */
    public void m20222s4(boolean z, String str, String str2) {
        String str3 = "";
        String str4 = (m25547E2() == 0 || m25547E2().m14582l0() == null) ? "" : ((DbObject) m25547E2().m14582l0()).id;
        if (m25547E2() != 0 && m25547E2().m14588n0() != null) {
            str3 = m25547E2().m14588n0().id;
        }
        axj.m10106t(mo21430R2(), z, str4, str3, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m20223t() {
        super.t();
        duringCreated(m25547E2().m14605v0("live")).subscribe(ffw.e(new e30() { // from class: l.gfe0
            public final void call(Object obj) {
                this.f11398a.m20216l4((BLiveGiftBubbleConfig) obj);
            }
        }, new e30() { // from class: l.hfe0
            public final void call(Object obj) {
                pfe0.m20201X3((Throwable) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().d0()).subscribe(new e30() { // from class: l.ife0
            public final void call(Object obj) {
                this.f13196a.m20209e4((BLiveGiftBubbleConfig) obj);
            }
        });
        this.f17240l = c.timer(90L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.jfe0
            public final void call(Object obj) {
                this.f13726a.m20204m4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public void m20224t4(boolean z, String str) {
        String str2 = "";
        String str3 = (m25547E2() == 0 || m25547E2().m14582l0() == null) ? "" : ((DbObject) m25547E2().m14582l0()).id;
        if (m25547E2() != 0 && m25547E2().m14588n0() != null) {
            str2 = m25547E2().m14588n0().id;
        }
        axj.m10107u(mo21430R2(), z, str3, str2, str);
    }

    /* JADX INFO: renamed from: u4 */
    public void m20225u4() {
        m14207z3(500L, new Runnable() { // from class: l.ofe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16551a.m20214j4();
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final void m20207c4(String str) {
    }
}
