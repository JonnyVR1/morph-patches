package p153l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class sz40 extends e250 {
    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: a */
    public static NotificationChannel m188621a() {
        hx3.m137557a();
        NotificationChannel notificationChannelM142608a = iy40.m142608a("tantan_default", App.f16088e.getResources().getString(R$string.f18197o2), 4);
        notificationChannelM142608a.setDescription(App.f16088e.getResources().getString(R$string.f18192n2));
        return notificationChannelM142608a;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: b */
    public static NotificationChannel m188622b() {
        hx3.m137557a();
        return iy40.m142608a("tantan_system", App.f16088e.getResources().getString(R$string.f18202p2), 4);
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: c */
    public static NotificationChannel m188623c() {
        NotificationChannel notificationChannelM142608a = iy40.m142608a("tantan_silent", "静默通知", 2);
        notificationChannelM142608a.setSound(null, null);
        notificationChannelM142608a.enableVibration(false);
        notificationChannelM142608a.setImportance(2);
        return notificationChannelM142608a;
    }

    /* JADX INFO: renamed from: d */
    public static void m188624d() {
        m188625e();
    }

    /* JADX INFO: renamed from: e */
    public static void m188625e() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) App.f16088e.getSystemService("notification")) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m188621a());
            arrayList.add(m188622b());
            arrayList.add(m188623c());
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    /* JADX INFO: renamed from: f */
    public static NotificationCompat.Builder m188626f(Context context) {
        return new NotificationCompat.Builder(context, "tantan_default");
    }

    /* JADX INFO: renamed from: g */
    public static NotificationCompat.Builder m188627g(Context context) {
        return new NotificationCompat.Builder(context, "tantan_silent");
    }
}
