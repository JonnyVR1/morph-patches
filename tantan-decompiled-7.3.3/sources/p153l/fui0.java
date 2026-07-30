package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.VirtualCardType;

/* JADX INFO: loaded from: classes11.dex */
public class fui0 extends cui0 {
    /* JADX INFO: renamed from: i */
    private boolean m127503i() {
        return C4880a0.m32390j().f20267d.get().equals(CoreModule.f18264c.f20405m0.m32140q6());
    }

    /* JADX INFO: renamed from: j */
    private boolean m127504j() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            return true;
        }
        return CoreModule.f18264c.f20381e0.m116549c8() && !k3g.m148016a();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(sfh0.C20031a c20031a) {
        qyf.m178643f().m178647h(c20031a.f167704c.m140259d());
        c20031a.f167702a.m190786I2(c20031a.f167707f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        if (c20031a.f167704c.m140260e().virtualCardType == VirtualCardType.FakeCard || c20031a.f167704c.m140260e().virtualCardType == VirtualCardType.AdCard) {
            return false;
        }
        if (rbb0.m180744q() && m127503i()) {
            return false;
        }
        return m127504j();
    }
}
