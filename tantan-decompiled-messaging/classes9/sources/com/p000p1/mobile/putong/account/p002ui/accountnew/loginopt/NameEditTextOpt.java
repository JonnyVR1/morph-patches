package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.regex.Pattern;
import l.dqh0;
import rx.c;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NameEditTextOpt extends VEditText {

    /* JADX INFO: renamed from: d */
    public InterfaceC0064b f553d;

    /* JADX INFO: renamed from: e */
    public boolean f554e;

    /* JADX INFO: renamed from: f */
    public int f555f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.NameEditTextOpt$a */
    public class C0063a implements TextWatcher {
        public C0063a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            NameEditTextOpt.this.m531m();
            NameEditTextOpt.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = charSequence.toString();
            int i4 = 1;
            if (!TextUtils.isEmpty(string) && string.contains("ㅤ")) {
                charSequence = string.replace("ㅤ", "");
                NameEditTextOpt.this.setText(charSequence);
                VEditText vEditText = NameEditTextOpt.this;
                vEditText.setSelection(vEditText.getText().length());
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
                    if (NameEditTextOpt.this.m537q(charSequence.subSequence(i5, i6).toString())) {
                        ((SpannableStringBuilder) charSequence).delete(i5, i6);
                    }
                }
                NameEditTextOpt.this.setText(string.substring(0, string.length() - 1));
                VEditText vEditText2 = NameEditTextOpt.this;
                vEditText2.setSelection(vEditText2.getText().length());
            } else {
                NameEditTextOpt.this.setText("");
                charSequence = "";
            }
            if (NullChecker.a(NameEditTextOpt.this.f553d)) {
                NameEditTextOpt.this.f553d.mo538a(charSequence.toString(), i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.NameEditTextOpt$b */
    public interface InterfaceC0064b {
        /* JADX INFO: renamed from: a */
        void mo538a(String str, int i);
    }

    public NameEditTextOpt(Context context) {
        super(context);
        this.f554e = false;
        this.f555f = 0;
        m532n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public void m531m() {
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f555f - length) > 3) {
            this.f554e = true;
        }
        this.f555f = length;
    }

    /* JADX INFO: renamed from: n */
    private void m532n() {
        m533o();
        m534p();
        m531m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private void m533o() {
        if (TextUtils.isEmpty(getText())) {
            return;
        }
        Editable text = getText();
        setText(null);
        setText(text);
        setSelection(text.length());
        this.f555f = text.length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private void m534p() {
        addTextChangedListener(new C0063a());
        this.f555f = getText().length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public c<CharSequence> m535h() {
        return dqh0.c(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public c<CharSequence> m536i(boolean z) {
        return dqh0.c(this, z);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m537q(String str) {
        return Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[🠀-\u1fbff]|[℀-㋿]|[0-\u007f][⃐-\u20ff]|[\u0080-ÿ]").matcher(str).find();
    }

    public void setNameWatcher(InterfaceC0064b interfaceC0064b) {
        this.f553d = interfaceC0064b;
    }

    public NameEditTextOpt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f554e = false;
        this.f555f = 0;
        m532n();
    }

    public NameEditTextOpt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f554e = false;
        this.f555f = 0;
        m532n();
    }
}
