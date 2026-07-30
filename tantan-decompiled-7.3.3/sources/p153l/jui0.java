package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class jui0 extends cui0 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final sfh0.C20031a c20031a) {
        CoreModule.f18264c.f20405m0.f20196u0.put(Boolean.TRUE);
        hl3.m135664G(c20031a.f167703b.act(), true, c20031a.f167704c.m140259d().name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(c20031a.f167704c.m140259d().gender, "male"), new Runnable() { // from class: l.hui0
            @Override // java.lang.Runnable
            public final void run() {
                c20031a.f167703b.m215735r0().mo39804A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.iui0
            @Override // java.lang.Runnable
            public final void run() {
                c20031a.f167703b.m215735r0().mo39825y();
            }
        });
        c20031a.f167702a.m190786I2(c20031a.f167707f, "failFirstSwipe");
        c20031a.f167702a.m190823o1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        if (c20031a.f167705d != SwipeDirection.UP || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || rbb0.m180747t()) {
            return false;
        }
        return ((d79.m114685j0() && c20031a.f167702a.m190792O1(c20031a.f167704c.m140259d().f56859id)) || t450.m189175j() || joa.m146354D3()) ? false : true;
    }
}
