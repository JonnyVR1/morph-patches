package com.immomo.mmdns;

import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class MoInetAddressHelper {
    private static final MoInetAddressHelper instance = new MoInetAddressHelper();
    private final Set<WeakReference<InetAddress>> mmdnsAddresses = new HashSet();

    private MoInetAddressHelper() {
    }

    public static InetAddress[] getAllByName(String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        synchronized (MoInetAddressHelper.class) {
            try {
                for (InetAddress inetAddress : allByName) {
                    instance.mmdnsAddresses.add(new WeakReference<>(inetAddress));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return allByName;
    }

    public static synchronized boolean isMMDns(InetAddress inetAddress) {
        if (inetAddress == null) {
            return false;
        }
        try {
            Iterator<WeakReference<InetAddress>> it = instance.mmdnsAddresses.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress2 = it.next().get();
                if (inetAddress2 == null) {
                    it.remove();
                } else if (inetAddress2.equals(inetAddress)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
