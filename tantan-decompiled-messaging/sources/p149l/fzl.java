package p149l;

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
public class fzl {
    /* JADX INFO: renamed from: a */
    public static String m123867a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(sgw.m184137a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}))).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        if (activeNetworkInfo.getType() != 0) {
            if (activeNetworkInfo.getType() == 1) {
                return m123868b(((WifiManager) context.getSystemService(sgw.m184137a(new byte[]{71, 15, 87, 94}))).getConnectionInfo().getIpAddress());
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
            ljw.m150044a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m123868b(int i) {
        return (i & 255) + sgw.m184137a(new byte[]{30}) + ((i >> 8) & 255) + sgw.m184137a(new byte[]{30}) + ((i >> 16) & 255) + sgw.m184137a(new byte[]{30}) + ((i >> 24) & 255);
    }
}
