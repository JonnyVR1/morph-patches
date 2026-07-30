package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class vkp extends ufp {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final rfh0.C19824a c19824a) {
        CoreModule.f18264c.f20405m0.f20196u0.put(Boolean.TRUE);
        hl3.m135664G(c19824a.f162788b.getAct(), true, c19824a.f162789c.m140259d().name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(c19824a.f162789c.m140259d().gender, "male"), new Runnable() { // from class: l.tkp
            @Override // java.lang.Runnable
            public final void run() {
                c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.ukp
            @Override // java.lang.Runnable
            public final void run() {
                c19824a.f162788b.m172725m0().mo39825y();
            }
        });
        c19824a.f162787a.m135496x2(c19824a.f162792f, "failFirstSwipe");
        c19824a.f162787a.m135476i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        if (c19824a.f162790d != SwipeDirection.UP || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || rbb0.m180747t()) {
            return false;
        }
        return ((d79.m114685j0() && c19824a.f162787a.m135451C1(c19824a.f162789c.m140259d().f56859id)) || t450.m189175j() || joa.m146354D3()) ? false : true;
    }
}
