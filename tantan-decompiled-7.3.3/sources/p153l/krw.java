package p153l;

import android.text.TextUtils;
import com.immomo.momosec.Coded;

/* JADX INFO: loaded from: classes7.dex */
public class krw {

    /* JADX INFO: renamed from: a */
    private static String f128507a;

    /* JADX INFO: renamed from: a */
    public static String m151126a() {
        String str;
        String str2 = f128507a;
        if (str2 != null) {
            return str2;
        }
        try {
            str = new String(Coded.doCommand("".getBytes(), 100));
        } catch (Throwable unused) {
            str = new String(Coded.doCommand("".getBytes(), 100));
        }
        String str3 = TextUtils.isEmpty(str) ? "" : str;
        f128507a = str3;
        return str3;
    }
}
