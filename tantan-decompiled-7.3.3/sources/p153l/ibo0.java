package p153l;

import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;

/* JADX INFO: loaded from: classes10.dex */
public class ibo0 extends y8s<rwn0, xbo0> {

    /* JADX INFO: renamed from: j */
    public String f114238j;

    /* JADX INFO: renamed from: k */
    public String f114239k;

    public ibo0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new xbo0(this));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        m153103z2(new clp0(this.f196918e));
        m153103z2(new ckn0(this.f196918e));
        super.mo71381T();
        m138863h3(m213811F2().VoiceNewGiftWallEvent.showMainPage(), new y20() { // from class: l.ebo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92944a.m139391W3((bco0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m139391W3(bco0 bco0Var) {
        if (((xbo0) this.viewModel).isShowing()) {
            ((xbo0) this.viewModel).mo73021p();
        }
        this.f114239k = bco0Var.f76192b;
        m139396b4(bco0Var.f76191a);
        ((xbo0) this.viewModel).m73017E();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m139392X3(GiftWallV3Tab giftWallV3Tab) {
        ((xbo0) this.viewModel).m209994m0(giftWallV3Tab);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m139393Y3(GiftWallV3MainDetail giftWallV3MainDetail) {
        ((xbo0) this.viewModel).m209991j0(giftWallV3MainDetail);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m139394Z3(GiftWallV3Tab giftWallV3Tab) {
        ((xbo0) this.viewModel).m209993l0(giftWallV3Tab);
    }

    /* JADX INFO: renamed from: a4 */
    public void m139395a4(String str) {
        duringCreated(zbo0.m219201a(str)).subscribe(dhw.m115829h(new y20() { // from class: l.gbo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103482a.m139392X3((GiftWallV3Tab) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public void m139396b4(String str) {
        this.f114238j = str;
        duringCreated(zbo0.m219202b(str)).subscribe(dhw.m115829h(new y20() { // from class: l.fbo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98120a.m139393Y3((GiftWallV3MainDetail) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public void m139397c4(String str, String str2) {
        duringCreated(zbo0.m219203c(this.f114238j, str, str2)).subscribe(dhw.m115829h(new y20() { // from class: l.hbo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108607a.m139394Z3((GiftWallV3Tab) obj);
            }
        }));
    }
}
