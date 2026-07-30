package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class pui0 extends cui0 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(sfh0.C20031a c20031a) {
        c20031a.f167702a.f173867m.m137019l(uxj0.f181467a);
        c20031a.f167702a.m190786I2(c20031a.f167707f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return userM116600p9 != null && userM116600p9.isNameFake();
    }
}
