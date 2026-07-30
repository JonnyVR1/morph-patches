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
import p149l.bfj0;
import p149l.eu0;
import p149l.jj1;
import p149l.ju0;
import p149l.mji0;
import p149l.nf80;
import p149l.nri0;
import p149l.nu0;
import p149l.tu0;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements jj1 {
    private final eu0 mBackgroundTintHelper;

    @Nullable
    private Future<nf80> mPrecomputedTextFuture;
    private final tu0 mTextClassifierHelper;
    private final zu0 mTextHelper;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(nri0.m160741b(context), attributeSet, i);
        eu0 eu0Var = new eu0(this);
        this.mBackgroundTintHelper = eu0Var;
        eu0Var.m118136e(attributeSet, i);
        zu0 zu0Var = new zu0(this);
        this.mTextHelper = zu0Var;
        zu0Var.m220180m(attributeSet, i);
        zu0Var.m220170b();
        this.mTextClassifierHelper = new tu0(this);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<nf80> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                mji0.m154820n(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return mji0.m154808b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return mji0.m154809c(this);
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
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m220177j();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m220178k();
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
        tu0 tu0Var;
        return (Build.VERSION.SDK_INT >= 28 || (tu0Var = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : tu0Var.m190674a();
    }

    @NonNull
    public nf80.C18685a getTextMetricsParamsCompat() {
        return mji0.m154813g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ju0.m143211a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220181n(z, i, i2, i3, i4);
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
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220182o();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220182o();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? nu0.m161424b(context, i) : null, i2 != 0 ? nu0.m161424b(context, i2) : null, i3 != 0 ? nu0.m161424b(context, i3) : null, i4 != 0 ? nu0.m161424b(context, i4) : null);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220182o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? nu0.m161424b(context, i) : null, i2 != 0 ? nu0.m161424b(context, i2) : null, i3 != 0 ? nu0.m161424b(context, i3) : null, i4 != 0 ? nu0.m161424b(context, i4) : null);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220182o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mji0.m154823q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            mji0.m154817k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            mji0.m154818l(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0) @Px int i) {
        mji0.m154819m(this, i);
    }

    public void setPrecomputedText(@NonNull nf80 nf80Var) {
        mji0.m154820n(this, nf80Var);
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
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.m220189v(colorStateList);
        this.mTextHelper.m220170b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m220190w(mode);
        this.mTextHelper.m220170b();
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        tu0 tu0Var;
        if (Build.VERSION.SDK_INT >= 28 || (tu0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            tu0Var.m190675b(textClassifier);
        }
    }

    public void setTextFuture(@Nullable Future<nf80> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull nf80.C18685a c18685a) {
        mji0.m154822p(this, c18685a);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        Typeface typefaceM101537a = (typeface == null || i <= 0) ? null : bfj0.m101537a(getContext(), typeface, i);
        if (typefaceM101537a != null) {
            typeface = typefaceM101537a;
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
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220182o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        zu0 zu0Var = this.mTextHelper;
        if (zu0Var != null) {
            zu0Var.m220182o();
        }
    }
}
