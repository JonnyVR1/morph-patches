package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class upf extends rpf {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(spf.C20128a c20128a) {
        User user = c20128a.f170041c;
        String str = c20128a.f170045g;
        c20128a.f170049k.mo37356D0(c20128a.f170040b, c20128a.f170047i);
        m182527f(m182528g(c20128a), str, user, c20128a.f170048j, c20128a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(spf.C20128a c20128a) {
        return true;
    }
}
