package com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.behavior.RecycleViewYBehavior;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.TopCardLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.kkl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ?\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/behavior/RecycleViewYBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "dependency", "", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z", "onDependentViewChanged", "coordinatorLayout", "directTargetChild", Target.TYPE, "", "axes", "type", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "dx", "dy", "", "consumed", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "", "a", "F", "MaxHeight", "Landroid/animation/ValueAnimator;", "b", "Landroid/animation/ValueAnimator;", "getValueAnimator", "()Landroid/animation/ValueAnimator;", "setValueAnimator", "(Landroid/animation/ValueAnimator;)V", "valueAnimator", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;", "c", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;", "getViewPager", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;", "setViewPager", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;)V", "viewPager", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RecycleViewYBehavior extends CoordinatorLayout.AbstractC0227c<View> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float MaxHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public TopCardLayout viewPager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecycleViewYBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.MaxHeight = qa00.f156298K * 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public static final void m58617b(View view, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        ((RecyclerView) view).setTranslationY(((Float) animatedValue).floatValue());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        parent.getClass();
        child.getClass();
        dependency.getClass();
        return dependency instanceof TopCardLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull View child, @NotNull View dependency) {
        parent.getClass();
        child.getClass();
        dependency.getClass();
        float height = dependency.getHeight() + dependency.getTranslationY();
        ViewGroup.LayoutParams layoutParams = dependency.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float f = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = dependency.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? layoutParams2 : null);
        float f2 = f + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        child.setY(f2);
        return super.onDependentViewChanged(parent, child, dependency);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View child, @NotNull View target, int dx, int dy, @NotNull int[] consumed, int type) {
        TopCardLayout topCardLayout;
        ValueAnimator valueAnimator;
        View next;
        coordinatorLayout.getClass();
        child.getClass();
        target.getClass();
        consumed.getClass();
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type);
        boolean z = target instanceof RecyclerView;
        if (!z || (((valueAnimator = this.valueAnimator) != null && valueAnimator.isRunning()) || type != 0)) {
            if (z && type == 1) {
                RecyclerView recyclerView = (RecyclerView) target;
                RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
                layoutManager.getClass();
                int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                RecyclerView.AbstractC0579o layoutManager2 = recyclerView.getLayoutManager();
                layoutManager2.getClass();
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition();
                RecyclerView.AbstractC0579o layoutManager3 = recyclerView.getLayoutManager();
                layoutManager3.getClass();
                ((LinearLayoutManager) layoutManager3).findViewByPosition(8);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (iFindLastVisibleItemPosition == (adapter != null ? adapter.getItemCount() : 0) - 1 && !target.canScrollVertically(1)) {
                    kkl0.m150127I0(target, 1);
                    return;
                } else {
                    if (iFindFirstCompletelyVisibleItemPosition != 0 || (topCardLayout = this.viewPager) == null) {
                        return;
                    }
                    if (Intrinsics.m88376c(topCardLayout != null ? Float.valueOf(topCardLayout.getTranslationY()) : null, 0.0f)) {
                        kkl0.m150127I0(target, 1);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.viewPager == null) {
            Iterator<View> it = ViewGroupKt.m1330b(coordinatorLayout).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof TopCardLayout));
            next.getClass();
            this.viewPager = (TopCardLayout) next;
        }
        RecyclerView recyclerView2 = (RecyclerView) target;
        if (recyclerView2.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0579o layoutManager4 = recyclerView2.getLayoutManager();
        layoutManager4.getClass();
        int iFindFirstCompletelyVisibleItemPosition2 = ((LinearLayoutManager) layoutManager4).findFirstCompletelyVisibleItemPosition();
        TopCardLayout topCardLayout2 = this.viewPager;
        if (Intrinsics.m88376c(topCardLayout2 != null ? Float.valueOf(topCardLayout2.getTranslationY()) : null, 0.0f)) {
            float f = dy;
            if (f >= 0.0f || recyclerView2.getTranslationY() < 0.0f || recyclerView2.getTranslationY() >= this.MaxHeight || iFindFirstCompletelyVisibleItemPosition2 != 0) {
                if (f <= 0.0f || recyclerView2.getTranslationY() <= 0.0f) {
                    return;
                }
                float translationY = recyclerView2.getTranslationY() - f;
                recyclerView2.setTranslationY(translationY > 0.0f ? translationY : 0.0f);
                consumed[1] = dy;
                return;
            }
            float translationY2 = recyclerView2.getTranslationY() - f;
            float f2 = this.MaxHeight;
            if (translationY2 >= f2) {
                translationY2 = f2;
            }
            recyclerView2.setTranslationY(translationY2);
            consumed[1] = dy;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View child, @NotNull View directTargetChild, @NotNull View target, int axes, int type) {
        coordinatorLayout.getClass();
        child.getClass();
        directTargetChild.getClass();
        target.getClass();
        return (axes & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View child, @NotNull final View target, int type) {
        coordinatorLayout.getClass();
        child.getClass();
        target.getClass();
        super.onStopNestedScroll(coordinatorLayout, child, target, type);
        if (target instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) target;
            if (recyclerView.getTranslationY() > 0.0f) {
                ValueAnimator valueAnimator = this.valueAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(recyclerView.getTranslationY(), 0.0f);
                    this.valueAnimator = valueAnimatorOfFloat;
                    if (valueAnimatorOfFloat != null) {
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mrc0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                RecycleViewYBehavior.m58617b(target, valueAnimator2);
                            }
                        });
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.start();
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public RecycleViewYBehavior(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ RecycleViewYBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
