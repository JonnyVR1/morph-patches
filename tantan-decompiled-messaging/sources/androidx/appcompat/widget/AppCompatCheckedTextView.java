package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import p149l.ju0;
import p149l.mji0;
import p149l.nri0;
import p149l.nu0;
import p149l.qri0;
import p149l.zu0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: b */
    public static final int[] f616b = {R.attr.checkMark};

    /* JADX INFO: renamed from: a */
    public final zu0 f617a;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(nri0.m160741b(context), attributeSet, i);
        zu0 zu0Var = new zu0(this);
        this.f617a = zu0Var;
        zu0Var.m220180m(attributeSet, i);
        zu0Var.m220170b();
        qri0 qri0VarM175993u = qri0.m175993u(getContext(), attributeSet, f616b, i, 0);
        setCheckMarkDrawable(qri0VarM175993u.m176000g(0));
        qri0VarM175993u.m176012v();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        zu0 zu0Var = this.f617a;
        if (zu0Var != null) {
            zu0Var.m220170b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return ju0.m143211a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(nu0.m161424b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mji0.m154823q(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zu0 zu0Var = this.f617a;
        if (zu0Var != null) {
            zu0Var.m220183p(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }
}
