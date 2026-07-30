package p003l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import l.i0g0;
import l.t0g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class par implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f6340a;

    /* JADX INFO: renamed from: b */
    public d30 f6341b;

    /* JADX INFO: renamed from: c */
    public boolean f6342c;

    public par(int i, d30 d30Var) {
        this.f6342c = true;
        this.f6340a = i;
        this.f6341b = d30Var;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int iJ = this.f6342c ? i0g0.J(spanned) : spanned.length();
        if (iJ >= this.f6340a && i3 >= i4) {
            d30 d30Var = this.f6341b;
            if (d30Var != null) {
                d30Var.call();
            }
            return "";
        }
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!this.f6342c || !t0g0.i(c)) {
                sb.append(c);
            }
        }
        int i5 = ((this.f6340a - iJ) + i4) - i3;
        if (i5 <= 0) {
            return "";
        }
        if (TextUtils.isEmpty(sb)) {
            return null;
        }
        if (i5 >= (this.f6342c ? i0g0.J(sb) : sb.length())) {
            return null;
        }
        sb.delete(0, sb.length());
        int i6 = 0;
        for (char c2 : charArray) {
            int i7 = 1;
            if (this.f6342c && t0g0.h(c2)) {
                i7 = 2;
            }
            int i8 = i7 + i6;
            if (i8 <= i5) {
                sb.append(c2);
                i6 = i8;
            }
        }
        return sb;
    }

    public par(int i, d30 d30Var, boolean z) {
        this.f6340a = i;
        this.f6341b = d30Var;
        this.f6342c = z;
    }
}
