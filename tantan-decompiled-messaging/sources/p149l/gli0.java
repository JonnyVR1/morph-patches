package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class gli0 extends cli0 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(k7h0.C17941a c17941a) {
        String str;
        User userM141745d = c17941a.f121582c.m141745d();
        SwipeDirection swipeDirection = c17941a.f121583d;
        SwipeDirection swipeDirection2 = SwipeDirection.UP;
        int i = 1;
        boolean z = swipeDirection == swipeDirection2;
        HashMap map = new HashMap();
        map.put("sourcepage", c17941a.f121580a.f85458g ? dcl.f85440I : dcl.f85441J);
        map.put("actiontype", c17941a.f121584e ? dcl.f85442K : dcl.f85443L);
        SwipeDirection swipeDirection3 = c17941a.f121583d;
        if (swipeDirection3 == swipeDirection2) {
            str = "superlike";
        } else if (swipeDirection3 == SwipeDirection.RIGHT) {
            str = "like";
        } else {
            str = swipeDirection3 == SwipeDirection.LEFT ? "dislike" : "";
        }
        if (NullChecker.m81303a(c17941a.f121582c) && NullChecker.m81303a(c17941a.f121582c.m141743b()) && NullChecker.m81303a(c17941a.f121582c.m141743b().f118233a)) {
            i = 1 ^ (c17941a.f121582c.m141743b().f118233a.m221515e().booleanValue() ? 1 : 0);
        }
        o6j0.m162870n("e_swipeaction", "p_activity_momentcard_view", o6j0.C18854a.m162878h("actiontype", c17941a.f121584e ? dcl.f85442K : dcl.f85443L), o6j0.C18854a.m162878h("actionname", str), o6j0.C18854a.m162876f("IsWhiteBlock", i), eli0.m117122b());
        m107474f(m107475g(c17941a), z, userM141745d, map, c17941a.f121584e, c17941a.f121580a.f85458g, c17941a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(k7h0.C17941a c17941a) {
        return true;
    }
}
