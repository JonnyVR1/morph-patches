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
import p149l.eu0;
import p149l.ju0;
import p149l.mji0;
import p149l.n0c0;
import p149l.nri0;
import p149l.tu0;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText {
    private final eu0 mBackgroundTintHelper;
    private final tu0 mTextClassifierHelper;
    private final zu0 mTextHelper;

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        tu0 tu0Var;
        return (Build.VERSION.SDK_INT >= 28 || (tu0Var = this.mTextClassifierHelper) == null) ? super.getTextClassifier() : tu0Var.m190674a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ju0.m143211a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        tu0 tu0Var;
        if (Build.VERSION.SDK_INT >= 28 || (tu0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            tu0Var.m190675b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136495D);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
