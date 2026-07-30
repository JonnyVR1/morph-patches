package com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.putong.core.data.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/MLiveNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "child", Target.TYPE, "", "axes", "type", "", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "F", "I", "getTopHeight", "()I", "setTopHeight", "(I)V", "topHeight", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class MLiveNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int topHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLiveNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public final int getTopHeight() {
        return this.topHeight;
    }

    @Override // androidx.core.widget.NestedScrollView, p153l.ci20
    public void onNestedPreScroll(@NotNull View target, int dx, int dy, @NotNull int[] consumed, int type) {
        target.getClass();
        consumed.getClass();
        super.onNestedPreScroll(target, dx, dy, consumed, type);
        if (dy > 0) {
            int scrollY = getScrollY() + dy;
            int i = this.topHeight;
            if (scrollY < i) {
                int iMin = Integer.min(dy, i - getScrollY());
                scrollBy(0, iMin);
                consumed[1] = iMin;
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, p153l.ci20
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int axes, int type) {
        child.getClass();
        target.getClass();
        return true;
    }

    public final void setTopHeight(int i) {
        this.topHeight = i;
    }
}
