package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public interface ool0 {
    /* JADX INFO: renamed from: b */
    void mo5286b(VSwipeCard vSwipeCard);

    /* JADX INFO: renamed from: c */
    void mo5287c(View view);

    /* JADX INFO: renamed from: d */
    View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType);

    /* JADX INFO: renamed from: e */
    void mo5289e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2);

    /* JADX INFO: renamed from: f */
    boolean mo5290f();

    /* JADX INFO: renamed from: g */
    VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar);

    /* JADX INFO: renamed from: a */
    default void mo8547a() {
    }
}
