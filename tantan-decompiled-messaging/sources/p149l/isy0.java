package p149l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(26)
public class isy0 extends wqy0 {
    @Override // p149l.w2r0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Intent mo138092e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: f */
    public final void mo138093f(Context context, String str, String str2) {
        iw3.m138716a();
        NotificationChannel notificationChannelM194605a = up40.m194605a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) d1s0.m109677c().m144697a(m7s0.f132386r8)).intValue());
        notificationChannelM194605a.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelM194605a);
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: g */
    public final boolean mo138094g(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // p149l.w2r0
    /* JADX INFO: renamed from: h */
    public final int mo138095h(Context context, TelephonyManager telephonyManager) {
        vny0.m199080r();
        return (C2075b.m12309b0(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
