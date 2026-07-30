package p149l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class oar implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f142859a;

    /* JADX INFO: renamed from: b */
    public d30 f142860b;

    public oar(int i, d30 d30Var) {
        this.f142859a = i;
        this.f142860b = d30Var;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i0g0.m133843J(spanned) >= this.f142859a && i3 >= i4) {
            d30 d30Var = this.f142860b;
            if (d30Var != null) {
                d30Var.call();
            }
            return "";
        }
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!t0g0.m186868i(c)) {
                sb.append(c);
            }
        }
        int iM133843J = ((this.f142859a - i0g0.m133843J(spanned)) + i4) - i3;
        if (iM133843J <= 0) {
            return "";
        }
        if (TextUtils.isEmpty(sb) || iM133843J >= i0g0.m133843J(sb)) {
            return null;
        }
        sb.delete(0, sb.length());
        int i5 = 0;
        for (int i6 = 0; i6 < charArray.length; i6++) {
            int i7 = (t0g0.m186867h(charArray[i6]) ? 2 : 1) + i5;
            if (i7 <= iM133843J) {
                sb.append(charArray[i6]);
                i5 = i7;
            }
        }
        return sb;
    }

    public oar(int i) {
        this.f142859a = i;
    }
}
