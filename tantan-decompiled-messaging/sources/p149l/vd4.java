package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class vd4 extends h4t<ho2, LiveCampaignView> implements l3m {

    /* JADX INFO: renamed from: i */
    public int f181012i;

    /* JADX INFO: renamed from: j */
    public List<BLiveCampaign> f181013j;

    /* JADX INFO: renamed from: k */
    public String f181014k;

    /* JADX INFO: renamed from: l */
    public final List<c4g0> f181015l;

    /* JADX INFO: renamed from: m */
    public boolean f181016m;

    /* JADX INFO: renamed from: n */
    public boolean f181017n;

    public vd4(bsm bsmVar, LiveCampaignView liveCampaignView) {
        super(bsmVar);
        this.f181015l = new ArrayList();
        mo51532C(liveCampaignView);
    }

    /* JADX INFO: renamed from: L4 */
    private void m197921L4(boolean z) {
        ((LiveCampaignView) this.viewModel).setLiveCampaignLocation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m197937u4(soj0 soj0Var) {
        mo138428D4(true);
    }

    /* JADX INFO: renamed from: A4 */
    public void m197938A4(boolean z) {
        m206028F2().CampaignVisibleChangeEvent.VISIBLE().mo172463j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: B4 */
    public final void m197939B4(boolean z) {
        hfw.m130790a("[live]campaign", "MK 优化 ".concat(z ? " webView pause " : " webView resume"));
        List<MKWebView> mKWebViewList = ((LiveCampaignView) this.viewModel).getMKWebViewList();
        int size = mKWebViewList.size();
        ((LiveCampaignView) this.viewModel).setAutoplay(!z);
        for (int i = 0; i < size; i++) {
            MKWebView mKWebView = mKWebViewList.get(i);
            if (mKWebView != null && !mKWebView.m87089v0() && !mKWebView.m87087q0()) {
                if (z) {
                    mKWebView.m87079D0(false);
                } else {
                    mKWebView.onResume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: C4 */
    public void mo138427C4(BLiveCampaign bLiveCampaign) {
        if (BLiveButtonType.signIn.equals(bLiveCampaign.campaignType)) {
            m197950Q4();
        }
    }

    /* JADX INFO: renamed from: D4 */
    public void mo138428D4(boolean z) {
        m197921L4(z);
    }

    /* JADX INFO: renamed from: E4 */
    public void m197940E4(boolean z) {
        this.f181016m = z;
        m197954e4();
    }

    /* JADX INFO: renamed from: F4 */
    public void m197941F4(BLiveCampaign bLiveCampaign) {
        mo138429O4(bLiveCampaign);
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(500).m142601r(bLiveCampaign).m142600q());
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(1300).m206701e(bLiveCampaign.schema).m206699c());
        if (BLiveButtonType.signIn.equals(bLiveCampaign.campaignType)) {
            m197949P4();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: G4 */
    public void m197942G4() {
        String strMo96662j3 = mo96662j3();
        if (TextUtils.isEmpty(strMo96662j3)) {
            return;
        }
        duringCreated(zfv.m218534U0(strMo96662j3, mo138432k4(), m197960l4(), m206027E2().mo149813j().liveMode, m197959j4())).subscribe(ffw.m121194e(new e30() { // from class: l.cd4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80347a.m197970w4((List) obj);
            }
        }, new e30() { // from class: l.md4
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("[live]campaign", "loadLiveCampaigns message = " + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: H4 */
    public final void m197943H4() {
        duringCreated(m206027E2().m132160q1().m189092c()).subscribe(ffw.m121193d(new e30() { // from class: l.gd4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102079a.m197971x4((LongLinkSocketMessage.PopUp) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m197944I4() {
        m197956g4();
        vwb.m200354z(this.f181013j, new e30() { // from class: l.jd4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117367a.m197972y4((BLiveCampaign) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    public final void m197945J4() {
        duringCreated(((ggv) ypv.m215673l(fld0.f98148c)).m126021g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.nd4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138264a.m197973z4((nc4) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public void m197946K4(String str) {
        this.f181014k = str;
    }

    /* JADX INFO: renamed from: M4 */
    public void m197947M4(nc4 nc4Var) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1300).userId(nc4Var.m158878a()).setSource("js").setScene("live").setFromIdentity(bqq.m103386a(this, mo96662j3(), nc4Var.m158878a(), 1300)).setTo(bqq.m103389d(this, mo96662j3(), nc4Var.m158878a(), 1300)).trackFrom("campaign").build());
    }

    /* JADX INFO: renamed from: N4 */
    public void m197948N4(boolean z) {
        ((LiveCampaignView) this.viewModel).m73403H(z);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O4 */
    public void mo138429O4(BLiveCampaign bLiveCampaign) {
        HashMap map = new HashMap();
        map.put("anchor_id", mo96662j3());
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("campaign_type", bLiveCampaign.campaignType);
        if (!TextUtils.isEmpty(bLiveCampaign.schema)) {
            map.put(UserBanAppealSwitch.offline, ypv.f199493a.m199368r(bLiveCampaign.schema));
        }
        map.put("device_level", Integer.valueOf(pyd.INSTANCE.m172109a()));
        zvf0.m220397s("e_live_right_bottom_operation", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P4 */
    public void m197949P4() {
        HashMap map = new HashMap();
        map.put("anchor_id", mo96662j3());
        map.put("live_id", m206027E2().mo149813j().f44323id);
        zvf0.m220397s("e_live_sign_icon_button", "p_user_live_room", map);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Q4 */
    public void m197950Q4() {
        HashMap map = new HashMap();
        map.put("anchor_id", mo96662j3());
        map.put("live_id", m206027E2().mo149813j().f44323id);
        zvf0.m220403y("e_live_sign_icon_button", "p_user_live_room", map);
    }

    /* JADX INFO: renamed from: R4 */
    public final void m197951R4(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            m197942G4();
        } else if (((LongLinkGiftMessage.LiveCampaignInfo) vwb.m200346r(list, new w9j() { // from class: l.hd4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkGiftMessage.LiveCampaignInfo) obj).getType() == LongLinkGiftMessage.LiveCampaignType.List);
            }
        })) != null) {
            m197942G4();
        } else {
            ((LiveCampaignView) this.viewModel).m73401A(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132160q1().m189152w()).subscribe(ffw.m121193d(new e30() { // from class: l.od4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143168a.m197951R4((List) obj);
            }
        }));
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.pd4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148259a.m197966r4((KeyboardEventData) obj);
            }
        }));
        if (uvr.m196087d().m162727y0()) {
            hfw.m130790a("[live]campaign", "MK 优化  ,开启 挂起策略");
            duringCreated(m206028F2().DialogCenterEvent.changeVisibility().m172460g()).filter(new w9j() { // from class: l.qd4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    tzd tzdVar = (tzd) obj;
                    return Boolean.valueOf(tzdVar != null && tzdVar.f172730b == 80);
                }
            }).filter(new w9j() { // from class: l.rd4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    tzd tzdVar = (tzd) obj;
                    return Boolean.valueOf(tzdVar != null && tzdVar.f172729a == LiveDialogEnum.WEBVIEW);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.sd4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163803a.m197967s4((tzd) obj);
                }
            }));
        }
        if (ypv.m215675n(m206027E2().m132112Z0() ? "voice" : "live")) {
            duringCreated(m206028F2().IntlGiftComboEvent.newComboVisible().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.td4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169492a.m197968t4((Boolean) obj);
                }
            }));
        } else {
            duringCreated(m206028F2().GiftDialogEventGroup.giftDialogHeightChange().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ud4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175896a.m197937u4((soj0) obj);
                }
            }));
            duringCreated(m206028F2().DialogCenterEvent.changeVisibility().m172460g()).filter(new w9j() { // from class: l.dd4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((tzd) obj).f172729a == LiveDialogEnum.GIFT);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.ed4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90588a.m197969v4((tzd) obj);
                }
            }));
        }
        m129301d3(ee4.class, new w9j() { // from class: l.fd4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(this.f96954a.m197961m4((ee4) obj));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public final void m197952c4(final BLiveCampaign bLiveCampaign, final long j) {
        this.f181015l.add(m129299H3(m206027E2().m132145k2(TimeUnit.SECONDS)).take((int) j).subscribe(ffw.m121193d(new e30() { // from class: l.ld4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127501a.m197965q4(j, bLiveCampaign, (Long) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: d4 */
    public final List<BLiveCampaign> m197953d4(List<BLiveCampaign> list) {
        ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.kd4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122539a.m197964p4((BLiveCampaign) obj);
            }
        });
        this.f181013j = arrayListM200339n;
        return arrayListM200339n;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m197954e4() {
        ((LiveCampaignView) this.viewModel).m73404J();
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m197955f4() {
        return (this.f181016m || this.f181017n) ? false : true;
    }

    /* JADX INFO: renamed from: g4 */
    public final void m197956g4() {
        vwb.m200354z(this.f181015l, new zru());
    }

    /* JADX INFO: renamed from: h4 */
    public String m197957h4() {
        return this.f181014k;
    }

    /* JADX INFO: renamed from: i4 */
    public int m197958i4() {
        return ((xnj.C21181a) m129297F3(new xnj(700))).m210170a() + t100.m186890d(10.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    @Override // p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        return m206027E2().m132146l0() != null ? m206027E2().m132146l0().f56011id : "";
    }

    /* JADX INFO: renamed from: j4 */
    public String m197959j4() {
        return "";
    }

    /* JADX INFO: renamed from: k4 */
    public String mo138432k4() {
        return "";
    }

    /* JADX INFO: renamed from: l4 */
    public String m197960l4() {
        String strM153592b = m95.m153590c(act()).m153592b();
        if (TextUtils.isEmpty(strM153592b)) {
            return null;
        }
        try {
            if (!Pattern.matches("tantan:.*邀请码：[A-Z|1-9]{4,}", strM153592b)) {
                return null;
            }
            Matcher matcher = Pattern.compile("[A-Z|1-9]{4,}").matcher(strM153592b);
            matcher.find();
            return matcher.group(matcher.groupCount());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
        ((LiveCampaignView) this.viewModel).m73406p();
    }

    /* JADX INFO: renamed from: m4 */
    public int m197961m4(lql lqlVar) {
        if (this.f181012i > 600) {
            this.f181012i = 600;
        }
        return this.f181012i;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f181012i = 0;
        this.f181014k = null;
        m197956g4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m197962n4(final String str) {
        BLiveCampaign bLiveCampaign = (BLiveCampaign) vwb.m200346r(this.f181013j, new w9j() { // from class: l.id4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveCampaign) obj).f44348id, str));
            }
        });
        if (bLiveCampaign != null) {
            m197941F4(bLiveCampaign);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public final void m197963o4(BLiveCampaign bLiveCampaign, long j) {
        BLiveCampaignNotifyData bLiveCampaignNotifyDataNew_ = BLiveCampaignNotifyData.new_();
        bLiveCampaignNotifyDataNew_.campaignId = bLiveCampaign.f44348id;
        bLiveCampaignNotifyDataNew_.roomId = m206027E2().m149818o();
        bLiveCampaignNotifyDataNew_.liveId = m206027E2().m149814k();
        bLiveCampaignNotifyDataNew_.duration = j;
        bLiveCampaignNotifyDataNew_.anchorId = mo96662j3();
        zfv.m218573j0(bLiveCampaignNotifyDataNew_);
    }

    /* JADX INFO: renamed from: p4 */
    public final Boolean m197964p4(BLiveCampaign bLiveCampaign) {
        if (!vwb.m200296J(bLiveCampaign.validPeriod)) {
            if (bLiveCampaign.validPeriod.size() > 1) {
                long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
                long jLongValue = bLiveCampaign.validPeriod.get(0).longValue() * 1000;
                return Boolean.valueOf((jGuessedCurrentServerTime >= jLongValue || jLongValue - jGuessedCurrentServerTime <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) && jGuessedCurrentServerTime <= bLiveCampaign.validPeriod.get(1).longValue() * 1000);
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m197965q4(long j, BLiveCampaign bLiveCampaign, Long l2) {
        if (l2.longValue() == j) {
            m197963o4(bLiveCampaign, j);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m197966r4(KeyboardEventData keyboardEventData) {
        m197940E4(keyboardEventData.m71825b());
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m197967s4(tzd tzdVar) {
        m197939B4(tzdVar.f172731c);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m197942G4();
        m197943H4();
        m197945J4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m197968t4(Boolean bool) {
        this.f181017n = bool.booleanValue();
        ((LiveCampaignView) this.viewModel).m73404J();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m197969v4(tzd tzdVar) {
        mo138428D4(tzdVar.f172731c);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m197970w4(List list) {
        ((LiveCampaignView) this.viewModel).m73402C(m197953d4(list));
        m197944I4();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m197971x4(LongLinkSocketMessage.PopUp popUp) {
        m197962n4(popUp.getCampaignId());
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m197972y4(BLiveCampaign bLiveCampaign) {
        long j = bLiveCampaign.popUpRules.liveWatchDuration;
        if (j > 0) {
            m197952c4(bLiveCampaign, j);
        }
        if (m206032L2()) {
            long j2 = bLiveCampaign.popUpRules.anchorLiveDuration;
            if (j2 > 0) {
                m197952c4(bLiveCampaign, j2);
            }
        }
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m197973z4(nc4 nc4Var) {
        if (nc4Var.m158881d()) {
            m197947M4(nc4Var);
        } else if (nc4Var.m158879b()) {
            m197962n4(nc4Var.m158878a());
        } else if (nc4Var.m158880c()) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(1300).m206701e(nc4Var.m158878a()).m206699c());
        }
    }
}
