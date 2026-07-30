package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class pli0 extends cli0 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(k7h0.C17941a c17941a) {
        c17941a.f121580a.f85464m.m132487l(roj0.f160388a);
        c17941a.f121580a.m110804I2(c17941a.f121585f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(k7h0.C17941a c17941a) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return userM169527p9 != null && userM169527p9.isNameFake();
    }
}
