package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class kd20 {

    /* JADX INFO: renamed from: a */
    private static WifiManager f122536a;

    /* JADX INFO: renamed from: a */
    private static boolean m145614a(Context context) {
        if (jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 102, 126, 39, 47, 111, 53, 101, 118, 53, 35}))) {
            return Build.VERSION.SDK_INT >= 29 ? jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127})) : jj60.m141754a(context, sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 114, 120, HttpTokens.SPACE, 52, 99, 35, 110, 123, 46, 37, 113, 50, 120, 120, 47}));
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public static List<JSONObject> m145615b(Context context) {
        if (Build.VERSION.SDK_INT >= 29 || !jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 102, 126, 39, 47, 111, 53, 101, 118, 53, 35})) || !jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127})) || !m145622i(context)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (WifiConfiguration wifiConfiguration : f122536a.getConfiguredNetworks()) {
                String str = wifiConfiguration.SSID;
                String str2 = wifiConfiguration.BSSID;
                String strM145616c = m145616c(wifiConfiguration);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(sgw.m184137a(new byte[]{67, 21, 88, 83}), str);
                jSONObject.put(sgw.m184137a(new byte[]{82, 21, 66, 94, 5}), str2);
                jSONObject.put(sgw.m184137a(new byte[]{85, 8, 82, 69, 24, 22, 68, 15, 94, 89, 21, 31, 64, 3}), strM145616c);
                arrayList.add(jSONObject);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static String m145616c(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return sgw.m184137a(new byte[]{103, 54, 112, 104, 49, 53, 123});
        }
        return (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) ? sgw.m184137a(new byte[]{103, 54, 112, 104, 49, 53, 123}) : sgw.m184137a(new byte[]{127, 22, 84, 89});
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: d */
    private static JSONObject m145617d(Context context) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (context == null) {
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 69, 78, 17, 3}), 0);
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 84, 79, 2, 3, 64, 18, 88, 88, 15}), sgw.m184137a(new byte[]{115, 9, 95, 67, 4, 30, 68, 70, 88, 68, 65, 8, 69, 10, 93}));
                return jSONObject;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}));
            if (telephonyManager == null) {
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 69, 78, 17, 3}), 0);
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 84, 79, 2, 3, 64, 18, 88, 88, 15}), sgw.m184137a(new byte[]{100, 3, 93, 82, 17, 14, 95, 8, 72, 122, 0, 8, 81, 1, 84, 69, 65, 15, 67, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
                return jSONObject;
            }
            int i = 2;
            try {
                int networkType = telephonyManager.getNetworkType();
                if (networkType != 20) {
                    switch (networkType) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i = 3;
                            break;
                        case 13:
                            i = 4;
                            break;
                        default:
                            i = 5;
                            break;
                    }
                } else {
                    i = 6;
                }
                str = null;
            } catch (Exception e) {
                str = e.getClass().getName() + sgw.m184137a(new byte[]{10, 70}) + e.getMessage();
                i = -1;
            }
            jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 69, 78, 17, 3}), i);
            jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 84, 79, 2, 3, 64, 18, 88, 88, 15}), str);
            return jSONObject;
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e */
    public static int m145618e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(sgw.m184137a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING)) {
                    return 1;
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && (networkInfo2.getState() == NetworkInfo.State.CONNECTED || networkInfo2.getState() == NetworkInfo.State.CONNECTING)) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 20) {
                        return 6;
                    }
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 4;
                        default:
                            String subtypeName = networkInfo2.getSubtypeName();
                            return (subtypeName.equalsIgnoreCase(sgw.m184137a(new byte[]{100, 34, 28, 100, 34, 34, 125, 39})) || subtypeName.equalsIgnoreCase(sgw.m184137a(new byte[]{103, 37, 117, 122, HttpTokens.SPACE})) || subtypeName.equalsIgnoreCase(sgw.m184137a(new byte[]{115, 34, 124, 118, 83, 86, 0, 86}))) ? 3 : 5;
                    }
                }
            }
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public static JSONObject m145619f(Context context) {
        String str;
        int i;
        NetworkCapabilities networkCapabilities;
        JSONObject jSONObject = new JSONObject();
        try {
            if (context == null) {
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 69, 78, 17, 3}), 0);
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 84, 79, 2, 3, 64, 18, 88, 88, 15}), sgw.m184137a(new byte[]{115, 9, 95, 67, 4, 30, 68, 70, 88, 68, 65, 8, 69, 10, 93}));
                return jSONObject;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(sgw.m184137a(new byte[]{83, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31}));
            if (connectivityManager == null) {
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 69, 78, 17, 3}), 0);
                jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 84, 79, 2, 3, 64, 18, 88, 88, 15}), sgw.m184137a(new byte[]{115, 9, 95, 89, 4, 5, 68, 15, 71, 94, 21, 31, 125, 7, 95, 86, 6, 3, 66, 70, 88, 68, 65, 8, 69, 10, 93}));
                return jSONObject;
            }
            try {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                    i = 0;
                } else if (networkCapabilities.hasTransport(1)) {
                    i = 1;
                } else {
                    if (networkCapabilities.hasTransport(0)) {
                        return m145617d(context);
                    }
                    i = 0;
                }
                str = null;
            } catch (Exception e) {
                str = e.getClass().getName() + sgw.m184137a(new byte[]{10, 70}) + e.getMessage();
                i = -1;
            }
            jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 69, 78, 17, 3}), i);
            jSONObject.put(sgw.m184137a(new byte[]{94, 3, 69, 64, 14, 20, 91, 57, 84, 79, 2, 3, 64, 18, 88, 88, 15}), str);
            return jSONObject;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static JSONObject m145620g(Context context, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!m145614a(context) || !m145622i(context)) {
                return null;
            }
            WifiInfo connectionInfo = f122536a.getConnectionInfo();
            if (connectionInfo != null && connectionInfo.getNetworkId() != -1) {
                String ssid = connectionInfo.getSSID();
                if (ssid.startsWith(sgw.m184137a(new byte[]{18})) && ssid.endsWith(sgw.m184137a(new byte[]{18}))) {
                    ssid = ssid.substring(1, ssid.length() - 1);
                }
                jSONObject.put(sgw.m184137a(new byte[]{99, 53, 120, 115}), ssid);
                jSONObject.put(sgw.m184137a(new byte[]{114, 53, 98, 126, 37}), connectionInfo.getBSSID());
                jSONObject.put(sgw.m184137a(new byte[]{99, 15, 86, 89, 0, 10}), WifiManager.calculateSignalLevel(f122536a.getConnectionInfo().getRssi(), 1001));
                if (z) {
                    jSONObject.put(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 15, 64}), fzl.m123868b(connectionInfo.getIpAddress()));
                    jSONObject.put(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 10, 89, 8, 90, 104, 18, 22, 85, 3, 85}), connectionInfo.getLinkSpeed());
                    jSONObject.put(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 0, 66, 3, 64, 66, 4, 8, 83, 31}), connectionInfo.getFrequency());
                    jSONObject.put(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 8, 85, 18, 70, 88, 19, HttpTokens.CARRIAGE_RETURN, 111, 15, 85}), connectionInfo.getNetworkId());
                    return jSONObject;
                }
            }
        } catch (Exception e) {
            try {
                jSONObject.put(sgw.m184137a(new byte[]{71, 15, 87, 94, 62, 5, 95, 10, 93, 82, 2, 18, 111, 3, 67, 69, 14, 20}), e.toString());
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static List<JSONObject> m145621h(Context context) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 102, 126, 39, 47, 111, 53, 101, 118, 53, 35})) && ((i = Build.VERSION.SDK_INT) < 33 ? i < 29 ? jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 114, 120, HttpTokens.SPACE, 52, 99, 35, 110, 123, 46, 37, 113, 50, 120, 120, 47})) : jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127})) : jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 39, 114, 116, 36, 53, 99, 57, 119, 126, 47, 35, 111, 42, 126, 116, HttpTokens.SPACE, 50, 121, 41, 127})) && jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 40, 116, 118, 51, 36, 105, 57, 102, 126, 39, 47, 111, 34, 116, 97, 40, 37, 117, 53})))) {
            if (!m145622i(context)) {
                return null;
            }
            f122536a.startScan();
            for (ScanResult scanResult : f122536a.getScanResults()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(sgw.m184137a(new byte[]{99, 53, 120, 115}), scanResult.SSID);
                    jSONObject.put(sgw.m184137a(new byte[]{114, 53, 98, 126, 37}), scanResult.BSSID);
                    jSONObject.put(sgw.m184137a(new byte[]{83, 7, 65, 86, 3, 15, 92, 15, 69, 94, 4, 21}), scanResult.capabilities);
                    jSONObject.put(sgw.m184137a(new byte[]{86, 20, 84, 70, 20, 3, 94, 5, 72}), scanResult.frequency);
                    jSONObject.put(sgw.m184137a(new byte[]{92, 3, 71, 82, HttpTokens.CARRIAGE_RETURN}), scanResult.level);
                    jSONObject.put(sgw.m184137a(new byte[]{68, 15, 92, 82, 18, 18, 81, 11, 65}), scanResult.timestamp);
                    arrayList.add(jSONObject);
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m145622i(Context context) {
        WifiManager wifiManager = f122536a;
        if (wifiManager != null) {
            return wifiManager.isWifiEnabled();
        }
        WifiManager wifiManager2 = (WifiManager) context.getApplicationContext().getSystemService(sgw.m184137a(new byte[]{71, 15, 87, 94}));
        f122536a = wifiManager2;
        return wifiManager2 != null && wifiManager2.isWifiEnabled();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m145623j(Context context) {
        String property = System.getProperty(sgw.m184137a(new byte[]{88, 18, 69, 71, 79, 22, 66, 9, 73, 78, 41, 9, 67, 18}));
        String property2 = System.getProperty(sgw.m184137a(new byte[]{88, 18, 69, 71, 79, 22, 66, 9, 73, 78, 49, 9, 66, 18}));
        if (property2 == null) {
            property2 = sgw.m184137a(new byte[]{29, 87});
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }
}
