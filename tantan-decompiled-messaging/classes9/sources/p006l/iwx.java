package p006l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.p000p1.mobile.putong.app.media.MediaFrontService;
import l.nck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iwx {

    /* JADX INFO: renamed from: a */
    public static String f14854a = "live_voice";

    /* JADX INFO: renamed from: b */
    public static String f14855b = "core_voice_call";

    /* JADX INFO: renamed from: a */
    public static void m17139a(Context context, String str) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i <= 27) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) MediaFrontService.class);
            intent.putExtra(MediaFrontService.BUSINESS_TYPE, str);
            if (i >= 26) {
                nck0.a(context, intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17140b(Context context) {
        if (Build.VERSION.SDK_INT <= 27) {
            return;
        }
        context.stopService(new Intent(context, (Class<?>) MediaFrontService.class));
    }
}
