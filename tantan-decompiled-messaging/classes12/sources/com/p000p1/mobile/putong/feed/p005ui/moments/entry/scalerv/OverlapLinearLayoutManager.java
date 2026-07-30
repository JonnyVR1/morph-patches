package com.p000p1.mobile.putong.feed.p005ui.moments.entry.scalerv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Position;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/p1/mobile/putong/feed/ui/moments/entry/scalerv/OverlapLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView$v;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$z;", Channel.state, "", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$z;)V", "recyclerView", "", Position.TYPE, "smoothScrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;I)V", "", "a", "F", "millisecondPerInch", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OverlapLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float millisecondPerInch;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.entry.scalerv.OverlapLinearLayoutManager$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/p1/mobile/putong/feed/ui/moments/entry/scalerv/OverlapLinearLayoutManager$a", "Landroidx/recyclerview/widget/n;", "", "targetPosition", "Landroid/graphics/PointF;", "computeScrollVectorForPosition", "(I)Landroid/graphics/PointF;", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "calculateSpeedPerPixel", "(Landroid/util/DisplayMetrics;)F", "b_feed_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2255a extends n {
        public C2255a(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            displayMetrics.getClass();
            return OverlapLinearLayoutManager.this.millisecondPerInch / displayMetrics.density;
        }

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

    public void onLayoutChildren(@Nullable RecyclerView.v recycler, @Nullable RecyclerView.z state) {
        super.onLayoutChildren(recycler, state);
    }

    public void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.z state, int position) {
        recyclerView.getClass();
        state.getClass();
        C2255a c2255a = new C2255a(recyclerView.getContext());
        c2255a.setTargetPosition(position);
        startSmoothScroll(c2255a);
    }
}
