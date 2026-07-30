package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C2466R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p149l.C17055gc;
import p149l.InterfaceC17741jc;
import p149l.gbl0;
import p149l.ig3;
import p149l.k250;
import p149l.kex;
import p149l.ubl0;

/* JADX INFO: loaded from: classes7.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = C2466R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    int activePointerId;

    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks;
    int collapsedOffset;
    private final ubl0.AbstractC20403c dragCallback;
    float elevation;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;

    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;

    @Nullable
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @Nullable
    WeakReference<View> nestedScrollingChildRef;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightMin;
    private int saveFlags;
    private BottomSheetBehavior<V>.SettleRunnable settleRunnable;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    int state;
    boolean touchingScrollingChild;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    ubl0 viewDragHelper;

    @Nullable
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f);

        public abstract void onStateChanged(@NonNull View view, int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SaveFlags {
    }

    public class SettleRunnable implements Runnable {
        private boolean isPosted;
        int targetState;
        private final View view;

        public SettleRunnable(View view, int i) {
            this.view = view;
            this.targetState = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ubl0 ubl0Var = BottomSheetBehavior.this.viewDragHelper;
            if (ubl0Var == null || !ubl0Var.m192868n(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            } else {
                gbl0.m125185b0(this.view, this);
            }
            this.isPosted = false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.saveFlags = 0;
        this.fitToContents = true;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.dragCallback = new ubl0.AbstractC20403c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // p149l.ubl0.AbstractC20403c
            public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // p149l.ubl0.AbstractC20403c
            public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return kex.m145807b(i2, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // p149l.ubl0.AbstractC20403c
            public int getViewVerticalDragRange(@NonNull View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // p149l.ubl0.AbstractC20403c
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // p149l.ubl0.AbstractC20403c
            public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.dispatchOnSlide(i3);
            }

            @Override // p149l.ubl0.AbstractC20403c
            public void onViewReleased(@NonNull View view, float f, float f2) {
                int i2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.fitToContents) {
                        i2 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        int top = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i4 = bottomSheetBehavior2.halfExpandedOffset;
                        if (top > i4) {
                            i2 = i4;
                        } else {
                            i2 = bottomSheetBehavior2.expandedOffset;
                        }
                    }
                    i3 = 3;
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2) && (view.getTop() > BottomSheetBehavior.this.collapsedOffset || Math.abs(f) < Math.abs(f2))) {
                    i2 = BottomSheetBehavior.this.parentHeight;
                    i3 = 5;
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    boolean z = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (z) {
                        int iAbs = Math.abs(top2 - bottomSheetBehavior3.fitToContentsOffset);
                        int iAbs2 = Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset);
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (iAbs < iAbs2) {
                            i2 = bottomSheetBehavior4.fitToContentsOffset;
                            i3 = 3;
                        } else {
                            i2 = bottomSheetBehavior4.collapsedOffset;
                            i3 = 4;
                        }
                    } else {
                        int i5 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top2 < i5) {
                            int iAbs3 = Math.abs(top2 - bottomSheetBehavior3.collapsedOffset);
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (top2 < iAbs3) {
                                i2 = bottomSheetBehavior5.expandedOffset;
                                i3 = 3;
                            } else {
                                i2 = bottomSheetBehavior5.halfExpandedOffset;
                            }
                        } else {
                            int iAbs4 = Math.abs(top2 - i5);
                            int iAbs5 = Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset);
                            BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                            if (iAbs4 < iAbs5) {
                                i2 = bottomSheetBehavior6.halfExpandedOffset;
                            } else {
                                i2 = bottomSheetBehavior6.collapsedOffset;
                                i3 = 4;
                            }
                        }
                    }
                } else {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i2 = BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top3 = view.getTop();
                        int iAbs6 = Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset);
                        int iAbs7 = Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset);
                        BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                        if (iAbs6 < iAbs7) {
                            i2 = bottomSheetBehavior7.halfExpandedOffset;
                        } else {
                            i2 = bottomSheetBehavior7.collapsedOffset;
                        }
                    }
                    i3 = 4;
                }
                BottomSheetBehavior.this.startSettlingAnimation(view, i3, i2, true);
            }

            @Override // p149l.ubl0.AbstractC20403c
            public boolean tryCaptureView(@NonNull View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.state;
                if (i3 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2466R.styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(C2466R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(C2466R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C2466R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            createMaterialShapeDrawable(context, attributeSet, zHasValue);
        }
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(C2466R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C2466R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(C2466R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(C2466R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        setExpandedOffset(typedArrayObtainStyledAttributes.getInt(C2466R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void addAccessibilityActionForState(V v2, C17055gc.a aVar, final int i) {
        gbl0.m125193f0(v2, aVar, null, new InterfaceC17741jc() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            @Override // p149l.InterfaceC17741jc
            public boolean perform(@NonNull View view, @Nullable InterfaceC17741jc.a aVar2) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        });
    }

    private void calculateCollapsedOffset() {
        int iMax = this.peekHeightAuto ? Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)) : this.peekHeight;
        boolean z = this.fitToContents;
        int i = this.parentHeight;
        if (z) {
            this.collapsedOffset = Math.max(i - iMax, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = i - iMax;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z, @Nullable ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, C2466R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z && colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(fFloatValue);
                }
            }
        });
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0229f)) {
            ig3.m135964a("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.AbstractC0226c abstractC0226cM1181f = ((CoordinatorLayout.C0229f) layoutParams).m1181f();
        if (abstractC0226cM1181f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC0226cM1181f;
        }
        ig3.m135964a("The view is not associated with BottomSheetBehavior");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void settleToStatePendingLayout(final int i) {
        final V v2 = this.viewRef.get();
        if (v2 == null) {
            return;
        }
        ViewParent parent = v2.getParent();
        if (parent != null && parent.isLayoutRequested() && gbl0.m125170O(v2)) {
            v2.post(new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.settleToState(v2, i);
                }
            });
        } else {
            settleToState(v2, i);
        }
    }

    private void updateAccessibilityActions() {
        V v2;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        gbl0.m125189d0(v2, 524288);
        gbl0.m125189d0(v2, 262144);
        gbl0.m125189d0(v2, 1048576);
        if (this.hideable && this.state != 5) {
            addAccessibilityActionForState(v2, C17055gc.a.f101970y, 5);
        }
        int i = this.state;
        if (i == 3) {
            addAccessibilityActionForState(v2, C17055gc.a.f101969x, this.fitToContents ? 4 : 6);
            return;
        }
        if (i == 4) {
            addAccessibilityActionForState(v2, C17055gc.a.f101968w, this.fitToContents ? 3 : 6);
        } else {
            if (i != 6) {
                return;
            }
            addAccessibilityActionForState(v2, C17055gc.a.f101969x, 4);
            addAccessibilityActionForState(v2, C17055gc.a.f101968w, 3);
        }
    }

    private void updateDrawableForTargetState(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f, f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    Map<View, Integer> map = this.importantForAccessibilityMap;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        gbl0.m125221t0(childAt, 4);
                    } else if (map != null && map.containsKey(childAt)) {
                        gbl0.m125221t0(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        float f;
        float expandedOffset;
        V v2 = this.viewRef.get();
        if (v2 == null || this.callbacks.isEmpty()) {
            return;
        }
        int i2 = this.collapsedOffset;
        if (i > i2) {
            f = i2 - i;
            expandedOffset = this.parentHeight - i2;
        } else {
            f = i2 - i;
            expandedOffset = i2 - getExpandedOffset();
        }
        float f2 = f / expandedOffset;
        for (int i3 = 0; i3 < this.callbacks.size(); i3++) {
            this.callbacks.get(i3).onSlide(v2, f2);
        }
    }

    @Nullable
    @VisibleForTesting
    public View findScrollingChild(View view) {
        if (gbl0.m125172Q(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.C0229f c0229f) {
        super.onAttachedToLayoutParams(c0229f);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
        ubl0 ubl0Var;
        if (!v2.isShown()) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v2, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (ubl0Var = this.viewDragHelper) != null && ubl0Var.m192852P(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.m192878z())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, int i) {
        MaterialShapeDrawable materialShapeDrawable;
        if (gbl0.m125222u(coordinatorLayout) && !gbl0.m125222u(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(C2466R.dimen.design_bottom_sheet_peek_height_min);
            this.viewRef = new WeakReference<>(v2);
            if (this.shapeThemingEnabled && (materialShapeDrawable = this.materialShapeDrawable) != null) {
                gbl0.m125207m0(v2, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
            if (materialShapeDrawable2 != null) {
                float fM125220t = this.elevation;
                if (fM125220t == -1.0f) {
                    fM125220t = gbl0.m125220t(v2);
                }
                materialShapeDrawable2.setElevation(fM125220t);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.setInterpolation(z ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (gbl0.m125224v(v2) == 0) {
                gbl0.m125221t0(v2, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ubl0.m192836p(coordinatorLayout, this.dragCallback);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i);
        this.parentWidth = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.parentHeight = height;
        this.fitToContentsOffset = Math.max(0, height - v2.getHeight());
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i2 = this.state;
        if (i2 == 3) {
            gbl0.m125177V(v2, getExpandedOffset());
        } else if (i2 == 6) {
            gbl0.m125177V(v2, this.halfExpandedOffset);
        } else if (this.hideable && i2 == 5) {
            gbl0.m125177V(v2, this.parentHeight);
        } else if (i2 == 4) {
            gbl0.m125177V(v2, this.collapsedOffset);
        } else if (i2 == 1 || i2 == 2) {
            gbl0.m125177V(v2, top - v2.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, float f, float f2) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        return weakReference != null && view == weakReference.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v2, view, f, f2));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v2.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                gbl0.m125177V(v2, -expandedOffset);
                setStateInternal(3);
            } else {
                iArr[1] = i2;
                gbl0.m125177V(v2, -i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.collapsedOffset;
            if (i4 <= i5 || this.hideable) {
                iArr[1] = i2;
                gbl0.m125177V(v2, -i2);
                setStateInternal(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                gbl0.m125177V(v2, -i6);
                setStateInternal(4);
            }
        }
        dispatchOnSlide(v2.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v2, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.state = 4;
        } else {
            this.state = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull View view, int i) {
        int expandedOffset;
        int i2 = 3;
        if (v2.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null && view == weakReference.get() && this.nestedScrolled) {
            if (this.lastNestedScrollDy > 0) {
                expandedOffset = getExpandedOffset();
            } else if (this.hideable && shouldHide(v2, getYVelocity())) {
                expandedOffset = this.parentHeight;
                i2 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v2.getTop();
                if (!this.fitToContents) {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                        if (top < Math.abs(top - this.collapsedOffset)) {
                            expandedOffset = this.expandedOffset;
                        } else {
                            expandedOffset = this.halfExpandedOffset;
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.collapsedOffset)) {
                        expandedOffset = this.halfExpandedOffset;
                    } else {
                        expandedOffset = this.collapsedOffset;
                        i2 = 4;
                    }
                    i2 = 6;
                } else if (Math.abs(top - this.fitToContentsOffset) < Math.abs(top - this.collapsedOffset)) {
                    expandedOffset = this.fitToContentsOffset;
                } else {
                    expandedOffset = this.collapsedOffset;
                    i2 = 4;
                }
            } else {
                if (this.fitToContents) {
                    expandedOffset = this.collapsedOffset;
                } else {
                    int top2 = v2.getTop();
                    if (Math.abs(top2 - this.halfExpandedOffset) < Math.abs(top2 - this.collapsedOffset)) {
                        expandedOffset = this.halfExpandedOffset;
                        i2 = 6;
                    } else {
                        expandedOffset = this.collapsedOffset;
                    }
                }
                i2 = 4;
            }
            startSettlingAnimation(v2, i2, expandedOffset, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v2, @NonNull MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        ubl0 ubl0Var = this.viewDragHelper;
        if (ubl0Var != null) {
            ubl0Var.m192843G(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.m192878z()) {
            this.viewDragHelper.m192857c(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
        } else {
            ig3.m135964a("offset must be greater than or equal to 0");
        }
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setHalfExpandedRatio(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            ig3.m135964a("ratio must be a float value between 0 and 1");
        } else {
            this.halfExpandedRatio = f;
        }
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public final void setPeekHeight(int i, boolean z) {
        V v2;
        boolean z2 = this.peekHeightAuto;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!z2 && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v2 = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                settleToStatePendingLayout(this.state);
            } else {
                v2.requestLayout();
            }
        }
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        if (this.viewRef != null) {
            settleToStatePendingLayout(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.state = i;
        }
    }

    public void setStateInternal(int i) {
        V v2;
        if (this.state == i) {
            return;
        }
        this.state = i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        if (i == 6 || i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v2, i);
        }
        updateAccessibilityActions();
    }

    public void settleToState(@NonNull View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.collapsedOffset;
        } else if (i == 6) {
            expandedOffset = this.halfExpandedOffset;
            if (this.fitToContents && expandedOffset <= (i2 = this.fitToContentsOffset)) {
                i = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else {
            if (!this.hideable || i != 5) {
                k250.m144273a("Illegal state argument: ", i);
                return;
            }
            expandedOffset = this.parentHeight;
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    public boolean shouldHide(@NonNull View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        return view.getTop() >= this.collapsedOffset && Math.abs((((float) view.getTop()) + (f * HIDE_FRICTION)) - ((float) this.collapsedOffset)) / ((float) this.peekHeight) > 0.5f;
    }

    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        ubl0 ubl0Var = this.viewDragHelper;
        if (!(z ? ubl0Var.m192851O(view.getLeft(), i2) : ubl0Var.m192853Q(view, view.getLeft(), i2))) {
            setStateInternal(i);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i);
        if (this.settleRunnable == null) {
            this.settleRunnable = new SettleRunnable(view, i);
        }
        boolean z2 = ((SettleRunnable) this.settleRunnable).isPosted;
        BottomSheetBehavior<V>.SettleRunnable settleRunnable = this.settleRunnable;
        if (z2) {
            settleRunnable.targetState = i;
            return;
        }
        settleRunnable.targetState = i;
        gbl0.m125185b0(view, settleRunnable);
        ((SettleRunnable) this.settleRunnable).isPosted = true;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, null);
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.dragCallback = new ubl0.AbstractC20403c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // p149l.ubl0.AbstractC20403c
            public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // p149l.ubl0.AbstractC20403c
            public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return kex.m145807b(i2, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // p149l.ubl0.AbstractC20403c
            public int getViewVerticalDragRange(@NonNull View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // p149l.ubl0.AbstractC20403c
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // p149l.ubl0.AbstractC20403c
            public void onViewPositionChanged(@NonNull View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.dispatchOnSlide(i3);
            }

            @Override // p149l.ubl0.AbstractC20403c
            public void onViewReleased(@NonNull View view, float f, float f2) {
                int i2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.fitToContents) {
                        i2 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        int top = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i4 = bottomSheetBehavior2.halfExpandedOffset;
                        if (top > i4) {
                            i2 = i4;
                        } else {
                            i2 = bottomSheetBehavior2.expandedOffset;
                        }
                    }
                    i3 = 3;
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2) && (view.getTop() > BottomSheetBehavior.this.collapsedOffset || Math.abs(f) < Math.abs(f2))) {
                    i2 = BottomSheetBehavior.this.parentHeight;
                    i3 = 5;
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    boolean z = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (z) {
                        int iAbs = Math.abs(top2 - bottomSheetBehavior3.fitToContentsOffset);
                        int iAbs2 = Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset);
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (iAbs < iAbs2) {
                            i2 = bottomSheetBehavior4.fitToContentsOffset;
                            i3 = 3;
                        } else {
                            i2 = bottomSheetBehavior4.collapsedOffset;
                            i3 = 4;
                        }
                    } else {
                        int i5 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top2 < i5) {
                            int iAbs3 = Math.abs(top2 - bottomSheetBehavior3.collapsedOffset);
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (top2 < iAbs3) {
                                i2 = bottomSheetBehavior5.expandedOffset;
                                i3 = 3;
                            } else {
                                i2 = bottomSheetBehavior5.halfExpandedOffset;
                            }
                        } else {
                            int iAbs4 = Math.abs(top2 - i5);
                            int iAbs5 = Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset);
                            BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                            if (iAbs4 < iAbs5) {
                                i2 = bottomSheetBehavior6.halfExpandedOffset;
                            } else {
                                i2 = bottomSheetBehavior6.collapsedOffset;
                                i3 = 4;
                            }
                        }
                    }
                } else {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i2 = BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top3 = view.getTop();
                        int iAbs6 = Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset);
                        int iAbs7 = Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset);
                        BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                        if (iAbs6 < iAbs7) {
                            i2 = bottomSheetBehavior7.halfExpandedOffset;
                        } else {
                            i2 = bottomSheetBehavior7.collapsedOffset;
                        }
                    }
                    i3 = 4;
                }
                BottomSheetBehavior.this.startSettlingAnimation(view, i3, i2, true);
            }

            @Override // p149l.ubl0.AbstractC20403c
            public boolean tryCaptureView(@NonNull View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.state;
                if (i3 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }
}
