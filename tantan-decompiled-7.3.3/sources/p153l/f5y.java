package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.p051p1.mobile.putong.app.media.MediaFrontService;

/* JADX INFO: loaded from: classes9.dex */
public class f5y {

    /* JADX INFO: renamed from: a */
    public static String f97353a = "live_voice";

    /* JADX INFO: renamed from: b */
    public static String f97354b = "core_voice_call";

    /* JADX INFO: renamed from: a */
    public static void m124260a(Context context, String str) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i <= 27) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) MediaFrontService.class);
            intent.putExtra(MediaFrontService.BUSINESS_TYPE, str);
            if (i >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m124261b(Context context) {
        if (Build.VERSION.SDK_INT <= 27) {
            return;
        }
        context.stopService(new Intent(context, (Class<?>) MediaFrontService.class));
    }
}
