package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C2489R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p153l.C15967bc;
import p153l.C16932fb;
import p153l.gde;
import p153l.j26;
import p153l.kkl0;
import p153l.msi0;
import p153l.oce;
import p153l.ou0;
import p153l.pxw;
import p153l.t0j0;
import p153l.tu0;
import p153l.wg3;
import p153l.wpg0;

/* JADX INFO: loaded from: classes7.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = C2489R.style.Widget_Design_TextInputLayout;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private ValueAnimator animator;

    @Nullable
    private MaterialShapeDrawable boxBackground;

    @ColorInt
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private final int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;

    @ColorInt
    private int boxStrokeColor;
    private final int boxStrokeWidthDefaultPx;
    private final int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;

    @Nullable
    private MaterialShapeDrawable boxUnderline;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;

    @Nullable
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;

    @Nullable
    private ColorStateList counterTextColor;

    @Nullable
    private TextView counterView;

    @ColorInt
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;

    @ColorInt
    private final int defaultStrokeColor;

    @ColorInt
    private final int disabledColor;

    @ColorInt
    private final int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;
    private final LinkedHashSet<OnEndIconChangedListener> endIconChangedListeners;
    private final SparseArray<EndIconDelegate> endIconDelegates;

    @Nullable
    private Drawable endIconDummyDrawable;

    @NonNull
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @NonNull
    private final CheckableImageButton endIconView;

    @NonNull
    private final CheckableImageButton errorIconView;

    @ColorInt
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;

    @ColorInt
    private final int hoveredFilledBackgroundColor;

    @ColorInt
    private final int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;

    @NonNull
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private boolean restoringSavedState;

    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;

    @Nullable
    private Drawable startIconDummyDrawable;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;

    @NonNull
    private final CheckableImageButton startIconView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class AccessibilityDelegate extends C16932fb {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull C15967bc c15967bc) {
            super.onInitializeAccessibilityNodeInfo(view, c15967bc);
            EditText editText = this.layout.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z = false;
            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            if (!zIsEmpty) {
                c15967bc.m103394Q0(text);
            } else if (!zIsEmpty2) {
                c15967bc.m103394Q0(hint);
            }
            if (!zIsEmpty2) {
                c15967bc.m103362A0(hint);
                if (zIsEmpty && !zIsEmpty2) {
                    z = true;
                }
                c15967bc.m103386M0(z);
            }
            if (z2) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                c15967bc.m103446w0(error);
                c15967bc.m103440t0(true);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(TextInputLayout textInputLayout, int i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(ThemeEnforcement.createThemedContext(context, attributeSet, i, i2), attributeSet, i);
        this.indicatorViewController = new IndicatorViewController(this);
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        this.endIconMode = 0;
        SparseArray<EndIconDelegate> sparseArray = new SparseArray<>();
        this.endIconDelegates = sparseArray;
        this.endIconChangedListeners = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.endIconFrame = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        frameLayout.addView(frameLayout2);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(BadgeDrawable.TOP_START);
        t0j0 t0j0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C2489R.styleable.TextInputLayout, i, i2, C2489R.styleable.TextInputLayout_counterTextAppearance, C2489R.styleable.TextInputLayout_counterOverflowTextAppearance, C2489R.styleable.TextInputLayout_errorTextAppearance, C2489R.styleable.TextInputLayout_helperTextTextAppearance, C2489R.styleable.TextInputLayout_hintTextAppearance);
        this.hintEnabled = t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_hintEnabled, true);
        setHint(t0j0VarObtainTintedStyledAttributes.m188798p(C2489R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(C2489R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = t0j0VarObtainTintedStyledAttributes.m188787e(C2489R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        int iM188788f = t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C2489R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthDefaultPx = iM188788f;
        this.boxStrokeWidthFocusedPx = t0j0VarObtainTintedStyledAttributes.m188788f(C2489R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C2489R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = iM188788f;
        float fM188786d = t0j0VarObtainTintedStyledAttributes.m188786d(C2489R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fM188786d2 = t0j0VarObtainTintedStyledAttributes.m188786d(C2489R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fM188786d3 = t0j0VarObtainTintedStyledAttributes.m188786d(C2489R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fM188786d4 = t0j0VarObtainTintedStyledAttributes.m188786d(C2489R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (fM188786d >= 0.0f) {
            builder.setTopLeftCornerSize(fM188786d);
        }
        if (fM188786d2 >= 0.0f) {
            builder.setTopRightCornerSize(fM188786d2);
        }
        if (fM188786d3 >= 0.0f) {
            builder.setBottomRightCornerSize(fM188786d3);
        }
        if (fM188786d4 >= 0.0f) {
            builder.setBottomLeftCornerSize(fM188786d4);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, t0j0VarObtainTintedStyledAttributes, C2489R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            } else {
                ColorStateList colorStateListM192701a = tu0.m192701a(context2, C2489R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateListM192701a.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateListM192701a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListM188785c = t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = colorStateListM188785c;
            this.defaultHintTextColor = colorStateListM188785c;
        }
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, t0j0VarObtainTintedStyledAttributes, C2489R.styleable.TextInputLayout_boxStrokeColor);
        if (colorStateList2 == null || !colorStateList2.isStateful()) {
            this.focusedStrokeColor = t0j0VarObtainTintedStyledAttributes.m188784b(C2489R.styleable.TextInputLayout_boxStrokeColor, 0);
            this.defaultStrokeColor = j26.m143190c(context2, C2489R.color.mtrl_textinput_default_box_stroke_color);
            this.disabledColor = j26.m143190c(context2, C2489R.color.mtrl_textinput_disabled_color);
            this.hoveredStrokeColor = j26.m143190c(context2, C2489R.color.mtrl_textinput_hovered_box_stroke_color);
        } else {
            this.defaultStrokeColor = colorStateList2.getDefaultColor();
            this.disabledColor = colorStateList2.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            this.focusedStrokeColor = colorStateList2.getColorForState(new int[]{R.attr.state_focused}, -1);
        }
        if (t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int iM188796n = t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.TextInputLayout_errorTextAppearance, 0);
        boolean zM188783a = t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C2489R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        this.errorIconView = checkableImageButton;
        frameLayout.addView(checkableImageButton);
        checkableImageButton.setVisibility(8);
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(t0j0VarObtainTintedStyledAttributes.m188789g(C2489R.styleable.TextInputLayout_errorIconDrawable));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(MaterialResources.getColorStateList(context2, t0j0VarObtainTintedStyledAttributes, C2489R.styleable.TextInputLayout_errorIconTint));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(ViewUtils.parseTintMode(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_errorIconTintMode, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(C2489R.string.error_icon_content_description));
        kkl0.m150184t0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iM188796n2 = t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean zM188783a2 = t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceM188798p = t0j0VarObtainTintedStyledAttributes.m188798p(C2489R.styleable.TextInputLayout_helperText);
        boolean zM188783a3 = t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = t0j0VarObtainTintedStyledAttributes.m188796n(C2489R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C2489R.layout.design_text_input_start_icon, (ViewGroup) frameLayout, false);
        this.startIconView = checkableImageButton2;
        frameLayout.addView(checkableImageButton2);
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(t0j0VarObtainTintedStyledAttributes.m188789g(C2489R.styleable.TextInputLayout_startIconDrawable));
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(t0j0VarObtainTintedStyledAttributes.m188798p(C2489R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_startIconCheckable, true));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_startIconTint)) {
            setStartIconTintList(MaterialResources.getColorStateList(context2, t0j0VarObtainTintedStyledAttributes, C2489R.styleable.TextInputLayout_startIconTint));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(ViewUtils.parseTintMode(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_startIconTintMode, -1), null));
        }
        setHelperTextEnabled(zM188783a2);
        setHelperText(charSequenceM188798p);
        setHelperTextTextAppearance(iM188796n2);
        setErrorEnabled(zM188783a);
        setErrorTextAppearance(iM188796n);
        setCounterTextAppearance(this.counterTextAppearance);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.TextInputLayout_errorTextColor));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.TextInputLayout_hintTextColor));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.TextInputLayout_counterTextColor));
        }
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(t0j0VarObtainTintedStyledAttributes.m188785c(C2489R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        setCounterEnabled(zM188783a3);
        setBoxBackgroundMode(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C2489R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.endIconView = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        sparseArray.append(-1, new CustomEndIconDelegate(this));
        sparseArray.append(0, new NoEndIconDelegate(this));
        sparseArray.append(1, new PasswordToggleEndIconDelegate(this));
        sparseArray.append(2, new ClearTextEndIconDelegate(this));
        sparseArray.append(3, new DropdownMenuEndIconDelegate(this));
        if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_endIconMode, 0));
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(t0j0VarObtainTintedStyledAttributes.m188789g(C2489R.styleable.TextInputLayout_endIconDrawable));
            }
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(t0j0VarObtainTintedStyledAttributes.m188798p(C2489R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(t0j0VarObtainTintedStyledAttributes.m188783a(C2489R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(t0j0VarObtainTintedStyledAttributes.m188789g(C2489R.styleable.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(t0j0VarObtainTintedStyledAttributes.m188798p(C2489R.styleable.TextInputLayout_passwordToggleContentDescription));
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(MaterialResources.getColorStateList(context2, t0j0VarObtainTintedStyledAttributes, C2489R.styleable.TextInputLayout_passwordToggleTint));
            }
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(ViewUtils.parseTintMode(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_endIconTint)) {
                setEndIconTintList(MaterialResources.getColorStateList(context2, t0j0VarObtainTintedStyledAttributes, C2489R.styleable.TextInputLayout_endIconTint));
            }
            if (t0j0VarObtainTintedStyledAttributes.m188800r(C2489R.styleable.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(ViewUtils.parseTintMode(t0j0VarObtainTintedStyledAttributes.m188793k(C2489R.styleable.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        t0j0VarObtainTintedStyledAttributes.m188801v();
        kkl0.m150184t0(this, 2);
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        materialShapeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        if (this.endIconMode == 3) {
            this.editText.getBackground().invalidateSelf();
        }
        applyBoxUnderlineAttributes();
        invalidate();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderline.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(@NonNull RectF rectF) {
        float f = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    private void applyIconTint(@NonNull CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = oce.m167178r(drawable).mutate();
            if (z) {
                oce.m167175o(drawable, colorStateList);
            }
            if (z2) {
                oce.m167176p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
            return;
        }
        if (i == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderline = new MaterialShapeDrawable();
            return;
        }
        if (i != 2) {
            throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        if (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable)) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
        } else {
            this.boxBackground = new CutoutDrawable(this.shapeAppearanceModel);
        }
        this.boxUnderline = null;
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? MaterialColors.layer(MaterialColors.getColor(this, C2489R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    @NonNull
    private Rect calculateCollapsedTextBounds(@NonNull Rect rect) {
        EditText editText = this.editText;
        if (editText == null) {
            wpg0.m207458a();
            return null;
        }
        Rect rect2 = this.tmpBoundsRect;
        rect2.bottom = rect.bottom;
        int i = this.boxBackgroundMode;
        if (i == 1) {
            rect2.left = rect.left + editText.getCompoundPaddingLeft();
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            return rect2;
        }
        int i2 = rect.left;
        if (i != 2) {
            rect2.left = i2 + editText.getCompoundPaddingLeft();
            rect2.top = getPaddingTop();
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            return rect2;
        }
        rect2.left = i2 + editText.getPaddingLeft();
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    private int calculateExpandedLabelBottom(@NonNull Rect rect, @NonNull Rect rect2, float f) {
        return this.boxBackgroundMode == 1 ? (int) (rect2.top + f) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(@NonNull Rect rect, float f) {
        return isSingleLineFilledTextField() ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.editText.getCompoundPaddingTop();
    }

    @NonNull
    private Rect calculateExpandedTextBounds(@NonNull Rect rect) {
        if (this.editText == null) {
            wpg0.m207458a();
            return null;
        }
        Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0 || i == 1) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator<OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this, i);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderline;
        if (materialShapeDrawable != null) {
            Rect bounds = materialShapeDrawable.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void drawHint(@NonNull Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
    }

    private EndIconDelegate getEndIconDelegate() {
        EndIconDelegate endIconDelegate = this.endIconDelegates.get(this.endIconMode);
        return endIconDelegate != null ? endIconDelegate : this.endIconDelegates.get(0);
    }

    @Nullable
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private boolean hasStartIcon() {
        return getStartIconDrawable() != null;
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(rectF);
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((CutoutDrawable) this.boxBackground).setCutout(rectF);
        }
    }

    private static void recursiveSetEnabled(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            wg3.m206174a("We already have an EditText, can only have one");
            return;
        }
        this.editText = editText;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.textfield.TextInputLayout.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NonNull Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
                TextInputLayout textInputLayout2 = TextInputLayout.this;
                if (textInputLayout2.counterEnabled) {
                    textInputLayout2.updateCounter(editable.length());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText().length());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startIconView.bringToFront();
        this.endIconFrame.bringToFront();
        this.errorIconView.bringToFront();
        dispatchOnEditTextAttached();
        updateLabelState(false, true);
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            kkl0.m150170m0(this.editText, this.boxBackground);
        }
    }

    private void setErrorIconVisible(boolean z) {
        this.errorIconView.setVisibility(z ? 0 : 8);
        this.endIconFrame.setVisibility(z ? 8 : 0);
        if (hasEndIcon()) {
            return;
        }
        updateIconDummyDrawables();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private static void setIconClickable(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean zM150129K = kkl0.m150129K(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zM150129K || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zM150129K);
        checkableImageButton.setPressable(zM150129K);
        checkableImageButton.setLongClickable(z);
        kkl0.m150184t0(checkableImageButton, z2 ? 1 : 2);
    }

    private static void setIconOnClickListener(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText = this.editText;
        return (editText == null || this.boxBackground == null || editText.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            applyEndIconTint();
            return;
        }
        Drawable drawableMutate = oce.m167178r(getEndIconDrawable()).mutate();
        oce.m167174n(drawableMutate, this.indicatorViewController.getErrorViewCurrentTextColor());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateBoxUnderlineBounds(@NonNull Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderline;
        if (materialShapeDrawable != null) {
            int i = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i - this.boxStrokeWidthFocusedPx, rect.right, i);
        }
    }

    private static void updateCounterContentDescription(@NonNull Context context, @NonNull TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C2489R.string.character_counter_overflowed_content_description : C2489R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endIconView.getMeasuredHeight(), this.startIconView.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    private boolean updateIconDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (hasStartIcon() && isStartIconVisible() && this.startIconView.getMeasuredWidth() > 0) {
            if (this.startIconDummyDrawable == null) {
                this.startIconDummyDrawable = new ColorDrawable();
                this.startIconDummyDrawable.setBounds(0, 0, (this.startIconView.getMeasuredWidth() - this.editText.getPaddingLeft()) + pxw.m174248a((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()), 1);
            }
            Drawable[] drawableArrM159803a = msi0.m159803a(this.editText);
            Drawable drawable = drawableArrM159803a[0];
            Drawable drawable2 = this.startIconDummyDrawable;
            if (drawable != drawable2) {
                msi0.m159812j(this.editText, drawable2, drawableArrM159803a[1], drawableArrM159803a[2], drawableArrM159803a[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.startIconDummyDrawable != null) {
            Drawable[] drawableArrM159803a2 = msi0.m159803a(this.editText);
            msi0.m159812j(this.editText, null, drawableArrM159803a2[1], drawableArrM159803a2[2], drawableArrM159803a2[3]);
            this.startIconDummyDrawable = null;
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.endIconDummyDrawable == null) {
                this.endIconDummyDrawable = new ColorDrawable();
                this.endIconDummyDrawable.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.editText.getPaddingRight()) + pxw.m174249b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            Drawable[] drawableArrM159803a3 = msi0.m159803a(this.editText);
            Drawable drawable3 = drawableArrM159803a3[2];
            Drawable drawable4 = this.endIconDummyDrawable;
            if (drawable3 != drawable4) {
                this.originalEditTextEndDrawable = drawable3;
                msi0.m159812j(this.editText, drawableArrM159803a3[0], drawableArrM159803a3[1], drawable4, drawableArrM159803a3[3]);
                return true;
            }
        } else if (this.endIconDummyDrawable != null) {
            Drawable[] drawableArrM159803a4 = msi0.m159803a(this.editText);
            if (drawableArrM159803a4[2] == this.endIconDummyDrawable) {
                msi0.m159812j(this.editText, drawableArrM159803a4[0], drawableArrM159803a4[1], this.originalEditTextEndDrawable, drawableArrM159803a4[3]);
            } else {
                z2 = z;
            }
            this.endIconDummyDrawable = null;
            return z2;
        }
        return z;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        boolean zErrorShouldBeShown = this.indicatorViewController.errorShouldBeShown();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList2);
            this.collapsingTextHelper.setExpandedTextColor(this.defaultHintTextColor);
        }
        if (!zIsEnabled) {
            this.collapsingTextHelper.setCollapsedTextColor(ColorStateList.valueOf(this.disabledColor));
            this.collapsingTextHelper.setExpandedTextColor(ColorStateList.valueOf(this.disabledColor));
        } else if (zErrorShouldBeShown) {
            this.collapsingTextHelper.setCollapsedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(textView.getTextColors());
        } else if (z3 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z4 || (isEnabled() && (z3 || zErrorShouldBeShown))) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    @VisibleForTesting
    public void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.animator.setDuration(167L);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    @VisibleForTesting
    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.originalHint == null || (editText = this.editText) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.isProvidingHint;
        this.isProvidingHint = false;
        CharSequence hint = editText.getHint();
        this.editText.setHint(this.originalHint);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.editText.setHint(hint);
            this.isProvidingHint = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) : false;
        updateLabelState(kkl0.m150134P(this) && isEnabled());
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        return editText != null ? editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop() : super.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        wpg0.m207458a();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.getBottomLeftCornerResolvedSize();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.getBottomRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.getTopRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.getTopLeftCornerResolvedSize();
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    @Nullable
    public EditText getEditText() {
        return this.editText;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    @Nullable
    public CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    @VisibleForTesting
    public final int getErrorTextCurrentColor() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    @VisibleForTesting
    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    @VisibleForTesting
    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateIconDummyDrawables = updateIconDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateIconDummyDrawables) {
            this.editText.post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.editText.requestLayout();
                }
            });
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            this.endIconView.post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.endIconView.performClick();
                    TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.errorShouldBeShown()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = hasEndIcon() && this.endIconView.isChecked();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void removeOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        setBoxBackgroundColor(j26.m143190c(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        if (this.boxBackground.getTopLeftCornerResolvedSize() == f && this.boxBackground.getTopRightCornerResolvedSize() == f2 && this.boxBackground.getBottomRightCornerResolvedSize() == f4 && this.boxBackground.getBottomLeftCornerResolvedSize() == f3) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f).setTopRightCornerSize(f2).setBottomRightCornerSize(f4).setBottomLeftCornerSize(f3).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(@DimenRes int i, @DimenRes int i2, @DimenRes int i3, @DimenRes int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(C2489R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        setEndIconDrawable(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.endIconMode;
        this.endIconMode = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().isBoxBackgroundModeSupported(this.boxBackgroundMode)) {
            getEndIconDelegate().initialize();
            applyEndIconTint();
            dispatchOnEndIconChanged(i2);
        } else {
            throw new IllegalStateException("The current box background mode " + this.boxBackgroundMode + " is not supported by the end icon mode " + i);
        }
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 4);
            updateIconDummyDrawables();
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        IndicatorViewController indicatorViewController = this.indicatorViewController;
        if (zIsEmpty) {
            indicatorViewController.hideError();
        } else {
            indicatorViewController.showError(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.setErrorEnabled(z);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.indicatorViewController.isErrorEnabled());
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = oce.m167178r(drawable).mutate();
            oce.m167175o(drawable, colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = oce.m167178r(drawable).mutate();
            oce.m167176p(drawable, mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.indicatorViewController.setErrorTextAppearance(i);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.setHelperTextEnabled(z);
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        this.indicatorViewController.setHelperTextAppearance(i);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (z) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            applyStartIconTint();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updateIconDummyDrawables();
        }
    }

    public void setTextAppearanceCompatWithErrorFallback(@NonNull TextView textView, @StyleRes int i) {
        try {
            msi0.m159817o(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        msi0.m159817o(textView, C2489R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(j26.m143190c(getContext(), C2489R.color.design_error));
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            kkl0.m150164j0(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void updateCounter(int i) {
        boolean z = this.counterOverflowed;
        int i2 = this.counterMaxLength;
        TextView textView = this.counterView;
        if (i2 == -1) {
            textView.setText(String.valueOf(i));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            if (kkl0.m150169m(textView) == 1) {
                kkl0.m150168l0(this.counterView, 0);
            }
            this.counterOverflowed = i > this.counterMaxLength;
            updateCounterContentDescription(getContext(), this.counterView, i, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
                if (this.counterOverflowed) {
                    kkl0.m150168l0(this.counterView, 1);
                }
            }
            this.counterView.setText(getContext().getString(C2489R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)));
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (gde.m129921a(background)) {
            background = background.mutate();
        }
        if (this.indicatorViewController.errorShouldBeShown()) {
            background.setColorFilter(ou0.m169199e(this.indicatorViewController.getErrorViewCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(ou0.m169199e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            oce.m167163c(background);
            this.editText.refreshDrawableState();
        }
    }

    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (this.indicatorViewController.errorShouldBeShown()) {
            this.boxStrokeColor = this.indicatorViewController.getErrorViewCurrentTextColor();
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.boxStrokeColor = textView.getCurrentTextColor();
        } else if (z2) {
            this.boxStrokeColor = this.focusedStrokeColor;
        } else if (z3) {
            this.boxStrokeColor = this.hoveredStrokeColor;
        } else {
            this.boxStrokeColor = this.defaultStrokeColor;
        }
        tintEndIconOnError(this.indicatorViewController.errorShouldBeShown() && getEndIconDelegate().shouldTintIconOnError());
        if (getErrorIconDrawable() != null && this.indicatorViewController.isErrorEnabled() && this.indicatorViewController.errorShouldBeShown()) {
            z = true;
        }
        setErrorIconVisible(z);
        if ((z3 || z2) && isEnabled()) {
            this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
        } else {
            this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z3) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        setErrorIconDrawable(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
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

        @Nullable
        CharSequence error;
        boolean isEndIconChecked;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? 0 : editText.getText().length());
        }
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2489R.attr.textInputStyle);
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }
}
