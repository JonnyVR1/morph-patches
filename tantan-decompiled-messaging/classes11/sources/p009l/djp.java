package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class djp extends udp {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        CoreModule.K().startJailedDialogLikeAct();
        c0970a.f14967a.m15835x2(c0970a.f14972f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        return CoreModule.c.e0.p9().isJailed();
    }
}
