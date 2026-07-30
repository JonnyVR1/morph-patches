package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.C14756e;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14797r;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;

/* JADX INFO: loaded from: classes2.dex */
public class PushServiceReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static HandlerThread f61923a;

    /* JADX INFO: renamed from: b */
    private static Handler f61924b;

    /* JADX INFO: renamed from: c */
    private static RunnableC14772a f61925c = new RunnableC14772a();

    /* JADX INFO: renamed from: com.vivo.push.sdk.PushServiceReceiver$a */
    public static class RunnableC14772a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Context f61926a;

        /* JADX INFO: renamed from: b */
        private String f61927b;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m86111a(RunnableC14772a runnableC14772a, Context context, String str) {
            runnableC14772a.f61926a = ContextDelegate.getContext(context);
            runnableC14772a.f61927b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkInfo networkInfoM86197a = C14797r.m86197a(this.f61926a);
            boolean zIsConnectedOrConnecting = networkInfoM86197a != null ? networkInfoM86197a.isConnectedOrConnecting() : false;
            Context context = this.f61926a;
            if (!zIsConnectedOrConnecting) {
                C14795p.m86192d("PushServiceReceiver", context.getPackageName() + ": 无网络  by " + this.f61927b);
                C14795p.m86183a(this.f61926a, "触发静态广播:无网络(" + this.f61927b + Constants.SEPARATOR_COMMA + this.f61926a.getPackageName() + ")");
                return;
            }
            C14795p.m86192d("PushServiceReceiver", context.getPackageName() + ": 执行开始出发动作: " + this.f61927b);
            C14795p.m86183a(this.f61926a, "触发静态广播(" + this.f61927b + Constants.SEPARATOR_COMMA + this.f61926a.getPackageName() + ")");
            C14756e.m86032a().m86046a(this.f61926a);
            if (ClientConfigManagerImpl.getInstance(this.f61926a).isCancleBroadcastReceiver()) {
                return;
            }
            try {
                PushClient.getInstance(this.f61926a).initialize();
            } catch (VivoPushException e) {
                e.printStackTrace();
                C14795p.m86183a(this.f61926a, " 初始化异常 error= " + e.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2 = ContextDelegate.getContext(context);
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f61923a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f61923a = handlerThread;
                handlerThread.start();
                f61924b = new Handler(f61923a.getLooper());
            }
            C14795p.m86192d("PushServiceReceiver", context2.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + f61924b);
            RunnableC14772a.m86111a(f61925c, context2, action);
            f61924b.removeCallbacks(f61925c);
            f61924b.postDelayed(f61925c, 2000L);
        }
    }
}
