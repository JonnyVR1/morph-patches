package p153l;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes7.dex */
public class irw {

    /* JADX INFO: renamed from: a */
    public static WifiManager f116606a;

    /* JADX INFO: renamed from: b */
    public static WifiInfo f116607b;

    /* JADX INFO: renamed from: a */
    public static void m141850a() {
        if (f116606a == null && j26.m143188a(eiw.m120945a(), qmw.m177151a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 102, 126, 39, 47, 111, 53, 101, 118, 53, 35})) == 0) {
            WifiManager wifiManager = (WifiManager) eiw.m120945a().getApplicationContext().getSystemService(qmw.m177151a(new byte[]{71, 15, 87, 94}));
            f116606a = wifiManager;
            f116607b = wifiManager.getConnectionInfo();
        }
    }
}
