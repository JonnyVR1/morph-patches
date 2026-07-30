package p002l;

import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import l.bgv;
import l.bn70;
import l.dfe0;
import l.dm70;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hk10;
import l.idv;
import l.ik10;
import l.l610;
import l.lsi0;
import l.om70;
import l.osi0;
import l.r610;
import l.tyj;
import l.vwb;
import l.w8u;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mge0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public long f15381i;

    public mge0(bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: V3 */
    private void m17919V3(BLiveGivenGiftBrief bLiveGivenGiftBrief, pge0 pge0Var, qge0 qge0Var) {
        dfe0 dfe0Var = new dfe0(ypv.a.D0(), m25547E2().m17239o());
        mnj mnjVar = pge0Var.f17288m;
        if (mnjVar != null) {
            if (pge0Var.m20252m()) {
                dfe0Var.e(yfc0.m26676a(pge0Var));
                dfe0Var.f(yfc0.m26677b(pge0Var));
            } else {
                dfe0Var.e(qge0Var.m21255a(pge0Var));
                dfe0Var.f(qge0Var.m21256b(pge0Var));
            }
            bLiveGivenGiftBrief.briefType = mnjVar.m18090b();
        } else {
            User userM14582l0 = m25547E2().m14582l0();
            if (userM14582l0 != null && !TextUtils.isEmpty(((DbObject) userM14582l0).id)) {
                dfe0Var.e(((DbObject) userM14582l0).id);
                dfe0Var.f(userM14582l0.name);
                bLiveGivenGiftBrief.briefType = "extra_type_normal";
            }
        }
        bLiveGivenGiftBrief.tray = qge0Var.getResult().givenGiftBrief.tray;
        bLiveGivenGiftBrief.drawParam = pge0Var.f17298w;
        bLiveGivenGiftBrief.sendGiftExtraInfo = dfe0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    private void m17920W3(pge0 pge0Var) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM25674S2;
        gnj gnjVar;
        pge0Var.f17277b = m25547E2().m17238n().id;
        pge0Var.f17276a = m25547E2().m17234j().id;
        pge0Var.f17278c = ((DbObject) m25547E2().m14582l0()).id;
        pge0Var.f17282g = (String) m14184F3(new dm70(701));
        pge0Var.f17283h = (String) m14184F3(new hk10(701));
        String strM20247h = pge0Var.m20247h();
        if (!TextUtils.isEmpty(pge0Var.f17283h) && !TextUtils.isEmpty(strM20247h)) {
            BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRoleNew_ = BLiveGiftExtraMultiPkReceiveGiftRole.new_();
            pge0Var.f17284i = bLiveGiftExtraMultiPkReceiveGiftRoleNew_;
            bLiveGiftExtraMultiPkReceiveGiftRoleNew_.userId = strM20247h;
            Boolean bool = (Boolean) m14184F3(new ik10(701).e(strM20247h));
            pge0Var.f17284i.role = bool.booleanValue() ? "player" : "spectator";
        }
        if (TextUtils.isEmpty(pge0Var.f17289n) && (gnjVar = (gnj) m14184F3(new mpj(701))) != null) {
            pge0Var.f17289n = gnjVar.m13975b();
            pge0Var.f17288m = gnjVar.m13974a();
        }
        if ((m25547E2() instanceof x350) && (bLiveOfficialShowCurrentAnchorInfoM25674S2 = ((x350) m25547E2()).m25674S2()) != null) {
            pge0Var.f17276a = bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorLiveId;
            pge0Var.f17277b = bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorRoomId;
            pge0Var.f17278c = bLiveOfficialShowCurrentAnchorInfoM25674S2.anchorId;
            BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfoNew_ = BLiveGiftOfficialShowExtraInfo.new_();
            bLiveGiftOfficialShowExtraInfoNew_.anchorId = m25547E2().m14576j0();
            bLiveGiftOfficialShowExtraInfoNew_.roomId = m25547E2().m17239o();
            bLiveGiftOfficialShowExtraInfoNew_.liveId = m25547E2().m17235k();
            bLiveGiftOfficialShowExtraInfoNew_.programId = bLiveOfficialShowCurrentAnchorInfoM25674S2.programId;
            pge0Var.f17275O = bLiveGiftOfficialShowExtraInfoNew_;
        }
        if (r610.N(this)) {
            q44 q44VarM18092d = NullChecker.a(pge0Var.f17288m) ? pge0Var.f17288m.m18092d() : null;
            if (q44VarM18092d == null) {
                q44VarM18092d = l610.f(this);
            }
            if (NullChecker.a(q44VarM18092d)) {
                pge0Var.f17299x = l610.b((ho2) m25547E2(), q44VarM18092d);
            }
        }
        pge0Var.m20257r(m25547E2().m17234j().liveMode);
    }

    /* JADX INFO: renamed from: Z3 */
    private void m17921Z3(final pge0 pge0Var) {
        if (!((bgv) ypv.l(fld0.f)).a() || !pge0Var.f17264D || pge0Var.f17280e == null || pge0Var.m20248i()) {
            m17933Y3(pge0Var);
        } else {
            m25548F2().GiftDialogEventGroup.showSendFirstGiftDlg().j(new kze0().m16896e(new e30() { // from class: l.xfe0
                public final void call(Object obj) {
                    this.f22257a.m17936h4(pge0Var, (Boolean) obj);
                }
            }).m16895d(new e30() { // from class: l.zfe0
                public final void call(Object obj) {
                    pge0Var.f17294s.call(1);
                }
            }).m16897f((long) r1e.m21717d(pge0Var.f17280e, pge0Var.f17281f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[FALL_THROUGH] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m17941m4(p002l.pge0 r5, java.lang.Throwable r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002l.mge0.m17941m4(l.pge0, java.lang.Throwable):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v42, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    private void m17923c4(pge0 pge0Var, qge0 qge0Var) {
        User userI = ((idv) ypv.l(fld0.b)).i(ypv.a.D0());
        if (userI == null) {
            userI = ypv.a.V();
        }
        BLiveGivenGiftBrief bLiveGivenGiftBrief = qge0Var.getResult().givenGiftBrief;
        bLiveGivenGiftBrief.fpUrl = ((Media) userI.fp()).url;
        bLiveGivenGiftBrief.userName = userI.name;
        bLiveGivenGiftBrief.isFirstGivenGift = qge0Var.getResult().givenGiftBrief.isFirstGivenGift;
        bLiveGivenGiftBrief.liveUserMask = qge0Var.getResult().mask;
        bLiveGivenGiftBrief.hasVoiceMode = m25547E2().m14539W0();
        if (!TextUtils.isEmpty(qge0Var.getResult().tradeNo)) {
            bLiveGivenGiftBrief.tradeNo = qge0Var.getResult().tradeNo;
        }
        if (!TextUtils.isEmpty(qge0Var.getResult().effectExt)) {
            bLiveGivenGiftBrief.effectExt = qge0Var.getResult().effectExt;
        }
        if (NullChecker.a(qge0Var.getResult().multiCall)) {
            bLiveGivenGiftBrief.multiCall = qge0Var.getResult().multiCall;
        }
        if (NullChecker.a(qge0Var.getResult().guildCall)) {
            bLiveGivenGiftBrief.guildCall = qge0Var.getResult().guildCall;
        }
        if (NullChecker.a(qge0Var.getResult().givenGiftBrief)) {
            bLiveGivenGiftBrief.avatarTag = qge0Var.getResult().givenGiftBrief.avatarTag;
        }
        if (NullChecker.a(qge0Var.getResult().givenGiftBrief)) {
            bLiveGivenGiftBrief.giftBottomTag = qge0Var.getResult().givenGiftBrief.giftBottomTag;
        }
        if (NullChecker.a(qge0Var.getResult().previewMask)) {
            bLiveGivenGiftBrief.previewUserMask = qge0Var.getResult().previewMask;
        }
        if (NullChecker.a(qge0Var.getResult().senderShowMask)) {
            bLiveGivenGiftBrief.senderShowMask = qge0Var.getResult().senderShowMask;
        }
        if (NullChecker.a(qge0Var.getResult().receiverShowMask)) {
            bLiveGivenGiftBrief.receiverShowMask = qge0Var.getResult().receiverShowMask;
        }
        m17919V3(bLiveGivenGiftBrief, pge0Var, qge0Var);
        nqe.m18967v(bLiveGivenGiftBrief, pge0Var.f17280e, m25547E2(), m25552L2());
        m25547E2().m14498E1(bLiveGivenGiftBrief);
        m25547E2().m14494C1(Long.valueOf(qge0Var.m21257c()));
        pge0Var.f17292q.call(bLiveGivenGiftBrief);
        if (bLiveGivenGiftBrief.isDailyPaymentExceeded) {
            m25548F2().ConsumeAlertEvent.showConsumeAlertDialog().p();
        }
        if (NullChecker.a(pge0Var.f17280e)) {
            m17934b4(pge0Var.f17280e);
            wrj.m25409i0(pge0Var.f17280e, qge0Var.getResult().givenGiftBrief);
        }
        m17927n4(pge0Var, qge0Var);
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m17924d4(pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem = pge0Var.f17280e;
        if (bLiveGiftItem == null) {
            lsi0.r("警告⚠️，礼物对象为空，请检查");
            return false;
        }
        long jM21717d = (long) r1e.m21717d(bLiveGiftItem, pge0Var.f17281f);
        boolean zM20251l = pge0Var.m20251l();
        long j = this.f15381i;
        if (zM20251l) {
            return j >= (bLiveGiftItem.getPrice() * ((long) pge0Var.f17281f)) * ((long) pge0Var.m20244e().size());
        }
        return j >= jM21717d || bLiveGiftItem.isPacketGift();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m17925e4(Long l2) {
        this.f15381i = l2.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m17926f4(cfe0 cfe0Var) {
        m17942q4(cfe0Var.f8625a);
    }

    /* JADX INFO: renamed from: n4 */
    private void m17927n4(pge0 pge0Var, qge0 qge0Var) {
        if (pge0Var.f17280e != null) {
            m25548F2().SendGiftEventGroup.sendGiftSuccess().j(new rge0(pge0Var, qge0Var));
        }
    }

    /* JADX INFO: renamed from: o4 */
    private void m17928o4(pge0 pge0Var) {
        String str;
        if (TextUtils.equals(pge0Var.f17289n, "source_voice_ktv_quick_gift")) {
            str = "e_audio_ktv_panel";
        } else if (TextUtils.equals(pge0Var.f17289n, "source_voice_gift_guide")) {
            str = "e_audio_pay_guide";
        } else if (pge0Var.f17291p) {
            str = "liveFastGiftClick";
        } else {
            str = ("liveGiftSuitClick".equals(pge0Var.f17261A) || "liveGiftGuardClick".equals(pge0Var.f17261A)) ? pge0Var.f17261A : "liveGiftBarGiftClick";
        }
        m25548F2().GiftDialogEventGroup.openGoWallet().j(new ip50().m15280d(true).m15281e(pge0Var).m15282f(str));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: p4 */
    private void m17929p4(pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem = pge0Var.f17280e;
        if (bLiveGiftItem == null || m17932X3(bLiveGiftItem)) {
            return;
        }
        wrj.m25407h0(pge0Var.f17280e);
        pge0Var.m20258s(new gvj(m25547E2().mo14591o0()));
        r1e.m21716a(pge0Var);
        pge0Var.m20261v(m25547E2().m14517O0());
        if (pge0Var.m20251l()) {
            m17943r4(pge0Var);
        } else {
            m17930s4(pge0Var);
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m17930s4(final pge0 pge0Var) {
        duringCreated(zfv.m27298q1(pge0Var)).subscribe(ffw.e(new e30() { // from class: l.bge0
            public final void call(Object obj) {
                this.f8117a.m17940l4(pge0Var, (BLiveData) obj);
            }
        }, new e30() { // from class: l.dge0
            public final void call(Object obj) {
                this.f9218a.m17941m4(pge0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m17931T() {
        super.T();
        duringCreated(m25547E2().m14602t1()).subscribe(ffw.d(new e30() { // from class: l.sfe0
            public final void call(Object obj) {
                this.f18988a.m17925e4((Long) obj);
            }
        }));
        m14191h3(m25548F2().SendGiftEventGroup.sendGift(), new e30() { // from class: l.vfe0
            public final void call(Object obj) {
                this.f21103a.m17926f4((cfe0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m17932X3(BLiveGiftItem bLiveGiftItem) {
        Context context = m25549H2().getContext();
        if (context == null) {
            return true;
        }
        boolean zBooleanValue = ((Boolean) m14184F3(new bn70(700))).booleanValue();
        String str = (String) m14184F3(new om70(700));
        if (zBooleanValue || !TextUtils.equals(String.valueOf(bLiveGiftItem.id), str)) {
            return false;
        }
        lsi0.B(context.getResources().getString(R$string.f3671xa), false, true);
        return true;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m17933Y3(final pge0 pge0Var) {
        if (!((bgv) ypv.l(fld0.f)).b() || !pge0Var.f17280e.isPaidGift() || !pge0Var.f17263C || pge0Var.m20248i()) {
            m17929p4(pge0Var);
            return;
        }
        long jM21717d = (long) r1e.m21717d(pge0Var.f17280e, pge0Var.f17281f);
        if (!vwb.J(pge0Var.m20244e())) {
            jM21717d *= (long) pge0Var.m20244e().size();
        }
        m25548F2().GiftDialogEventGroup.showSendFirstGiftDlg().j(new kze0().m16896e(new e30() { // from class: l.fge0
            public final void call(Object obj) {
                this.f10334a.m17935g4(pge0Var, (Boolean) obj);
            }
        }).m16895d(new e30() { // from class: l.hge0
            public final void call(Object obj) {
                pge0Var.f17294s.call(1);
            }
        }).m16897f(jM21717d));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m17934b4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            return;
        }
        m25548F2().BottomEvent.hideFastGiftPrice().p();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m17935g4(pge0 pge0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((bgv) ypv.l(fld0.f)).w(Boolean.FALSE);
        }
        m17929p4(pge0Var);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m17936h4(pge0 pge0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((bgv) ypv.l(fld0.f)).u(Boolean.FALSE);
        }
        m17929p4(pge0Var);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m17938j4(String str, pge0 pge0Var, BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem) {
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveSendLiveMultiGiftResultItem.givenGiftRes;
        bLiveSendLiveGiftResult.givenGiftBrief.sendGiftBatchOriginalId = str;
        qge0 qge0Var = new qge0(bLiveSendLiveGiftResult);
        qge0Var.m21260f(bLiveSendLiveMultiGiftResultItem);
        m17923c4(pge0Var, qge0Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m17939k4(final pge0 pge0Var, List list) {
        final String string = UUID.randomUUID().toString();
        vwb.z(list, new e30() { // from class: l.ufe0
            public final void call(Object obj) {
                this.f20611a.m17938j4(string, pge0Var, (BLiveSendLiveMultiGiftResultItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m17940l4(pge0 pge0Var, BLiveData bLiveData) {
        m17923c4(pge0Var, new qge0(bLiveData.givenGiftRes));
    }

    /* JADX INFO: renamed from: q4 */
    public void m17942q4(pge0 pge0Var) {
        if ((TextUtils.equals(pge0Var.f17289n, "voiceLiveMain") || TextUtils.equals(pge0Var.f17289n, "voiceLiveVice")) && pge0Var.f17280e != null && vwb.J((Collection) m14184F3(new qee0(700)))) {
            osi0.g(w8u.t(R$string.f2730G));
            return;
        }
        if (pge0Var.f17280e == null && TextUtils.isEmpty(pge0Var.f17279d)) {
            return;
        }
        if (pge0Var.f17280e == null) {
            pge0Var.f17280e = ((ggv) ypv.l(fld0.c)).m(pge0Var.f17279d);
            wrj.m25389X(pge0Var.f17279d);
            if (pge0Var.f17280e == null) {
                e30<Throwable> e30Var = pge0Var.f17293r;
                if (e30Var != null) {
                    e30Var.call(new Throwable("can't find gift item by id"));
                }
                wrj.m25390Y(pge0Var.f17279d);
                return;
            }
            if (!TextUtils.isEmpty(pge0Var.f17274N)) {
                String str = pge0Var.f17274N;
                tyj.d(str, str, pge0Var.f17280e.id + "", pge0Var.f17280e.getPrice() + "", pge0Var.f17280e.giftType, pge0Var.f17290o, m17924d4(pge0Var));
            }
            axj.m10094h(pge0Var.f17280e, pge0Var.f17296u, pge0Var.f17295t, ((Boolean) m14184F3(new hnj(701).m14469e(pge0Var.f17280e.getPrice()))).booleanValue(), mo21430R2(), 1, (String) m14184F3(new iuj(701)));
        }
        m17920W3(pge0Var);
        if (m17924d4(pge0Var)) {
            m17921Z3(pge0Var);
        } else {
            m17928o4(pge0Var);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m17943r4(final pge0 pge0Var) {
        duringCreated(zfv.m27301r1(pge0Var)).subscribe(ffw.e(new e30() { // from class: l.jge0
            public final void call(Object obj) {
                this.f13763a.m17939k4(pge0Var, (List) obj);
            }
        }, new e30() { // from class: l.lge0
            public final void call(Object obj) {
                this.f14852a.m17937i4(pge0Var, (Throwable) obj);
            }
        }));
    }
}
