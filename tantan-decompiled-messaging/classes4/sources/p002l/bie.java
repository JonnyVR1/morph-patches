package p002l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import l.e30;
import l.ffw;
import l.gwr;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bie extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, final c2e0 c2e0Var, @Nullable x1e0.C0892b c0892b) {
        c2e0Var.duringCreated(IntlLivingNormalApiProvider.fetchRealJumpUrl(((gwr) ygtVar).b)).subscribe(ffw.h(new e30() { // from class: l.aie
            public final void call(Object obj) {
                c2e0Var.mo14197p3(1300, (String) obj);
            }
        }));
    }
}
