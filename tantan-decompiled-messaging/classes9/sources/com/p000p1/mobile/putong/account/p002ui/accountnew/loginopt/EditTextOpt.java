package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import l.dqh0;
import rx.c;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EditTextOpt extends VEditText {

    /* JADX INFO: renamed from: d */
    public boolean f532d;

    /* JADX INFO: renamed from: e */
    public int f533e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.EditTextOpt$a */
    public class C0061a implements TextWatcher {
        public C0061a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditTextOpt.this.m516k();
            EditTextOpt.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public EditTextOpt(Context context) {
        super(context);
        this.f532d = false;
        this.f533e = 0;
        m513l();
    }

    /* JADX INFO: renamed from: l */
    private void m513l() {
        m517m();
        m518n();
        m516k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public c<CharSequence> m514h() {
        return dqh0.c(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public c<CharSequence> m515i(boolean z) {
        return dqh0.c(this, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m516k() {
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f533e - length) > 3) {
            this.f532d = true;
        }
        this.f533e = length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m517m() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        Editable text = getText();
        setText(null);
        setText(text);
        setSelection(text.length());
        this.f533e = text.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m518n() {
        addTextChangedListener(new C0061a());
        this.f533e = getText().length();
    }

    public EditTextOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f532d = false;
        this.f533e = 0;
        m513l();
    }

    public EditTextOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f532d = false;
        this.f533e = 0;
        m513l();
    }
}
