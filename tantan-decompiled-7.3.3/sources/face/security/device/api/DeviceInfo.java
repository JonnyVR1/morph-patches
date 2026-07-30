package face.security.device.api;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceInfo {
    private static String gha(NetworkInterface networkInterface) {
        if (networkInterface == null) {
            return "";
        }
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if ((inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                return inetAddressNextElement.getHostAddress();
            }
        }
        return "";
    }

    public static String gias() {
        return "";
    }
}
