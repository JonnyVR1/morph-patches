package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class isk extends zi2<ho2, zqs> {

    /* JADX INFO: renamed from: k */
    public String f114768k;

    /* JADX INFO: renamed from: l */
    public int f114769l;

    /* JADX INFO: renamed from: m */
    public BLiveData f114770m;

    /* JADX INFO: renamed from: n */
    public final String f114771n;

    /* JADX INFO: renamed from: o */
    public boolean f114772o;

    /* JADX INFO: renamed from: p */
    public User f114773p;

    /* JADX INFO: renamed from: q */
    public BLiveGuardType f114774q;

    /* JADX INFO: renamed from: r */
    public BLiveData f114775r;

    public isk(bsm bsmVar) {
        super(bsmVar);
        this.f114771n = "530";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m137983F4(Boolean bool) {
        this.f114772o = false;
        this.f188512e.f77095a.progressDismiss();
        if (bool.booleanValue()) {
            yzq.m216688c(m206032L2(), m206027E2(), this.f114768k, this.f114770m);
            mo168244N3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m137991W3(e30 e30Var, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m137993Y3(String str, String str2, final DialogC12611a dialogC12611a, View view) {
        if (!TextUtils.isEmpty(str)) {
            hxs.m133406s("context_single_room", (VDraweeView) view.findViewById(g5c0.f100905d2), str);
        }
        ((VText) view.findViewById(g5c0.f101084w2)).setText(str2);
        xdl0.m208344M(view.findViewById(g5c0.f100923f0), false);
        VText vText = (VText) view.findViewById(g5c0.f100697G4);
        vText.setText(R$string.f46725He);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.yrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dialogC12611a.m71757O();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ho2] */
    /* JADX INFO: renamed from: A4 */
    public final void m137998A4(BLiveGuardboardRecord bLiveGuardboardRecord) {
        m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m206027E2().mo132155o0()).m73029r(m206027E2().m149814k()).m73030s(m206027E2().mo149813j().room.f44419id).m73028q(m206027E2().m132146l0().name).m73033v(bLiveGuardboardRecord.liveId).m73034w(bLiveGuardboardRecord.roomId).m73032u("guard-leader-boards").m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ mpw m137999B4(BLiveData bLiveData, BLiveData bLiveData2) {
        bLiveData.guardRecords = bLiveData2.guardRecords;
        return m138026r4(bLiveData);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m138000C4(e30 e30Var, mpw mpwVar) {
        ((zqs) this.f203250i).m219888J(mpwVar);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        if (mpwVar.f135102l) {
            m138010M4(mpwVar.f135103m, mpwVar.f135101k);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m138001D4(BLiveData bLiveData) {
        this.f114775r = bLiveData;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m138002E4(int i, e30 e30Var, Long l2) {
        long j = i;
        if (l2.longValue() < j) {
            e30Var.call(psk.m171164g(j, l2.longValue()));
        } else {
            m138007K4(null);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m138003G4(xzq xzqVar) {
        if (isShowing()) {
            return;
        }
        this.f188512e.f77095a.progress(R$string.f47464q, true);
        m138033y4(xzqVar);
        m138007K4(new e30() { // from class: l.ask
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71458a.m137983F4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m138004H4(xzq xzqVar) {
        this.f114772o = xzqVar.m212012b();
        m138015g4();
    }

    /* JADX INFO: renamed from: I4 */
    public void m138005I4() {
        if (m138032x4()) {
            m138006J4(this.f114770m.knightsRuleInfos.get(0).knightIntroduceUrl);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m138006J4(String str) {
        int iM219880A = ((zqs) this.viewModel).m219880A() + t100.m186890d(15.0f);
        if (iM219880A == 0) {
            iM219880A = (int) (((double) xdl0.m208408w0()) * 0.7d);
        }
        m129316v3(str, iM219880A, 8101);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K4 */
    public final void m138007K4(@Nullable e30<Boolean> e30Var) {
        LivingNormalApiProvider.m71437d5(m206027E2().mo149813j().anchor.f44419id, null);
        m138021m4(e30Var);
    }

    /* JADX INFO: renamed from: L4 */
    public void m138008L4(BLiveGuardType bLiveGuardType, String str, String str2) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106526B("liveGiftGuardClick").m106530u(m138018j4(bLiveGuardType), new C17614a(), m138019k4(bLiveGuardType), str, str2, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.guard))).m106529t());
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: M3 */
    public void mo138009M3() {
        super.mo138009M3();
        if (m206026D2() || this.f114772o || 3800 != this.f114769l || !NullChecker.m81303a(this.f114773p)) {
            return;
        }
        m138011N4(this.f114773p.f56011id);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m138010M4(final String str, final String str2) {
        final DialogC12611a dialogC12611a = new DialogC12611a(this, t6c0.f168342f5, j2g0.m139460g());
        dialogC12611a.m71776h0(new e30() { // from class: l.gsk
            @Override // p149l.e30
            public final void call(Object obj) {
                isk.m137993Y3(str2, str, dialogC12611a, (View) obj);
            }
        });
        dialogC12611a.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: N4 */
    public void m138011N4(String str) {
        String strMo96662j3 = NullChecker.m81303a(m206027E2().m132146l0()) ? mo96662j3() : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(8101).showShadow().userId(str).setSource("Guard").setFromIdentity(bqq.m103386a(this, strMo96662j3, str, 8101)).setTo(bqq.m103389d(this, strMo96662j3, str, 8101)).setScene("Guard").trackFrom("Guard").build());
    }

    /* JADX INFO: renamed from: d4 */
    public final f0t m138012d4(BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary) {
        f0t f0tVar = new f0t();
        f0tVar.f94001a = bLiveUserKnightInfoSummary;
        f0tVar.f94004d = this.f114770m.knightsRuleInfos.get(0);
        mqv<User> mqvVarM171162e = psk.m171162e(bLiveUserKnightInfoSummary, this.f114775r);
        f0tVar.f94002b = mqvVarM171162e;
        if (NullChecker.m81303a(mqvVarM171162e) && NullChecker.m81303a(mqvVarM171162e.m156005h())) {
            f0tVar.f94003c = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(f0tVar.f94002b.m156005h().hierarchy.grade);
        }
        return f0tVar;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m138013e4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM138030v4 = m138030v4(bLiveGuardType);
        return NullChecker.m81303a(bLiveUserKnightInfoSummaryM138030v4) && psk.m171170m((double) bLiveUserKnightInfoSummaryM138030v4.createdTime) > 24;
    }

    /* JADX INFO: renamed from: f4 */
    public void m138014f4() {
        m206028F2().KnightGuardEvent.closeDialog().mo172463j(new xzq(8101));
    }

    /* JADX INFO: renamed from: g4 */
    public void m138015g4() {
        if (NullChecker.m81303a(this.viewModel)) {
            ((zqs) this.viewModel).mo71727j();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: h4 */
    public String m138016h4() {
        String str = m206027E2().m132146l0().name;
        return str.length() > 7 ? str.substring(0, 7).concat("...") : str;
    }

    /* JADX INFO: renamed from: i4 */
    public long m138017i4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM138030v4 = m138030v4(bLiveGuardType);
        if (NullChecker.m81303a(bLiveUserKnightInfoSummaryM138030v4)) {
            return bLiveUserKnightInfoSummaryM138030v4.expireTime;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        return m206027E2().m132146l0().f56011id;
    }

    /* JADX INFO: renamed from: j4 */
    public String m138018j4(BLiveGuardType bLiveGuardType) {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM138023o4 = m138023o4(bLiveGuardType);
        return (m138032x4() && NullChecker.m81303a(bLiveKnightsRuleInfoItemM138023o4)) ? bLiveKnightsRuleInfoItemM138023o4.knightsContractGiftId : "530";
    }

    /* JADX INFO: renamed from: k4 */
    public int m138019k4(BLiveGuardType bLiveGuardType) {
        int iM138027s4 = m138027s4(bLiveGuardType);
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM138023o4 = m138023o4(bLiveGuardType);
        if (m138032x4() && iM138027s4 > 0 && NullChecker.m81303a(bLiveKnightsRuleInfoItemM138023o4)) {
            return (int) Math.ceil(((double) iM138027s4) / (((double) bLiveKnightsRuleInfoItemM138023o4.knightGiftCoins) * 1.0d));
        }
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public int m138020l4(BLiveGuardType bLiveGuardType) {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM138023o4 = m138023o4(bLiveGuardType);
        if (m138032x4() && NullChecker.m81303a(bLiveKnightsRuleInfoItemM138023o4)) {
            return bLiveKnightsRuleInfoItemM138023o4.knightGiftCoins;
        }
        return 50;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: m4 */
    public final void m138021m4(@Nullable final e30<Boolean> e30Var) {
        m218909J3(C22306c.combineLatest(LivingNormalApiProvider.m71373W4(m206027E2().mo149813j().anchor.f44419id, m206027E2().m149818o()), LivingNormalApiProvider.m71364V4(m206027E2().mo149813j().anchor.f44419id), new x9j() { // from class: l.bsk
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f77092a.m137999B4((BLiveData) obj, (BLiveData) obj2);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.csk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82358a.m138000C4(e30Var, (mpw) obj);
            }
        }, new e30() { // from class: l.dsk
            @Override // p149l.e30
            public final void call(Object obj) {
                isk.m137991W3(e30Var, (Throwable) obj);
            }
        }));
        if (m206027E2().mo97490p()) {
            m218909J3(LivingNormalApiProvider.m71355U4(m206027E2().mo149813j().anchor.f44419id, m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.esk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f93023a.m138001D4((BLiveData) obj);
                }
            }));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        C22392a<j760<Boolean, BLiveData>> c22392a;
        super.mo69117n();
        ggv ggvVar = (ggv) ypv.m215673l(fld0.f98148c);
        if (ggvVar == null || (c22392a = ggvVar.f102544e) == null) {
            return;
        }
        c22392a.m132487l(null);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public void m138022n4(final e30<String> e30Var) {
        int iM195920q4 = ypv.m215672k().m195920q4();
        if (iM195920q4 == 0) {
            return;
        }
        int i = iM195920q4 * 3600000;
        final int iM155944o = (i - (((int) (mqi0.m155944o() - mqi0.m155943n())) % i)) / 1000;
        e30Var.call(psk.m171164g(iM155944o, 0L));
        m218909J3(m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS).take(iM155944o))).subscribe(ffw.m121197h(new e30() { // from class: l.hsk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109327a.m138002E4(iM155944o, e30Var, (Long) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public final BLiveKnightsRuleInfoItem m138023o4(final BLiveGuardType bLiveGuardType) {
        return (BLiveKnightsRuleInfoItem) vwb.m200346r(this.f114770m.knightsRuleInfos, new w9j() { // from class: l.xrk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((BLiveKnightsRuleInfoItem) obj).guardType, bLiveGuardType));
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public List<f0t> m138024p4(BLiveGuardType bLiveGuardType) {
        ArrayList arrayList = new ArrayList();
        if (this.f114775r != null) {
            BLiveAnchorKnightInfos bLiveAnchorKnightInfosM221515e = ((ggv) ypv.m215673l(fld0.f98148c)).f102545f.m221515e();
            if (NullChecker.m81303a(bLiveAnchorKnightInfosM221515e)) {
                if (TEnum.equals(bLiveGuardType, BLiveGuardType.onlineGuard)) {
                    Iterator<BLiveUserKnightInfoSummary> it = bLiveAnchorKnightInfosM221515e.onlineKnights.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m138012d4(it.next()));
                    }
                } else {
                    Iterator<BLiveUserKnightInfoSummary> it2 = bLiveAnchorKnightInfosM221515e.potentialKnights.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(m138012d4(it2.next()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q4 */
    public long m138025q4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM138030v4 = m138030v4(bLiveGuardType);
        if (NullChecker.m81303a(bLiveUserKnightInfoSummaryM138030v4)) {
            return bLiveUserKnightInfoSummaryM138030v4.guardScoreIncrement;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final mpw m138026r4(BLiveData bLiveData) {
        this.f114770m = bLiveData;
        mpw mpwVar = new mpw();
        mpwVar.f135097g = m206032L2();
        mpwVar.f135091a = w8u.m202218u(R$string.f46923Qj, m138016h4());
        mpwVar.f135092b = m206027E2().m132146l0().m60124fp().url;
        if (!vwb.m200296J(bLiveData.guardAnchorRankInfos)) {
            BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo = bLiveData.guardAnchorRankInfos.get(0);
            mpwVar.f135093c = bLiveGuardAnchorRankInfo.currentRank;
            mpwVar.f135094d = bLiveGuardAnchorRankInfo.guardScore;
            mpwVar.f135095e = bLiveGuardAnchorRankInfo.gapGuardScore;
            mpwVar.f135100j = bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen;
            mpwVar.f135098h = new ArrayList();
            if (!vwb.m200296J(bLiveGuardAnchorRankInfo.topScoreRewardInfos)) {
                for (BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem : bLiveGuardAnchorRankInfo.topScoreRewardInfos) {
                    mpwVar.f135098h.add(new mpw.C18530c(bLiveKnightsPrivilegeItem.icon, bLiveKnightsPrivilegeItem.title));
                }
            }
            mpwVar.f135096f = psk.m171169l(this, bLiveData.knightsRuleInfos, bLiveGuardAnchorRankInfo);
        }
        if (!vwb.m200296J(bLiveData.knightsRuleInfos)) {
            mpwVar.f135103m = bLiveData.knightsRuleInfos.get(0).discountNotice;
            mpwVar.f135101k = bLiveData.knightsRuleInfos.get(0).guardPopupIcon;
            mpwVar.f135102l = bLiveData.knightsRuleInfos.get(0).showDiscount;
        }
        mpwVar.f135099i = bLiveData.guardRecords;
        return mpwVar;
    }

    /* JADX INFO: renamed from: s4 */
    public int m138027s4(final BLiveGuardType bLiveGuardType) {
        if (!m138032x4() || this.f114770m.userKnightInfosSummary.size() <= 0) {
            return 0;
        }
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM138023o4 = m138023o4(bLiveGuardType);
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = (BLiveUserKnightInfoSummary) vwb.m200346r(this.f114770m.userKnightInfosSummary, new w9j() { // from class: l.fsk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveGuardType, ((BLiveUserKnightInfoSummary) obj).guardType));
            }
        });
        if (NullChecker.m81303a(bLiveKnightsRuleInfoItemM138023o4) && NullChecker.m81303a(bLiveUserKnightInfoSummary)) {
            return bLiveKnightsRuleInfoItemM138023o4.knightCoins - bLiveUserKnightInfoSummary.sessionSendCoins;
        }
        return 0;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().KnightGuardEvent.openDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vrk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182731a.m138003G4((xzq) obj);
            }
        }));
        duringCreated(m206028F2().KnightGuardEvent.closeDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zrk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204525a.m138004H4((xzq) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public String m138028t4() {
        return this.f114768k;
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public zqs mo75679K3() {
        return new zqs();
    }

    @Nullable
    /* JADX INFO: renamed from: v4 */
    public final BLiveUserKnightInfoSummary m138030v4(final BLiveGuardType bLiveGuardType) {
        return (BLiveUserKnightInfoSummary) vwb.m200346r(this.f114770m.userKnightInfosSummary, new w9j() { // from class: l.wrk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveGuardType, ((BLiveUserKnightInfoSummary) obj).guardType));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: w4 */
    public void m138031w4(BLiveGuardboardRecord bLiveGuardboardRecord) {
        psk.m171177t(bLiveGuardboardRecord, mo77274R2());
        if (m206032L2()) {
            if (TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive")) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46799L0));
                return;
            } else {
                m138011N4(bLiveGuardboardRecord.userId);
                return;
            }
        }
        if (!TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive") || TextUtils.isEmpty(bLiveGuardboardRecord.liveId) || m206027E2().m149818o().equals(bLiveGuardboardRecord.roomId)) {
            m138011N4(bLiveGuardboardRecord.userId);
        } else {
            if (((Boolean) m129297F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            ((zqs) this.viewModel).mo71727j();
            m137998A4(bLiveGuardboardRecord);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m138032x4() {
        return NullChecker.m81303a(this.f114770m) && this.f114770m.knightsRuleInfos.size() > 0;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m138033y4(xzq xzqVar) {
        this.f114768k = xzqVar.m212014d();
        this.f114769l = xzqVar.m141171a();
        this.f114773p = xzqVar.m212013c();
        this.f114774q = xzqVar.m212015e();
        m218910L3();
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m138034z4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM138030v4 = m138030v4(bLiveGuardType);
        if (NullChecker.m81303a(bLiveUserKnightInfoSummaryM138030v4)) {
            return bLiveUserKnightInfoSummaryM138030v4.isKnight;
        }
        return false;
    }

    /* JADX INFO: renamed from: l.isk$a */
    public class C17614a implements zfv.C21687a.a {
        public C17614a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            isk.this.f114769l = 0;
            isk.this.m138014f4();
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
