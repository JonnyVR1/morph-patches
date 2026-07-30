package com.tencent.liteav.basic.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class TXCCommonUtil {
    private static final String TAG = "TXCCommonUtil";
    private static String mAppID = "";
    private static String mStrAppVersion = "";
    private static String mUserId = "";
    public static String pituLicencePath = "YTFaceSDK.licence";
    private static Context sApplicationContext;

    static {
        C14215f.m84239f();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Context getAppContext() {
        return sApplicationContext;
    }

    public static String getAppFilePath() {
        Context context = sApplicationContext;
        String absolutePath = context != null ? context.getFilesDir().getAbsolutePath() : "/sdcard/liteav";
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return absolutePath;
    }

    public static String getAppID() {
        return mAppID;
    }

    public static String getAppNameByStreamUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        if (str.length() == 0) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            str = str.substring(0, iLastIndexOf);
        }
        if (str.length() == 0) {
            return null;
        }
        int iLastIndexOf2 = str.lastIndexOf("/");
        if (iLastIndexOf2 != -1) {
            str = str.substring(iLastIndexOf2 + 1);
        }
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public static String getAppPackageName() {
        return C14215f.m84233c(sApplicationContext);
    }

    public static String getAppVersion() {
        return mStrAppVersion;
    }

    public static String getConfigCenterKey() {
        return nativeGetConfigCenterKey();
    }

    public static String getFileExtension(String str) {
        int iLastIndexOf;
        if (str == null || str.length() <= 0 || (iLastIndexOf = str.lastIndexOf(46)) <= -1 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static int getGateway() {
        Context context = sApplicationContext;
        if (context == null) {
            return 0;
        }
        try {
            return ((WifiManager) context.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "getGateway error ", e);
            return 0;
        }
    }

    public static String getLogUploadPath() {
        File externalFilesDir;
        Context context = sApplicationContext;
        if (context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return "";
        }
        return externalFilesDir.getAbsolutePath() + "/log/tencent/liteav";
    }

    public static String getMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i = 0; i < bArrDigest.length; i++) {
                int i2 = bArrDigest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static int getSDKID() {
        return nativeGetSDKID();
    }

    public static int[] getSDKVersion() {
        String[] strArrSplit = nativeGetSDKVersion().split("\\.");
        int[] iArr = new int[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException e) {
                TXCLog.m84150e(TAG, "parse version failed.", e);
                iArr[i] = 0;
            }
        }
        return iArr;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    public static String getStreamIDByStreamUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        if (str.length() == 0) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        if (str.length() == 0) {
            return null;
        }
        int iIndexOf2 = str.indexOf(".");
        if (iIndexOf2 != -1) {
            str = str.substring(0, iIndexOf2);
        }
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public static String getUserId() {
        return mUserId;
    }

    public static String loadString(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return "";
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getString(str, "");
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "load string failed.", e);
            return "";
        }
    }

    public static long loadUInt64(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return 0L;
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getLong(str, 0L);
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "load uint64 failed.", e);
            return 0L;
        }
    }

    private static native String nativeGetConfigCenterKey();

    private static native int nativeGetSDKID();

    private static native String nativeGetSDKVersion();

    public static void saveString(String str, String str2) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "save string failed", e);
        }
    }

    public static void saveUInt64(String str, long j) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            editorEdit.putLong(str, j);
            editorEdit.commit();
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "save uint64 failed.", e);
        }
    }

    public static void setAppContext(Context context) {
        if (context == null) {
            return;
        }
        sApplicationContext = context.getApplicationContext();
    }

    public static void setAppID(String str) {
        mAppID = str;
    }

    public static void setAppVersion(String str) {
        mStrAppVersion = str;
    }

    public static void setPituLicencePath(String str) {
        pituLicencePath = str;
    }

    public static void setUserId(String str) {
        mUserId = str;
    }

    public static void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static void zip(ArrayList<String> arrayList, String str) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        FileInputStream fileInputStream2;
        File file = new File(str);
        ?? r10 = 0;
        FileInputStream fileInputStream3 = null;
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
                try {
                    try {
                        zipOutputStream2.setComment("LiteAV log");
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            File file2 = new File(it.next());
                            try {
                                if (file2.length() == 0 || file2.length() > 8388608) {
                                    try {
                                        fileInputStream3.close();
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    fileInputStream = new FileInputStream(file2);
                                    try {
                                        try {
                                            zipOutputStream2.putNextEntry(new ZipEntry(file2.getName()));
                                            byte[] bArr = new byte[8192];
                                            while (true) {
                                                int i = fileInputStream.read(bArr);
                                                fileInputStream2 = fileInputStream;
                                                if (i == -1) {
                                                    break;
                                                } else {
                                                    zipOutputStream2.write(bArr, 0, i);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            fileInputStream3 = fileInputStream;
                                            try {
                                                fileInputStream3.close();
                                            } catch (Exception unused2) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        TXCLog.m84150e(TAG, "zip failed.", e);
                                        fileInputStream2 = fileInputStream;
                                        try {
                                            fileInputStream2.close();
                                        } catch (Exception unused3) {
                                        }
                                        fileInputStream3 = fileInputStream2;
                                    }
                                    fileInputStream2.close();
                                    fileInputStream3 = fileInputStream2;
                                }
                            } catch (Exception e3) {
                                fileInputStream = fileInputStream3;
                                e = e3;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        zipOutputStream2.close();
                        r10 = fileInputStream3;
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = zipOutputStream2;
                        try {
                            r10.close();
                        } catch (Exception unused4) {
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused5) {
                    zipOutputStream = zipOutputStream2;
                    TXCLog.m84156w(TAG, "zip log error");
                    zipOutputStream.close();
                    r10 = zipOutputStream;
                }
            } catch (Exception unused6) {
            }
        } catch (FileNotFoundException unused7) {
        }
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
