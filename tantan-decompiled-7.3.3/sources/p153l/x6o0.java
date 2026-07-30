package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;

/* JADX INFO: loaded from: classes10.dex */
public class x6o0 extends i6t<rwn0, b7o0> {

    /* JADX INFO: renamed from: i */
    public x20 f192603i;

    public x6o0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new b7o0());
        ((b7o0) this.viewModel).mo22064i1(this);
    }

    /* JADX INFO: renamed from: J3 */
    public void m209509J3(String str) {
        mo138869p3(7017, str);
        ((b7o0) this.viewModel).m102865f();
        x20 x20Var = this.f192603i;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m209510K3(x20 x20Var) {
        this.f192603i = x20Var;
    }

    /* JADX INFO: renamed from: L3 */
    public void m209511L3(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        ((b7o0) this.viewModel).m102868m(bLiveIntlMedalWallItem);
    }
}
