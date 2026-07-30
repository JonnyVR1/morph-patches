package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.x6s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tcp0 extends x6s<nnn0, ocp0> {
    public tcp0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        C(new ocp0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m22484U3(String str) {
        if (((bwr) this).viewModel.isShowing()) {
            ((bwr) this).viewModel.p();
        }
        ((bwr) this).viewModel.E();
        m22487W3(str);
    }

    /* JADX INFO: renamed from: T */
    public void m22485T() {
        super/*l.k4t*/.T();
        h3(F2().VoiceNewGiftWallEvent.showWeekStarHall(), new e30() { // from class: l.rcp0
            public final void call(Object obj) {
                this.f19738a.m22484U3((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m22486V3(GiftWallV3GiftWeekStarHallMainDetail giftWallV3GiftWeekStarHallMainDetail) {
        ((bwr) this).viewModel.m19679S(giftWallV3GiftWeekStarHallMainDetail);
    }

    /* JADX INFO: renamed from: W3 */
    public void m22487W3(String str) {
        duringCreated(v2o0.m23254e(str)).subscribe(ffw.h(new e30() { // from class: l.scp0
            public final void call(Object obj) {
                this.f20170a.m22486V3((GiftWallV3GiftWeekStarHallMainDetail) obj);
            }
        }));
    }
}
