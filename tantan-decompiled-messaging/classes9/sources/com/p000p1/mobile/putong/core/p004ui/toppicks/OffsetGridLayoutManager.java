package com.p000p1.mobile.putong.core.p004ui.toppicks;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/OffsetGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "", "spanCount", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IIZ)V", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onLayoutCompleted", "(Landroidx/recyclerview/widget/RecyclerView$z;)V", "computeVerticalScrollOffset", "(Landroidx/recyclerview/widget/RecyclerView$z;)I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "position", "smoothScrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;I)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "Ljava/util/HashMap;", "heightMap", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OffsetGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, Integer> heightMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.toppicks.OffsetGridLayoutManager$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/OffsetGridLayoutManager$a;", "Landroidx/recyclerview/widget/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "(IIIII)I", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0354a extends n {
        public C0354a(@Nullable Context context) {
            super(context);
        }

        public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            return boxStart - viewStart;
        }
    }

    public OffsetGridLayoutManager(@Nullable Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        this.heightMap = new HashMap<>();
    }

    public int computeVerticalScrollOffset(@NotNull RecyclerView.z state) {
        state.getClass();
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
            View viewFindViewByPosition = findViewByPosition(iFindFirstVisibleItemPosition);
            int iIntValue = 0;
            for (int i = 0; i < iFindFirstVisibleItemPosition; i++) {
                Integer num = this.heightMap.get(Integer.valueOf(i));
                iIntValue += num != null ? num.intValue() : 0;
            }
            return iIntValue - (viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void onLayoutCompleted(@Nullable RecyclerView.z state) {
        super.onLayoutCompleted(state);
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindLastVisibleItemPosition < iFindFirstVisibleItemPosition) {
            return;
        }
        while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition) {
            View childAt = getChildAt(iFindFirstVisibleItemPosition);
            if (childAt != null) {
                GridLayoutManager.b layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                int iG = layoutParams.g();
                HashMap<Integer, Integer> map = this.heightMap;
                if (iG == 0) {
                    map.put(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(childAt.getHeight()));
                } else {
                    map.put(Integer.valueOf(iFindFirstVisibleItemPosition), 0);
                }
            }
            iFindFirstVisibleItemPosition++;
        }
    }

    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @Nullable RecyclerView.z state, int position) {
        recyclerView.getClass();
        C0354a c0354a = new C0354a(recyclerView.getContext());
        c0354a.setTargetPosition(position);
        startSmoothScroll(c0354a);
    }
}
