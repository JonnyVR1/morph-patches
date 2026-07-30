package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;

/* JADX INFO: loaded from: classes10.dex */
public interface ool0 {
    /* JADX INFO: renamed from: b */
    void mo30009b(VSwipeCard vSwipeCard);

    /* JADX INFO: renamed from: c */
    void mo30010c(View view);

    /* JADX INFO: renamed from: d */
    View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType);

    /* JADX INFO: renamed from: e */
    void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2);

    /* JADX INFO: renamed from: f */
    boolean mo30013f();

    /* JADX INFO: renamed from: g */
    VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar);

    /* JADX INFO: renamed from: a */
    default void mo120980a() {
    }
}
