package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class n4g0 {
    /* JADX INFO: renamed from: a */
    public static int m161564a(String str) {
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
