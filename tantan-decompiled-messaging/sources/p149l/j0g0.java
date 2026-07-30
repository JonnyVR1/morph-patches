package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class j0g0 {
    /* JADX INFO: renamed from: a */
    public static String m139165a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf("/");
        int iLastIndexOf2 = str.lastIndexOf("?");
        String strSubstring = iLastIndexOf2 > iLastIndexOf ? str.substring(iLastIndexOf + 1, iLastIndexOf2) : str.substring(iLastIndexOf + 1);
        return strSubstring.contains(".") ? strSubstring.substring(0, strSubstring.lastIndexOf(".")) : strSubstring;
    }
}
