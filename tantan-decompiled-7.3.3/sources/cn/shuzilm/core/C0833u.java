package cn.shuzilm.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: cn.shuzilm.core.u */
/* JADX INFO: loaded from: classes.dex */
public class C0833u {
    /* JADX INFO: renamed from: a */
    public static boolean m4806a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    return true;
                }
                if (type == 0) {
                    return false;
                }
            }
            return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasTransport(1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m4809b(Context context) {
        try {
            DhcpInfo dhcpInfo = ((WifiManager) context.getSystemService("wifi")).getDhcpInfo();
            if (dhcpInfo != null) {
                return dhcpInfo.ipAddress;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4807a(Context context, String str) {
        return (context == null || str == null || context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4808a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr, 0, 1024);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused) {
                }
                return byteArray;
            } catch (Throwable unused2) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            byteArrayOutputStream = null;
        }
    }
}
