package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14732ed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.ilq0;
import p149l.meb0;
import p149l.nqq0;
import p149l.nwq0;
import p149l.zmq0;

/* JADX INFO: loaded from: classes2.dex */
public class PushMessageHandler extends BaseService {

    /* JADX INFO: renamed from: a */
    private static List<MiPushClient.InterfaceC14707h> f61546a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static List<MiPushClient.AbstractC14708i> f61548b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f61547a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$a */
    public interface InterfaceC14715a extends Serializable {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$b */
    public static class RunnableC14716b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f61549a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Intent f61550b;

        public RunnableC14716b(Context context, Intent intent) {
            this.f61549a = context;
            this.f61550b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushMessageHandler.m85301b(this.f61549a, this.f61550b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85293a(Context context, InterfaceC14715a interfaceC14715a) {
        if (interfaceC14715a instanceof MiPushMessage) {
            m85292a(context, (MiPushMessage) interfaceC14715a);
            return;
        }
        if (interfaceC14715a instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) interfaceC14715a;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (EnumC14732ed.COMMAND_REGISTER.f61667a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m85287a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (EnumC14732ed.COMMAND_SET_ALIAS.f61667a.equals(command) || EnumC14732ed.COMMAND_UNSET_ALIAS.f61667a.equals(command) || EnumC14732ed.COMMAND_SET_ACCEPT_TIME.f61667a.equals(command)) {
                m85295a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
                return;
            }
            if (EnumC14732ed.COMMAND_SUBSCRIBE_TOPIC.f61667a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                m85294a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (EnumC14732ed.COMMAND_UNSUBSCRIBE_TOPIC.f61667a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                m85302b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85301b(Context context, Intent intent) {
        ResolveInfo next;
        boolean booleanExtra = false;
        try {
            booleanExtra = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            ilq0.m137041n("PushMessageHandler", "intent unparcel error:" + th);
        }
        try {
            ilq0.m137043p("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                C14744gj c14744gj = new C14744gj();
                C14788m.m86276d(c14744gj, intent.getByteArrayExtra("mipush_payload"));
                ilq0.m137051x("PushMessageHandler", "PushMessageHandler.onHandleIntent " + c14744gj.m85633d());
                C14718b.m85309a(context, c14744gj);
            } else {
                if (1 == meb0.m154172c(context)) {
                    if (m85303b()) {
                        ilq0.m137024A("PushMessageHandler", "receive a message before application calling initialize");
                        if (!booleanExtra) {
                            return;
                        }
                    } else {
                        InterfaceC14715a interfaceC14715aM85378b = C14721e.m85366e(context).m85378b(intent);
                        if (interfaceC14715aM85378b != null) {
                            m85293a(context, interfaceC14715aM85378b);
                        }
                    }
                }
                if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                    Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                    intent2.setPackage(context.getPackageName());
                    intent2.putExtras(intent);
                    try {
                        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                        if (listQueryBroadcastReceivers == null) {
                            next = null;
                            break;
                        }
                        Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            ActivityInfo activityInfo = next.activityInfo;
                            if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(nwq0.m161880c(context, next.activityInfo.name))) {
                                break;
                            }
                        }
                        if (next != null) {
                            m85290a(context, intent2, next, booleanExtra);
                        } else {
                            ilq0.m137024A("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                            nqq0.m160662a(context).m160666d(context.getPackageName(), intent, Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
                        }
                    } catch (Exception e) {
                        ilq0.m137042o("PushMessageHandler", e);
                        nqq0.m160662a(context).m160666d(context.getPackageName(), intent, Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
                    }
                }
            }
            if (!booleanExtra) {
            }
        } catch (Throwable th2) {
            try {
                ilq0.m137042o("PushMessageHandler", th2);
                nqq0.m160662a(context).m160666d(context.getPackageName(), intent, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
            } finally {
                if (booleanExtra) {
                    m85300b(context);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m85304c(Context context, Intent intent) {
        if (intent == null || f61547a.isShutdown()) {
            ilq0.m137026C("PushMessageHandler", "-->scheduleJob() fail, case".concat(intent == null ? "0" : "1"));
        } else {
            f61547a.execute(new RunnableC14716b(context, intent));
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        m85304c(getApplicationContext(), intent);
    }

    /* JADX INFO: renamed from: a */
    public static void m85289a(Context context, Intent intent) {
        ilq0.m137051x("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            m85304c(context, intent);
            m85288a(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85297a(MiPushClient.AbstractC14708i abstractC14708i) {
        synchronized (f61548b) {
            try {
                if (!f61548b.contains(abstractC14708i)) {
                    f61548b.add(abstractC14708i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85296a(MiPushClient.InterfaceC14707h interfaceC14707h) {
        synchronized (f61546a) {
            try {
                if (!f61546a.contains(interfaceC14707h)) {
                    f61546a.add(interfaceC14707h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85286a() {
        synchronized (f61548b) {
            f61548b.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m85290a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.C14699c c14699c = new MessageHandleService.C14699c(intent, (PushMessageReceiver) nwq0.m161880c(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.m85266a(context.getApplicationContext(), c14699c);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), c14699c);
            }
            MessageHandleService.m85265a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th) {
            ilq0.m137044q(th);
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a */
    public boolean mo85262a() {
        ThreadPoolExecutor threadPoolExecutor = f61547a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f61547a.getQueue().size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static void m85288a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            ilq0.m137041n("PushMessageHandler", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85292a(Context context, MiPushMessage miPushMessage) {
        synchronized (f61548b) {
            try {
                for (MiPushClient.AbstractC14708i abstractC14708i : f61548b) {
                    if (m85298a(miPushMessage.getCategory(), abstractC14708i.m85274a())) {
                        abstractC14708i.m85278e(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                        abstractC14708i.m85277d(miPushMessage);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85287a(long j, String str, String str2) {
        synchronized (f61548b) {
            try {
                Iterator<MiPushClient.AbstractC14708i> it = f61548b.iterator();
                while (it.hasNext()) {
                    it.next().m85276c(j, str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85294a(Context context, String str, long j, String str2, String str3) {
        synchronized (f61548b) {
            try {
                for (MiPushClient.AbstractC14708i abstractC14708i : f61548b) {
                    if (m85298a(str, abstractC14708i.m85274a())) {
                        abstractC14708i.m85279f(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85295a(Context context, String str, String str2, long j, String str3, List<String> list) {
        String str4;
        long j2;
        String str5;
        List<String> list2;
        synchronized (f61548b) {
            try {
                for (MiPushClient.AbstractC14708i abstractC14708i : f61548b) {
                    if (m85298a(str, abstractC14708i.m85274a())) {
                        str4 = str2;
                        j2 = j;
                        str5 = str3;
                        list2 = list;
                        abstractC14708i.m85275b(str4, j2, str5, list2);
                    } else {
                        str4 = str2;
                        j2 = j;
                        str5 = str3;
                        list2 = list;
                    }
                    str2 = str4;
                    j = j2;
                    str3 = str5;
                    list = list2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85298a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m85291a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f61546a) {
            try {
                for (MiPushClient.InterfaceC14707h interfaceC14707h : f61546a) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85299b() {
        synchronized (f61546a) {
            f61546a.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m85300b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, zmq0.m219366a(context));
        } catch (Exception e) {
            ilq0.m137041n("PushMessageHandler", "callback sync error" + e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85303b() {
        return f61548b.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public static void m85302b(Context context, String str, long j, String str2, String str3) {
        synchronized (f61548b) {
            try {
                for (MiPushClient.AbstractC14708i abstractC14708i : f61548b) {
                    if (m85298a(str, abstractC14708i.m85274a())) {
                        abstractC14708i.m85280g(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
