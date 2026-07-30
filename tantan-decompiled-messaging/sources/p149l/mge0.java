package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class mge0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public long f133676i;

    public mge0(bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: V3 */
    private void m154514V3(BLiveGivenGiftBrief bLiveGivenGiftBrief, pge0 pge0Var, qge0 qge0Var) {
        dfe0 dfe0Var = new dfe0(ypv.f199493a.m199309D0(), m206027E2().m149818o());
        mnj mnjVar = pge0Var.f148664m;
        if (mnjVar != null) {
            if (pge0Var.m168687m()) {
                dfe0Var.m111449e(yfc0.m214549a(pge0Var));
                dfe0Var.m111450f(yfc0.m214550b(pge0Var));
            } else {
                dfe0Var.m111449e(qge0Var.m174406a(pge0Var));
                dfe0Var.m111450f(qge0Var.m174407b(pge0Var));
            }
            bLiveGivenGiftBrief.briefType = mnjVar.m155513b();
        } else {
            User userM132146l0 = m206027E2().m132146l0();
            if (userM132146l0 != null && !TextUtils.isEmpty(userM132146l0.f56011id)) {
                dfe0Var.m111449e(userM132146l0.f56011id);
                dfe0Var.m111450f(userM132146l0.name);
                bLiveGivenGiftBrief.briefType = "extra_type_normal";
            }
        }
        bLiveGivenGiftBrief.tray = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.tray;
        bLiveGivenGiftBrief.drawParam = pge0Var.f148674w;
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
    private void m154515W3(pge0 pge0Var) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM206897S2;
        gnj gnjVar;
        pge0Var.f148653b = m206027E2().mo149817n().f44324id;
        pge0Var.f148652a = m206027E2().mo149813j().f44323id;
        pge0Var.f148654c = m206027E2().m132146l0().f56011id;
        pge0Var.f148658g = (String) m129297F3(new dm70(701));
        pge0Var.f148659h = (String) m129297F3(new hk10(701));
        String strM168682h = pge0Var.m168682h();
        if (!TextUtils.isEmpty(pge0Var.f148659h) && !TextUtils.isEmpty(strM168682h)) {
            BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRoleNew_ = BLiveGiftExtraMultiPkReceiveGiftRole.new_();
            pge0Var.f148660i = bLiveGiftExtraMultiPkReceiveGiftRoleNew_;
            bLiveGiftExtraMultiPkReceiveGiftRoleNew_.userId = strM168682h;
            Boolean bool = (Boolean) m129297F3(new ik10(701).m136756e(strM168682h));
            pge0Var.f148660i.role = bool.booleanValue() ? GameIdentity.player : "spectator";
        }
        if (TextUtils.isEmpty(pge0Var.f148665n) && (gnjVar = (gnj) m129297F3(new mpj(701))) != null) {
            pge0Var.f148665n = gnjVar.m127140b();
            pge0Var.f148664m = gnjVar.m127139a();
        }
        if ((m206027E2() instanceof x350) && (bLiveOfficialShowCurrentAnchorInfoM206897S2 = ((x350) m206027E2()).m206897S2()) != null) {
            pge0Var.f148652a = bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorLiveId;
            pge0Var.f148653b = bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorRoomId;
            pge0Var.f148654c = bLiveOfficialShowCurrentAnchorInfoM206897S2.anchorId;
            BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfoNew_ = BLiveGiftOfficialShowExtraInfo.new_();
            bLiveGiftOfficialShowExtraInfoNew_.anchorId = m206027E2().m132140j0();
            bLiveGiftOfficialShowExtraInfoNew_.roomId = m206027E2().m149818o();
            bLiveGiftOfficialShowExtraInfoNew_.liveId = m206027E2().m149814k();
            bLiveGiftOfficialShowExtraInfoNew_.programId = bLiveOfficialShowCurrentAnchorInfoM206897S2.programId;
            pge0Var.f148651O = bLiveGiftOfficialShowExtraInfoNew_;
        }
        if (r610.m177979N(this)) {
            q44 q44VarM155515d = NullChecker.m81303a(pge0Var.f148664m) ? pge0Var.f148664m.m155515d() : null;
            if (q44VarM155515d == null) {
                q44VarM155515d = l610.m148689f(this);
            }
            if (NullChecker.m81303a(q44VarM155515d)) {
                pge0Var.f148675x = l610.m148686b(m206027E2(), q44VarM155515d);
            }
        }
        pge0Var.m168692r(m206027E2().mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: Z3 */
    private void m154516Z3(final pge0 pge0Var) {
        if (!((bgv) ypv.m215673l(fld0.f98151f)).m101721a() || !pge0Var.f148640D || pge0Var.f148656e == null || pge0Var.m168683i()) {
            m154527Y3(pge0Var);
        } else {
            m206028F2().GiftDialogEventGroup.showSendFirstGiftDlg().mo172463j(new kze0().m147947e(new e30() { // from class: l.xfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192683a.m154530h4(pge0Var, (Boolean) obj);
                }
            }).m147946d(new e30() { // from class: l.zfe0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pge0Var.f148670s.call(1);
                }
            }).m147948f((long) r1e.m177455d(pge0Var.f148656e, pge0Var.f148657f)));
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
    public void m154535m4(p149l.pge0 r5, java.lang.Throwable r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.mge0.m154535m4(l.pge0, java.lang.Throwable):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v42, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    private void m154518c4(pge0 pge0Var, qge0 qge0Var) {
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0());
        if (userM135637i == null) {
            userM135637i = ypv.f199493a.m199329V();
        }
        BLiveGivenGiftBrief bLiveGivenGiftBrief = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief;
        bLiveGivenGiftBrief.fpUrl = userM135637i.m60124fp().url;
        bLiveGivenGiftBrief.userName = userM135637i.name;
        bLiveGivenGiftBrief.isFirstGivenGift = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.isFirstGivenGift;
        bLiveGivenGiftBrief.liveUserMask = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().mask;
        bLiveGivenGiftBrief.hasVoiceMode = m206027E2().mo132103W0();
        if (!TextUtils.isEmpty(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo)) {
            bLiveGivenGiftBrief.tradeNo = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo;
        }
        if (!TextUtils.isEmpty(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().effectExt)) {
            bLiveGivenGiftBrief.effectExt = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().effectExt;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().multiCall)) {
            bLiveGivenGiftBrief.multiCall = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().multiCall;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().guildCall)) {
            bLiveGivenGiftBrief.guildCall = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().guildCall;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.avatarTag = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.avatarTag;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.giftBottomTag = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.giftBottomTag;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().previewMask)) {
            bLiveGivenGiftBrief.previewUserMask = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().previewMask;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().senderShowMask)) {
            bLiveGivenGiftBrief.senderShowMask = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().senderShowMask;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().receiverShowMask)) {
            bLiveGivenGiftBrief.receiverShowMask = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().receiverShowMask;
        }
        m154514V3(bLiveGivenGiftBrief, pge0Var, qge0Var);
        nqe.m160616v(bLiveGivenGiftBrief, pge0Var.f148656e, m206027E2(), m206032L2());
        m206027E2().m132063E1(bLiveGivenGiftBrief);
        m206027E2().m132059C1(Long.valueOf(qge0Var.m174408c()));
        pge0Var.f148668q.call(bLiveGivenGiftBrief);
        if (bLiveGivenGiftBrief.isDailyPaymentExceeded) {
            m206028F2().ConsumeAlertEvent.showConsumeAlertDialog().m172467p();
        }
        if (NullChecker.m81303a(pge0Var.f148656e)) {
            m154528b4(pge0Var.f148656e);
            wrj.m205237i0(pge0Var.f148656e, qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief);
        }
        m154522n4(pge0Var, qge0Var);
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m154519d4(pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem = pge0Var.f148656e;
        if (bLiveGiftItem == null) {
            lsi0.m151588r("警告⚠️，礼物对象为空，请检查");
            return false;
        }
        long jM177455d = (long) r1e.m177455d(bLiveGiftItem, pge0Var.f148657f);
        boolean zM168686l = pge0Var.m168686l();
        long j = this.f133676i;
        if (zM168686l) {
            return j >= (bLiveGiftItem.getPrice() * ((long) pge0Var.f148657f)) * ((long) pge0Var.m168679e().size());
        }
        return j >= jM177455d || bLiveGiftItem.isPacketGift();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m154520e4(Long l2) {
        this.f133676i = l2.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m154521f4(cfe0 cfe0Var) {
        m154536q4(cfe0Var.f80589a);
    }

    /* JADX INFO: renamed from: n4 */
    private void m154522n4(pge0 pge0Var, qge0 qge0Var) {
        if (pge0Var.f148656e != null) {
            m206028F2().SendGiftEventGroup.sendGiftSuccess().mo172463j(new rge0(pge0Var, qge0Var));
        }
    }

    /* JADX INFO: renamed from: o4 */
    private void m154523o4(pge0 pge0Var) {
        String str;
        if (TextUtils.equals(pge0Var.f148665n, "source_voice_ktv_quick_gift")) {
            str = "e_audio_ktv_panel";
        } else if (TextUtils.equals(pge0Var.f148665n, "source_voice_gift_guide")) {
            str = "e_audio_pay_guide";
        } else if (pge0Var.f148667p) {
            str = "liveFastGiftClick";
        } else {
            str = ("liveGiftSuitClick".equals(pge0Var.f148637A) || "liveGiftGuardClick".equals(pge0Var.f148637A)) ? pge0Var.f148637A : "liveGiftBarGiftClick";
        }
        m206028F2().GiftDialogEventGroup.openGoWallet().mo172463j(new ip50().m137454d(true).m137455e(pge0Var).m137456f(str));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: p4 */
    private void m154524p4(pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem = pge0Var.f148656e;
        if (bLiveGiftItem == null || m154526X3(bLiveGiftItem)) {
            return;
        }
        wrj.m205235h0(pge0Var.f148656e);
        pge0Var.m168693s(new gvj(m206027E2().mo132155o0()));
        r1e.m177454a(pge0Var);
        pge0Var.m168696v(m206027E2().mo132081O0());
        if (pge0Var.m168686l()) {
            m154537r4(pge0Var);
        } else {
            m154525s4(pge0Var);
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m154525s4(final pge0 pge0Var) {
        duringCreated(zfv.m218595q1(pge0Var)).subscribe(ffw.m121194e(new e30() { // from class: l.bge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75426a.m154534l4(pge0Var, (BLiveData) obj);
            }
        }, new e30() { // from class: l.dge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86076a.m154535m4(pge0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132166t1()).subscribe(ffw.m121193d(new e30() { // from class: l.sfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164287a.m154520e4((Long) obj);
            }
        }));
        m129304h3(m206028F2().SendGiftEventGroup.sendGift(), new e30() { // from class: l.vfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181262a.m154521f4((cfe0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m154526X3(BLiveGiftItem bLiveGiftItem) {
        Context context = m206029H2().getContext();
        if (context == null) {
            return true;
        }
        boolean zBooleanValue = ((Boolean) m129297F3(new bn70(700))).booleanValue();
        String str = (String) m129297F3(new om70(700));
        if (zBooleanValue || !TextUtils.equals(String.valueOf(bLiveGiftItem.f44377id), str)) {
            return false;
        }
        lsi0.m151564B(context.getResources().getString(R$string.f47629xa), false, true);
        return true;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m154527Y3(final pge0 pge0Var) {
        if (!((bgv) ypv.m215673l(fld0.f98151f)).m101722b() || !pge0Var.f148656e.isPaidGift() || !pge0Var.f148639C || pge0Var.m168683i()) {
            m154524p4(pge0Var);
            return;
        }
        long jM177455d = (long) r1e.m177455d(pge0Var.f148656e, pge0Var.f148657f);
        if (!vwb.m200296J(pge0Var.m168679e())) {
            jM177455d *= (long) pge0Var.m168679e().size();
        }
        m206028F2().GiftDialogEventGroup.showSendFirstGiftDlg().mo172463j(new kze0().m147947e(new e30() { // from class: l.fge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97356a.m154529g4(pge0Var, (Boolean) obj);
            }
        }).m147946d(new e30() { // from class: l.hge0
            @Override // p149l.e30
            public final void call(Object obj) {
                pge0Var.f148670s.call(1);
            }
        }).m147948f(jM177455d));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m154528b4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            return;
        }
        m206028F2().BottomEvent.hideFastGiftPrice().m172467p();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m154529g4(pge0 pge0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((bgv) ypv.m215673l(fld0.f98151f)).m101743w(Boolean.FALSE);
        }
        m154524p4(pge0Var);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m154530h4(pge0 pge0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((bgv) ypv.m215673l(fld0.f98151f)).m101741u(Boolean.FALSE);
        }
        m154524p4(pge0Var);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m154532j4(String str, pge0 pge0Var, BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem) {
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveSendLiveMultiGiftResultItem.givenGiftRes;
        bLiveSendLiveGiftResult.givenGiftBrief.sendGiftBatchOriginalId = str;
        qge0 qge0Var = new qge0(bLiveSendLiveGiftResult);
        qge0Var.m174411f(bLiveSendLiveMultiGiftResultItem);
        m154518c4(pge0Var, qge0Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m154533k4(final pge0 pge0Var, List list) {
        final String string = UUID.randomUUID().toString();
        vwb.m200354z(list, new e30() { // from class: l.ufe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176250a.m154532j4(string, pge0Var, (BLiveSendLiveMultiGiftResultItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m154534l4(pge0 pge0Var, BLiveData bLiveData) {
        m154518c4(pge0Var, new qge0(bLiveData.givenGiftRes));
    }

    /* JADX INFO: renamed from: q4 */
    public void m154536q4(pge0 pge0Var) {
        if ((TextUtils.equals(pge0Var.f148665n, "voiceLiveMain") || TextUtils.equals(pge0Var.f148665n, "voiceLiveVice")) && pge0Var.f148656e != null && vwb.m200296J((Collection) m129297F3(new qee0(700)))) {
            osi0.m165783g(w8u.m202217t(R$string.f46688G));
            return;
        }
        if (pge0Var.f148656e == null && TextUtils.isEmpty(pge0Var.f148655d)) {
            return;
        }
        if (pge0Var.f148656e == null) {
            pge0Var.f148656e = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(pge0Var.f148655d);
            wrj.m205217X(pge0Var.f148655d);
            if (pge0Var.f148656e == null) {
                e30<Throwable> e30Var = pge0Var.f148669r;
                if (e30Var != null) {
                    e30Var.call(new Throwable("can't find gift item by id"));
                }
                wrj.m205218Y(pge0Var.f148655d);
                return;
            }
            if (!TextUtils.isEmpty(pge0Var.f148650N)) {
                String str = pge0Var.f148650N;
                tyj.m191051d(str, str, pge0Var.f148656e.f44377id + "", pge0Var.f148656e.getPrice() + "", pge0Var.f148656e.giftType, pge0Var.f148666o, m154519d4(pge0Var));
            }
            axj.m99434h(pge0Var.f148656e, pge0Var.f148672u, pge0Var.f148671t, ((Boolean) m129297F3(new hnj(701).m131941e(pge0Var.f148656e.getPrice()))).booleanValue(), mo77274R2(), 1, (String) m129297F3(new iuj(701)));
        }
        m154515W3(pge0Var);
        if (m154519d4(pge0Var)) {
            m154516Z3(pge0Var);
        } else {
            m154523o4(pge0Var);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m154537r4(final pge0 pge0Var) {
        duringCreated(zfv.m218598r1(pge0Var)).subscribe(ffw.m121194e(new e30() { // from class: l.jge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117771a.m154533k4(pge0Var, (List) obj);
            }
        }, new e30() { // from class: l.lge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127976a.m154531i4(pge0Var, (Throwable) obj);
            }
        }));
    }
}
