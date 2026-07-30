package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.User;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pli0 extends cli0 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(k7h0.C0984a c0984a) {
        c0984a.f15441a.f11752m.onNext(roj0.a);
        c0984a.f15441a.m13114I2(c0984a.f15446f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        User userP9 = CoreModule.c.e0.p9();
        return userP9 != null && userP9.isNameFake();
    }
}
