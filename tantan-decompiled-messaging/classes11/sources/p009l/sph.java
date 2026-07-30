package p009l;

import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sph extends pph {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(qph.C1150a c1150a) {
        User user = c1150a.f19427c;
        boolean z = c1150a.f19428d == SwipeDirection.UP;
        HashMap map = new HashMap();
        map.put("sourcepage", dcl.f11729J);
        map.put("actiontype", c1150a.f19429e ? dcl.f11730K : dcl.f11731L);
        c1150a.f19431g.mo7334M2(c1150a.f19426b, c1150a.f19428d);
        m20543f(m20544g(c1150a), z, user, map, c1150a.f19429e, c1150a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        return true;
    }
}
