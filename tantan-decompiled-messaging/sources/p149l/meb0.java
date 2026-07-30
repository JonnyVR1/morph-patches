package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushServiceReceiver;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14770hi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class meb0 {

    /* JADX INFO: renamed from: a */
    private static int f133387a;

    /* JADX INFO: renamed from: a */
    public static MiPushCommandMessage m154170a(String str, List<String> list, long j, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    /* JADX INFO: renamed from: b */
    public static MiPushMessage m154171b(C14770hi c14770hi, C14753gs c14753gs, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(c14770hi.m86081a());
        if (!TextUtils.isEmpty(c14770hi.m86090d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(c14770hi.m86090d());
        } else if (!TextUtils.isEmpty(c14770hi.m86088c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(c14770hi.m86088c());
        } else if (TextUtils.isEmpty(c14770hi.m86094f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(c14770hi.m86094f());
        }
        miPushMessage.setCategory(c14770hi.m86092e());
        if (c14770hi.m86080a() != null) {
            miPushMessage.setContent(c14770hi.m86080a().m85702c());
        }
        if (c14753gs != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(c14753gs.m85728a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(c14753gs.m85738b());
            }
            miPushMessage.setDescription(c14753gs.m85750d());
            miPushMessage.setTitle(c14753gs.m85746c());
            miPushMessage.setNotifyType(c14753gs.m85721a());
            miPushMessage.setNotifyId(c14753gs.m85743c());
            miPushMessage.setPassThrough(c14753gs.m85735b());
            miPushMessage.setExtra(c14753gs.m85729a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    /* JADX INFO: renamed from: c */
    public static int m154172c(Context context) {
        if (f133387a == 0) {
            if (m154174e(context)) {
                m154176g(1);
            } else {
                m154176g(2);
            }
        }
        return f133387a;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m154173d(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m154174e(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return m154173d(context, intent);
    }

    /* JADX INFO: renamed from: f */
    public static void m154175f(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE, 3);
        intent.putExtra("key_command", miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    /* JADX INFO: renamed from: g */
    private static void m154176g(int i) {
        f133387a = i;
    }
}
