package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.home.view.DailySelectionAdCardView;

/* JADX INFO: loaded from: classes10.dex */
public class w0c implements ool0 {
    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111730y, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof DailySelectionAdCardView) {
            ((DailySelectionAdCardView) view).m46100h();
            if (i == 0) {
                zvf0.m220402x("e_selected_users_intro_card", "p_suggest_users_home_view");
            }
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            ura.m195053e().m195057d().mo33905qa((Act) t7mVar.getIVirtualCardContext(), "selected_users_intro_card");
        }
        zvf0.m220401w("e_selected_users_intro_card", "p_suggest_users_home_view", new j760[0]);
        return VSwipeStack.OnCardSwipeResult.pass;
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
