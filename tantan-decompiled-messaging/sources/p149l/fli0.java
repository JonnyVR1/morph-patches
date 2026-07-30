package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.VirtualCardType;

/* JADX INFO: loaded from: classes11.dex */
public class fli0 extends cli0 {
    /* JADX INFO: renamed from: i */
    private boolean m122070i() {
        return C4729a0.m31387j().f19525d.get().equals(CoreModule.f17545c.f19663m0.m31137q6());
    }

    /* JADX INFO: renamed from: j */
    private boolean m122071j() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            return true;
        }
        return CoreModule.f17545c.f19639e0.m169476c8() && !w1g.m200928a();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(k7h0.C17941a c17941a) {
        cxf.m109094f().m109098h(c17941a.f121582c.m141745d());
        c17941a.f121580a.m110804I2(c17941a.f121585f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(k7h0.C17941a c17941a) {
        if (c17941a.f121582c.m141746e().virtualCardType == VirtualCardType.FakeCard || c17941a.f121582c.m141746e().virtualCardType == VirtualCardType.AdCard) {
            return false;
        }
        if (n3b0.m157742q() && m122070i()) {
            return false;
        }
        return m122071j();
    }
}
