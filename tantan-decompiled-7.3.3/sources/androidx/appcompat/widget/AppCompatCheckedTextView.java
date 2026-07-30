package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import p153l.fv0;
import p153l.msi0;
import p153l.pu0;
import p153l.q0j0;
import p153l.t0j0;
import p153l.tu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: b */
    public static final int[] f616b = {R.attr.checkMark};

    /* JADX INFO: renamed from: a */
    public final fv0 f617a;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(q0j0.m174714b(context), attributeSet, i);
        fv0 fv0Var = new fv0(this);
        this.f617a = fv0Var;
        fv0Var.m127572m(attributeSet, i);
        fv0Var.m127562b();
        t0j0 t0j0VarM188782u = t0j0.m188782u(getContext(), attributeSet, f616b, i, 0);
        setCheckMarkDrawable(t0j0VarM188782u.m188789g(0));
        t0j0VarM188782u.m188801v();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        fv0 fv0Var = this.f617a;
        if (fv0Var != null) {
            fv0Var.m127562b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return pu0.m173795a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(tu0.m192702b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(msi0.m159819q(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        fv0 fv0Var = this.f617a;
        if (fv0Var != null) {
            fv0Var.m127575p(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }
}
