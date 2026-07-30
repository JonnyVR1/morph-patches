package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class skp extends ufp {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        String str;
        User userM140259d = c19824a.f162789c.m140259d();
        SwipeDirection swipeDirection = c19824a.f162790d;
        SwipeDirection swipeDirection2 = SwipeDirection.UP;
        int i = 1;
        boolean z = swipeDirection == swipeDirection2;
        HashMap map = new HashMap();
        map.put("sourcepage", "tribe-" + c19824a.f162788b.f152896U);
        map.put("actiontype", c19824a.f162791e ? hjp.f110254I : hjp.f110255J);
        SwipeDirection swipeDirection3 = c19824a.f162790d;
        if (swipeDirection3 == swipeDirection2) {
            str = "superlike";
        } else if (swipeDirection3 == SwipeDirection.RIGHT) {
            str = "like";
        } else {
            str = swipeDirection3 == SwipeDirection.LEFT ? "dislike" : "";
        }
        if (NullChecker.m82486a(c19824a.f162789c) && NullChecker.m82486a(c19824a.f162789c.m140257b()) && NullChecker.m82486a(c19824a.f162789c.m140257b().f115329a)) {
            i = 1 ^ (c19824a.f162789c.m140257b().f115329a.m222761e().booleanValue() ? 1 : 0);
        }
        sfj0.m185607n("e_swipeaction", "p_activity_momentcard_view", sfj0.C20032a.m185615h("actiontype", c19824a.f162791e ? hjp.f110254I : hjp.f110255J), sfj0.C20032a.m185615h("actionname", str), sfj0.C20032a.m185613f("IsWhiteBlock", i));
        if (pzi0.m174439D(CoreModule.f18264c.f20381e0.f89088O0.get().longValue())) {
            byd0 byd0Var = CoreModule.f18264c.f20381e0.f89095P0;
            byd0Var.put(Long.valueOf(byd0Var.get().longValue() + 1));
        } else {
            CoreModule.f18264c.f20381e0.f89088O0.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20381e0.f89095P0.put(1L);
            CoreModule.f18264c.f20381e0.f89103Q0.put(0L);
        }
        SwipeDirection swipeDirection4 = c19824a.f162790d;
        SwipeDirection swipeDirection5 = SwipeDirection.RIGHT;
        if (swipeDirection4 == swipeDirection5) {
            byd0 byd0Var2 = CoreModule.f18264c.f20381e0.f89103Q0;
            byd0Var2.put(Long.valueOf(byd0Var2.get().longValue() + 1));
        }
        if (pzi0.m174439D(CoreModule.f18264c.f20411o0.f20798R.get().longValue())) {
            byd0 byd0Var3 = CoreModule.f18264c.f20411o0.f20799S;
            byd0Var3.put(Long.valueOf(byd0Var3.get().longValue() + 1));
        } else {
            CoreModule.f18264c.f20411o0.f20798R.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20411o0.f20799S.put(1L);
            CoreModule.f18264c.f20411o0.f20800T.put(0L);
        }
        if (c19824a.f162790d == swipeDirection5) {
            byd0 byd0Var4 = CoreModule.f18264c.f20411o0.f20800T;
            byd0Var4.put(Long.valueOf(byd0Var4.get().longValue() + 1));
        }
        m195853f(m195854g(c19824a), z, userM140259d, map, c19824a.f162791e, c19824a.f162787a.f110272i, c19824a);
        c19824a.f162787a.m135452C2(false);
        c19824a.f162787a.m135450B2(false);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        return true;
    }
}
