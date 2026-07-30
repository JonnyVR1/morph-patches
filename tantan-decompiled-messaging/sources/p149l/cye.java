package p149l;

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
public final class cye {

    /* JADX INFO: renamed from: a */
    public final exe.C16716h f82966a;

    /* JADX INFO: renamed from: b */
    public final k100 f82967b;

    /* JADX INFO: renamed from: c */
    public C16277b f82968c = new C16277b();

    /* JADX INFO: renamed from: d */
    public final boolean f82969d;

    /* JADX INFO: renamed from: e */
    public final int[] f82970e;

    /* JADX INFO: renamed from: l.cye$a */
    public static final class C16276a {
        /* JADX INFO: renamed from: a */
        public static int m109297a(CharSequence charSequence, int i, int i2) {
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
        public static int m109298b(CharSequence charSequence, int i, int i2) {
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

    /* JADX INFO: renamed from: l.cye$b */
    @AnyThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C16277b {

        /* JADX INFO: renamed from: b */
        public static final ThreadLocal<StringBuilder> f82971b = new ThreadLocal<>();

        /* JADX INFO: renamed from: a */
        public final TextPaint f82972a;

        public C16277b() {
            TextPaint textPaint = new TextPaint();
            this.f82972a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        /* JADX INFO: renamed from: a */
        public static StringBuilder m109299a() {
            ThreadLocal<StringBuilder> threadLocal = f82971b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        /* JADX INFO: renamed from: b */
        public boolean m109300b(CharSequence charSequence, int i, int i2) {
            StringBuilder sbM109299a = m109299a();
            sbM109299a.setLength(0);
            while (i < i2) {
                sbM109299a.append(charSequence.charAt(i));
                i++;
            }
            return g760.m124684a(this.f82972a, sbM109299a.toString());
        }
    }

    /* JADX INFO: renamed from: l.cye$c */
    public static final class C16278c {

        /* JADX INFO: renamed from: a */
        public int f82973a = 1;

        /* JADX INFO: renamed from: b */
        public final k100.C17902a f82974b;

        /* JADX INFO: renamed from: c */
        public k100.C17902a f82975c;

        /* JADX INFO: renamed from: d */
        public k100.C17902a f82976d;

        /* JADX INFO: renamed from: e */
        public int f82977e;

        /* JADX INFO: renamed from: f */
        public int f82978f;

        /* JADX INFO: renamed from: g */
        public final boolean f82979g;

        /* JADX INFO: renamed from: h */
        public final int[] f82980h;

        public C16278c(k100.C17902a c17902a, boolean z, int[] iArr) {
            this.f82974b = c17902a;
            this.f82975c = c17902a;
            this.f82979g = z;
            this.f82980h = iArr;
        }

        /* JADX INFO: renamed from: d */
        public static boolean m109301d(int i) {
            return i == 65039;
        }

        /* JADX INFO: renamed from: f */
        public static boolean m109302f(int i) {
            return i == 65038;
        }

        /* JADX INFO: renamed from: a */
        public int m109303a(int i) {
            k100.C17902a c17902aM144134a = this.f82975c.m144134a(i);
            int iM109307g = 2;
            if (this.f82973a != 2) {
                if (c17902aM144134a == null) {
                    iM109307g = m109307g();
                } else {
                    this.f82973a = 2;
                    this.f82975c = c17902aM144134a;
                    this.f82978f = 1;
                }
            } else if (c17902aM144134a != null) {
                this.f82975c = c17902aM144134a;
                this.f82978f++;
            } else if (m109302f(i)) {
                iM109307g = m109307g();
            } else if (!m109301d(i)) {
                if (this.f82975c.m144135b() != null) {
                    iM109307g = 3;
                    if (this.f82978f != 1 || m109308h()) {
                        this.f82976d = this.f82975c;
                        m109307g();
                    } else {
                        iM109307g = m109307g();
                    }
                } else {
                    iM109307g = m109307g();
                }
            }
            this.f82977e = i;
            return iM109307g;
        }

        /* JADX INFO: renamed from: b */
        public bye m109304b() {
            return this.f82975c.m144135b();
        }

        /* JADX INFO: renamed from: c */
        public bye m109305c() {
            return this.f82976d.m144135b();
        }

        /* JADX INFO: renamed from: e */
        public boolean m109306e() {
            if (this.f82973a != 2 || this.f82975c.m144135b() == null) {
                return false;
            }
            return this.f82978f > 1 || m109308h();
        }

        /* JADX INFO: renamed from: g */
        public final int m109307g() {
            this.f82973a = 1;
            this.f82975c = this.f82974b;
            this.f82978f = 0;
            return 1;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m109308h() {
            if (this.f82975c.m144135b().m104448i() || m109301d(this.f82977e)) {
                return true;
            }
            if (this.f82979g) {
                if (this.f82980h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f82980h, this.f82975c.m144135b().m104441b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public cye(@NonNull k100 k100Var, @NonNull exe.C16716h c16716h, boolean z, @Nullable int[] iArr) {
        this.f82966a = c16716h;
        this.f82967b = k100Var;
        this.f82969d = z;
        this.f82970e = iArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m109288b(Editable editable, KeyEvent keyEvent, boolean z) {
        dye[] dyeVarArr;
        if (m109292h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m109291g(selectionStart, selectionEnd) && (dyeVarArr = (dye[]) editable.getSpans(selectionStart, selectionEnd, dye.class)) != null && dyeVarArr.length > 0) {
            for (dye dyeVar : dyeVarArr) {
                int spanStart = editable.getSpanStart(dyeVar);
                int spanEnd = editable.getSpanEnd(dyeVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m109289d(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, boolean z) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m109291g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                iMax = C16276a.m109297a(editable, selectionStart, Math.max(i, 0));
                iMin = C16276a.m109298b(editable, selectionEnd, Math.max(i2, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            dye[] dyeVarArr = (dye[]) editable.getSpans(iMax, iMin, dye.class);
            if (dyeVarArr != null && dyeVarArr.length > 0) {
                for (dye dyeVar : dyeVarArr) {
                    int spanStart = editable.getSpanStart(dyeVar);
                    int spanEnd = editable.getSpanEnd(dyeVar);
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
    public static boolean m109290e(@NonNull Editable editable, int i, KeyEvent keyEvent) {
        boolean zM109288b;
        if (i != 67) {
            zM109288b = i != 112 ? false : m109288b(editable, keyEvent, true);
        } else {
            zM109288b = m109288b(editable, keyEvent, false);
        }
        if (!zM109288b) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m109291g(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m109292h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: a */
    public final void m109293a(@NonNull Spannable spannable, bye byeVar, int i, int i2) {
        spannable.setSpan(this.f82966a.m118662a(byeVar), i, i2, 33);
    }

    /* JADX INFO: renamed from: c */
    public bye m109294c(@NonNull CharSequence charSequence) {
        C16278c c16278c = new C16278c(this.f82967b.m144131f(), this.f82969d, this.f82970e);
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            if (c16278c.m109303a(iCodePointAt) != 2) {
                return null;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (c16278c.m109306e()) {
            return c16278c.m109304b();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m109295f(CharSequence charSequence, int i, int i2, bye byeVar) {
        if (byeVar.m104443d() == 0) {
            byeVar.m104449j(this.f82968c.m109300b(charSequence, i, i2));
        }
        return byeVar.m104443d() == 2;
    }

    /* JADX INFO: renamed from: i */
    public CharSequence m109296i(@NonNull CharSequence charSequence, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, boolean z) {
        Spannable spannableString;
        int iCharCount;
        dye[] dyeVarArr;
        boolean z2 = charSequence instanceof lmf0;
        if (z2) {
            ((lmf0) charSequence).m150571a();
        }
        if (!z2) {
            try {
                spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, dye.class) > i2) ? null : new SpannableString(charSequence);
            } finally {
                if (z2) {
                    ((lmf0) charSequence).m150573d();
                }
            }
        }
        if (spannableString != null && (dyeVarArr = (dye[]) spannableString.getSpans(i, i2, dye.class)) != null && dyeVarArr.length > 0) {
            for (dye dyeVar : dyeVarArr) {
                int spanStart = spannableString.getSpanStart(dyeVar);
                int spanEnd = spannableString.getSpanEnd(dyeVar);
                if (spanStart != i2) {
                    spannableString.removeSpan(dyeVar);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        if (i != i2 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && spannableString != null) {
                i3 -= ((dye[]) spannableString.getSpans(0, spannableString.length(), dye.class)).length;
            }
            C16278c c16278c = new C16278c(this.f82967b.m144131f(), this.f82969d, this.f82970e);
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int i4 = 0;
            Spannable spannableString2 = spannableString;
            loop1: while (true) {
                iCharCount = i;
                while (true) {
                    if (i >= i2 || i4 >= i3) {
                        break loop1;
                    }
                    int iM109303a = c16278c.m109303a(iCodePointAt);
                    if (iM109303a == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i = iCharCount;
                    } else if (iM109303a == 2) {
                        i += Character.charCount(iCodePointAt);
                        if (i < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, i);
                        }
                    } else if (iM109303a != 3) {
                    }
                }
                if (z || !m109295f(charSequence, iCharCount, i, c16278c.m109305c())) {
                    if (spannableString2 == null) {
                        spannableString2 = new SpannableString(charSequence);
                    }
                    m109293a(spannableString2, c16278c.m109305c(), iCharCount, i);
                    i4++;
                }
            }
            CharSequence charSequence2 = spannableString2;
            charSequence2 = spannableString2;
            if (c16278c.m109306e() && i4 < i3 && (z || !m109295f(charSequence, iCharCount, i, c16278c.m109304b()))) {
                if (spannableString2 == null) {
                    spannableString2 = new SpannableString(charSequence);
                }
                m109293a(spannableString2, c16278c.m109304b(), iCharCount, i);
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
