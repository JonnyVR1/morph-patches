package p149l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class vp40 {
    @Nullable
    @RequiresApi(26)
    /* JADX INFO: renamed from: a */
    public static Notification m199221a(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(up40.m194605a(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        builderRecoverBuilder.setChannelId(str);
        return builderRecoverBuilder.build();
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: b */
    public static boolean m199222b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }
}
