package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraMultiPkReceiveGiftRole;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftOfficialShowExtraInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class roe0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public long f164188i;

    public roe0(dum<?> dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX INFO: renamed from: V3 */
    private void m182379V3(BLiveGivenGiftBrief bLiveGivenGiftBrief, uoe0 uoe0Var, voe0 voe0Var) {
        ine0 ine0Var = new ine0(zrv.f205799a.m207631D0(), m213810E2().m202194o());
        cqj cqjVar = uoe0Var.f180065m;
        if (cqjVar != null) {
            if (uoe0Var.m196986m()) {
                ine0Var.m141112e(foc0.m126450a(uoe0Var));
                ine0Var.m141113f(foc0.m126451b(uoe0Var));
            } else {
                ine0Var.m141112e(voe0Var.m202111a(uoe0Var));
                ine0Var.m141113f(voe0Var.m202112b(uoe0Var));
            }
            bLiveGivenGiftBrief.briefType = cqjVar.m111913b();
        } else {
            User userM168532l0 = m213810E2().m168532l0();
            if (userM168532l0 != null && !TextUtils.isEmpty(userM168532l0.f56859id)) {
                ine0Var.m141112e(userM168532l0.f56859id);
                ine0Var.m141113f(userM168532l0.name);
                bLiveGivenGiftBrief.briefType = "extra_type_normal";
            }
        }
        bLiveGivenGiftBrief.tray = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.tray;
        bLiveGivenGiftBrief.drawParam = uoe0Var.f180075w;
        bLiveGivenGiftBrief.sendGiftExtraInfo = ine0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v6, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    private void m182380W3(uoe0 uoe0Var) {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfoM157913S2;
        wpj wpjVar;
        uoe0Var.f180054b = m213810E2().mo183440n().f45172id;
        uoe0Var.f180053a = m213810E2().mo183435j().f45171id;
        uoe0Var.f180055c = m213810E2().m168532l0().f56859id;
        uoe0Var.f180059g = (String) m138856F3(new ju70(701));
        uoe0Var.f180060h = (String) m138856F3(new rs10(701));
        String strM196981h = uoe0Var.m196981h();
        if (!TextUtils.isEmpty(uoe0Var.f180060h) && !TextUtils.isEmpty(strM196981h)) {
            BLiveGiftExtraMultiPkReceiveGiftRole bLiveGiftExtraMultiPkReceiveGiftRoleNew_ = BLiveGiftExtraMultiPkReceiveGiftRole.new_();
            uoe0Var.f180061i = bLiveGiftExtraMultiPkReceiveGiftRoleNew_;
            bLiveGiftExtraMultiPkReceiveGiftRoleNew_.userId = strM196981h;
            Boolean bool = (Boolean) m138856F3(new ss10(701).m187670e(strM196981h));
            uoe0Var.f180061i.role = bool.booleanValue() ? GameIdentity.player : "spectator";
        }
        if (TextUtils.isEmpty(uoe0Var.f180066n) && (wpjVar = (wpj) m138856F3(new csj(701))) != null) {
            uoe0Var.f180066n = wpjVar.m207464b();
            uoe0Var.f180065m = wpjVar.m207463a();
        }
        if ((m213810E2() instanceof mc50) && (bLiveOfficialShowCurrentAnchorInfoM157913S2 = ((mc50) m213810E2()).m157913S2()) != null) {
            uoe0Var.f180053a = bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorLiveId;
            uoe0Var.f180054b = bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorRoomId;
            uoe0Var.f180055c = bLiveOfficialShowCurrentAnchorInfoM157913S2.anchorId;
            BLiveGiftOfficialShowExtraInfo bLiveGiftOfficialShowExtraInfoNew_ = BLiveGiftOfficialShowExtraInfo.new_();
            bLiveGiftOfficialShowExtraInfoNew_.anchorId = m213810E2().m168526j0();
            bLiveGiftOfficialShowExtraInfoNew_.roomId = m213810E2().m202194o();
            bLiveGiftOfficialShowExtraInfoNew_.liveId = m213810E2().m202191k();
            bLiveGiftOfficialShowExtraInfoNew_.programId = bLiveOfficialShowCurrentAnchorInfoM157913S2.programId;
            uoe0Var.f180052O = bLiveGiftOfficialShowExtraInfoNew_;
        }
        if (bf10.m103808N(this)) {
            p54 p54VarM111915d = NullChecker.m82486a(uoe0Var.f180065m) ? uoe0Var.f180065m.m111915d() : null;
            if (p54VarM111915d == null) {
                p54VarM111915d = ve10.m201026f(this);
            }
            if (NullChecker.m82486a(p54VarM111915d)) {
                uoe0Var.f180076x = ve10.m201023b(m213810E2(), p54VarM111915d);
            }
        }
        uoe0Var.m196991r(m213810E2().mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: Z3 */
    private void m182381Z3(final uoe0 uoe0Var) {
        if (!((civ) zrv.m221194l(htd0.f111524f)).m109957a() || !uoe0Var.f180041D || uoe0Var.f180057e == null || uoe0Var.m196982i()) {
            m182392Y3(uoe0Var);
        } else {
            m213811F2().GiftDialogEventGroup.showSendFirstGiftDlg().mo199273j(new r7f0().m180145e(new y20() { // from class: l.coe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82862a.m182395h4(uoe0Var, (Boolean) obj);
                }
            }).m180144d(new y20() { // from class: l.eoe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uoe0Var.f180071s.call(1);
                }
            }).m180146f((long) f3e.m123725d(uoe0Var.f180057e, uoe0Var.f180058f)));
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
    public void m182400m4(p153l.uoe0 r5, java.lang.Throwable r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.roe0.m182400m4(l.uoe0, java.lang.Throwable):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v41, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v42, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: c4 */
    private void m182383c4(uoe0 uoe0Var, voe0 voe0Var) {
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
        if (userM144722i == null) {
            userM144722i = zrv.f205799a.m207651V();
        }
        BLiveGivenGiftBrief bLiveGivenGiftBrief = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief;
        bLiveGivenGiftBrief.fpUrl = userM144722i.m61308fp().url;
        bLiveGivenGiftBrief.userName = userM144722i.name;
        bLiveGivenGiftBrief.isFirstGivenGift = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.isFirstGivenGift;
        bLiveGivenGiftBrief.liveUserMask = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().mask;
        bLiveGivenGiftBrief.hasVoiceMode = m213810E2().mo168489W0();
        if (!TextUtils.isEmpty(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo)) {
            bLiveGivenGiftBrief.tradeNo = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo;
        }
        if (!TextUtils.isEmpty(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().effectExt)) {
            bLiveGivenGiftBrief.effectExt = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().effectExt;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().multiCall)) {
            bLiveGivenGiftBrief.multiCall = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().multiCall;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().guildCall)) {
            bLiveGivenGiftBrief.guildCall = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().guildCall;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.avatarTag = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.avatarTag;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.giftBottomTag = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.giftBottomTag;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().previewMask)) {
            bLiveGivenGiftBrief.previewUserMask = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().previewMask;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().senderShowMask)) {
            bLiveGivenGiftBrief.senderShowMask = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().senderShowMask;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().receiverShowMask)) {
            bLiveGivenGiftBrief.receiverShowMask = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().receiverShowMask;
        }
        m182379V3(bLiveGivenGiftBrief, uoe0Var, voe0Var);
        rre.m182750v(bLiveGivenGiftBrief, uoe0Var.f180057e, m213810E2(), m213815L2());
        m213810E2().m168452E1(bLiveGivenGiftBrief);
        m213810E2().m168448C1(Long.valueOf(voe0Var.m202113c()));
        uoe0Var.f180069q.call(bLiveGivenGiftBrief);
        if (bLiveGivenGiftBrief.isDailyPaymentExceeded) {
            m213811F2().ConsumeAlertEvent.showConsumeAlertDialog().m199277p();
        }
        if (NullChecker.m82486a(uoe0Var.f180057e)) {
            m182393b4(uoe0Var.f180057e);
            muj.m160201i0(uoe0Var.f180057e, voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief);
        }
        m182387n4(uoe0Var, voe0Var);
    }

    /* JADX INFO: renamed from: d4 */
    private boolean m182384d4(uoe0 uoe0Var) {
        BLiveGiftItem bLiveGiftItem = uoe0Var.f180057e;
        if (bLiveGiftItem == null) {
            o1j0.m165644r("警告⚠️，礼物对象为空，请检查");
            return false;
        }
        long jM123725d = (long) f3e.m123725d(bLiveGiftItem, uoe0Var.f180058f);
        boolean zM196985l = uoe0Var.m196985l();
        long j = this.f164188i;
        if (zM196985l) {
            return j >= (bLiveGiftItem.getPrice() * ((long) uoe0Var.f180058f)) * ((long) uoe0Var.m196978e().size());
        }
        return j >= jM123725d || bLiveGiftItem.isPacketGift();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m182385e4(Long l2) {
        this.f164188i = l2.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m182386f4(hne0 hne0Var) {
        m182401q4(hne0Var.f110732a);
    }

    /* JADX INFO: renamed from: n4 */
    private void m182387n4(uoe0 uoe0Var, voe0 voe0Var) {
        if (uoe0Var.f180057e != null) {
            m213811F2().SendGiftEventGroup.sendGiftSuccess().mo199273j(new woe0(uoe0Var, voe0Var));
        }
    }

    /* JADX INFO: renamed from: o4 */
    private void m182388o4(uoe0 uoe0Var) {
        String str;
        if (TextUtils.equals(uoe0Var.f180066n, "source_voice_ktv_quick_gift")) {
            str = "e_audio_ktv_panel";
        } else if (TextUtils.equals(uoe0Var.f180066n, "source_voice_gift_guide")) {
            str = "e_audio_pay_guide";
        } else if (uoe0Var.f180068p) {
            str = "liveFastGiftClick";
        } else {
            str = ("liveGiftSuitClick".equals(uoe0Var.f180038A) || "liveGiftGuardClick".equals(uoe0Var.f180038A)) ? uoe0Var.f180038A : "liveGiftBarGiftClick";
        }
        m213811F2().GiftDialogEventGroup.openGoWallet().mo199273j(new ox50().m169679d(true).m169680e(uoe0Var).m169681f(str));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: p4 */
    private void m182389p4(uoe0 uoe0Var) {
        BLiveGiftItem bLiveGiftItem = uoe0Var.f180057e;
        if (bLiveGiftItem == null || m182391X3(bLiveGiftItem)) {
            return;
        }
        muj.m160199h0(uoe0Var.f180057e);
        uoe0Var.m196992s(new wxj(m213810E2().mo160117o0()));
        f3e.m123724a(uoe0Var);
        uoe0Var.m196995v(m213810E2().mo168468O0());
        if (uoe0Var.m196985l()) {
            m182402r4(uoe0Var);
        } else {
            m182390s4(uoe0Var);
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m182390s4(final uoe0 uoe0Var) {
        duringCreated(aiv.m98129q1(uoe0Var)).subscribe(dhw.m115826e(new y20() { // from class: l.goe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105284a.m182399l4(uoe0Var, (BLiveData) obj);
            }
        }, new y20() { // from class: l.ioe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116144a.m182400m4(uoe0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168550t1()).subscribe(dhw.m115825d(new y20() { // from class: l.xne0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195378a.m182385e4((Long) obj);
            }
        }));
        m138863h3(m213811F2().SendGiftEventGroup.sendGift(), new y20() { // from class: l.aoe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72446a.m182386f4((hne0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m182391X3(BLiveGiftItem bLiveGiftItem) {
        Context context = m213812H2().getContext();
        if (context == null) {
            return true;
        }
        boolean zBooleanValue = ((Boolean) m138856F3(new hv70(700))).booleanValue();
        String str = (String) m138856F3(new uu70(700));
        if (zBooleanValue || !TextUtils.equals(String.valueOf(bLiveGiftItem.f45225id), str)) {
            return false;
        }
        o1j0.m165620B(context.getResources().getString(R$string.f48477xa), false, true);
        return true;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m182392Y3(final uoe0 uoe0Var) {
        if (!((civ) zrv.m221194l(htd0.f111524f)).m109958b() || !uoe0Var.f180057e.isPaidGift() || !uoe0Var.f180040C || uoe0Var.m196982i()) {
            m182389p4(uoe0Var);
            return;
        }
        long jM123725d = (long) f3e.m123725d(uoe0Var.f180057e, uoe0Var.f180058f);
        if (!jyb.m147479J(uoe0Var.m196978e())) {
            jM123725d *= (long) uoe0Var.m196978e().size();
        }
        m213811F2().GiftDialogEventGroup.showSendFirstGiftDlg().mo199273j(new r7f0().m180145e(new y20() { // from class: l.koe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127723a.m182394g4(uoe0Var, (Boolean) obj);
            }
        }).m180144d(new y20() { // from class: l.moe0
            @Override // p153l.y20
            public final void call(Object obj) {
                uoe0Var.f180071s.call(1);
            }
        }).m180146f(jM123725d));
    }

    /* JADX INFO: renamed from: b4 */
    public final void m182393b4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            return;
        }
        m213811F2().BottomEvent.hideFastGiftPrice().m199277p();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m182394g4(uoe0 uoe0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((civ) zrv.m221194l(htd0.f111524f)).m109979w(Boolean.FALSE);
        }
        m182389p4(uoe0Var);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m182395h4(uoe0 uoe0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((civ) zrv.m221194l(htd0.f111524f)).m109977u(Boolean.FALSE);
        }
        m182389p4(uoe0Var);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m182397j4(String str, uoe0 uoe0Var, BLiveSendLiveMultiGiftResultItem bLiveSendLiveMultiGiftResultItem) {
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveSendLiveMultiGiftResultItem.givenGiftRes;
        bLiveSendLiveGiftResult.givenGiftBrief.sendGiftBatchOriginalId = str;
        voe0 voe0Var = new voe0(bLiveSendLiveGiftResult);
        voe0Var.m202116f(bLiveSendLiveMultiGiftResultItem);
        m182383c4(uoe0Var, voe0Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m182398k4(final uoe0 uoe0Var, List list) {
        final String string = UUID.randomUUID().toString();
        jyb.m147537z(list, new y20() { // from class: l.zne0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205194a.m182397j4(string, uoe0Var, (BLiveSendLiveMultiGiftResultItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m182399l4(uoe0 uoe0Var, BLiveData bLiveData) {
        m182383c4(uoe0Var, new voe0(bLiveData.givenGiftRes));
    }

    /* JADX INFO: renamed from: q4 */
    public void m182401q4(uoe0 uoe0Var) {
        if ((TextUtils.equals(uoe0Var.f180066n, "voiceLiveMain") || TextUtils.equals(uoe0Var.f180066n, "voiceLiveVice")) && uoe0Var.f180057e != null && jyb.m147479J((Collection) m138856F3(new vme0(700)))) {
            r1j0.m179420g(xau.m209910t(R$string.f47536G));
            return;
        }
        if (uoe0Var.f180057e == null && TextUtils.isEmpty(uoe0Var.f180056d)) {
            return;
        }
        if (uoe0Var.f180057e == null) {
            uoe0Var.f180057e = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(uoe0Var.f180056d);
            muj.m160181X(uoe0Var.f180056d);
            if (uoe0Var.f180057e == null) {
                y20<Throwable> y20Var = uoe0Var.f180070r;
                if (y20Var != null) {
                    y20Var.call(new Throwable("can't find gift item by id"));
                }
                muj.m160182Y(uoe0Var.f180056d);
                return;
            }
            if (!TextUtils.isEmpty(uoe0Var.f180051N)) {
                String str = uoe0Var.f180051N;
                j1k.m143142d(str, str, uoe0Var.f180057e.f45225id + "", uoe0Var.f180057e.getPrice() + "", uoe0Var.f180057e.giftType, uoe0Var.f180067o, m182384d4(uoe0Var));
            }
            qzj.m178791h(uoe0Var.f180057e, uoe0Var.f180073u, uoe0Var.f180072t, ((Boolean) m138856F3(new xpj(701).m212654e(uoe0Var.f180057e.getPrice()))).booleanValue(), mo78457R2(), 1, (String) m138856F3(new ywj(701)));
        }
        m182380W3(uoe0Var);
        if (m182384d4(uoe0Var)) {
            m182381Z3(uoe0Var);
        } else {
            m182388o4(uoe0Var);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m182402r4(final uoe0 uoe0Var) {
        duringCreated(aiv.m98132r1(uoe0Var)).subscribe(dhw.m115826e(new y20() { // from class: l.ooe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148348a.m182398k4(uoe0Var, (List) obj);
            }
        }, new y20() { // from class: l.qoe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158728a.m182396i4(uoe0Var, (Throwable) obj);
            }
        }));
    }
}
