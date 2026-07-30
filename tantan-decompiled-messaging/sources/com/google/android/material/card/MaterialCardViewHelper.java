package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C2466R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.gbl0;
import p149l.kbe;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialCardViewHelper {
    private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5f;
    private static final int CHECKED_ICON_LAYER_INDEX = 2;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    private static final int DEFAULT_STROKE_VALUE = -1;

    @NonNull
    private final MaterialShapeDrawable bgDrawable;
    private boolean checkable;

    @Nullable
    private Drawable checkedIcon;

    @Dimension
    private final int checkedIconMargin;

    @Dimension
    private final int checkedIconSize;

    @Nullable
    private ColorStateList checkedIconTint;

    @Nullable
    private LayerDrawable clickableForegroundDrawable;

    @Nullable
    private MaterialShapeDrawable compatRippleDrawable;

    @Nullable
    private Drawable fgDrawable;

    @NonNull
    private final MaterialShapeDrawable foregroundContentDrawable;

    @Nullable
    private MaterialShapeDrawable foregroundShapeDrawable;

    @NonNull
    private final MaterialCardView materialCardView;

    @Nullable
    private ColorStateList rippleColor;

    @Nullable
    private Drawable rippleDrawable;

    @Nullable
    private ShapeAppearanceModel shapeAppearanceModel;

    @Nullable
    private ColorStateList strokeColor;

    @Dimension
    private int strokeWidth;

    @NonNull
    private final Rect userContentPadding = new Rect();
    private boolean isBackgroundOverwritten = false;

    public MaterialCardViewHelper(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i, @StyleRes int i2) {
        this.materialCardView = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.bgDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C2466R.styleable.CardView, i, C2466R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(C2466R.styleable.CardView_cardCornerRadius)) {
            builder.setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.foregroundContentDrawable = new MaterialShapeDrawable();
        setShapeAppearanceModel(builder.build());
        Resources resources = materialCardView.getResources();
        this.checkedIconMargin = resources.getDimensionPixelSize(C2466R.dimen.mtrl_card_checked_icon_margin);
        this.checkedIconSize = resources.getDimensionPixelSize(C2466R.dimen.mtrl_card_checked_icon_size);
        typedArrayObtainStyledAttributes.recycle();
    }

    private float calculateActualCornerPadding() {
        return Math.max(Math.max(calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getTopLeftCorner(), this.bgDrawable.getTopLeftCornerResolvedSize()), calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getTopRightCorner(), this.bgDrawable.getTopRightCornerResolvedSize())), Math.max(calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getBottomRightCorner(), this.bgDrawable.getBottomRightCornerResolvedSize()), calculateCornerPaddingForCornerTreatment(this.shapeAppearanceModel.getBottomLeftCorner(), this.bgDrawable.getBottomLeftCornerResolvedSize())));
    }

    private float calculateCornerPaddingForCornerTreatment(CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - COS_45) * ((double) f));
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    private float calculateHorizontalBackgroundPadding() {
        return this.materialCardView.getMaxCardElevation() + (shouldAddCornerPaddingOutsideCardBackground() ? calculateActualCornerPadding() : 0.0f);
    }

    private float calculateVerticalBackgroundPadding() {
        return (this.materialCardView.getMaxCardElevation() * CARD_VIEW_SHADOW_MULTIPLIER) + (shouldAddCornerPaddingOutsideCardBackground() ? calculateActualCornerPadding() : 0.0f);
    }

    private boolean canClipToOutline() {
        return this.bgDrawable.isRoundRect();
    }

    @NonNull
    private Drawable createCheckedIconLayer() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.checkedIcon;
        if (drawable != null) {
            stateListDrawable.addState(CHECKED_STATE_SET, drawable);
        }
        return stateListDrawable;
    }

    @NonNull
    private Drawable createCompatRippleDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        MaterialShapeDrawable materialShapeDrawableCreateForegroundShapeDrawable = createForegroundShapeDrawable();
        this.compatRippleDrawable = materialShapeDrawableCreateForegroundShapeDrawable;
        materialShapeDrawableCreateForegroundShapeDrawable.setFillColor(this.rippleColor);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.compatRippleDrawable);
        return stateListDrawable;
    }

    @NonNull
    private Drawable createForegroundRippleDrawable() {
        if (!RippleUtils.USE_FRAMEWORK_RIPPLE) {
            return createCompatRippleDrawable();
        }
        this.foregroundShapeDrawable = createForegroundShapeDrawable();
        return new RippleDrawable(this.rippleColor, null, this.foregroundShapeDrawable);
    }

    @NonNull
    private MaterialShapeDrawable createForegroundShapeDrawable() {
        return new MaterialShapeDrawable(this.shapeAppearanceModel);
    }

    @NonNull
    private Drawable getClickableForeground() {
        if (this.rippleDrawable == null) {
            this.rippleDrawable = createForegroundRippleDrawable();
        }
        if (this.clickableForegroundDrawable == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.rippleDrawable, this.foregroundContentDrawable, createCheckedIconLayer()});
            this.clickableForegroundDrawable = layerDrawable;
            layerDrawable.setId(2, C2466R.id.mtrl_card_checked_layer_id);
        }
        return this.clickableForegroundDrawable;
    }

    private float getParentCardViewCalculatedCornerPadding() {
        if (this.materialCardView.getPreventCornerOverlap() && this.materialCardView.getUseCompatPadding()) {
            return (float) ((1.0d - COS_45) * ((double) this.materialCardView.getCardViewRadius()));
        }
        return 0.0f;
    }

    @NonNull
    private Drawable insetDrawable(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.materialCardView.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(calculateVerticalBackgroundPadding());
            iCeil = (int) Math.ceil(calculateHorizontalBackgroundPadding());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new InsetDrawable(drawable, iCeil, iCeil2, iCeil, iCeil2) { // from class: com.google.android.material.card.MaterialCardViewHelper.1
            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    private boolean shouldAddCornerPaddingInsideCardBackground() {
        return this.materialCardView.getPreventCornerOverlap() && !canClipToOutline();
    }

    private boolean shouldAddCornerPaddingOutsideCardBackground() {
        return this.materialCardView.getPreventCornerOverlap() && canClipToOutline() && this.materialCardView.getUseCompatPadding();
    }

    private void updateInsetForeground(Drawable drawable) {
        boolean z = this.materialCardView.getForeground() instanceof InsetDrawable;
        MaterialCardView materialCardView = this.materialCardView;
        if (z) {
            ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
        } else {
            materialCardView.setForeground(insetDrawable(drawable));
        }
    }

    private void updateRippleColor() {
        Drawable drawable;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = this.rippleDrawable) != null) {
            ((RippleDrawable) drawable).setColor(this.rippleColor);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.compatRippleDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(this.rippleColor);
        }
    }

    @RequiresApi(api = 23)
    public void forceRippleRedraw() {
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.rippleDrawable.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.rippleDrawable.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @NonNull
    public MaterialShapeDrawable getBackground() {
        return this.bgDrawable;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.bgDrawable.getFillColor();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    public float getCornerRadius() {
        return this.bgDrawable.getTopLeftCornerResolvedSize();
    }

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    public float getProgress() {
        return this.bgDrawable.getInterpolation();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @ColorInt
    public int getStrokeColor() {
        ColorStateList colorStateList = this.strokeColor;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.strokeColor;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    @NonNull
    public Rect getUserContentPadding() {
        return this.userContentPadding;
    }

    public boolean isBackgroundOverwritten() {
        return this.isBackgroundOverwritten;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public void loadFromAttributes(@NonNull TypedArray typedArray) {
        ColorStateList colorStateList = MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, C2466R.styleable.MaterialCardView_strokeColor);
        this.strokeColor = colorStateList;
        if (colorStateList == null) {
            this.strokeColor = ColorStateList.valueOf(-1);
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(C2466R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C2466R.styleable.MaterialCardView_android_checkable, false);
        this.checkable = z;
        this.materialCardView.setLongClickable(z);
        this.checkedIconTint = MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, C2466R.styleable.MaterialCardView_checkedIconTint);
        setCheckedIcon(MaterialResources.getDrawable(this.materialCardView.getContext(), typedArray, C2466R.styleable.MaterialCardView_checkedIcon));
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, C2466R.styleable.MaterialCardView_rippleColor);
        this.rippleColor = colorStateList2;
        if (colorStateList2 == null) {
            this.rippleColor = ColorStateList.valueOf(MaterialColors.getColor(this.materialCardView, C2466R.attr.colorControlHighlight));
        }
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(this.materialCardView.getContext(), typedArray, C2466R.styleable.MaterialCardView_cardForegroundColor);
        MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (colorStateList3 == null) {
            colorStateList3 = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList3);
        updateRippleColor();
        updateElevation();
        updateStroke();
        this.materialCardView.setBackgroundInternal(insetDrawable(this.bgDrawable));
        Drawable clickableForeground = this.materialCardView.isClickable() ? getClickableForeground() : this.foregroundContentDrawable;
        this.fgDrawable = clickableForeground;
        this.materialCardView.setForeground(insetDrawable(clickableForeground));
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.clickableForegroundDrawable != null) {
            int i5 = this.checkedIconMargin;
            int i6 = this.checkedIconSize;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if (gbl0.m125228x(this.materialCardView) == 1) {
                i4 = i7;
                i3 = i5;
            } else {
                i3 = i7;
                i4 = i5;
            }
            this.clickableForegroundDrawable.setLayerInset(2, i3, this.checkedIconMargin, i4, i8);
        }
    }

    public void setBackgroundOverwritten(boolean z) {
        this.isBackgroundOverwritten = z;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.bgDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.checkable = z;
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.checkedIcon = drawable;
        if (drawable != null) {
            Drawable drawableM145284r = kbe.m145284r(drawable.mutate());
            this.checkedIcon = drawableM145284r;
            kbe.m145281o(drawableM145284r, this.checkedIconTint);
        }
        if (this.clickableForegroundDrawable != null) {
            this.clickableForegroundDrawable.setDrawableByLayerId(C2466R.id.mtrl_card_checked_layer_id, createCheckedIconLayer());
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.checkedIconTint = colorStateList;
        Drawable drawable = this.checkedIcon;
        if (drawable != null) {
            kbe.m145281o(drawable, colorStateList);
        }
    }

    public void setCornerRadius(float f) {
        setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(f));
        this.fgDrawable.invalidateSelf();
        if (shouldAddCornerPaddingOutsideCardBackground() || shouldAddCornerPaddingInsideCardBackground()) {
            updateContentPadding();
        }
        if (shouldAddCornerPaddingOutsideCardBackground()) {
            updateInsets();
        }
    }

    public void setProgress(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.bgDrawable.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.foregroundShapeDrawable;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.rippleColor = colorStateList;
        updateRippleColor();
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.bgDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        MaterialShapeDrawable materialShapeDrawable = this.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.foregroundShapeDrawable;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.compatRippleDrawable;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (this.strokeColor == colorStateList) {
            return;
        }
        this.strokeColor = colorStateList;
        updateStroke();
    }

    public void setStrokeWidth(@Dimension int i) {
        if (i == this.strokeWidth) {
            return;
        }
        this.strokeWidth = i;
        updateStroke();
    }

    public void setUserContentPadding(int i, int i2, int i3, int i4) {
        this.userContentPadding.set(i, i2, i3, i4);
        updateContentPadding();
    }

    public void updateClickable() {
        Drawable drawable = this.fgDrawable;
        Drawable clickableForeground = this.materialCardView.isClickable() ? getClickableForeground() : this.foregroundContentDrawable;
        this.fgDrawable = clickableForeground;
        if (drawable != clickableForeground) {
            updateInsetForeground(clickableForeground);
        }
    }

    public void updateContentPadding() {
        int iCalculateActualCornerPadding = (int) (((shouldAddCornerPaddingInsideCardBackground() || shouldAddCornerPaddingOutsideCardBackground()) ? calculateActualCornerPadding() : 0.0f) - getParentCardViewCalculatedCornerPadding());
        MaterialCardView materialCardView = this.materialCardView;
        Rect rect = this.userContentPadding;
        materialCardView.setAncestorContentPadding(rect.left + iCalculateActualCornerPadding, rect.top + iCalculateActualCornerPadding, rect.right + iCalculateActualCornerPadding, rect.bottom + iCalculateActualCornerPadding);
    }

    public void updateElevation() {
        this.bgDrawable.setElevation(this.materialCardView.getCardElevation());
    }

    public void updateInsets() {
        if (!isBackgroundOverwritten()) {
            this.materialCardView.setBackgroundInternal(insetDrawable(this.bgDrawable));
        }
        this.materialCardView.setForeground(insetDrawable(this.fgDrawable));
    }

    public void updateStroke() {
        this.foregroundContentDrawable.setStroke(this.strokeWidth, this.strokeColor);
    }
}
