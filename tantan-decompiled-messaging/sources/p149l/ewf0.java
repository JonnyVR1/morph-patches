package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class ewf0 {
    /* JADX INFO: renamed from: a */
    public static int m118469a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains("_")) {
            str = str.split("_")[0];
        }
        if (str.contains("-")) {
            str = str.split("-")[0];
        }
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        if (strArrSplit.length >= 3) {
            for (int i = 0; i < 3; i++) {
                sb.append(strArrSplit[i]);
            }
            try {
                return Integer.parseInt(sb.toString());
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
