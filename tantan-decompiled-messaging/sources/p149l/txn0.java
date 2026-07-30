package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;

/* JADX INFO: loaded from: classes11.dex */
public class txn0 extends h4t<nnn0, xxn0> {

    /* JADX INFO: renamed from: i */
    public d30 f172516i;

    public txn0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new xxn0());
        ((xxn0) this.viewModel).mo21065i1(this);
    }

    /* JADX INFO: renamed from: J3 */
    public void m190962J3(String str) {
        mo129310p3(7017, str);
        ((xxn0) this.viewModel).m211528f();
        d30 d30Var = this.f172516i;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m190963K3(d30 d30Var) {
        this.f172516i = d30Var;
    }

    /* JADX INFO: renamed from: L3 */
    public void m190964L3(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        ((xxn0) this.viewModel).m211531m(bLiveIntlMedalWallItem);
    }
}
