package p009l;

import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.User;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nof extends kof {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(lof.C1021a c1021a) {
        User user = c1021a.f16276c;
        String str = c1021a.f16280g;
        c1021a.f16284k.mo278D0(c1021a.f16275b, c1021a.f16282i);
        m17568f(m17569g(c1021a), str, user, c1021a.f16283j, c1021a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(lof.C1021a c1021a) {
        return true;
    }
}
