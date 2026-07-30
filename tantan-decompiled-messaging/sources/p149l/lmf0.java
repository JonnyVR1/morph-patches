package p149l;

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
public final class lmf0 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class<?> f128786a;

    /* JADX INFO: renamed from: b */
    public final List<C18262a> f128787b;

    /* JADX INFO: renamed from: l.lmf0$a */
    public static class C18262a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        public final Object f128788a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f128789b = new AtomicInteger(0);

        public C18262a(Object obj) {
            this.f128788a = obj;
        }

        /* JADX INFO: renamed from: a */
        public final void m150579a() {
            this.f128789b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f128788a).afterTextChanged(editable);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m150580b(Object obj) {
            return obj instanceof dye;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f128788a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* JADX INFO: renamed from: c */
        public final void m150581c() {
            this.f128789b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f128789b.get() <= 0 || !m150580b(obj)) {
                ((SpanWatcher) this.f128788a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f128789b.get() <= 0 || !m150580b(obj)) {
                ((SpanWatcher) this.f128788a).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f128789b.get() <= 0 || !m150580b(obj)) {
                ((SpanWatcher) this.f128788a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f128788a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public lmf0(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f128787b = new ArrayList();
        tf80.m188659f(cls, "watcherClass cannot be null");
        this.f128786a = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: c */
    public static lmf0 m150570c(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new lmf0(cls, charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void m150571a() {
        m150572b();
    }

    /* JADX INFO: renamed from: b */
    public final void m150572b() {
        for (int i = 0; i < this.f128787b.size(); i++) {
            this.f128787b.get(i).m150579a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d */
    public void m150573d() {
        m150578i();
        m150574e();
    }

    /* JADX INFO: renamed from: e */
    public final void m150574e() {
        for (int i = 0; i < this.f128787b.size(); i++) {
            this.f128787b.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: f */
    public final C18262a m150575f(Object obj) {
        for (int i = 0; i < this.f128787b.size(); i++) {
            C18262a c18262a = this.f128787b.get(i);
            if (c18262a.f128788a == obj) {
                return c18262a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m150576g(@NonNull Class<?> cls) {
        return this.f128786a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C18262a c18262aM150575f;
        if (m150577h(obj) && (c18262aM150575f = m150575f(obj)) != null) {
            obj = c18262aM150575f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C18262a c18262aM150575f;
        if (m150577h(obj) && (c18262aM150575f = m150575f(obj)) != null) {
            obj = c18262aM150575f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C18262a c18262aM150575f;
        if (m150577h(obj) && (c18262aM150575f = m150575f(obj)) != null) {
            obj = c18262aM150575f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m150576g(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C18262a[] c18262aArr = (C18262a[]) super.getSpans(i, i2, C18262a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c18262aArr.length));
        for (int i3 = 0; i3 < c18262aArr.length; i3++) {
            tArr[i3] = c18262aArr[i3].f128788a;
        }
        return tArr;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m150577h(@Nullable Object obj) {
        return obj != null && m150576g(obj.getClass());
    }

    /* JADX INFO: renamed from: i */
    public final void m150578i() {
        for (int i = 0; i < this.f128787b.size(); i++) {
            this.f128787b.get(i).m150581c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (m150576g(cls)) {
            cls = C18262a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C18262a c18262aM150575f;
        if (m150577h(obj)) {
            c18262aM150575f = m150575f(obj);
            if (c18262aM150575f != null) {
                obj = c18262aM150575f;
            }
        } else {
            c18262aM150575f = null;
        }
        super.removeSpan(obj);
        if (c18262aM150575f != null) {
            this.f128787b.remove(c18262aM150575f);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m150572b();
        super.replace(i, i2, charSequence);
        m150578i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m150577h(obj)) {
            C18262a c18262a = new C18262a(obj);
            this.f128787b.add(c18262a);
            obj = c18262a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new lmf0(this.f128786a, this, i, i2);
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
        m150572b();
        super.replace(i, i2, charSequence, i3, i4);
        m150578i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public lmf0(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f128787b = new ArrayList();
        tf80.m188659f(cls, "watcherClass cannot be null");
        this.f128786a = cls;
    }
}
