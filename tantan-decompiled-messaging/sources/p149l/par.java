package p149l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class par implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f148002a;

    /* JADX INFO: renamed from: b */
    public d30 f148003b;

    /* JADX INFO: renamed from: c */
    public boolean f148004c;

    public par(int i, d30 d30Var) {
        this.f148004c = true;
        this.f148002a = i;
        this.f148003b = d30Var;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int iM133843J = this.f148004c ? i0g0.m133843J(spanned) : spanned.length();
        if (iM133843J >= this.f148002a && i3 >= i4) {
            d30 d30Var = this.f148003b;
            if (d30Var != null) {
                d30Var.call();
            }
            return "";
        }
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!this.f148004c || !t0g0.m186868i(c)) {
                sb.append(c);
            }
        }
        int i5 = ((this.f148002a - iM133843J) + i4) - i3;
        if (i5 <= 0) {
            return "";
        }
        if (TextUtils.isEmpty(sb)) {
            return null;
        }
        if (i5 >= (this.f148004c ? i0g0.m133843J(sb) : sb.length())) {
            return null;
        }
        sb.delete(0, sb.length());
        int i6 = 0;
        for (char c2 : charArray) {
            int i7 = 1;
            if (this.f148004c && t0g0.m186867h(c2)) {
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
        this.f148002a = i;
        this.f148003b = d30Var;
        this.f148004c = z;
    }
}
