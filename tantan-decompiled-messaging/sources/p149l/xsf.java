package p149l;

import android.content.Context;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.EnumC14720d;

/* JADX INFO: loaded from: classes2.dex */
public class xsf {

    /* JADX INFO: renamed from: a */
    private static long f194235a = 0;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f194236b = false;

    /* JADX INFO: renamed from: a */
    private static void m210739a(Context context) {
        InterfaceC20816w7 interfaceC20816w7M210597b = xqq0.m210593c(context).m210597b(EnumC14720d.ASSEMBLE_PUSH_FTOS);
        if (interfaceC20816w7M210597b != null) {
            ilq0.m137040m("ASSEMBLE_PUSH :  register fun touch os when network change!");
            interfaceC20816w7M210597b.register();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m210740b(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m210741c()) {
            long j = f194235a;
            if (j <= 0 || j + Constants.INBOX_V2_THROTTLE_WINDOW_MS <= jElapsedRealtime) {
                f194235a = jElapsedRealtime;
                m210739a(context);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m210741c() {
        return f194236b;
    }
}
