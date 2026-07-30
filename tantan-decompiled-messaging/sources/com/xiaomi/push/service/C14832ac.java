package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.C14753gs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.fvq0;
import p149l.ikq0;
import p149l.ilq0;
import p149l.iw3;
import p149l.up40;

/* JADX INFO: renamed from: com.xiaomi.push.service.ac */
/* JADX INFO: loaded from: classes2.dex */
public class C14832ac {

    /* JADX INFO: renamed from: a */
    private static final boolean f62832a = Log.isLoggable("NCHelper", 3);

    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static void m86390a(C14835af c14835af, NotificationChannel notificationChannel, String str) {
        int iM86382a;
        char c;
        boolean z;
        Context contextM86441a = c14835af.m86441a();
        String id = notificationChannel.getId();
        String strM86431a = C14835af.m86431a(id, c14835af.m86442a());
        boolean z2 = f62832a;
        if (z2) {
            m86391a("appChannelId:" + id + " oldChannelId:" + strM86431a);
        }
        if (fvq0.m123356j(contextM86441a) && !TextUtils.equals(id, strM86431a)) {
            NotificationManager notificationManager = (NotificationManager) contextM86441a.getSystemService("notification");
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(strM86431a);
            NotificationChannel notificationChannelM86440a = c14835af.m86440a(id);
            if (z2) {
                m86391a("xmsfChannel:" + notificationChannel2);
                m86391a("appChannel:" + notificationChannelM86440a);
            }
            if (notificationChannel2 != null) {
                NotificationChannel notificationChannelM86383a = m86383a(id, notificationChannel2);
                if (z2) {
                    m86391a("copyXmsf copyXmsfChannel:" + notificationChannelM86383a);
                }
                if (notificationChannelM86440a != null) {
                    iM86382a = m86382a(notificationChannelM86440a);
                    c14835af.m86448a(notificationChannelM86383a, iM86382a == 0);
                    c = 3;
                } else {
                    iM86382a = m86382a(notificationChannel2);
                    m86386a(contextM86441a, c14835af, notificationChannelM86383a, iM86382a, notificationChannel2.getId());
                    c = 4;
                }
                m86394b(contextM86441a, id);
                notificationManager.deleteNotificationChannel(strM86431a);
            } else if (notificationChannelM86440a == null) {
                if (z2) {
                    m86391a("appHack createNotificationChannel:" + notificationChannel);
                }
                c14835af.m86447a(notificationChannel);
                c = 1;
                iM86382a = 0;
            } else if (!m86393a(contextM86441a, id) && m86392a(notificationChannel, notificationChannelM86440a)) {
                if (z2) {
                    m86391a("appHack updateNotificationChannel:" + notificationChannel);
                }
                iM86382a = m86382a(notificationChannelM86440a);
                c14835af.m86448a(notificationChannel, iM86382a == 0);
                c = 2;
            }
            if (c != 1 || c == 4 || c == 3) {
                z = true;
            } else {
                z = false;
            }
            C14864f.m86646a(c14835af.m86441a(), c14835af.m86442a(), id, notificationChannel.getImportance(), str, z, iM86382a);
        }
        NotificationChannel notificationChannelM86440a2 = c14835af.m86440a(id);
        if (z2) {
            m86391a("elseLogic getNotificationChannel:" + notificationChannelM86440a2);
        }
        if (notificationChannelM86440a2 == null) {
            c14835af.m86447a(notificationChannel);
        }
        iM86382a = 0;
        c = 0;
        if (c != 1) {
            z = true;
        } else {
            z = true;
        }
        C14864f.m86646a(c14835af.m86441a(), c14835af.m86442a(), id, notificationChannel.getImportance(), str, z, iM86382a);
    }

    /* JADX INFO: renamed from: b */
    private static void m86394b(Context context, String str) {
        if (f62832a) {
            m86391a("recordCopiedChannel:" + str);
        }
        m86384a(context).edit().putBoolean(str, true).apply();
    }

    /* JADX INFO: renamed from: c */
    private static void m86395c(Context context, String str) {
        try {
            C14835af c14835afM86428a = C14835af.m86428a(context, str);
            Set<String> setKeySet = m86384a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                if (c14835afM86428a.m86449a(str2)) {
                    arrayList.add(str2);
                    if (f62832a) {
                        m86391a("delete channel copy record:" + str2);
                    }
                }
            }
            m86388a(context, arrayList);
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static boolean m86392a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z2 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z = false;
        } else {
            if (f62832a) {
                m86391a("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f62832a) {
                m86391a("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f62832a) {
                m86391a("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + notificationChannel2.getImportance());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f62832a) {
                m86391a("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f62832a) {
                m86391a("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (f62832a) {
                m86391a("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z2 = z;
        }
        if (f62832a) {
            m86391a("appHack channelConfigLowerCompare:isDifferent:" + z2);
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    private static int m86382a(NotificationChannel notificationChannel) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) ikq0.m136891n(notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (!f62832a) {
                return iIntValue;
            }
            m86391a("isUserLockedChannel:" + iIntValue + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + notificationChannel);
            return iIntValue;
        } catch (Exception e) {
            ilq0.m137041n("NCHelper", "is user locked error" + e);
            return iIntValue;
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static NotificationChannel m86383a(String str, NotificationChannel notificationChannel) {
        iw3.m138716a();
        NotificationChannel notificationChannelM194605a = up40.m194605a(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannelM194605a.setDescription(notificationChannel.getDescription());
        notificationChannelM194605a.enableVibration(notificationChannel.shouldVibrate());
        notificationChannelM194605a.enableLights(notificationChannel.shouldShowLights());
        notificationChannelM194605a.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannelM194605a.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannelM194605a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86393a(Context context, String str) {
        if (f62832a) {
            m86391a("checkCopeidChannel:newFullChannelId:" + str + "  " + m86384a(context).getBoolean(str, false));
        }
        return m86384a(context).getBoolean(str, false);
    }

    /* JADX INFO: renamed from: a */
    private static void m86388a(Context context, List<String> list) {
        if (f62832a) {
            m86391a("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = m86384a(context).edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    private static SharedPreferences m86384a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public static String m86385a(C14835af c14835af, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String strM86443a = c14835af.m86443a(str);
        boolean z = f62832a;
        if (z) {
            m86391a("createChannel: appChannelId:" + strM86443a + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannelM194605a = up40.m194605a(strM86443a, charSequence, i2);
        notificationChannelM194605a.setDescription(str2);
        notificationChannelM194605a.enableVibration((i & 2) != 0);
        notificationChannelM194605a.enableLights((i & 4) != 0);
        if ((i & 1) == 0) {
            notificationChannelM194605a.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + c14835af.m86442a())) {
                notificationChannelM194605a.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z) {
            m86391a("create channel:" + notificationChannelM194605a);
        }
        m86390a(c14835af, notificationChannelM194605a, str4);
        return strM86443a;
    }

    /* JADX INFO: renamed from: a */
    private static void m86391a(String str) {
        ilq0.m137041n("NCHelper", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m86387a(Context context, String str) {
        if (!fvq0.m123356j(context) || TextUtils.isEmpty(str)) {
            return;
        }
        m86395c(context, str);
        C14864f.m86645a(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m86389a(C14753gs c14753gs) {
        Map<String, String> map;
        if (c14753gs == null || (map = c14753gs.f62183a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        c14753gs.f62179a = 0;
        c14753gs.f62183a.remove("channel_id");
        c14753gs.f62183a.remove("channel_importance");
        c14753gs.f62183a.remove("channel_name");
        c14753gs.f62183a.remove("channel_description");
        c14753gs.f62183a.remove("channel_perm");
        ilq0.m137040m("delete channel info by:" + c14753gs.f62183a.get("REMOVE_CHANNEL_MARK"));
        c14753gs.f62183a.remove("REMOVE_CHANNEL_MARK");
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public static void m86386a(Context context, C14835af c14835af, NotificationChannel notificationChannel, int i, String str) {
        if (i > 0) {
            int iM86641a = C14739g.m85581a(context) >= 2 ? C14864f.m86641a(context.getPackageName(), str) : 0;
            NotificationChannel notificationChannelM86383a = m86383a(notificationChannel.getId(), notificationChannel);
            if ((i & 32) != 0) {
                if (notificationChannel.getSound() != null) {
                    notificationChannelM86383a.setSound(null, null);
                } else {
                    notificationChannelM86383a.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
            if ((i & 16) != 0) {
                if (notificationChannel.shouldVibrate()) {
                    notificationChannelM86383a.enableVibration(false);
                } else {
                    notificationChannelM86383a.enableVibration(true);
                }
            }
            if ((i & 8) != 0) {
                if (notificationChannel.shouldShowLights()) {
                    notificationChannelM86383a.enableLights(false);
                } else {
                    notificationChannelM86383a.enableLights(true);
                }
            }
            if ((i & 4) != 0) {
                int importance = notificationChannel.getImportance() - 1;
                if (importance <= 0) {
                    importance = 2;
                }
                notificationChannelM86383a.setImportance(importance);
            }
            if ((i & 2) != 0) {
                notificationChannelM86383a.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
            }
            c14835af.m86447a(notificationChannelM86383a);
            c14835af.m86448a(notificationChannel, true);
            C14864f.m86651a(c14835af.m86442a(), notificationChannel.getId(), iM86641a, 0);
            return;
        }
        c14835af.m86447a(notificationChannel);
    }
}
