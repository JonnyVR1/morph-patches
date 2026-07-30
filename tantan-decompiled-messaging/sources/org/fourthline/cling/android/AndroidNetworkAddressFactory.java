package org.fourthline.cling.android;

import java.lang.reflect.Field;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl;
import org.fourthline.cling.transport.spi.InitializationException;
import p149l.j850;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidNetworkAddressFactory extends NetworkAddressFactoryImpl {
    private static final Logger log = Logger.getLogger(AndroidUpnpServiceConfiguration.class.getName());

    public AndroidNetworkAddressFactory(int i) {
        super(i);
    }

    @Override // org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl
    public void discoverNetworkInterfaces() throws InitializationException {
        try {
            super.discoverNetworkInterfaces();
        } catch (Exception e) {
            log.warning("Exception while enumerating network interfaces, trying once more: " + e);
            super.discoverNetworkInterfaces();
        }
    }

    @Override // org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl, org.fourthline.cling.transport.spi.NetworkAddressFactory
    public InetAddress getLocalAddress(NetworkInterface networkInterface, boolean z, InetAddress inetAddress) {
        for (InetAddress inetAddress2 : getInetAddresses(networkInterface)) {
            if (z && (inetAddress2 instanceof Inet6Address)) {
                return inetAddress2;
            }
            if (!z && (inetAddress2 instanceof Inet4Address)) {
                return inetAddress2;
            }
        }
        j850.m140190a("Can't find any IPv4 or IPv6 address on interface: ", networkInterface.getDisplayName());
        return null;
    }

    @Override // org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl
    public boolean isUsableAddress(NetworkInterface networkInterface, InetAddress inetAddress) {
        Field declaredField;
        Object obj;
        boolean zIsUsableAddress = super.isUsableAddress(networkInterface, inetAddress);
        if (zIsUsableAddress) {
            String hostAddress = inetAddress.getHostAddress();
            try {
                try {
                    Field declaredField2 = InetAddress.class.getDeclaredField("holder");
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(inetAddress);
                    declaredField = obj.getClass().getDeclaredField("hostName");
                } catch (NoSuchFieldException unused) {
                    declaredField = InetAddress.class.getDeclaredField("hostName");
                    obj = inetAddress;
                }
                if (declaredField == null || hostAddress == null) {
                    return false;
                }
                declaredField.setAccessible(true);
                declaredField.set(obj, hostAddress);
            } catch (Exception e) {
                log.log(Level.SEVERE, "Failed injecting hostName to work around Android InetAddress DNS bug: " + inetAddress, (Throwable) e);
                return false;
            }
        }
        return zIsUsableAddress;
    }

    @Override // org.fourthline.cling.transport.impl.NetworkAddressFactoryImpl
    public boolean requiresNetworkInterface() {
        return false;
    }
}
