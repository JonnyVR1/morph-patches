package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;

/* JADX INFO: loaded from: classes3.dex */
public interface sxl0 {
    /* JADX INFO: renamed from: b */
    void mo31007b(VSwipeCard vSwipeCard);

    /* JADX INFO: renamed from: c */
    void mo31008c(View view);

    /* JADX INFO: renamed from: d */
    View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType);

    /* JADX INFO: renamed from: e */
    void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2);

    /* JADX INFO: renamed from: f */
    boolean mo31011f();

    /* JADX INFO: renamed from: g */
    VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar);

    /* JADX INFO: renamed from: a */
    default void mo164283a() {
    }
}
