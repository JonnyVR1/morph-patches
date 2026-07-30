package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C2489R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import p153l.C15967bc;
import p153l.azk0;
import p153l.kkl0;
import p153l.tu0;

/* JADX INFO: loaded from: classes7.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = true;
    private final TextInputLayout.AccessibilityDelegate accessibilityDelegate;

    @Nullable
    private AccessibilityManager accessibilityManager;
    private final TextInputLayout.OnEditTextAttachedListener dropdownMenuOnEditTextAttachedListener;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private final TextWatcher exposedDropdownEndIconTextWatcher;
    private ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private StateListDrawable filledPopupBackground;
    private boolean isEndIconChecked;
    private MaterialShapeDrawable outlinedPopupBackground;

    public DropdownMenuEndIconDelegate(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.exposedDropdownEndIconTextWatcher = new TextWatcher() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                final AutoCompleteTextView autoCompleteTextViewCastAutoCompleteTextViewOrThrow = dropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(dropdownMenuEndIconDelegate.textInputLayout.getEditText());
                autoCompleteTextViewCastAutoCompleteTextViewOrThrow.post(new Runnable() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean zIsPopupShowing = autoCompleteTextViewCastAutoCompleteTextViewOrThrow.isPopupShowing();
                        DropdownMenuEndIconDelegate.this.setEndIconChecked(zIsPopupShowing);
                        DropdownMenuEndIconDelegate.this.dropdownPopupDirty = zIsPopupShowing;
                    }
                });
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.accessibilityDelegate = new TextInputLayout.AccessibilityDelegate(this.textInputLayout) { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.2
            @Override // com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate, p153l.C16932fb
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull C15967bc c15967bc) {
                super.onInitializeAccessibilityNodeInfo(view, c15967bc);
                c15967bc.m103431o0(Spinner.class.getName());
                if (c15967bc.m103403X()) {
                    c15967bc.m103362A0(null);
                }
            }

            @Override // p153l.C16932fb
            public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                AutoCompleteTextView autoCompleteTextViewCastAutoCompleteTextViewOrThrow = dropdownMenuEndIconDelegate.castAutoCompleteTextViewOrThrow(dropdownMenuEndIconDelegate.textInputLayout.getEditText());
                if (accessibilityEvent.getEventType() == 1 && DropdownMenuEndIconDelegate.this.accessibilityManager.isTouchExplorationEnabled()) {
                    DropdownMenuEndIconDelegate.this.showHideDropdown(autoCompleteTextViewCastAutoCompleteTextViewOrThrow);
                }
            }
        };
        this.dropdownMenuOnEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.3
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                AutoCompleteTextView autoCompleteTextViewCastAutoCompleteTextViewOrThrow = DropdownMenuEndIconDelegate.this.castAutoCompleteTextViewOrThrow(textInputLayout2.getEditText());
                DropdownMenuEndIconDelegate.this.setPopupBackground(autoCompleteTextViewCastAutoCompleteTextViewOrThrow);
                DropdownMenuEndIconDelegate.this.addRippleEffect(autoCompleteTextViewCastAutoCompleteTextViewOrThrow);
                DropdownMenuEndIconDelegate.this.setUpDropdownShowHideBehavior(autoCompleteTextViewCastAutoCompleteTextViewOrThrow);
                autoCompleteTextViewCastAutoCompleteTextViewOrThrow.setThreshold(0);
                autoCompleteTextViewCastAutoCompleteTextViewOrThrow.removeTextChangedListener(DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                autoCompleteTextViewCastAutoCompleteTextViewOrThrow.addTextChangedListener(DropdownMenuEndIconDelegate.this.exposedDropdownEndIconTextWatcher);
                textInputLayout2.setErrorIconDrawable((Drawable) null);
                textInputLayout2.setTextInputAccessibilityDelegate(DropdownMenuEndIconDelegate.this.accessibilityDelegate);
                textInputLayout2.setEndIconVisible(true);
            }
        };
        this.dropdownPopupDirty = false;
        this.isEndIconChecked = false;
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRippleEffect(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.textInputLayout.getBoxBackgroundMode();
        MaterialShapeDrawable boxBackground = this.textInputLayout.getBoxBackground();
        int color = MaterialColors.getColor(autoCompleteTextView, C2489R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            addRippleEffectOnOutlinedLayout(autoCompleteTextView, color, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            addRippleEffectOnFilledLayout(autoCompleteTextView, color, iArr, boxBackground);
        }
    }

    private void addRippleEffectOnFilledLayout(@NonNull AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        int boxBackgroundColor = this.textInputLayout.getBoxBackgroundColor();
        int[] iArr2 = {MaterialColors.layer(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (IS_LOLLIPOP) {
            kkl0.m150170m0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), materialShapeDrawable, materialShapeDrawable));
            return;
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable, materialShapeDrawable2});
        int iM150112B = kkl0.m150112B(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iM150110A = kkl0.m150110A(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        kkl0.m150170m0(autoCompleteTextView, layerDrawable);
        kkl0.m150196z0(autoCompleteTextView, iM150112B, paddingTop, iM150110A, paddingBottom);
    }

    private void addRippleEffectOnOutlinedLayout(@NonNull AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        LayerDrawable layerDrawable;
        int color = MaterialColors.getColor(autoCompleteTextView, C2489R.attr.colorSurface);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int iLayer = MaterialColors.layer(i, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        if (IS_LOLLIPOP) {
            materialShapeDrawable2.setTint(color);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color});
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
            materialShapeDrawable3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable});
        }
        kkl0.m150170m0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        azk0.m101074a("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        return null;
    }

    private ValueAnimator getAlphaAnimator(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                DropdownMenuEndIconDelegate.this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    private MaterialShapeDrawable getPopUpMaterialShapeDrawable(float f, float f2, float f3, int i) {
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomLeftCornerSize(f2).setBottomRightCornerSize(f2).build();
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(this.context, f3);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, i, 0, i);
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(67, 0.0f, 1.0f);
        ValueAnimator alphaAnimator = getAlphaAnimator(50, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.endIconView.setChecked(dropdownMenuEndIconDelegate.isEndIconChecked);
                DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDropdownPopupActive() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndIconChecked(boolean z) {
        if (this.isEndIconChecked != z) {
            this.isEndIconChecked = z;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupBackground(@NonNull AutoCompleteTextView autoCompleteTextView) {
        if (IS_LOLLIPOP) {
            int boxBackgroundMode = this.textInputLayout.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.outlinedPopupBackground);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.filledPopupBackground);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpDropdownShowHideBehavior(@NonNull final AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (DropdownMenuEndIconDelegate.this.isDropdownPopupActive()) {
                        DropdownMenuEndIconDelegate.this.dropdownPopupDirty = false;
                    }
                    DropdownMenuEndIconDelegate.this.showHideDropdown(autoCompleteTextView);
                    view.performClick();
                }
                return false;
            }
        });
        autoCompleteTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                DropdownMenuEndIconDelegate.this.textInputLayout.setEndIconActivated(z);
                if (z) {
                    return;
                }
                DropdownMenuEndIconDelegate.this.setEndIconChecked(false);
                DropdownMenuEndIconDelegate.this.dropdownPopupDirty = false;
            }
        });
        if (IS_LOLLIPOP) {
            autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.7
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public void onDismiss() {
                    DropdownMenuEndIconDelegate.this.dropdownPopupDirty = true;
                    DropdownMenuEndIconDelegate.this.dropdownPopupActivatedAt = System.currentTimeMillis();
                    DropdownMenuEndIconDelegate.this.setEndIconChecked(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showHideDropdown(@Nullable AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.dropdownPopupDirty = false;
        }
        if (this.dropdownPopupDirty) {
            this.dropdownPopupDirty = false;
            return;
        }
        boolean z = IS_LOLLIPOP;
        boolean z2 = this.isEndIconChecked;
        if (z) {
            setEndIconChecked(!z2);
        } else {
            this.isEndIconChecked = !z2;
            this.endIconView.toggle();
        }
        if (!this.isEndIconChecked) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void initialize() {
        float dimensionPixelOffset = this.context.getResources().getDimensionPixelOffset(C2489R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.context.getResources().getDimensionPixelOffset(C2489R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.context.getResources().getDimensionPixelOffset(C2489R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable popUpMaterialShapeDrawable = getPopUpMaterialShapeDrawable(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable popUpMaterialShapeDrawable2 = getPopUpMaterialShapeDrawable(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.outlinedPopupBackground = popUpMaterialShapeDrawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.filledPopupBackground = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, popUpMaterialShapeDrawable);
        this.filledPopupBackground.addState(new int[0], popUpMaterialShapeDrawable2);
        this.textInputLayout.setEndIconDrawable(tu0.m192702b(this.context, IS_LOLLIPOP ? C2489R.drawable.mtrl_dropdown_arrow : C2489R.drawable.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.textInputLayout;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C2489R.string.exposed_dropdown_menu_content_description));
        this.textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DropdownMenuEndIconDelegate.this.showHideDropdown((AutoCompleteTextView) DropdownMenuEndIconDelegate.this.textInputLayout.getEditText());
            }
        });
        this.textInputLayout.addOnEditTextAttachedListener(this.dropdownMenuOnEditTextAttachedListener);
        initAnimators();
        kkl0.m150184t0(this.endIconView, 2);
        this.accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isBoxBackgroundModeSupported(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean shouldTintIconOnError() {
        return true;
    }
}
