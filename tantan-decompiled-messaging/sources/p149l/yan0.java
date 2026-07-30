package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;

/* JADX INFO: loaded from: classes11.dex */
public class yan0 extends x6s<nnn0, gbn0> {

    /* JADX INFO: renamed from: j */
    public String f197226j;

    public yan0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new gbn0(this));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceNewGiftWallEvent.showGiftDetail(), new e30() { // from class: l.wan0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185490a.m213864V3((w2o0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m213863U3(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((gbn0) this.viewModel).m125321b0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m213864V3(w2o0 w2o0Var) {
        if (((gbn0) this.viewModel).isShowing()) {
            ((gbn0) this.viewModel).mo71838p();
        }
        this.f197226j = w2o0Var.f184265a;
        ((gbn0) this.viewModel).m71834E();
        m213865W3(w2o0Var.f184265a, w2o0Var.f184266b, new e30() { // from class: l.xan0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191758a.m213863U3((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m213865W3(String str, String str2, e30<GiftWallV3GiftWeekStarGiftMainDetail> e30Var) {
        duringCreated(v2o0.m196813d(str, str2)).subscribe(ffw.m121197h(e30Var));
    }
}
