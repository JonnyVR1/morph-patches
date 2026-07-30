package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.xiaomi.push.EnumC14732ed;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.hsq0;
import p149l.ilq0;
import p149l.njq0;
import p149l.nqq0;

/* JADX INFO: loaded from: classes2.dex */
public class MessageHandleService extends BaseService {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<C14699c> f61524a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    private static ExecutorService f61525a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$a */
    public static class RunnableC14697a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f61526a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Intent f61527b;

        public RunnableC14697a(Context context, Intent intent) {
            this.f61526a = context;
            this.f61527b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f61526a.startService(this.f61527b);
            } catch (Exception e) {
                ilq0.m137040m(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$b */
    public static class RunnableC14698b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f61528a;

        public RunnableC14698b(Context context) {
            this.f61528a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageHandleService.m85268c(this.f61528a);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$c */
    public static class C14699c {

        /* JADX INFO: renamed from: a */
        private PushMessageReceiver f61529a;

        /* JADX INFO: renamed from: b */
        private Intent f61530b;

        public C14699c(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f61529a = pushMessageReceiver;
            this.f61530b = intent;
        }

        /* JADX INFO: renamed from: a */
        public Intent m85269a() {
            return this.f61530b;
        }

        /* JADX INFO: renamed from: b */
        public PushMessageReceiver m85270b() {
            return this.f61529a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m85266a(Context context, C14699c c14699c) {
        String[] stringArrayExtra;
        if (c14699c == null) {
            return;
        }
        try {
            PushMessageReceiver pushMessageReceiverM85270b = c14699c.m85270b();
            Intent intentM85269a = c14699c.m85269a();
            int intExtra = intentM85269a.getIntExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE, 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && "error_lack_of_permission".equals(intentM85269a.getStringExtra("error_type")) && (stringArrayExtra = intentM85269a.getStringArrayExtra("error_message")) != null) {
                        ilq0.m137027D("begin execute onRequirePermissions, lack of necessary permissions");
                        pushMessageReceiverM85270b.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) intentM85269a.getSerializableExtra("key_command");
                ilq0.m137027D("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                pushMessageReceiverM85270b.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), EnumC14732ed.COMMAND_REGISTER.f61667a)) {
                    pushMessageReceiverM85270b.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.m85291a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        hsq0.m132798l(context);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.InterfaceC14715a interfaceC14715aM85378b = C14721e.m85366e(context).m85378b(intentM85269a);
            int intExtra2 = intentM85269a.getIntExtra("eventMessageType", -1);
            if (interfaceC14715aM85378b == null) {
                ilq0.m137026C("MessageHandleService", "no message from raw for receiver");
                return;
            }
            if (!(interfaceC14715aM85378b instanceof MiPushMessage)) {
                if (!(interfaceC14715aM85378b instanceof MiPushCommandMessage)) {
                    ilq0.m137026C("MessageHandleService", "unknown raw message: " + interfaceC14715aM85378b);
                    return;
                }
                MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) interfaceC14715aM85378b;
                ilq0.m137026C("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                pushMessageReceiverM85270b.onCommandResult(context, miPushCommandMessage2);
                if (TextUtils.equals(miPushCommandMessage2.getCommand(), EnumC14732ed.COMMAND_REGISTER.f61667a)) {
                    pushMessageReceiverM85270b.onReceiveRegisterResult(context, miPushCommandMessage2);
                    PushMessageHandler.m85291a(context, miPushCommandMessage2);
                    if (miPushCommandMessage2.getResultCode() == 0) {
                        hsq0.m132798l(context);
                        return;
                    }
                    return;
                }
                return;
            }
            MiPushMessage miPushMessage = (MiPushMessage) interfaceC14715aM85378b;
            if (!miPushMessage.isArrivedMessage()) {
                pushMessageReceiverM85270b.onReceiveMessage(context, miPushMessage);
            }
            if (miPushMessage.getPassThrough() == 1) {
                nqq0.m160662a(context.getApplicationContext()).m160665c(context.getPackageName(), intentM85269a, 2004, null);
                ilq0.m137026C("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                pushMessageReceiverM85270b.onReceivePassThroughMessage(context, miPushMessage);
                return;
            }
            if (!miPushMessage.isNotified()) {
                ilq0.m137026C("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                pushMessageReceiverM85270b.onNotificationMessageArrived(context, miPushMessage);
                return;
            }
            if (intExtra2 == 1000) {
                nqq0.m160662a(context.getApplicationContext()).m160665c(context.getPackageName(), intentM85269a, 1007, null);
            } else {
                nqq0.m160662a(context.getApplicationContext()).m160665c(context.getPackageName(), intentM85269a, 3007, null);
            }
            ilq0.m137026C("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
            pushMessageReceiverM85270b.onNotificationMessageClicked(context, miPushMessage);
        } catch (RuntimeException e) {
            ilq0.m137042o("MessageHandleService", e);
        }
    }

    public static void addJob(Context context, C14699c c14699c) {
        if (c14699c != null) {
            f61524a.add(c14699c);
            m85267b(context);
            startService(context);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m85267b(Context context) {
        if (f61525a.isShutdown()) {
            return;
        }
        f61525a.execute(new RunnableC14698b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m85268c(Context context) {
        try {
            m85266a(context, f61524a.poll());
        } catch (RuntimeException e) {
            ilq0.m137044q(e);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        njq0.m159772f(context).m159773g(new RunnableC14697a(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m85265a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m85267b(context);
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a */
    public boolean mo85262a() {
        ConcurrentLinkedQueue<C14699c> concurrentLinkedQueue = f61524a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }
}
