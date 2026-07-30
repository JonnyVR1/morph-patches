package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class lrh extends erh {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(frh.C17047a c17047a) {
        CoreModule.m30930K().startJailedDialogLikeAct();
        c17047a.f100426g.mo44141k2(c17047a.f100425f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(frh.C17047a c17047a) {
        return CoreModule.f18264c.f20381e0.m116600p9().isJailed();
    }
}
