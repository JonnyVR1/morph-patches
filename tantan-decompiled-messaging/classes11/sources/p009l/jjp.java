package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.User;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jjp extends udp {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        c0970a.f14967a.f14114n.onNext(roj0.a);
        c0970a.f14967a.m15835x2(c0970a.f14972f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        User userP9 = CoreModule.c.e0.p9();
        return userP9 != null && userP9.isNameFake();
    }
}
