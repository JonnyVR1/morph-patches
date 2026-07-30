package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.glb0;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;
import p153l.t5r0;
import p153l.w5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.f */
/* JADX INFO: loaded from: classes2.dex */
public class C15012f {

    /* JADX INFO: renamed from: a */
    private static final SparseArray<C14984ag.a<String, String, String>> f63886a;

    /* JADX INFO: renamed from: a */
    private static final int[] f63887a = {1, 2, 4, 8, 16};

    /* JADX INFO: renamed from: b */
    private static final SparseArray<Integer> f63888b;

    static {
        int i = 5;
        f63886a = new SparseArray<C14984ag.a<String, String, String>>(i) { // from class: com.xiaomi.push.service.f.1
            {
                put(1, C14984ag.f63705b);
                put(2, C14984ag.f63706c);
                put(4, C14984ag.f63707d);
                put(8, C14984ag.f63709f);
                put(16, C14984ag.f63708e);
            }
        };
        f63888b = new SparseArray<Integer>(i) { // from class: com.xiaomi.push.service.f.2
            {
                put(1, 32);
                put(2, 16);
                put(4, 8);
                put(8, 4);
                put(16, 2);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX INFO: renamed from: a */
    public static int m87810a(Context context, String str, NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || notificationChannel == null) {
            ouq0.m169393m("context|packageName|channel must not be null ");
            return 0;
        }
        int i = notificationChannel.getImportance() != 0 ? 1 : 2;
        int i2 = 8;
        if (C14984ag.m87639a()) {
            Bundle bundleM87815a = m87815a(str, notificationChannel.getId());
            C14984ag.a<String, String, String> aVar = C14984ag.f63709f;
            if (bundleM87815a.containsKey(aVar.f63714c)) {
                if (bundleM87815a.getBoolean(aVar.f63714c) && notificationChannel.getImportance() >= 4) {
                    i2 = 4;
                }
                i |= i2;
            }
            C14984ag.a<String, String, String> aVar2 = C14984ag.f63708e;
            if (bundleM87815a.containsKey(aVar2.f63714c)) {
                i |= bundleM87815a.getBoolean(aVar2.f63714c) ? 16 : 32;
            }
        } else {
            int iM87813a = m87813a(str, notificationChannel.getId(), 8);
            if (iM87813a == 1) {
                if (notificationChannel.getImportance() >= 4) {
                    i |= 4;
                } else {
                    i |= 8;
                }
            } else if (iM87813a == 0) {
                i |= 8;
            }
            int iM87813a2 = m87813a(str, notificationChannel.getId(), 16);
            if (iM87813a2 == 1) {
                i |= 16;
            } else if (iM87813a2 == 0) {
                i |= 32;
            }
        }
        return (notificationChannel.getSound() != null ? i | 64 : i | 128) | (notificationChannel.shouldVibrate() ? 256 : 512);
    }

    /* JADX INFO: renamed from: a */
    public static int m87812a(String str, String str2) {
        int i = m87825a(str, str2, 8) ? 8 : 0;
        if (m87825a(str, str2, 16)) {
            i |= 16;
        }
        if (m87825a(str, str2, 1)) {
            i |= 1;
        }
        if (m87825a(str, str2, 2)) {
            i |= 2;
        }
        return m87825a(str, str2, 4) ? i | 4 : i;
    }

    /* JADX INFO: renamed from: a */
    public static void m87817a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (l4r0.m152825j(context) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            int iM204982a = w5r0.m204982a(str3, 0);
            boolean zM87824a = m87824a(i, iM204982a);
            if (z) {
                m87822a(str, str2, iM204982a, i2);
                if (zM87824a) {
                    synchronized (C15012f.class) {
                        m87818a(m87814a(context), iM204982a, str2);
                    }
                    return;
                }
                return;
            }
            synchronized (C15012f.class) {
                try {
                    SharedPreferences sharedPreferencesM87814a = m87814a(context);
                    if (zM87824a || sharedPreferencesM87814a.contains(str2)) {
                        m87819a(sharedPreferencesM87814a, iM204982a, str, str2, i2);
                        if (zM87824a) {
                            m87818a(sharedPreferencesM87814a, iM204982a, str2);
                        } else {
                            m87820a(sharedPreferencesM87814a, str2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (l4r0.m152825j(context)) {
            ouq0.m169393m("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87816a(Context context, String str) {
        List<NotificationChannel> listM87615a;
        if (!l4r0.m152825j(context) || TextUtils.isEmpty(str) || (listM87615a = C14983af.m87599a(context, str).m87615a()) == null) {
            return;
        }
        synchronized (C15012f.class) {
            try {
                SharedPreferences sharedPreferencesM87814a = m87814a(context);
                ArrayList arrayList = new ArrayList();
                Iterator<NotificationChannel> it = listM87615a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) otq0.m169166d(glb0.m130641a(it.next()), "mId");
                    if (!TextUtils.isEmpty(str2) && sharedPreferencesM87814a.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    m87821a(sharedPreferencesM87814a, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87822a(String str, String str2, int i, int i2) {
        for (int i3 : f63887a) {
            if ((f63888b.get(i3).intValue() & i2) == 0) {
                m87823a(str, str2, i3, (i & i3) > 0);
            } else {
                ouq0.m169393m("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87823a(String str, String str2, int i, boolean z) {
        ouq0.m169393m("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i + "=" + z + "> :" + C14984ag.m87642a(t5r0.m189418b(), str, str2, f63886a.get(i), z));
    }

    /* JADX INFO: renamed from: a */
    public static int m87813a(String str, String str2, int i) {
        return C14984ag.m87626a(t5r0.m189418b(), str, str2, f63886a.get(i));
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m87815a(String str, String str2) {
        return C14984ag.m87627a(t5r0.m189418b(), str, str2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87825a(String str, String str2, int i) {
        boolean z = C14984ag.m87626a(t5r0.m189418b(), str, str2, f63886a.get(i)) == 1;
        ouq0.m169393m("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i + "=" + z + ">");
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87824a(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX INFO: renamed from: a */
    public static int m87811a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26 && context != null && !TextUtils.isEmpty(str)) {
            C14983af c14983afM87599a = C14983af.m87599a(context, str);
            if (c14983afM87599a != null) {
                NotificationChannel notificationChannelM87611a = c14983afM87599a.m87611a(c14983afM87599a.m87614a(str2));
                if (notificationChannelM87611a != null) {
                    int i = notificationChannelM87611a.getImportance() != 0 ? 1 : 2;
                    int iM87813a = m87813a(str, notificationChannelM87611a.getId(), 8);
                    if (iM87813a == 1) {
                        if (notificationChannelM87611a.getImportance() >= 4) {
                            i |= 4;
                        } else {
                            i |= 8;
                        }
                    } else if (iM87813a == 0) {
                        i |= 8;
                    }
                    int iM87813a2 = m87813a(str, notificationChannelM87611a.getId(), 16);
                    if (iM87813a2 == 1) {
                        return i | 16;
                    }
                    return iM87813a2 == 0 ? i | 32 : i;
                }
                ouq0.m169393m("Channel must not be null");
                return 0;
            }
            ouq0.m169393m("create NMHelper error");
            return 0;
        }
        ouq0.m169393m("Must greater than or equal android O and context|packageName not be null");
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static void m87819a(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            m87822a(str, str2, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m87818a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    /* JADX INFO: renamed from: a */
    private static void m87820a(SharedPreferences sharedPreferences, String str) {
        m87821a(sharedPreferences, new ArrayList<String>(str) { // from class: com.xiaomi.push.service.f.3

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f63889a;

            {
                this.f63889a = str;
                add(str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m87821a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    private static SharedPreferences m87814a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }
}
