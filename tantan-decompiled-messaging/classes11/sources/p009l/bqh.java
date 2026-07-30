package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.User;
import l.ark;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bqh extends pph {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(qph.C1150a c1150a) {
        ark.T0(c1150a.f19425a);
        c1150a.f19431g.mo7345k2(c1150a.f19430f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        User userP9 = CoreModule.c.e0.p9();
        return userP9 != null && userP9.isNameFake();
    }
}
