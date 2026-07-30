package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.wxs;
import l.x6s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e2o0 extends x6s<nnn0, t2o0> {

    /* JADX INFO: renamed from: j */
    public String f12166j;

    /* JADX INFO: renamed from: k */
    public String f12167k;

    public e2o0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        C(new t2o0(this));
    }

    /* JADX INFO: renamed from: T */
    public void m13649T() {
        z2(new ybp0(((wxs) this).e));
        z2(new yan0(((wxs) this).e));
        super/*l.k4t*/.T();
        h3(F2().VoiceNewGiftWallEvent.showMainPage(), new e30() { // from class: l.a2o0
            public final void call(Object obj) {
                this.f9193a.m13650W3((x2o0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m13650W3(x2o0 x2o0Var) {
        if (((bwr) this).viewModel.isShowing()) {
            ((bwr) this).viewModel.p();
        }
        this.f12167k = x2o0Var.f22411b;
        m13655b4(x2o0Var.f22410a);
        ((bwr) this).viewModel.E();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m13651X3(GiftWallV3Tab giftWallV3Tab) {
        ((bwr) this).viewModel.m22462m0(giftWallV3Tab);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m13652Y3(GiftWallV3MainDetail giftWallV3MainDetail) {
        ((bwr) this).viewModel.m22458j0(giftWallV3MainDetail);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m13653Z3(GiftWallV3Tab giftWallV3Tab) {
        ((bwr) this).viewModel.m22460l0(giftWallV3Tab);
    }

    /* JADX INFO: renamed from: a4 */
    public void m13654a4(String str) {
        duringCreated(v2o0.m23250a(str)).subscribe(ffw.h(new e30() { // from class: l.c2o0
            public final void call(Object obj) {
                this.f10426a.m13651X3((GiftWallV3Tab) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public void m13655b4(String str) {
        this.f12166j = str;
        duringCreated(v2o0.m23251b(str)).subscribe(ffw.h(new e30() { // from class: l.b2o0
            public final void call(Object obj) {
                this.f9887a.m13652Y3((GiftWallV3MainDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m13656c4(String str, String str2) {
        duringCreated(v2o0.m23252c(this.f12166j, str, str2)).subscribe(ffw.h(new e30() { // from class: l.d2o0
            public final void call(Object obj) {
                this.f10901a.m13653Z3((GiftWallV3Tab) obj);
            }
        }));
    }
}
