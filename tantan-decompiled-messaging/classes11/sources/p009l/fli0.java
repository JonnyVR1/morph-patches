package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.cxf;
import l.n3b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fli0 extends cli0 {
    /* JADX INFO: renamed from: i */
    private boolean m14499i() {
        return ((String) a0.j().d.get()).equals(CoreModule.c.m0.q6());
    }

    /* JADX INFO: renamed from: j */
    private boolean m14500j() {
        if (CoreModule.c.e0.Z7()) {
            return true;
        }
        return CoreModule.c.e0.c8() && !w1g.m23770a();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(k7h0.C0984a c0984a) {
        cxf.f().h(c0984a.f15443c.m17130d());
        c0984a.f15441a.m13114I2(c0984a.f15446f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        if (c0984a.f15443c.m17131e().virtualCardType == VirtualCardType.FakeCard || c0984a.f15443c.m17131e().virtualCardType == VirtualCardType.AdCard) {
            return false;
        }
        if (n3b0.q() && m14499i()) {
            return false;
        }
        return m14500j();
    }
}
