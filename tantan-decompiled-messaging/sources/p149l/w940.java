package p149l;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class w940 implements s7m<t940> {

    /* JADX INFO: renamed from: a */
    public VLinear f185294a;

    /* JADX INFO: renamed from: b */
    public VEditText f185295b;

    /* JADX INFO: renamed from: c */
    public VText f185296c;

    /* JADX INFO: renamed from: d */
    public t940 f185297d;

    /* JADX INFO: renamed from: e */
    public final Act f185298e;

    /* JADX INFO: renamed from: f */
    public final InputFilter f185299f = new par(100, new d30() { // from class: l.u940
        @Override // p149l.d30
        public final void call() {
            lsi0.m151580j(String.format("不能超过%d字符", 50));
        }
    });

    public w940(Act act) {
        this.f185298e = act;
    }

    /* JADX INFO: renamed from: e */
    private void m202230e() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f185298e.getSystemService("input_method");
        View viewPeekDecorView = this.f185298e.getWindow().peekDecorView();
        if (viewPeekDecorView != null) {
            inputMethodManager.hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m202231f(View view) {
        this.f185297d.m187602j0(this.f185295b.getText().toString());
        m202230e();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public View m202232c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x940.m207482b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(t940 t940Var) {
        this.f185297d = t940Var;
    }

    /* JADX INFO: renamed from: i */
    public void m202234i(String str) {
        this.f185295b.setText(str);
        this.f185295b.setSelection(TextUtils.isEmpty(str) ? 0 : str.length());
        this.f185295b.setHint(String.format("最多输入%d个字符", 50));
        this.f185295b.setFocusable(true);
        this.f185295b.setFocusableInTouchMode(true);
        m202235j(this.f185295b);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f185294a == null) {
            m202232c(layoutInflater, viewGroup);
            this.f185295b.setFilters(new InputFilter[]{this.f185299f});
            this.f185296c.setOnClickListener(new View.OnClickListener() { // from class: l.v940
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180610a.m202231f(view);
                }
            });
        }
        return this.f185294a;
    }

    /* JADX INFO: renamed from: j */
    public final void m202235j(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) this.f185298e.getSystemService("input_method")).showSoftInput(editText, 1);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
