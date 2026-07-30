package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.EnumC14745gk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p149l.cdb0;
import p149l.fvq0;
import p149l.ii5;
import p149l.ikq0;
import p149l.ilq0;
import p149l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.af */
/* JADX INFO: loaded from: classes2.dex */
public class C14835af {

    /* JADX INFO: renamed from: a */
    private static Context f62848a;

    /* JADX INFO: renamed from: a */
    private static Object f62849a;

    /* JADX INFO: renamed from: a */
    private static WeakHashMap<Integer, C14835af> f62850a = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    private static boolean f62851a;

    /* JADX INFO: renamed from: a */
    private String f62852a;

    /* JADX INFO: renamed from: b */
    private String f62853b;

    private C14835af(String str) {
        this.f62852a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public List<NotificationChannel> m86444a() {
        String str;
        String str2 = this.f62852a;
        List<NotificationChannel> notificationChannels = null;
        try {
            if (m86435a()) {
                int iM86426a = m86426a(str2);
                if (iM86426a != -1) {
                    List<NotificationChannel> list = (List) m86429a(ikq0.m136882e(f62849a, "getNotificationChannelsForPackage", str2, Integer.valueOf(iM86426a), Boolean.FALSE));
                    str = "mipush|%s|%s";
                    notificationChannels = list;
                } else {
                    str = null;
                }
            } else {
                notificationChannels = m86427a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!fvq0.m123355i() || notificationChannels == null) {
                return notificationChannels;
            }
            ArrayList arrayList = new ArrayList();
            String strM86432a = m86432a(str, str2, "");
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM106215a = cdb0.m106215a(it.next());
                if (notificationChannelM106215a.getId().startsWith(strM86432a)) {
                    arrayList.add(notificationChannelM106215a);
                }
            }
            return arrayList;
        } catch (Exception e) {
            m86434a("getNotificationChannels error " + e);
            return notificationChannels;
        }
    }

    /* JADX INFO: renamed from: b */
    public List<StatusBarNotification> m86451b() {
        String str = this.f62852a;
        NotificationManager notificationManagerM86427a = m86427a();
        ArrayList arrayList = null;
        try {
            if (m86435a()) {
                int iM166094c = ouq0.m166094c();
                if (iM166094c != -1) {
                    return (List) m86429a(ikq0.m136882e(f62849a, "getAppActiveNotifications", str, Integer.valueOf(iM166094c)));
                }
            } else {
                StatusBarNotification[] activeNotifications = notificationManagerM86427a.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(C14836ag.m86476c(statusBarNotification.getNotification()))) {
                                arrayList2.add(statusBarNotification);
                            }
                        }
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList2;
                        m86434a("getActiveNotifications error " + th);
                        return arrayList;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m86452c(String str, String str2) {
        return m86435a() ? str : str2;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f62852a + "}";
    }

    /* JADX INFO: renamed from: b */
    private String m86438b(String str) {
        return m86439b(this.f62852a, str);
    }

    /* JADX INFO: renamed from: b */
    public String m86450b() {
        if (TextUtils.isEmpty(this.f62853b)) {
            this.f62853b = m86438b("default");
        }
        return this.f62853b;
    }

    /* JADX INFO: renamed from: b */
    public static String m86439b(String str, String str2) {
        String str3;
        if (m86435a()) {
            str3 = "mipush|%s|%s";
        } else {
            str3 = "mipush_%s_%s";
        }
        return m86432a(str3, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public String m86442a() {
        return this.f62852a;
    }

    /* JADX INFO: renamed from: a */
    public static C14835af m86428a(Context context, String str) {
        m86433a(context);
        int iHashCode = str.hashCode();
        C14835af c14835af = f62850a.get(Integer.valueOf(iHashCode));
        if (c14835af != null) {
            return c14835af;
        }
        C14835af c14835af2 = new C14835af(str);
        f62850a.put(Integer.valueOf(iHashCode), c14835af2);
        return c14835af2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86436a(Context context) {
        m86433a(context);
        return m86435a();
    }

    /* JADX INFO: renamed from: a */
    public static String m86431a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strM86432a = m86432a("mipush|%s|%s", str2, "");
        return str.startsWith(strM86432a) ? m86432a("mipush_%s_%s", str2, str.replace(strM86432a, "")) : str;
    }

    /* JADX INFO: renamed from: a */
    private static void m86433a(Context context) {
        if (f62848a == null) {
            f62848a = context.getApplicationContext();
            NotificationManager notificationManagerM86427a = m86427a();
            Boolean bool = (Boolean) ikq0.m136882e(notificationManagerM86427a, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m86434a("fwk is support.init:" + bool);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            f62851a = zBooleanValue;
            if (zBooleanValue) {
                f62849a = ikq0.m136882e(notificationManagerM86427a, "getService", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static NotificationManager m86427a() {
        return (NotificationManager) f62848a.getSystemService("notification");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86435a() {
        if (fvq0.m123355i() && C14837ah.m86477a(f62848a).m86489a(EnumC14745gk.NotificationBelongToAppSwitch.m85646a(), true)) {
            return f62851a;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static int m86426a(String str) {
        try {
            return f62848a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m86430a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m86429a(Object obj) {
        if (obj != null) {
            try {
                return (T) obj.getClass().getMethod("getList", null).invoke(obj, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m86432a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86449a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(m86438b(""));
    }

    /* JADX INFO: renamed from: a */
    public String m86443a(String str) {
        if (TextUtils.isEmpty(str)) {
            return m86450b();
        }
        return fvq0.m123356j(m86441a()) ? m86438b(str) : str;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public void m86447a(NotificationChannel notificationChannel) {
        String str = this.f62852a;
        try {
            if (!m86435a()) {
                m86427a().createNotificationChannel(notificationChannel);
                return;
            }
            int iM86426a = m86426a(str);
            if (iM86426a != -1) {
                ikq0.m136891n(f62849a, "createNotificationChannelsForPackage", str, Integer.valueOf(iM86426a), m86430a(Arrays.asList(notificationChannel)));
            }
        } catch (Exception e) {
            m86434a("createNotificationChannel error" + e);
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public NotificationChannel m86440a(String str) {
        try {
            if (!m86435a()) {
                return m86427a().getNotificationChannel(str);
            }
            List<NotificationChannel> listM86444a = m86444a();
            if (listM86444a != null) {
                Iterator<NotificationChannel> it = listM86444a.iterator();
                while (it.hasNext()) {
                    NotificationChannel notificationChannelM106215a = cdb0.m106215a(it.next());
                    if (str.equals(notificationChannelM106215a.getId())) {
                        return notificationChannelM106215a;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            m86434a("getNotificationChannel error" + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m86441a() {
        return f62848a;
    }

    /* JADX INFO: renamed from: a */
    public void m86448a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f62852a;
        try {
            if (z) {
                int iM86426a = m86426a(str);
                if (iM86426a != -1) {
                    ikq0.m136891n(f62849a, "updateNotificationChannelForPackage", str, Integer.valueOf(iM86426a), notificationChannel);
                    return;
                }
                return;
            }
            m86447a(notificationChannel);
        } catch (Exception e) {
            m86434a("updateNotificationChannel error " + e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86446a(int i, Notification notification) {
        String str = this.f62852a;
        NotificationManager notificationManagerM86427a = m86427a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (m86435a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i2 >= 29) {
                    notificationManagerM86427a.notifyAsPackage(str, null, i, notification);
                    return;
                } else {
                    ii5.m136337g(notificationManagerM86427a, i, notification);
                    return;
                }
            }
            ii5.m136337g(notificationManagerM86427a, i, notification);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86445a(int i) {
        String str = this.f62852a;
        try {
            if (m86435a()) {
                int iM166094c = ouq0.m166094c();
                String packageName = m86441a().getPackageName();
                if (Build.VERSION.SDK_INT >= 30) {
                    ikq0.m136891n(f62849a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(iM166094c));
                } else {
                    ikq0.m136891n(f62849a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(iM166094c));
                }
                m86434a("cancel succ:" + i);
                return;
            }
            m86427a().cancel(i);
        } catch (Exception e) {
            m86434a("cancel error" + e);
        }
    }

    /* JADX INFO: renamed from: a */
    private StatusBarNotification[] m86437a() {
        if (!fvq0.m123356j(m86441a())) {
            return null;
        }
        try {
            Object objM136882e = ikq0.m136882e(f62849a, "getActiveNotifications", m86441a().getPackageName());
            if (objM136882e instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) objM136882e;
            }
            return null;
        } catch (Throwable th) {
            m86434a("getAllNotifications error " + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86434a(String str) {
        ilq0.m137040m("NMHelper:" + str);
    }
}
