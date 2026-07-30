package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.cxf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rph extends pph {
    /* JADX INFO: renamed from: i */
    private boolean m21760i() {
        if (CoreModule.c.e0.Z7()) {
            return true;
        }
        return CoreModule.c.e0.c8() && !w1g.m23770a();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(qph.C1150a c1150a) {
        cxf.f().h(c1150a.f19427c);
        c1150a.f19431g.mo7345k2(c1150a.f19430f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        return m21760i();
    }
}
