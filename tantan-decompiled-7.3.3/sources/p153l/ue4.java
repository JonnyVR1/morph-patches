package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class ue4 extends i6t<oo2, LiveCampaignView> implements c6m {

    /* JADX INFO: renamed from: i */
    public int f178624i;

    /* JADX INFO: renamed from: j */
    public List<BLiveCampaign> f178625j;

    /* JADX INFO: renamed from: k */
    public String f178626k;

    /* JADX INFO: renamed from: l */
    public final List<kcg0> f178627l;

    /* JADX INFO: renamed from: m */
    public boolean f178628m;

    /* JADX INFO: renamed from: n */
    public boolean f178629n;

    public ue4(dum dumVar, LiveCampaignView liveCampaignView) {
        super(dumVar);
        this.f178627l = new ArrayList();
        mo52715C(liveCampaignView);
    }

    /* JADX INFO: renamed from: L4 */
    private void m195602L4(boolean z) {
        ((LiveCampaignView) this.viewModel).setLiveCampaignLocation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m195618u4(vxj0 vxj0Var) {
        mo156936D4(true);
    }

    /* JADX INFO: renamed from: A4 */
    public void m195619A4(boolean z) {
        m213811F2().CampaignVisibleChangeEvent.VISIBLE().mo199273j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: B4 */
    public final void m195620B4(boolean z) {
        fhw.m125605a("[live]campaign", "MK 优化 ".concat(z ? " webView pause " : " webView resume"));
        List<MKWebView> mKWebViewList = ((LiveCampaignView) this.viewModel).getMKWebViewList();
        int size = mKWebViewList.size();
        ((LiveCampaignView) this.viewModel).setAutoplay(!z);
        for (int i = 0; i < size; i++) {
            MKWebView mKWebView = mKWebViewList.get(i);
            if (mKWebView != null && !mKWebView.mo17920e() && !mKWebView.isDestroyed()) {
                if (z) {
                    mKWebView.m17917c1(false);
                } else {
                    mKWebView.onResume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: C4 */
    public void mo156935C4(BLiveCampaign bLiveCampaign) {
        if (BLiveButtonType.signIn.equals(bLiveCampaign.campaignType)) {
            m195631Q4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public void mo156936D4(boolean z) {
        m195602L4(z);
    }

    /* JADX INFO: renamed from: E4 */
    public void m195621E4(boolean z) {
        this.f178628m = z;
        m195635e4();
    }

    /* JADX INFO: renamed from: F4 */
    public void m195622F4(BLiveCampaign bLiveCampaign) {
        mo156937O4(bLiveCampaign);
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(500).m174144r(bLiveCampaign).m174143q());
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(1300).m103154e(bLiveCampaign.schema).m103152c());
        if (BLiveButtonType.signIn.equals(bLiveCampaign.campaignType)) {
            m195630P4();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: G4 */
    public void m195623G4() {
        String strMo104749j3 = mo104749j3();
        if (TextUtils.isEmpty(strMo104749j3)) {
            return;
        }
        duringCreated(aiv.m98068U0(strMo104749j3, mo156940k4(), m195641l4(), m213810E2().mo183435j().liveMode, m195640j4())).subscribe(dhw.m115826e(new y20() { // from class: l.be4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76338a.m195651w4((List) obj);
            }
        }, new y20() { // from class: l.le4
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("[live]campaign", "loadLiveCampaigns message = " + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: H4 */
    public final void m195624H4() {
        duringCreated(m213810E2().m168545q1().m98274c()).subscribe(dhw.m115825d(new y20() { // from class: l.fe4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98566a.m195652x4((LongLinkSocketMessage.PopUp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m195625I4() {
        m195637g4();
        jyb.m147537z(this.f178625j, new y20() { // from class: l.ie4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114551a.m195653y4((BLiveCampaign) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public final void m195626J4() {
        duringCreated(((hiv) zrv.m221194l(htd0.f111521c)).m135155g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.me4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136434a.m195654z4((md4) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public void m195627K4(String str) {
        this.f178626k = str;
    }

    /* JADX INFO: renamed from: M4 */
    public void m195628M4(md4 md4Var) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1300).userId(md4Var.m157955a()).setSource("js").setScene("live").setFromIdentity(csq.m112227a(this, mo104749j3(), md4Var.m157955a(), 1300)).setTo(csq.m112230d(this, mo104749j3(), md4Var.m157955a(), 1300)).trackFrom("campaign").build());
    }

    /* JADX INFO: renamed from: N4 */
    public void m195629N4(boolean z) {
        ((LiveCampaignView) this.viewModel).m74586H(z);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: O4 */
    public void mo156937O4(BLiveCampaign bLiveCampaign) {
        HashMap map = new HashMap();
        map.put("anchor_id", mo104749j3());
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("campaign_type", bLiveCampaign.campaignType);
        if (!TextUtils.isEmpty(bLiveCampaign.schema)) {
            map.put(UserBanAppealSwitch.offline, zrv.f205799a.m207690r(bLiveCampaign.schema));
        }
        map.put("device_level", Integer.valueOf(c0e.INSTANCE.m107408a()));
        i4g0.m138521s("e_live_right_bottom_operation", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: P4 */
    public void m195630P4() {
        HashMap map = new HashMap();
        map.put("anchor_id", mo104749j3());
        map.put("live_id", m213810E2().mo183435j().f45171id);
        i4g0.m138521s("e_live_sign_icon_button", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Q4 */
    public void m195631Q4() {
        HashMap map = new HashMap();
        map.put("anchor_id", mo104749j3());
        map.put("live_id", m213810E2().mo183435j().f45171id);
        i4g0.m138527y("e_live_sign_icon_button", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m195632R4(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            m195623G4();
        } else if (((LongLinkGiftMessage.LiveCampaignInfo) jyb.m147529r(list, new qcj() { // from class: l.ge4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkGiftMessage.LiveCampaignInfo) obj).getType() == LongLinkGiftMessage.LiveCampaignType.List);
            }
        })) != null) {
            m195623G4();
        } else {
            ((LiveCampaignView) this.viewModel).m74584A(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168545q1().m98334w()).subscribe(dhw.m115825d(new y20() { // from class: l.ne4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141571a.m195632R4((List) obj);
            }
        }));
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.oe4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146964a.m195647r4((KeyboardEventData) obj);
            }
        }));
        if (vxr.m203876d().m171034y0()) {
            fhw.m125605a("[live]campaign", "MK 优化  ,开启 挂起策略");
            duringCreated(m213811F2().DialogCenterEvent.changeVisibility().m199270g()).filter(new qcj() { // from class: l.pe4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    h1e h1eVar = (h1e) obj;
                    return Boolean.valueOf(h1eVar != null && h1eVar.f107442b == 80);
                }
            }).filter(new qcj() { // from class: l.qe4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    h1e h1eVar = (h1e) obj;
                    return Boolean.valueOf(h1eVar != null && h1eVar.f107441a == LiveDialogEnum.WEBVIEW);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.re4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162388a.m195648s4((h1e) obj);
                }
            }));
        }
        if (zrv.m221196n(m213810E2().m168498Z0() ? "voice" : "live")) {
            duringCreated(m213811F2().IntlGiftComboEvent.newComboVisible().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.se4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167485a.m195649t4((Boolean) obj);
                }
            }));
        } else {
            duringCreated(m213811F2().GiftDialogEventGroup.giftDialogHeightChange().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.te4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173440a.m195618u4((vxj0) obj);
                }
            }));
            duringCreated(m213811F2().DialogCenterEvent.changeVisibility().m199270g()).filter(new qcj() { // from class: l.ce4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((h1e) obj).f107441a == LiveDialogEnum.GIFT);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.de4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f87986a.m195650v4((h1e) obj);
                }
            }));
        }
        m138860d3(df4.class, new qcj() { // from class: l.ee4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(this.f93617a.m195642m4((df4) obj));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: c4 */
    public final void m195633c4(final BLiveCampaign bLiveCampaign, final long j) {
        this.f178627l.add(m138858H3(m213810E2().m168531k2(TimeUnit.SECONDS)).take((int) j).subscribe(dhw.m115825d(new y20() { // from class: l.ke4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125295a.m195646q4(j, bLiveCampaign, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: d4 */
    public final List<BLiveCampaign> m195634d4(List<BLiveCampaign> list) {
        ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.je4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120390a.m195645p4((BLiveCampaign) obj);
            }
        });
        this.f178625j = arrayListM147522n;
        return arrayListM147522n;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m195635e4() {
        ((LiveCampaignView) this.viewModel).m74587J();
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m195636f4() {
        return (this.f178628m || this.f178629n) ? false : true;
    }

    /* JADX INFO: renamed from: g4 */
    public final void m195637g4() {
        jyb.m147537z(this.f178627l, new auu());
    }

    /* JADX INFO: renamed from: h4 */
    public String m195638h4() {
        return this.f178626k;
    }

    /* JADX INFO: renamed from: i4 */
    public int m195639i4() {
        return ((nqj.C18926a) m138856F3(new nqj(700))).m164321a() + qa00.m175859d(10.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    @Override // p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        return m213810E2().m168532l0() != null ? m213810E2().m168532l0().f56859id : "";
    }

    /* JADX INFO: renamed from: j4 */
    public String m195640j4() {
        return "";
    }

    /* JADX INFO: renamed from: k4 */
    public String mo156940k4() {
        return "";
    }

    /* JADX INFO: renamed from: l4 */
    public String m195641l4() {
        String strM162058b = na5.m162056c(act()).m162058b();
        if (TextUtils.isEmpty(strM162058b)) {
            return null;
        }
        try {
            if (!Pattern.matches("tantan:.*邀请码：[A-Z|1-9]{4,}", strM162058b)) {
                return null;
            }
            Matcher matcher = Pattern.compile("[A-Z|1-9]{4,}").matcher(strM162058b);
            matcher.find();
            return matcher.group(matcher.groupCount());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
        ((LiveCampaignView) this.viewModel).m74589p();
    }

    /* JADX INFO: renamed from: m4 */
    public int m195642m4(xsl xslVar) {
        if (this.f178624i > 600) {
            this.f178624i = 600;
        }
        return this.f178624i;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f178624i = 0;
        this.f178626k = null;
        m195637g4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m195643n4(final String str) {
        BLiveCampaign bLiveCampaign = (BLiveCampaign) jyb.m147529r(this.f178625j, new qcj() { // from class: l.he4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCampaign) obj).f45196id, str));
            }
        });
        if (bLiveCampaign != null) {
            m195622F4(bLiveCampaign);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: o4 */
    public final void m195644o4(BLiveCampaign bLiveCampaign, long j) {
        BLiveCampaignNotifyData bLiveCampaignNotifyDataNew_ = BLiveCampaignNotifyData.new_();
        bLiveCampaignNotifyDataNew_.campaignId = bLiveCampaign.f45196id;
        bLiveCampaignNotifyDataNew_.roomId = m213810E2().m202194o();
        bLiveCampaignNotifyDataNew_.liveId = m213810E2().m202191k();
        bLiveCampaignNotifyDataNew_.duration = j;
        bLiveCampaignNotifyDataNew_.anchorId = mo104749j3();
        aiv.m98107j0(bLiveCampaignNotifyDataNew_);
    }

    /* JADX INFO: renamed from: p4 */
    public final Boolean m195645p4(BLiveCampaign bLiveCampaign) {
        if (!jyb.m147479J(bLiveCampaign.validPeriod)) {
            if (bLiveCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
                long jLongValue = bLiveCampaign.validPeriod.get(0).longValue() * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jLongValue || jLongValue - jGuessedCurrentServerTime <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) && jGuessedCurrentServerTime <= bLiveCampaign.validPeriod.get(1).longValue() * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m195646q4(long j, BLiveCampaign bLiveCampaign, Long l2) {
        if (l2.longValue() == j) {
            m195644o4(bLiveCampaign, j);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m195647r4(KeyboardEventData keyboardEventData) {
        m195621E4(keyboardEventData.m73008b());
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m195648s4(h1e h1eVar) {
        m195620B4(h1eVar.f107443c);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m195623G4();
        m195624H4();
        m195626J4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m195649t4(Boolean bool) {
        this.f178629n = bool.booleanValue();
        ((LiveCampaignView) this.viewModel).m74587J();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m195650v4(h1e h1eVar) {
        mo156936D4(h1eVar.f107443c);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m195651w4(List list) {
        ((LiveCampaignView) this.viewModel).m74585C(m195634d4(list));
        m195625I4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m195652x4(LongLinkSocketMessage.PopUp popUp) {
        m195643n4(popUp.getCampaignId());
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m195653y4(BLiveCampaign bLiveCampaign) {
        long j = bLiveCampaign.popUpRules.liveWatchDuration;
        if (j > 0) {
            m195633c4(bLiveCampaign, j);
        }
        if (m213815L2()) {
            long j2 = bLiveCampaign.popUpRules.anchorLiveDuration;
            if (j2 > 0) {
                m195633c4(bLiveCampaign, j2);
            }
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m195654z4(md4 md4Var) {
        if (md4Var.m157958d()) {
            m195628M4(md4Var);
        } else if (md4Var.m157956b()) {
            m195643n4(md4Var.m157955a());
        } else if (md4Var.m157957c()) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(1300).m103154e(md4Var.m157955a()).m103152c());
        }
    }
}
