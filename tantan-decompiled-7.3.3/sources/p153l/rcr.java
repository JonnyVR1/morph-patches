package p153l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class rcr implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f162250a;

    /* JADX INFO: renamed from: b */
    public x20 f162251b;

    /* JADX INFO: renamed from: c */
    public boolean f162252c;

    public rcr(int i, x20 x20Var) {
        this.f162252c = true;
        this.f162250a = i;
        this.f162251b = x20Var;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int iM175778J = this.f162252c ? q8g0.m175778J(spanned) : spanned.length();
        if (iM175778J >= this.f162250a && i3 >= i4) {
            x20 x20Var = this.f162251b;
            if (x20Var != null) {
                x20Var.call();
            }
            return "";
        }
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!this.f162252c || !a9g0.m96574i(c)) {
                sb.append(c);
            }
        }
        int i5 = ((this.f162250a - iM175778J) + i4) - i3;
        if (i5 <= 0) {
            return "";
        }
        if (TextUtils.isEmpty(sb)) {
            return null;
        }
        if (i5 >= (this.f162252c ? q8g0.m175778J(sb) : sb.length())) {
            return null;
        }
        sb.delete(0, sb.length());
        int i6 = 0;
        for (char c2 : charArray) {
            int i7 = 1;
            if (this.f162252c && a9g0.m96573h(c2)) {
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

    public rcr(int i, x20 x20Var, boolean z) {
        this.f162250a = i;
        this.f162251b = x20Var;
        this.f162252c = z;
    }
}
