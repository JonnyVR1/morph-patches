package p153l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(26)
public class o1z0 extends c0z0 {
    @Override // p153l.ccr0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Intent mo109053e(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: f */
    public final void mo109054f(Context context, String str, String str2) {
        hx3.m137557a();
        NotificationChannel notificationChannelM142608a = iy40.m142608a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) jas0.m144075c().m176505a(sgs0.f168457r8)).intValue());
        notificationChannelM142608a.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelM142608a);
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: g */
    public final boolean mo109055g(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // p153l.ccr0
    /* JADX INFO: renamed from: h */
    public final int mo109056h(Context context, TelephonyManager telephonyManager) {
        bxy0.m106934r();
        return (C2098b.m12363b0(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
