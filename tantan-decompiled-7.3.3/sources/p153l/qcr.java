package p153l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class qcr implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f156615a;

    /* JADX INFO: renamed from: b */
    public x20 f156616b;

    public qcr(int i, x20 x20Var) {
        this.f156615a = i;
        this.f156616b = x20Var;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (q8g0.m175778J(spanned) >= this.f156615a && i3 >= i4) {
            x20 x20Var = this.f156616b;
            if (x20Var != null) {
                x20Var.call();
            }
            return "";
        }
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!a9g0.m96574i(c)) {
                sb.append(c);
            }
        }
        int iM175778J = ((this.f156615a - q8g0.m175778J(spanned)) + i4) - i3;
        if (iM175778J <= 0) {
            return "";
        }
        if (TextUtils.isEmpty(sb) || iM175778J >= q8g0.m175778J(sb)) {
            return null;
        }
        sb.delete(0, sb.length());
        int i5 = 0;
        for (int i6 = 0; i6 < charArray.length; i6++) {
            int i7 = (a9g0.m96573h(charArray[i6]) ? 2 : 1) + i5;
            if (i7 <= iM175778J) {
                sb.append(charArray[i6]);
                i5 = i7;
            }
        }
        return sb;
    }

    public qcr(int i) {
        this.f156615a = i;
    }
}
