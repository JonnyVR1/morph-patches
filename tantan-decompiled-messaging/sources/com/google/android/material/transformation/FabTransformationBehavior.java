package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C2466R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;
import p149l.gbl0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    public static class FabTransformationSpec {
        public Positioning positioning;

        @Nullable
        public MotionSpec timings;
    }

    public FabTransformationBehavior() {
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    @Nullable
    private ViewGroup calculateChildContentContainer(@NonNull View view) {
        View viewFindViewById = view.findViewById(C2466R.id.mtrl_child_content_container);
        if (viewFindViewById != null) {
            return toViewGroupOrNull(viewFindViewById);
        }
        return ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? toViewGroupOrNull(((ViewGroup) view).getChildAt(0)) : toViewGroupOrNull(view);
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(@NonNull View view, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, @NonNull MotionTiming motionTiming2, float f, float f2, float f3, float f4, @NonNull RectF rectF) {
        float fCalculateValueOfAnimationAtEndOfExpansion = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming, f, f3);
        float fCalculateValueOfAnimationAtEndOfExpansion2 = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming2, f2, f4);
        Rect rect = this.tmpRect;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.tmpRectF1;
        rectF2.set(rect);
        RectF rectF3 = this.tmpRectF2;
        calculateWindowBounds(view, rectF3);
        rectF3.offset(fCalculateValueOfAnimationAtEndOfExpansion, fCalculateValueOfAnimationAtEndOfExpansion2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void calculateDependencyWindowBounds(@NonNull View view, @NonNull RectF rectF) {
        calculateWindowBounds(view, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
    }

    @NonNull
    private Pair<MotionTiming, MotionTiming> calculateMotionTiming(float f, float f2, boolean z, @NonNull FabTransformationSpec fabTransformationSpec) {
        MotionTiming timing;
        MotionTiming timing2;
        if (f == 0.0f || f2 == 0.0f) {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
            timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
        }
        return new Pair<>(timing, timing2);
    }

    private float calculateRevealCenterX(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(-calculateTranslationX(view, view2, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float calculateRevealCenterY(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(0.0f, -calculateTranslationY(view, view2, positioning));
        return rectF.centerY() - rectF2.top;
    }

    private float calculateTranslationX(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float fCenterX;
        float fCenterX2;
        float f;
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        int i = positioning.gravity & 7;
        if (i == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f + positioning.xAdjustment;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f = fCenterX - fCenterX2;
        return f + positioning.xAdjustment;
    }

    private float calculateTranslationY(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float fCenterY;
        float fCenterY2;
        float f;
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        int i = positioning.gravity & 112;
        if (i == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f + positioning.yAdjustment;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f = fCenterY - fCenterY2;
        return f + positioning.yAdjustment;
    }

    private float calculateValueOfAnimationAtEndOfExpansion(@NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, float f, float f2) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return AnimationUtils.lerp(f, f2, motionTiming.getInterpolator().getInterpolation((((timing.getDelay() + timing.getDuration()) + 17) - delay) / duration));
    }

    private void calculateWindowBounds(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.tmpArray;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void createChildrenFadeAnimation(View view, View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupCalculateChildContentContainer;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof CircularRevealWidget) && CircularRevealHelper.STRATEGY == 0) || (viewGroupCalculateChildContentContainer = calculateChildContentContainer(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    ChildrenAlphaProperty.CHILDREN_ALPHA.set(viewGroupCalculateChildContentContainer, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupCalculateChildContentContainer, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupCalculateChildContentContainer, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
            }
            fabTransformationSpec.timings.getTiming("contentFade").apply(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createColorAnimation(@NonNull View view, View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof CircularRevealWidget) {
            CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            int backgroundTint = getBackgroundTint(view);
            int i = 16777215 & backgroundTint;
            if (z) {
                if (!z2) {
                    circularRevealWidget.setCircularRevealScrimColor(backgroundTint);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, backgroundTint);
            }
            objectAnimatorOfInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
            fabTransformationSpec.timings.getTiming("color").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void createDependencyTranslationAnimation(@NonNull View view, @NonNull View view2, boolean z, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list) {
        float fCalculateTranslationX = calculateTranslationX(view, view2, fabTransformationSpec.positioning);
        float fCalculateTranslationY = calculateTranslationY(view, view2, fabTransformationSpec.positioning);
        Pair<MotionTiming, MotionTiming> pairCalculateMotionTiming = calculateMotionTiming(fCalculateTranslationX, fCalculateTranslationY, z, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) pairCalculateMotionTiming.first;
        MotionTiming motionTiming2 = (MotionTiming) pairCalculateMotionTiming.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fCalculateTranslationX = this.dependencyOriginalTranslationX;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fCalculateTranslationX);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            fCalculateTranslationY = this.dependencyOriginalTranslationY;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fCalculateTranslationY);
        motionTiming.apply(objectAnimatorOfFloat);
        motionTiming2.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void createElevationAnimation(View view, @NonNull View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fM125220t = gbl0.m125220t(view2) - gbl0.m125220t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fM125220t);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM125220t);
        }
        fabTransformationSpec.timings.getTiming("elevation").apply(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createExpansionAnimation(@NonNull View view, View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, float f, float f2, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animatorCreateCircularReveal;
        if (view2 instanceof CircularRevealWidget) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            float fCalculateRevealCenterX = calculateRevealCenterX(view, view2, fabTransformationSpec.positioning);
            float fCalculateRevealCenterY = calculateRevealCenterY(view, view2, fabTransformationSpec.positioning);
            ((FloatingActionButton) view).getContentRect(this.tmpRect);
            float fWidth = this.tmpRect.width() / 2.0f;
            MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
            if (z) {
                if (!z2) {
                    circularRevealWidget.setRevealInfo(new CircularRevealWidget.RevealInfo(fCalculateRevealCenterX, fCalculateRevealCenterY, fWidth));
                }
                if (z2) {
                    fWidth = circularRevealWidget.getRevealInfo().radius;
                }
                animatorCreateCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget, fCalculateRevealCenterX, fCalculateRevealCenterY, MathUtils.distanceToFurthestCorner(fCalculateRevealCenterX, fCalculateRevealCenterY, 0.0f, 0.0f, f, f2));
                animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
                        revealInfo.radius = Float.MAX_VALUE;
                        circularRevealWidget.setRevealInfo(revealInfo);
                    }
                });
                createPreFillRadialExpansion(view2, timing.getDelay(), (int) fCalculateRevealCenterX, (int) fCalculateRevealCenterY, fWidth, list);
            } else {
                float f3 = circularRevealWidget.getRevealInfo().radius;
                Animator animatorCreateCircularReveal2 = CircularRevealCompat.createCircularReveal(circularRevealWidget, fCalculateRevealCenterX, fCalculateRevealCenterY, fWidth);
                int i = (int) fCalculateRevealCenterX;
                int i2 = (int) fCalculateRevealCenterY;
                createPreFillRadialExpansion(view2, timing.getDelay(), i, i2, f3, list);
                createPostFillRadialExpansion(view2, timing.getDelay(), timing.getDuration(), fabTransformationSpec.timings.getTotalDuration(), i, i2, fWidth, list);
                animatorCreateCircularReveal = animatorCreateCircularReveal2;
            }
            timing.apply(animatorCreateCircularReveal);
            list.add(animatorCreateCircularReveal);
            list2.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createIconFadeAnimation(View view, final View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    view2.invalidate();
                }
            });
            fabTransformationSpec.timings.getTiming("iconFade").apply(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(null);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                }
            });
        }
    }

    private void createPostFillRadialExpansion(View view, long j, long j2, long j3, int i, int i2, float f, @NonNull List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(j4);
            animatorCreateCircularReveal.setDuration(j3 - j4);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void createPreFillRadialExpansion(View view, long j, int i, int i2, float f, @NonNull List<Animator> list) {
        if (j > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void createTranslationAnimation(@NonNull View view, @NonNull View view2, boolean z, boolean z2, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        MotionTiming motionTiming;
        MotionTiming motionTiming2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fCalculateTranslationX = calculateTranslationX(view, view2, fabTransformationSpec.positioning);
        float fCalculateTranslationY = calculateTranslationY(view, view2, fabTransformationSpec.positioning);
        Pair<MotionTiming, MotionTiming> pairCalculateMotionTiming = calculateMotionTiming(fCalculateTranslationX, fCalculateTranslationY, z, fabTransformationSpec);
        MotionTiming motionTiming3 = (MotionTiming) pairCalculateMotionTiming.first;
        MotionTiming motionTiming4 = (MotionTiming) pairCalculateMotionTiming.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fCalculateTranslationX);
                view2.setTranslationY(-fCalculateTranslationY);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            motionTiming = motionTiming4;
            motionTiming2 = motionTiming3;
            calculateChildVisibleBoundsAtEndOfExpansion(view2, fabTransformationSpec, motionTiming2, motionTiming, -fCalculateTranslationX, -fCalculateTranslationY, 0.0f, 0.0f, rectF);
        } else {
            motionTiming = motionTiming4;
            motionTiming2 = motionTiming3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fCalculateTranslationX);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fCalculateTranslationY);
        }
        motionTiming2.apply(objectAnimatorOfFloat);
        motionTiming.apply(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int getBackgroundTint(@NonNull View view) {
        ColorStateList colorStateListM125212p = gbl0.m125212p(view);
        if (colorStateListM125212p != null) {
            return colorStateListM125212p.getColorForState(view.getDrawableState(), colorStateListM125212p.getDefaultColor());
        }
        return 0;
    }

    @Nullable
    private ViewGroup toViewGroupOrNull(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            qkq0.m175383a("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
            return false;
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.C0229f c0229f) {
        if (c0229f.f1380h == 0) {
            c0229f.f1380h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull final View view, @NonNull final View view2, final boolean z, boolean z2) {
        FabTransformationSpec fabTransformationSpecOnCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z);
        if (z) {
            this.dependencyOriginalTranslationX = view.getTranslationX();
            this.dependencyOriginalTranslationY = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        createElevationAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        RectF rectF = this.tmpRectF1;
        createTranslationAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        createDependencyTranslationAnimation(view, view2, z, fabTransformationSpecOnCreateMotionSpec, arrayList);
        createIconFadeAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        createExpansionAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, fWidth, fHeight, arrayList, arrayList2);
        createColorAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        createChildrenFadeAnimation(view, view2, z, z2, fabTransformationSpecOnCreateMotionSpec, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    public abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }
}
