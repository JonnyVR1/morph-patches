package p002l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hxs;
import l.jo0;
import l.lsi0;
import l.mqi0;
import l.mqv;
import l.t100;
import l.vwb;
import l.w14;
import l.w8u;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.ypv;
import rx.c;
import rx.subjects.a;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class isk extends zi2<ho2, zqs> {

    /* JADX INFO: renamed from: k */
    public String f13389k;

    /* JADX INFO: renamed from: l */
    public int f13390l;

    /* JADX INFO: renamed from: m */
    public BLiveData f13391m;

    /* JADX INFO: renamed from: n */
    public final String f13392n;

    /* JADX INFO: renamed from: o */
    public boolean f13393o;

    /* JADX INFO: renamed from: p */
    public User f13394p;

    /* JADX INFO: renamed from: q */
    public BLiveGuardType f13395q;

    /* JADX INFO: renamed from: r */
    public BLiveData f13396r;

    public isk(bsm bsmVar) {
        super(bsmVar);
        this.f13392n = "530";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m15321F4(Boolean bool) {
        this.f13393o = false;
        this.f22036e.f8332a.progressDismiss();
        if (bool.booleanValue()) {
            yzq.m27014c(m25552L2(), m25547E2(), this.f13389k, this.f13391m);
            m27395N3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m15329W3(e30 e30Var, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m15331Y3(String str, String str2, final C0200a c0200a, View view) {
        if (!TextUtils.isEmpty(str)) {
            hxs.s("context_single_room", view.findViewById(g5c0.f11055d2), str);
        }
        view.findViewById(g5c0.f11234w2).setText(str2);
        xdl0.M(view.findViewById(g5c0.f11073f0), false);
        VText vTextFindViewById = view.findViewById(g5c0.f10847G4);
        vTextFindViewById.setText(R$string.f2767He);
        vTextFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.yrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c0200a.m5125O();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ho2] */
    /* JADX INFO: renamed from: A4 */
    public final void m15336A4(BLiveGuardboardRecord bLiveGuardboardRecord) {
        m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(m25547E2().mo14591o0()).m6552r(m25547E2().m17235k()).m6553s(m25547E2().m17234j().room.id).m6551q(m25547E2().m14582l0().name).m6556v(bLiveGuardboardRecord.liveId).m6557w(bLiveGuardboardRecord.roomId).m6555u("guard-leader-boards").m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ mpw m15337B4(BLiveData bLiveData, BLiveData bLiveData2) {
        bLiveData.guardRecords = bLiveData2.guardRecords;
        return m15365r4(bLiveData);
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m15338C4(e30 e30Var, mpw mpwVar) {
        ((zqs) this.f23436i).m27516J(mpwVar);
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        if (mpwVar.f15530l) {
            m15349M4(mpwVar.f15531m, mpwVar.f15529k);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m15339D4(BLiveData bLiveData) {
        this.f13396r = bLiveData;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m15340E4(int i, e30 e30Var, Long l2) {
        long j = i;
        if (l2.longValue() < j) {
            e30Var.call(psk.m20660g(j, l2.longValue()));
        } else {
            m15346K4(null);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m15341G4(xzq xzqVar) {
        if (isShowing()) {
            return;
        }
        this.f22036e.f8332a.progress(R$string.f3506q, true);
        m15373y4(xzqVar);
        m15346K4(new e30() { // from class: l.ask
            public final void call(Object obj) {
                this.f7876a.m15321F4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m15342H4(xzq xzqVar) {
        this.f13393o = xzqVar.m26280b();
        m15354g4();
    }

    /* JADX INFO: renamed from: I4 */
    public void m15343I4() {
        if (m15372x4()) {
            m15344J4(((BLiveKnightsRuleInfoItem) this.f13391m.knightsRuleInfos.get(0)).knightIntroduceUrl);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m15344J4(String str) {
        int iM27508A = ((zqs) ((bwr) this).viewModel).m27508A() + t100.d(15.0f);
        if (iM27508A == 0) {
            iM27508A = (int) (((double) xdl0.w0()) * 0.7d);
        }
        m14203v3(str, iM27508A, 8101);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K4 */
    public final void m15346K4(@Nullable e30<Boolean> e30Var) {
        LivingNormalApiProvider.m4803d5(m25547E2().m17234j().anchor.id, null);
        m15360m4(e30Var);
    }

    /* JADX INFO: renamed from: L4 */
    public void m15347L4(BLiveGuardType bLiveGuardType, String str, String str2) {
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10979B("liveGiftGuardClick").m10983u(m15357j4(bLiveGuardType), new C0620a(), m15358k4(bLiveGuardType), str, str2, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("guard"))).m10982t());
    }

    @Override // p002l.zi2
    /* JADX INFO: renamed from: M3 */
    public void mo15348M3() {
        super.mo15348M3();
        if (m25546D2() || this.f13393o || 3800 != this.f13390l || !NullChecker.a(this.f13394p)) {
            return;
        }
        m15350N4(((DbObject) this.f13394p).id);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m15349M4(final String str, final String str2) {
        final C0200a c0200a = new C0200a(this, t6c0.f19838f5, j2g0.m15581g());
        c0200a.m5144h0(new e30() { // from class: l.gsk
            public final void call(Object obj) {
                isk.m15331Y3(str2, str, c0200a, (View) obj);
            }
        });
        c0200a.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: N4 */
    public void m15350N4(String str) {
        String strMo9759j3 = NullChecker.a(m25547E2().m14582l0()) ? mo9759j3() : "";
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(8101).showShadow().userId(str).setSource("Guard").setFromIdentity(bqq.m10554a(this, strMo9759j3, str, 8101)).setTo(bqq.m10557d(this, strMo9759j3, str, 8101)).setScene("Guard").trackFrom("Guard").build());
    }

    /* JADX INFO: renamed from: d4 */
    public final f0t m15351d4(BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary) {
        f0t f0tVar = new f0t();
        f0tVar.f10080a = bLiveUserKnightInfoSummary;
        f0tVar.f10083d = (BLiveKnightsRuleInfoItem) this.f13391m.knightsRuleInfos.get(0);
        mqv<User> mqvVarM20658e = psk.m20658e(bLiveUserKnightInfoSummary, this.f13396r);
        f0tVar.f10081b = mqvVarM20658e;
        if (NullChecker.a(mqvVarM20658e) && NullChecker.a(mqvVarM20658e.h())) {
            f0tVar.f10082c = ((ggv) ypv.l(fld0.c)).v(f0tVar.f10081b.h().hierarchy.grade);
        }
        return f0tVar;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m15352e4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM15370v4 = m15370v4(bLiveGuardType);
        return NullChecker.a(bLiveUserKnightInfoSummaryM15370v4) && psk.m20666m((double) bLiveUserKnightInfoSummaryM15370v4.createdTime) > 24;
    }

    /* JADX INFO: renamed from: f4 */
    public void m15353f4() {
        m25548F2().KnightGuardEvent.closeDialog().j(new xzq(8101));
    }

    /* JADX INFO: renamed from: g4 */
    public void m15354g4() {
        if (NullChecker.a(((bwr) this).viewModel)) {
            ((zqs) ((bwr) this).viewModel).mo5095j();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: h4 */
    public String m15355h4() {
        String str = m25547E2().m14582l0().name;
        return str.length() > 7 ? str.substring(0, 7).concat("...") : str;
    }

    /* JADX INFO: renamed from: i4 */
    public long m15356i4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM15370v4 = m15370v4(bLiveGuardType);
        if (NullChecker.a(bLiveUserKnightInfoSummaryM15370v4)) {
            return bLiveUserKnightInfoSummaryM15370v4.expireTime;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p002l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo9759j3() {
        return ((DbObject) m25547E2().m14582l0()).id;
    }

    /* JADX INFO: renamed from: j4 */
    public String m15357j4(BLiveGuardType bLiveGuardType) {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM15362o4 = m15362o4(bLiveGuardType);
        return (m15372x4() && NullChecker.a(bLiveKnightsRuleInfoItemM15362o4)) ? bLiveKnightsRuleInfoItemM15362o4.knightsContractGiftId : "530";
    }

    /* JADX INFO: renamed from: k4 */
    public int m15358k4(BLiveGuardType bLiveGuardType) {
        int iM15366s4 = m15366s4(bLiveGuardType);
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM15362o4 = m15362o4(bLiveGuardType);
        if (m15372x4() && iM15366s4 > 0 && NullChecker.a(bLiveKnightsRuleInfoItemM15362o4)) {
            return (int) Math.ceil(((double) iM15366s4) / (((double) bLiveKnightsRuleInfoItemM15362o4.knightGiftCoins) * 1.0d));
        }
        return 0;
    }

    /* JADX INFO: renamed from: l4 */
    public int m15359l4(BLiveGuardType bLiveGuardType) {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM15362o4 = m15362o4(bLiveGuardType);
        if (m15372x4() && NullChecker.a(bLiveKnightsRuleInfoItemM15362o4)) {
            return bLiveKnightsRuleInfoItemM15362o4.knightGiftCoins;
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
    public final void m15360m4(@Nullable final e30<Boolean> e30Var) {
        m27393J3(c.combineLatest(LivingNormalApiProvider.m4739W4(m25547E2().m17234j().anchor.id, m25547E2().m17239o()), LivingNormalApiProvider.m4730V4(m25547E2().m17234j().anchor.id), new x9j() { // from class: l.bsk
            public final Object call(Object obj, Object obj2) {
                return this.f8331a.m15337B4((BLiveData) obj, (BLiveData) obj2);
            }
        })).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.csk
            public final void call(Object obj) {
                this.f8931a.m15338C4(e30Var, (mpw) obj);
            }
        }, new e30() { // from class: l.dsk
            public final void call(Object obj) {
                isk.m15329W3(e30Var, (Throwable) obj);
            }
        }));
        if (m25547E2().mo9893p()) {
            m27393J3(LivingNormalApiProvider.m4721U4(m25547E2().m17234j().anchor.id, m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.esk
                public final void call(Object obj) {
                    this.f9958a.m15339D4((BLiveData) obj);
                }
            }));
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        a aVar;
        super.mo5949n();
        ggv ggvVar = (ggv) ypv.l(fld0.c);
        if (ggvVar == null || (aVar = ggvVar.e) == null) {
            return;
        }
        aVar.onNext((Object) null);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public void m15361n4(final e30<String> e30Var) {
        int iQ4 = ypv.k().q4();
        if (iQ4 == 0) {
            return;
        }
        int i = iQ4 * 3600000;
        final int iO = (i - (((int) (mqi0.o() - mqi0.n())) % i)) / 1000;
        e30Var.call(psk.m20660g(iO, 0L));
        m27393J3(m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS).take(iO))).subscribe(ffw.h(new e30() { // from class: l.hsk
            public final void call(Object obj) {
                this.f12261a.m15340E4(iO, e30Var, (Long) obj);
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public final BLiveKnightsRuleInfoItem m15362o4(final BLiveGuardType bLiveGuardType) {
        return (BLiveKnightsRuleInfoItem) vwb.r(this.f13391m.knightsRuleInfos, new w9j() { // from class: l.xrk
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(((BLiveKnightsRuleInfoItem) obj).guardType, bLiveGuardType));
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public List<f0t> m15363p4(BLiveGuardType bLiveGuardType) {
        ArrayList arrayList = new ArrayList();
        if (this.f13396r != null) {
            BLiveAnchorKnightInfos bLiveAnchorKnightInfos = (BLiveAnchorKnightInfos) ((ggv) ypv.l(fld0.c)).f.e();
            if (NullChecker.a(bLiveAnchorKnightInfos)) {
                if (TEnum.equals(bLiveGuardType, "onlineGuard")) {
                    Iterator it = bLiveAnchorKnightInfos.onlineKnights.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m15351d4((BLiveUserKnightInfoSummary) it.next()));
                    }
                } else {
                    Iterator it2 = bLiveAnchorKnightInfos.potentialKnights.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(m15351d4((BLiveUserKnightInfoSummary) it2.next()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q4 */
    public long m15364q4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM15370v4 = m15370v4(bLiveGuardType);
        if (NullChecker.a(bLiveUserKnightInfoSummaryM15370v4)) {
            return bLiveUserKnightInfoSummaryM15370v4.guardScoreIncrement;
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final mpw m15365r4(BLiveData bLiveData) {
        this.f13391m = bLiveData;
        mpw mpwVar = new mpw();
        mpwVar.f15525g = m25552L2();
        mpwVar.f15519a = w8u.u(R$string.f2965Qj, m15355h4());
        mpwVar.f15520b = ((Media) m25547E2().m14582l0().fp()).url;
        if (!vwb.J(bLiveData.guardAnchorRankInfos)) {
            BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo = (BLiveGuardAnchorRankInfo) bLiveData.guardAnchorRankInfos.get(0);
            mpwVar.f15521c = bLiveGuardAnchorRankInfo.currentRank;
            mpwVar.f15522d = bLiveGuardAnchorRankInfo.guardScore;
            mpwVar.f15523e = bLiveGuardAnchorRankInfo.gapGuardScore;
            mpwVar.f15528j = bLiveGuardAnchorRankInfo.topScoreRewardInfosOpen;
            mpwVar.f15526h = new ArrayList();
            if (!vwb.J(bLiveGuardAnchorRankInfo.topScoreRewardInfos)) {
                for (BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem : bLiveGuardAnchorRankInfo.topScoreRewardInfos) {
                    mpwVar.f15526h.add(new mpw.C0683c(bLiveKnightsPrivilegeItem.icon, bLiveKnightsPrivilegeItem.title));
                }
            }
            mpwVar.f15524f = psk.m20665l(this, bLiveData.knightsRuleInfos, bLiveGuardAnchorRankInfo);
        }
        if (!vwb.J(bLiveData.knightsRuleInfos)) {
            mpwVar.f15531m = ((BLiveKnightsRuleInfoItem) bLiveData.knightsRuleInfos.get(0)).discountNotice;
            mpwVar.f15529k = ((BLiveKnightsRuleInfoItem) bLiveData.knightsRuleInfos.get(0)).guardPopupIcon;
            mpwVar.f15530l = ((BLiveKnightsRuleInfoItem) bLiveData.knightsRuleInfos.get(0)).showDiscount;
        }
        mpwVar.f15527i = bLiveData.guardRecords;
        return mpwVar;
    }

    /* JADX INFO: renamed from: s4 */
    public int m15366s4(final BLiveGuardType bLiveGuardType) {
        if (!m15372x4() || this.f13391m.userKnightInfosSummary.size() <= 0) {
            return 0;
        }
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItemM15362o4 = m15362o4(bLiveGuardType);
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary = (BLiveUserKnightInfoSummary) vwb.r(this.f13391m.userKnightInfosSummary, new w9j() { // from class: l.fsk
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveGuardType, ((BLiveUserKnightInfoSummary) obj).guardType));
            }
        });
        if (NullChecker.a(bLiveKnightsRuleInfoItemM15362o4) && NullChecker.a(bLiveUserKnightInfoSummary)) {
            return bLiveKnightsRuleInfoItemM15362o4.knightCoins - bLiveUserKnightInfoSummary.sessionSendCoins;
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public void m15367t() {
        super.t();
        duringCreated((c) m25548F2().KnightGuardEvent.openDialog().g()).subscribe(ffw.d(new e30() { // from class: l.vrk
            public final void call(Object obj) {
                this.f21279a.m15341G4((xzq) obj);
            }
        }));
        duringCreated((c) m25548F2().KnightGuardEvent.closeDialog().g()).subscribe(ffw.d(new e30() { // from class: l.zrk
            public final void call(Object obj) {
                this.f23574a.m15342H4((xzq) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public String m15368t4() {
        return this.f13389k;
    }

    @Override // p002l.zi2
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public zqs mo15345K3() {
        return new zqs();
    }

    @Nullable
    /* JADX INFO: renamed from: v4 */
    public final BLiveUserKnightInfoSummary m15370v4(final BLiveGuardType bLiveGuardType) {
        return (BLiveUserKnightInfoSummary) vwb.r(this.f13391m.userKnightInfosSummary, new w9j() { // from class: l.wrk
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(bLiveGuardType, ((BLiveUserKnightInfoSummary) obj).guardType));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: w4 */
    public void m15371w4(BLiveGuardboardRecord bLiveGuardboardRecord) {
        psk.m20673t(bLiveGuardboardRecord, mo21430R2());
        if (m25552L2()) {
            if (TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive")) {
                lsi0.y(ypv.e.getString(R$string.f2841L0));
                return;
            } else {
                m15350N4(bLiveGuardboardRecord.userId);
                return;
            }
        }
        if (!TEnum.equals(bLiveGuardboardRecord.liveStates, "onlive") || TextUtils.isEmpty(bLiveGuardboardRecord.liveId) || m25547E2().m17239o().equals(bLiveGuardboardRecord.roomId)) {
            m15350N4(bLiveGuardboardRecord.userId);
        } else {
            if (((Boolean) m14184F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            ((zqs) ((bwr) this).viewModel).mo5095j();
            m15336A4(bLiveGuardboardRecord);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m15372x4() {
        return NullChecker.a(this.f13391m) && this.f13391m.knightsRuleInfos.size() > 0;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m15373y4(xzq xzqVar) {
        this.f13389k = xzqVar.m26282d();
        this.f13390l = xzqVar.m15878a();
        this.f13394p = xzqVar.m26281c();
        this.f13395q = xzqVar.m26283e();
        m27394L3();
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m15374z4(BLiveGuardType bLiveGuardType) {
        BLiveUserKnightInfoSummary bLiveUserKnightInfoSummaryM15370v4 = m15370v4(bLiveGuardType);
        if (NullChecker.a(bLiveUserKnightInfoSummaryM15370v4)) {
            return bLiveUserKnightInfoSummaryM15370v4.isKnight;
        }
        return false;
    }

    /* JADX INFO: renamed from: l.isk$a */
    public class C0620a implements zfv.C0940a.a {
        public C0620a() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            isk.this.f13390l = 0;
            isk.this.m15353f4();
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
        }
    }
}
