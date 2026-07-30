package p153l;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes2.dex */
public class ssq0 {
    /* JADX INFO: renamed from: a */
    public static boolean m187794a(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e) {
            ouq0.m169397q(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m187795b(Context context) {
        Intent intentM102623c = null;
        try {
            intentM102623c = b5r0.m102623c(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        } catch (Exception unused) {
        }
        if (intentM102623c == null) {
            return false;
        }
        int intExtra = intentM102623c.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }
}
