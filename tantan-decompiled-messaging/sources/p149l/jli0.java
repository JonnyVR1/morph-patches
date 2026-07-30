package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class jli0 extends cli0 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final k7h0.C17941a c17941a) {
        CoreModule.f17545c.f19663m0.f19454u0.put(Boolean.TRUE);
        ok3.m164808G(c17941a.f121581b.act(), true, c17941a.f121582c.m141745d().name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(c17941a.f121582c.m141745d().gender, "male"), new Runnable() { // from class: l.hli0
            @Override // java.lang.Runnable
            public final void run() {
                c17941a.f121581b.m135582r0().mo38801A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.ili0
            @Override // java.lang.Runnable
            public final void run() {
                c17941a.f121581b.m135582r0().mo38822y();
            }
        });
        c17941a.f121580a.m110804I2(c17941a.f121585f, "failFirstSwipe");
        c17941a.f121580a.m110841o1();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(k7h0.C17941a c17941a) {
        if (c17941a.f121583d != SwipeDirection.UP || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || n3b0.m157745t()) {
            return false;
        }
        return ((u59.m191827f0() && c17941a.f121580a.m110810O1(c17941a.f121582c.m141745d().f56011id)) || ew40.m118398j() || xma.m210040C3()) ? false : true;
    }
}
