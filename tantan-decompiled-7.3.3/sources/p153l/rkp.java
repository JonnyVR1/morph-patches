package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class rkp extends ufp {
    /* JADX INFO: renamed from: j */
    private boolean m181875j() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            return true;
        }
        return CoreModule.f18264c.f20381e0.m116549c8() && !k3g.m148016a();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        qyf.m178643f().m178647h(c19824a.f162789c.m140259d());
        c19824a.f162787a.m135496x2(c19824a.f162792f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        return m181875j();
    }
}
