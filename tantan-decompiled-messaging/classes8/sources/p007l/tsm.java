package p007l;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class tsm {

    /* JADX INFO: renamed from: a */
    public static InputFilter f4441a = C0720a.m11175a();

    /* JADX INFO: renamed from: l.tsm$a */
    public static class C0720a implements InputFilter {

        /* JADX INFO: renamed from: a */
        public char[] f4442a;

        public C0720a(char[] cArr) {
            this.f4442a = cArr == null ? new char[0] : cArr;
        }

        /* JADX INFO: renamed from: a */
        public static C0720a m11175a() {
            return new C0720a(new char[]{'\n'});
        }

        /* JADX INFO: renamed from: b */
        public final boolean m11176b(char c) {
            for (char c2 : this.f4442a) {
                if (c2 == c) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m11177c(CharSequence charSequence) {
            String string = charSequence.toString();
            for (char c : this.f4442a) {
                if (string.indexOf(c) >= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!m11177c(charSequence)) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i5 = i;
            while (i < i2) {
                if (m11176b(charSequence.charAt(i))) {
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
