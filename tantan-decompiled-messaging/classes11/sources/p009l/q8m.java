package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.icebreak.IceBreakQuestionCard;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import java.util.List;
import l.e30;
import l.f6c0;
import l.ool0;
import l.t7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class q8m implements ool0 {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m20840h(List list) {
        o8m.m19650a().m19653d();
        CoreModule.c.e0.sa(list);
        CoreModule.c.m0.C8("ice_break_question_set");
    }

    /* JADX INFO: renamed from: d */
    public View m20843d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.h4, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m20844e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        PartialListOpt partialListOpt;
        CoreSuggested.UserInfo userInfo;
        Object obj;
        if (!(view instanceof IceBreakQuestionCard) || (partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e()) == null || i >= partialListOpt.loaded.size() || (obj = (userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i)).extensionObject) == null || userInfo.virtualCardType != VirtualCardType.IceBreakQuestionOfflineCard) {
            return;
        }
        ((IceBreakQuestionCard) view).m3258h((List) obj, new e30() { // from class: l.p8m
            public final void call(Object obj2) {
                q8m.m20840h((List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public boolean m20845f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m20846g(SwipeDirection swipeDirection, t7m t7mVar) {
        return swipeDirection == SwipeDirection.UP ? VSwipeStack.OnCardSwipeResult.back : VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m20841b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m20842c(View view) {
    }
}
