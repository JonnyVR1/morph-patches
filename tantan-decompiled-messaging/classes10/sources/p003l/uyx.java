package p003l;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import l.dr40;
import l.nr40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uyx {
    /* JADX INFO: renamed from: a */
    public static void m9795a() {
        nr40.e(CoreModule.b).b(10001);
    }

    /* JADX INFO: renamed from: b */
    public static void m9796b() {
        dr40.d();
        NotificationCompat.Builder builderF = dr40.f(CoreModule.b);
        Intent intent = new Intent(CoreModule.b, (Class<?>) SplashProxyAct.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        builderF.setSound((Uri) null).setSmallIcon(c3c0.f3629N7).setOnlyAlertOnce(true).setAutoCancel(false).setContentIntent(PendingIntent.getActivity(CoreModule.b, (int) System.currentTimeMillis(), intent, 67108864)).setContentTitle(CoreModule.b.getString(R$string.f449J6));
        nr40.e(CoreModule.b).g(10001, builderF.build());
    }
}
