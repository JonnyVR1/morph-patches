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
import com.xiaomi.push.EnumC14893gk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.hx3;
import p153l.iy40;
import p153l.l4r0;
import p153l.ly40;
import p153l.my40;
import p153l.otq0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ad */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
class C14981ad {

    /* JADX INFO: renamed from: a */
    private static C14981ad f63680a = new C14981ad();

    /* JADX INFO: renamed from: a */
    private SpannableString f63681a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ad$a */
    public class a {

        /* JADX INFO: renamed from: a */
        List<b> f63683a;

        /* JADX INFO: renamed from: b */
        List<b> f63684b;

        private a() {
            this.f63683a = new ArrayList();
            this.f63684b = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.ad$b */
    public class b {

        /* JADX INFO: renamed from: a */
        int f63685a;

        /* JADX INFO: renamed from: a */
        Notification f63686a;

        public b(int i, Notification notification) {
            this.f63685a = i;
            this.f63686a = notification;
        }

        public String toString() {
            return "id:" + this.f63685a;
        }
    }

    private C14981ad() {
    }

    /* JADX INFO: renamed from: a */
    private void m87573a(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String strM87647c = C14984ag.m87647c(notification);
        if (TextUtils.isEmpty(strM87647c)) {
            ouq0.m169393m("group auto not extract pkg from notification:" + i);
            return;
        }
        List<StatusBarNotification> listM87572a = m87572a(C14983af.m87599a(context, strM87647c));
        if (listM87572a == null) {
            ouq0.m169393m("group auto not get notifications");
            return;
        }
        String strM87580b = m87580b(notification);
        HashMap map = new HashMap();
        for (StatusBarNotification statusBarNotification : listM87572a) {
            if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                m87576a(map, statusBarNotification);
            }
        }
        for (Map.Entry<String, a> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                a value = entry.getValue();
                if (z && key.equals(strM87580b) && !m87582b(notification)) {
                    b bVar = new b(i, notification);
                    if (m87578a(notification)) {
                        value.f63684b.add(bVar);
                    } else {
                        value.f63683a.add(bVar);
                    }
                }
                int size = value.f63683a.size();
                if (value.f63684b.size() <= 0) {
                    if (z && size >= 2) {
                        m87575a(context, strM87647c, key, value.f63683a.get(0).f63686a);
                    }
                } else if (size <= 0) {
                    m87574a(context, strM87647c, key);
                } else if (C14985ah.m87648a(context).m87660a(EnumC14893gk.NotificationGroupUpdateTimeSwitch.m86817a(), false) && (notification2 = value.f63684b.get(0).f63686a) != null) {
                    notification2.when = System.currentTimeMillis();
                    m87575a(context, strM87647c, key, notification2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m87581b(Context context, int i, Notification notification) {
        String strM87647c = C14984ag.m87647c(notification);
        if (TextUtils.isEmpty(strM87647c)) {
            ouq0.m169393m("group restore not extract pkg from notification:" + i);
            return;
        }
        C14983af c14983afM87599a = C14983af.m87599a(context, strM87647c);
        List<StatusBarNotification> listM87572a = m87572a(c14983afM87599a);
        if (listM87572a == null) {
            ouq0.m169393m("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : listM87572a) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && m87582b(notification2) && statusBarNotification.getId() != i) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                builderRecoverBuilder.setGroup(m87571a(notification2));
                C14984ag.m87640a(builderRecoverBuilder, m87578a(notification2));
                c14983afM87599a.m87617a(statusBarNotification.getId(), builderRecoverBuilder.build());
                ouq0.m169403w("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m87580b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m87582b(notification) ? m87571a(notification) : notification.getGroup();
    }

    /* JADX INFO: renamed from: b */
    private boolean m87582b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), m87571a(notification)));
    }

    /* JADX INFO: renamed from: b */
    private boolean m87583b(Context context) {
        return C14985ah.m87648a(context).m87660a(EnumC14893gk.NotificationAutoGroupSwitch.m86817a(), true);
    }

    /* JADX INFO: renamed from: a */
    public static C14981ad m87570a() {
        return f63680a;
    }

    /* JADX INFO: renamed from: a */
    private boolean m87579a(Context context) {
        if (m87583b(context) && C14983af.m87607a(context)) {
            return C14985ah.m87648a(context).m87660a(EnumC14893gk.LatestNotificationNotIntoGroupSwitch.m86817a(), false);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private String m87571a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* JADX INFO: renamed from: a */
    private boolean m87578a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object objM169167e = otq0.m169167e(notification, "isGroupSummary", null);
        if (objM169167e instanceof Boolean) {
            return ((Boolean) objM169167e).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public String m87584a(Context context, Notification.Builder builder, String str) {
        if (!m87577a() || !m87579a(context)) {
            return str;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", jCurrentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(jCurrentTimeMillis), str);
    }

    /* JADX INFO: renamed from: a */
    public void m87585a(Context context, int i, Notification notification) {
        if (m87577a()) {
            if (m87579a(context)) {
                try {
                    m87581b(context, i, notification);
                } catch (Exception e) {
                    ouq0.m169393m("group notify handle restore error " + e);
                }
            }
            if (m87583b(context)) {
                try {
                    m87573a(context, i, notification, true);
                } catch (Exception e2) {
                    ouq0.m169393m("group notify handle auto error " + e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m87577a() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    private void m87576a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String strM87580b = m87580b(statusBarNotification.getNotification());
        a aVar = map.get(strM87580b);
        if (aVar == null) {
            aVar = new a();
            map.put(strM87580b, aVar);
        }
        b bVar = new b(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (m87578a(statusBarNotification.getNotification())) {
            aVar.f63684b.add(bVar);
        } else {
            aVar.f63683a.add(bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private SpannableString m87569a(Context context, String str) {
        Resources resources;
        DisplayMetrics displayMetrics;
        int iMax;
        if (this.f63681a == null) {
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
            this.f63681a = spannableString;
        }
        return this.f63681a;
    }

    /* JADX INFO: renamed from: a */
    private void m87575a(Context context, String str, String str2, Notification notification) {
        Notification.Builder defaults;
        try {
            if (TextUtils.isEmpty(str2)) {
                ouq0.m169393m("group show summary group is null");
                return;
            }
            int iM87625a = C14984ag.m87625a(context, str);
            if (iM87625a == 0) {
                ouq0.m169393m("group show summary not get icon from " + str);
                return;
            }
            C14983af c14983afM87599a = C14983af.m87599a(context, str);
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                String strM87623c = c14983afM87599a.m87623c(notification.getChannelId(), "groupSummary");
                NotificationChannel notificationChannelM87611a = c14983afM87599a.m87611a(strM87623c);
                if ("groupSummary".equals(strM87623c) && notificationChannelM87611a == null) {
                    hx3.m137557a();
                    c14983afM87599a.m87618a(iy40.m142608a(strM87623c, "group_summary", 3));
                }
                my40.m160713a();
                defaults = ly40.m156255a(context, strM87623c);
            } else {
                defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            C14984ag.m87640a(defaults, true);
            Notification notificationBuild = defaults.setContentTitle(m87569a(context, "新消息")).setContentText("你有一条新消息").setSmallIcon(Icon.createWithResource(str, iM87625a)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (i >= 31) {
                notificationBuild.contentIntent = m87568a(context, str);
            }
            if (!l4r0.m152833r() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                C14984ag.m87635a(notificationBuild, str);
            }
            int iM87567a = m87567a(str, str2);
            c14983afM87599a.m87617a(iM87567a, notificationBuild);
            ouq0.m169403w("group show summary notify:" + iM87567a);
        } catch (Exception e) {
            ouq0.m169393m("group show summary error " + e);
        }
    }

    /* JADX INFO: renamed from: a */
    private PendingIntent m87568a(Context context, String str) {
        if (context == null && TextUtils.isEmpty(str)) {
            ouq0.m169393m("ctx or pkg must not be null in getting launch intent");
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                ouq0.m169393m("pm must not be null in getting launch intent");
                return null;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                ouq0.m169393m("targetIntent must not be null in getting launch intent");
                return null;
            }
            launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, launchIntentForPackage, 33554432);
            }
            return PendingIntent.getActivity(context, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            ouq0.m169378B("error occurred during getting launch pendingIntent. exception:" + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m87574a(Context context, String str, String str2) {
        ouq0.m169403w("group cancel summary:" + str2);
        C14983af.m87599a(context, str).m87616a(m87567a(str, str2));
    }

    /* JADX INFO: renamed from: a */
    private int m87567a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    /* JADX INFO: renamed from: a */
    private List<StatusBarNotification> m87572a(C14983af c14983af) {
        List<StatusBarNotification> listM87622b = c14983af != null ? c14983af.m87622b() : null;
        if (listM87622b == null || listM87622b.size() == 0) {
            return null;
        }
        return listM87622b;
    }
}
