package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import com.xiaomi.push.EnumC14745gk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.iw3;
import p149l.up40;
import p149l.xp40;
import p149l.yp40;

/* JADX INFO: renamed from: com.xiaomi.push.service.ad */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
class C14833ad {

    /* JADX INFO: renamed from: a */
    private static C14833ad f62833a = new C14833ad();

    /* JADX INFO: renamed from: a */
    private SpannableString f62834a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ad$a */
    public class a {

        /* JADX INFO: renamed from: a */
        List<b> f62836a;

        /* JADX INFO: renamed from: b */
        List<b> f62837b;

        private a() {
            this.f62836a = new ArrayList();
            this.f62837b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.ad$b */
    public class b {

        /* JADX INFO: renamed from: a */
        int f62838a;

        /* JADX INFO: renamed from: a */
        Notification f62839a;

        public b(int i, Notification notification) {
            this.f62838a = i;
            this.f62839a = notification;
        }

        public String toString() {
            return "id:" + this.f62838a;
        }
    }

    private C14833ad() {
    }

    /* JADX INFO: renamed from: a */
    private void m86402a(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String strM86476c = C14836ag.m86476c(notification);
        if (TextUtils.isEmpty(strM86476c)) {
            ilq0.m137040m("group auto not extract pkg from notification:" + i);
            return;
        }
        List<StatusBarNotification> listM86401a = m86401a(C14835af.m86428a(context, strM86476c));
        if (listM86401a == null) {
            ilq0.m137040m("group auto not get notifications");
            return;
        }
        String strM86409b = m86409b(notification);
        HashMap map = new HashMap();
        for (StatusBarNotification statusBarNotification : listM86401a) {
            if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                m86405a(map, statusBarNotification);
            }
        }
        for (Map.Entry<String, a> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                a value = entry.getValue();
                if (z && key.equals(strM86409b) && !m86411b(notification)) {
                    b bVar = new b(i, notification);
                    if (m86407a(notification)) {
                        value.f62837b.add(bVar);
                    } else {
                        value.f62836a.add(bVar);
                    }
                }
                int size = value.f62836a.size();
                if (value.f62837b.size() <= 0) {
                    if (z && size >= 2) {
                        m86404a(context, strM86476c, key, value.f62836a.get(0).f62839a);
                    }
                } else if (size <= 0) {
                    m86403a(context, strM86476c, key);
                } else if (C14837ah.m86477a(context).m86489a(EnumC14745gk.NotificationGroupUpdateTimeSwitch.m85646a(), false) && (notification2 = value.f62837b.get(0).f62839a) != null) {
                    notification2.when = System.currentTimeMillis();
                    m86404a(context, strM86476c, key, notification2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m86410b(Context context, int i, Notification notification) {
        String strM86476c = C14836ag.m86476c(notification);
        if (TextUtils.isEmpty(strM86476c)) {
            ilq0.m137040m("group restore not extract pkg from notification:" + i);
            return;
        }
        C14835af c14835afM86428a = C14835af.m86428a(context, strM86476c);
        List<StatusBarNotification> listM86401a = m86401a(c14835afM86428a);
        if (listM86401a == null) {
            ilq0.m137040m("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : listM86401a) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && m86411b(notification2) && statusBarNotification.getId() != i) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                builderRecoverBuilder.setGroup(m86400a(notification2));
                C14836ag.m86469a(builderRecoverBuilder, m86407a(notification2));
                c14835afM86428a.m86446a(statusBarNotification.getId(), builderRecoverBuilder.build());
                ilq0.m137050w("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m86409b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m86411b(notification) ? m86400a(notification) : notification.getGroup();
    }

    /* JADX INFO: renamed from: b */
    private boolean m86411b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), m86400a(notification)));
    }

    /* JADX INFO: renamed from: b */
    private boolean m86412b(Context context) {
        return C14837ah.m86477a(context).m86489a(EnumC14745gk.NotificationAutoGroupSwitch.m85646a(), true);
    }

    /* JADX INFO: renamed from: a */
    public static C14833ad m86399a() {
        return f62833a;
    }

    /* JADX INFO: renamed from: a */
    private boolean m86408a(Context context) {
        if (m86412b(context) && C14835af.m86436a(context)) {
            return C14837ah.m86477a(context).m86489a(EnumC14745gk.LatestNotificationNotIntoGroupSwitch.m85646a(), false);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private String m86400a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* JADX INFO: renamed from: a */
    private boolean m86407a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object objM136882e = ikq0.m136882e(notification, "isGroupSummary", null);
        if (objM136882e instanceof Boolean) {
            return ((Boolean) objM136882e).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public String m86413a(Context context, Notification.Builder builder, String str) {
        if (!m86406a() || !m86408a(context)) {
            return str;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", jCurrentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(jCurrentTimeMillis), str);
    }

    /* JADX INFO: renamed from: a */
    public void m86414a(Context context, int i, Notification notification) {
        if (m86406a()) {
            if (m86408a(context)) {
                try {
                    m86410b(context, i, notification);
                } catch (Exception e) {
                    ilq0.m137040m("group notify handle restore error " + e);
                }
            }
            if (m86412b(context)) {
                try {
                    m86402a(context, i, notification, true);
                } catch (Exception e2) {
                    ilq0.m137040m("group notify handle auto error " + e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m86406a() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m86405a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String strM86409b = m86409b(statusBarNotification.getNotification());
        a aVar = map.get(strM86409b);
        if (aVar == null) {
            aVar = new a();
            map.put(strM86409b, aVar);
        }
        b bVar = new b(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (m86407a(statusBarNotification.getNotification())) {
            aVar.f62837b.add(bVar);
        } else {
            aVar.f62836a.add(bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private SpannableString m86398a(Context context, String str) {
        Resources resources;
        DisplayMetrics displayMetrics;
        int iMax;
        if (this.f62834a == null) {
            int i = (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || (iMax = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels)) <= 0) ? 200 : iMax / 16;
            if (TextUtils.isEmpty(str)) {
                str = "新消息";
            }
            StringBuilder sb = new StringBuilder(str.length() + i + 12);
            sb.append(str);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append("GroupSummary");
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new ForegroundColorSpan(0), str.length(), sb.length(), 33);
            this.f62834a = spannableString;
        }
        return this.f62834a;
    }

    /* JADX INFO: renamed from: a */
    private void m86404a(Context context, String str, String str2, Notification notification) {
        Notification.Builder defaults;
        try {
            if (TextUtils.isEmpty(str2)) {
                ilq0.m137040m("group show summary group is null");
                return;
            }
            int iM86454a = C14836ag.m86454a(context, str);
            if (iM86454a == 0) {
                ilq0.m137040m("group show summary not get icon from " + str);
                return;
            }
            C14835af c14835afM86428a = C14835af.m86428a(context, str);
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                String strM86452c = c14835afM86428a.m86452c(notification.getChannelId(), "groupSummary");
                NotificationChannel notificationChannelM86440a = c14835afM86428a.m86440a(strM86452c);
                if ("groupSummary".equals(strM86452c) && notificationChannelM86440a == null) {
                    iw3.m138716a();
                    c14835afM86428a.m86447a(up40.m194605a(strM86452c, "group_summary", 3));
                }
                yp40.m215577a();
                defaults = xp40.m210460a(context, strM86452c);
            } else {
                defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            C14836ag.m86469a(defaults, true);
            Notification notificationBuild = defaults.setContentTitle(m86398a(context, "新消息")).setContentText("你有一条新消息").setSmallIcon(Icon.createWithResource(str, iM86454a)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (i >= 31) {
                notificationBuild.contentIntent = m86397a(context, str);
            }
            if (!fvq0.m123364r() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                C14836ag.m86464a(notificationBuild, str);
            }
            int iM86396a = m86396a(str, str2);
            c14835afM86428a.m86446a(iM86396a, notificationBuild);
            ilq0.m137050w("group show summary notify:" + iM86396a);
        } catch (Exception e) {
            ilq0.m137040m("group show summary error " + e);
        }
    }

    /* JADX INFO: renamed from: a */
    private PendingIntent m86397a(Context context, String str) {
        if (context == null && TextUtils.isEmpty(str)) {
            ilq0.m137040m("ctx or pkg must not be null in getting launch intent");
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                ilq0.m137040m("pm must not be null in getting launch intent");
                return null;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                ilq0.m137040m("targetIntent must not be null in getting launch intent");
                return null;
            }
            launchIntentForPackage.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, launchIntentForPackage, 33554432);
            }
            return PendingIntent.getActivity(context, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            ilq0.m137025B("error occurred during getting launch pendingIntent. exception:" + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86403a(Context context, String str, String str2) {
        ilq0.m137050w("group cancel summary:" + str2);
        C14835af.m86428a(context, str).m86445a(m86396a(str, str2));
    }

    /* JADX INFO: renamed from: a */
    private int m86396a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    /* JADX INFO: renamed from: a */
    private List<StatusBarNotification> m86401a(C14835af c14835af) {
        List<StatusBarNotification> listM86451b = c14835af != null ? c14835af.m86451b() : null;
        if (listM86451b == null || listM86451b.size() == 0) {
            return null;
        }
        return listM86451b;
    }
}
