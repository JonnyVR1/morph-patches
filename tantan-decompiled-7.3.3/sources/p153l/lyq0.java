package p153l;

import android.content.Context;
import android.os.Build;
import com.xiaomi.push.EnumC14893gk;
import com.xiaomi.push.service.C14985ah;

/* JADX INFO: loaded from: classes2.dex */
public class lyq0 {
    /* JADX INFO: renamed from: a */
    private static void m156375a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m156376b(Context context, String str, long j) {
        return C14985ah.m87648a(context).m87660a(EnumC14893gk.DCJobMutualSwitch.m86817a(), false) && (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !qsq0.m177814a(context, str, j);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m156377c(String str, byte[] bArr) {
        byte[] bArrM173774b = ptq0.m173774b(str);
        try {
            m156375a(bArrM173774b);
            return g3r0.m128757b(bArrM173774b, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m156378d(String str, byte[] bArr) {
        byte[] bArrM173774b = ptq0.m173774b(str);
        try {
            m156375a(bArrM173774b);
            return g3r0.m128758c(bArrM173774b, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
