package p149l;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes10.dex */
public class uyx {
    /* JADX INFO: renamed from: a */
    public static void m196374a() {
        nr40.m160709e(CoreModule.f17544b).m160713b(10001);
    }

    /* JADX INFO: renamed from: b */
    public static void m196375b() {
        dr40.m113273d();
        NotificationCompat.Builder builderM113275f = dr40.m113275f(CoreModule.f17544b);
        Intent intent = new Intent(CoreModule.f17544b, (Class<?>) SplashProxyAct.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        builderM113275f.setSound(null).setSmallIcon(c3c0.f78592N7).setOnlyAlertOnce(true).setAutoCancel(false).setContentIntent(PendingIntent.getActivity(CoreModule.f17544b, (int) System.currentTimeMillis(), intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET)).setContentTitle(CoreModule.f17544b.getString(R$string.f20787J6));
        nr40.m160709e(CoreModule.f17544b).m160716g(10001, builderM113275f.build());
    }
}
