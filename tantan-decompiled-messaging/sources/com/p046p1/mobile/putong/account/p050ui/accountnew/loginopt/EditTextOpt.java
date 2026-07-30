package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import p133rx.C22306c;
import p147v.VEditText;
import p149l.dqh0;

/* JADX INFO: loaded from: classes9.dex */
public class EditTextOpt extends VEditText {

    /* JADX INFO: renamed from: d */
    public boolean f16543d;

    /* JADX INFO: renamed from: e */
    public int f16544e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.EditTextOpt$a */
    public class C4635a implements TextWatcher {
        public C4635a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditTextOpt.this.m28619k();
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
        this.f16543d = false;
        this.f16544e = 0;
        m28616l();
    }

    /* JADX INFO: renamed from: l */
    private void m28616l() {
        m28620m();
        m28621n();
        m28619k();
    }

    @Override // p147v.VEditText
    /* JADX INFO: renamed from: h */
    public C22306c<CharSequence> mo28617h() {
        return dqh0.m113070c(this, true);
    }

    @Override // p147v.VEditText
    /* JADX INFO: renamed from: i */
    public C22306c<CharSequence> mo28618i(boolean z) {
        return dqh0.m113070c(this, z);
    }

    /* JADX INFO: renamed from: k */
    public final void m28619k() {
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f16544e - length) > 3) {
            this.f16543d = true;
        }
        this.f16544e = length;
    }

    /* JADX INFO: renamed from: m */
    public final void m28620m() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        Editable text = getText();
        setText((CharSequence) null);
        setText(text);
        setSelection(text.length());
        this.f16544e = text.length();
    }

    /* JADX INFO: renamed from: n */
    public final void m28621n() {
        addTextChangedListener(new C4635a());
        this.f16544e = getText().length();
    }

    public EditTextOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16543d = false;
        this.f16544e = 0;
        m28616l();
    }

    public EditTextOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16543d = false;
        this.f16544e = 0;
        m28616l();
    }
}
