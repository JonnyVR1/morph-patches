package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;

/* JADX INFO: loaded from: classes10.dex */
public class xlp0 extends y8s<rwn0, slp0> {
    public xlp0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new slp0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m211666U3(String str) {
        if (((slp0) this.viewModel).isShowing()) {
            ((slp0) this.viewModel).mo73021p();
        }
        ((slp0) this.viewModel).m73017E();
        m211668W3(str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceNewGiftWallEvent.showWeekStarHall(), new y20() { // from class: l.vlp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184619a.m211666U3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m211667V3(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        ((slp0) this.viewModel).m186645S(giftWallV3GiftWeekStarHallMainDetail);
    }

    /* JADX INFO: renamed from: W3 */
    public void m211668W3(String str) {
        duringCreated(zbo0.m219205e(str)).subscribe(dhw.m115829h(new y20() { // from class: l.wlp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189718a.m211667V3((GiftWallV3GiftWeekStarHallMainDetail) obj);
            }
        }));
    }
}
