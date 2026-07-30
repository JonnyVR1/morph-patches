package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.x6s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yan0 extends x6s<nnn0, gbn0> {

    /* JADX INFO: renamed from: j */
    public String f22953j;

    public yan0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        C(new gbn0(this));
    }

    /* JADX INFO: renamed from: T */
    public void m25208T() {
        super/*l.k4t*/.T();
        h3(F2().VoiceNewGiftWallEvent.showGiftDetail(), new e30() { // from class: l.wan0
            public final void call(Object obj) {
                this.f21971a.m25210V3((w2o0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m25209U3(GiftWallV3GiftWeekStarGiftMainDetail giftWallV3GiftWeekStarGiftMainDetail) {
        ((bwr) this).viewModel.m14877b0(giftWallV3GiftWeekStarGiftMainDetail);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m25210V3(w2o0 w2o0Var) {
        if (((bwr) this).viewModel.isShowing()) {
            ((bwr) this).viewModel.p();
        }
        this.f22953j = w2o0Var.f21859a;
        ((bwr) this).viewModel.E();
        m25211W3(w2o0Var.f21859a, w2o0Var.f21860b, new e30() { // from class: l.xan0
            public final void call(Object obj) {
                this.f22489a.m25209U3((GiftWallV3GiftWeekStarGiftMainDetail) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public void m25211W3(String str, String str2, e30<GiftWallV3GiftWeekStarGiftMainDetail> e30Var) {
        duringCreated(v2o0.m23253d(str, str2)).subscribe(ffw.h(e30Var));
    }
}
