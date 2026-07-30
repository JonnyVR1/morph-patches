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
public class jli0 extends cli0 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final k7h0.C0984a c0984a) {
        CoreModule.c.m0.u0.put(Boolean.TRUE);
        ok3.G(c0984a.f15442b.act(), true, c0984a.f15443c.m17130d().name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(c0984a.f15443c.m17130d().gender, "male"), new Runnable() { // from class: l.hli0
            @Override // java.lang.Runnable
            public final void run() {
                c0984a.f15442b.m16475r0().mo2797A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.ili0
            @Override // java.lang.Runnable
            public final void run() {
                c0984a.f15442b.m16475r0().mo2818y();
            }
        });
        c0984a.f15441a.m13114I2(c0984a.f15446f, "failFirstSwipe");
        c0984a.f15441a.m13152o1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        if (c0984a.f15444d != SwipeDirection.UP || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || n3b0.t()) {
            return false;
        }
        return ((u59.f0() && c0984a.f15441a.m13120O1(((DbObject) c0984a.f15443c.m17130d()).id)) || ew40.j() || xma.C3()) ? false : true;
    }
}
