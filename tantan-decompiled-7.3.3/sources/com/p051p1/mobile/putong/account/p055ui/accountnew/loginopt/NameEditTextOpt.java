package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import p137rx.C22421c;
import p151v.VEditText;
import p153l.kyh0;

/* JADX INFO: loaded from: classes9.dex */
public class NameEditTextOpt extends VEditText {

    /* JADX INFO: renamed from: d */
    public InterfaceC4789b f17283d;

    /* JADX INFO: renamed from: e */
    public boolean f17284e;

    /* JADX INFO: renamed from: f */
    public int f17285f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.NameEditTextOpt$a */
    public class C4788a implements TextWatcher {
        public C4788a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            NameEditTextOpt.this.m29633m();
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
                    if (NameEditTextOpt.this.m29637q(charSequence.subSequence(i5, i6).toString())) {
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
            if (NullChecker.m82486a(NameEditTextOpt.this.f17283d)) {
                NameEditTextOpt.this.f17283d.mo29638a(charSequence.toString(), i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.NameEditTextOpt$b */
    public interface InterfaceC4789b {
        /* JADX INFO: renamed from: a */
        void mo29638a(String str, int i);
    }

    public NameEditTextOpt(Context context) {
        super(context);
        this.f17284e = false;
        this.f17285f = 0;
        m29634n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m29633m() {
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f17285f - length) > 3) {
            this.f17284e = true;
        }
        this.f17285f = length;
    }

    /* JADX INFO: renamed from: n */
    private void m29634n() {
        m29635o();
        m29636p();
        m29633m();
    }

    /* JADX INFO: renamed from: o */
    private void m29635o() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        Editable text = getText();
        setText((CharSequence) null);
        setText(text);
        setSelection(text.length());
        this.f17285f = text.length();
    }

    /* JADX INFO: renamed from: p */
    private void m29636p() {
        addTextChangedListener(new C4788a());
        this.f17285f = getText().length();
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

    /* JADX INFO: renamed from: q */
    public final boolean m29637q(String str) {
        return Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[℀-㋿]|[0-\u007f][⃐-\u20ff]|[\u0080-ÿ]").matcher(str).find();
    }

    public void setNameWatcher(InterfaceC4789b interfaceC4789b) {
        this.f17283d = interfaceC4789b;
    }

    public NameEditTextOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17284e = false;
        this.f17285f = 0;
        m29634n();
    }

    public NameEditTextOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17284e = false;
        this.f17285f = 0;
        m29634n();
    }
}
