package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p153l.fv0;
import p153l.ku0;
import p153l.mu0;
import p153l.q0j0;
import p153l.s8c0;
import p153l.tu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton {
    private final ku0 mBackgroundTintHelper;
    private final mu0 mCompoundButtonHelper;
    private final fv0 mTextHelper;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(q0j0.m174714b(context), attributeSet, i);
        mu0 mu0Var = new mu0(this);
        this.mCompoundButtonHelper = mu0Var;
        mu0Var.m160060e(attributeSet, i);
        ku0 ku0Var = new ku0(this);
        this.mBackgroundTintHelper = ku0Var;
        ku0Var.m151418e(attributeSet, i);
        fv0 fv0Var = new fv0(this);
        this.mTextHelper = fv0Var;
        fv0Var.m127572m(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            ku0Var.m151415b();
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127562b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        mu0 mu0Var = this.mCompoundButtonHelper;
        return mu0Var != null ? mu0Var.m160057b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            return ku0Var.m151416c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            return ku0Var.m151417d();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        mu0 mu0Var = this.mCompoundButtonHelper;
        if (mu0Var != null) {
            return mu0Var.m160058c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        mu0 mu0Var = this.mCompoundButtonHelper;
        if (mu0Var != null) {
            return mu0Var.m160059d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            ku0Var.m151419f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            ku0Var.m151420g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(tu0.m192702b(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            ku0Var.m151422i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        ku0 ku0Var = this.mBackgroundTintHelper;
        if (ku0Var != null) {
            ku0Var.m151423j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        mu0 mu0Var = this.mCompoundButtonHelper;
        if (mu0Var != null) {
            mu0Var.m160062g(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        mu0 mu0Var = this.mCompoundButtonHelper;
        if (mu0Var != null) {
            mu0Var.m160063h(mode);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        mu0 mu0Var = this.mCompoundButtonHelper;
        if (mu0Var != null) {
            mu0Var.m160061f();
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166772I);
    }

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }
}
