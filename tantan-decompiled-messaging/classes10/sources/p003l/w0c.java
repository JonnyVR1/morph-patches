package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.home.view.DailySelectionAdCardView;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.i6c0;
import l.j760;
import l.ura;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class w0c implements ool0 {
    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.y, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof DailySelectionAdCardView) {
            ((DailySelectionAdCardView) view).m3465h();
            if (i == 0) {
                zvf0.x("e_selected_users_intro_card", "p_suggest_users_home_view");
            }
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            ura.e().d().qa(t7mVar.getIVirtualCardContext(), "selected_users_intro_card");
        }
        zvf0.w("e_selected_users_intro_card", "p_suggest_users_home_view", new j760[0]);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
    }
}
