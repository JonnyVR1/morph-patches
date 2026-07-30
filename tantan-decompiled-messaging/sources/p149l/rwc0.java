package p149l;

import android.text.TextUtils;
import com.immomo.resdownloader.log.MLog;

/* JADX INFO: loaded from: classes7.dex */
public class rwc0 {
    /* JADX INFO: renamed from: a */
    public static void m181387a(String str, int i, String str2) {
        try {
            TextUtils.isEmpty(str);
        } catch (Exception e) {
            MLog.printErrStackTrace("SDKResource", e);
        }
    }
}
