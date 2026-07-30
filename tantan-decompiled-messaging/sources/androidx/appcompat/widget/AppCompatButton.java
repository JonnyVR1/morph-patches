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
import p149l.eu0;
import p149l.jj1;
import p149l.mji0;
import p149l.n0c0;
import p149l.nri0;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements jj1 {
    private final eu0 mBackgroundTintHelper;
    private final zu0 mTextHelper;

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(nri0.m160741b(context), attributeSet, i);
        eu0 eu0Var = new eu0(this);
        this.mBackgroundTintHelper = eu0Var;
        eu0Var.m118136e(attributeSet, i);
        zu0 zu0Var = new zu0(this);
        this.mTextHelper = zu0Var;
        zu0Var.m220180m(attributeSet, i);
        zu0Var.m220170b();
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (jj1.f118213f0) {
            return super.getAutoSizeMaxTextSize();
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            return zu0Var.m220172e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (jj1.f118213f0) {
            return super.getAutoSizeMinTextSize();
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            return zu0Var.m220173f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (jj1.f118213f0) {
            return super.getAutoSizeStepGranularity();
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            return zu0Var.m220174g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (jj1.f118213f0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        zu0 zu0Var = this.mTextHelper;
        return zu0Var != null ? zu0Var.m220175h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (jj1.f118213f0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            return zu0Var.m220176i();
        }
        return 0;
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
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220181n(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var == null || jj1.f118213f0 || !zu0Var.m220179l()) {
            return;
        }
        this.mTextHelper.m220171c();
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (jj1.f118213f0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220186s(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (jj1.f118213f0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220187t(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (jj1.f118213f0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220188u(i);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mji0.m154823q(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220185r(z);
        }
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220183p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (jj1.f118213f0) {
            super.setTextSize(i, f);
            return;
        }
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220193z(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136526r);
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }
}
