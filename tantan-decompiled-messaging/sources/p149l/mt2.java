package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes13.dex */
public class mt2 {

    /* JADX INFO: renamed from: a */
    public static final IntentFilter f135549a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* JADX INFO: renamed from: a */
    public static float m156175a(Context context) {
        Intent intentM136342l = ii5.m136342l(context, null, f135549a);
        if (intentM136342l == null) {
            return -1.0f;
        }
        return (intentM136342l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentM136342l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1)) * 100.0f;
    }

    /* JADX INFO: renamed from: b */
    public static String m156176b(Context context) {
        Intent intentM136342l = ii5.m136342l(context, null, f135549a);
        if (intentM136342l == null) {
            return "unknown";
        }
        int intExtra = intentM136342l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra != 2) {
            return intExtra != 5 ? "unplugged" : "full";
        }
        return "charging";
    }
}
