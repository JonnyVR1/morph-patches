package p153l;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class uuf0 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class<?> f181068a;

    /* JADX INFO: renamed from: b */
    public final List<C20679a> f181069b;

    /* JADX INFO: renamed from: l.uuf0$a */
    public static class C20679a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        public final Object f181070a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f181071b = new AtomicInteger(0);

        public C20679a(Object obj) {
            this.f181070a = obj;
        }

        /* JADX INFO: renamed from: a */
        public final void m198207a() {
            this.f181071b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f181070a).afterTextChanged(editable);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m198208b(Object obj) {
            return obj instanceof hze;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f181070a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* JADX INFO: renamed from: c */
        public final void m198209c() {
            this.f181071b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f181071b.get() <= 0 || !m198208b(obj)) {
                ((SpanWatcher) this.f181070a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f181071b.get() <= 0 || !m198208b(obj)) {
                ((SpanWatcher) this.f181070a).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f181071b.get() <= 0 || !m198208b(obj)) {
                ((SpanWatcher) this.f181070a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f181070a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public uuf0(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f181069b = new ArrayList();
        yn80.m216776f(cls, "watcherClass cannot be null");
        this.f181068a = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: c */
    public static uuf0 m198198c(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new uuf0(cls, charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void m198199a() {
        m198200b();
    }

    /* JADX INFO: renamed from: b */
    public final void m198200b() {
        for (int i = 0; i < this.f181069b.size(); i++) {
            this.f181069b.get(i).m198207a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d */
    public void m198201d() {
        m198206i();
        m198202e();
    }

    /* JADX INFO: renamed from: e */
    public final void m198202e() {
        for (int i = 0; i < this.f181069b.size(); i++) {
            this.f181069b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: f */
    public final C20679a m198203f(Object obj) {
        for (int i = 0; i < this.f181069b.size(); i++) {
            C20679a c20679a = this.f181069b.get(i);
            if (c20679a.f181070a == obj) {
                return c20679a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m198204g(@NonNull Class<?> cls) {
        return this.f181068a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C20679a c20679aM198203f;
        if (m198205h(obj) && (c20679aM198203f = m198203f(obj)) != null) {
            obj = c20679aM198203f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C20679a c20679aM198203f;
        if (m198205h(obj) && (c20679aM198203f = m198203f(obj)) != null) {
            obj = c20679aM198203f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C20679a c20679aM198203f;
        if (m198205h(obj) && (c20679aM198203f = m198203f(obj)) != null) {
            obj = c20679aM198203f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m198204g(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C20679a[] c20679aArr = (C20679a[]) super.getSpans(i, i2, C20679a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c20679aArr.length));
        for (int i3 = 0; i3 < c20679aArr.length; i3++) {
            tArr[i3] = c20679aArr[i3].f181070a;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m198205h(@Nullable Object obj) {
        return obj != null && m198204g(obj.getClass());
    }

    /* JADX INFO: renamed from: i */
    public final void m198206i() {
        for (int i = 0; i < this.f181069b.size(); i++) {
            this.f181069b.get(i).m198209c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (m198204g(cls)) {
            cls = C20679a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C20679a c20679aM198203f;
        if (m198205h(obj)) {
            c20679aM198203f = m198203f(obj);
            if (c20679aM198203f != null) {
                obj = c20679aM198203f;
            }
        } else {
            c20679aM198203f = null;
        }
        super.removeSpan(obj);
        if (c20679aM198203f != null) {
            this.f181069b.remove(c20679aM198203f);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m198200b();
        super.replace(i, i2, charSequence);
        m198206i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m198205h(obj)) {
            C20679a c20679a = new C20679a(obj);
            this.f181069b.add(c20679a);
            obj = c20679a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new uuf0(this.f181068a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m198200b();
        super.replace(i, i2, charSequence, i3, i4);
        m198206i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public uuf0(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f181069b = new ArrayList();
        yn80.m216776f(cls, "watcherClass cannot be null");
        this.f181068a = cls;
    }
}
