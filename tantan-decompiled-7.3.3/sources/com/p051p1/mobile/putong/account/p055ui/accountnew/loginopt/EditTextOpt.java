package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import p137rx.C22421c;
import p151v.VEditText;
import p153l.kyh0;

/* JADX INFO: loaded from: classes9.dex */
public class EditTextOpt extends VEditText {

    /* JADX INFO: renamed from: d */
    public boolean f17262d;

    /* JADX INFO: renamed from: e */
    public int f17263e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.EditTextOpt$a */
    public class C4786a implements TextWatcher {
        public C4786a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditTextOpt.this.m29618k();
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
        this.f17262d = false;
        this.f17263e = 0;
        m29615l();
    }

    /* JADX INFO: renamed from: l */
    private void m29615l() {
        m29619m();
        m29620n();
        m29618k();
    }

    @Override // p151v.VEditText
    /* JADX INFO: renamed from: h */
    public C22421c<CharSequence> mo29616h() {
        return kyh0.m151971c(this, true);
    }

    @Override // p151v.VEditText
    /* JADX INFO: renamed from: i */
    public C22421c<CharSequence> mo29617i(boolean z) {
        return kyh0.m151971c(this, z);
    }

    /* JADX INFO: renamed from: k */
    public final void m29618k() {
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f17263e - length) > 3) {
            this.f17262d = true;
        }
        this.f17263e = length;
    }

    /* JADX INFO: renamed from: m */
    public final void m29619m() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        Editable text = getText();
        setText((CharSequence) null);
        setText(text);
        setSelection(text.length());
        this.f17263e = text.length();
    }

    /* JADX INFO: renamed from: n */
    public final void m29620n() {
        addTextChangedListener(new C4786a());
        this.f17263e = getText().length();
    }

    public EditTextOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17262d = false;
        this.f17263e = 0;
        m29615l();
    }

    public EditTextOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17262d = false;
        this.f17263e = 0;
        m29615l();
    }
}
