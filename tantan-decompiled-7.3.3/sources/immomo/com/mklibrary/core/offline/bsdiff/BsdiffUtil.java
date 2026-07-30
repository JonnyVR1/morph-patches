package immomo.com.mklibrary.core.offline.bsdiff;

import android.util.Log;
import p153l.lv0;
import p153l.ylc0;

/* JADX INFO: loaded from: classes2.dex */
public class BsdiffUtil {
    static {
        try {
            System.loadLibrary("bsdiff");
        } catch (Throwable th) {
            try {
                ylc0.m216566a(lv0.m155971a(), "bsdiff");
            } catch (Exception unused) {
                Log.e("BsdiffUtil", th.toString());
            }
        }
    }

    public static native int apply_patch(String str, String str2, String str3);
}
