package com.p051p1.mobile.putong.feed.p065ui.moments.entry.scalerv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Lcom/p1/mobile/putong/feed/ui/moments/entry/scalerv/OverlapLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$v;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "recyclerView", "", "position", "smoothScrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V", "", "a", "F", "millisecondPerInch", "b_feed_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class OverlapLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float millisecondPerInch;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.entry.scalerv.OverlapLinearLayoutManager$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"com/p1/mobile/putong/feed/ui/moments/entry/scalerv/OverlapLinearLayoutManager$a", "Landroidx/recyclerview/widget/n;", "", "targetPosition", "Landroid/graphics/PointF;", "computeScrollVectorForPosition", "(I)Landroid/graphics/PointF;", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "b_feed_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C11574a extends C0610n {
        public C11574a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            displayMetrics.getClass();
            return OverlapLinearLayoutManager.this.millisecondPerInch / displayMetrics.density;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public PointF computeScrollVectorForPosition(int targetPosition) {
            return OverlapLinearLayoutManager.this.computeScrollVectorForPosition(targetPosition);
        }
    }

    public OverlapLinearLayoutManager(@Nullable Context context) {
        Resources resources;
        DisplayMetrics displayMetrics;
        super(context, 0, false);
        Float fValueOf = (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? null : Float.valueOf(displayMetrics.density * 3.0f);
        fValueOf.getClass();
        this.millisecondPerInch = fValueOf.floatValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(@Nullable RecyclerView.C0586v recycler, @Nullable RecyclerView.C0561a0 state) {
        super.onLayoutChildren(recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.C0561a0 state, int position) {
        recyclerView.getClass();
        state.getClass();
        C11574a c11574a = new C11574a(recyclerView.getContext());
        c11574a.setTargetPosition(position);
        startSmoothScroll(c11574a);
    }
}
