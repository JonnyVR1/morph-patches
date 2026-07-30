package p149l;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes7.dex */
public class jow {

    /* JADX INFO: renamed from: a */
    public static WifiManager f119018a;

    /* JADX INFO: renamed from: b */
    public static WifiInfo f119019b;

    /* JADX INFO: renamed from: a */
    public static void m142535a() {
        if (f119018a == null && e16.m114373a(ggw.m126041a(), rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 102, 126, 39, 47, 111, 53, 101, 118, 53, 35})) == 0) {
            WifiManager wifiManager = (WifiManager) ggw.m126041a().getApplicationContext().getSystemService(rjw.m179664a(new byte[]{71, 15, 87, 94}));
            f119018a = wifiManager;
            f119019b = wifiManager.getConnectionInfo();
        }
    }
}
