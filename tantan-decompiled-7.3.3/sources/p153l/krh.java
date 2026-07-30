package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class krh extends erh {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final frh.C17047a c17047a) {
        CoreModule.f18264c.f20405m0.f20196u0.put(Boolean.TRUE);
        hl3.m135664G(c17047a.f100420a, true, c17047a.f100422c.name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(c17047a.f100422c.gender, "male"), new Runnable() { // from class: l.irh
            @Override // java.lang.Runnable
            public final void run() {
                c17047a.f100426g.mo44132A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.jrh
            @Override // java.lang.Runnable
            public final void run() {
                c17047a.f100426g.mo44142y();
            }
        });
        c17047a.f100426g.mo44141k2(c17047a.f100425f, "failFirstSwipe");
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(frh.C17047a c17047a) {
        return (c17047a.f100423d != SwipeDirection.UP || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || rbb0.m180747t() || t450.m189175j()) ? false : true;
    }
}
