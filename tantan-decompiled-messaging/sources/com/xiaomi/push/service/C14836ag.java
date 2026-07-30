package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.C14739g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p149l.ig3;
import p149l.ikq0;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ag */
/* JADX INFO: loaded from: classes2.dex */
public class C14836ag {

    /* JADX INFO: renamed from: a */
    public static final a<String, String, String> f62854a;

    /* JADX INFO: renamed from: a */
    static Boolean f62855a;

    /* JADX INFO: renamed from: b */
    public static final a<String, String, String> f62858b;

    /* JADX INFO: renamed from: c */
    public static final a<String, String, String> f62859c;

    /* JADX INFO: renamed from: d */
    public static final a<String, String, String> f62860d;

    /* JADX INFO: renamed from: e */
    public static final a<String, String, String> f62861e;

    /* JADX INFO: renamed from: f */
    public static final a<String, String, String> f62862f;

    /* JADX INFO: renamed from: g */
    public static final a<String, String, String> f62863g;

    /* JADX INFO: renamed from: h */
    public static final a<String, String, String> f62864h;

    /* JADX INFO: renamed from: a */
    private static final String[] f62857a = {"com.mi.globalbrowser", "com.android.browser"};

    /* JADX INFO: renamed from: a */
    private static String f62856a = null;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ag$a */
    public static class a<F, S, T> {

        /* JADX INFO: renamed from: a */
        F f62865a;

        /* JADX INFO: renamed from: b */
        S f62866b;

        /* JADX INFO: renamed from: c */
        T f62867c;

        private a(F f, S s, T t) {
            this.f62865a = f;
            this.f62866b = s;
            this.f62867c = t;
        }
    }

    static {
        String str = "getNotificationSettings";
        f62854a = new a<>(str, str, str);
        String str2 = "canSound";
        f62858b = new a<>("setSound", str2, str2);
        String str3 = "canVibrate";
        f62859c = new a<>("setVibrate", str3, str3);
        String str4 = "canLights";
        f62860d = new a<>("setLights", str4, str4);
        String str5 = "canShowOnKeyguard";
        f62861e = new a<>("setShowOnKeyguard", str5, str5);
        f62862f = new a<>("setFloat", "canFloat", "canShowFloat");
        String str6 = "canShowBadge";
        f62863g = new a<>("setShowBadge", str6, str6);
        String str7 = "canShowOngoing";
        f62864h = new a<>("setShowOngoing", str7, str7);
    }

    /* JADX INFO: renamed from: a */
    public static void m86466a(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f62857a));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e) {
                    ilq0.m137040m("can't match url intent. " + e);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    /* JADX INFO: renamed from: b */
    public static String m86474b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX INFO: renamed from: c */
    public static String m86476c(Notification notification) {
        Object objM136881d;
        String string = null;
        try {
            Bundle bundle = notification.extras;
            string = bundle != null ? bundle.getString("target_package") : null;
            if (TextUtils.isEmpty(string) && (objM136881d = ikq0.m136881d(notification, "extraNotification")) != null) {
                return (String) ikq0.m136882e(objM136881d, "getTargetPkg", new Object[0]);
            }
        } catch (Exception unused) {
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static void m86475b(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object objM136881d = ikq0.m136881d(notification, "extraNotification");
            if (objM136881d != null) {
                ikq0.m136882e(objM136881d, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m86460a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX INFO: renamed from: a */
    public static Notification.Action[] m86473a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m86458a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86467a(Map<String, String> map, Bundle bundle, String str) {
        if (map != null && bundle != null && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(map.get(str))) {
                bundle.remove(str);
                return;
            } else {
                bundle.putString(str, map.get(str));
                return;
            }
        }
        ilq0.m137040m("cp map to b fail:" + str);
    }

    /* JADX INFO: renamed from: a */
    public static void m86464a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString("target_package", str);
            }
            Object objM136881d = ikq0.m136881d(notification, "extraNotification");
            if (objM136881d != null) {
                ikq0.m136882e(objM136881d, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86465a(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object objM136881d = ikq0.m136881d(notification, "extraNotification");
            if (objM136881d != null) {
                ikq0.m136882e(objM136881d, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86462a(Notification notification, int i) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i);
            }
            Object objM136881d = ikq0.m136881d(notification, "extraNotification");
            if (objM136881d != null) {
                ikq0.m136882e(objM136881d, "setMessageCount", Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86463a(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m86461a(Object obj) {
        return (String) m86459a(obj, "msg_busi_type", "");
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m86459a(Object obj, String str, T t) {
        Object objM86458a = null;
        try {
            if (obj instanceof Notification) {
                objM86458a = m86458a((Notification) obj, str);
            } else if (obj instanceof Map) {
                objM86458a = ((Map) obj).get(str);
            } else if (obj instanceof Bundle) {
                objM86458a = ((Bundle) obj).get(str);
            } else {
                ilq0.m137040m("not support get value from classType:" + obj);
            }
        } catch (Exception e) {
            ilq0.m137040m("get value error " + e);
        }
        return objM86458a == null ? t : (T) objM86458a;
    }

    /* JADX INFO: renamed from: a */
    public static int m86454a(Context context, String str) {
        return C14739g.m85593m(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86468a() {
        Bundle bundleM86644a;
        if (f62855a == null) {
            if (Build.VERSION.SDK_INT >= 30 && (bundleM86644a = C14864f.m86644a("com.xiaomi.xmsf", (String) null)) != null && !bundleM86644a.isEmpty()) {
                f62855a = Boolean.TRUE;
            } else {
                f62855a = Boolean.FALSE;
            }
        }
        return f62855a.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static int m86453a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e) {
            ilq0.m137040m("get user aggregate failed, " + e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86470a(ContentResolver contentResolver) {
        int iM86453a = m86453a(contentResolver);
        return iM86453a == 1 || iM86453a == 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86472a(Map<String, String> map) {
        return Boolean.parseBoolean((String) m86459a(map, "not_suppress", "true"));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86469a(Notification.Builder builder, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z ? 2 : 1);
            return true;
        }
        ilq0.m137050w("not support setGroupAlertBehavior");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static int m86455a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle bundleM86457a = m86457a(context, aVar.f62866b, str, str2, (Bundle) null);
            if (bundleM86457a == null || !bundleM86457a.containsKey(aVar.f62867c)) {
                return -1;
            }
            return bundleM86457a.getBoolean(aVar.f62867c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m86456a(Context context, String str, String str2) {
        try {
            return m86457a(context, f62854a.f62866b, str, str2, (Bundle) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86471a(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(aVar.f62867c, z);
            m86457a(context, aVar.f62865a, str, str2, bundle);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bundle m86457a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("package", str2);
            if (!TextUtils.isEmpty(str3)) {
                bundle2.putString("channel_id", str3);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
        }
        ig3.m135964a("call notification provider failed!");
        return null;
    }
}
