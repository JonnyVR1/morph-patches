package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class jjp extends udp {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        c17710a.f116599a.f107759n.m132487l(roj0.f160388a);
        c17710a.f116599a.m131092x2(c17710a.f116604f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return userM169527p9 != null && userM169527p9.isNameFake();
    }
}
