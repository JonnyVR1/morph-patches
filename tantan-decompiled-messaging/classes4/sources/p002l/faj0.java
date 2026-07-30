package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveTreasureBox;
import com.p1.mobile.putong.live.base.data.BLiveTreasureBoxStatus;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bgv;
import l.c4g0;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.j760;
import l.mkd0;
import l.w9j;
import l.xdl0;
import l.ypv;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class faj0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public BLiveTreasureBoxStatus f10207i;

    /* JADX INFO: renamed from: j */
    public c4g0 f10208j;

    /* JADX INFO: renamed from: k */
    public int f10209k;

    /* JADX INFO: renamed from: l */
    public int f10210l;

    /* JADX INFO: renamed from: m */
    public boolean f10211m;

    /* JADX INFO: renamed from: n */
    public final wa2 f10212n;

    public faj0(bsm bsmVar, wa2 wa2Var) {
        super(bsmVar);
        this.f10211m = false;
        this.f10212n = wa2Var;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m13008M3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m13011P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m13012R3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m13013S3(Throwable th) {
    }

    private void init() {
        if (this.f10211m) {
            return;
        }
        duringCreated(zfv.m27225O0()).subscribe(ffw.e(new e30() { // from class: l.x9j0
            public final void call(Object obj) {
                this.f22181a.m13027e4((BLiveData) obj);
            }
        }, new e30() { // from class: l.y9j0
            public final void call(Object obj) {
                faj0.m13013S3((Throwable) obj);
            }
        }));
        duringCreated(((ggv) ypv.l(fld0.c)).u()).subscribe(ffw.e(new e30() { // from class: l.z9j0
            public final void call(Object obj) {
                this.f23316a.m13028f4((zfv.C0941b) obj);
            }
        }, new e30() { // from class: l.aaj0
            public final void call(Object obj) {
                faj0.m13012R3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: p4 */
    private void m13016p4() {
        c4g0 c4g0Var = this.f10208j;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f10208j = m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS)).subscribe(ffw.e(new e30() { // from class: l.caj0
                public final void call(Object obj) {
                    this.f8571a.m13031i4((Long) obj);
                }
            }, new e30() { // from class: l.daj0
                public final void call(Object obj) {
                    faj0.m13011P3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m13017T() {
        super.T();
        m14188d3(ie4.class, new w9j() { // from class: l.u9j0
            public final Object call(Object obj) {
                return this.f20557a.m13025c4((ie4) obj);
            }
        });
        m14188d3(he4.class, new w9j() { // from class: l.w9j0
            public final Object call(Object obj) {
                return this.f21576a.m13026d4((he4) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m13018V3() {
        return TEnum.equals(this.f10207i, "created") || TEnum.equals(this.f10207i, "pending");
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m13019W3() {
        return TEnum.equals(this.f10207i, "completed") || m13024b4();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m13020X3() {
        V v = this.f10212n.f9196k;
        if (v == 0) {
            return;
        }
        ((TreasureBoxView) v).f4595d.setText(R$string.f3020Tb);
        ((TreasureBoxView) this.f10212n.f9196k).f4594c.setProgress(100);
        xdl0.M(((TreasureBoxView) this.f10212n.f9196k).f4594c, true);
        xdl0.M(((TreasureBoxView) this.f10212n.f9196k).f4595d, true);
    }

    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final String m13021Y3(int i) {
        int i2 = this.f10209k - i;
        if (i2 < 1) {
            i2 = 0;
        }
        return String.format("%02d:%02d", Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2, l.lh20] */
    @NotNull
    /* JADX INFO: renamed from: Z3 */
    public final String m13022Z3(BLiveTreasureBox bLiveTreasureBox) {
        return bLiveTreasureBox.entranceUrl + "?countDownSeconds=" + this.f10209k + "&liveid=" + m25547E2().m17235k() + "&anchorid=" + ((DbObject) m25547E2().m14582l0()).id;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m13023a4() {
        this.f10212n.mo11811b4(false);
    }

    /* JADX INFO: renamed from: b4 */
    public final boolean m13024b4() {
        return TEnum.equals(this.f10207i, "pending") && ((bgv) ypv.l(fld0.f)).p() >= this.f10209k;
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m13025c4(ie4 ie4Var) {
        return Boolean.valueOf(m13019W3());
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Boolean m13026d4(he4 he4Var) {
        return Boolean.valueOf(m13018V3());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m13027e4(BLiveData bLiveData) {
        BLiveTreasureBox bLiveTreasureBox = bLiveData.treasureBox;
        if (bLiveTreasureBox == null) {
            return;
        }
        this.f10209k = bLiveTreasureBox.countDownSeconds;
        this.f10207i = bLiveTreasureBox.status;
        this.f10210l = bLiveTreasureBox.bubbleIdsConfig.take;
        ((bgv) ypv.l(fld0.f)).D(this.f10207i.toString());
        if (!bLiveTreasureBox.canShowTreasureBox()) {
            this.f10211m = true;
            return;
        }
        m13034l4(bLiveTreasureBox);
        m13036n4();
        m13032j4(bLiveTreasureBox.status, true);
        this.f10211m = false;
        m25548F2().BottomEvent.hideGiftPacket().p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m13028f4(zfv.C0941b c0941b) {
        if (c0941b != null && c0941b.f23387a.equals("refreshStatus")) {
            m13032j4(BLiveTreasureBoxStatus.get(c0941b.f23388b), false);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m13029g4(BLiveData bLiveData) {
        this.f10207i = BLiveTreasureBoxStatus.get("completed");
        ((bgv) ypv.l(fld0.f)).D(this.f10207i.toString());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m13030h4(BLiveTreasureBox bLiveTreasureBox, View view) {
        this.f10212n.m11815g4();
        m13035m4(m13022Z3(bLiveTreasureBox), bLiveTreasureBox.detailInset);
        m25548F2().BootBubbleEvent.dismissBubble().j("newUserTreasureBoxGetBubble");
        m25548F2().BootBubbleEvent.dismissBubble().j("newUserTreasureBoxTakeBubble");
        zvf0.u("e_live_newsuer_redpakge", mo21430R2(), new j760[]{j760.a("liveId", m25547E2().m17235k()), j760.a("anchorId", ((DbObject) m25547E2().m14582l0()).id)});
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m13031i4(Long l2) {
        if (TEnum.equals(this.f10207i, "pending")) {
            fld0 fld0Var = fld0.f;
            int iP = ((bgv) ypv.l(fld0Var)).p();
            if (m25547E2().m17237m().m15301d() && act().lifecycle_() == c.i) {
                iP++;
                ((bgv) ypv.l(fld0Var)).E(Integer.valueOf(iP));
            }
            if (iP >= this.f10209k) {
                m13032j4(BLiveTreasureBoxStatus.get("completed"), false);
                mkd0.z(this.f10208j);
                m25548F2().BootBubbleEvent.showBubbleById().j(String.valueOf(this.f10210l));
            } else {
                V v = this.f10212n.f9196k;
                if (v != 0) {
                    ((TreasureBoxView) v).f4595d.setText(m13021Y3(iP));
                    ((TreasureBoxView) this.f10212n.f9196k).f4594c.setProgress((iP * 100) / this.f10209k);
                }
            }
            V v2 = this.f10212n.f9196k;
            if (v2 != 0) {
                xdl0.M(((TreasureBoxView) v2).f4594c, true);
                xdl0.M(((TreasureBoxView) this.f10212n.f9196k).f4595d, true);
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m13032j4(BLiveTreasureBoxStatus bLiveTreasureBoxStatus, boolean z) {
        if (z) {
            mkd0.z(this.f10208j);
        }
        if (z || !TEnum.equals(bLiveTreasureBoxStatus, this.f10207i)) {
            if (m13024b4()) {
                m13020X3();
                m13033k4();
                return;
            }
            if (TEnum.equals(bLiveTreasureBoxStatus, "completed")) {
                m13020X3();
            } else if (TEnum.equals(bLiveTreasureBoxStatus, "deleted") || TEnum.equals(bLiveTreasureBoxStatus, "taken")) {
                m13023a4();
                m25548F2().BottomEvent.callBottomButtonApiDiffRefresh().p();
            } else if ((TEnum.equals(this.f10207i, "created") && TEnum.equals(bLiveTreasureBoxStatus, "pending")) || TEnum.equals(this.f10207i, "pending")) {
                m13016p4();
            }
            this.f10207i = bLiveTreasureBoxStatus;
            ((bgv) ypv.l(fld0.f)).D(this.f10207i.toString());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13033k4() {
        zfv.m27277j1().subscribe(ffw.e(new e30() { // from class: l.eaj0
            public final void call(Object obj) {
                this.f9650a.m13029g4((BLiveData) obj);
            }
        }, new e30() { // from class: l.v9j0
            public final void call(Object obj) {
                faj0.m13008M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m13034l4(final BLiveTreasureBox bLiveTreasureBox) {
        V v = this.f10212n.f9196k;
        if (v == 0) {
            return;
        }
        xdl0.E0(v, new View.OnClickListener() { // from class: l.baj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8047a.m13030h4(bLiveTreasureBox, view);
            }
        });
        xdl0.M(((TreasureBoxView) this.f10212n.f9196k).f4594c, false);
        xdl0.M(((TreasureBoxView) this.f10212n.f9196k).f4595d, false);
    }

    /* JADX INFO: renamed from: m4 */
    public void m13035m4(String str, List<Double> list) {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.detailUrl = str;
        bLiveCampaign.detailInset = list;
        bLiveCampaign.webBgType = CommonH5Builder.BgType.TRAN_BG;
        bLiveCampaign.isNeedCloseBtn = false;
        m25548F2().OpenH5Event.open().j(jp50.m16064c(500).m16097r(bLiveCampaign).m16096q());
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m13023a4();
        mkd0.z(this.f10208j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public final void m13036n4() {
        this.f10212n.mo11811b4(true);
        zvf0.A("e_live_newsuer_redpakge", mo21430R2(), new j760[]{j760.a("liveId", m25547E2().m17235k()), j760.a("anchorId", ((DbObject) m25547E2().m14582l0()).id)});
    }

    /* JADX INFO: renamed from: o4 */
    public void m13037o4() {
        init();
    }
}
