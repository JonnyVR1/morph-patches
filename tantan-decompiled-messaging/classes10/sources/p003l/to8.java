package p003l;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import l.lsi0;
import l.t0g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class to8 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public int f7590a;

    public to8(int i) {
        this.f7590a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9601a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (t0g0.i(c)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f7590a - (spanned.length() - (i4 - i3));
        if (length == 1 && m9601a(charSequence.toString())) {
            lsi0.j("最多可输入" + this.f7590a + "字");
            return "";
        }
        int i5 = i2 - i;
        if (length < i5) {
            lsi0.j("最多可输入" + this.f7590a + "字");
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
