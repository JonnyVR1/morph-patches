package p153l;

import android.content.Context;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.xiaomi.mipush.sdk.EnumC14868d;

/* JADX INFO: loaded from: classes2.dex */
public class luf {

    /* JADX INFO: renamed from: a */
    private static long f133628a = 0;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f133629b = false;

    /* JADX INFO: renamed from: a */
    private static void m155923a(Context context) {
        InterfaceC19782r7 interfaceC19782r7M113429b = d0r0.m113425c(context).m113429b(EnumC14868d.ASSEMBLE_PUSH_FTOS);
        if (interfaceC19782r7M113429b != null) {
            ouq0.m169393m("ASSEMBLE_PUSH :  register fun touch os when network change!");
            interfaceC19782r7M113429b.register();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m155924b(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m155925c()) {
            long j = f133628a;
            if (j <= 0 || j + Constants.INBOX_V2_THROTTLE_WINDOW_MS <= jElapsedRealtime) {
                f133628a = jElapsedRealtime;
                m155923a(context);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m155925c() {
        return f133629b;
    }
}
