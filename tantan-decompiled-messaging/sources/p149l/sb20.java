package p149l;

import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes7.dex */
public class sb20 {
    /* JADX INFO: renamed from: a */
    public static String m183196a() {
        WifiManager wifiManager;
        try {
            if (jow.f119019b != null && (wifiManager = jow.f119018a) != null && wifiManager.isWifiEnabled()) {
                return jow.f119019b.getBSSID().trim().replace(rjw.m179664a(new byte[]{18}), "");
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
