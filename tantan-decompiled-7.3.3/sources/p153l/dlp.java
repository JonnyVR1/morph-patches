package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class dlp extends ufp {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        CoreModule.m30930K().startJailedDialogLikeAct();
        c19824a.f162787a.m135496x2(c19824a.f162792f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        return CoreModule.f18264c.f20381e0.m116600p9().isJailed();
    }
}
