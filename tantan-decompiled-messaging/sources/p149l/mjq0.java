package p149l;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes2.dex */
public class mjq0 {
    /* JADX INFO: renamed from: a */
    public static boolean m154899a(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m154900b(Context context) {
        Intent intentM200201c = null;
        try {
            intentM200201c = vvq0.m200201c(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        } catch (Exception unused) {
        }
        if (intentM200201c == null) {
            return false;
        }
        int intExtra = intentM200201c.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }
}
