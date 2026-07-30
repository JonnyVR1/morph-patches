package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes11.dex */
public class cu2 {

    /* JADX INFO: renamed from: a */
    public static final IntentFilter f83814a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* JADX INFO: renamed from: a */
    public static float m112647a(Context context) {
        Intent intentM145018l = jj5.m145018l(context, null, f83814a);
        if (intentM145018l == null) {
            return -1.0f;
        }
        return (intentM145018l.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / intentM145018l.getIntExtra(BigEyeFilter.UNIFORM_SCALE, -1)) * 100.0f;
    }

    /* JADX INFO: renamed from: b */
    public static String m112648b(Context context) {
        Intent intentM145018l = jj5.m145018l(context, null, f83814a);
        if (intentM145018l == null) {
            return "unknown";
        }
        int intExtra = intentM145018l.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra != 2) {
            return intExtra != 5 ? "unplugged" : "full";
        }
        return "charging";
    }
}
