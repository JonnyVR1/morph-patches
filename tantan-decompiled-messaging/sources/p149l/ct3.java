package p149l;

import android.content.Context;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.EnumC14720d;

/* JADX INFO: loaded from: classes2.dex */
public class ct3 {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f82451a = false;

    /* JADX INFO: renamed from: b */
    private static long f82452b;

    /* JADX INFO: renamed from: a */
    public static void m108654a(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m108655b()) {
            long j = f82452b;
            if (j <= 0 || j + Constants.INBOX_V2_THROTTLE_WINDOW_MS <= jElapsedRealtime) {
                f82452b = jElapsedRealtime;
                m108656c(context);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m108655b() {
        return f82451a;
    }

    /* JADX INFO: renamed from: c */
    public static void m108656c(Context context) {
        InterfaceC20816w7 interfaceC20816w7M210597b = xqq0.m210593c(context).m210597b(EnumC14720d.ASSEMBLE_PUSH_COS);
        if (interfaceC20816w7M210597b != null) {
            ilq0.m137040m("ASSEMBLE_PUSH :  register cos when network change!");
            interfaceC20816w7M210597b.register();
        }
    }
}
