package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class nge0 extends weu<nge0> {

    /* JADX INFO: renamed from: f */
    public long f138868f;

    public nge0(jlu jluVar) {
        super(jluVar);
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m159309Z2() {
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m218409H2().m203940q()).subscribe(ffw.m121193d(new e30() { // from class: l.tfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169970a.m159317h3((Long) obj);
            }
        }));
        duringCreated(m218411K2().SendGiftEventGroup.m69203a().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.wfe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186077a.m159318i3((cfe0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public final void m159311b3(BLiveGivenGiftBrief bLiveGivenGiftBrief, pge0 pge0Var, qge0 qge0Var) {
        dfe0 dfe0Var = new dfe0(ypv.f199493a.m199309D0(), m218409H2().m203945v());
        mnj mnjVar = pge0Var.f148664m;
        if (mnjVar != null) {
            dfe0Var.m111449e(qge0Var.m174406a(pge0Var));
            dfe0Var.m111450f(qge0Var.m174407b(pge0Var));
            bLiveGivenGiftBrief.briefType = mnjVar.m155513b();
        } else {
            BLiveVideoChatUser anchor = m218409H2().m203901A().getAnchor();
            bLiveGivenGiftBrief.briefType = "extra_type_normal";
            if (anchor != null && !TextUtils.isEmpty(anchor.userId)) {
                dfe0Var.m111449e(anchor.userId);
                dfe0Var.m111450f(anchor.userName);
            }
        }
        bLiveGivenGiftBrief.tray = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.tray;
        bLiveGivenGiftBrief.drawParam = pge0Var.f148674w;
        bLiveGivenGiftBrief.sendGiftExtraInfo = dfe0Var;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m159312c3(pge0 pge0Var) {
        pge0Var.f148653b = m218409H2().m203945v();
        pge0Var.f148652a = m218409H2().m203942s();
        pge0Var.f148654c = m218409H2().m203938o();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m159313d3(final pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem;
        if (!((bgv) ypv.m215673l(fld0.f98151f)).m101722b() || pge0Var.m168683i() || (bLiveGiftItem = pge0Var.f148656e) == null) {
            m159326r3(pge0Var);
        } else {
            m218411K2().GiftDialogEventGroup.m69181i().mo172463j(new kze0().m147947e(new e30() { // from class: l.age0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f69354a.m159319j3(pge0Var, (Boolean) obj);
                }
            }).m147946d(new e30() { // from class: l.cge0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pge0Var.f148670s.call(1);
                }
            }).m147948f((long) r1e.m177455d(bLiveGiftItem, pge0Var.f148657f)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b A[FALL_THROUGH] */
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
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final void m159322n3(p149l.pge0 r5, java.lang.Throwable r6) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.nge0.m159322n3(l.pge0, java.lang.Throwable):void");
    }

    /* JADX INFO: renamed from: f3 */
    public final void m159315f3(pge0 pge0Var, qge0 qge0Var) {
        User userM135637i = ((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0());
        if (userM135637i == null) {
            userM135637i = ypv.f199493a.m199329V();
        }
        BLiveGivenGiftBrief bLiveGivenGiftBrief = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief;
        bLiveGivenGiftBrief.fpUrl = userM135637i.m60124fp().url;
        bLiveGivenGiftBrief.userName = userM135637i.name;
        bLiveGivenGiftBrief.isFirstGivenGift = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.isFirstGivenGift;
        bLiveGivenGiftBrief.liveUserMask = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().mask;
        bLiveGivenGiftBrief.hasVoiceMode = false;
        if (!TextUtils.isEmpty(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo)) {
            bLiveGivenGiftBrief.tradeNo = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.avatarTag = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.avatarTag;
        }
        if (NullChecker.m81303a(qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.giftBottomTag = qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.giftBottomTag;
        }
        m159311b3(bLiveGivenGiftBrief, pge0Var, qge0Var);
        m218409H2().m203916P(bLiveGivenGiftBrief);
        m218409H2().m203915O(Long.valueOf(qge0Var.m174408c()));
        pge0Var.f148668q.call(bLiveGivenGiftBrief);
        if (NullChecker.m81303a(pge0Var.f148656e)) {
            wrj.m205237i0(pge0Var.f148656e, qge0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief);
        }
        m159324p3(pge0Var, qge0Var);
    }

    /* JADX INFO: renamed from: g3 */
    public final boolean m159316g3(pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem = pge0Var.f148656e;
        if (bLiveGiftItem != null) {
            return this.f138868f >= ((long) r1e.m177455d(bLiveGiftItem, pge0Var.f148657f)) || bLiveGiftItem.isPacketGift();
        }
        lsi0.m151588r("警告⚠️，礼物对象为空，请检查");
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m159317h3(Long l2) {
        this.f138868f = l2.longValue();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m159318i3(cfe0 cfe0Var) {
        m159323o3(cfe0Var.f80589a);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m159319j3(pge0 pge0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((bgv) ypv.m215673l(fld0.f98151f)).m101743w(Boolean.FALSE);
        }
        m159326r3(pge0Var);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m159321m3(pge0 pge0Var, BLiveData bLiveData) {
        m159315f3(pge0Var, new qge0(bLiveData.givenGiftRes));
    }

    /* JADX INFO: renamed from: p3 */
    public final void m159324p3(pge0 pge0Var, qge0 qge0Var) {
        if (pge0Var.f148656e != null) {
            m218411K2().SendGiftEventGroup.m69204b().mo172463j(new rge0(pge0Var, qge0Var));
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m159325q3(final pge0 pge0Var) {
        C12505a.m69245o(act(), true, new d30() { // from class: l.yfe0
            @Override // p149l.d30
            public final void call() {
                this.f198052a.m159320k3(pge0Var);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final void m159326r3(pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem = pge0Var.f148656e;
        if (bLiveGiftItem == null) {
            return;
        }
        wrj.m205235h0(bLiveGiftItem);
        m159328t3(pge0Var);
    }

    /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] */
    public void m159323o3(pge0 pge0Var) {
        if (pge0Var.f148656e == null && TextUtils.isEmpty(pge0Var.f148655d)) {
            return;
        }
        m159312c3(pge0Var);
        if (m159316g3(pge0Var)) {
            m159313d3(pge0Var);
        } else {
            m159325q3(pge0Var);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m159328t3(final pge0 pge0Var) {
        duringCreated(iuu.m138459T(pge0Var, m218409H2().m203901A())).subscribe(ffw.m121194e(new e30() { // from class: l.ige0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113108a.m159321m3(pge0Var, (BLiveData) obj);
            }
        }, new e30() { // from class: l.kge0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123027a.m159322n3(pge0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void m159320k3(final pge0 pge0Var) {
        BLiveGiftItem bLiveGiftItem;
        Act act = act();
        if (act == null || pge0Var == null || (bLiveGiftItem = pge0Var.f148656e) == null) {
            return;
        }
        act.dialog().m20507G0(ypv.f199497e.getString(R$string.f47404n5)).m20504F("充值成功，\n继续赠送 " + bLiveGiftItem.localName.getLocalName() + " 礼物?").m20560v0(ypv.f199497e.getString(R$string.f47382m5), new Runnable() { // from class: l.ege0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90934a.m159323o3(pge0Var);
            }
        }).m20544n0(ypv.f199497e.getString(R$string.f47207e5), new Runnable() { // from class: l.gge0
            @Override // java.lang.Runnable
            public final void run() {
                nge0.m159309Z2();
            }
        }).m20567z().show();
    }
}
