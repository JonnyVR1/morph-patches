package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hfw;
import l.jo0;
import l.l3m;
import l.lql;
import l.m95;
import l.pyd;
import l.qib0;
import l.soj0;
import l.t100;
import l.uvr;
import l.vwb;
import l.w9j;
import l.ypv;
import l.zru;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vd4 extends h4t<ho2, LiveCampaignView> implements l3m {

    /* JADX INFO: renamed from: i */
    public int f21078i;

    /* JADX INFO: renamed from: j */
    public List<BLiveCampaign> f21079j;

    /* JADX INFO: renamed from: k */
    public String f21080k;

    /* JADX INFO: renamed from: l */
    public final List<c4g0> f21081l;

    /* JADX INFO: renamed from: m */
    public boolean f21082m;

    /* JADX INFO: renamed from: n */
    public boolean f21083n;

    public vd4(bsm bsmVar, LiveCampaignView liveCampaignView) {
        super(bsmVar);
        this.f21081l = new ArrayList();
        C(liveCampaignView);
    }

    /* JADX INFO: renamed from: L4 */
    private void m23822L4(boolean z) {
        ((LiveCampaignView) ((bwr) this).viewModel).setLiveCampaignLocation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m23838u4(soj0 soj0Var) {
        m23842D4(true);
    }

    /* JADX INFO: renamed from: A4 */
    public void m23839A4(boolean z) {
        m25548F2().CampaignVisibleChangeEvent.VISIBLE().j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: B4 */
    public final void m23840B4(boolean z) {
        hfw.a("[live]campaign", "MK 优化 ".concat(z ? " webView pause " : " webView resume"));
        List<MKWebView> mKWebViewList = ((LiveCampaignView) ((bwr) this).viewModel).getMKWebViewList();
        int size = mKWebViewList.size();
        ((LiveCampaignView) ((bwr) this).viewModel).setAutoplay(!z);
        for (int i = 0; i < size; i++) {
            MKWebView mKWebView = mKWebViewList.get(i);
            if (mKWebView != null && !mKWebView.v0() && !mKWebView.q0()) {
                if (z) {
                    mKWebView.D0(false);
                } else {
                    mKWebView.onResume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: C4 */
    public void m23841C4(BLiveCampaign bLiveCampaign) {
        if ("signIn".equals(bLiveCampaign.campaignType)) {
            m23854Q4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public void m23842D4(boolean z) {
        m23822L4(z);
    }

    /* JADX INFO: renamed from: E4 */
    public void m23843E4(boolean z) {
        this.f21082m = z;
        m23859e4();
    }

    /* JADX INFO: renamed from: F4 */
    public void m23844F4(BLiveCampaign bLiveCampaign) {
        m23852O4(bLiveCampaign);
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            m25548F2().OpenH5Event.open().j(jp50.m16064c(500).m16097r(bLiveCampaign).m16096q());
            return;
        }
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(1300).m25610e(bLiveCampaign.schema).m25608c());
        if ("signIn".equals(bLiveCampaign.campaignType)) {
            m23853P4();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: G4 */
    public void m23845G4() {
        String strMo9759j3 = mo9759j3();
        if (TextUtils.isEmpty(strMo9759j3)) {
            return;
        }
        duringCreated(zfv.m27237U0(strMo9759j3, m23865k4(), m23866l4(), m25547E2().m17234j().liveMode, m23864j4())).subscribe(ffw.e(new e30() { // from class: l.cd4
            public final void call(Object obj) {
                this.f8597a.m23878w4((List) obj);
            }
        }, new e30() { // from class: l.md4
            public final void call(Object obj) {
                hfw.a("[live]campaign", "loadLiveCampaigns message = " + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: H4 */
    public final void m23846H4() {
        duringCreated(m25547E2().m14596q1().c()).subscribe(ffw.d(new e30() { // from class: l.gd4
            public final void call(Object obj) {
                this.f11373a.m23879x4((LongLinkSocketMessage.PopUp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m23847I4() {
        m23861g4();
        vwb.z(this.f21079j, new e30() { // from class: l.jd4
            public final void call(Object obj) {
                this.f13697a.m23880y4((BLiveCampaign) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public final void m23848J4() {
        duringCreated(((ggv) ypv.l(fld0.c)).g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.nd4
            public final void call(Object obj) {
                this.f15957a.m23881z4((nc4) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public void m23849K4(String str) {
        this.f21080k = str;
    }

    /* JADX INFO: renamed from: M4 */
    public void m23850M4(nc4 nc4Var) {
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1300).userId(nc4Var.m18643a()).setSource("js").setScene("live").setFromIdentity(bqq.m10554a(this, mo9759j3(), nc4Var.m18643a(), 1300)).setTo(bqq.m10557d(this, mo9759j3(), nc4Var.m18643a(), 1300)).trackFrom("campaign").build());
    }

    /* JADX INFO: renamed from: N4 */
    public void m23851N4(boolean z) {
        ((LiveCampaignView) ((bwr) this).viewModel).m6942H(z);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O4 */
    public void m23852O4(BLiveCampaign bLiveCampaign) {
        HashMap map = new HashMap();
        map.put("anchor_id", mo9759j3());
        map.put("live_id", m25547E2().m17234j().id);
        map.put("campaign_type", bLiveCampaign.campaignType);
        if (!TextUtils.isEmpty(bLiveCampaign.schema)) {
            map.put("offline", ypv.a.r(bLiveCampaign.schema));
        }
        map.put("device_level", Integer.valueOf(pyd.INSTANCE.a()));
        zvf0.s("e_live_right_bottom_operation", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P4 */
    public void m23853P4() {
        HashMap map = new HashMap();
        map.put("anchor_id", mo9759j3());
        map.put("live_id", m25547E2().m17234j().id);
        zvf0.s("e_live_sign_icon_button", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Q4 */
    public void m23854Q4() {
        HashMap map = new HashMap();
        map.put("anchor_id", mo9759j3());
        map.put("live_id", m25547E2().m17234j().id);
        zvf0.y("e_live_sign_icon_button", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m23855R4(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            m23845G4();
        } else if (((LongLinkGiftMessage.LiveCampaignInfo) vwb.r(list, new w9j() { // from class: l.hd4
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkGiftMessage.LiveCampaignInfo) obj).getType() == LongLinkGiftMessage.LiveCampaignType.List);
            }
        })) != null) {
            m23845G4();
        } else {
            ((LiveCampaignView) ((bwr) this).viewModel).m6939A(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m23856T() {
        super.T();
        duringCreated(m25547E2().m14596q1().w()).subscribe(ffw.d(new e30() { // from class: l.od4
            public final void call(Object obj) {
                this.f16536a.m23855R4((List) obj);
            }
        }));
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.pd4
            public final void call(Object obj) {
                this.f17205a.m23873r4((KeyboardEventData) obj);
            }
        }));
        if (uvr.d().y0()) {
            hfw.a("[live]campaign", "MK 优化  ,开启 挂起策略");
            duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().g()).filter(new w9j() { // from class: l.qd4
                public final Object call(Object obj) {
                    tzd tzdVar = (tzd) obj;
                    return Boolean.valueOf(tzdVar != null && tzdVar.f20437b == 80);
                }
            }).filter(new w9j() { // from class: l.rd4
                public final Object call(Object obj) {
                    tzd tzdVar = (tzd) obj;
                    return Boolean.valueOf(tzdVar != null && tzdVar.f20436a == LiveDialogEnum.WEBVIEW);
                }
            }).subscribe(ffw.d(new e30() { // from class: l.sd4
                public final void call(Object obj) {
                    this.f18932a.m23874s4((tzd) obj);
                }
            }));
        }
        if (ypv.n(m25547E2().m14548Z0() ? "voice" : "live")) {
            duringCreated((c) m25548F2().IntlGiftComboEvent.newComboVisible().g()).subscribe(ffw.h(new e30() { // from class: l.td4
                public final void call(Object obj) {
                    this.f20188a.m23876t4((Boolean) obj);
                }
            }));
        } else {
            duringCreated((c) m25548F2().GiftDialogEventGroup.giftDialogHeightChange().g()).subscribe(ffw.h(new e30() { // from class: l.ud4
                public final void call(Object obj) {
                    this.f20593a.m23838u4((soj0) obj);
                }
            }));
            duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().g()).filter(new w9j() { // from class: l.dd4
                public final Object call(Object obj) {
                    return Boolean.valueOf(((tzd) obj).f20436a == LiveDialogEnum.GIFT);
                }
            }).subscribe(ffw.d(new e30() { // from class: l.ed4
                public final void call(Object obj) {
                    this.f9676a.m23877v4((tzd) obj);
                }
            }));
        }
        m14188d3(ee4.class, new w9j() { // from class: l.fd4
            public final Object call(Object obj) {
                return Integer.valueOf(this.f10236a.m23868m4((ee4) obj));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public final void m23857c4(final BLiveCampaign bLiveCampaign, final long j) {
        this.f21081l.add(m14186H3(m25547E2().m14581k2(TimeUnit.SECONDS)).take((int) j).subscribe(ffw.d(new e30() { // from class: l.ld4
            public final void call(Object obj) {
                this.f14776a.m23872q4(j, bLiveCampaign, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: d4 */
    public final List<BLiveCampaign> m23858d4(List<BLiveCampaign> list) {
        ArrayList arrayListN = vwb.n(list, new w9j() { // from class: l.kd4
            public final Object call(Object obj) {
                return this.f14286a.m23871p4((BLiveCampaign) obj);
            }
        });
        this.f21079j = arrayListN;
        return arrayListN;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m23859e4() {
        ((LiveCampaignView) ((bwr) this).viewModel).m6943J();
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m23860f4() {
        return (this.f21082m || this.f21083n) ? false : true;
    }

    /* JADX INFO: renamed from: g4 */
    public final void m23861g4() {
        vwb.z(this.f21081l, new zru());
    }

    /* JADX INFO: renamed from: h4 */
    public String m23862h4() {
        return this.f21080k;
    }

    /* JADX INFO: renamed from: i4 */
    public int m23863i4() {
        return ((xnj.C0900a) m14184F3(new xnj(700))).m26042a() + t100.d(10.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    @Override // p002l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo9759j3() {
        return m25547E2().m14582l0() != null ? ((DbObject) m25547E2().m14582l0()).id : "";
    }

    /* JADX INFO: renamed from: j4 */
    public String m23864j4() {
        return "";
    }

    /* JADX INFO: renamed from: k4 */
    public String m23865k4() {
        return "";
    }

    /* JADX INFO: renamed from: l4 */
    public String m23866l4() {
        String strB = m95.c(act()).b();
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            if (!Pattern.matches("tantan:.*邀请码：[A-Z|1-9]{4,}", strB)) {
                return null;
            }
            Matcher matcher = Pattern.compile("[A-Z|1-9]{4,}").matcher(strB);
            matcher.find();
            return matcher.group(matcher.groupCount());
        } catch (Exception e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m23867m1() {
        ((LiveCampaignView) ((bwr) this).viewModel).m6946p();
    }

    /* JADX INFO: renamed from: m4 */
    public int m23868m4(lql lqlVar) {
        if (this.f21078i > 600) {
            this.f21078i = 600;
        }
        return this.f21078i;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f21078i = 0;
        this.f21080k = null;
        m23861g4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m23869n4(final String str) {
        BLiveCampaign bLiveCampaign = (BLiveCampaign) vwb.r(this.f21079j, new w9j() { // from class: l.id4
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCampaign) obj).id, str));
            }
        });
        if (bLiveCampaign != null) {
            m23844F4(bLiveCampaign);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public final void m23870o4(BLiveCampaign bLiveCampaign, long j) {
        BLiveCampaignNotifyData bLiveCampaignNotifyDataNew_ = BLiveCampaignNotifyData.new_();
        bLiveCampaignNotifyDataNew_.campaignId = bLiveCampaign.id;
        bLiveCampaignNotifyDataNew_.roomId = m25547E2().m17239o();
        bLiveCampaignNotifyDataNew_.liveId = m25547E2().m17235k();
        bLiveCampaignNotifyDataNew_.duration = j;
        bLiveCampaignNotifyDataNew_.anchorId = mo9759j3();
        zfv.m27276j0(bLiveCampaignNotifyDataNew_);
    }

    /* JADX INFO: renamed from: p4 */
    public final Boolean m23871p4(BLiveCampaign bLiveCampaign) {
        if (!vwb.J(bLiveCampaign.validPeriod)) {
            if (bLiveCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = qib0.H.guessedCurrentServerTime();
                long jLongValue = ((Long) bLiveCampaign.validPeriod.get(0)).longValue() * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jLongValue || jLongValue - jGuessedCurrentServerTime <= 5000) && jGuessedCurrentServerTime <= ((Long) bLiveCampaign.validPeriod.get(1)).longValue() * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m23872q4(long j, BLiveCampaign bLiveCampaign, Long l2) {
        if (l2.longValue() == j) {
            m23870o4(bLiveCampaign, j);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m23873r4(KeyboardEventData keyboardEventData) {
        m23843E4(keyboardEventData.m5201b());
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m23874s4(tzd tzdVar) {
        m23840B4(tzdVar.f20438c);
    }

    /* JADX INFO: renamed from: t */
    public void m23875t() {
        super.t();
        m23845G4();
        m23846H4();
        m23848J4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m23876t4(Boolean bool) {
        this.f21083n = bool.booleanValue();
        ((LiveCampaignView) ((bwr) this).viewModel).m6943J();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m23877v4(tzd tzdVar) {
        m23842D4(tzdVar.f20438c);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m23878w4(List list) {
        ((LiveCampaignView) ((bwr) this).viewModel).m6940C(m23858d4(list));
        m23847I4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m23879x4(LongLinkSocketMessage.PopUp popUp) {
        m23869n4(popUp.getCampaignId());
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m23880y4(BLiveCampaign bLiveCampaign) {
        long j = bLiveCampaign.popUpRules.liveWatchDuration;
        if (j > 0) {
            m23857c4(bLiveCampaign, j);
        }
        if (m25552L2()) {
            long j2 = bLiveCampaign.popUpRules.anchorLiveDuration;
            if (j2 > 0) {
                m23857c4(bLiveCampaign, j2);
            }
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m23881z4(nc4 nc4Var) {
        if (nc4Var.m18646d()) {
            m23850M4(nc4Var);
        } else if (nc4Var.m18644b()) {
            m23869n4(nc4Var.m18643a());
        } else if (nc4Var.m18645c()) {
            m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(1300).m25610e(nc4Var.m18643a()).m25608c());
        }
    }
}
