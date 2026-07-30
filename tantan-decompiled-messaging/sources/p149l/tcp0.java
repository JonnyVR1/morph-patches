package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;

/* JADX INFO: loaded from: classes11.dex */
public class tcp0 extends x6s<nnn0, ocp0> {
    public tcp0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new ocp0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m188054U3(String str) {
        if (((ocp0) this.viewModel).isShowing()) {
            ((ocp0) this.viewModel).mo71838p();
        }
        ((ocp0) this.viewModel).m71834E();
        m188056W3(str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceNewGiftWallEvent.showWeekStarHall(), new e30() { // from class: l.rcp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158805a.m188054U3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m188055V3(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        ((ocp0) this.viewModel).m163554S(giftWallV3GiftWeekStarHallMainDetail);
    }

    /* JADX INFO: renamed from: W3 */
    public void m188056W3(String str) {
        duringCreated(v2o0.m196814e(str)).subscribe(ffw.m121197h(new e30() { // from class: l.scp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163760a.m188055V3((GiftWallV3GiftWeekStarHallMainDetail) obj);
            }
        }));
    }
}
