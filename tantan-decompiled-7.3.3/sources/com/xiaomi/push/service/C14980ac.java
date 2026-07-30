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
import com.xiaomi.push.C14887g;
import com.xiaomi.push.C14901gs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153l.hx3;
import p153l.iy40;
import p153l.l4r0;
import p153l.otq0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ac */
/* JADX INFO: loaded from: classes2.dex */
public class C14980ac {

    /* JADX INFO: renamed from: a */
    private static final boolean f63679a = Log.isLoggable("NCHelper", 3);

    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static void m87561a(C14983af c14983af, NotificationChannel notificationChannel, String str) {
        int iM87553a;
        char c;
        boolean z;
        Context contextM87612a = c14983af.m87612a();
        String id = notificationChannel.getId();
        String strM87602a = C14983af.m87602a(id, c14983af.m87613a());
        boolean z2 = f63679a;
        if (z2) {
            m87562a("appChannelId:" + id + " oldChannelId:" + strM87602a);
        }
        if (l4r0.m152825j(contextM87612a) && !TextUtils.equals(id, strM87602a)) {
            NotificationManager notificationManager = (NotificationManager) contextM87612a.getSystemService("notification");
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(strM87602a);
            NotificationChannel notificationChannelM87611a = c14983af.m87611a(id);
            if (z2) {
                m87562a("xmsfChannel:" + notificationChannel2);
                m87562a("appChannel:" + notificationChannelM87611a);
            }
            if (notificationChannel2 != null) {
                NotificationChannel notificationChannelM87554a = m87554a(id, notificationChannel2);
                if (z2) {
                    m87562a("copyXmsf copyXmsfChannel:" + notificationChannelM87554a);
                }
                if (notificationChannelM87611a != null) {
                    iM87553a = m87553a(notificationChannelM87611a);
                    c14983af.m87619a(notificationChannelM87554a, iM87553a == 0);
                    c = 3;
                } else {
                    iM87553a = m87553a(notificationChannel2);
                    m87557a(contextM87612a, c14983af, notificationChannelM87554a, iM87553a, notificationChannel2.getId());
                    c = 4;
                }
                m87565b(contextM87612a, id);
                notificationManager.deleteNotificationChannel(strM87602a);
            } else if (notificationChannelM87611a == null) {
                if (z2) {
                    m87562a("appHack createNotificationChannel:" + notificationChannel);
                }
                c14983af.m87618a(notificationChannel);
                c = 1;
                iM87553a = 0;
            } else if (!m87564a(contextM87612a, id) && m87563a(notificationChannel, notificationChannelM87611a)) {
                if (z2) {
                    m87562a("appHack updateNotificationChannel:" + notificationChannel);
                }
                iM87553a = m87553a(notificationChannelM87611a);
                c14983af.m87619a(notificationChannel, iM87553a == 0);
                c = 2;
            }
            if (c != 1 || c == 4 || c == 3) {
                z = true;
            } else {
                z = false;
            }
            C15012f.m87817a(c14983af.m87612a(), c14983af.m87613a(), id, notificationChannel.getImportance(), str, z, iM87553a);
        }
        NotificationChannel notificationChannelM87611a2 = c14983af.m87611a(id);
        if (z2) {
            m87562a("elseLogic getNotificationChannel:" + notificationChannelM87611a2);
        }
        if (notificationChannelM87611a2 == null) {
            c14983af.m87618a(notificationChannel);
        }
        iM87553a = 0;
        c = 0;
        if (c != 1) {
            z = true;
        } else {
            z = true;
        }
        C15012f.m87817a(c14983af.m87612a(), c14983af.m87613a(), id, notificationChannel.getImportance(), str, z, iM87553a);
    }

    /* JADX INFO: renamed from: b */
    private static void m87565b(Context context, String str) {
        if (f63679a) {
            m87562a("recordCopiedChannel:" + str);
        }
        m87555a(context).edit().putBoolean(str, true).apply();
    }

    /* JADX INFO: renamed from: c */
    private static void m87566c(Context context, String str) {
        try {
            C14983af c14983afM87599a = C14983af.m87599a(context, str);
            Set<String> setKeySet = m87555a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                if (c14983afM87599a.m87620a(str2)) {
                    arrayList.add(str2);
                    if (f63679a) {
                        m87562a("delete channel copy record:" + str2);
                    }
                }
            }
            m87559a(context, arrayList);
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static boolean m87563a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z2 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z = false;
        } else {
            if (f63679a) {
                m87562a("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f63679a) {
                m87562a("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f63679a) {
                m87562a("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + notificationChannel2.getImportance());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f63679a) {
                m87562a("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f63679a) {
                m87562a("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (f63679a) {
                m87562a("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z2 = z;
        }
        if (f63679a) {
            m87562a("appHack channelConfigLowerCompare:isDifferent:" + z2);
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    private static int m87553a(NotificationChannel notificationChannel) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) otq0.m169176n(notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (!f63679a) {
                return iIntValue;
            }
            m87562a("isUserLockedChannel:" + iIntValue + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + notificationChannel);
            return iIntValue;
        } catch (Exception e) {
            ouq0.m169394n("NCHelper", "is user locked error" + e);
            return iIntValue;
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    private static NotificationChannel m87554a(String str, NotificationChannel notificationChannel) {
        hx3.m137557a();
        NotificationChannel notificationChannelM142608a = iy40.m142608a(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannelM142608a.setDescription(notificationChannel.getDescription());
        notificationChannelM142608a.enableVibration(notificationChannel.shouldVibrate());
        notificationChannelM142608a.enableLights(notificationChannel.shouldShowLights());
        notificationChannelM142608a.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannelM142608a.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannelM142608a;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m87564a(Context context, String str) {
        if (f63679a) {
            m87562a("checkCopeidChannel:newFullChannelId:" + str + "  " + m87555a(context).getBoolean(str, false));
        }
        return m87555a(context).getBoolean(str, false);
    }

    /* JADX INFO: renamed from: a */
    private static void m87559a(Context context, List<String> list) {
        if (f63679a) {
            m87562a("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = m87555a(context).edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    private static SharedPreferences m87555a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public static String m87556a(C14983af c14983af, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String strM87614a = c14983af.m87614a(str);
        boolean z = f63679a;
        if (z) {
            m87562a("createChannel: appChannelId:" + strM87614a + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannelM142608a = iy40.m142608a(strM87614a, charSequence, i2);
        notificationChannelM142608a.setDescription(str2);
        notificationChannelM142608a.enableVibration((i & 2) != 0);
        notificationChannelM142608a.enableLights((i & 4) != 0);
        if ((i & 1) == 0) {
            notificationChannelM142608a.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + c14983af.m87613a())) {
                notificationChannelM142608a.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z) {
            m87562a("create channel:" + notificationChannelM142608a);
        }
        m87561a(c14983af, notificationChannelM142608a, str4);
        return strM87614a;
    }

    /* JADX INFO: renamed from: a */
    private static void m87562a(String str) {
        ouq0.m169394n("NCHelper", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m87558a(Context context, String str) {
        if (!l4r0.m152825j(context) || TextUtils.isEmpty(str)) {
            return;
        }
        m87566c(context, str);
        C15012f.m87816a(context, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m87560a(C14901gs c14901gs) {
        Map<String, String> map;
        if (c14901gs == null || (map = c14901gs.f63030a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        c14901gs.f63026a = 0;
        c14901gs.f63030a.remove("channel_id");
        c14901gs.f63030a.remove("channel_importance");
        c14901gs.f63030a.remove("channel_name");
        c14901gs.f63030a.remove("channel_description");
        c14901gs.f63030a.remove("channel_perm");
        ouq0.m169393m("delete channel info by:" + c14901gs.f63030a.get("REMOVE_CHANNEL_MARK"));
        c14901gs.f63030a.remove("REMOVE_CHANNEL_MARK");
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    /* JADX INFO: renamed from: a */
    public static void m87557a(Context context, C14983af c14983af, NotificationChannel notificationChannel, int i, String str) {
        if (i > 0) {
            int iM87812a = C14887g.m86752a(context) >= 2 ? C15012f.m87812a(context.getPackageName(), str) : 0;
            NotificationChannel notificationChannelM87554a = m87554a(notificationChannel.getId(), notificationChannel);
            if ((i & 32) != 0) {
                if (notificationChannel.getSound() != null) {
                    notificationChannelM87554a.setSound(null, null);
                } else {
                    notificationChannelM87554a.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
            if ((i & 16) != 0) {
                if (notificationChannel.shouldVibrate()) {
                    notificationChannelM87554a.enableVibration(false);
                } else {
                    notificationChannelM87554a.enableVibration(true);
                }
            }
            if ((i & 8) != 0) {
                if (notificationChannel.shouldShowLights()) {
                    notificationChannelM87554a.enableLights(false);
                } else {
                    notificationChannelM87554a.enableLights(true);
                }
            }
            if ((i & 4) != 0) {
                int importance = notificationChannel.getImportance() - 1;
                if (importance <= 0) {
                    importance = 2;
                }
                notificationChannelM87554a.setImportance(importance);
            }
            if ((i & 2) != 0) {
                notificationChannelM87554a.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
            }
            c14983af.m87618a(notificationChannelM87554a);
            c14983af.m87619a(notificationChannel, true);
            C15012f.m87822a(c14983af.m87613a(), notificationChannel.getId(), iM87812a, 0);
            return;
        }
        c14983af.m87618a(notificationChannel);
    }
}
