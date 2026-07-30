package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class gui0 extends cui0 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(sfh0.C20031a c20031a) {
        String str;
        User userM140259d = c20031a.f167704c.m140259d();
        SwipeDirection swipeDirection = c20031a.f167705d;
        SwipeDirection swipeDirection2 = SwipeDirection.UP;
        int i = 1;
        boolean z = swipeDirection == swipeDirection2;
        HashMap map = new HashMap();
        map.put("sourcepage", c20031a.f167702a.f173861g ? tel.f173843I : tel.f173844J);
        map.put("actiontype", c20031a.f167706e ? tel.f173845K : tel.f173846L);
        SwipeDirection swipeDirection3 = c20031a.f167705d;
        if (swipeDirection3 == swipeDirection2) {
            str = "superlike";
        } else if (swipeDirection3 == SwipeDirection.RIGHT) {
            str = "like";
        } else {
            str = swipeDirection3 == SwipeDirection.LEFT ? "dislike" : "";
        }
        if (NullChecker.m82486a(c20031a.f167704c) && NullChecker.m82486a(c20031a.f167704c.m140257b()) && NullChecker.m82486a(c20031a.f167704c.m140257b().f115329a)) {
            i = 1 ^ (c20031a.f167704c.m140257b().f115329a.m222761e().booleanValue() ? 1 : 0);
        }
        sfj0.m185607n("e_swipeaction", "p_activity_momentcard_view", sfj0.C20032a.m185615h("actiontype", c20031a.f167706e ? tel.f173845K : tel.f173846L), sfj0.C20032a.m185615h("actionname", str), sfj0.C20032a.m185613f("IsWhiteBlock", i), eui0.m122572b());
        m112689f(m112690g(c20031a), z, userM140259d, map, c20031a.f167706e, c20031a.f167702a.f173861g, c20031a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        return true;
    }
}
