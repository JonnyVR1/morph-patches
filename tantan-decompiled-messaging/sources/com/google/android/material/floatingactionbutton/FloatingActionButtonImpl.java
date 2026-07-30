package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C2466R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.momo.mcamera.mask.BigEyeFilter;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.gbl0;
import p149l.kbe;
import p149l.tf80;

/* JADX INFO: loaded from: classes7.dex */
class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    private static final float HIDE_ICON_SCALE = 0.0f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.0f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;

    @Nullable
    BorderDrawable borderDrawable;

    @Nullable
    Drawable contentBackground;

    @Nullable
    private Animator currentAnimator;

    @Nullable
    private MotionSpec defaultHideMotionSpec;

    @Nullable
    private MotionSpec defaultShowMotionSpec;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private ArrayList<Animator.AnimatorListener> hideListeners;

    @Nullable
    private MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private int maxImageSize;
    int minTouchTargetSize;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;

    @Nullable
    Drawable rippleDrawable;
    private float rotation;
    final ShadowViewDelegate shadowViewDelegate;

    @Nullable
    ShapeAppearanceModel shapeAppearance;

    @Nullable
    MaterialShapeDrawable shapeDrawable;
    private ArrayList<Animator.AnimatorListener> showListeners;

    @Nullable
    private MotionSpec showMotionSpec;

    @NonNull
    private final StateListAnimator stateListAnimator;
    private ArrayList<InternalTransformationCallback> transformationCallbacks;
    final FloatingActionButton view;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    static final int[] PRESSED_ENABLED_STATE_SET = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] FOCUSED_ENABLED_STATE_SET = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] HOVERED_ENABLED_STATE_SET = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] ENABLED_STATE_SET = {R.attr.state_enabled};
    static final int[] EMPTY_STATE_SET = new int[0];
    boolean shadowPaddingEnabled = true;
    private float imageMatrixScale = 1.0f;
    private int animState = 0;
    private final Rect tmpRect = new Rect();
    private final RectF tmpRectF1 = new RectF();
    private final RectF tmpRectF2 = new RectF();
    private final Matrix tmpMatrix = new Matrix();

    public class DisabledElevationAnimation extends ShadowAnimatorImpl {
        public DisabledElevationAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            return 0.0f;
        }
    }

    public class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        public ElevateToHoveredFocusedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.elevation + floatingActionButtonImpl.hoveredFocusedTranslationZ;
        }
    }

    public class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        public ElevateToPressedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.elevation + floatingActionButtonImpl.pressedTranslationZ;
        }
    }

    public interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    public interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    public class ResetElevationAnimation extends ShadowAnimatorImpl {
        public ResetElevationAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation;
        }
    }

    public abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        private boolean validValues;

        private ShadowAnimatorImpl() {
        }

        public abstract float getTargetShadowSize();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.updateShapeElevation((int) this.shadowSizeEnd);
            this.validValues = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.validValues) {
                MaterialShapeDrawable materialShapeDrawable = FloatingActionButtonImpl.this.shapeDrawable;
                this.shadowSizeStart = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.getElevation();
                this.shadowSizeEnd = getTargetShadowSize();
                this.validValues = true;
            }
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            float f = this.shadowSizeStart;
            floatingActionButtonImpl.updateShapeElevation((int) (f + ((this.shadowSizeEnd - f) * valueAnimator.getAnimatedFraction())));
        }
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.view = floatingActionButton;
        this.shadowViewDelegate = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.stateListAnimator = stateListAnimator;
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToPressedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(ENABLED_STATE_SET, createElevationAnimator(new ResetElevationAnimation()));
        stateListAnimator.addState(EMPTY_STATE_SET, createElevationAnimator(new DisabledElevationAnimation()));
        this.rotation = floatingActionButton.getRotation();
    }

    private void calculateImageMatrixFromScale(float f, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.view.getDrawable();
        if (drawable == null || this.maxImageSize == 0) {
            return;
        }
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.maxImageSize;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.maxImageSize;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    @NonNull
    private AnimatorSet createAnimator(@NonNull MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        motionSpec.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        motionSpec.getTiming(BigEyeFilter.UNIFORM_SCALE).apply(objectAnimatorOfFloat2);
        workAroundOreoBug(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        motionSpec.getTiming(BigEyeFilter.UNIFORM_SCALE).apply(objectAnimatorOfFloat3);
        workAroundOreoBug(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        calculateImageMatrixFromScale(f3, this.tmpMatrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.view, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public Matrix evaluate(float f4, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                FloatingActionButtonImpl.this.imageMatrixScale = f4;
                return super.evaluate(f4, matrix, matrix2);
            }
        }, new Matrix(this.tmpMatrix));
        motionSpec.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @NonNull
    private ValueAnimator createElevationAnimator(@NonNull ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private MotionSpec getDefaultHideMotionSpec() {
        if (this.defaultHideMotionSpec == null) {
            this.defaultHideMotionSpec = MotionSpec.createFromResource(this.view.getContext(), C2466R.animator.design_fab_hide_motion_spec);
        }
        return (MotionSpec) tf80.m188658e(this.defaultHideMotionSpec);
    }

    private MotionSpec getDefaultShowMotionSpec() {
        if (this.defaultShowMotionSpec == null) {
            this.defaultShowMotionSpec = MotionSpec.createFromResource(this.view.getContext(), C2466R.animator.design_fab_show_motion_spec);
        }
        return (MotionSpec) tf80.m188658e(this.defaultShowMotionSpec);
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
        if (this.preDrawListener == null) {
            this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    FloatingActionButtonImpl.this.onPreDraw();
                    return true;
                }
            };
        }
        return this.preDrawListener;
    }

    private boolean shouldAnimateVisibilityChange() {
        return gbl0.m125171P(this.view) && !this.view.isInEditMode();
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            FloatEvaluator floatEvaluator = new FloatEvaluator();

            @Override // android.animation.TypeEvaluator
            public Float evaluate(float f, Float f2, Float f3) {
                float fFloatValue = this.floatEvaluator.evaluate(f, (Number) f2, (Number) f3).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            }
        });
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.hideListeners == null) {
            this.hideListeners = new ArrayList<>();
        }
        this.hideListeners.add(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.showListeners == null) {
            this.showListeners = new ArrayList<>();
        }
        this.showListeners.add(animatorListener);
    }

    public void addTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
        if (this.transformationCallbacks == null) {
            this.transformationCallbacks = new ArrayList<>();
        }
        this.transformationCallbacks.add(internalTransformationCallback);
    }

    public MaterialShapeDrawable createShapeDrawable() {
        return new MaterialShapeDrawable((ShapeAppearanceModel) tf80.m188658e(this.shapeAppearance));
    }

    @Nullable
    public final Drawable getContentBackground() {
        return this.contentBackground;
    }

    public float getElevation() {
        return this.elevation;
    }

    public boolean getEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    @Nullable
    public final MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    public void getPadding(@NonNull Rect rect) {
        int sizeDimension = this.ensureMinTouchTargetSize ? (this.minTouchTargetSize - this.view.getSizeDimension()) / 2 : 0;
        float elevation = this.shadowPaddingEnabled ? getElevation() + this.pressedTranslationZ : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(elevation));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(elevation * SHADOW_MULTIPLIER));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    @Nullable
    public final ShapeAppearanceModel getShapeAppearance() {
        return this.shapeAppearance;
    }

    @Nullable
    public final MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    public void hide(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        if (isOrWillBeHidden()) {
            return;
        }
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (!shouldAnimateVisibilityChange()) {
            this.view.internalSetVisibility(z ? 8 : 4, z);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onHidden();
                return;
            }
            return;
        }
        MotionSpec defaultHideMotionSpec = this.hideMotionSpec;
        if (defaultHideMotionSpec == null) {
            defaultHideMotionSpec = getDefaultHideMotionSpec();
        }
        AnimatorSet animatorSetCreateAnimator = createAnimator(defaultHideMotionSpec, 0.0f, 0.0f, 0.0f);
        animatorSetCreateAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl.this.animState = 0;
                FloatingActionButtonImpl.this.currentAnimator = null;
                if (this.cancelled) {
                    return;
                }
                FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.view;
                boolean z2 = z;
                floatingActionButton.internalSetVisibility(z2 ? 8 : 4, z2);
                InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                if (internalVisibilityChangedListener2 != null) {
                    internalVisibilityChangedListener2.onHidden();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl.this.view.internalSetVisibility(0, z);
                FloatingActionButtonImpl.this.animState = 1;
                FloatingActionButtonImpl.this.currentAnimator = animator2;
                this.cancelled = false;
            }
        });
        ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetCreateAnimator.addListener(it.next());
            }
        }
        animatorSetCreateAnimator.start();
    }

    public void initializeBackgroundDrawable(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        MaterialShapeDrawable materialShapeDrawableCreateShapeDrawable = createShapeDrawable();
        this.shapeDrawable = materialShapeDrawableCreateShapeDrawable;
        materialShapeDrawableCreateShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.shapeDrawable.setTintMode(mode);
        }
        this.shapeDrawable.setShadowColor(-12303292);
        this.shapeDrawable.initializeElevationOverlay(this.view.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.shapeDrawable.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
        this.rippleDrawable = rippleDrawableCompat;
        this.contentBackground = new LayerDrawable(new Drawable[]{(Drawable) tf80.m188658e(this.shapeDrawable), rippleDrawableCompat});
    }

    public boolean isOrWillBeHidden() {
        int visibility = this.view.getVisibility();
        int i = this.animState;
        if (visibility == 0) {
            return i == 1;
        }
        return i != 2;
    }

    public boolean isOrWillBeShown() {
        int visibility = this.view.getVisibility();
        int i = this.animState;
        if (visibility != 0) {
            return i == 2;
        }
        return i != 1;
    }

    public void jumpDrawableToCurrentState() {
        this.stateListAnimator.jumpToCurrentState();
    }

    public void onAttachedToWindow() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.view, materialShapeDrawable);
        }
        if (requirePreDrawListener()) {
            this.view.getViewTreeObserver().addOnPreDrawListener(getOrCreatePreDrawListener());
        }
    }

    public void onCompatShadowChanged() {
    }

    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.preDrawListener = null;
        }
    }

    public void onDrawableStateChanged(int[] iArr) {
        this.stateListAnimator.setState(iArr);
    }

    public void onElevationsChanged(float f, float f2, float f3) {
        updatePadding();
        updateShapeElevation(f);
    }

    public void onPaddingUpdated(@NonNull Rect rect) {
        tf80.m188659f(this.contentBackground, "Didn't initialize content background");
        if (!shouldAddPadding()) {
            this.shadowViewDelegate.setBackgroundDrawable(this.contentBackground);
        } else {
            this.shadowViewDelegate.setBackgroundDrawable(new InsetDrawable(this.contentBackground, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void onPreDraw() {
        float rotation = this.view.getRotation();
        if (this.rotation != rotation) {
            this.rotation = rotation;
            updateFromViewRotation();
        }
    }

    public void onScaleChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onScaleChanged();
            }
        }
    }

    public void onTranslationChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTranslationChanged();
            }
        }
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(internalTransformationCallback);
    }

    public boolean requirePreDrawListener() {
        return true;
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setBorderTint(colorStateList);
        }
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    public final void setElevation(float f) {
        if (this.elevation != f) {
            this.elevation = f;
            onElevationsChanged(f, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.ensureMinTouchTargetSize = z;
    }

    public final void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public final void setHoveredFocusedTranslationZ(float f) {
        if (this.hoveredFocusedTranslationZ != f) {
            this.hoveredFocusedTranslationZ = f;
            onElevationsChanged(this.elevation, f, this.pressedTranslationZ);
        }
    }

    public final void setImageMatrixScale(float f) {
        this.imageMatrixScale = f;
        Matrix matrix = this.tmpMatrix;
        calculateImageMatrixFromScale(f, matrix);
        this.view.setImageMatrix(matrix);
    }

    public final void setMaxImageSize(int i) {
        if (this.maxImageSize != i) {
            this.maxImageSize = i;
            updateImageMatrixScale();
        }
    }

    public void setMinTouchTargetSize(int i) {
        this.minTouchTargetSize = i;
    }

    public final void setPressedTranslationZ(float f) {
        if (this.pressedTranslationZ != f) {
            this.pressedTranslationZ = f;
            onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, f);
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            kbe.m145281o(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        this.shadowPaddingEnabled = z;
        updatePadding();
    }

    public final void setShapeAppearance(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearance = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.rippleDrawable;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public boolean shouldAddPadding() {
        return true;
    }

    public final boolean shouldExpandBoundsForA11y() {
        return !this.ensureMinTouchTargetSize || this.view.getSizeDimension() >= this.minTouchTargetSize;
    }

    public void show(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z) {
        if (isOrWillBeShown()) {
            return;
        }
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        boolean zShouldAnimateVisibilityChange = shouldAnimateVisibilityChange();
        FloatingActionButton floatingActionButton = this.view;
        if (!zShouldAnimateVisibilityChange) {
            floatingActionButton.internalSetVisibility(0, z);
            this.view.setAlpha(1.0f);
            this.view.setScaleY(1.0f);
            this.view.setScaleX(1.0f);
            setImageMatrixScale(1.0f);
            if (internalVisibilityChangedListener != null) {
                internalVisibilityChangedListener.onShown();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            this.view.setAlpha(0.0f);
            this.view.setScaleY(0.0f);
            this.view.setScaleX(0.0f);
            setImageMatrixScale(0.0f);
        }
        MotionSpec defaultShowMotionSpec = this.showMotionSpec;
        if (defaultShowMotionSpec == null) {
            defaultShowMotionSpec = getDefaultShowMotionSpec();
        }
        AnimatorSet animatorSetCreateAnimator = createAnimator(defaultShowMotionSpec, 1.0f, 1.0f, 1.0f);
        animatorSetCreateAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                FloatingActionButtonImpl.this.animState = 0;
                FloatingActionButtonImpl.this.currentAnimator = null;
                InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                if (internalVisibilityChangedListener2 != null) {
                    internalVisibilityChangedListener2.onShown();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                FloatingActionButtonImpl.this.view.internalSetVisibility(0, z);
                FloatingActionButtonImpl.this.animState = 2;
                FloatingActionButtonImpl.this.currentAnimator = animator2;
            }
        });
        ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetCreateAnimator.addListener(it.next());
            }
        }
        animatorSetCreateAnimator.start();
    }

    public void updateFromViewRotation() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShadowCompatRotation((int) this.rotation);
        }
    }

    public final void updateImageMatrixScale() {
        setImageMatrixScale(this.imageMatrixScale);
    }

    public final void updatePadding() {
        Rect rect = this.tmpRect;
        getPadding(rect);
        onPaddingUpdated(rect);
        this.shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void updateShapeElevation(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }
}
