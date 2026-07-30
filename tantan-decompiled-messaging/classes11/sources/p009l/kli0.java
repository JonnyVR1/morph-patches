package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kli0 extends cli0 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(k7h0.C0984a c0984a) {
        CoreModule.K().startJailedDialogLikeAct();
        c0984a.f15441a.m13114I2(c0984a.f15446f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        return CoreModule.c.e0.p9().isJailed();
    }
}
