package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleDrawableCompat extends Drawable implements Shapeable {
    private RippleDrawableCompatState drawableState;

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate) {
            rippleDrawableCompatState.delegate.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawableState.delegate.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.delegate.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public RippleDrawableCompat mutate() {
        this.drawableState = new RippleDrawableCompatState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.delegate.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.drawableState.delegate.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zShouldDrawRippleCompat = RippleUtils.shouldDrawRippleCompat(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.drawableState;
        if (rippleDrawableCompatState.shouldDrawDelegate == zShouldDrawRippleCompat) {
            return zOnStateChange;
        }
        rippleDrawableCompatState.shouldDrawDelegate = zShouldDrawRippleCompat;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.drawableState.delegate.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableState.delegate.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.delegate.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i) {
        this.drawableState.delegate.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.drawableState.delegate.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.drawableState.delegate.setTintMode(mode);
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.drawableState = rippleDrawableCompatState;
    }

    public static final class RippleDrawableCompatState extends Drawable.ConstantState {

        @NonNull
        MaterialShapeDrawable delegate;
        boolean shouldDrawDelegate;

        public RippleDrawableCompatState(@NonNull RippleDrawableCompatState rippleDrawableCompatState) {
            this.delegate = (MaterialShapeDrawable) rippleDrawableCompatState.delegate.getConstantState().newDrawable();
            this.shouldDrawDelegate = rippleDrawableCompatState.shouldDrawDelegate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.delegate = materialShapeDrawable;
            this.shouldDrawDelegate = false;
        }
    }
}
