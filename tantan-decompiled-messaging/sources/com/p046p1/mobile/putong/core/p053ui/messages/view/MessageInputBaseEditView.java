package com.p046p1.mobile.putong.core.p053ui.messages.view;

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
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p147v.VEditText;
import p149l.lbk;
import p149l.t0c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class MessageInputBaseEditView extends VEditText {

    /* JADX INFO: renamed from: d */
    public Pattern f32406d;

    /* JADX INFO: renamed from: e */
    public Runnable f32407e;

    /* JADX INFO: renamed from: f */
    public int f32408f;

    /* JADX INFO: renamed from: g */
    public boolean f32409g;

    /* JADX INFO: renamed from: h */
    public C8596d f32410h;

    /* JADX INFO: renamed from: i */
    public List<C8596d> f32411i;

    /* JADX INFO: renamed from: j */
    public boolean f32412j;

    /* JADX INFO: renamed from: k */
    public C8596d f32413k;

    /* JADX INFO: renamed from: l */
    public ArrayList<C8596d> f32414l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Boolean> f32415m;

    /* JADX INFO: renamed from: n */
    public StringBuilder f32416n;

    /* JADX INFO: renamed from: o */
    public String f32417o;

    /* JADX INFO: renamed from: p */
    public SpannableString f32418p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$a */
    public class RunnableC8593a implements Runnable {
        public RunnableC8593a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageInputBaseEditView messageInputBaseEditView = MessageInputBaseEditView.this;
            messageInputBaseEditView.setSelection(messageInputBaseEditView.getText().length());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$b */
    public class C8594b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        public EditText f32420a;

        public C8594b(InputConnection inputConnection, boolean z, MessageInputBaseEditView messageInputBaseEditView) {
            super(inputConnection, z);
            this.f32420a = messageInputBaseEditView;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i, int i2) {
            if (!MessageInputBaseEditView.this.f32409g) {
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
                CrashHelper.m81299f(new RuntimeException("getTextAfterCursor error:" + i + " ,flag:" + i2), "b_core_message", CrashHelper.ReportLevel.p6, 10);
                return "";
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public CharSequence getTextBeforeCursor(int i, int i2) {
            try {
                return super.getTextBeforeCursor(i, i2);
            } catch (Exception unused) {
                CrashHelper.m81299f(new RuntimeException("getTextBeforeCursor error:" + i + " ,flag:" + i2), "b_core_message", CrashHelper.ReportLevel.p6, 10);
                return "";
            }
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (!MessageInputBaseEditView.this.f32409g) {
                return super.sendKeyEvent(keyEvent);
            }
            String strValueOf = String.valueOf(keyEvent.hashCode());
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f32420a.getSelectionStart();
            C8596d c8596dM49921q = MessageInputBaseEditView.this.m49921q(selectionStart, this.f32420a.getSelectionEnd());
            MessageInputBaseEditView messageInputBaseEditView = MessageInputBaseEditView.this;
            if (c8596dM49921q == null) {
                messageInputBaseEditView.f32412j = false;
                MessageInputBaseEditView.this.f32415m.put(strValueOf, Boolean.TRUE);
                return super.sendKeyEvent(keyEvent);
            }
            if (messageInputBaseEditView.f32412j || selectionStart == c8596dM49921q.f32423a) {
                MessageInputBaseEditView.this.f32412j = false;
                MessageInputBaseEditView.this.f32415m.put(strValueOf, Boolean.TRUE);
                return super.sendKeyEvent(keyEvent);
            }
            if (MessageInputBaseEditView.this.m49924v()) {
                this.f32420a.clearFocus();
                this.f32420a.requestFocus();
            }
            MessageInputBaseEditView.this.f32412j = true;
            MessageInputBaseEditView.this.f32410h = c8596dM49921q;
            MessageInputBaseEditView.this.f32415m.put(strValueOf, Boolean.TRUE);
            setSelection(c8596dM49921q.f32423a, c8596dM49921q.f32424b);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView$c */
    public class C8595c implements TextWatcher {
        public C8595c() {
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
    public class C8596d {

        /* JADX INFO: renamed from: a */
        public int f32423a;

        /* JADX INFO: renamed from: b */
        public int f32424b;

        /* JADX INFO: renamed from: c */
        public String f32425c;

        public C8596d(int i, int i2) {
            this.f32423a = i;
            this.f32424b = i2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m49929a(int i, int i2) {
            return this.f32423a <= i && this.f32424b >= i2;
        }

        /* JADX INFO: renamed from: b */
        public int m49930b(int i) {
            int i2 = this.f32423a;
            int i3 = this.f32424b;
            return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m49931c(int i, int i2) {
            int i3 = this.f32423a;
            if (i3 == i && this.f32424b == i2) {
                return true;
            }
            return i3 == i2 && this.f32424b == i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m49932d(int i, int i2) {
            int i3 = this.f32423a;
            if (i <= i3 || i >= this.f32424b) {
                return i2 > i3 && i2 < this.f32424b;
            }
            return true;
        }

        /* JADX INFO: renamed from: e */
        public C8596d m49933e(String str) {
            this.f32425c = str;
            return this;
        }
    }

    public MessageInputBaseEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32409g = false;
        this.f32413k = null;
        this.f32414l = new ArrayList<>();
        this.f32415m = new HashMap<>();
        this.f32417o = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m49919u();
    }

    /* JADX INFO: renamed from: t */
    private void m49918t() {
        this.f32411i = new ArrayList(5);
        this.f32406d = Pattern.compile("@[\\u4e00-\\u9fa5\\w\\-]+");
        this.f32408f = getResources().getColor(t0c0.f167168t);
        addTextChangedListener(new C8595c());
    }

    /* JADX INFO: renamed from: u */
    private void m49919u() {
        StringBuilder sb = new StringBuilder(this.f32417o);
        sb.append(getResources().getString(R$string.f20813N0));
        this.f32416n = sb;
        super.setHint(sb);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2;
        if (!this.f32409g) {
            return super.dispatchKeyEvent(keyEvent);
        }
        String strValueOf = String.valueOf(keyEvent.hashCode());
        if (this.f32415m.containsKey(strValueOf) && this.f32415m.get(strValueOf).booleanValue()) {
            this.f32415m.remove(strValueOf);
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zHasFocus = hasFocus();
        int selectionStart = getSelectionStart();
        C8596d c8596dM49921q = m49921q(selectionStart, getSelectionEnd());
        if (zHasFocus) {
            if (c8596dM49921q == null) {
                this.f32412j = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (this.f32412j || selectionStart == (i2 = c8596dM49921q.f32423a)) {
                this.f32412j = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            this.f32412j = true;
            this.f32410h = c8596dM49921q;
            setSelection(i2, c8596dM49921q.f32424b);
            return true;
        }
        if (c8596dM49921q == null) {
            this.f32412j = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f32412j || selectionStart == (i = c8596dM49921q.f32423a)) {
            this.f32412j = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f32412j = false;
        this.f32410h = c8596dM49921q;
        setSelection(i, c8596dM49921q.f32424b);
        return super.dispatchKeyEvent(keyEvent);
    }

    public List<String> getAtIdList() {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(this.f32411i)) {
            Iterator<C8596d> it = this.f32411i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f32425c);
            }
        }
        return arrayList;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C8594b(super.onCreateInputConnection(editorInfo), true, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f32409g) {
            C8596d c8596d = this.f32410h;
            if (c8596d == null || !c8596d.m49931c(i, i2)) {
                C8596d c8596dM49921q = m49921q(i, i2);
                if (c8596dM49921q != null && c8596dM49921q.f32424b == i2) {
                    this.f32412j = false;
                }
                C8596d c8596dM49922r = m49922r(i, i2);
                if (c8596dM49922r != null) {
                    if (i == i2) {
                        setSelection(c8596dM49922r.m49930b(i));
                        return;
                    }
                    int i3 = c8596dM49922r.f32424b;
                    if (i2 < i3) {
                        setSelection(i, i3);
                    }
                    int i4 = c8596dM49922r.f32423a;
                    if (i > i4) {
                        setSelection(i4, i2);
                    }
                }
            }
        }
    }

    @Override // p147v.VEditText, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f32409g) {
            lbk.m149230a(this, charSequence, i, i2, i3);
            m49926x(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m49920p(String str, int i, int i2) {
        this.f32413k = new C8596d(i, i2).m49933e(str);
    }

    /* JADX INFO: renamed from: q */
    public final C8596d m49921q(int i, int i2) {
        List<C8596d> list = this.f32411i;
        if (list == null) {
            return null;
        }
        for (C8596d c8596d : list) {
            if (c8596d.m49929a(i, i2)) {
                return c8596d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C8596d m49922r(int i, int i2) {
        List<C8596d> list = this.f32411i;
        if (list == null) {
            return null;
        }
        for (C8596d c8596d : list) {
            if (c8596d.m49932d(i, i2)) {
                return c8596d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C8596d m49923s(int i) {
        if (!vwb.m200296J(this.f32414l) && i >= 0 && i < this.f32414l.size()) {
            return this.f32414l.get(i);
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
        this.f32408f = i;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public void setSpaceHint(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            super.setHint(charSequence);
        }
        if (charSequence.toString().startsWith(this.f32417o)) {
            super.setHint(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder(this.f32417o);
        this.f32416n = sb;
        sb.append(charSequence);
        super.setHint(this.f32416n);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f32407e == null) {
            this.f32407e = new RunnableC8593a();
        }
        post(this.f32407e);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m49924v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m49925w() {
        this.f32409g = true;
        m49918t();
    }

    /* JADX INFO: renamed from: x */
    public final void m49926x(int i, int i2, int i3) {
        this.f32412j = false;
        this.f32414l = new ArrayList<>();
        if (!vwb.m200296J(this.f32411i)) {
            for (C8596d c8596d : this.f32411i) {
                if (!c8596d.m49929a(i, i + i2) || i2 == 0) {
                    this.f32414l.add(c8596d);
                }
            }
        }
        List<C8596d> list = this.f32411i;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return;
        }
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class);
        int length = foregroundColorSpanArr.length;
        ArrayList<C8596d> arrayList = new ArrayList();
        for (int i4 = 0; i4 < length; i4++) {
            ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr[i4];
            C8596d c8596d2 = new C8596d(text.getSpanStart(foregroundColorSpan), text.getSpanEnd(foregroundColorSpan));
            C8596d c8596dM49923s = m49923s(i4);
            if (NullChecker.m81303a(c8596dM49923s)) {
                c8596d2.m49933e(c8596dM49923s.f32425c);
                arrayList.add(c8596d2);
            }
            text.removeSpan(foregroundColorSpan);
        }
        if (NullChecker.m81303a(this.f32413k)) {
            arrayList.add(this.f32413k);
            this.f32413k = null;
        }
        for (C8596d c8596d3 : arrayList) {
            text.setSpan(new ForegroundColorSpan(this.f32408f), c8596d3.f32423a, c8596d3.f32424b, 33);
            this.f32411i.add(c8596d3);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m49927y(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            this.f32418p = null;
            super.setHint(this.f32416n);
        } else {
            SpannableString spannableString = new SpannableString(str);
            this.f32418p = spannableString;
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 33);
            super.setHint(this.f32418p);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m49928z(boolean z) {
        if (!z) {
            super.setHint(this.f32416n);
        } else if (NullChecker.m81303a(this.f32418p)) {
            super.setHint(this.f32418p);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        super.setFocusable(z);
    }

    public MessageInputBaseEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32409g = false;
        this.f32413k = null;
        this.f32414l = new ArrayList<>();
        this.f32415m = new HashMap<>();
        this.f32417o = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m49919u();
    }

    public MessageInputBaseEditView(Context context) {
        super(context);
        this.f32409g = false;
        this.f32413k = null;
        this.f32414l = new ArrayList<>();
        this.f32415m = new HashMap<>();
        this.f32417o = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m49919u();
    }
}
