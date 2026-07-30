package com.p000p1.mobile.putong.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.vwb;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MessageInputEditView extends VEditText {

    /* JADX INFO: renamed from: d */
    public Runnable f7754d;

    /* JADX INFO: renamed from: e */
    public int f7755e;

    /* JADX INFO: renamed from: f */
    public boolean f7756f;

    /* JADX INFO: renamed from: g */
    public C0483b f7757g;

    /* JADX INFO: renamed from: h */
    public List<C0483b> f7758h;

    /* JADX INFO: renamed from: i */
    public boolean f7759i;

    /* JADX INFO: renamed from: j */
    public C0483b f7760j;

    /* JADX INFO: renamed from: k */
    public ArrayList<C0483b> f7761k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, Boolean> f7762l;

    /* JADX INFO: renamed from: m */
    public StringBuilder f7763m;

    /* JADX INFO: renamed from: n */
    public String f7764n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.MessageInputEditView$a */
    public class RunnableC0482a implements Runnable {
        public RunnableC0482a() {
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
            VEditText vEditText = MessageInputEditView.this;
            vEditText.setSelection(vEditText.getText().length());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.view.MessageInputEditView$b */
    public class C0483b {

        /* JADX INFO: renamed from: a */
        public int f7766a;

        /* JADX INFO: renamed from: b */
        public int f7767b;

        /* JADX INFO: renamed from: c */
        public String f7768c;

        /* JADX INFO: renamed from: a */
        public boolean m9473a(int i, int i2) {
            return this.f7766a <= i && this.f7767b >= i2;
        }

        /* JADX INFO: renamed from: b */
        public int m9474b(int i) {
            int i2 = this.f7766a;
            int i3 = this.f7767b;
            return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
        }

        /* JADX INFO: renamed from: c */
        public boolean m9475c(int i, int i2) {
            int i3 = this.f7766a;
            if (i3 == i && this.f7767b == i2) {
                return true;
            }
            return i3 == i2 && this.f7767b == i;
        }

        /* JADX INFO: renamed from: d */
        public boolean m9476d(int i, int i2) {
            int i3 = this.f7766a;
            if (i <= i3 || i >= this.f7767b) {
                return i2 > i3 && i2 < this.f7767b;
            }
            return true;
        }
    }

    public MessageInputEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7756f = false;
        this.f7760j = null;
        this.f7761k = new ArrayList<>();
        this.f7762l = new HashMap<>();
        this.f7764n = " ";
        m9470l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private void m9470l() {
        StringBuilder sb = new StringBuilder(this.f7764n);
        sb.append("输入新消息");
        this.f7763m = sb;
        super/*android.widget.TextView*/.setHint(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int i2;
        if (!this.f7756f) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        String strValueOf = String.valueOf(keyEvent.hashCode());
        if (this.f7762l.containsKey(strValueOf) && this.f7762l.get(strValueOf).booleanValue()) {
            this.f7762l.remove(strValueOf);
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        boolean zHasFocus = hasFocus();
        int selectionStart = getSelectionStart();
        C0483b c0483bM9471j = m9471j(selectionStart, getSelectionEnd());
        if (zHasFocus) {
            if (c0483bM9471j == null) {
                this.f7759i = false;
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            if (this.f7759i || selectionStart == (i2 = c0483bM9471j.f7766a)) {
                this.f7759i = false;
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            this.f7759i = true;
            this.f7757g = c0483bM9471j;
            setSelection(i2, c0483bM9471j.f7767b);
            return true;
        }
        if (c0483bM9471j == null) {
            this.f7759i = false;
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        if (this.f7759i || selectionStart == (i = c0483bM9471j.f7766a)) {
            this.f7759i = false;
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        this.f7759i = false;
        this.f7757g = c0483bM9471j;
        setSelection(i, c0483bM9471j.f7767b);
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    public List<String> getAtIdList() {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(this.f7758h)) {
            Iterator<C0483b> it = this.f7758h.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f7768c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final C0483b m9471j(int i, int i2) {
        List<C0483b> list = this.f7758h;
        if (list == null) {
            return null;
        }
        for (C0483b c0483b : list) {
            if (c0483b.m9473a(i, i2)) {
                return c0483b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C0483b m9472k(int i, int i2) {
        List<C0483b> list = this.f7758h;
        if (list == null) {
            return null;
        }
        for (C0483b c0483b : list) {
            if (c0483b.m9476d(i, i2)) {
                return c0483b;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSelectionChanged(int i, int i2) {
        super/*android.widget.TextView*/.onSelectionChanged(i, i2);
        if (this.f7756f) {
            C0483b c0483b = this.f7757g;
            if (c0483b == null || !c0483b.m9475c(i, i2)) {
                C0483b c0483bM9471j = m9471j(i, i2);
                if (c0483bM9471j != null && c0483bM9471j.f7767b == i2) {
                    this.f7759i = false;
                }
                C0483b c0483bM9472k = m9472k(i, i2);
                if (c0483bM9472k != null) {
                    if (i == i2) {
                        setSelection(c0483bM9472k.m9474b(i));
                        return;
                    }
                    int i3 = c0483bM9472k.f7767b;
                    if (i2 < i3) {
                        setSelection(i, i3);
                    }
                    int i4 = c0483bM9472k.f7766a;
                    if (i > i4) {
                        setSelection(i4, i2);
                    }
                }
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
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
        this.f7755e = i;
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
        if (charSequence.toString().startsWith(this.f7764n)) {
            super/*android.widget.TextView*/.setHint(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder(this.f7764n);
        this.f7763m = sb;
        sb.append(charSequence);
        super/*android.widget.TextView*/.setHint(this.f7763m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
        if (this.f7754d == null) {
            this.f7754d = new RunnableC0482a();
        }
        post(this.f7754d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setFocusable(boolean z) {
        super/*android.view.View*/.setFocusable(z);
    }

    public MessageInputEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7756f = false;
        this.f7760j = null;
        this.f7761k = new ArrayList<>();
        this.f7762l = new HashMap<>();
        this.f7764n = " ";
        m9470l();
    }

    public MessageInputEditView(Context context) {
        super(context);
        this.f7756f = false;
        this.f7760j = null;
        this.f7761k = new ArrayList<>();
        this.f7762l = new HashMap<>();
        this.f7764n = " ";
        m9470l();
    }
}
