package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class grh extends erh {
    /* JADX INFO: renamed from: i */
    private boolean m131798i() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            return true;
        }
        return CoreModule.f18264c.f20381e0.m116549c8() && !k3g.m148016a();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(frh.C17047a c17047a) {
        qyf.m178643f().m178647h(c17047a.f100422c);
        c17047a.f100426g.mo44141k2(c17047a.f100425f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(frh.C17047a c17047a) {
        return m131798i();
    }
}
