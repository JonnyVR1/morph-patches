package p149l;

import android.text.TextUtils;
import com.immomo.momosec.Coded;

/* JADX INFO: loaded from: classes7.dex */
public class low {

    /* JADX INFO: renamed from: a */
    private static String f129147a;

    /* JADX INFO: renamed from: a */
    public static String m150814a() {
        String str;
        String str2 = f129147a;
        if (str2 != null) {
            return str2;
        }
        try {
            str = new String(Coded.doCommand("".getBytes(), 100));
        } catch (Throwable unused) {
            str = new String(Coded.doCommand("".getBytes(), 100));
        }
        String str3 = TextUtils.isEmpty(str) ? "" : str;
        f129147a = str3;
        return str3;
    }
}
