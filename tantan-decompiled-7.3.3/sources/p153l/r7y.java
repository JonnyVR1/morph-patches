package p153l;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes10.dex */
public class r7y {
    /* JADX INFO: renamed from: a */
    public static void m180167a() {
        c050.m107319e(CoreModule.f18263b).m107323b(10001);
    }

    /* JADX INFO: renamed from: b */
    public static void m180168b() {
        sz40.m188624d();
        NotificationCompat.Builder builderM188626f = sz40.m188626f(CoreModule.f18263b);
        Intent intent = new Intent(CoreModule.f18263b, (Class<?>) SplashProxyAct.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        builderM188626f.setSound(null).setSmallIcon(ibc0.f113867N7).setOnlyAlertOnce(true).setAutoCancel(false).setContentIntent(PendingIntent.getActivity(CoreModule.f18263b, (int) System.currentTimeMillis(), intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET)).setContentTitle(CoreModule.f18263b.getString(R$string.f21529J6));
        c050.m107319e(CoreModule.f18263b).m107326g(10001, builderM188626f.build());
    }
}
