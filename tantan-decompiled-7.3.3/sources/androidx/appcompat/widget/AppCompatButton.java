package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p153l.fv0;
import p153l.ku0;
import p153l.msi0;
import p153l.q0j0;
import p153l.qj1;
import p153l.s8c0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements qj1 {
    private final ku0 mBackgroundTintHelper;
    private final fv0 mTextHelper;

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(q0j0.m174714b(context), attributeSet, i);
        ku0 ku0Var = new ku0(this);
        this.mBackgroundTintHelper = ku0Var;
        ku0Var.m151418e(attributeSet, i);
        fv0 fv0Var = new fv0(this);
        this.mTextHelper = fv0Var;
        fv0Var.m127572m(attributeSet, i);
        fv0Var.m127562b();
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (qj1.f157911f0) {
            return super.getAutoSizeMaxTextSize();
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            return fv0Var.m127564e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (qj1.f157911f0) {
            return super.getAutoSizeMinTextSize();
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            return fv0Var.m127565f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (qj1.f157911f0) {
            return super.getAutoSizeStepGranularity();
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            return fv0Var.m127566g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (qj1.f157911f0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        fv0 fv0Var = this.mTextHelper;
        return fv0Var != null ? fv0Var.m127567h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (qj1.f157911f0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            return fv0Var.m127568i();
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127573n(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var == null || qj1.f157911f0 || !fv0Var.m127571l()) {
            return;
        }
        this.mTextHelper.m127563c();
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (qj1.f157911f0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127578s(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (qj1.f157911f0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127579t(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (qj1.f157911f0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127580u(i);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(msi0.m159819q(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127577r(z);
        }
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127575p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (qj1.f157911f0) {
            super.setTextSize(i, f);
            return;
        }
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127585z(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166798r);
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }
}
