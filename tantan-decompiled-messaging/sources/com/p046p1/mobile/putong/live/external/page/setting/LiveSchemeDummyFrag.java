package com.p046p1.mobile.putong.live.external.page.setting;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import p149l.e30;
import p149l.ffw;
import p149l.gld0;
import p149l.nj3;
import p149l.s9s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSchemeDummyFrag extends LiveBaseFrag {
    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m70704N4(Act.C4299r c4299r) {
        if (c4299r == null) {
            return;
        }
        if (s9s.f163232f.m134380m(c4299r.f15343a.get())) {
            act().m66873d2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        ((nj3) s9s.m182763m(gld0.f103312b)).m159608F(act());
        duringCreated(Act.foreground()).subscribe(ffw.m121197h(new e30() { // from class: l.sht
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164631a.m70704N4((Act.C4299r) obj);
            }
        }));
    }
}
