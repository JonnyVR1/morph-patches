package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;

/* JADX INFO: loaded from: classes10.dex */
public class ckn0 extends y8s<rwn0, kkn0> {

    /* JADX INFO: renamed from: j */
    public String f82302j;

    public ckn0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new kkn0(this));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceNewGiftWallEvent.showGiftDetail(), new y20() { // from class: l.akn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72022a.m110378V3((aco0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m110377U3(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((kkn0) this.viewModel).m150295b0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m110378V3(aco0 aco0Var) {
        if (((kkn0) this.viewModel).isShowing()) {
            ((kkn0) this.viewModel).mo73021p();
        }
        this.f82302j = aco0Var.f69734a;
        ((kkn0) this.viewModel).m73017E();
        m110379W3(aco0Var.f69734a, aco0Var.f69735b, new y20() { // from class: l.bkn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77104a.m110377U3((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m110379W3(String str, String str2, y20<GiftWallV3GiftWeekStarGiftMainDetail> y20Var) {
        duringCreated(zbo0.m219204d(str, str2)).subscribe(dhw.m115829h(y20Var));
    }
}
