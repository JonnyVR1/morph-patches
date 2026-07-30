package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.o6j0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sip extends udp {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        String str;
        User userM17130d = c0970a.f14969c.m17130d();
        SwipeDirection swipeDirection = c0970a.f14970d;
        SwipeDirection swipeDirection2 = SwipeDirection.UP;
        int i = 1;
        boolean z = swipeDirection == swipeDirection2;
        HashMap map = new HashMap();
        map.put("sourcepage", "tribe-" + c0970a.f14968b.f18675U);
        map.put("actiontype", c0970a.f14971e ? hhp.f14091I : hhp.f14092J);
        SwipeDirection swipeDirection3 = c0970a.f14970d;
        if (swipeDirection3 == swipeDirection2) {
            str = "superlike";
        } else if (swipeDirection3 == SwipeDirection.RIGHT) {
            str = "like";
        } else {
            str = swipeDirection3 == SwipeDirection.LEFT ? "dislike" : "";
        }
        if (NullChecker.a(c0970a.f14969c) && NullChecker.a(c0970a.f14969c.m17128b()) && NullChecker.a(c0970a.f14969c.m17128b().f15201a)) {
            i = 1 ^ (((Boolean) c0970a.f14969c.m17128b().f15201a.e()).booleanValue() ? 1 : 0);
        }
        o6j0.n("e_swipeaction", "p_activity_momentcard_view", new o6j0.a[]{o6j0.a.h("actiontype", c0970a.f14971e ? hhp.f14091I : hhp.f14092J), o6j0.a.h("actionname", str), o6j0.a.f("IsWhiteBlock", i)});
        if (mqi0.m18535D(((Long) CoreModule.c.e0.O0.get()).longValue())) {
            zpd0 zpd0Var = CoreModule.c.e0.P0;
            zpd0Var.put(Long.valueOf(((Long) zpd0Var.get()).longValue() + 1));
        } else {
            CoreModule.c.e0.O0.put(Long.valueOf(mqi0.m18550o()));
            CoreModule.c.e0.P0.put(1L);
            CoreModule.c.e0.Q0.put(0L);
        }
        SwipeDirection swipeDirection4 = c0970a.f14970d;
        SwipeDirection swipeDirection5 = SwipeDirection.RIGHT;
        if (swipeDirection4 == swipeDirection5) {
            zpd0 zpd0Var2 = CoreModule.c.e0.Q0;
            zpd0Var2.put(Long.valueOf(((Long) zpd0Var2.get()).longValue() + 1));
        }
        if (mqi0.m18535D(((Long) CoreModule.c.o0.R.get()).longValue())) {
            zpd0 zpd0Var3 = CoreModule.c.o0.S;
            zpd0Var3.put(Long.valueOf(((Long) zpd0Var3.get()).longValue() + 1));
        } else {
            CoreModule.c.o0.R.put(Long.valueOf(mqi0.m18550o()));
            CoreModule.c.o0.S.put(1L);
            CoreModule.c.o0.T.put(0L);
        }
        if (c0970a.f14970d == swipeDirection5) {
            zpd0 zpd0Var4 = CoreModule.c.o0.T;
            zpd0Var4.put(Long.valueOf(((Long) zpd0Var4.get()).longValue() + 1));
        }
        m22807f(m22808g(c0970a), z, userM17130d, map, c0970a.f14971e, c0970a.f14967a.f14109i, c0970a);
        c0970a.f14967a.m15790C2(false);
        c0970a.f14967a.m15788B2(false);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        return true;
    }
}
