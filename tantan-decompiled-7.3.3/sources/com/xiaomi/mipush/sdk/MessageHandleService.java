package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.xiaomi.push.EnumC14880ed;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p153l.n1r0;
import p153l.ouq0;
import p153l.tsq0;
import p153l.tzq0;

/* JADX INFO: loaded from: classes2.dex */
public class MessageHandleService extends BaseService {

    /* JADX INFO: renamed from: a */
    private static ConcurrentLinkedQueue<C14847c> f62371a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    private static ExecutorService f62372a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$a */
    public static class RunnableC14845a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f62373a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Intent f62374b;

        public RunnableC14845a(Context context, Intent intent) {
            this.f62373a = context;
            this.f62374b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f62373a.startService(this.f62374b);
            } catch (Exception e) {
                ouq0.m169393m(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$b */
    public static class RunnableC14846b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f62375a;

        public RunnableC14846b(Context context) {
            this.f62375a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageHandleService.m86439c(this.f62375a);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.MessageHandleService$c */
    public static class C14847c {

        /* JADX INFO: renamed from: a */
        private PushMessageReceiver f62376a;

        /* JADX INFO: renamed from: b */
        private Intent f62377b;

        public C14847c(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f62376a = pushMessageReceiver;
            this.f62377b = intent;
        }

        /* JADX INFO: renamed from: a */
        public Intent m86440a() {
            return this.f62377b;
        }

        /* JADX INFO: renamed from: b */
        public PushMessageReceiver m86441b() {
            return this.f62376a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86437a(Context context, C14847c c14847c) {
        String[] stringArrayExtra;
        if (c14847c == null) {
            return;
        }
        try {
            PushMessageReceiver pushMessageReceiverM86441b = c14847c.m86441b();
            Intent intentM86440a = c14847c.m86440a();
            int intExtra = intentM86440a.getIntExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE, 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && "error_lack_of_permission".equals(intentM86440a.getStringExtra("error_type")) && (stringArrayExtra = intentM86440a.getStringArrayExtra("error_message")) != null) {
                        ouq0.m169380D("begin execute onRequirePermissions, lack of necessary permissions");
                        pushMessageReceiverM86441b.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) intentM86440a.getSerializableExtra("key_command");
                ouq0.m169380D("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                pushMessageReceiverM86441b.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), EnumC14880ed.COMMAND_REGISTER.f62514a)) {
                    pushMessageReceiverM86441b.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.m86462a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        n1r0.m161140l(context);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.InterfaceC14863a interfaceC14863aM86549b = C14869e.m86537e(context).m86549b(intentM86440a);
            int intExtra2 = intentM86440a.getIntExtra("eventMessageType", -1);
            if (interfaceC14863aM86549b == null) {
                ouq0.m169379C("MessageHandleService", "no message from raw for receiver");
                return;
            }
            if (!(interfaceC14863aM86549b instanceof MiPushMessage)) {
                if (!(interfaceC14863aM86549b instanceof MiPushCommandMessage)) {
                    ouq0.m169379C("MessageHandleService", "unknown raw message: " + interfaceC14863aM86549b);
                    return;
                }
                MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) interfaceC14863aM86549b;
                ouq0.m169379C("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                pushMessageReceiverM86441b.onCommandResult(context, miPushCommandMessage2);
                if (TextUtils.equals(miPushCommandMessage2.getCommand(), EnumC14880ed.COMMAND_REGISTER.f62514a)) {
                    pushMessageReceiverM86441b.onReceiveRegisterResult(context, miPushCommandMessage2);
                    PushMessageHandler.m86462a(context, miPushCommandMessage2);
                    if (miPushCommandMessage2.getResultCode() == 0) {
                        n1r0.m161140l(context);
                        return;
                    }
                    return;
                }
                return;
            }
            MiPushMessage miPushMessage = (MiPushMessage) interfaceC14863aM86549b;
            if (!miPushMessage.isArrivedMessage()) {
                pushMessageReceiverM86441b.onReceiveMessage(context, miPushMessage);
            }
            if (miPushMessage.getPassThrough() == 1) {
                tzq0.m193695a(context.getApplicationContext()).m193698c(context.getPackageName(), intentM86440a, 2004, null);
                ouq0.m169379C("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                pushMessageReceiverM86441b.onReceivePassThroughMessage(context, miPushMessage);
                return;
            }
            if (!miPushMessage.isNotified()) {
                ouq0.m169379C("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                pushMessageReceiverM86441b.onNotificationMessageArrived(context, miPushMessage);
                return;
            }
            if (intExtra2 == 1000) {
                tzq0.m193695a(context.getApplicationContext()).m193698c(context.getPackageName(), intentM86440a, 1007, null);
            } else {
                tzq0.m193695a(context.getApplicationContext()).m193698c(context.getPackageName(), intentM86440a, 3007, null);
            }
            ouq0.m169379C("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
            pushMessageReceiverM86441b.onNotificationMessageClicked(context, miPushMessage);
        } catch (RuntimeException e) {
            ouq0.m169395o("MessageHandleService", e);
        }
    }

    public static void addJob(Context context, C14847c c14847c) {
        if (c14847c != null) {
            f62371a.add(c14847c);
            m86438b(context);
            startService(context);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m86438b(Context context) {
        if (f62372a.isShutdown()) {
            return;
        }
        f62372a.execute(new RunnableC14846b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static void m86439c(Context context) {
        try {
            m86437a(context, f62371a.poll());
        } catch (RuntimeException e) {
            ouq0.m169397q(e);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        tsq0.m192627f(context).m192628g(new RunnableC14845a(context, intent));
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
    public static void m86436a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m86438b(context);
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a */
    public boolean mo86433a() {
        ConcurrentLinkedQueue<C14847c> concurrentLinkedQueue = f62371a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }
}
