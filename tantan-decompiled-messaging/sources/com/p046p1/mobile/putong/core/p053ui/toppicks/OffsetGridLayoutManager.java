package com.p046p1.mobile.putong.core.p053ui.toppicks;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/OffsetGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "", "spanCount", Constants.KEY_ORIENTATION, "", "reverseLayout", "<init>", "(Landroid/content/Context;IIZ)V", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "onLayoutCompleted", "(Landroidx/recyclerview/widget/RecyclerView$z;)V", "computeVerticalScrollOffset", "(Landroidx/recyclerview/widget/RecyclerView$z;)I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "position", "smoothScrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;I)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "Ljava/util/HashMap;", "heightMap", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class OffsetGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, Integer> heightMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.toppicks.OffsetGridLayoutManager$a */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/OffsetGridLayoutManager$a;", "Landroidx/recyclerview/widget/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "(IIIII)I", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8918a extends C0608n {
        public C8918a(@Nullable Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            return boxStart - viewStart;
        }
    }

    public OffsetGridLayoutManager(@Nullable Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        this.heightMap = new HashMap<>();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeVerticalScrollOffset(@NotNull RecyclerView.C0588z state) {
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

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutCompleted(@Nullable RecyclerView.C0588z state) {
        super.onLayoutCompleted(state);
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindLastVisibleItemPosition < iFindFirstVisibleItemPosition) {
            return;
        }
        while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition) {
            View childAt = getChildAt(iFindFirstVisibleItemPosition);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                int iM3330g = ((GridLayoutManager.C0552b) layoutParams).m3330g();
                HashMap<Integer, Integer> map = this.heightMap;
                if (iM3330g == 0) {
                    map.put(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(childAt.getHeight()));
                } else {
                    map.put(Integer.valueOf(iFindFirstVisibleItemPosition), 0);
                }
            }
            iFindFirstVisibleItemPosition++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @Nullable RecyclerView.C0588z state, int position) {
        recyclerView.getClass();
        C8918a c8918a = new C8918a(recyclerView.getContext());
        c8918a.setTargetPosition(position);
        startSmoothScroll(c8918a);
    }
}
