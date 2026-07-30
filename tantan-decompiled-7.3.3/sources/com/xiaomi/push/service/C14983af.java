package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.EnumC14893gk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p153l.glb0;
import p153l.jj5;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;
import p153l.u3r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.af */
/* JADX INFO: loaded from: classes2.dex */
public class C14983af {

    /* JADX INFO: renamed from: a */
    private static Context f63695a;

    /* JADX INFO: renamed from: a */
    private static Object f63696a;

    /* JADX INFO: renamed from: a */
    private static WeakHashMap<Integer, C14983af> f63697a = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    private static boolean f63698a;

    /* JADX INFO: renamed from: a */
    private String f63699a;

    /* JADX INFO: renamed from: b */
    private String f63700b;

    private C14983af(String str) {
        this.f63699a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public List<NotificationChannel> m87615a() {
        String str;
        String str2 = this.f63699a;
        List<NotificationChannel> notificationChannels = null;
        try {
            if (m87606a()) {
                int iM87597a = m87597a(str2);
                if (iM87597a != -1) {
                    List<NotificationChannel> list = (List) m87600a(otq0.m169167e(f63696a, "getNotificationChannelsForPackage", str2, Integer.valueOf(iM87597a), Boolean.FALSE));
                    str = "mipush|%s|%s";
                    notificationChannels = list;
                } else {
                    str = null;
                }
            } else {
                notificationChannels = m87598a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!l4r0.m152824i() || notificationChannels == null) {
                return notificationChannels;
            }
            ArrayList arrayList = new ArrayList();
            String strM87603a = m87603a(str, str2, "");
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM130641a = glb0.m130641a(it.next());
                if (notificationChannelM130641a.getId().startsWith(strM87603a)) {
                    arrayList.add(notificationChannelM130641a);
                }
            }
            return arrayList;
        } catch (Exception e) {
            m87605a("getNotificationChannels error " + e);
            return notificationChannels;
        }
    }

    /* JADX INFO: renamed from: b */
    public List<StatusBarNotification> m87622b() {
        String str = this.f63699a;
        NotificationManager notificationManagerM87598a = m87598a();
        ArrayList arrayList = null;
        try {
            if (m87606a()) {
                int iM194395c = u3r0.m194395c();
                if (iM194395c != -1) {
                    return (List) m87600a(otq0.m169167e(f63696a, "getAppActiveNotifications", str, Integer.valueOf(iM194395c)));
                }
            } else {
                StatusBarNotification[] activeNotifications = notificationManagerM87598a.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(C14984ag.m87647c(statusBarNotification.getNotification()))) {
                                arrayList2.add(statusBarNotification);
                            }
                        }
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList2;
                        m87605a("getActiveNotifications error " + th);
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
    public String m87623c(String str, String str2) {
        return m87606a() ? str : str2;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f63699a + "}";
    }

    /* JADX INFO: renamed from: b */
    private String m87609b(String str) {
        return m87610b(this.f63699a, str);
    }

    /* JADX INFO: renamed from: b */
    public String m87621b() {
        if (TextUtils.isEmpty(this.f63700b)) {
            this.f63700b = m87609b("default");
        }
        return this.f63700b;
    }

    /* JADX INFO: renamed from: b */
    public static String m87610b(String str, String str2) {
        String str3;
        if (m87606a()) {
            str3 = "mipush|%s|%s";
        } else {
            str3 = "mipush_%s_%s";
        }
        return m87603a(str3, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public String m87613a() {
        return this.f63699a;
    }

    /* JADX INFO: renamed from: a */
    public static C14983af m87599a(Context context, String str) {
        m87604a(context);
        int iHashCode = str.hashCode();
        C14983af c14983af = f63697a.get(Integer.valueOf(iHashCode));
        if (c14983af != null) {
            return c14983af;
        }
        C14983af c14983af2 = new C14983af(str);
        f63697a.put(Integer.valueOf(iHashCode), c14983af2);
        return c14983af2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87607a(Context context) {
        m87604a(context);
        return m87606a();
    }

    /* JADX INFO: renamed from: a */
    public static String m87602a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strM87603a = m87603a("mipush|%s|%s", str2, "");
        return str.startsWith(strM87603a) ? m87603a("mipush_%s_%s", str2, str.replace(strM87603a, "")) : str;
    }

    /* JADX INFO: renamed from: a */
    private static void m87604a(Context context) {
        if (f63695a == null) {
            f63695a = context.getApplicationContext();
            NotificationManager notificationManagerM87598a = m87598a();
            Boolean bool = (Boolean) otq0.m169167e(notificationManagerM87598a, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m87605a("fwk is support.init:" + bool);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            f63698a = zBooleanValue;
            if (zBooleanValue) {
                f63696a = otq0.m169167e(notificationManagerM87598a, "getService", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static NotificationManager m87598a() {
        return (NotificationManager) f63695a.getSystemService("notification");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87606a() {
        if (l4r0.m152824i() && C14985ah.m87648a(f63695a).m87660a(EnumC14893gk.NotificationBelongToAppSwitch.m86817a(), true)) {
            return f63698a;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static int m87597a(String str) {
        try {
            return f63695a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Object m87601a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    /* JADX INFO: renamed from: a */
    private static <T> T m87600a(Object obj) {
        if (obj != null) {
            try {
                return (T) obj.getClass().getMethod("getList", null).invoke(obj, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m87603a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87620a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(m87609b(""));
    }

    /* JADX INFO: renamed from: a */
    public String m87614a(String str) {
        if (TextUtils.isEmpty(str)) {
            return m87621b();
        }
        return l4r0.m152825j(m87612a()) ? m87609b(str) : str;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public void m87618a(NotificationChannel notificationChannel) {
        String str = this.f63699a;
        try {
            if (!m87606a()) {
                m87598a().createNotificationChannel(notificationChannel);
                return;
            }
            int iM87597a = m87597a(str);
            if (iM87597a != -1) {
                otq0.m169176n(f63696a, "createNotificationChannelsForPackage", str, Integer.valueOf(iM87597a), m87601a(Arrays.asList(notificationChannel)));
            }
        } catch (Exception e) {
            m87605a("createNotificationChannel error" + e);
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public NotificationChannel m87611a(String str) {
        try {
            if (!m87606a()) {
                return m87598a().getNotificationChannel(str);
            }
            List<NotificationChannel> listM87615a = m87615a();
            if (listM87615a != null) {
                Iterator<NotificationChannel> it = listM87615a.iterator();
                while (it.hasNext()) {
                    NotificationChannel notificationChannelM130641a = glb0.m130641a(it.next());
                    if (str.equals(notificationChannelM130641a.getId())) {
                        return notificationChannelM130641a;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            m87605a("getNotificationChannel error" + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Context m87612a() {
        return f63695a;
    }

    /* JADX INFO: renamed from: a */
    public void m87619a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f63699a;
        try {
            if (z) {
                int iM87597a = m87597a(str);
                if (iM87597a != -1) {
                    otq0.m169176n(f63696a, "updateNotificationChannelForPackage", str, Integer.valueOf(iM87597a), notificationChannel);
                    return;
                }
                return;
            }
            m87618a(notificationChannel);
        } catch (Exception e) {
            m87605a("updateNotificationChannel error " + e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87617a(int i, Notification notification) {
        String str = this.f63699a;
        NotificationManager notificationManagerM87598a = m87598a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (m87606a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i2 >= 29) {
                    notificationManagerM87598a.notifyAsPackage(str, null, i, notification);
                    return;
                } else {
                    jj5.m145013g(notificationManagerM87598a, i, notification);
                    return;
                }
            }
            jj5.m145013g(notificationManagerM87598a, i, notification);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87616a(int i) {
        String str = this.f63699a;
        try {
            if (m87606a()) {
                int iM194395c = u3r0.m194395c();
                String packageName = m87612a().getPackageName();
                if (Build.VERSION.SDK_INT >= 30) {
                    otq0.m169176n(f63696a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(iM194395c));
                } else {
                    otq0.m169176n(f63696a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(iM194395c));
                }
                m87605a("cancel succ:" + i);
                return;
            }
            m87598a().cancel(i);
        } catch (Exception e) {
            m87605a("cancel error" + e);
        }
    }

    /* JADX INFO: renamed from: a */
    private StatusBarNotification[] m87608a() {
        if (!l4r0.m152825j(m87612a())) {
            return null;
        }
        try {
            Object objM169167e = otq0.m169167e(f63696a, "getActiveNotifications", m87612a().getPackageName());
            if (objM169167e instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) objM169167e;
            }
            return null;
        } catch (Throwable th) {
            m87605a("getAllNotifications error " + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87605a(String str) {
        ouq0.m169393m("NMHelper:" + str);
    }
}
