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
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.njq0;
import p149l.pqq0;
import p149l.qwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.bb */
/* JADX INFO: loaded from: classes2.dex */
public class C14858bb {
    /* JADX INFO: renamed from: a */
    public static void m86621a(Context context, Map<String, String> map, pqq0 pqq0Var, long j) {
        if (map == null || pqq0Var == null || !fvq0.m123356j(context) || !m86622a(map)) {
            return;
        }
        int iM86616a = m86616a(map);
        int iM86623b = m86623b(map);
        if (iM86616a <= 0 || iM86623b > iM86616a) {
            ilq0.m137025B("set top notification failed - period:" + iM86616a + " frequency:" + iM86623b);
            return;
        }
        pqq0Var.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (iM86623b > 0) {
            bundle.putInt("mipush_n_top_fre", iM86623b);
        }
        bundle.putInt("mipush_n_top_prd", iM86616a);
        pqq0Var.addExtras(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m86624b(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    /* JADX INFO: renamed from: c */
    public static void m86626c(Context context, String str, int i, String str2, Notification notification) {
        C14835af c14835afM86428a;
        Notification notificationM86617a;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (notificationM86617a = m86617a(notification, i, str2, (c14835afM86428a = C14835af.m86428a(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (notificationM86617a.getGroupAlertBehavior() != 1) {
            ikq0.m136887j(notificationM86617a, "mGroupAlertBehavior", 1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = notificationM86617a.extras.getLong("mipush_org_when", 0L);
        int i2 = notificationM86617a.extras.getInt("mipush_n_top_fre", 0);
        int iMin = notificationM86617a.extras.getInt("mipush_n_top_prd", 0);
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
                notificationM86617a.when = jCurrentTimeMillis;
                ilq0.m137040m("update top notification: " + str2);
                c14835afM86428a.m86446a(i, notificationM86617a);
            } else {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notificationM86617a);
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
                ilq0.m137040m("update top notification to common: " + str2);
                c14835afM86428a.m86446a(i, builderRecoverBuilder.build());
            }
        }
        if (iMin > 0) {
            ilq0.m137040m("schedule top notification next update delay: " + iMin);
            njq0.m159772f(context).m159775i(m86624b(i, str2));
            njq0.m159772f(context).m159780n(m86619a(context, str, i, str2, (Notification) null), iMin);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m86623b(Map<String, String> map) {
        return Math.max(0, qwq0.m176890a(map.get("notification_top_frequency"), 0));
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public static void m86620a(Context context, String str, int i, String str2, Notification notification) {
        if (fvq0.m123356j(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            m86626c(context, str, i, str2, notification);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86622a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = Boolean.parseBoolean(str);
        ilq0.m137053z("top notification' repeat is " + z);
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static int m86616a(Map<String, String> map) {
        return Math.max(0, qwq0.m176890a(map.get("notification_top_period"), 0));
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    private static Notification m86617a(Notification notification, int i, String str, C14835af c14835af) {
        if (notification != null) {
            if (str.equals(notification.extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER))) {
                return notification;
            }
            return null;
        }
        List<StatusBarNotification> listM86451b = c14835af.m86451b();
        if (listM86451b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : listM86451b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static njq0.AbstractRunnableC18717c m86619a(final Context context, final String str, final int i, final String str2, final Notification notification) {
        return new njq0.AbstractRunnableC18717c() { // from class: com.xiaomi.push.service.bb.1
            @Override // p149l.njq0.AbstractRunnableC18717c
            /* JADX INFO: renamed from: a */
            public String mo86627a() {
                return C14858bb.m86624b(i, str2);
            }

            @Override // java.lang.Runnable
            @TargetApi(19)
            public void run() {
                C14858bb.m86626c(context, str, i, str2, notification);
            }
        };
    }
}
