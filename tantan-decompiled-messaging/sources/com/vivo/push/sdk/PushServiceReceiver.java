package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.C14608e;
import com.vivo.push.PushClient;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14649r;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.VivoPushException;

/* JADX INFO: loaded from: classes2.dex */
public class PushServiceReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static HandlerThread f61076a;

    /* JADX INFO: renamed from: b */
    private static Handler f61077b;

    /* JADX INFO: renamed from: c */
    private static RunnableC14624a f61078c = new RunnableC14624a();

    /* JADX INFO: renamed from: com.vivo.push.sdk.PushServiceReceiver$a */
    public static class RunnableC14624a implements Runnable {

        /* JADX INFO: renamed from: a */
        private Context f61079a;

        /* JADX INFO: renamed from: b */
        private String f61080b;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m84940a(RunnableC14624a runnableC14624a, Context context, String str) {
            runnableC14624a.f61079a = ContextDelegate.getContext(context);
            runnableC14624a.f61080b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            NetworkInfo networkInfoM85026a = C14649r.m85026a(this.f61079a);
            boolean zIsConnectedOrConnecting = networkInfoM85026a != null ? networkInfoM85026a.isConnectedOrConnecting() : false;
            Context context = this.f61079a;
            if (!zIsConnectedOrConnecting) {
                C14647p.m85021d("PushServiceReceiver", context.getPackageName() + ": 无网络  by " + this.f61080b);
                C14647p.m85012a(this.f61079a, "触发静态广播:无网络(" + this.f61080b + Constants.SEPARATOR_COMMA + this.f61079a.getPackageName() + ")");
                return;
            }
            C14647p.m85021d("PushServiceReceiver", context.getPackageName() + ": 执行开始出发动作: " + this.f61080b);
            C14647p.m85012a(this.f61079a, "触发静态广播(" + this.f61080b + Constants.SEPARATOR_COMMA + this.f61079a.getPackageName() + ")");
            C14608e.m84861a().m84875a(this.f61079a);
            if (ClientConfigManagerImpl.getInstance(this.f61079a).isCancleBroadcastReceiver()) {
                return;
            }
            try {
                PushClient.getInstance(this.f61079a).initialize();
            } catch (VivoPushException e) {
                e.printStackTrace();
                C14647p.m85012a(this.f61079a, " 初始化异常 error= " + e.getMessage());
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2 = ContextDelegate.getContext(context);
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            if (f61076a == null) {
                HandlerThread handlerThread = new HandlerThread("PushServiceReceiver");
                f61076a = handlerThread;
                handlerThread.start();
                f61077b = new Handler(f61076a.getLooper());
            }
            C14647p.m85021d("PushServiceReceiver", context2.getPackageName() + ": start PushSerevice for by " + action + "  ; handler : " + f61077b);
            RunnableC14624a.m84940a(f61078c, context2, action);
            f61077b.removeCallbacks(f61078c);
            f61077b.postDelayed(f61078c, 2000L);
        }
    }
}
