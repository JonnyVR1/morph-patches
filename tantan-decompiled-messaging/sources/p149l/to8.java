package p149l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class to8 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f171322a;

    public to8(int i) {
        this.f171322a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m189843a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (t0g0.m186868i(c)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f171322a - (spanned.length() - (i4 - i3));
        if (length == 1 && m189843a(charSequence.toString())) {
            lsi0.m151580j("最多可输入" + this.f171322a + "字");
            return "";
        }
        int i5 = i2 - i;
        if (length < i5) {
            lsi0.m151580j("最多可输入" + this.f171322a + "字");
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
