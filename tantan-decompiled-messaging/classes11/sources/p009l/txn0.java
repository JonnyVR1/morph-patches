package p009l;

import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import l.bsm;
import l.bwr;
import l.d30;
import l.h4t;
import l.nnn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class txn0 extends h4t<nnn0, xxn0> {

    /* JADX INFO: renamed from: i */
    public d30 f20910i;

    public txn0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        C(new xxn0());
        ((xxn0) ((bwr) this).viewModel).m25061i1(this);
    }

    /* JADX INFO: renamed from: J3 */
    public void m22692J3(String str) {
        p3(7017, str);
        ((xxn0) ((bwr) this).viewModel).m25060f();
        d30 d30Var = this.f20910i;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: K3 */
    public void m22693K3(d30 d30Var) {
        this.f20910i = d30Var;
    }

    /* JADX INFO: renamed from: L3 */
    public void m22694L3(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        ((xxn0) ((bwr) this).viewModel).m25064m(bLiveIntlMedalWallItem);
    }
}
