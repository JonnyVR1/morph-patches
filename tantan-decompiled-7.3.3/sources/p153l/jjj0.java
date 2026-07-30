package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveTreasureBox;
import com.p051p1.mobile.putong.live.base.data.BLiveTreasureBoxStatus;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class jjj0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public BLiveTreasureBoxStatus f121185i;

    /* JADX INFO: renamed from: j */
    public kcg0 f121186j;

    /* JADX INFO: renamed from: k */
    public int f121187k;

    /* JADX INFO: renamed from: l */
    public int f121188l;

    /* JADX INFO: renamed from: m */
    public boolean f121189m;

    /* JADX INFO: renamed from: n */
    public final db2 f121190n;

    public jjj0(dum dumVar, db2 db2Var) {
        super(dumVar);
        this.f121189m = false;
        this.f121190n = db2Var;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m145033M3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m145036P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m145037R3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m145038S3(Throwable th) {
    }

    private void init() {
        if (this.f121189m) {
            return;
        }
        duringCreated(aiv.m98056O0()).subscribe(dhw.m115826e(new y20() { // from class: l.bjj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76998a.m145051e4((BLiveData) obj);
            }
        }, new y20() { // from class: l.cjj0
            @Override // p153l.y20
            public final void call(Object obj) {
                jjj0.m145038S3((Throwable) obj);
            }
        }));
        duringCreated(((hiv) zrv.m221194l(htd0.f111521c)).m135169u()).subscribe(dhw.m115826e(new y20() { // from class: l.djj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88868a.m145052f4((aiv.C15717b) obj);
            }
        }, new y20() { // from class: l.ejj0
            @Override // p153l.y20
            public final void call(Object obj) {
                jjj0.m145037R3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: p4 */
    private void m145041p4() {
        kcg0 kcg0Var = this.f121186j;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f121186j = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115826e(new y20() { // from class: l.gjj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104633a.m145055i4((Long) obj);
                }
            }, new y20() { // from class: l.hjj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    jjj0.m145036P3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(hf4.class, new qcj() { // from class: l.yij0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200092a.m145049c4((hf4) obj);
            }
        });
        m138860d3(gf4.class, new qcj() { // from class: l.ajj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71831a.m145050d4((gf4) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m145042V3() {
        return TEnum.equals(this.f121185i, "created") || TEnum.equals(this.f121185i, "pending");
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m145043W3() {
        return TEnum.equals(this.f121185i, "completed") || m145048b4();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m145044X3() {
        V v2 = this.f121190n.f126232k;
        if (v2 == 0) {
            return;
        }
        ((TreasureBoxView) v2).f49401d.setText(R$string.f47826Tb);
        ((TreasureBoxView) this.f121190n.f126232k).f49400c.setProgress(100);
        bnl0.m105524M(((TreasureBoxView) this.f121190n.f126232k).f49400c, true);
        bnl0.m105524M(((TreasureBoxView) this.f121190n.f126232k).f49401d, true);
    }

    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final String m145045Y3(int i) {
        int i2 = this.f121187k - i;
        if (i2 < 1) {
            i2 = 0;
        }
        return String.format("%02d:%02d", Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2, l.vp20] */
    @NotNull
    /* JADX INFO: renamed from: Z3 */
    public final String m145046Z3(BLiveTreasureBox bLiveTreasureBox) {
        return bLiveTreasureBox.entranceUrl + "?countDownSeconds=" + this.f121187k + "&liveid=" + m213810E2().m202191k() + "&anchorid=" + m213810E2().m168532l0().f56859id;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m145047a4() {
        this.f121190n.mo119794b4(false);
    }

    /* JADX INFO: renamed from: b4 */
    public final boolean m145048b4() {
        return TEnum.equals(this.f121185i, "pending") && ((civ) zrv.m221194l(htd0.f111524f)).m109972p() >= this.f121187k;
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m145049c4(hf4 hf4Var) {
        return Boolean.valueOf(m145043W3());
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Boolean m145050d4(gf4 gf4Var) {
        return Boolean.valueOf(m145042V3());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m145051e4(BLiveData bLiveData) {
        BLiveTreasureBox bLiveTreasureBox = bLiveData.treasureBox;
        if (bLiveTreasureBox == null) {
            return;
        }
        this.f121187k = bLiveTreasureBox.countDownSeconds;
        this.f121185i = bLiveTreasureBox.status;
        this.f121188l = bLiveTreasureBox.bubbleIdsConfig.take;
        ((civ) zrv.m221194l(htd0.f111524f)).m109952D(this.f121185i.toString());
        if (!bLiveTreasureBox.canShowTreasureBox()) {
            this.f121189m = true;
            return;
        }
        m145058l4(bLiveTreasureBox);
        m145060n4();
        m145056j4(bLiveTreasureBox.status, true);
        this.f121189m = false;
        m213811F2().BottomEvent.hideGiftPacket().m199277p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m145052f4(aiv.C15717b c15717b) {
        if (c15717b != null && c15717b.f71581a.equals("refreshStatus")) {
            m145056j4(BLiveTreasureBoxStatus.get(c15717b.f71582b), false);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m145053g4(BLiveData bLiveData) {
        this.f121185i = BLiveTreasureBoxStatus.get("completed");
        ((civ) zrv.m221194l(htd0.f111524f)).m109952D(this.f121185i.toString());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m145054h4(BLiveTreasureBox bLiveTreasureBox, View view) {
        this.f121190n.m149350g4();
        m145059m4(m145046Z3(bLiveTreasureBox), bLiveTreasureBox.detailInset);
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("newUserTreasureBoxGetBubble");
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("newUserTreasureBoxTakeBubble");
        i4g0.m138523u("e_live_newsuer_redpakge", mo78457R2(), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("anchorId", m213810E2().m168532l0().f56859id));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m145055i4(Long l2) {
        if (TEnum.equals(this.f121185i, "pending")) {
            htd0<civ> htd0Var = htd0.f111524f;
            int iM109972p = ((civ) zrv.m221194l(htd0Var)).m109972p();
            if (m213810E2().m202193m().m146878d() && act().lifecycle_() == C4470c.f16267i) {
                iM109972p++;
                ((civ) zrv.m221194l(htd0Var)).m109953E(Integer.valueOf(iM109972p));
            }
            if (iM109972p >= this.f121187k) {
                m145056j4(BLiveTreasureBoxStatus.get("completed"), false);
                psd0.m173633z(this.f121186j);
                m213811F2().BootBubbleEvent.showBubbleById().mo199273j(String.valueOf(this.f121188l));
            } else {
                V v2 = this.f121190n.f126232k;
                if (v2 != 0) {
                    ((TreasureBoxView) v2).f49401d.setText(m145045Y3(iM109972p));
                    ((TreasureBoxView) this.f121190n.f126232k).f49400c.setProgress((iM109972p * 100) / this.f121187k);
                }
            }
            V v3 = this.f121190n.f126232k;
            if (v3 != 0) {
                bnl0.m105524M(((TreasureBoxView) v3).f49400c, true);
                bnl0.m105524M(((TreasureBoxView) this.f121190n.f126232k).f49401d, true);
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m145056j4(BLiveTreasureBoxStatus bLiveTreasureBoxStatus, boolean z) {
        if (z) {
            psd0.m173633z(this.f121186j);
        }
        if (z || !TEnum.equals(bLiveTreasureBoxStatus, this.f121185i)) {
            if (m145048b4()) {
                m145044X3();
                m145057k4();
                return;
            }
            if (TEnum.equals(bLiveTreasureBoxStatus, "completed")) {
                m145044X3();
            } else if (TEnum.equals(bLiveTreasureBoxStatus, "deleted") || TEnum.equals(bLiveTreasureBoxStatus, BLiveTreasureBoxStatus.taken)) {
                m145047a4();
                m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
            } else if ((TEnum.equals(this.f121185i, "created") && TEnum.equals(bLiveTreasureBoxStatus, "pending")) || TEnum.equals(this.f121185i, "pending")) {
                m145041p4();
            }
            this.f121185i = bLiveTreasureBoxStatus;
            ((civ) zrv.m221194l(htd0.f111524f)).m109952D(this.f121185i.toString());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m145057k4() {
        aiv.m98108j1().subscribe(dhw.m115826e(new y20() { // from class: l.ijj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115235a.m145053g4((BLiveData) obj);
            }
        }, new y20() { // from class: l.zij0
            @Override // p153l.y20
            public final void call(Object obj) {
                jjj0.m145033M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m145058l4(final BLiveTreasureBox bLiveTreasureBox) {
        V v2 = this.f121190n.f126232k;
        if (v2 == 0) {
            return;
        }
        bnl0.m105509E0(v2, new View.OnClickListener() { // from class: l.fjj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99339a.m145054h4(bLiveTreasureBox, view);
            }
        });
        bnl0.m105524M(((TreasureBoxView) this.f121190n.f126232k).f49400c, false);
        bnl0.m105524M(((TreasureBoxView) this.f121190n.f126232k).f49401d, false);
    }

    /* JADX INFO: renamed from: m4 */
    public void m145059m4(String str, List<Double> list) {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.detailUrl = str;
        bLiveCampaign.detailInset = list;
        bLiveCampaign.webBgType = CommonH5Builder.BgType.TRAN_BG;
        bLiveCampaign.isNeedCloseBtn = false;
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(500).m174144r(bLiveCampaign).m174143q());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m145047a4();
        psd0.m173633z(this.f121186j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    /* JADX INFO: renamed from: n4 */
    public final void m145060n4() {
        this.f121190n.mo119794b4(true);
        i4g0.m138492A("e_live_newsuer_redpakge", mo78457R2(), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("anchorId", m213810E2().m168532l0().f56859id));
    }

    /* JADX INFO: renamed from: o4 */
    public void m145061o4() {
        init();
    }
}
