package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class kui0 extends cui0 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(sfh0.C20031a c20031a) {
        CoreModule.m30930K().startJailedDialogLikeAct();
        c20031a.f167702a.m190786I2(c20031a.f167707f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        return CoreModule.f18264c.f20381e0.m116600p9().isJailed();
    }
}
