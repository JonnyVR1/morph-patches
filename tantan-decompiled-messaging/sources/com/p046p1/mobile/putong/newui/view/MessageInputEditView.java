package com.p046p1.mobile.putong.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p147v.VEditText;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class MessageInputEditView extends VEditText {

    /* JADX INFO: renamed from: d */
    public Runnable f54148d;

    /* JADX INFO: renamed from: e */
    public int f54149e;

    /* JADX INFO: renamed from: f */
    public boolean f54150f;

    /* JADX INFO: renamed from: g */
    public C13081b f54151g;

    /* JADX INFO: renamed from: h */
    public List<C13081b> f54152h;

    /* JADX INFO: renamed from: i */
    public boolean f54153i;

    /* JADX INFO: renamed from: j */
    public C13081b f54154j;

    /* JADX INFO: renamed from: k */
    public ArrayList<C13081b> f54155k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, Boolean> f54156l;

    /* JADX INFO: renamed from: m */
    public StringBuilder f54157m;

    /* JADX INFO: renamed from: n */
    public String f54158n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.MessageInputEditView$a */
    public class RunnableC13080a implements Runnable {
        public RunnableC13080a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageInputEditView messageInputEditView = MessageInputEditView.this;
            messageInputEditView.setSelection(messageInputEditView.getText().length());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.MessageInputEditView$b */
    public class C13081b {

        /* JADX INFO: renamed from: a */
        public int f54160a;

        /* JADX INFO: renamed from: b */
        public int f54161b;

        /* JADX INFO: renamed from: c */
        public String f54162c;

        /* JADX INFO: renamed from: a */
        public boolean m79154a(int i, int i2) {
            return this.f54160a <= i && this.f54161b >= i2;
        }

        /* JADX INFO: renamed from: b */
        public int m79155b(int i) {
            int i2 = this.f54160a;
            int i3 = this.f54161b;
            return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m79156c(int i, int i2) {
            int i3 = this.f54160a;
            if (i3 == i && this.f54161b == i2) {
                return true;
            }
            return i3 == i2 && this.f54161b == i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m79157d(int i, int i2) {
            int i3 = this.f54160a;
            if (i <= i3 || i >= this.f54161b) {
                return i2 > i3 && i2 < this.f54161b;
            }
            return true;
        }
    }

    public MessageInputEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54150f = false;
        this.f54154j = null;
        this.f54155k = new ArrayList<>();
        this.f54156l = new HashMap<>();
        this.f54158n = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m79151l();
    }

    /* JADX INFO: renamed from: l */
    private void m79151l() {
        StringBuilder sb = new StringBuilder(this.f54158n);
        sb.append("输入新消息");
        this.f54157m = sb;
        super.setHint(sb);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2;
        if (!this.f54150f) {
            return super.dispatchKeyEvent(keyEvent);
        }
        String strValueOf = String.valueOf(keyEvent.hashCode());
        if (this.f54156l.containsKey(strValueOf) && this.f54156l.get(strValueOf).booleanValue()) {
            this.f54156l.remove(strValueOf);
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zHasFocus = hasFocus();
        int selectionStart = getSelectionStart();
        C13081b c13081bM79152j = m79152j(selectionStart, getSelectionEnd());
        if (zHasFocus) {
            if (c13081bM79152j == null) {
                this.f54153i = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (this.f54153i || selectionStart == (i2 = c13081bM79152j.f54160a)) {
                this.f54153i = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            this.f54153i = true;
            this.f54151g = c13081bM79152j;
            setSelection(i2, c13081bM79152j.f54161b);
            return true;
        }
        if (c13081bM79152j == null) {
            this.f54153i = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f54153i || selectionStart == (i = c13081bM79152j.f54160a)) {
            this.f54153i = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f54153i = false;
        this.f54151g = c13081bM79152j;
        setSelection(i, c13081bM79152j.f54161b);
        return super.dispatchKeyEvent(keyEvent);
    }

    public List<String> getAtIdList() {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(this.f54152h)) {
            Iterator<C13081b> it = this.f54152h.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f54162c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final C13081b m79152j(int i, int i2) {
        List<C13081b> list = this.f54152h;
        if (list == null) {
            return null;
        }
        for (C13081b c13081b : list) {
            if (c13081b.m79154a(i, i2)) {
                return c13081b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C13081b m79153k(int i, int i2) {
        List<C13081b> list = this.f54152h;
        if (list == null) {
            return null;
        }
        for (C13081b c13081b : list) {
            if (c13081b.m79157d(i, i2)) {
                return c13081b;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f54150f) {
            C13081b c13081b = this.f54151g;
            if (c13081b == null || !c13081b.m79156c(i, i2)) {
                C13081b c13081bM79152j = m79152j(i, i2);
                if (c13081bM79152j != null && c13081bM79152j.f54161b == i2) {
                    this.f54153i = false;
                }
                C13081b c13081bM79153k = m79153k(i, i2);
                if (c13081bM79153k != null) {
                    if (i == i2) {
                        setSelection(c13081bM79153k.m79155b(i));
                        return;
                    }
                    int i3 = c13081bM79153k.f54161b;
                    if (i2 < i3) {
                        setSelection(i, i3);
                    }
                    int i4 = c13081bM79153k.f54160a;
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
        this.f54149e = i;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public void setSpaceHint(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            super.setHint(charSequence);
        }
        if (charSequence.toString().startsWith(this.f54158n)) {
            super.setHint(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder(this.f54158n);
        this.f54157m = sb;
        sb.append(charSequence);
        super.setHint(this.f54157m);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f54148d == null) {
            this.f54148d = new RunnableC13080a();
        }
        post(this.f54148d);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        super.setFocusable(z);
    }

    public MessageInputEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54150f = false;
        this.f54154j = null;
        this.f54155k = new ArrayList<>();
        this.f54156l = new HashMap<>();
        this.f54158n = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m79151l();
    }

    public MessageInputEditView(Context context) {
        super(context);
        this.f54150f = false;
        this.f54154j = null;
        this.f54155k = new ArrayList<>();
        this.f54156l = new HashMap<>();
        this.f54158n = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m79151l();
    }
}
