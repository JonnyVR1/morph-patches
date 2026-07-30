package p153l;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes6.dex */
public class vrq0 {

    /* JADX INFO: renamed from: a */
    private static String f185511a = "invalid";

    /* JADX INFO: renamed from: b */
    private static String f185512b = "Error";

    /* JADX INFO: renamed from: a */
    private static String m202518a() {
        try {
            File file = new File("/sys/class/net/wlan0/address");
            return file.exists() ? new BufferedReader(new InputStreamReader(new FileInputStream(file))).readLine().trim() : f185511a;
        } catch (Exception unused) {
            return f185512b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m202519b(Context context) {
        return Settings.System.getString(context.getContentResolver(), "android_id");
    }

    /* JADX INFO: renamed from: c */
    private static boolean m202520c(String str) {
        return str.equals(f185511a) || str.equals(f185512b);
    }

    /* JADX INFO: renamed from: d */
    public static String m202521d(Context context) {
        try {
            if (nuq0.m164816e(context, "android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static InetAddress m202522e() {
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
    private static String m202523f() {
        try {
            byte[] hardwareAddress = NetworkInterface.getByInetAddress(m202522e()).getHardwareAddress();
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
            return i != 0 ? stringBuffer.toString().toUpperCase() : f185511a;
        } catch (Exception unused) {
            return f185512b;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m202524g(Context context) {
        String strM202526i = m202526i(context);
        String strM202523f = m202523f();
        if (strM202526i.equals(f185511a) && strM202523f.equals(f185511a)) {
            return f185511a;
        }
        if (strM202526i.equals(f185512b) && strM202523f.equals(f185512b)) {
            return f185512b;
        }
        return ((m202520c(strM202526i) || m202520c(strM202523f) || strM202526i.equals(strM202523f)) && !m202520c(strM202526i) && m202520c(strM202523f)) ? strM202526i : strM202523f;
    }

    /* JADX INFO: renamed from: h */
    public static String m202525h() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: i */
    private static String m202526i(Context context) {
        String string = f185511a;
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
            return f185511a;
        } catch (Exception unused) {
            return f185512b;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m202527j() {
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
    public static String m202528k(Context context) {
        String strM202524g = m202524g(context);
        if (!strM202524g.equals(f185511a) && !strM202524g.equals(f185512b)) {
            return strM202524g;
        }
        String strM202518a = m202518a();
        return (strM202518a.equals(f185511a) || strM202518a.equals(f185512b)) ? m202529l(context) : strM202518a;
    }

    /* JADX INFO: renamed from: l */
    public static String m202529l(Context context) {
        try {
            if (nuq0.m164816e(context, "android.permission.ACCESS_WIFI_STATE")) {
                String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
                return (macAddress.isEmpty() || !(macAddress.equals("02:00:00:00:00:00") || macAddress.equals("00:00:00:00:00:00") || macAddress.equals(""))) ? macAddress : "invalid";
            }
        } catch (Exception unused) {
        }
        return "invalid";
    }

    /* JADX INFO: renamed from: m */
    public static int m202530m(Context context) {
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
    public static int m202531n(Context context) {
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
    public static String m202532o(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m202530m(context) + BaseSei.f14624X);
        sb.append(m202531n(context));
        return sb.toString();
    }
}
