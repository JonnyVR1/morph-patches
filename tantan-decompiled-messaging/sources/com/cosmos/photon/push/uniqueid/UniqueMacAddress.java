package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.util.MD5Utils;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public class UniqueMacAddress implements IUniqueId {
    private static final String TAG = "UniqueMacAddress";

    private byte[] getWifiMac() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.getName().equals("wlan0")) {
                    return networkInterfaceNextElement.getHardwareAddress();
                }
            }
        } catch (Throwable th) {
            MDLog.m7397v(TAG, th.getMessage());
        }
        return null;
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getTag() {
        return "mac";
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getUniqueId(Context context) {
        byte[] wifiMac = getWifiMac();
        if (wifiMac == null) {
            return null;
        }
        return MD5Utils.encodeHexString(wifiMac);
    }
}
