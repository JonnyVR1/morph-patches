package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class rip extends udp {
    /* JADX INFO: renamed from: j */
    private boolean m179528j() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            return true;
        }
        return CoreModule.f17545c.f19639e0.m169476c8() && !w1g.m200928a();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        cxf.m109094f().m109098h(c17710a.f116601c.m141745d());
        c17710a.f116599a.m131092x2(c17710a.f116604f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        return m179528j();
    }
}
