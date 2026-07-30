package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.icebreak.IceBreakQuestionCard;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class q8m implements ool0 {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m173416h(List list) {
        o8m.m163183a().m163186d();
        CoreModule.f17545c.f19639e0.m169540sa(list);
        CoreModule.f17545c.f19663m0.m30986C8("ice_break_question_set");
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95806h4, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e;
        CoreSuggested.UserInfo userInfo;
        Object obj;
        if (!(view instanceof IceBreakQuestionCard) || (partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e()) == null || i >= partialListOptM221515e.loaded.size() || (obj = (userInfo = partialListOptM221515e.loaded.get(i)).extensionObject) == null || userInfo.virtualCardType != VirtualCardType.IceBreakQuestionOfflineCard) {
            return;
        }
        ((IceBreakQuestionCard) view).m39240h((List) obj, new e30() { // from class: l.p8m
            @Override // p149l.e30
            public final void call(Object obj2) {
                q8m.m173416h((List) obj2);
            }
        });
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        return swipeDirection == SwipeDirection.UP ? VSwipeStack.OnCardSwipeResult.back : VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
