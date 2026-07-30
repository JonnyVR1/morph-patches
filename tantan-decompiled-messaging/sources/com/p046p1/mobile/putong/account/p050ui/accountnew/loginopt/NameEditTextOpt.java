package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import p133rx.C22306c;
import p147v.VEditText;
import p149l.dqh0;

/* JADX INFO: loaded from: classes9.dex */
public class NameEditTextOpt extends VEditText {

    /* JADX INFO: renamed from: d */
    public InterfaceC4638b f16564d;

    /* JADX INFO: renamed from: e */
    public boolean f16565e;

    /* JADX INFO: renamed from: f */
    public int f16566f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.NameEditTextOpt$a */
    public class C4637a implements TextWatcher {
        public C4637a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            NameEditTextOpt.this.m28634m();
            NameEditTextOpt.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = charSequence.toString();
            int i4 = 1;
            if (!TextUtils.isEmpty(string) && string.contains("ㅤ")) {
                charSequence = string.replace("ㅤ", "");
                NameEditTextOpt.this.setText(charSequence);
                NameEditTextOpt nameEditTextOpt = NameEditTextOpt.this;
                nameEditTextOpt.setSelection(nameEditTextOpt.getText().length());
            } else if (TextUtils.isEmpty(string) || User.NEW_NAME_PATTERN().matcher(string).matches()) {
                if (!TextUtils.isEmpty(string.trim()) || charSequence.length() < 1) {
                    i4 = 0;
                } else {
                    NameEditTextOpt.this.setText("");
                    i4 = 2;
                    charSequence = "";
                }
            } else if (string.length() > 1) {
                if (i3 - i2 >= 1) {
                    int i5 = i2 + i;
                    int i6 = i + i3;
                    if (NameEditTextOpt.this.m28638q(charSequence.subSequence(i5, i6).toString())) {
                        ((SpannableStringBuilder) charSequence).delete(i5, i6);
                    }
                }
                NameEditTextOpt.this.setText(string.substring(0, string.length() - 1));
                NameEditTextOpt nameEditTextOpt2 = NameEditTextOpt.this;
                nameEditTextOpt2.setSelection(nameEditTextOpt2.getText().length());
            } else {
                NameEditTextOpt.this.setText("");
                charSequence = "";
            }
            if (NullChecker.m81303a(NameEditTextOpt.this.f16564d)) {
                NameEditTextOpt.this.f16564d.mo28639a(charSequence.toString(), i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.NameEditTextOpt$b */
    public interface InterfaceC4638b {
        /* JADX INFO: renamed from: a */
        void mo28639a(String str, int i);
    }

    public NameEditTextOpt(Context context) {
        super(context);
        this.f16565e = false;
        this.f16566f = 0;
        m28635n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m28634m() {
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f16566f - length) > 3) {
            this.f16565e = true;
        }
        this.f16566f = length;
    }

    /* JADX INFO: renamed from: n */
    private void m28635n() {
        m28636o();
        m28637p();
        m28634m();
    }

    /* JADX INFO: renamed from: o */
    private void m28636o() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        Editable text = getText();
        setText((CharSequence) null);
        setText(text);
        setSelection(text.length());
        this.f16566f = text.length();
    }

    /* JADX INFO: renamed from: p */
    private void m28637p() {
        addTextChangedListener(new C4637a());
        this.f16566f = getText().length();
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

    /* JADX INFO: renamed from: q */
    public final boolean m28638q(String str) {
        return Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[℀-㋿]|[0-\u007f][⃐-\u20ff]|[\u0080-ÿ]").matcher(str).find();
    }

    public void setNameWatcher(InterfaceC4638b interfaceC4638b) {
        this.f16564d = interfaceC4638b;
    }

    public NameEditTextOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16565e = false;
        this.f16566f = 0;
        m28635n();
    }

    public NameEditTextOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16565e = false;
        this.f16566f = 0;
        m28635n();
    }
}
