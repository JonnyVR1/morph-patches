package p153l;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class hrh extends erh {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(frh.C17047a c17047a) {
        User user = c17047a.f100422c;
        boolean z = c17047a.f100423d == SwipeDirection.UP;
        HashMap map = new HashMap();
        map.put("sourcepage", tel.f173844J);
        map.put("actiontype", c17047a.f100424e ? tel.f173845K : tel.f173846L);
        c17047a.f100426g.mo44133M2(c17047a.f100421b, c17047a.f100423d);
        m122186f(m122187g(c17047a), z, user, map, c17047a.f100424e, c17047a);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(frh.C17047a c17047a) {
        return true;
    }
}
