package p149l;

import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;

/* JADX INFO: loaded from: classes11.dex */
public class e2o0 extends x6s<nnn0, t2o0> {

    /* JADX INFO: renamed from: j */
    public String f88934j;

    /* JADX INFO: renamed from: k */
    public String f88935k;

    public e2o0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new t2o0(this));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        m144512z2(new ybp0(this.f188512e));
        m144512z2(new yan0(this.f188512e));
        super.mo70198T();
        m129304h3(m206028F2().VoiceNewGiftWallEvent.showMainPage(), new e30() { // from class: l.a2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67274a.m114513W3((x2o0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m114513W3(x2o0 x2o0Var) {
        if (((t2o0) this.viewModel).isShowing()) {
            ((t2o0) this.viewModel).mo71838p();
        }
        this.f88935k = x2o0Var.f190810b;
        m114518b4(x2o0Var.f190809a);
        ((t2o0) this.viewModel).m71834E();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m114514X3(GiftWallV3Tab giftWallV3Tab) {
        ((t2o0) this.viewModel).m187056m0(giftWallV3Tab);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m114515Y3(GiftWallV3MainDetail giftWallV3MainDetail) {
        ((t2o0) this.viewModel).m187053j0(giftWallV3MainDetail);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m114516Z3(GiftWallV3Tab giftWallV3Tab) {
        ((t2o0) this.viewModel).m187055l0(giftWallV3Tab);
    }

    /* JADX INFO: renamed from: a4 */
    public void m114517a4(String str) {
        duringCreated(v2o0.m196810a(str)).subscribe(ffw.m121197h(new e30() { // from class: l.c2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78375a.m114514X3((GiftWallV3Tab) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public void m114518b4(String str) {
        this.f88934j = str;
        duringCreated(v2o0.m196811b(str)).subscribe(ffw.m121197h(new e30() { // from class: l.b2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72711a.m114515Y3((GiftWallV3MainDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m114519c4(String str, String str2) {
        duringCreated(v2o0.m196812c(this.f88934j, str, str2)).subscribe(ffw.m121197h(new e30() { // from class: l.d2o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83420a.m114516Z3((GiftWallV3Tab) obj);
            }
        }));
    }
}
