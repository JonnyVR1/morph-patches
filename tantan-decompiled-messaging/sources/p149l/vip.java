package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class vip extends udp {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final j7h0.C17710a c17710a) {
        CoreModule.f17545c.f19663m0.f19454u0.put(Boolean.TRUE);
        ok3.m164808G(c17710a.f116600b.getAct(), true, c17710a.f116601c.m141745d().name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(c17710a.f116601c.m141745d().gender, "male"), new Runnable() { // from class: l.tip
            @Override // java.lang.Runnable
            public final void run() {
                c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.uip
            @Override // java.lang.Runnable
            public final void run() {
                c17710a.f116600b.m169729m0().mo38822y();
            }
        });
        c17710a.f116599a.m131092x2(c17710a.f116604f, "failFirstSwipe");
        c17710a.f116599a.m131072i1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        if (c17710a.f116602d != SwipeDirection.UP || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || n3b0.m157745t()) {
            return false;
        }
        return ((u59.m191827f0() && c17710a.f116599a.m131047C1(c17710a.f116601c.m141745d().f56011id)) || ew40.m118398j() || xma.m210040C3()) ? false : true;
    }
}
