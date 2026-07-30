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
import com.xiaomi.push.C14887g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p153l.otq0;
import p153l.ouq0;
import p153l.wg3;

/* JADX INFO: renamed from: com.xiaomi.push.service.ag */
/* JADX INFO: loaded from: classes2.dex */
public class C14984ag {

    /* JADX INFO: renamed from: a */
    public static final a<String, String, String> f63701a;

    /* JADX INFO: renamed from: a */
    static Boolean f63702a;

    /* JADX INFO: renamed from: b */
    public static final a<String, String, String> f63705b;

    /* JADX INFO: renamed from: c */
    public static final a<String, String, String> f63706c;

    /* JADX INFO: renamed from: d */
    public static final a<String, String, String> f63707d;

    /* JADX INFO: renamed from: e */
    public static final a<String, String, String> f63708e;

    /* JADX INFO: renamed from: f */
    public static final a<String, String, String> f63709f;

    /* JADX INFO: renamed from: g */
    public static final a<String, String, String> f63710g;

    /* JADX INFO: renamed from: h */
    public static final a<String, String, String> f63711h;

    /* JADX INFO: renamed from: a */
    private static final String[] f63704a = {"com.mi.globalbrowser", "com.android.browser"};

    /* JADX INFO: renamed from: a */
    private static String f63703a = null;

    /* JADX INFO: renamed from: com.xiaomi.push.service.ag$a */
    public static class a<F, S, T> {

        /* JADX INFO: renamed from: a */
        F f63712a;

        /* JADX INFO: renamed from: b */
        S f63713b;

        /* JADX INFO: renamed from: c */
        T f63714c;

        private a(F f, S s, T t) {
            this.f63712a = f;
            this.f63713b = s;
            this.f63714c = t;
        }
    }

    static {
        String str = "getNotificationSettings";
        f63701a = new a<>(str, str, str);
        String str2 = "canSound";
        f63705b = new a<>("setSound", str2, str2);
        String str3 = "canVibrate";
        f63706c = new a<>("setVibrate", str3, str3);
        String str4 = "canLights";
        f63707d = new a<>("setLights", str4, str4);
        String str5 = "canShowOnKeyguard";
        f63708e = new a<>("setShowOnKeyguard", str5, str5);
        f63709f = new a<>("setFloat", "canFloat", "canShowFloat");
        String str6 = "canShowBadge";
        f63710g = new a<>("setShowBadge", str6, str6);
        String str7 = "canShowOngoing";
        f63711h = new a<>("setShowOngoing", str7, str7);
    }

    /* JADX INFO: renamed from: a */
    public static void m87637a(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f63704a));
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
                    ouq0.m169393m("can't match url intent. " + e);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    /* JADX INFO: renamed from: b */
    public static String m87645b(Notification notification) {
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
    public static String m87647c(Notification notification) {
        Object objM169166d;
        String string = null;
        try {
            Bundle bundle = notification.extras;
            string = bundle != null ? bundle.getString("target_package") : null;
            if (TextUtils.isEmpty(string) && (objM169166d = otq0.m169166d(notification, "extraNotification")) != null) {
                return (String) otq0.m169167e(objM169166d, "getTargetPkg", new Object[0]);
            }
        } catch (Exception unused) {
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static void m87646b(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object objM169166d = otq0.m169166d(notification, "extraNotification");
            if (objM169166d != null) {
                otq0.m169167e(objM169166d, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m87631a(Notification notification) {
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
    public static Notification.Action[] m87644a(Notification notification) {
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
    public static <T> T m87629a(Notification notification, String str) {
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
    public static void m87638a(Map<String, String> map, Bundle bundle, String str) {
        if (map != null && bundle != null && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(map.get(str))) {
                bundle.remove(str);
                return;
            } else {
                bundle.putString(str, map.get(str));
                return;
            }
        }
        ouq0.m169393m("cp map to b fail:" + str);
    }

    /* JADX INFO: renamed from: a */
    public static void m87635a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString("target_package", str);
            }
            Object objM169166d = otq0.m169166d(notification, "extraNotification");
            if (objM169166d != null) {
                otq0.m169167e(objM169166d, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87636a(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object objM169166d = otq0.m169166d(notification, "extraNotification");
            if (objM169166d != null) {
                otq0.m169167e(objM169166d, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87633a(Notification notification, int i) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i);
            }
            Object objM169166d = otq0.m169166d(notification, "extraNotification");
            if (objM169166d != null) {
                otq0.m169167e(objM169166d, "setMessageCount", Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87634a(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m87632a(Object obj) {
        return (String) m87630a(obj, "msg_busi_type", "");
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m87630a(Object obj, String str, T t) {
        Object objM87629a = null;
        try {
            if (obj instanceof Notification) {
                objM87629a = m87629a((Notification) obj, str);
            } else if (obj instanceof Map) {
                objM87629a = ((Map) obj).get(str);
            } else if (obj instanceof Bundle) {
                objM87629a = ((Bundle) obj).get(str);
            } else {
                ouq0.m169393m("not support get value from classType:" + obj);
            }
        } catch (Exception e) {
            ouq0.m169393m("get value error " + e);
        }
        return objM87629a == null ? t : (T) objM87629a;
    }

    /* JADX INFO: renamed from: a */
    public static int m87625a(Context context, String str) {
        return C14887g.m86764m(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87639a() {
        Bundle bundleM87815a;
        if (f63702a == null) {
            if (Build.VERSION.SDK_INT >= 30 && (bundleM87815a = C15012f.m87815a("com.xiaomi.xmsf", (String) null)) != null && !bundleM87815a.isEmpty()) {
                f63702a = Boolean.TRUE;
            } else {
                f63702a = Boolean.FALSE;
            }
        }
        return f63702a.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static int m87624a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e) {
            ouq0.m169393m("get user aggregate failed, " + e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87641a(ContentResolver contentResolver) {
        int iM87624a = m87624a(contentResolver);
        return iM87624a == 1 || iM87624a == 2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87643a(Map<String, String> map) {
        return Boolean.parseBoolean((String) m87630a(map, "not_suppress", "true"));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87640a(Notification.Builder builder, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z ? 2 : 1);
            return true;
        }
        ouq0.m169403w("not support setGroupAlertBehavior");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static int m87626a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle bundleM87628a = m87628a(context, aVar.f63713b, str, str2, (Bundle) null);
            if (bundleM87628a == null || !bundleM87628a.containsKey(aVar.f63714c)) {
                return -1;
            }
            return bundleM87628a.getBoolean(aVar.f63714c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m87627a(Context context, String str, String str2) {
        try {
            return m87628a(context, f63701a.f63713b, str, str2, (Bundle) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87642a(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar == null) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(aVar.f63714c, z);
            m87628a(context, aVar.f63712a, str, str2, bundle);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Bundle m87628a(Context context, String str, String str2, String str3, Bundle bundle) {
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
        wg3.m206174a("call notification provider failed!");
        return null;
    }
}
