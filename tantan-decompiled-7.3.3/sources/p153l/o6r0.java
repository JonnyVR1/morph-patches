package p153l;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class o6r0 {
    /* JADX INFO: renamed from: c */
    public static void m166283c(String str) {
        Iterator<String> it = m166286f(str).iterator();
        while (it.hasNext()) {
            Log.e("IDVLog", it.next());
        }
    }

    /* JADX INFO: renamed from: f */
    private static List<String> m166286f(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = (i + 1000 > length ? length - i : 1000) + i;
            String strSubstring = str.substring(i, i2);
            if (!TextUtils.isEmpty(strSubstring)) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m166281a(String str) {
    }

    /* JADX INFO: renamed from: b */
    public static void m166282b(String str, String str2) {
    }

    /* JADX INFO: renamed from: d */
    public static void m166284d(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public static void m166285e(String str, String str2) {
    }
}
