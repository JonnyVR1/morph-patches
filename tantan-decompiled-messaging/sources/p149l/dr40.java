package p149l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.common.R$string;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class dr40 extends pt40 {
    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: a */
    public static NotificationChannel m113270a() {
        iw3.m138716a();
        NotificationChannel notificationChannelM194605a = up40.m194605a("tantan_default", App.f15369e.getResources().getString(R$string.f17478o2), 4);
        notificationChannelM194605a.setDescription(App.f15369e.getResources().getString(R$string.f17473n2));
        return notificationChannelM194605a;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: b */
    public static NotificationChannel m113271b() {
        iw3.m138716a();
        return up40.m194605a("tantan_system", App.f15369e.getResources().getString(R$string.f17483p2), 4);
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: c */
    public static NotificationChannel m113272c() {
        NotificationChannel notificationChannelM194605a = up40.m194605a("tantan_silent", "静默通知", 2);
        notificationChannelM194605a.setSound(null, null);
        notificationChannelM194605a.enableVibration(false);
        notificationChannelM194605a.setImportance(2);
        return notificationChannelM194605a;
    }

    /* JADX INFO: renamed from: d */
    public static void m113273d() {
        m113274e();
    }

    /* JADX INFO: renamed from: e */
    public static void m113274e() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) App.f15369e.getSystemService("notification")) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m113270a());
            arrayList.add(m113271b());
            arrayList.add(m113272c());
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    /* JADX INFO: renamed from: f */
    public static NotificationCompat.Builder m113275f(Context context) {
        return new NotificationCompat.Builder(context, "tantan_default");
    }

    /* JADX INFO: renamed from: g */
    public static NotificationCompat.Builder m113276g(Context context) {
        return new NotificationCompat.Builder(context, "tantan_silent");
    }
}
