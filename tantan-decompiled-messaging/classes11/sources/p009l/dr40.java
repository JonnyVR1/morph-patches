package p009l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.common.R;
import java.util.ArrayList;
import l.iw3;
import l.pt40;
import l.up40;
import l.y8e;
import l.z75;
import l.z8e;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dr40 extends pt40 {
    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: a */
    public static NotificationChannel m13452a() {
        iw3.a();
        NotificationChannel notificationChannelA = up40.a("tantan_default", App.e.getResources().getString(R.string.o2), 4);
        z75.a(notificationChannelA, App.e.getResources().getString(R.string.n2));
        return notificationChannelA;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: b */
    public static NotificationChannel m13453b() {
        iw3.a();
        return up40.a("tantan_system", App.e.getResources().getString(R.string.p2), 4);
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: c */
    public static NotificationChannel m13454c() {
        NotificationChannel notificationChannelA = up40.a("tantan_silent", "静默通知", 2);
        z8e.a(notificationChannelA, (Uri) null, (AudioAttributes) null);
        y8e.a(notificationChannelA, false);
        notificationChannelA.setImportance(2);
        return notificationChannelA;
    }

    /* JADX INFO: renamed from: d */
    public static void m13455d() {
        m13456e();
    }

    /* JADX INFO: renamed from: e */
    public static void m13456e() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) App.e.getSystemService("notification")) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(m13452a());
            arrayList.add(m13453b());
            arrayList.add(m13454c());
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    /* JADX INFO: renamed from: f */
    public static NotificationCompat.Builder m13457f(Context context) {
        return new NotificationCompat.Builder(context, "tantan_default");
    }

    /* JADX INFO: renamed from: g */
    public static NotificationCompat.Builder m13458g(Context context) {
        return new NotificationCompat.Builder(context, "tantan_silent");
    }
}
