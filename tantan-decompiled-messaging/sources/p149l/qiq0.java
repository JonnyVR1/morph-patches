package p149l;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes7.dex */
public class qiq0 {

    /* JADX INFO: renamed from: a */
    private static String f154795a = "invalid";

    /* JADX INFO: renamed from: b */
    private static String f154796b = "Error";

    /* JADX INFO: renamed from: a */
    private static String m174904a() {
        try {
            File file = new File("/sys/class/net/wlan0/address");
            return file.exists() ? new BufferedReader(new InputStreamReader(new FileInputStream(file))).readLine().trim() : f154795a;
        } catch (Exception unused) {
            return f154796b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m174905b(Context context) {
        return Settings.System.getString(context.getContentResolver(), "android_id");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m174906c(String str) {
        return str.equals(f154795a) || str.equals(f154796b);
    }

    /* JADX INFO: renamed from: d */
    public static String m174907d(Context context) {
        try {
            if (hlq0.m131692e(context, "android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static InetAddress m174908e() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress inetAddress = null;
            do {
                try {
                    if (!networkInterfaces.hasMoreElements()) {
                        return inetAddress;
                    }
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        try {
                            if (!inetAddressNextElement.isLoopbackAddress() && inetAddressNextElement.getHostAddress().indexOf(":") == -1) {
                                inetAddress = inetAddressNextElement;
                                break;
                            }
                            inetAddress = null;
                        } catch (Exception unused) {
                            return inetAddressNextElement;
                        }
                    }
                } catch (Exception unused2) {
                    return inetAddress;
                }
            } while (inetAddress == null);
            return inetAddress;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m174909f() {
        try {
            byte[] hardwareAddress = NetworkInterface.getByInetAddress(m174908e()).getHardwareAddress();
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            for (int i2 = 0; i2 < hardwareAddress.length; i2++) {
                if (i2 != 0) {
                    stringBuffer.append(':');
                    i++;
                }
                String hexString = Integer.toHexString(hardwareAddress[i2] & 255);
                if (hexString.length() == 1) {
                    hexString = 0 + hexString;
                }
                stringBuffer.append(hexString);
            }
            return i != 0 ? stringBuffer.toString().toUpperCase() : f154795a;
        } catch (Exception unused) {
            return f154796b;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m174910g(Context context) {
        String strM174912i = m174912i(context);
        String strM174909f = m174909f();
        if (strM174912i.equals(f154795a) && strM174909f.equals(f154795a)) {
            return f154795a;
        }
        if (strM174912i.equals(f154796b) && strM174909f.equals(f154796b)) {
            return f154796b;
        }
        return ((m174906c(strM174912i) || m174906c(strM174909f) || strM174912i.equals(strM174909f)) && !m174906c(strM174912i) && m174906c(strM174909f)) ? strM174912i : strM174909f;
    }

    /* JADX INFO: renamed from: h */
    public static String m174911h() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: i */
    private static String m174912i(Context context) {
        String string = f154795a;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                if (hardwareAddress != null && hardwareAddress.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02x:", Byte.valueOf(b)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    if (networkInterfaceNextElement.getName().equals("wlan0")) {
                        string = sb.toString();
                        break;
                    }
                }
            }
            if (!string.equals("02:00:00:00:00:00") && !string.equals("00:00:00:00:00:00")) {
                return string;
            }
            return f154795a;
        } catch (Exception unused) {
            return f154796b;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m174913j() {
        BufferedReader bufferedReader;
        try {
            if (new File("/sys/block/mmcblk1/device/type").exists()) {
                new BufferedReader(new FileReader("/sys/block/mmcblk1/device/type")).readLine().toLowerCase().contentEquals("sd");
                bufferedReader = new BufferedReader(new FileReader("/sys/block/mmcblk1/device/cid"));
            } else {
                if (!new File("/sys/block/mmcblk0/device/type").exists()) {
                    return "";
                }
                new BufferedReader(new FileReader("/sys/block/mmcblk0/device/type")).readLine().toLowerCase().contentEquals("mmc");
                bufferedReader = new BufferedReader(new FileReader("/sys/block/mmcblk0/device/cid"));
            }
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m174914k(Context context) {
        String strM174910g = m174910g(context);
        if (!strM174910g.equals(f154795a) && !strM174910g.equals(f154796b)) {
            return strM174910g;
        }
        String strM174904a = m174904a();
        return (strM174904a.equals(f154795a) || strM174904a.equals(f154796b)) ? m174915l(context) : strM174904a;
    }

    /* JADX INFO: renamed from: l */
    public static String m174915l(Context context) {
        try {
            if (hlq0.m131692e(context, "android.permission.ACCESS_WIFI_STATE")) {
                String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                return (macAddress.isEmpty() || !(macAddress.equals("02:00:00:00:00:00") || macAddress.equals("00:00:00:00:00:00") || macAddress.equals(""))) ? macAddress : "invalid";
            }
        } catch (Exception unused) {
        }
        return "invalid";
    }

    /* JADX INFO: renamed from: m */
    public static int m174916m(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public static int m174917n(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.widthPixels;
        } catch (Exception unused) {
            i = -1;
        }
        if (i <= 0) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: o */
    public static String m174918o(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m174916m(context) + BaseSei.f13930X);
        sb.append(m174917n(context));
        return sb.toString();
    }
}
