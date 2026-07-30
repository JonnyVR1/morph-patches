package p149l;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.StringRes;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"InlinedApi"})
@Deprecated
public final class qt40 {
    /* JADX INFO: renamed from: a */
    public static void m176389a(Context context, String str, @StringRes int i, @StringRes int i2, int i3) {
        if (vck0.f180948a >= 26) {
            NotificationManager notificationManager = (NotificationManager) p11.m167011e((NotificationManager) context.getSystemService("notification"));
            iw3.m138716a();
            NotificationChannel notificationChannelM194605a = up40.m194605a(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannelM194605a.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannelM194605a);
        }
    }
}
