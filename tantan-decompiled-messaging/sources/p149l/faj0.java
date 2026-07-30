package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveTreasureBox;
import com.p046p1.mobile.putong.live.base.data.BLiveTreasureBoxStatus;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.TreasureBoxView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class faj0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public BLiveTreasureBoxStatus f96606i;

    /* JADX INFO: renamed from: j */
    public c4g0 f96607j;

    /* JADX INFO: renamed from: k */
    public int f96608k;

    /* JADX INFO: renamed from: l */
    public int f96609l;

    /* JADX INFO: renamed from: m */
    public boolean f96610m;

    /* JADX INFO: renamed from: n */
    public final wa2 f96611n;

    public faj0(bsm bsmVar, wa2 wa2Var) {
        super(bsmVar);
        this.f96610m = false;
        this.f96611n = wa2Var;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m120187M3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m120190P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m120191R3(Throwable th) {
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m120192S3(Throwable th) {
    }

    private void init() {
        if (this.f96610m) {
            return;
        }
        duringCreated(zfv.m218522O0()).subscribe(ffw.m121194e(new e30() { // from class: l.x9j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191628a.m120205e4((BLiveData) obj);
            }
        }, new e30() { // from class: l.y9j0
            @Override // p149l.e30
            public final void call(Object obj) {
                faj0.m120192S3((Throwable) obj);
            }
        }));
        duringCreated(((ggv) ypv.m215673l(fld0.f98148c)).m126035u()).subscribe(ffw.m121194e(new e30() { // from class: l.z9j0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202297a.m120206f4((zfv.C21688b) obj);
            }
        }, new e30() { // from class: l.aaj0
            @Override // p149l.e30
            public final void call(Object obj) {
                faj0.m120191R3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: p4 */
    private void m120195p4() {
        c4g0 c4g0Var = this.f96607j;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f96607j = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121194e(new e30() { // from class: l.caj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80037a.m120209i4((Long) obj);
                }
            }, new e30() { // from class: l.daj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    faj0.m120190P3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(ie4.class, new w9j() { // from class: l.u9j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175333a.m120203c4((ie4) obj);
            }
        });
        m129301d3(he4.class, new w9j() { // from class: l.w9j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185360a.m120204d4((he4) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m120196V3() {
        return TEnum.equals(this.f96606i, "created") || TEnum.equals(this.f96606i, "pending");
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m120197W3() {
        return TEnum.equals(this.f96606i, "completed") || m120202b4();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m120198X3() {
        V v2 = this.f96611n.f85887k;
        if (v2 == 0) {
            return;
        }
        ((TreasureBoxView) v2).f48553d.setText(R$string.f46978Tb);
        ((TreasureBoxView) this.f96611n.f85887k).f48552c.setProgress(100);
        xdl0.m208344M(((TreasureBoxView) this.f96611n.f85887k).f48552c, true);
        xdl0.m208344M(((TreasureBoxView) this.f96611n.f85887k).f48553d, true);
    }

    @NotNull
    /* JADX INFO: renamed from: Y3 */
    public final String m120199Y3(int i) {
        int i2 = this.f96608k - i;
        if (i2 < 1) {
            i2 = 0;
        }
        return String.format("%02d:%02d", Integer.valueOf((i2 / 60) % 60), Integer.valueOf(i2 % 60));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2, l.lh20] */
    @NotNull
    /* JADX INFO: renamed from: Z3 */
    public final String m120200Z3(BLiveTreasureBox bLiveTreasureBox) {
        return bLiveTreasureBox.entranceUrl + "?countDownSeconds=" + this.f96608k + "&liveid=" + m206027E2().m149814k() + "&anchorid=" + m206027E2().m132146l0().f56011id;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m120201a4() {
        this.f96611n.mo111419b4(false);
    }

    /* JADX INFO: renamed from: b4 */
    public final boolean m120202b4() {
        return TEnum.equals(this.f96606i, "pending") && ((bgv) ypv.m215673l(fld0.f98151f)).m101736p() >= this.f96608k;
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m120203c4(ie4 ie4Var) {
        return Boolean.valueOf(m120197W3());
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Boolean m120204d4(he4 he4Var) {
        return Boolean.valueOf(m120196V3());
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m120205e4(BLiveData bLiveData) {
        BLiveTreasureBox bLiveTreasureBox = bLiveData.treasureBox;
        if (bLiveTreasureBox == null) {
            return;
        }
        this.f96608k = bLiveTreasureBox.countDownSeconds;
        this.f96606i = bLiveTreasureBox.status;
        this.f96609l = bLiveTreasureBox.bubbleIdsConfig.take;
        ((bgv) ypv.m215673l(fld0.f98151f)).m101716D(this.f96606i.toString());
        if (!bLiveTreasureBox.canShowTreasureBox()) {
            this.f96610m = true;
            return;
        }
        m120212l4(bLiveTreasureBox);
        m120214n4();
        m120210j4(bLiveTreasureBox.status, true);
        this.f96610m = false;
        m206028F2().BottomEvent.hideGiftPacket().m172467p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m120206f4(zfv.C21688b c21688b) {
        if (c21688b != null && c21688b.f202985a.equals("refreshStatus")) {
            m120210j4(BLiveTreasureBoxStatus.get(c21688b.f202986b), false);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m120207g4(BLiveData bLiveData) {
        this.f96606i = BLiveTreasureBoxStatus.get("completed");
        ((bgv) ypv.m215673l(fld0.f98151f)).m101716D(this.f96606i.toString());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m120208h4(BLiveTreasureBox bLiveTreasureBox, View view) {
        this.f96611n.m111423g4();
        m120213m4(m120200Z3(bLiveTreasureBox), bLiveTreasureBox.detailInset);
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("newUserTreasureBoxGetBubble");
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("newUserTreasureBoxTakeBubble");
        zvf0.m220399u("e_live_newsuer_redpakge", mo77274R2(), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("anchorId", m206027E2().m132146l0().f56011id));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m120209i4(Long l2) {
        if (TEnum.equals(this.f96606i, "pending")) {
            fld0<bgv> fld0Var = fld0.f98151f;
            int iM101736p = ((bgv) ypv.m215673l(fld0Var)).m101736p();
            if (m206027E2().m149816m().m137797d() && act().lifecycle_() == C4319c.f15548i) {
                iM101736p++;
                ((bgv) ypv.m215673l(fld0Var)).m101717E(Integer.valueOf(iM101736p));
            }
            if (iM101736p >= this.f96608k) {
                m120210j4(BLiveTreasureBoxStatus.get("completed"), false);
                mkd0.m154992z(this.f96607j);
                m206028F2().BootBubbleEvent.showBubbleById().mo172463j(String.valueOf(this.f96609l));
            } else {
                V v2 = this.f96611n.f85887k;
                if (v2 != 0) {
                    ((TreasureBoxView) v2).f48553d.setText(m120199Y3(iM101736p));
                    ((TreasureBoxView) this.f96611n.f85887k).f48552c.setProgress((iM101736p * 100) / this.f96608k);
                }
            }
            V v3 = this.f96611n.f85887k;
            if (v3 != 0) {
                xdl0.m208344M(((TreasureBoxView) v3).f48552c, true);
                xdl0.m208344M(((TreasureBoxView) this.f96611n.f85887k).f48553d, true);
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m120210j4(BLiveTreasureBoxStatus bLiveTreasureBoxStatus, boolean z) {
        if (z) {
            mkd0.m154992z(this.f96607j);
        }
        if (z || !TEnum.equals(bLiveTreasureBoxStatus, this.f96606i)) {
            if (m120202b4()) {
                m120198X3();
                m120211k4();
                return;
            }
            if (TEnum.equals(bLiveTreasureBoxStatus, "completed")) {
                m120198X3();
            } else if (TEnum.equals(bLiveTreasureBoxStatus, "deleted") || TEnum.equals(bLiveTreasureBoxStatus, BLiveTreasureBoxStatus.taken)) {
                m120201a4();
                m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
            } else if ((TEnum.equals(this.f96606i, "created") && TEnum.equals(bLiveTreasureBoxStatus, "pending")) || TEnum.equals(this.f96606i, "pending")) {
                m120195p4();
            }
            this.f96606i = bLiveTreasureBoxStatus;
            ((bgv) ypv.m215673l(fld0.f98151f)).m101716D(this.f96606i.toString());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m120211k4() {
        zfv.m218574j1().subscribe(ffw.m121194e(new e30() { // from class: l.eaj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90210a.m120207g4((BLiveData) obj);
            }
        }, new e30() { // from class: l.v9j0
            @Override // p149l.e30
            public final void call(Object obj) {
                faj0.m120187M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m120212l4(final BLiveTreasureBox bLiveTreasureBox) {
        V v2 = this.f96611n.f85887k;
        if (v2 == 0) {
            return;
        }
        xdl0.m208329E0(v2, new View.OnClickListener() { // from class: l.baj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74695a.m120208h4(bLiveTreasureBox, view);
            }
        });
        xdl0.m208344M(((TreasureBoxView) this.f96611n.f85887k).f48552c, false);
        xdl0.m208344M(((TreasureBoxView) this.f96611n.f85887k).f48553d, false);
    }

    /* JADX INFO: renamed from: m4 */
    public void m120213m4(String str, List<Double> list) {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.detailUrl = str;
        bLiveCampaign.detailInset = list;
        bLiveCampaign.webBgType = CommonH5Builder.BgType.TRAN_BG;
        bLiveCampaign.isNeedCloseBtn = false;
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(500).m142601r(bLiveCampaign).m142600q());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m120201a4();
        mkd0.m154992z(this.f96607j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    /* JADX INFO: renamed from: n4 */
    public final void m120214n4() {
        this.f96611n.mo111419b4(true);
        zvf0.m220368A("e_live_newsuer_redpakge", mo77274R2(), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("anchorId", m206027E2().m132146l0().f56011id));
    }

    /* JADX INFO: renamed from: o4 */
    public void m120215o4() {
        init();
    }
}
