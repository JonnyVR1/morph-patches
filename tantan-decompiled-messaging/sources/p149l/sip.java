package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class sip extends udp {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        String str;
        User userM141745d = c17710a.f116601c.m141745d();
        SwipeDirection swipeDirection = c17710a.f116602d;
        SwipeDirection swipeDirection2 = SwipeDirection.UP;
        int i = 1;
        boolean z = swipeDirection == swipeDirection2;
        HashMap map = new HashMap();
        map.put("sourcepage", "tribe-" + c17710a.f116600b.f149629U);
        map.put("actiontype", c17710a.f116603e ? hhp.f107736I : hhp.f107737J);
        SwipeDirection swipeDirection3 = c17710a.f116602d;
        if (swipeDirection3 == swipeDirection2) {
            str = "superlike";
        } else if (swipeDirection3 == SwipeDirection.RIGHT) {
            str = "like";
        } else {
            str = swipeDirection3 == SwipeDirection.LEFT ? "dislike" : "";
        }
        if (NullChecker.m81303a(c17710a.f116601c) && NullChecker.m81303a(c17710a.f116601c.m141743b()) && NullChecker.m81303a(c17710a.f116601c.m141743b().f118233a)) {
            i = 1 ^ (c17710a.f116601c.m141743b().f118233a.m221515e().booleanValue() ? 1 : 0);
        }
        o6j0.m162870n("e_swipeaction", "p_activity_momentcard_view", o6j0.C18854a.m162878h("actiontype", c17710a.f116603e ? hhp.f107736I : hhp.f107737J), o6j0.C18854a.m162878h("actionname", str), o6j0.C18854a.m162876f("IsWhiteBlock", i));
        if (mqi0.m155929D(CoreModule.f17545c.f19639e0.f149231O0.get().longValue())) {
            zpd0 zpd0Var = CoreModule.f17545c.f19639e0.f149238P0;
            zpd0Var.put(Long.valueOf(zpd0Var.get().longValue() + 1));
        } else {
            CoreModule.f17545c.f19639e0.f149231O0.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19639e0.f149238P0.put(1L);
            CoreModule.f17545c.f19639e0.f149246Q0.put(0L);
        }
        SwipeDirection swipeDirection4 = c17710a.f116602d;
        SwipeDirection swipeDirection5 = SwipeDirection.RIGHT;
        if (swipeDirection4 == swipeDirection5) {
            zpd0 zpd0Var2 = CoreModule.f17545c.f19639e0.f149246Q0;
            zpd0Var2.put(Long.valueOf(zpd0Var2.get().longValue() + 1));
        }
        if (mqi0.m155929D(CoreModule.f17545c.f19669o0.f20056R.get().longValue())) {
            zpd0 zpd0Var3 = CoreModule.f17545c.f19669o0.f20057S;
            zpd0Var3.put(Long.valueOf(zpd0Var3.get().longValue() + 1));
        } else {
            CoreModule.f17545c.f19669o0.f20056R.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19669o0.f20057S.put(1L);
            CoreModule.f17545c.f19669o0.f20058T.put(0L);
        }
        if (c17710a.f116602d == swipeDirection5) {
            zpd0 zpd0Var4 = CoreModule.f17545c.f19669o0.f20058T;
            zpd0Var4.put(Long.valueOf(zpd0Var4.get().longValue() + 1));
        }
        m193148f(m193149g(c17710a), z, userM141745d, map, c17710a.f116603e, c17710a.f116599a.f107754i, c17710a);
        c17710a.f116599a.m131048C2(false);
        c17710a.f116599a.m131046B2(false);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        return true;
    }
}
