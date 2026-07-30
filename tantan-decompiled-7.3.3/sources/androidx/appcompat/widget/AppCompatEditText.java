package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import p153l.fv0;
import p153l.ku0;
import p153l.msi0;
import p153l.pu0;
import p153l.q0j0;
import p153l.s8c0;
import p153l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText {
    private final ku0 mBackgroundTintHelper;
    private final zu0 mTextClassifierHelper;
    private final fv0 mTextHelper;

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        zu0 zu0Var;
        return (Build.VERSION.SDK_INT >= 28 || (zu0Var = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : zu0Var.m221590a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return pu0.m173795a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        zu0 zu0Var;
        if (Build.VERSION.SDK_INT >= 28 || (zu0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zu0Var.m221591b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166767D);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
