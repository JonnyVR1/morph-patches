package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.Map;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;
import p153l.tsq0;
import p153l.vzq0;
import p153l.w5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.bb */
/* JADX INFO: loaded from: classes2.dex */
public class C15006bb {
    /* JADX INFO: renamed from: a */
    public static void m87792a(Context context, Map<String, String> map, vzq0 vzq0Var, long j) {
        if (map == null || vzq0Var == null || !l4r0.m152825j(context) || !m87793a(map)) {
            return;
        }
        int iM87787a = m87787a(map);
        int iM87794b = m87794b(map);
        if (iM87787a <= 0 || iM87794b > iM87787a) {
            ouq0.m169378B("set top notification failed - period:" + iM87787a + " frequency:" + iM87794b);
            return;
        }
        vzq0Var.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (iM87794b > 0) {
            bundle.putInt("mipush_n_top_fre", iM87794b);
        }
        bundle.putInt("mipush_n_top_prd", iM87787a);
        vzq0Var.addExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m87795b(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public static void m87797c(Context context, String str, int i, String str2, Notification notification) {
        C14983af c14983afM87599a;
        Notification notificationM87788a;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (notificationM87788a = m87788a(notification, i, str2, (c14983afM87599a = C14983af.m87599a(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (notificationM87788a.getGroupAlertBehavior() != 1) {
            otq0.m169172j(notificationM87788a, "mGroupAlertBehavior", 1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = notificationM87788a.extras.getLong("mipush_org_when", 0L);
        int i2 = notificationM87788a.extras.getInt("mipush_n_top_fre", 0);
        int iMin = notificationM87788a.extras.getInt("mipush_n_top_prd", 0);
        if (iMin <= 0 || iMin < i2) {
            return;
        }
        long j2 = j + ((long) (iMin * 1000));
        if (j >= jCurrentTimeMillis || jCurrentTimeMillis >= j2) {
            iMin = 0;
        } else if (i2 > 0) {
            iMin = (int) Math.min((j2 - jCurrentTimeMillis) / 1000, i2);
        }
        if (!z) {
            if (iMin > 0) {
                notificationM87788a.when = jCurrentTimeMillis;
                ouq0.m169393m("update top notification: " + str2);
                c14983afM87599a.m87617a(i, notificationM87788a);
            } else {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notificationM87788a);
                builderRecoverBuilder.setPriority(0);
                builderRecoverBuilder.setWhen(jCurrentTimeMillis);
                Bundle extras = builderRecoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    builderRecoverBuilder.setExtras(extras);
                }
                ouq0.m169393m("update top notification to common: " + str2);
                c14983afM87599a.m87617a(i, builderRecoverBuilder.build());
            }
        }
        if (iMin > 0) {
            ouq0.m169393m("schedule top notification next update delay: " + iMin);
            tsq0.m192627f(context).m192630i(m87795b(i, str2));
            tsq0.m192627f(context).m192635n(m87790a(context, str, i, str2, (Notification) null), iMin);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m87794b(Map<String, String> map) {
        return Math.max(0, w5r0.m204982a(map.get("notification_top_frequency"), 0));
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public static void m87791a(Context context, String str, int i, String str2, Notification notification) {
        if (l4r0.m152825j(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            m87797c(context, str, i, str2, notification);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87793a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = Boolean.parseBoolean(str);
        ouq0.m169406z("top notification' repeat is " + z);
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static int m87787a(Map<String, String> map) {
        return Math.max(0, w5r0.m204982a(map.get("notification_top_period"), 0));
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    private static Notification m87788a(Notification notification, int i, String str, C14983af c14983af) {
        if (notification != null) {
            if (str.equals(notification.extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER))) {
                return notification;
            }
            return null;
        }
        List<StatusBarNotification> listM87622b = c14983af.m87622b();
        if (listM87622b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : listM87622b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static tsq0.AbstractRunnableC20394c m87790a(final Context context, final String str, final int i, final String str2, final Notification notification) {
        return new tsq0.AbstractRunnableC20394c() { // from class: com.xiaomi.push.service.bb.1
            @Override // p153l.tsq0.AbstractRunnableC20394c
            /* JADX INFO: renamed from: a */
            public String mo87798a() {
                return C15006bb.m87795b(i, str2);
            }

            @Override // java.lang.Runnable
            @TargetApi(19)
            public void run() {
                C15006bb.m87797c(context, str, i, str2, notification);
            }
        };
    }
}
