package com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.TopCardLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/behavior/ViewPagerScrollBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "child", "Landroid/view/View;", "directTargetChild", Target.TYPE, "", "axes", "type", "", "b", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "", "a", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;Landroid/view/View;II[II)V", "[I", "getLocation", "()[I", "setLocation", "([I)V", "location", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ViewPagerScrollBehavior extends CoordinatorLayout.AbstractC0227c<TopCardLayout> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public int[] location;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewPagerScrollBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.location = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull TopCardLayout child, @NotNull View target, int dx, int dy, @NotNull int[] consumed, int type) {
        coordinatorLayout.getClass();
        child.getClass();
        target.getClass();
        consumed.getClass();
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type);
        int height = child.getHeight();
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        int i2 = i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        RecyclerView recyclerView = (RecyclerView) target;
        if (recyclerView.getTranslationY() != 0.0f || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        RecyclerView.AbstractC0579o layoutManager2 = recyclerView.getLayoutManager();
        layoutManager2.getClass();
        int iFindLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findLastCompletelyVisibleItemPosition();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (iFindLastCompletelyVisibleItemPosition == (adapter != null ? adapter.getItemCount() : 0) - 1 && iFindFirstCompletelyVisibleItemPosition == 0 && (recyclerView.getHeight() - i2) + child.getTranslationY() > recyclerView.getChildAt(iFindLastCompletelyVisibleItemPosition).getBottom()) {
            return;
        }
        float f = dy;
        if (f < 0.0f && child.getTranslationY() >= (-i2) && iFindFirstCompletelyVisibleItemPosition == 0) {
            float translationY = child.getTranslationY() - f;
            child.setTranslationY(translationY < 0.0f ? translationY : 0.0f);
            consumed[1] = dy;
        } else if (f > 0.0f) {
            float f2 = i2;
            if (f2 > (-child.getTranslationY())) {
                float translationY2 = child.getTranslationY() - f;
                if (translationY2 < (-i2)) {
                    translationY2 = -f2;
                }
                child.setTranslationY(translationY2);
                consumed[1] = dy;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull TopCardLayout child, @NotNull View directTargetChild, @NotNull View target, int axes, int type) {
        coordinatorLayout.getClass();
        child.getClass();
        directTargetChild.getClass();
        target.getClass();
        return (axes & 2) != 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ViewPagerScrollBehavior(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ ViewPagerScrollBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
