package p153l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;

/* JADX INFO: loaded from: classes7.dex */
public class u4d0 {
    /* JADX INFO: renamed from: a */
    public static void m194475a(String str, int i, String str2) {
        try {
            TextUtils.isEmpty(str);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
        }
    }
}
