package com.p051p1.mobile.putong.live.external.page.setting;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p153l.dhw;
import p153l.fk3;
import p153l.itd0;
import p153l.tbs;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSchemeDummyFrag extends LiveBaseFrag {
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m71887N4(Act.C4450r c4450r) {
        if (c4450r == null) {
            return;
        }
        if (tbs.f172993f.m143711m(c4450r.f16062a.get())) {
            act().m68056e2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        ((fk3) tbs.m190077m(itd0.f116820b)).m125939F(act());
        duringCreated(Act.foreground()).subscribe(dhw.m115829h(new y20() { // from class: l.tjt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174613a.m71887N4((Act.C4450r) obj);
            }
        }));
    }
}
