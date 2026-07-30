package p153l;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.StringRes;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"InlinedApi"})
@Deprecated
public final class f250 {
    /* JADX INFO: renamed from: a */
    public static void m123601a(Context context, String str, @StringRes int i, @StringRes int i2, int i3) {
        if (bmk0.f77313a >= 26) {
            NotificationManager notificationManager = (NotificationManager) w11.m204369e((NotificationManager) context.getSystemService("notification"));
            hx3.m137557a();
            NotificationChannel notificationChannelM142608a = iy40.m142608a(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannelM142608a.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannelM142608a);
        }
    }
}
