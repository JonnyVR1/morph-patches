package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes7.dex */
public class a2m {
    /* JADX INFO: renamed from: a */
    public static String m95714a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(riw.m181611a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() != 0) {
            if (activeNetworkInfo.getType() == 1) {
                return m95715b(((WifiManager) context.getSystemService(riw.m181611a(new byte[]{71, 15, 87, 94}))).getConnectionInfo().getIpAddress());
            }
            return null;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            kmw.m150491a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m95715b(int i) {
        return (i & 255) + riw.m181611a(new byte[]{30}) + ((i >> 8) & 255) + riw.m181611a(new byte[]{30}) + ((i >> 16) & 255) + riw.m181611a(new byte[]{30}) + ((i >> 24) & 255);
    }
}
