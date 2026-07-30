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
import p149l.eu0;
import p149l.gu0;
import p149l.n0c0;
import p149l.nri0;
import p149l.nu0;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton {
    private final eu0 mBackgroundTintHelper;
    private final gu0 mCompoundButtonHelper;
    private final zu0 mTextHelper;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(nri0.m160741b(context), attributeSet, i);
        gu0 gu0Var = new gu0(this);
        this.mCompoundButtonHelper = gu0Var;
        gu0Var.m128018e(attributeSet, i);
        eu0 eu0Var = new eu0(this);
        this.mBackgroundTintHelper = eu0Var;
        eu0Var.m118136e(attributeSet, i);
        zu0 zu0Var = new zu0(this);
        this.mTextHelper = zu0Var;
        zu0Var.m220180m(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118133b();
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220170b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        gu0 gu0Var = this.mCompoundButtonHelper;
        return gu0Var != null ? gu0Var.m128015b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            return eu0Var.m118134c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            return eu0Var.m118135d();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        gu0 gu0Var = this.mCompoundButtonHelper;
        if (gu0Var != null) {
            return gu0Var.m128016c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        gu0 gu0Var = this.mCompoundButtonHelper;
        if (gu0Var != null) {
            return gu0Var.m128017d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118137f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118138g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(nu0.m161424b(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118140i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        eu0 eu0Var = this.mBackgroundTintHelper;
        if (eu0Var != null) {
            eu0Var.m118141j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        gu0 gu0Var = this.mCompoundButtonHelper;
        if (gu0Var != null) {
            gu0Var.m128020g(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        gu0 gu0Var = this.mCompoundButtonHelper;
        if (gu0Var != null) {
            gu0Var.m128021h(mode);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        gu0 gu0Var = this.mCompoundButtonHelper;
        if (gu0Var != null) {
            gu0Var.m128019f();
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136500I);
    }

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }
}
