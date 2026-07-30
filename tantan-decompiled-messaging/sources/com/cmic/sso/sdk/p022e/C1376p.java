package com.cmic.sso.sdk.p022e;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.p */
/* JADX INFO: loaded from: classes.dex */
public class C1376p {
    /* JADX INFO: renamed from: a */
    public static String[] m7302a(boolean z) {
        String[] strArr = {"", ""};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!z || !networkInterfaceNextElement.getName().toLowerCase().contains("wlan")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress()) {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                if (inetAddressNextElement instanceof Inet6Address) {
                                    sb.append(hostAddress);
                                    sb.append(Constants.SEPARATOR_COMMA);
                                } else if (inetAddressNextElement instanceof Inet4Address) {
                                    sb2.append(hostAddress);
                                    sb2.append(Constants.SEPARATOR_COMMA);
                                }
                            }
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(sb)) {
                sb = sb.delete(sb.length() - 1, sb.length());
            }
            if (!TextUtils.isEmpty(sb2)) {
                sb2 = sb2.delete(sb2.length() - 1, sb2.length());
            }
            strArr[0] = sb2.toString();
            strArr[1] = sb.toString();
            C1363c.m7234b("UmcIPUtils", "onlyMobileDataIp " + z + " IPV6 ip：" + sb.toString());
            C1363c.m7234b("UmcIPUtils", "onlyMobileDataIp " + z + " IPV4 ip：" + sb2.toString());
            return strArr;
        } catch (Exception e) {
            e.printStackTrace();
            return strArr;
        }
    }
}
