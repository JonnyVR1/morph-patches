package p153l;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* JADX INFO: loaded from: classes8.dex */
public final class vum {

    /* JADX INFO: renamed from: a */
    public static InputFilter f185823a = C20936a.m202805a();

    /* JADX INFO: renamed from: l.vum$a */
    public static class C20936a implements InputFilter {

        /* JADX INFO: renamed from: a */
        public char[] f185824a;

        public C20936a(char[] cArr) {
            this.f185824a = cArr == null ? new char[0] : cArr;
        }

        /* JADX INFO: renamed from: a */
        public static C20936a m202805a() {
            return new C20936a(new char[]{'\n'});
        }

        /* JADX INFO: renamed from: b */
        public final boolean m202806b(char c) {
            for (char c2 : this.f185824a) {
                if (c2 == c) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m202807c(CharSequence charSequence) {
            String string = charSequence.toString();
            for (char c : this.f185824a) {
                if (string.indexOf(c) >= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!m202807c(charSequence)) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i5 = i;
            while (i < i2) {
                if (m202806b(charSequence.charAt(i))) {
                    if (i != i5) {
                        spannableStringBuilder.append(charSequence.subSequence(i5, i));
                    }
                    i5 = i + 1;
                }
                i++;
            }
            if (i5 < i2) {
                spannableStringBuilder.append(charSequence.subSequence(i5, i2));
            }
            return spannableStringBuilder;
        }
    }
}
