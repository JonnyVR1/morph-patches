package p149l;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* JADX INFO: loaded from: classes8.dex */
public final class tsm {

    /* JADX INFO: renamed from: a */
    public static InputFilter f171944a = C20267a.m190563a();

    /* JADX INFO: renamed from: l.tsm$a */
    public static class C20267a implements InputFilter {

        /* JADX INFO: renamed from: a */
        public char[] f171945a;

        public C20267a(char[] cArr) {
            this.f171945a = cArr == null ? new char[0] : cArr;
        }

        /* JADX INFO: renamed from: a */
        public static C20267a m190563a() {
            return new C20267a(new char[]{'\n'});
        }

        /* JADX INFO: renamed from: b */
        public final boolean m190564b(char c) {
            for (char c2 : this.f171945a) {
                if (c2 == c) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m190565c(CharSequence charSequence) {
            String string = charSequence.toString();
            for (char c : this.f171945a) {
                if (string.indexOf(c) >= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!m190565c(charSequence)) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i5 = i;
            while (i < i2) {
                if (m190564b(charSequence.charAt(i))) {
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
