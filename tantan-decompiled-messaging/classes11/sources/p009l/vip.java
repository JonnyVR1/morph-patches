package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.ew40;
import l.n3b0;
import l.ok3;
import l.u59;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vip extends udp {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final j7h0.C0970a c0970a) {
        CoreModule.c.m0.u0.put(Boolean.TRUE);
        ok3.G(c0970a.f14968b.act(), true, c0970a.f14969c.m17130d().name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(c0970a.f14969c.m17130d().gender, "male"), new Runnable() { // from class: l.tip
            @Override // java.lang.Runnable
            public final void run() {
                c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.uip
            @Override // java.lang.Runnable
            public final void run() {
                c0970a.f14968b.m20414m0().mo2818y();
            }
        });
        c0970a.f14967a.m15835x2(c0970a.f14972f, "failFirstSwipe");
        c0970a.f14967a.m15815i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        if (c0970a.f14970d != SwipeDirection.UP || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || n3b0.t()) {
            return false;
        }
        return ((u59.f0() && c0970a.f14967a.m15789C1(((DbObject) c0970a.f14969c.m17130d()).id)) || ew40.j() || xma.C3()) ? false : true;
    }
}
