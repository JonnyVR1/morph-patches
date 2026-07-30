package com.tencent.liteav.basic.datareport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class TXCDRApi {
    static final int NETWORK_TYPE_2G = 4;
    static final int NETWORK_TYPE_3G = 3;
    static final int NETWORK_TYPE_4G = 2;
    static final int NETWORK_TYPE_UNKNOWN = 255;
    static final int NETWORK_TYPE_WIFI = 1;
    private static final String TAG = "TXCDRApi";
    private static String g_simulate_idfa = "";
    private static String mAppName = "";
    private static String mDevId = "";
    private static String mDevType = "";
    private static String mDevUUID = "";
    private static String mNetType = "";
    private static String mSysVersion = "";
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    static boolean initRpt = false;

    static {
        C14215f.m84239f();
        nativeInitDataReport();
    }

    public static void InitEvent(Context context, String str, int i, int i2, TXCDRExtInfo tXCDRExtInfo) {
        setCommonInfo(context);
        if (str == null) {
            return;
        }
        nativeInitEventInternal(str, i, i2, tXCDRExtInfo);
    }

    private static String byteArrayToHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = DIGITS_LOWER;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String getApplicationNameByPackageName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDevUUID(Context context, String str) {
        return getSimulateIDFA(context);
    }

    public static int getNetworkType(Context context) {
        int i = 255;
        if (context == null) {
            return 255;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 255;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                i = 2;
                try {
                    switch (telephonyManager.getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 4;
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
                        default:
                            return 2;
                    }
                } catch (Exception e) {
                    TXCLog.m84150e(TAG, "TXCDRApi: get network type fail, exception occurred.", e);
                }
            }
            return i;
        } catch (Exception e2) {
            TXCLog.m84150e(TAG, "getActiveNetworkInfo exception:", e2);
            return 255;
        }
    }

    public static String getOrigAndroidID(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            string = "";
        }
        return string2Md5(string);
    }

    private static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "get package name failed.", e);
            return "";
        }
    }

    public static String getSimulateIDFA(Context context) {
        String str;
        String str2 = g_simulate_idfa;
        if (str2 != null && str2.length() > 0) {
            return g_simulate_idfa;
        }
        String string = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.m84149e(TAG, "getSimulateIDFA sdcardDir is null");
            return g_simulate_idfa;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.tencent.liteav.dev_uuid", 0);
        String strConcat = "";
        String string2 = sharedPreferences.getString("com.tencent.liteav.key_dev_uuid", "");
        try {
            File file = new File(externalFilesDir.getAbsolutePath() + "/txrtmp/spuid");
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                if (iAvailable > 0) {
                    byte[] bArr = new byte[iAvailable];
                    fileInputStream.read(bArr);
                    str = new String(bArr, "UTF-8");
                } else {
                    str = null;
                }
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    e = e;
                    TXCLog.m84149e(TAG, "read UUID from file failed! reason: " + e.getMessage());
                }
            } else {
                str = null;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        if (string2 != null && string2.length() > 0) {
            string = string2;
        } else if (str != null && str.length() > 0) {
            string = str;
        }
        if (string == null || string.length() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long timeTick = TXCTimeUtil.getTimeTick();
            String strM84233c = C14215f.m84233c(context);
            int i = 5;
            while (i >= 0) {
                strConcat = strConcat.concat(String.format("%02x", Byte.valueOf((byte) ((jCurrentTimeMillis >> (i * 8)) & 255))));
                i--;
                jCurrentTimeMillis = jCurrentTimeMillis;
            }
            for (int i2 = 3; i2 >= 0; i2--) {
                strConcat = strConcat.concat(String.format("%02x", Byte.valueOf((byte) ((timeTick >> (i2 * 8)) & 255))));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strConcat);
            sb.append(string2Md5(strM84233c + UUID.randomUUID().toString()));
            string = sb.toString();
        }
        g_simulate_idfa = string;
        TXCLog.m84152i(TAG, "UUID:" + g_simulate_idfa);
        if (str == null || !str.equals(string)) {
            try {
                File file2 = new File(externalFilesDir.getAbsolutePath() + "/txrtmp");
                if (!file2.exists()) {
                    file2.mkdir();
                }
                File file3 = new File(externalFilesDir.getAbsolutePath() + "/txrtmp/spuid");
                if (!file3.exists()) {
                    file3.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                fileOutputStream.write(string.getBytes());
                fileOutputStream.close();
            } catch (Exception e3) {
                TXCLog.m84149e(TAG, "write UUID to file failed! reason: " + e3.getMessage());
            }
        }
        if (string2 == null || !string2.equals(string)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("com.tencent.liteav.key_dev_uuid", string);
            editorEdit.commit();
        }
        return g_simulate_idfa;
    }

    public static int getStatusReportInterval() {
        return nativeGetStatusReportInterval();
    }

    public static void initCrashReport(Context context) {
        String sDKVersionStr;
        try {
            synchronized (TXCDRApi.class) {
                try {
                    if (!initRpt && context != null && (sDKVersionStr = TXCCommonUtil.getSDKVersionStr()) != null) {
                        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
                        editorEdit.putString("8e50744bf0", sDKVersionStr);
                        editorEdit.commit();
                        initRpt = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "init crash report failed.", e);
        }
    }

    public static native int nativeGetStatusReportInterval();

    private static native void nativeInitDataReport();

    private static native void nativeInitEventInternal(String str, int i, int i2, TXCDRExtInfo tXCDRExtInfo);

    public static native void nativeReportAVRoomEvent(int i, long j, String str, int i2, int i3, String str2, String str3);

    private static native void nativeReportDAUInterval(int i, int i2, String str);

    public static native void nativeReportEvent(String str, int i);

    public static native void nativeReportEvent40003(String str, int i, int i2, String str2, String str3);

    public static native void nativeSetCommonValue(String str, String str2);

    private static native void nativeSetEventValueInterval(String str, int i, String str2, String str3);

    private static native void nativeUninitDataReport();

    public static void reportAVRoomEvent(int i, long j, String str, int i2, int i3, String str2, String str3) {
        nativeReportAVRoomEvent(i, j, str, i2, i3, str2, str3);
    }

    public static void reportEvent40003(String str, int i, int i2, String str2, String str3) {
        nativeReportEvent40003(str, i, i2, str2, str3);
    }

    public static void setCommonInfo(Context context) {
        mDevType = Build.MODEL;
        mNetType = Integer.toString(getNetworkType(context));
        if (mDevId.isEmpty()) {
            mDevId = getSimulateIDFA(context);
        }
        if (mDevUUID.isEmpty()) {
            mDevUUID = getDevUUID(context, mDevId);
        }
        String packageName = getPackageName(context);
        mAppName = getApplicationNameByPackageName(context, packageName) + ":" + packageName;
        mSysVersion = String.valueOf(Build.VERSION.SDK_INT);
        txSetCommonInfo();
    }

    public static String string2Md5(String str) {
        String strByteArrayToHexString;
        if (str == null) {
            return "";
        }
        try {
            strByteArrayToHexString = byteArrayToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "string2Md5 failed.", e);
            strByteArrayToHexString = "";
        }
        return strByteArrayToHexString == null ? "" : strByteArrayToHexString;
    }

    public static String txCreateToken() {
        return UUID.randomUUID().toString();
    }

    public static void txReportDAU(Context context, int i) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i, 0, "");
    }

    public static void txSetAppVersion(String str) {
        if (str != null) {
            nativeSetCommonValue(C14189a.f59238k, str);
        }
    }

    public static void txSetCommonInfo() {
        if (mDevType != null) {
            nativeSetCommonValue(C14189a.f59233f, mDevType);
        }
        if (mNetType != null) {
            nativeSetCommonValue(C14189a.f59234g, mNetType);
        }
        if (mDevId != null) {
            nativeSetCommonValue(C14189a.f59235h, mDevId);
        }
        if (mDevUUID != null) {
            nativeSetCommonValue(C14189a.f59236i, mDevUUID);
        }
        if (mAppName != null) {
            nativeSetCommonValue(C14189a.f59237j, mAppName);
        }
        if (mSysVersion != null) {
            nativeSetCommonValue(C14189a.f59239l, mSysVersion);
        }
    }

    public static void txSetEventIntValue(String str, int i, String str2, long j) {
        nativeSetEventValueInterval(str, i, str2, "" + j);
    }

    public static void txSetEventValue(String str, int i, String str2, String str3) {
        nativeSetEventValueInterval(str, i, str2, str3);
    }

    public static void txReportDAU(Context context, int i, int i2, String str) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i, i2, str);
    }
}
