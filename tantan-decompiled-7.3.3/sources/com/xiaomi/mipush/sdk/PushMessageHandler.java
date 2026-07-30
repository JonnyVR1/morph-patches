package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14880ed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.fwq0;
import p153l.ouq0;
import p153l.qmb0;
import p153l.t5r0;
import p153l.tzq0;

/* JADX INFO: loaded from: classes2.dex */
public class PushMessageHandler extends BaseService {

    /* JADX INFO: renamed from: a */
    private static List<MiPushClient.InterfaceC14855h> f62393a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static List<MiPushClient.AbstractC14856i> f62395b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f62394a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$a */
    public interface InterfaceC14863a extends Serializable {
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$b */
    public static class RunnableC14864b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f62396a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Intent f62397b;

        public RunnableC14864b(Context context, Intent intent) {
            this.f62396a = context;
            this.f62397b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushMessageHandler.m86472b(this.f62396a, this.f62397b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86464a(Context context, InterfaceC14863a interfaceC14863a) {
        if (interfaceC14863a instanceof MiPushMessage) {
            m86463a(context, (MiPushMessage) interfaceC14863a);
            return;
        }
        if (interfaceC14863a instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) interfaceC14863a;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (EnumC14880ed.COMMAND_REGISTER.f62514a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m86458a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (EnumC14880ed.COMMAND_SET_ALIAS.f62514a.equals(command) || EnumC14880ed.COMMAND_UNSET_ALIAS.f62514a.equals(command) || EnumC14880ed.COMMAND_SET_ACCEPT_TIME.f62514a.equals(command)) {
                m86466a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
                return;
            }
            if (EnumC14880ed.COMMAND_SUBSCRIBE_TOPIC.f62514a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                m86465a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (EnumC14880ed.COMMAND_UNSUBSCRIBE_TOPIC.f62514a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                m86473b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86472b(Context context, Intent intent) {
        ResolveInfo next;
        boolean booleanExtra = false;
        try {
            booleanExtra = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            ouq0.m169394n("PushMessageHandler", "intent unparcel error:" + th);
        }
        try {
            ouq0.m169396p("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                C14892gj c14892gj = new C14892gj();
                C14936m.m87447d(c14892gj, intent.getByteArrayExtra("mipush_payload"));
                ouq0.m169404x("PushMessageHandler", "PushMessageHandler.onHandleIntent " + c14892gj.m86804d());
                C14866b.m86480a(context, c14892gj);
            } else {
                if (1 == qmb0.m177073c(context)) {
                    if (m86474b()) {
                        ouq0.m169377A("PushMessageHandler", "receive a message before application calling initialize");
                        if (!booleanExtra) {
                            return;
                        }
                    } else {
                        InterfaceC14863a interfaceC14863aM86549b = C14869e.m86537e(context).m86549b(intent);
                        if (interfaceC14863aM86549b != null) {
                            m86464a(context, interfaceC14863aM86549b);
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
                            if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(t5r0.m189419c(context, next.activityInfo.name))) {
                                break;
                            }
                        }
                        if (next != null) {
                            m86461a(context, intent2, next, booleanExtra);
                        } else {
                            ouq0.m169377A("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                            tzq0.m193695a(context).m193699d(context.getPackageName(), intent, Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
                        }
                    } catch (Exception e) {
                        ouq0.m169395o("PushMessageHandler", e);
                        tzq0.m193695a(context).m193699d(context.getPackageName(), intent, Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
                    }
                }
            }
            if (!booleanExtra) {
            }
        } catch (Throwable th2) {
            try {
                ouq0.m169395o("PushMessageHandler", th2);
                tzq0.m193695a(context).m193699d(context.getPackageName(), intent, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
            } finally {
                if (booleanExtra) {
                    m86471b(context);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m86475c(Context context, Intent intent) {
        if (intent == null || f62394a.isShutdown()) {
            ouq0.m169379C("PushMessageHandler", "-->scheduleJob() fail, case".concat(intent == null ? "0" : "1"));
        } else {
            f62394a.execute(new RunnableC14864b(context, intent));
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        m86475c(getApplicationContext(), intent);
    }

    /* JADX INFO: renamed from: a */
    public static void m86460a(Context context, Intent intent) {
        ouq0.m169404x("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            m86475c(context, intent);
            m86459a(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86468a(MiPushClient.AbstractC14856i abstractC14856i) {
        synchronized (f62395b) {
            try {
                if (!f62395b.contains(abstractC14856i)) {
                    f62395b.add(abstractC14856i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86467a(MiPushClient.InterfaceC14855h interfaceC14855h) {
        synchronized (f62393a) {
            try {
                if (!f62393a.contains(interfaceC14855h)) {
                    f62393a.add(interfaceC14855h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86457a() {
        synchronized (f62395b) {
            f62395b.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m86461a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.C14847c c14847c = new MessageHandleService.C14847c(intent, (PushMessageReceiver) t5r0.m189419c(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.m86437a(context.getApplicationContext(), c14847c);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), c14847c);
            }
            MessageHandleService.m86436a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th) {
            ouq0.m169397q(th);
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a */
    public boolean mo86433a() {
        ThreadPoolExecutor threadPoolExecutor = f62394a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f62394a.getQueue().size() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static void m86459a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            ouq0.m169394n("PushMessageHandler", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86463a(Context context, MiPushMessage miPushMessage) {
        synchronized (f62395b) {
            try {
                for (MiPushClient.AbstractC14856i abstractC14856i : f62395b) {
                    if (m86469a(miPushMessage.getCategory(), abstractC14856i.m86445a())) {
                        abstractC14856i.m86449e(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                        abstractC14856i.m86448d(miPushMessage);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86458a(long j, String str, String str2) {
        synchronized (f62395b) {
            try {
                Iterator<MiPushClient.AbstractC14856i> it = f62395b.iterator();
                while (it.hasNext()) {
                    it.next().m86447c(j, str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86465a(Context context, String str, long j, String str2, String str3) {
        synchronized (f62395b) {
            try {
                for (MiPushClient.AbstractC14856i abstractC14856i : f62395b) {
                    if (m86469a(str, abstractC14856i.m86445a())) {
                        abstractC14856i.m86450f(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86466a(Context context, String str, String str2, long j, String str3, List<String> list) {
        String str4;
        long j2;
        String str5;
        List<String> list2;
        synchronized (f62395b) {
            try {
                for (MiPushClient.AbstractC14856i abstractC14856i : f62395b) {
                    if (m86469a(str, abstractC14856i.m86445a())) {
                        str4 = str2;
                        j2 = j;
                        str5 = str3;
                        list2 = list;
                        abstractC14856i.m86446b(str4, j2, str5, list2);
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
    public static boolean m86469a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m86462a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f62393a) {
            try {
                for (MiPushClient.InterfaceC14855h interfaceC14855h : f62393a) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86470b() {
        synchronized (f62393a) {
            f62393a.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m86471b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, fwq0.m127842a(context));
        } catch (Exception e) {
            ouq0.m169394n("PushMessageHandler", "callback sync error" + e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m86474b() {
        return f62395b.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public static void m86473b(Context context, String str, long j, String str2, String str3) {
        synchronized (f62395b) {
            try {
                for (MiPushClient.AbstractC14856i abstractC14856i : f62395b) {
                    if (m86469a(str, abstractC14856i.m86445a())) {
                        abstractC14856i.m86451g(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
