package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushServiceReceiver;
import com.xiaomi.push.C14901gs;
import com.xiaomi.push.C14918hi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qmb0 {

    /* JADX INFO: renamed from: a */
    private static int f158311a;

    /* JADX INFO: renamed from: a */
    public static MiPushCommandMessage m177071a(String str, List<String> list, long j, String str2, String str3, List<String> list2) {
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
    public static MiPushMessage m177072b(C14918hi c14918hi, C14901gs c14901gs, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(c14918hi.m87252a());
        if (!TextUtils.isEmpty(c14918hi.m87261d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(c14918hi.m87261d());
        } else if (!TextUtils.isEmpty(c14918hi.m87259c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(c14918hi.m87259c());
        } else if (TextUtils.isEmpty(c14918hi.m87265f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(c14918hi.m87265f());
        }
        miPushMessage.setCategory(c14918hi.m87263e());
        if (c14918hi.m87251a() != null) {
            miPushMessage.setContent(c14918hi.m87251a().m86873c());
        }
        if (c14901gs != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(c14901gs.m86899a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(c14901gs.m86909b());
            }
            miPushMessage.setDescription(c14901gs.m86921d());
            miPushMessage.setTitle(c14901gs.m86917c());
            miPushMessage.setNotifyType(c14901gs.m86892a());
            miPushMessage.setNotifyId(c14901gs.m86914c());
            miPushMessage.setPassThrough(c14901gs.m86906b());
            miPushMessage.setExtra(c14901gs.m86900a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    /* JADX INFO: renamed from: c */
    public static int m177073c(Context context) {
        if (f158311a == 0) {
            if (m177075e(context)) {
                m177077g(1);
            } else {
                m177077g(2);
            }
        }
        return f158311a;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m177074d(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m177075e(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return m177074d(context, intent);
    }

    /* JADX INFO: renamed from: f */
    public static void m177076f(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE, 3);
        intent.putExtra("key_command", miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    /* JADX INFO: renamed from: g */
    private static void m177077g(int i) {
        f158311a = i;
    }
}
