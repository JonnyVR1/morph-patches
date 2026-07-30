package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p153l.foj0;
import p153l.fv0;
import p153l.ku0;
import p153l.msi0;
import p153l.pu0;
import p153l.q0j0;
import p153l.qj1;
import p153l.sn80;
import p153l.tu0;
import p153l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements qj1 {
    private final ku0 mBackgroundTintHelper;

    @Nullable
    private Future<sn80> mPrecomputedTextFuture;
    private final zu0 mTextClassifierHelper;
    private final fv0 mTextHelper;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(q0j0.m174714b(context), attributeSet, i);
        ku0 ku0Var = new ku0(this);
        this.mBackgroundTintHelper = ku0Var;
        ku0Var.m151418e(attributeSet, i);
        fv0 fv0Var = new fv0(this);
        this.mTextHelper = fv0Var;
        fv0Var.m127572m(attributeSet, i);
        fv0Var.m127562b();
        this.mTextClassifierHelper = new zu0(this);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<sn80> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                msi0.m159816n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return msi0.m159804b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return msi0.m159805c(this);
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
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m127569j();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m127570k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        zu0 zu0Var;
        return (Build.VERSION.SDK_INT >= 28 || (zu0Var = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : zu0Var.m221590a();
    }

    @NonNull
    public sn80.C20112a getTextMetricsParamsCompat() {
        return msi0.m159809g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return pu0.m173795a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127573n(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
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
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127574o();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127574o();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? tu0.m192702b(context, i) : null, i2 != 0 ? tu0.m192702b(context, i2) : null, i3 != 0 ? tu0.m192702b(context, i3) : null, i4 != 0 ? tu0.m192702b(context, i4) : null);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127574o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? tu0.m192702b(context, i) : null, i2 != 0 ? tu0.m192702b(context, i2) : null, i3 != 0 ? tu0.m192702b(context, i3) : null, i4 != 0 ? tu0.m192702b(context, i4) : null);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127574o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(msi0.m159819q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            msi0.m159813k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            msi0.m159814l(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0) @Px int i) {
        msi0.m159815m(this, i);
    }

    public void setPrecomputedText(@NonNull sn80 sn80Var) {
        msi0.m159816n(this, sn80Var);
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
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.m127581v(colorStateList);
        this.mTextHelper.m127562b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m127582w(mode);
        this.mTextHelper.m127562b();
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        zu0 zu0Var;
        if (Build.VERSION.SDK_INT >= 28 || (zu0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zu0Var.m221591b(textClassifier);
        }
    }

    public void setTextFuture(@Nullable Future<sn80> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull sn80.C20112a c20112a) {
        msi0.m159818p(this, c20112a);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        Typeface typefaceM126456a = (typeface == null || i <= 0) ? null : foj0.m126456a(getContext(), typeface, i);
        if (typefaceM126456a != null) {
            typeface = typefaceM126456a;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127574o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        fv0 fv0Var = this.mTextHelper;
        if (fv0Var != null) {
            fv0Var.m127574o();
        }
    }
}
