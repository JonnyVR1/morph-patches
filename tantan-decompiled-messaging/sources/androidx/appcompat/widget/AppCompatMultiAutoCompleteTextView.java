package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p149l.eu0;
import p149l.ju0;
import p149l.n0c0;
import p149l.nri0;
import p149l.nu0;
import p149l.qri0;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: c */
    public static final int[] f620c = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final eu0 f621a;

    /* JADX INFO: renamed from: b */
    public final zu0 f622b;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(nri0.m160741b(context), attributeSet, i);
        qri0 qri0VarM175993u = qri0.m175993u(getContext(), attributeSet, f620c, i, 0);
        if (qri0VarM175993u.m176011r(0)) {
            setDropDownBackgroundDrawable(qri0VarM175993u.m176000g(0));
        }
        qri0VarM175993u.m176012v();
        eu0 eu0Var = new eu0(this);
        this.f621a = eu0Var;
        eu0Var.m118136e(attributeSet, i);
        zu0 zu0Var = new zu0(this);
        this.f622b = zu0Var;
        zu0Var.m220180m(attributeSet, i);
        zu0Var.m220170b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            eu0Var.m118133b();
        }
        zu0 zu0Var = this.f622b;
        if (zu0Var != null) {
            zu0Var.m220170b();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            return eu0Var.m118134c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            return eu0Var.m118135d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ju0.m143211a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            eu0Var.m118137f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            eu0Var.m118138g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i) {
        setDropDownBackgroundDrawable(nu0.m161424b(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            eu0Var.m118140i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        eu0 eu0Var = this.f621a;
        if (eu0Var != null) {
            eu0Var.m118141j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zu0 zu0Var = this.f622b;
        if (zu0Var != null) {
            zu0Var.m220183p(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n0c0.f136525q);
    }

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }
}
