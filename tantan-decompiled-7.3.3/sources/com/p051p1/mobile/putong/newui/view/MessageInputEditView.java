package com.p051p1.mobile.putong.newui.view;

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
import p151v.VEditText;
import p153l.jyb;

/* JADX INFO: loaded from: classes10.dex */
public class MessageInputEditView extends VEditText {

    /* JADX INFO: renamed from: d */
    public Runnable f54996d;

    /* JADX INFO: renamed from: e */
    public int f54997e;

    /* JADX INFO: renamed from: f */
    public boolean f54998f;

    /* JADX INFO: renamed from: g */
    public C13244b f54999g;

    /* JADX INFO: renamed from: h */
    public List<C13244b> f55000h;

    /* JADX INFO: renamed from: i */
    public boolean f55001i;

    /* JADX INFO: renamed from: j */
    public C13244b f55002j;

    /* JADX INFO: renamed from: k */
    public ArrayList<C13244b> f55003k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, Boolean> f55004l;

    /* JADX INFO: renamed from: m */
    public StringBuilder f55005m;

    /* JADX INFO: renamed from: n */
    public String f55006n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.MessageInputEditView$a */
    public class RunnableC13243a implements Runnable {
        public RunnableC13243a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageInputEditView messageInputEditView = MessageInputEditView.this;
            messageInputEditView.setSelection(messageInputEditView.getText().length());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.MessageInputEditView$b */
    public class C13244b {

        /* JADX INFO: renamed from: a */
        public int f55008a;

        /* JADX INFO: renamed from: b */
        public int f55009b;

        /* JADX INFO: renamed from: c */
        public String f55010c;

        /* JADX INFO: renamed from: a */
        public boolean m80337a(int i, int i2) {
            return this.f55008a <= i && this.f55009b >= i2;
        }

        /* JADX INFO: renamed from: b */
        public int m80338b(int i) {
            int i2 = this.f55008a;
            int i3 = this.f55009b;
            return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m80339c(int i, int i2) {
            int i3 = this.f55008a;
            if (i3 == i && this.f55009b == i2) {
                return true;
            }
            return i3 == i2 && this.f55009b == i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m80340d(int i, int i2) {
            int i3 = this.f55008a;
            if (i <= i3 || i >= this.f55009b) {
                return i2 > i3 && i2 < this.f55009b;
            }
            return true;
        }
    }

    public MessageInputEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54998f = false;
        this.f55002j = null;
        this.f55003k = new ArrayList<>();
        this.f55004l = new HashMap<>();
        this.f55006n = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m80334l();
    }

    /* JADX INFO: renamed from: l */
    private void m80334l() {
        StringBuilder sb = new StringBuilder(this.f55006n);
        sb.append("输入新消息");
        this.f55005m = sb;
        super.setHint(sb);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2;
        if (!this.f54998f) {
            return super.dispatchKeyEvent(keyEvent);
        }
        String strValueOf = String.valueOf(keyEvent.hashCode());
        if (this.f55004l.containsKey(strValueOf) && this.f55004l.get(strValueOf).booleanValue()) {
            this.f55004l.remove(strValueOf);
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zHasFocus = hasFocus();
        int selectionStart = getSelectionStart();
        C13244b c13244bM80335j = m80335j(selectionStart, getSelectionEnd());
        if (zHasFocus) {
            if (c13244bM80335j == null) {
                this.f55001i = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (this.f55001i || selectionStart == (i2 = c13244bM80335j.f55008a)) {
                this.f55001i = false;
                return super.dispatchKeyEvent(keyEvent);
            }
            this.f55001i = true;
            this.f54999g = c13244bM80335j;
            setSelection(i2, c13244bM80335j.f55009b);
            return true;
        }
        if (c13244bM80335j == null) {
            this.f55001i = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f55001i || selectionStart == (i = c13244bM80335j.f55008a)) {
            this.f55001i = false;
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f55001i = false;
        this.f54999g = c13244bM80335j;
        setSelection(i, c13244bM80335j.f55009b);
        return super.dispatchKeyEvent(keyEvent);
    }

    public List<String> getAtIdList() {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(this.f55000h)) {
            Iterator<C13244b> it = this.f55000h.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f55010c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final C13244b m80335j(int i, int i2) {
        List<C13244b> list = this.f55000h;
        if (list == null) {
            return null;
        }
        for (C13244b c13244b : list) {
            if (c13244b.m80337a(i, i2)) {
                return c13244b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C13244b m80336k(int i, int i2) {
        List<C13244b> list = this.f55000h;
        if (list == null) {
            return null;
        }
        for (C13244b c13244b : list) {
            if (c13244b.m80340d(i, i2)) {
                return c13244b;
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
        if (this.f54998f) {
            C13244b c13244b = this.f54999g;
            if (c13244b == null || !c13244b.m80339c(i, i2)) {
                C13244b c13244bM80335j = m80335j(i, i2);
                if (c13244bM80335j != null && c13244bM80335j.f55009b == i2) {
                    this.f55001i = false;
                }
                C13244b c13244bM80336k = m80336k(i, i2);
                if (c13244bM80336k != null) {
                    if (i == i2) {
                        setSelection(c13244bM80336k.m80338b(i));
                        return;
                    }
                    int i3 = c13244bM80336k.f55009b;
                    if (i2 < i3) {
                        setSelection(i, i3);
                    }
                    int i4 = c13244bM80336k.f55008a;
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
        this.f54997e = i;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public void setSpaceHint(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            super.setHint(charSequence);
        }
        if (charSequence.toString().startsWith(this.f55006n)) {
            super.setHint(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder(this.f55006n);
        this.f55005m = sb;
        sb.append(charSequence);
        super.setHint(this.f55005m);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (this.f54996d == null) {
            this.f54996d = new RunnableC13243a();
        }
        post(this.f54996d);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        super.setFocusable(z);
    }

    public MessageInputEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54998f = false;
        this.f55002j = null;
        this.f55003k = new ArrayList<>();
        this.f55004l = new HashMap<>();
        this.f55006n = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m80334l();
    }

    public MessageInputEditView(Context context) {
        super(context);
        this.f54998f = false;
        this.f55002j = null;
        this.f55003k = new ArrayList<>();
        this.f55004l = new HashMap<>();
        this.f55006n = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        m80334l();
    }
}
