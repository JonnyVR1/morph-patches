package p153l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class yp8 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f201048a;

    public yp8(int i) {
        this.f201048a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m217004a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (a9g0.m96574i(c)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f201048a - (spanned.length() - (i4 - i3));
        if (length == 1 && m217004a(charSequence.toString())) {
            o1j0.m165636j("最多可输入" + this.f201048a + "字");
            return "";
        }
        int i5 = i2 - i;
        if (length < i5) {
            o1j0.m165636j("最多可输入" + this.f201048a + "字");
        }
        if (length <= 0) {
            return "";
        }
        if (length >= i5) {
            return null;
        }
        return charSequence.subSequence(i, length + i);
    }
}
