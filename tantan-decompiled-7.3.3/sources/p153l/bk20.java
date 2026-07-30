package p153l;

import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes7.dex */
public class bk20 {
    /* JADX INFO: renamed from: a */
    public static String m104786a() {
        WifiManager wifiManager;
        try {
            if (irw.f116607b != null && (wifiManager = irw.f116606a) != null && wifiManager.isWifiEnabled()) {
                return irw.f116607b.getBSSID().trim().replace(qmw.m177151a(new byte[]{18}), "");
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
