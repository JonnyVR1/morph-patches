package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.cxf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rip extends udp {
    /* JADX INFO: renamed from: j */
    private boolean m21671j() {
        if (CoreModule.c.e0.Z7()) {
            return true;
        }
        return CoreModule.c.e0.c8() && !w1g.m23770a();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        cxf.f().h(c0970a.f14969c.m17130d());
        c0970a.f14967a.m15835x2(c0970a.f14972f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        return m21671j();
    }
}
