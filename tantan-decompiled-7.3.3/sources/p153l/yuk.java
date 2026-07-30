package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yuk extends hj2<oo2, ats> {

    /* JADX INFO: renamed from: k */
    public String f201623k;

    /* JADX INFO: renamed from: l */
    public int f201624l;

    /* JADX INFO: renamed from: m */
    public BLiveData f201625m;

    /* JADX INFO: renamed from: n */
    public final String f201626n;

    /* JADX INFO: renamed from: o */
    public boolean f201627o;

    /* JADX INFO: renamed from: p */
    public User f201628p;

    /* JADX INFO: renamed from: q */
    public BLiveGuardType f201629q;

    /* JADX INFO: renamed from: r */
    public BLiveData f201630r;

    public yuk(dum dumVar) {
        super(dumVar);
        this.f201626n = "530";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m217384F4(Boolean bool) {
        this.f201627o = false;
        this.f196918e.f90815a.progressDismiss();
        if (bool.booleanValue()) {
            z1r.m218367c(m213815L2(), m213810E2(), this.f201623k, this.f201625m);
            mo135321N3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m217392W3(y20 y20Var, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m217394Y3(String str, String str2, final DialogC12774a dialogC12774a, View view) {
        if (!TextUtils.isEmpty(str)) {
            izs.m142868s("context_single_room", (VDraweeView) view.findViewById(mdc0.f136150d2), str);
        }
        ((VText) view.findViewById(mdc0.f136329w2)).setText(str2);
        bnl0.m105524M(view.findViewById(mdc0.f136168f0), false);
        VText vText = (VText) view.findViewById(mdc0.f135942G4);
        vText.setText(R$string.f47573He);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.ouk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dialogC12774a.m72940O();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.oo2] */
    /* JADX INFO: renamed from: A4 */
    public final void m217399A4(BLiveGuardboardRecord bLiveGuardboardRecord) {
        m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m213810E2().mo160117o0()).m74212r(m213810E2().m202191k()).m74213s(m213810E2().mo183435j().room.f45267id).m74211q(m213810E2().m168532l0().name).m74216v(bLiveGuardboardRecord.liveId).m74217w(bLiveGuardboardRecord.roomId).m74215u("guard-leader-boards").m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ lsw m217400B4(BLiveData bLiveData, BLiveData bLiveData2) {
        bLiveData.guardRecords = bLiveData2.guardRecords;
        return m217426r4(bLiveData);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m217401C4(y20 y20Var, lsw lswVar) {
        ((ats) this.f110147i).m100254J(lswVar);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
        if (lswVar.f133478l) {
            m217410M4(lswVar.f133479m, lswVar.f133477k);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m217402D4(BLiveData bLiveData) {
        this.f201630r = bLiveData;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m217403E4(int i, y20 y20Var, Long l2) {
        long j = i;
        if (l2.longValue() < j) {
            y20Var.call(fvk.m127656g(j, l2.longValue()));
        } else {
            m217408K4(null);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m217404G4(y1r y1rVar) {
        if (isShowing()) {
            return;
        }
        this.f196918e.f90815a.progress(R$string.f48312q, true);
        m217433y4(y1rVar);
        m217408K4(new y20() { // from class: l.quk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159588a.m217384F4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m217405H4(y1r y1rVar) {
        this.f201627o = y1rVar.m213958b();
        m217415g4();
    }

    /* JADX INFO: renamed from: I4 */
    public void m217406I4() {
        if (m217432x4()) {
            m217407J4(this.f201625m.knightsRuleInfos.get(0).knightIntroduceUrl);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m217407J4(String str) {
        int iM100246A = ((ats) this.viewModel).m100246A() + qa00.m175859d(15.0f);
        if (iM100246A == 0) {
            iM100246A = (int) (((double) bnl0.m105588w0()) * 0.7d);
        }
        m138875v3(str, iM100246A, 8101);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K4 */
    public final void m217408K4(@Nullable y20<Boolean> y20Var) {
        LivingNormalApiProvider.m72620d5(m213810E2().mo183435j().anchor.f45267id, null);
        m217421m4(y20Var);
    }

    /* JADX INFO: renamed from: L4 */
    public void m217409L4(BLiveGuardType bLiveGuardType, String str, String str2) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136080B("liveGiftGuardClick").m136084u(m217418j4(bLiveGuardType), new C21686a(), m217419k4(bLiveGuardType), str, str2, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.guard))).m136083t());
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: M3 */
    public void mo135320M3() {
        super.mo135320M3();
        if (m213809D2() || this.f201627o || 3800 != this.f201624l || !NullChecker.m82486a(this.f201628p)) {
            return;
        }
        m217411N4(this.f201628p.f56859id);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m217410M4(final String str, final String str2) {
        final DialogC12774a dialogC12774a = new DialogC12774a(this, yec0.f199074f5, qag0.m175926g());
        dialogC12774a.m72959h0(new y20() { // from class: l.wuk
            @Override // p153l.y20
            public final void call(Object obj) {
                yuk.m217394Y3(str2, str, dialogC12774a, (View) obj);
            }
        });
        dialogC12774a.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: N4 */
    public void m217411N4(String str) {
        String strMo104749j3 = NullChecker.m82486a(m213810E2().m168532l0()) ? mo104749j3() : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(8101).showShadow().userId(str).setSource("Guard").setFromIdentity(csq.m112227a(this, strMo104749j3, str, 8101)).setTo(csq.m112230d(this, strMo104749j3, str, 8101)).setScene("Guard").trackFrom("Guard").build());
    }

    /* JADX INFO: renamed from: d4 */
    public final g2t m217412d4(BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary) {
        g2t g2tVar = new g2t();
        g2tVar.f101886a = bLiveUserKnightInfoSummary;
        g2tVar.f101889d = this.f201625m.knightsRuleInfos.get(0);
        nsv<User> nsvVarM127654e = fvk.m127654e(bLiveUserKnightInfoSummary, this.f201630r);
        g2tVar.f101887b = nsvVarM127654e;
        if (NullChecker.m82486a(nsvVarM127654e) && NullChecker.m82486a(nsvVarM127654e.m164643h())) {
            g2tVar.f101888c = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(g2tVar.f101887b.m164643h().hierarchy.grade);
        }
        return g2tVar;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m217413e4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM217430v4 = m217430v4(bLiveGuardType);
        return NullChecker.m82486a(bLiveUserKnightInfoSummaryM217430v4) && fvk.m127662m((double) bLiveUserKnightInfoSummaryM217430v4.createdTime) > 24;
    }

    /* JADX INFO: renamed from: f4 */
    public void m217414f4() {
        m213811F2().KnightGuardEvent.closeDialog().mo199273j(new y1r(8101));
    }

    /* JADX INFO: renamed from: g4 */
    public void m217415g4() {
        if (NullChecker.m82486a(this.viewModel)) {
            ((ats) this.viewModel).mo72910j();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: h4 */
    public String m217416h4() {
        String str = m213810E2().m168532l0().name;
        return str.length() > 7 ? str.substring(0, 7).concat("...") : str;
    }

    /* JADX INFO: renamed from: i4 */
    public long m217417i4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM217430v4 = m217430v4(bLiveGuardType);
        if (NullChecker.m82486a(bLiveUserKnightInfoSummaryM217430v4)) {
            return bLiveUserKnightInfoSummaryM217430v4.expireTime;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    @Override // p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        return m213810E2().m168532l0().f56859id;
    }

    /* JADX INFO: renamed from: j4 */
    public String m217418j4(BLiveGuardType bLiveGuardType) {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM217423o4 = m217423o4(bLiveGuardType);
        return (m217432x4() && NullChecker.m82486a(bLiveKnightsRuleInfoItemM217423o4)) ? bLiveKnightsRuleInfoItemM217423o4.knightsContractGiftId : "530";
    }

    /* JADX INFO: renamed from: k4 */
    public int m217419k4(BLiveGuardType bLiveGuardType) {
        int iM217427s4 = m217427s4(bLiveGuardType);
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM217423o4 = m217423o4(bLiveGuardType);
        if (m217432x4() && iM217427s4 > 0 && NullChecker.m82486a(bLiveKnightsRuleInfoItemM217423o4)) {
            return (int) Math.ceil(((double) iM217427s4) / (((double) bLiveKnightsRuleInfoItemM217423o4.knightGiftCoins) * 1.0d));
        }
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public int m217420l4(BLiveGuardType bLiveGuardType) {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM217423o4 = m217423o4(bLiveGuardType);
        if (m217432x4() && NullChecker.m82486a(bLiveKnightsRuleInfoItemM217423o4)) {
            return bLiveKnightsRuleInfoItemM217423o4.knightGiftCoins;
        }
        return 50;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: m4 */
    public final void m217421m4(@Nullable final y20<Boolean> y20Var) {
        m135318J3(C22421c.combineLatest(LivingNormalApiProvider.m72556W4(m213810E2().mo183435j().anchor.f45267id, m213810E2().m202194o()), LivingNormalApiProvider.m72547V4(m213810E2().mo183435j().anchor.f45267id), new rcj() { // from class: l.ruk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f164923a.m217400B4((BLiveData) obj, (BLiveData) obj2);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.suk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170692a.m217401C4(y20Var, (lsw) obj);
            }
        }, new y20() { // from class: l.tuk
            @Override // p153l.y20
            public final void call(Object obj) {
                yuk.m217392W3(y20Var, (Throwable) obj);
            }
        }));
        if (m213810E2().mo118373p()) {
            m135318J3(LivingNormalApiProvider.m72538U4(m213810E2().mo183435j().anchor.f45267id, m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.uuk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181081a.m217402D4((BLiveData) obj);
                }
            }));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        C22507a<pf60<Boolean, BLiveData>> c22507a;
        super.mo70300n();
        hiv hivVar = (hiv) zrv.m221194l(htd0.f111521c);
        if (hivVar == null || (c22507a = hivVar.f110074e) == null) {
            return;
        }
        c22507a.m137019l(null);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [l.oo2] */
    /* JADX INFO: renamed from: n4 */
    public void m217422n4(final y20<String> y20Var) {
        int iM203707q4 = zrv.m221193k().m203707q4();
        if (iM203707q4 == 0) {
            return;
        }
        int i = iM203707q4 * 3600000;
        final int iM174454o = (i - (((int) (pzi0.m174454o() - pzi0.m174453n())) % i)) / 1000;
        y20Var.call(fvk.m127656g(iM174454o, 0L));
        m135318J3(m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS).take(iM174454o))).subscribe(dhw.m115829h(new y20() { // from class: l.xuk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196288a.m217403E4(iM174454o, y20Var, (Long) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public final BLiveKnightsRuleInfoItem m217423o4(final BLiveGuardType bLiveGuardType) {
        return (BLiveKnightsRuleInfoItem) jyb.m147529r(this.f201625m.knightsRuleInfos, new qcj() { // from class: l.nuk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((BLiveKnightsRuleInfoItem) obj).guardType, bLiveGuardType));
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public List<g2t> m217424p4(BLiveGuardType bLiveGuardType) {
        ArrayList arrayList = new ArrayList();
        if (this.f201630r != null) {
            BLiveAnchorKnightInfos bLiveAnchorKnightInfosM222761e = ((hiv) zrv.m221194l(htd0.f111521c)).f110075f.m222761e();
            if (NullChecker.m82486a(bLiveAnchorKnightInfosM222761e)) {
                if (TEnum.equals(bLiveGuardType, BLiveGuardType.onlineGuard)) {
                    Iterator<BLiveUserKnightInfoSummary> it = bLiveAnchorKnightInfosM222761e.onlineKnights.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m217412d4(it.next()));
                    }
                } else {
                    Iterator<BLiveUserKnightInfoSummary> it2 = bLiveAnchorKnightInfosM222761e.potentialKnights.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(m217412d4(it2.next()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q4 */
    public long m217425q4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM217430v4 = m217430v4(bLiveGuardType);
        if (NullChecker.m82486a(bLiveUserKnightInfoSummaryM217430v4)) {
            return bLiveUserKnightInfoSummaryM217430v4.guardScoreIncrement;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    public final lsw m217426r4(BLiveData bLiveData) {
        this.f201625m = bLiveData;
        lsw lswVar = new lsw();
        lswVar.f133473g = m213815L2();
        lswVar.f133467a = xau.m209911u(R$string.f47771Qj, m217416h4());
        lswVar.f133468b = m213810E2().m168532l0().m61308fp().url;
        if (!jyb.m147479J(bLiveData.guardAnchorRankInfos)) {
            BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo = bLiveData.guardAnchorRankInfos.get(0);
            lswVar.f133469c = bLiveGuardAnchorRankInfo.currentRank;
            lswVar.f133470d = bLiveGuardAnchorRankInfo.guardScore;
            lswVar.f133471e = bLiveGuardAnchorRankInfo.gapGuardScore;
            lswVar.f133476j = bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen;
            lswVar.f133474h = new ArrayList();
            if (!jyb.m147479J(bLiveGuardAnchorRankInfo.topScoreRewardInfos)) {
                for (BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem : bLiveGuardAnchorRankInfo.topScoreRewardInfos) {
                    lswVar.f133474h.add(new lsw.C18453c(bLiveKnightsPrivilegeItem.icon, bLiveKnightsPrivilegeItem.title));
                }
            }
            lswVar.f133472f = fvk.m127661l(this, bLiveData.knightsRuleInfos, bLiveGuardAnchorRankInfo);
        }
        if (!jyb.m147479J(bLiveData.knightsRuleInfos)) {
            lswVar.f133479m = bLiveData.knightsRuleInfos.get(0).discountNotice;
            lswVar.f133477k = bLiveData.knightsRuleInfos.get(0).guardPopupIcon;
            lswVar.f133478l = bLiveData.knightsRuleInfos.get(0).showDiscount;
        }
        lswVar.f133475i = bLiveData.guardRecords;
        return lswVar;
    }

    /* JADX INFO: renamed from: s4 */
    public int m217427s4(final BLiveGuardType bLiveGuardType) {
        if (!m217432x4() || this.f201625m.userKnightInfosSummary.size() <= 0) {
            return 0;
        }
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM217423o4 = m217423o4(bLiveGuardType);
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = (BLiveUserKnightInfoSummary) jyb.m147529r(this.f201625m.userKnightInfosSummary, new qcj() { // from class: l.vuk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveGuardType, ((BLiveUserKnightInfoSummary) obj).guardType));
            }
        });
        if (NullChecker.m82486a(bLiveKnightsRuleInfoItemM217423o4) && NullChecker.m82486a(bLiveUserKnightInfoSummary)) {
            return bLiveKnightsRuleInfoItemM217423o4.knightCoins - bLiveUserKnightInfoSummary.sessionSendCoins;
        }
        return 0;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().KnightGuardEvent.openDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.luk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133636a.m217404G4((y1r) obj);
            }
        }));
        duringCreated(m213811F2().KnightGuardEvent.closeDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.puk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154195a.m217405H4((y1r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public String m217428t4() {
        return this.f201623k;
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public ats mo76862K3() {
        return new ats();
    }

    @Nullable
    /* JADX INFO: renamed from: v4 */
    public final BLiveUserKnightInfoSummary m217430v4(final BLiveGuardType bLiveGuardType) {
        return (BLiveUserKnightInfoSummary) jyb.m147529r(this.f201625m.userKnightInfosSummary, new qcj() { // from class: l.muk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveGuardType, ((BLiveUserKnightInfoSummary) obj).guardType));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: w4 */
    public void m217431w4(BLiveGuardboardRecord bLiveGuardboardRecord) {
        fvk.m127669t(bLiveGuardboardRecord, mo78457R2());
        if (m213815L2()) {
            if (TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive")) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47647L0));
                return;
            } else {
                m217411N4(bLiveGuardboardRecord.userId);
                return;
            }
        }
        if (!TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive") || TextUtils.isEmpty(bLiveGuardboardRecord.liveId) || m213810E2().m202194o().equals(bLiveGuardboardRecord.roomId)) {
            m217411N4(bLiveGuardboardRecord.userId);
        } else {
            if (((Boolean) m138856F3(new v24(4100, 1))).booleanValue()) {
                return;
            }
            ((ats) this.viewModel).mo72910j();
            m217399A4(bLiveGuardboardRecord);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m217432x4() {
        return NullChecker.m82486a(this.f201625m) && this.f201625m.knightsRuleInfos.size() > 0;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m217433y4(y1r y1rVar) {
        this.f201623k = y1rVar.m213960d();
        this.f201624l = y1rVar.m176282a();
        this.f201628p = y1rVar.m213959c();
        this.f201629q = y1rVar.m213961e();
        m135319L3();
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m217434z4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM217430v4 = m217430v4(bLiveGuardType);
        if (NullChecker.m82486a(bLiveUserKnightInfoSummaryM217430v4)) {
            return bLiveUserKnightInfoSummaryM217430v4.isKnight;
        }
        return false;
    }

    /* JADX INFO: renamed from: l.yuk$a */
    public class C21686a implements aiv.C15716a.a {
        public C21686a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            yuk.this.f201624l = 0;
            yuk.this.m217414f4();
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
