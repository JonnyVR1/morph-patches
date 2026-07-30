package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.icebreak.IceBreakQuestionCard;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class gbm implements sxl0 {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m129802h(List list) {
        ebm.m120180a().m120183d();
        CoreModule.f18264c.f20381e0.m116613sa(list);
        CoreModule.f18264c.f20405m0.m31989C8("ice_break_question_set");
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f125860h4, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e;
        CoreSuggested.UserInfo userInfo;
        Object obj;
        if (!(view instanceof IceBreakQuestionCard) || (partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e()) == null || i >= partialListOptM222761e.loaded.size() || (obj = (userInfo = partialListOptM222761e.loaded.get(i)).extensionObject) == null || userInfo.virtualCardType != VirtualCardType.IceBreakQuestionOfflineCard) {
            return;
        }
        ((IceBreakQuestionCard) view).m40243h((List) obj, new y20() { // from class: l.fbm
            @Override // p153l.y20
            public final void call(Object obj2) {
                gbm.m129802h((List) obj2);
            }
        });
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        return swipeDirection == SwipeDirection.UP ? VSwipeStack.OnCardSwipeResult.back : VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
