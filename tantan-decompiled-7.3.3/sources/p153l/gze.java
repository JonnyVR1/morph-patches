package p153l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class gze {

    /* JADX INFO: renamed from: a */
    public final iye.C17828h f107188a;

    /* JADX INFO: renamed from: b */
    public final ha00 f107189b;

    /* JADX INFO: renamed from: c */
    public C17359b f107190c = new C17359b();

    /* JADX INFO: renamed from: d */
    public final boolean f107191d;

    /* JADX INFO: renamed from: e */
    public final int[] f107192e;

    /* JADX INFO: renamed from: l.gze$a */
    public static final class C17358a {
        /* JADX INFO: renamed from: a */
        public static int m133090a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        /* JADX INFO: renamed from: b */
        public static int m133091b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i2--;
                        i++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: l.gze$b */
    @AnyThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C17359b {

        /* JADX INFO: renamed from: b */
        public static final ThreadLocal<StringBuilder> f107193b = new ThreadLocal<>();

        /* JADX INFO: renamed from: a */
        public final TextPaint f107194a;

        public C17359b() {
            TextPaint textPaint = new TextPaint();
            this.f107194a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        /* JADX INFO: renamed from: a */
        public static StringBuilder m133092a() {
            ThreadLocal<StringBuilder> threadLocal = f107193b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        /* JADX INFO: renamed from: b */
        public boolean m133093b(CharSequence charSequence, int i, int i2) {
            StringBuilder sbM133092a = m133092a();
            sbM133092a.setLength(0);
            while (i < i2) {
                sbM133092a.append(charSequence.charAt(i));
                i++;
            }
            return mf60.m158147a(this.f107194a, sbM133092a.toString());
        }
    }

    /* JADX INFO: renamed from: l.gze$c */
    public static final class C17360c {

        /* JADX INFO: renamed from: a */
        public int f107195a = 1;

        /* JADX INFO: renamed from: b */
        public final ha00.C17428a f107196b;

        /* JADX INFO: renamed from: c */
        public ha00.C17428a f107197c;

        /* JADX INFO: renamed from: d */
        public ha00.C17428a f107198d;

        /* JADX INFO: renamed from: e */
        public int f107199e;

        /* JADX INFO: renamed from: f */
        public int f107200f;

        /* JADX INFO: renamed from: g */
        public final boolean f107201g;

        /* JADX INFO: renamed from: h */
        public final int[] f107202h;

        public C17360c(ha00.C17428a c17428a, boolean z, int[] iArr) {
            this.f107196b = c17428a;
            this.f107197c = c17428a;
            this.f107201g = z;
            this.f107202h = iArr;
        }

        /* JADX INFO: renamed from: d */
        public static boolean m133094d(int i) {
            return i == 65039;
        }

        /* JADX INFO: renamed from: f */
        public static boolean m133095f(int i) {
            return i == 65038;
        }

        /* JADX INFO: renamed from: a */
        public int m133096a(int i) {
            ha00.C17428a c17428aM134101a = this.f107197c.m134101a(i);
            int iM133100g = 2;
            if (this.f107195a != 2) {
                if (c17428aM134101a == null) {
                    iM133100g = m133100g();
                } else {
                    this.f107195a = 2;
                    this.f107197c = c17428aM134101a;
                    this.f107200f = 1;
                }
            } else if (c17428aM134101a != null) {
                this.f107197c = c17428aM134101a;
                this.f107200f++;
            } else if (m133095f(i)) {
                iM133100g = m133100g();
            } else if (!m133094d(i)) {
                if (this.f107197c.m134102b() != null) {
                    iM133100g = 3;
                    if (this.f107200f != 1 || m133101h()) {
                        this.f107198d = this.f107197c;
                        m133100g();
                    } else {
                        iM133100g = m133100g();
                    }
                } else {
                    iM133100g = m133100g();
                }
            }
            this.f107199e = i;
            return iM133100g;
        }

        /* JADX INFO: renamed from: b */
        public fze m133097b() {
            return this.f107197c.m134102b();
        }

        /* JADX INFO: renamed from: c */
        public fze m133098c() {
            return this.f107198d.m134102b();
        }

        /* JADX INFO: renamed from: e */
        public boolean m133099e() {
            if (this.f107195a != 2 || this.f107197c.m134102b() == null) {
                return false;
            }
            return this.f107200f > 1 || m133101h();
        }

        /* JADX INFO: renamed from: g */
        public final int m133100g() {
            this.f107195a = 1;
            this.f107197c = this.f107196b;
            this.f107200f = 0;
            return 1;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m133101h() {
            if (this.f107197c.m134102b().m128168i() || m133094d(this.f107199e)) {
                return true;
            }
            if (this.f107201g) {
                if (this.f107202h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f107202h, this.f107197c.m134102b().m128161b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public gze(@NonNull ha00 ha00Var, @NonNull iye.C17828h c17828h, boolean z, @Nullable int[] iArr) {
        this.f107188a = c17828h;
        this.f107189b = ha00Var;
        this.f107191d = z;
        this.f107192e = iArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m133081b(Editable editable, KeyEvent keyEvent, boolean z) {
        hze[] hzeVarArr;
        if (m133085h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m133084g(selectionStart, selectionEnd) && (hzeVarArr = (hze[]) editable.getSpans(selectionStart, selectionEnd, hze.class)) != null && hzeVarArr.length > 0) {
            for (hze hzeVar : hzeVarArr) {
                int spanStart = editable.getSpanStart(hzeVar);
                int spanEnd = editable.getSpanEnd(hzeVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m133082d(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m133084g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = C17358a.m133090a(editable, selectionStart, Math.max(i, 0));
                iMin = C17358a.m133091b(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            hze[] hzeVarArr = (hze[]) editable.getSpans(iMax, iMin, hze.class);
            if (hzeVarArr != null && hzeVarArr.length > 0) {
                for (hze hzeVar : hzeVarArr) {
                    int spanStart = editable.getSpanStart(hzeVar);
                    int spanEnd = editable.getSpanEnd(hzeVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m133083e(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        boolean zM133081b;
        if (i != 67) {
            zM133081b = i != 112 ? false : m133081b(editable, keyEvent, true);
        } else {
            zM133081b = m133081b(editable, keyEvent, false);
        }
        if (!zM133081b) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m133084g(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m133085h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: a */
    public final void m133086a(@NonNull Spannable spannable, fze fzeVar, int i, int i2) {
        spannable.setSpan(this.f107188a.m142653a(fzeVar), i, i2, 33);
    }

    /* JADX INFO: renamed from: c */
    public fze m133087c(@NonNull CharSequence charSequence) {
        C17360c c17360c = new C17360c(this.f107189b.m134098f(), this.f107191d, this.f107192e);
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            if (c17360c.m133096a(iCodePointAt) != 2) {
                return null;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (c17360c.m133099e()) {
            return c17360c.m133097b();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m133088f(CharSequence charSequence, int i, int i2, fze fzeVar) {
        if (fzeVar.m128163d() == 0) {
            fzeVar.m128169j(this.f107190c.m133093b(charSequence, i, i2));
        }
        return fzeVar.m128163d() == 2;
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m133089i(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
        Spannable spannableString;
        int iCharCount;
        hze[] hzeVarArr;
        boolean z2 = charSequence instanceof uuf0;
        if (z2) {
            ((uuf0) charSequence).m198199a();
        }
        if (!z2) {
            try {
                spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, hze.class) > i2) ? null : new SpannableString(charSequence);
            } finally {
                if (z2) {
                    ((uuf0) charSequence).m198201d();
                }
            }
        }
        if (spannableString != null && (hzeVarArr = (hze[]) spannableString.getSpans(i, i2, hze.class)) != null && hzeVarArr.length > 0) {
            for (hze hzeVar : hzeVarArr) {
                int spanStart = spannableString.getSpanStart(hzeVar);
                int spanEnd = spannableString.getSpanEnd(hzeVar);
                if (spanStart != i2) {
                    spannableString.removeSpan(hzeVar);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        if (i != i2 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && spannableString != null) {
                i3 -= ((hze[]) spannableString.getSpans(0, spannableString.length(), hze.class)).length;
            }
            C17360c c17360c = new C17360c(this.f107189b.m134098f(), this.f107191d, this.f107192e);
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int i4 = 0;
            Spannable spannableString2 = spannableString;
            loop1: while (true) {
                iCharCount = i;
                while (true) {
                    if (i >= i2 || i4 >= i3) {
                        break loop1;
                    }
                    int iM133096a = c17360c.m133096a(iCodePointAt);
                    if (iM133096a == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i = iCharCount;
                    } else if (iM133096a == 2) {
                        i += Character.charCount(iCodePointAt);
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                        }
                    } else if (iM133096a != 3) {
                    }
                }
                if (z || !m133088f(charSequence, iCharCount, i, c17360c.m133098c())) {
                    if (spannableString2 == null) {
                        spannableString2 = new SpannableString(charSequence);
                    }
                    m133086a(spannableString2, c17360c.m133098c(), iCharCount, i);
                    i4++;
                }
            }
            CharSequence charSequence2 = spannableString2;
            charSequence2 = spannableString2;
            if (c17360c.m133099e() && i4 < i3 && (z || !m133088f(charSequence, iCharCount, i, c17360c.m133097b()))) {
                if (spannableString2 == null) {
                    spannableString2 = new SpannableString(charSequence);
                }
                m133086a(spannableString2, c17360c.m133097b(), iCharCount, i);
                charSequence2 = spannableString2;
            }
            if (charSequence2 == null) {
                charSequence2 = charSequence;
            }
            return charSequence2;
        }
        return charSequence;
    }
}
