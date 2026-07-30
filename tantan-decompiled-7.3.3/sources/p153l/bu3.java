package p153l;

import android.content.Context;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.EnumC14868d;

/* JADX INFO: loaded from: classes2.dex */
public class bu3 {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f78423a = false;

    /* JADX INFO: renamed from: b */
    private static long f78424b;

    /* JADX INFO: renamed from: a */
    public static void m106422a(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m106423b()) {
            long j = f78424b;
            if (j <= 0 || j + Constants.INBOX_V2_THROTTLE_WINDOW_MS <= jElapsedRealtime) {
                f78424b = jElapsedRealtime;
                m106424c(context);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m106423b() {
        return f78423a;
    }

    /* JADX INFO: renamed from: c */
    public static void m106424c(Context context) {
        InterfaceC19782r7 interfaceC19782r7M113429b = d0r0.m113425c(context).m113429b(EnumC14868d.ASSEMBLE_PUSH_COS);
        if (interfaceC19782r7M113429b != null) {
            ouq0.m169393m("ASSEMBLE_PUSH :  register cos when network change!");
            interfaceC19782r7M113429b.register();
        }
    }
}
