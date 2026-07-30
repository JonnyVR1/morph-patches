package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.cxf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mof extends kof {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(lof.C1021a c1021a) {
        cxf.f().h(c1021a.f16276c);
        c1021a.f16284k.mo279M3(c1021a.m17971a(), "other");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18527i() {
        if (CoreModule.c.e0.Z7()) {
            return true;
        }
        return CoreModule.c.e0.c8() && !w1g.m23770a();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(lof.C1021a c1021a) {
        return m18527i();
    }
}
