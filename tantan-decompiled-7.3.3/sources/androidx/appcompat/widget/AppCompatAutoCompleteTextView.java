package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p153l.fv0;
import p153l.ku0;
import p153l.msi0;
import p153l.pu0;
import p153l.q0j0;
import p153l.s8c0;
import p153l.t0j0;
import p153l.tu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {

    /* JADX INFO: renamed from: c */
    public static final int[] f613c = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final ku0 f614a;

    /* JADX INFO: renamed from: b */
    public final fv0 f615b;

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(q0j0.m174714b(context), attributeSet, i);
        t0j0 t0j0VarM188782u = t0j0.m188782u(getContext(), attributeSet, f613c, i, 0);
        if (t0j0VarM188782u.m188800r(0)) {
            setDropDownBackgroundDrawable(t0j0VarM188782u.m188789g(0));
        }
        t0j0VarM188782u.m188801v();
        ku0 ku0Var = new ku0(this);
        this.f614a = ku0Var;
        ku0Var.m151418e(attributeSet, i);
        fv0 fv0Var = new fv0(this);
        this.f615b = fv0Var;
        fv0Var.m127572m(attributeSet, i);
        fv0Var.m127562b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            ku0Var.m151415b();
        }
        fv0 fv0Var = this.f615b;
        if (fv0Var != null) {
            fv0Var.m127562b();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            return ku0Var.m151416c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            return ku0Var.m151417d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return pu0.m173795a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            ku0Var.m151419f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            ku0Var.m151420g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(msi0.m159819q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i) {
        setDropDownBackgroundDrawable(tu0.m192702b(getContext(), i));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            ku0Var.m151422i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        ku0 ku0Var = this.f614a;
        if (ku0Var != null) {
            ku0Var.m151423j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        fv0 fv0Var = this.f615b;
        if (fv0Var != null) {
            fv0Var.m127575p(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166797q);
    }

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }
}
