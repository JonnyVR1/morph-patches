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
import p149l.cdb0;
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.nwq0;
import p149l.qwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14864f {

    /* JADX INFO: renamed from: a */
    private static final SparseArray<C14836ag.a<String, String, String>> f63039a;

    /* JADX INFO: renamed from: a */
    private static final int[] f63040a = {1, 2, 4, 8, 16};

    /* JADX INFO: renamed from: b */
    private static final SparseArray<Integer> f63041b;

    static {
        int i = 5;
        f63039a = new SparseArray<C14836ag.a<String, String, String>>(i) { // from class: com.xiaomi.push.service.f.1
            {
                put(1, C14836ag.f62858b);
                put(2, C14836ag.f62859c);
                put(4, C14836ag.f62860d);
                put(8, C14836ag.f62862f);
                put(16, C14836ag.f62861e);
            }
        };
        f63041b = new SparseArray<Integer>(i) { // from class: com.xiaomi.push.service.f.2
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
    public static int m86639a(Context context, String str, NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || notificationChannel == null) {
            ilq0.m137040m("context|packageName|channel must not be null ");
            return 0;
        }
        int i = notificationChannel.getImportance() != 0 ? 1 : 2;
        int i2 = 8;
        if (C14836ag.m86468a()) {
            Bundle bundleM86644a = m86644a(str, notificationChannel.getId());
            C14836ag.a<String, String, String> aVar = C14836ag.f62862f;
            if (bundleM86644a.containsKey(aVar.f62867c)) {
                if (bundleM86644a.getBoolean(aVar.f62867c) && notificationChannel.getImportance() >= 4) {
                    i2 = 4;
                }
                i |= i2;
            }
            C14836ag.a<String, String, String> aVar2 = C14836ag.f62861e;
            if (bundleM86644a.containsKey(aVar2.f62867c)) {
                i |= bundleM86644a.getBoolean(aVar2.f62867c) ? 16 : 32;
            }
        } else {
            int iM86642a = m86642a(str, notificationChannel.getId(), 8);
            if (iM86642a == 1) {
                if (notificationChannel.getImportance() >= 4) {
                    i |= 4;
                } else {
                    i |= 8;
                }
            } else if (iM86642a == 0) {
                i |= 8;
            }
            int iM86642a2 = m86642a(str, notificationChannel.getId(), 16);
            if (iM86642a2 == 1) {
                i |= 16;
            } else if (iM86642a2 == 0) {
                i |= 32;
            }
        }
        return (notificationChannel.getSound() != null ? i | 64 : i | 128) | (notificationChannel.shouldVibrate() ? 256 : 512);
    }

    /* JADX INFO: renamed from: a */
    public static int m86641a(String str, String str2) {
        int i = m86654a(str, str2, 8) ? 8 : 0;
        if (m86654a(str, str2, 16)) {
            i |= 16;
        }
        if (m86654a(str, str2, 1)) {
            i |= 1;
        }
        if (m86654a(str, str2, 2)) {
            i |= 2;
        }
        return m86654a(str, str2, 4) ? i | 4 : i;
    }

    /* JADX INFO: renamed from: a */
    public static void m86646a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (fvq0.m123356j(context) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            int iM176890a = qwq0.m176890a(str3, 0);
            boolean zM86653a = m86653a(i, iM176890a);
            if (z) {
                m86651a(str, str2, iM176890a, i2);
                if (zM86653a) {
                    synchronized (C14864f.class) {
                        m86647a(m86643a(context), iM176890a, str2);
                    }
                    return;
                }
                return;
            }
            synchronized (C14864f.class) {
                try {
                    SharedPreferences sharedPreferencesM86643a = m86643a(context);
                    if (zM86653a || sharedPreferencesM86643a.contains(str2)) {
                        m86648a(sharedPreferencesM86643a, iM176890a, str, str2, i2);
                        if (zM86653a) {
                            m86647a(sharedPreferencesM86643a, iM176890a, str2);
                        } else {
                            m86649a(sharedPreferencesM86643a, str2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (fvq0.m123356j(context)) {
            ilq0.m137040m("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86645a(Context context, String str) {
        List<NotificationChannel> listM86444a;
        if (!fvq0.m123356j(context) || TextUtils.isEmpty(str) || (listM86444a = C14835af.m86428a(context, str).m86444a()) == null) {
            return;
        }
        synchronized (C14864f.class) {
            try {
                SharedPreferences sharedPreferencesM86643a = m86643a(context);
                ArrayList arrayList = new ArrayList();
                Iterator<NotificationChannel> it = listM86444a.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ikq0.m136881d(cdb0.m106215a(it.next()), "mId");
                    if (!TextUtils.isEmpty(str2) && sharedPreferencesM86643a.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    m86650a(sharedPreferencesM86643a, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86651a(String str, String str2, int i, int i2) {
        for (int i3 : f63040a) {
            if ((f63041b.get(i3).intValue() & i2) == 0) {
                m86652a(str, str2, i3, (i & i3) > 0);
            } else {
                ilq0.m137040m("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86652a(String str, String str2, int i, boolean z) {
        ilq0.m137040m("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i + "=" + z + "> :" + C14836ag.m86471a(nwq0.m161879b(), str, str2, f63039a.get(i), z));
    }

    /* JADX INFO: renamed from: a */
    public static int m86642a(String str, String str2, int i) {
        return C14836ag.m86455a(nwq0.m161879b(), str, str2, f63039a.get(i));
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m86644a(String str, String str2) {
        return C14836ag.m86456a(nwq0.m161879b(), str, str2);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86654a(String str, String str2, int i) {
        boolean z = C14836ag.m86455a(nwq0.m161879b(), str, str2, f63039a.get(i)) == 1;
        ilq0.m137040m("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i + "=" + z + ">");
        return z;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86653a(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX INFO: renamed from: a */
    public static int m86640a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26 && context != null && !TextUtils.isEmpty(str)) {
            C14835af c14835afM86428a = C14835af.m86428a(context, str);
            if (c14835afM86428a != null) {
                NotificationChannel notificationChannelM86440a = c14835afM86428a.m86440a(c14835afM86428a.m86443a(str2));
                if (notificationChannelM86440a != null) {
                    int i = notificationChannelM86440a.getImportance() != 0 ? 1 : 2;
                    int iM86642a = m86642a(str, notificationChannelM86440a.getId(), 8);
                    if (iM86642a == 1) {
                        if (notificationChannelM86440a.getImportance() >= 4) {
                            i |= 4;
                        } else {
                            i |= 8;
                        }
                    } else if (iM86642a == 0) {
                        i |= 8;
                    }
                    int iM86642a2 = m86642a(str, notificationChannelM86440a.getId(), 16);
                    if (iM86642a2 == 1) {
                        return i | 16;
                    }
                    return iM86642a2 == 0 ? i | 32 : i;
                }
                ilq0.m137040m("Channel must not be null");
                return 0;
            }
            ilq0.m137040m("create NMHelper error");
            return 0;
        }
        ilq0.m137040m("Must greater than or equal android O and context|packageName not be null");
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static void m86648a(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            m86651a(str, str2, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86647a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    /* JADX INFO: renamed from: a */
    private static void m86649a(SharedPreferences sharedPreferences, String str) {
        m86650a(sharedPreferences, new ArrayList<String>(str) { // from class: com.xiaomi.push.service.f.3

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f63042a;

            {
                this.f63042a = str;
                add(str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static void m86650a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    private static SharedPreferences m86643a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }
}
