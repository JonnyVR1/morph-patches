package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class z7s0 extends a8s0 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m217504b(@Nullable String str) {
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

    @Override // p149l.a8s0
    /* JADX INFO: renamed from: a */
    public final String mo95361a(@Nullable String str, String str2) {
        String strM217504b = m217504b(str);
        String strM217504b2 = m217504b(str2);
        if (TextUtils.isEmpty(strM217504b)) {
            return strM217504b2;
        }
        if (TextUtils.isEmpty(strM217504b2)) {
            return strM217504b;
        }
        return strM217504b + Constants.SEPARATOR_COMMA + strM217504b2;
    }
}
