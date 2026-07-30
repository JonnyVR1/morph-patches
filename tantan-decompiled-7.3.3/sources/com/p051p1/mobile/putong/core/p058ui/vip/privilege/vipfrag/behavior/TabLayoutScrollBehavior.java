package com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.TopCardLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/behavior/TabLayoutScrollBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "dependency", "", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z", "onDependentViewChanged", "a", "Landroid/view/View;", "getOppositeAlphaTargetView", "()Landroid/view/View;", "b", "(Landroid/view/View;)V", "oppositeAlphaTargetView", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TabLayoutScrollBehavior extends CoordinatorLayout.AbstractC0227c<View> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static int f38668b = qa00.f156322i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public View oppositeAlphaTargetView;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/behavior/TabLayoutScrollBehavior$a;", "", "<init>", "()V", "", "alphaShowMargin", "I", "a", "()I", "setAlphaShowMargin", "(I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m58620a() {
            return TabLayoutScrollBehavior.f38668b;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public TabLayoutScrollBehavior(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m58619b(@Nullable View view) {
        this.oppositeAlphaTargetView = view;
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
        float height = dependency.getHeight() - Math.abs(dependency.getTranslationY());
        if (height <= child.getHeight() + f38668b) {
            bnl0.m105524M(child, true);
            child.setAlpha(1.0f);
            View view = this.oppositeAlphaTargetView;
            if (view != null) {
                view.setAlpha(0.0f);
            }
        } else if (height <= (child.getHeight() * 2) + f38668b) {
            bnl0.m105524M(child, true);
            float height2 = (((height - child.getHeight()) - f38668b) * 1.0f) / child.getHeight();
            child.setAlpha(1.0f - height2);
            View view2 = this.oppositeAlphaTargetView;
            if (view2 != null) {
                view2.setAlpha(height2);
            }
        } else {
            bnl0.m105524M(child, false);
            child.setAlpha(0.0f);
            View view3 = this.oppositeAlphaTargetView;
            if (view3 != null) {
                view3.setAlpha(1.0f);
            }
        }
        return super.onDependentViewChanged(parent, child, dependency);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TabLayoutScrollBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ TabLayoutScrollBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
