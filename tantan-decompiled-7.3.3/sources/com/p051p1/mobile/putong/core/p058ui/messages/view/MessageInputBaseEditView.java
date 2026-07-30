package com.p051p1.mobile.putong.core.p058ui.messages.view;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p151v.VEditText;
import p153l.bek;
import p153l.jyb;
import p153l.z8c0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageInputBaseEditView extends VEditText {

    /* JADX INFO: renamed from: d */
    public Pattern f33254d;

    /* JADX INFO: renamed from: e */
    public Runnable f33255e;

    /* JADX INFO: renamed from: f */
    public int f33256f;

    /* JADX INFO: renamed from: g */
    public boolean f33257g;

    /* JADX INFO: renamed from: h */
    public C8759d f33258h;

    /* JADX INFO: renamed from: i */
    public List<C8759d> f33259i;

    /* JADX INFO: renamed from: j */
    public boolean f33260j;

    /* JADX INFO: renamed from: k */
    public C8759d f33261k;

    /* JADX INFO: renamed from: l */
    public ArrayList<C8759d> f33262l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Boolean> f33263m;

    /* JADX INFO: renamed from: n */
    public StringBuilder f33264n;

    /* JADX INFO: renamed from: o */
    public String f33265o;

    /* JADX INFO: renamed from: p */
    public SpannableString f33266p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$a */
    public class RunnableC8756a implements Runnable {
        public RunnableC8756a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageInputBaseEditView messageInputBaseEditView = MessageInputBaseEditView.this;
            messageInputBaseEditView.setSelection(messageInputBaseEditView.getText().length());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$b */
    public class C8757b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public EditText f33268a;

        public C8757b(InputConnection inputConnection, boolean z, MessageInputBaseEditView messageInputBaseEditView) {
            super(inputConnection, z);
            this.f33268a = messageInputBaseEditView;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (!MessageInputBaseEditView.this.f33257g) {
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
                CrashHelper.m82482f(new RuntimeException("getTextAfterCursor error:" + i + " ,flag:" + i2), "b_core_message", CrashHelper.ReportLevel.p6, 10);
                return "";
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public CharSequence getTextBeforeCursor(int i, int i2) {
            try {
                return super.getTextBeforeCursor(i, i2);
            } catch (Exception unused) {
                CrashHelper.m82482f(new RuntimeException("getTextBeforeCursor error:" + i + " ,flag:" + i2), "b_core_message", CrashHelper.ReportLevel.p6, 10);
                return "";
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (!MessageInputBaseEditView.this.f33257g) {
                return super.sendKeyEvent(keyEvent);
            }
            String strValueOf = String.valueOf(keyEvent.hashCode());
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f33268a.getSelectionStart();
            C8759d c8759dM51104q = MessageInputBaseEditView.this.m51104q(selectionStart, this.f33268a.getSelectionEnd());
            MessageInputBaseEditView messageInputBaseEditView = MessageInputBaseEditView.this;
            if (c8759dM51104q == null) {
                messageInputBaseEditView.f33260j = false;
                MessageInputBaseEditView.this.f33263m.put(strValueOf, Boolean.TRUE);
                return super.sendKeyEvent(keyEvent);
            }
            if (messageInputBaseEditView.f33260j || selectionStart == c8759dM51104q.f33271a) {
                MessageInputBaseEditView.this.f33260j = false;
                MessageInputBaseEditView.this.f33263m.put(strValueOf, Boolean.TRUE);
                return super.sendKeyEvent(keyEvent);
            }
            if (MessageInputBaseEditView.this.m51107v()) {
                this.f33268a.clearFocus();
                this.f33268a.requestFocus();
            }
            MessageInputBaseEditView.this.f33260j = true;
            MessageInputBaseEditView.this.f33258h = c8759dM51104q;
            MessageInputBaseEditView.this.f33263m.put(strValueOf, Boolean.TRUE);
            setSelection(c8759dM51104q.f33271a, c8759dM51104q.f33272b);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$c */
    public class C8758c implements TextWatcher {
        public C8758c() {
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
    public class C8759d {

        /* JADX INFO: renamed from: a */
        public int f33271a;

        /* JADX INFO: renamed from: b */
        public int f33272b;

        /* JADX INFO: renamed from: c */
        public String f33273c;

        public C8759d(int i, int i2) {
            this.f33271a = i;
            this.f33272b = i2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m51112a(int i, int i2) {
            return this.f33271a <= i && this.f33272b >= i2;
        }

        /* JADX INFO: renamed from: b */
        public int m51113b(int i) {
            int i2 = this.f33271a;
            int i3 = this.f33272b;
            return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m51114c(int i, int i2) {
            int i3 = this.f33271a;
            if (i3 == i && this.f33272b == i2) {
                return true;
            }
            return i3 == i2 && this.f33272b == i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m51115d(int i, int i2) {
            int i3 = this.f33271a;
            if (i <= i3 || i >= this.f33272b) {
                return i2 > i3 && i2 < this.f33272b;
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public C8759d m51116e(String str) {
            this.f33273c = str;
            return this;
        }
    }

    public MessageInputBaseEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33257g = false;
        this.f33261k = null;
        this.f33262l = new ArrayList<>();
        this.f33263m = new HashMap<>();
        this.f33265o = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m51102u();
    }

    /* JADX INFO: renamed from: t */
    private void m51101t() {
        this.f33259i = new ArrayList(5);
        this.f33254d = Pattern.compile("@[\\u4e00-\\u9fa5\\w\\-]+");
        this.f33256f = getResources().getColor(z8c0.f203359t);
        addTextChangedListener(new C8758c());
    }

    /* JADX INFO: renamed from: u */
    private void m51102u() {
        StringBuilder sb = new StringBuilder(this.f33265o);
        sb.append(getResources().getString(R$string.f21555N0));
        this.f33264n = sb;
        super.setHint(sb);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2;
        if (!this.f33257g) {
            return super.dispatchKeyEvent(keyEvent);
        }
        String strValueOf = String.valueOf(keyEvent.hashCode());
        if (this.f33263m.containsKey(strValueOf) && this.f33263m.get(strValueOf).booleanValue()) {
            this.f33263m.remove(strValueOf);
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zHasFocus = hasFocus();
        int selectionStart = getSelectionStart();
        C8759d c8759dM51104q = m51104q(selectionStart, getSelectionEnd());
        if (zHasFocus) {
            if (c8759dM51104q == null) {
                this.f33260j = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (this.f33260j || selectionStart == (i2 = c8759dM51104q.f33271a)) {
                this.f33260j = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            this.f33260j = true;
            this.f33258h = c8759dM51104q;
            setSelection(i2, c8759dM51104q.f33272b);
            return true;
        }
        if (c8759dM51104q == null) {
            this.f33260j = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f33260j || selectionStart == (i = c8759dM51104q.f33271a)) {
            this.f33260j = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f33260j = false;
        this.f33258h = c8759dM51104q;
        setSelection(i, c8759dM51104q.f33272b);
        return super.dispatchKeyEvent(keyEvent);
    }

    public List<String> getAtIdList() {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(this.f33259i)) {
            Iterator<C8759d> it = this.f33259i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f33273c);
            }
        }
        return arrayList;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C8757b(super.onCreateInputConnection(editorInfo), true, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f33257g) {
            C8759d c8759d = this.f33258h;
            if (c8759d == null || !c8759d.m51114c(i, i2)) {
                C8759d c8759dM51104q = m51104q(i, i2);
                if (c8759dM51104q != null && c8759dM51104q.f33272b == i2) {
                    this.f33260j = false;
                }
                C8759d c8759dM51105r = m51105r(i, i2);
                if (c8759dM51105r != null) {
                    if (i == i2) {
                        setSelection(c8759dM51105r.m51113b(i));
                        return;
                    }
                    int i3 = c8759dM51105r.f33272b;
                    if (i2 < i3) {
                        setSelection(i, i3);
                    }
                    int i4 = c8759dM51105r.f33271a;
                    if (i > i4) {
                        setSelection(i4, i2);
                    }
                }
            }
        }
    }

    @Override // p151v.VEditText, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f33257g) {
            bek.m103705a(this, charSequence, i, i2, i3);
            m51109x(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m51103p(String str, int i, int i2) {
        this.f33261k = new C8759d(i, i2).m51116e(str);
    }

    /* JADX INFO: renamed from: q */
    public final C8759d m51104q(int i, int i2) {
        List<C8759d> list = this.f33259i;
        if (list == null) {
            return null;
        }
        for (C8759d c8759d : list) {
            if (c8759d.m51112a(i, i2)) {
                return c8759d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C8759d m51105r(int i, int i2) {
        List<C8759d> list = this.f33259i;
        if (list == null) {
            return null;
        }
        for (C8759d c8759d : list) {
            if (c8759d.m51115d(i, i2)) {
                return c8759d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C8759d m51106s(int i) {
        if (!jyb.m147479J(this.f33262l) && i >= 0 && i < this.f33262l.size()) {
            return this.f33262l.get(i);
        }
        return null;
    }

    @Override // android.view.View
    public void setFocusable(int i) {
        super.setFocusable(i);
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z) {
        super.setFocusableInTouchMode(z);
    }

    public void setMentionTextColor(int i) {
        this.f33256f = i;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public void setSpaceHint(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            super.setHint(charSequence);
        }
        if (charSequence.toString().startsWith(this.f33265o)) {
            super.setHint(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder(this.f33265o);
        this.f33264n = sb;
        sb.append(charSequence);
        super.setHint(this.f33264n);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f33255e == null) {
            this.f33255e = new RunnableC8756a();
        }
        post(this.f33255e);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m51107v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m51108w() {
        this.f33257g = true;
        m51101t();
    }

    /* JADX INFO: renamed from: x */
    public final void m51109x(int i, int i2, int i3) {
        this.f33260j = false;
        this.f33262l = new ArrayList<>();
        if (!jyb.m147479J(this.f33259i)) {
            for (C8759d c8759d : this.f33259i) {
                if (!c8759d.m51112a(i, i + i2) || i2 == 0) {
                    this.f33262l.add(c8759d);
                }
            }
        }
        List<C8759d> list = this.f33259i;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class);
        int length = foregroundColorSpanArr.length;
        ArrayList<C8759d> arrayList = new ArrayList();
        for (int i4 = 0; i4 < length; i4++) {
            ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr[i4];
            C8759d c8759d2 = new C8759d(text.getSpanStart(foregroundColorSpan), text.getSpanEnd(foregroundColorSpan));
            C8759d c8759dM51106s = m51106s(i4);
            if (NullChecker.m82486a(c8759dM51106s)) {
                c8759d2.m51116e(c8759dM51106s.f33273c);
                arrayList.add(c8759d2);
            }
            text.removeSpan(foregroundColorSpan);
        }
        if (NullChecker.m82486a(this.f33261k)) {
            arrayList.add(this.f33261k);
            this.f33261k = null;
        }
        for (C8759d c8759d3 : arrayList) {
            text.setSpan(new ForegroundColorSpan(this.f33256f), c8759d3.f33271a, c8759d3.f33272b, 33);
            this.f33259i.add(c8759d3);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m51110y(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            this.f33266p = null;
            super.setHint(this.f33264n);
        } else {
            SpannableString spannableString = new SpannableString(str);
            this.f33266p = spannableString;
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
            super.setHint(this.f33266p);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m51111z(boolean z) {
        if (!z) {
            super.setHint(this.f33264n);
        } else if (NullChecker.m82486a(this.f33266p)) {
            super.setHint(this.f33266p);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        super.setFocusable(z);
    }

    public MessageInputBaseEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33257g = false;
        this.f33261k = null;
        this.f33262l = new ArrayList<>();
        this.f33263m = new HashMap<>();
        this.f33265o = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m51102u();
    }

    public MessageInputBaseEditView(Context context) {
        super(context);
        this.f33257g = false;
        this.f33261k = null;
        this.f33262l = new ArrayList<>();
        this.f33263m = new HashMap<>();
        this.f33265o = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m51102u();
    }
}
