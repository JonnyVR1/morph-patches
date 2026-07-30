package com.hellogroup.p036mk.business.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Lcom/hellogroup/mk/business/widget/MKResizeSafeListenerLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Rect;", "insets", "", "fitSystemWindows", "(Landroid/graphics/Rect;)Z", "Landroid/view/WindowInsets;", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "", "a", "[I", "mInsets", "b", "Z", "useShowSafeKeyBoard", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKResizeSafeListenerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int[] mInsets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean useShowSafeKeyBoard;

    public /* synthetic */ MKResizeSafeListenerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(@NotNull Rect insets) {
        insets.getClass();
        if (!this.useShowSafeKeyBoard) {
            return super.fitSystemWindows(insets);
        }
        int[] iArr = this.mInsets;
        iArr[0] = insets.left;
        iArr[1] = insets.top;
        iArr[2] = insets.right;
        insets.left = 0;
        insets.top = 0;
        insets.right = 0;
        return super.fitSystemWindows(insets);
    }

    @Override // android.view.View
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        insets.getClass();
        if (!this.useShowSafeKeyBoard) {
            WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
            windowInsetsOnApplyWindowInsets.getClass();
            return windowInsetsOnApplyWindowInsets;
        }
        this.mInsets[0] = insets.getSystemWindowInsetLeft();
        this.mInsets[1] = insets.getSystemWindowInsetTop();
        this.mInsets[2] = insets.getSystemWindowInsetRight();
        WindowInsets windowInsetsOnApplyWindowInsets2 = super.onApplyWindowInsets(insets.replaceSystemWindowInsets(0, 0, 0, insets.getSystemWindowInsetBottom()));
        windowInsetsOnApplyWindowInsets2.getClass();
        return windowInsetsOnApplyWindowInsets2;
    }

    @JvmOverloads
    public MKResizeSafeListenerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public MKResizeSafeListenerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MKResizeSafeListenerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.mInsets = new int[4];
    }
}
