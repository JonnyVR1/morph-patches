package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l.lbk;
import l.t0c0;
import l.vwb;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageInputBaseEditView extends VEditText {

    /* JADX INFO: renamed from: d */
    public Pattern f228d;

    /* JADX INFO: renamed from: e */
    public Runnable f229e;

    /* JADX INFO: renamed from: f */
    public int f230f;

    /* JADX INFO: renamed from: g */
    public boolean f231g;

    /* JADX INFO: renamed from: h */
    public C0021d f232h;

    /* JADX INFO: renamed from: i */
    public List<C0021d> f233i;

    /* JADX INFO: renamed from: j */
    public boolean f234j;

    /* JADX INFO: renamed from: k */
    public C0021d f235k;

    /* JADX INFO: renamed from: l */
    public ArrayList<C0021d> f236l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Boolean> f237m;

    /* JADX INFO: renamed from: n */
    public StringBuilder f238n;

    /* JADX INFO: renamed from: o */
    public String f239o;

    /* JADX INFO: renamed from: p */
    public SpannableString f240p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$a */
    public class RunnableC0018a implements Runnable {
        public RunnableC0018a() {
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
        @Override // java.lang.Runnable
        public void run() {
            VEditText vEditText = MessageInputBaseEditView.this;
            vEditText.setSelection(vEditText.getText().length());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$b */
    public class C0019b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public EditText f242a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0019b(InputConnection inputConnection, boolean z, MessageInputBaseEditView messageInputBaseEditView) {
            super(inputConnection, z);
            this.f242a = messageInputBaseEditView;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (!MessageInputBaseEditView.this.f231g) {
                try {
                    return super.deleteSurroundingText(i, i2);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (i == 1 && i2 == 0) {
                return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
            }
            return super.deleteSurroundingText(i, i2);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public CharSequence getTextAfterCursor(int i, int i2) {
            try {
                return super.getTextAfterCursor(i, i2);
            } catch (Exception unused) {
                CrashHelper.f(new RuntimeException("getTextAfterCursor error:" + i + " ,flag:" + i2), "b_core_message", CrashHelper.ReportLevel.p6, 10);
                return "";
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public CharSequence getTextBeforeCursor(int i, int i2) {
            try {
                return super.getTextBeforeCursor(i, i2);
            } catch (Exception unused) {
                CrashHelper.f(new RuntimeException("getTextBeforeCursor error:" + i + " ,flag:" + i2), "b_core_message", CrashHelper.ReportLevel.p6, 10);
                return "";
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (!MessageInputBaseEditView.this.f231g) {
                return super.sendKeyEvent(keyEvent);
            }
            String strValueOf = String.valueOf(keyEvent.hashCode());
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f242a.getSelectionStart();
            C0021d c0021dM343q = MessageInputBaseEditView.this.m343q(selectionStart, this.f242a.getSelectionEnd());
            MessageInputBaseEditView messageInputBaseEditView = MessageInputBaseEditView.this;
            if (c0021dM343q == null) {
                messageInputBaseEditView.f234j = false;
                MessageInputBaseEditView.this.f237m.put(strValueOf, Boolean.TRUE);
                return super.sendKeyEvent(keyEvent);
            }
            if (messageInputBaseEditView.f234j || selectionStart == c0021dM343q.f245a) {
                MessageInputBaseEditView.this.f234j = false;
                MessageInputBaseEditView.this.f237m.put(strValueOf, Boolean.TRUE);
                return super.sendKeyEvent(keyEvent);
            }
            if (MessageInputBaseEditView.this.m346v()) {
                this.f242a.clearFocus();
                this.f242a.requestFocus();
            }
            MessageInputBaseEditView.this.f234j = true;
            MessageInputBaseEditView.this.f232h = c0021dM343q;
            MessageInputBaseEditView.this.f237m.put(strValueOf, Boolean.TRUE);
            setSelection(c0021dM343q.f245a, c0021dM343q.f246b);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$c */
    public class C0020c implements TextWatcher {
        public C0020c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$d */
    public class C0021d {

        /* JADX INFO: renamed from: a */
        public int f245a;

        /* JADX INFO: renamed from: b */
        public int f246b;

        /* JADX INFO: renamed from: c */
        public String f247c;

        public C0021d(int i, int i2) {
            this.f245a = i;
            this.f246b = i2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m351a(int i, int i2) {
            return this.f245a <= i && this.f246b >= i2;
        }

        /* JADX INFO: renamed from: b */
        public int m352b(int i) {
            int i2 = this.f245a;
            int i3 = this.f246b;
            return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m353c(int i, int i2) {
            int i3 = this.f245a;
            if (i3 == i && this.f246b == i2) {
                return true;
            }
            return i3 == i2 && this.f246b == i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m354d(int i, int i2) {
            int i3 = this.f245a;
            if (i <= i3 || i >= this.f246b) {
                return i2 > i3 && i2 < this.f246b;
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public C0021d m355e(String str) {
            this.f247c = str;
            return this;
        }
    }

    public MessageInputBaseEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f231g = false;
        this.f235k = null;
        this.f236l = new ArrayList<>();
        this.f237m = new HashMap<>();
        this.f239o = " ";
        m341u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private void m340t() {
        this.f233i = new ArrayList(5);
        this.f228d = Pattern.compile("@[\\u4e00-\\u9fa5\\w\\-]+");
        this.f230f = getResources().getColor(t0c0.t);
        addTextChangedListener(new C0020c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private void m341u() {
        StringBuilder sb = new StringBuilder(this.f239o);
        sb.append(getResources().getString(R.string.N0));
        this.f238n = sb;
        super/*android.widget.TextView*/.setHint(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2;
        if (!this.f231g) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        String strValueOf = String.valueOf(keyEvent.hashCode());
        if (this.f237m.containsKey(strValueOf) && this.f237m.get(strValueOf).booleanValue()) {
            this.f237m.remove(strValueOf);
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        boolean zHasFocus = hasFocus();
        int selectionStart = getSelectionStart();
        C0021d c0021dM343q = m343q(selectionStart, getSelectionEnd());
        if (zHasFocus) {
            if (c0021dM343q == null) {
                this.f234j = false;
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            if (this.f234j || selectionStart == (i2 = c0021dM343q.f245a)) {
                this.f234j = false;
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            this.f234j = true;
            this.f232h = c0021dM343q;
            setSelection(i2, c0021dM343q.f246b);
            return true;
        }
        if (c0021dM343q == null) {
            this.f234j = false;
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        if (this.f234j || selectionStart == (i = c0021dM343q.f245a)) {
            this.f234j = false;
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        this.f234j = false;
        this.f232h = c0021dM343q;
        setSelection(i, c0021dM343q.f246b);
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    public List<String> getAtIdList() {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(this.f233i)) {
            Iterator<C0021d> it = this.f233i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f247c);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C0019b(super/*android.view.View*/.onCreateInputConnection(editorInfo), true, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        if (this.f231g) {
            C0021d c0021d = this.f232h;
            if (c0021d == null || !c0021d.m353c(i, i2)) {
                C0021d c0021dM343q = m343q(i, i2);
                if (c0021dM343q != null && c0021dM343q.f246b == i2) {
                    this.f234j = false;
                }
                C0021d c0021dM344r = m344r(i, i2);
                if (c0021dM344r != null) {
                    if (i == i2) {
                        setSelection(c0021dM344r.m352b(i));
                        return;
                    }
                    int i3 = c0021dM344r.f246b;
                    if (i2 < i3) {
                        setSelection(i, i3);
                    }
                    int i4 = c0021dM344r.f245a;
                    if (i > i4) {
                        setSelection(i4, i2);
                    }
                }
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f231g) {
            lbk.a(this, charSequence, i, i2, i3);
            m348x(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m342p(String str, int i, int i2) {
        this.f235k = new C0021d(i, i2).m355e(str);
    }

    /* JADX INFO: renamed from: q */
    public final C0021d m343q(int i, int i2) {
        List<C0021d> list = this.f233i;
        if (list == null) {
            return null;
        }
        for (C0021d c0021d : list) {
            if (c0021d.m351a(i, i2)) {
                return c0021d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C0021d m344r(int i, int i2) {
        List<C0021d> list = this.f233i;
        if (list == null) {
            return null;
        }
        for (C0021d c0021d : list) {
            if (c0021d.m354d(i, i2)) {
                return c0021d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C0021d m345s(int i) {
        if (!vwb.J(this.f236l) && i >= 0 && i < this.f236l.size()) {
            return this.f236l.get(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFocusable(int i) {
        super/*android.widget.EditText*/.setFocusable(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFocusableInTouchMode(boolean z) {
        super/*android.view.View*/.setFocusableInTouchMode(z);
    }

    public void setMentionTextColor(int i) {
        this.f230f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelection(int i, int i2) {
        super/*android.widget.EditText*/.setSelection(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSpaceHint(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            super/*android.widget.TextView*/.setHint(charSequence);
        }
        if (charSequence.toString().startsWith(this.f239o)) {
            super/*android.widget.TextView*/.setHint(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder(this.f239o);
        this.f238n = sb;
        sb.append(charSequence);
        super/*android.widget.TextView*/.setHint(this.f238n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
        if (this.f229e == null) {
            this.f229e = new RunnableC0018a();
        }
        post(this.f229e);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m346v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m347w() {
        this.f231g = true;
        m340t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m348x(int i, int i2, int i3) {
        this.f234j = false;
        this.f236l = new ArrayList<>();
        if (!vwb.J(this.f233i)) {
            for (C0021d c0021d : this.f233i) {
                if (!c0021d.m351a(i, i + i2) || i2 == 0) {
                    this.f236l.add(c0021d);
                }
            }
        }
        List<C0021d> list = this.f233i;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class);
        int length = foregroundColorSpanArr.length;
        ArrayList<C0021d> arrayList = new ArrayList();
        for (int i4 = 0; i4 < length; i4++) {
            ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr[i4];
            C0021d c0021d2 = new C0021d(text.getSpanStart(foregroundColorSpan), text.getSpanEnd(foregroundColorSpan));
            C0021d c0021dM345s = m345s(i4);
            if (NullChecker.a(c0021dM345s)) {
                c0021d2.m355e(c0021dM345s.f247c);
                arrayList.add(c0021d2);
            }
            text.removeSpan(foregroundColorSpan);
        }
        if (NullChecker.a(this.f235k)) {
            arrayList.add(this.f235k);
            this.f235k = null;
        }
        for (C0021d c0021d3 : arrayList) {
            text.setSpan(new ForegroundColorSpan(this.f230f), c0021d3.f245a, c0021d3.f246b, 33);
            this.f233i.add(c0021d3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m349y(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            this.f240p = null;
            super/*android.widget.TextView*/.setHint(this.f238n);
        } else {
            SpannableString spannableString = new SpannableString(str);
            this.f240p = spannableString;
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
            super/*android.widget.TextView*/.setHint(this.f240p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m350z(boolean z) {
        if (!z) {
            super/*android.widget.TextView*/.setHint(this.f238n);
        } else if (NullChecker.a(this.f240p)) {
            super/*android.widget.TextView*/.setHint(this.f240p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFocusable(boolean z) {
        super/*android.view.View*/.setFocusable(z);
    }

    public MessageInputBaseEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f231g = false;
        this.f235k = null;
        this.f236l = new ArrayList<>();
        this.f237m = new HashMap<>();
        this.f239o = " ";
        m341u();
    }

    public MessageInputBaseEditView(Context context) {
        super(context);
        this.f231g = false;
        this.f235k = null;
        this.f236l = new ArrayList<>();
        this.f237m = new HashMap<>();
        this.f239o = " ";
        m341u();
    }
}
