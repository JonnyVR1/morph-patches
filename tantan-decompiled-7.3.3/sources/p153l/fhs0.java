package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class fhs0 extends ghs0 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m125602b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // p153l.ghs0
    /* JADX INFO: renamed from: a */
    public final String mo115811a(@Nullable String str, String str2) {
        String strM125602b = m125602b(str);
        String strM125602b2 = m125602b(str2);
        if (TextUtils.isEmpty(strM125602b)) {
            return strM125602b2;
        }
        if (TextUtils.isEmpty(strM125602b2)) {
            return strM125602b;
        }
        return strM125602b + Constants.SEPARATOR_COMMA + strM125602b2;
    }
}
