package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.C2489R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import p153l.dgq0;
import p153l.il50;
import p153l.j26;
import p153l.jhx;
import p153l.kkl0;
import p153l.l950;
import p153l.oce;
import p153l.ugc0;

/* JADX INFO: loaded from: classes7.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;

    @NonNull
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;

    @Nullable
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;

    @Nullable
    dgq0 lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @Nullable
    Drawable statusBarScrim;
    private final Rect tmpRect;

    @Nullable
    private Toolbar toolbar;

    @Nullable
    private View toolbarDirectChild;
    private int toolbarId;

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout;
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout2.currentOffset = i;
            dgq0 dgq0Var = collapsingToolbarLayout2.lastInsets;
            int iM115686l = dgq0Var != null ? dgq0Var.m115686l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            int i2 = 0;
            while (true) {
                collapsingToolbarLayout = CollapsingToolbarLayout.this;
                if (i2 >= childCount) {
                    break;
                }
                View childAt = collapsingToolbarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i3 = layoutParams.collapseMode;
                if (i3 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(jhx.m144942b(-i, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i3 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i) * layoutParams.parallaxMult));
                }
                i2++;
            }
            collapsingToolbarLayout.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout3.statusBarScrim != null && iM115686l > 0) {
                kkl0.m150146a0(collapsingToolbarLayout3);
            }
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(Math.abs(i) / ((CollapsingToolbarLayout.this.getHeight() - kkl0.m150193y(CollapsingToolbarLayout.this)) - iM115686l));
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C2489R.styleable.CollapsingToolbarLayout, i, C2489R.style.Widget_Design_CollapsingToolbar, new int[0]);
        collapsingTextHelper.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(C2489R.styleable.CollapsingToolbarLayout_expandedTitleGravity, BadgeDrawable.BOTTOM_START));
        collapsingTextHelper.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(C2489R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(C2489R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(C2489R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(C2489R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(ugc0.f178882c);
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(C2489R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(C2489R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(C2489R.styleable.CollapsingToolbarLayout_statusBarScrim));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(C2489R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        kkl0.m150194y0(this, new il50() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // p153l.il50
            public dgq0 onApplyWindowInsets(View view, @NonNull dgq0 dgq0Var) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(dgq0Var);
            }
        });
    }

    private void animateScrim(int i) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setDuration(this.scrimAnimationDuration);
            this.scrimAnimator.setInterpolator(i > this.scrimAlpha ? AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR : AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setIntValues(this.scrimAlpha, i);
        this.scrimAnimator.start();
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            Toolbar toolbar = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i = this.toolbarId;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.toolbar = toolbar2;
                if (toolbar2 != null) {
                    this.toolbarDirectChild = findDirectChild(toolbar2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                }
                this.toolbar = toolbar;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    @NonNull
    private View findDirectChild(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private static int getHeightWithMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @NonNull
    public static ViewOffsetHelper getViewOffsetHelper(@NonNull View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(C2489R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(C2489R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        if (view2 == null || view2 == this) {
            return view == this.toolbar;
        }
        return view == view2;
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            this.collapsingTextHelper.draw(canvas);
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        dgq0 dgq0Var = this.lastInsets;
        int iM115686l = dgq0Var != null ? dgq0Var.m115686l() : 0;
        if (iM115686l > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), iM115686l - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z = false;
        } else {
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    public final int getMaxOffsetForPinChild(@NonNull View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.scrimVisibleHeightTrigger;
        if (i >= 0) {
            return i;
        }
        dgq0 dgq0Var = this.lastInsets;
        int iM115686l = dgq0Var != null ? dgq0Var.m115686l() : 0;
        int iM150193y = kkl0.m150193y(this);
        return iM150193y > 0 ? Math.min((iM150193y * 2) + iM115686l, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof AppBarLayout) {
            kkl0.m150180r0(this, kkl0.m150185u((View) parent));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            ((AppBarLayout) parent).addOnOffsetChangedListener(this.onOffsetChangedListener);
            kkl0.m150158g0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        dgq0 dgq0Var = this.lastInsets;
        if (dgq0Var != null) {
            int iM115686l = dgq0Var.m115686l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!kkl0.m150185u(childAt) && childAt.getTop() < iM115686l) {
                    kkl0.m150140V(childAt, iM115686l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            getViewOffsetHelper(getChildAt(i6)).onViewLayout();
        }
        if (this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            boolean z2 = kkl0.m150133O(view) && this.dummyView.getVisibility() == 0;
            this.drawCollapsingTitle = z2;
            if (z2) {
                boolean z3 = kkl0.m150191x(this) == 1;
                View view2 = this.toolbarDirectChild;
                if (view2 == null) {
                    view2 = this.toolbar;
                }
                int maxOffsetForPinChild = getMaxOffsetForPinChild(view2);
                DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
                CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
                int i7 = this.tmpRect.left;
                Toolbar toolbar = this.toolbar;
                int titleMarginEnd = i7 + (z3 ? toolbar.getTitleMarginEnd() : toolbar.getTitleMarginStart());
                int titleMarginTop = this.tmpRect.top + maxOffsetForPinChild + this.toolbar.getTitleMarginTop();
                int i8 = this.tmpRect.right;
                Toolbar toolbar2 = this.toolbar;
                collapsingTextHelper.setCollapsedBounds(titleMarginEnd, titleMarginTop, i8 + (z3 ? toolbar2.getTitleMarginStart() : toolbar2.getTitleMarginEnd()), (this.tmpRect.bottom + maxOffsetForPinChild) - this.toolbar.getTitleMarginBottom());
                this.collapsingTextHelper.setExpandedBounds(z3 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i3 - i) - (z3 ? this.expandedMarginStart : this.expandedMarginEnd), (i4 - i2) - this.expandedMarginBottom);
                this.collapsingTextHelper.recalculate();
            }
        }
        if (this.toolbar != null) {
            if (this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
                setTitle(this.toolbar.getTitle());
            }
            View view3 = this.toolbarDirectChild;
            if (view3 == null || view3 == this) {
                setMinimumHeight(getHeightWithMargins(this.toolbar));
            } else {
                setMinimumHeight(getHeightWithMargins(view3));
            }
        }
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i9 = 0; i9 < childCount3; i9++) {
            getViewOffsetHelper(getChildAt(i9)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ensureToolbar();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        dgq0 dgq0Var = this.lastInsets;
        int iM115686l = dgq0Var != null ? dgq0Var.m115686l() : 0;
        if (mode != 0 || iM115686l <= 0) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM115686l, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public dgq0 onWindowInsetChanged(@NonNull dgq0 dgq0Var) {
        dgq0 dgq0Var2 = kkl0.m150185u(this) ? dgq0Var : null;
        if (!l950.m153327a(this.lastInsets, dgq0Var2)) {
            this.lastInsets = dgq0Var2;
            requestLayout();
        }
        return dgq0Var.m115677c();
    }

    public void setCollapsedTitleGravity(int i) {
        this.collapsingTextHelper.setCollapsedTextGravity(i);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            kkl0.m150146a0(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@DrawableRes int i) {
        setContentScrim(j26.m143192e(getContext(), i));
    }

    public void setExpandedTitleColor(@ColorInt int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.collapsingTextHelper.setExpandedTextGravity(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.expandedMarginStart = i;
        this.expandedMarginTop = i2;
        this.expandedMarginEnd = i3;
        this.expandedMarginBottom = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.expandedMarginBottom = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.expandedMarginEnd = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.expandedMarginStart = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.expandedMarginTop = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i) {
        this.collapsingTextHelper.setExpandedTextAppearance(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.scrimAlpha) {
            if (this.contentScrim != null && (toolbar = this.toolbar) != null) {
                kkl0.m150146a0(toolbar);
            }
            this.scrimAlpha = i;
            kkl0.m150146a0(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j) {
        this.scrimAnimationDuration = j;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i) {
        if (this.scrimVisibleHeightTrigger != i) {
            this.scrimVisibleHeightTrigger = i;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.scrimsAreShown != z) {
            if (z2) {
                animateScrim(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.scrimsAreShown = z;
        }
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                oce.m167173m(this.statusBarScrim, kkl0.m150191x(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            kkl0.m150146a0(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@DrawableRes int i) {
        setStatusBarScrim(j26.m143192e(getContext(), i));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z) {
            this.statusBarScrim.setVisible(z, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.contentScrim.setVisible(z, false);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, kkl0.m150134P(this) && !isInEditMode());
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2489R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(C2489R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(C2489R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i) {
            this.collapseMode = i;
        }

        public void setParallaxMultiplier(float f) {
            this.parallaxMult = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }
}
