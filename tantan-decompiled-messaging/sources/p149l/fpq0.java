package p149l;

import android.content.Context;
import android.os.Build;
import com.xiaomi.push.EnumC14745gk;
import com.xiaomi.push.service.C14837ah;

/* JADX INFO: loaded from: classes2.dex */
public class fpq0 {
    /* JADX INFO: renamed from: a */
    private static void m122625a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m122626b(Context context, String str, long j) {
        return C14837ah.m86477a(context).m86489a(EnumC14745gk.DCJobMutualSwitch.m85646a(), false) && (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !kjq0.m146276a(context, str, j);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m122627c(String str, byte[] bArr) {
        byte[] bArrM141908b = jkq0.m141908b(str);
        try {
            m122625a(bArrM141908b);
            return auq0.m99035b(bArrM141908b, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m122628d(String str, byte[] bArr) {
        byte[] bArrM141908b = jkq0.m141908b(str);
        try {
            m122625a(bArrM141908b);
            return auq0.m99036c(bArrM141908b, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
