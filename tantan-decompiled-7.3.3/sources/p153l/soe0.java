package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class soe0 extends xgu<soe0> {

    /* JADX INFO: renamed from: f */
    public long f169881f;

    public soe0(knu knuVar) {
        super(knuVar);
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m187198Z2() {
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m97926H2().m212347q()).subscribe(dhw.m115825d(new y20() { // from class: l.yne0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200822a.m187206h3((Long) obj);
            }
        }));
        duringCreated(m97928K2().SendGiftEventGroup.m70386a().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.boe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77669a.m187207i3((hne0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b3 */
    public final void m187200b3(BLiveGivenGiftBrief bLiveGivenGiftBrief, uoe0 uoe0Var, voe0 voe0Var) {
        ine0 ine0Var = new ine0(zrv.f205799a.m207631D0(), m97926H2().m212352v());
        cqj cqjVar = uoe0Var.f180065m;
        if (cqjVar != null) {
            ine0Var.m141112e(voe0Var.m202111a(uoe0Var));
            ine0Var.m141113f(voe0Var.m202112b(uoe0Var));
            bLiveGivenGiftBrief.briefType = cqjVar.m111913b();
        } else {
            BLiveVideoChatUser anchor = m97926H2().m212308A().getAnchor();
            bLiveGivenGiftBrief.briefType = "extra_type_normal";
            if (anchor != null && !TextUtils.isEmpty(anchor.userId)) {
                ine0Var.m141112e(anchor.userId);
                ine0Var.m141113f(anchor.userName);
            }
        }
        bLiveGivenGiftBrief.tray = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.tray;
        bLiveGivenGiftBrief.drawParam = uoe0Var.f180075w;
        bLiveGivenGiftBrief.sendGiftExtraInfo = ine0Var;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m187201c3(uoe0 uoe0Var) {
        uoe0Var.f180054b = m97926H2().m212352v();
        uoe0Var.f180053a = m97926H2().m212349s();
        uoe0Var.f180055c = m97926H2().m212345o();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m187202d3(final uoe0 uoe0Var) {
        BLiveGiftItem bLiveGiftItem;
        if (!((civ) zrv.m221194l(htd0.f111524f)).m109958b() || uoe0Var.m196982i() || (bLiveGiftItem = uoe0Var.f180057e) == null) {
            m187215r3(uoe0Var);
        } else {
            m97928K2().GiftDialogEventGroup.m70364i().mo199273j(new r7f0().m180145e(new y20() { // from class: l.foe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f100050a.m187208j3(uoe0Var, (Boolean) obj);
                }
            }).m180144d(new y20() { // from class: l.hoe0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uoe0Var.f180071s.call(1);
                }
            }).m180146f((long) f3e.m123725d(bLiveGiftItem, uoe0Var.f180058f)));
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
    public final void m187211n3(p153l.uoe0 r5, java.lang.Throwable r6) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.soe0.m187211n3(l.uoe0, java.lang.Throwable):void");
    }

    /* JADX INFO: renamed from: f3 */
    public final void m187204f3(uoe0 uoe0Var, voe0 voe0Var) {
        User userM144722i = ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0());
        if (userM144722i == null) {
            userM144722i = zrv.f205799a.m207651V();
        }
        BLiveGivenGiftBrief bLiveGivenGiftBrief = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief;
        bLiveGivenGiftBrief.fpUrl = userM144722i.m61308fp().url;
        bLiveGivenGiftBrief.userName = userM144722i.name;
        bLiveGivenGiftBrief.isFirstGivenGift = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.isFirstGivenGift;
        bLiveGivenGiftBrief.liveUserMask = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().mask;
        bLiveGivenGiftBrief.hasVoiceMode = false;
        if (!TextUtils.isEmpty(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo)) {
            bLiveGivenGiftBrief.tradeNo = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().tradeNo;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.avatarTag = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.avatarTag;
        }
        if (NullChecker.m82486a(voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief)) {
            bLiveGivenGiftBrief.giftBottomTag = voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief.giftBottomTag;
        }
        m187200b3(bLiveGivenGiftBrief, uoe0Var, voe0Var);
        m97926H2().m212323P(bLiveGivenGiftBrief);
        m97926H2().m212322O(Long.valueOf(voe0Var.m202113c()));
        uoe0Var.f180069q.call(bLiveGivenGiftBrief);
        if (NullChecker.m82486a(uoe0Var.f180057e)) {
            muj.m160201i0(uoe0Var.f180057e, voe0Var.getCom.p1.mobile.putong.live.base.data.LovePlanetStage.result java.lang.String().givenGiftBrief);
        }
        m187213p3(uoe0Var, voe0Var);
    }

    /* JADX INFO: renamed from: g3 */
    public final boolean m187205g3(uoe0 uoe0Var) {
        BLiveGiftItem bLiveGiftItem = uoe0Var.f180057e;
        if (bLiveGiftItem != null) {
            return this.f169881f >= ((long) f3e.m123725d(bLiveGiftItem, uoe0Var.f180058f)) || bLiveGiftItem.isPacketGift();
        }
        o1j0.m165644r("警告⚠️，礼物对象为空，请检查");
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m187206h3(Long l2) {
        this.f169881f = l2.longValue();
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m187207i3(hne0 hne0Var) {
        m187212o3(hne0Var.f110732a);
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m187208j3(uoe0 uoe0Var, Boolean bool) {
        if (bool.booleanValue()) {
            ((civ) zrv.m221194l(htd0.f111524f)).m109979w(Boolean.FALSE);
        }
        m187215r3(uoe0Var);
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m187210m3(uoe0 uoe0Var, BLiveData bLiveData) {
        m187204f3(uoe0Var, new voe0(bLiveData.givenGiftRes));
    }

    /* JADX INFO: renamed from: p3 */
    public final void m187213p3(uoe0 uoe0Var, voe0 voe0Var) {
        if (uoe0Var.f180057e != null) {
            m97928K2().SendGiftEventGroup.m70387b().mo199273j(new woe0(uoe0Var, voe0Var));
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m187214q3(final uoe0 uoe0Var) {
        C12668a.m70428o(act(), true, new x20() { // from class: l.doe0
            @Override // p153l.x20
            public final void call() {
                this.f89916a.m187209k3(uoe0Var);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final void m187215r3(uoe0 uoe0Var) {
        BLiveGiftItem bLiveGiftItem = uoe0Var.f180057e;
        if (bLiveGiftItem == null) {
            return;
        }
        muj.m160199h0(bLiveGiftItem);
        m187217t3(uoe0Var);
    }

    /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] */
    public void m187212o3(uoe0 uoe0Var) {
        if (uoe0Var.f180057e == null && TextUtils.isEmpty(uoe0Var.f180056d)) {
            return;
        }
        m187201c3(uoe0Var);
        if (m187205g3(uoe0Var)) {
            m187202d3(uoe0Var);
        } else {
            m187214q3(uoe0Var);
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m187217t3(final uoe0 uoe0Var) {
        duringCreated(jwu.m147245T(uoe0Var, m97926H2().m212308A())).subscribe(dhw.m115826e(new y20() { // from class: l.noe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142976a.m187210m3(uoe0Var, (BLiveData) obj);
            }
        }, new y20() { // from class: l.poe0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153397a.m187211n3(uoe0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void m187209k3(final uoe0 uoe0Var) {
        BLiveGiftItem bLiveGiftItem;
        Act act = act();
        if (act == null || uoe0Var == null || (bLiveGiftItem = uoe0Var.f180057e) == null) {
            return;
        }
        act.dialog().m21506G0(zrv.f205803e.getString(R$string.f48252n5)).m21503F("充值成功，\n继续赠送 " + bLiveGiftItem.localName.getLocalName() + " 礼物?").m21559v0(zrv.f205803e.getString(R$string.f48230m5), new Runnable() { // from class: l.joe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121995a.m187212o3(uoe0Var);
            }
        }).m21543n0(zrv.f205803e.getString(R$string.f48055e5), new Runnable() { // from class: l.loe0
            @Override // java.lang.Runnable
            public final void run() {
                soe0.m187198Z2();
            }
        }).m21566z().show();
    }
}
