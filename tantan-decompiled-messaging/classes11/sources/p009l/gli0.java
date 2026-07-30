package p009l;

import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gli0 extends cli0 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(k7h0.C0984a c0984a) {
        String str;
        User userM17130d = c0984a.f15443c.m17130d();
        SwipeDirection swipeDirection = c0984a.f15444d;
        SwipeDirection swipeDirection2 = SwipeDirection.UP;
        int i = 1;
        boolean z = swipeDirection == swipeDirection2;
        HashMap map = new HashMap();
        map.put("sourcepage", c0984a.f15441a.f11746g ? dcl.f11728I : dcl.f11729J);
        map.put("actiontype", c0984a.f15445e ? dcl.f11730K : dcl.f11731L);
        SwipeDirection swipeDirection3 = c0984a.f15444d;
        if (swipeDirection3 == swipeDirection2) {
            str = "superlike";
        } else if (swipeDirection3 == SwipeDirection.RIGHT) {
            str = "like";
        } else {
            str = swipeDirection3 == SwipeDirection.LEFT ? "dislike" : "";
        }
        if (NullChecker.a(c0984a.f15443c) && NullChecker.a(c0984a.f15443c.m17128b()) && NullChecker.a(c0984a.f15443c.m17128b().f15201a)) {
            i = 1 ^ (((Boolean) c0984a.f15443c.m17128b().f15201a.e()).booleanValue() ? 1 : 0);
        }
        o6j0.n("e_swipeaction", "p_activity_momentcard_view", new o6j0.a[]{o6j0.a.h("actiontype", c0984a.f15445e ? dcl.f11730K : dcl.f11731L), o6j0.a.h("actionname", str), o6j0.a.f("IsWhiteBlock", i), eli0.m13975b()});
        m12704f(m12705g(c0984a), z, userM17130d, map, c0984a.f15445e, c0984a.f15441a.f11746g, c0984a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        return true;
    }
}
