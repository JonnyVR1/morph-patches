package com.tencent.youtu.liveness;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import p153l.aqg0;

/* JADX INFO: loaded from: classes2.dex */
public class YTCommonInterface {

    /* JADX INFO: renamed from: a */
    public static String f61347a = "YTCommon";

    /* JADX INFO: renamed from: b */
    public static int f61348b = 1;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f61349c = true;

    public static int getDeviceInfo(Context context, YTDeviceInfo yTDeviceInfo) {
        return nativeGetDeviceInfo(yTDeviceInfo);
    }

    public static native long getEndTime();

    public static native int[] getSDKList();

    public static native String getSDKNameByID(int i);

    public static native String getVersion();

    public static int initAuthByAssets(String str, String str2) {
        if (!f61349c && str == null) {
            aqg0.m99478a();
            return 0;
        }
        if (str2 == null) {
            str2 = "";
        }
        return nativeInitAuthByAssets(str, str2);
    }

    public static int initAuthByFilePath(String str, String str2) {
        if (!f61349c && str == null) {
            aqg0.m99478a();
            return 0;
        }
        if (str2 == null) {
            str2 = "";
        }
        File file = new File(str);
        if (!file.exists()) {
            if (f61348b != 0) {
                Log.e(f61347a, "file not exists: " + str);
            }
            return -10;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[2048];
            int i = fileInputStream.read(bArr);
            fileInputStream.close();
            if (i < 2048) {
                return nativeInitAuthByString(Base64.encodeToString(bArr, 0, i, 2).toString(), str2);
            }
            if (f61348b == 0) {
                return -2;
            }
            Log.e(f61347a, "license length oversize.");
            return -2;
        } catch (FileNotFoundException e) {
            if (f61348b != 0) {
                Log.e(f61347a, "file not found: " + str);
                e.printStackTrace();
                Log.e("YTCommon", "YouTo Auth：read auth file error,Failed to read the file, please check whether the APP has READ_EXTERNAL_STORAGE permission。");
            }
            return -10;
        } catch (IOException e2) {
            if (f61348b == 0) {
                return -4;
            }
            Log.e(f61347a, "io error: " + str);
            e2.printStackTrace();
            return -4;
        }
    }

    public static int initAuthByString(String str, String str2) {
        if (!f61349c && str == null) {
            aqg0.m99478a();
            return 0;
        }
        if (str2 == null) {
            str2 = "";
        }
        return nativeInitAuthByString(str, str2);
    }

    public static int initAuthForQQ() {
        return nativeInitAuthForQQ();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x004b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0099, please report this as an issue */
    public static int initAuthOnlineWithCache(Context context, String str, String str2, String str3, String str4, boolean z) {
        int iInitAuthByFilePath;
        boolean z2;
        YTDeviceInfo yTDeviceInfo;
        YTFetchLicenseHelper.FetchLicenseResult fetchLicenseResultFetchLicenseOnline;
        int iInitAuthByString;
        boolean z3;
        int deviceInfo;
        File file = new File(str2);
        if (file.exists()) {
            iInitAuthByFilePath = initAuthByFilePath(str2, str4);
            if (iInitAuthByFilePath == 0) {
                long endTime = ((getEndTime() - (System.currentTimeMillis() / 1000)) / 24) / 3600;
                if (endTime < 0 || endTime > 7) {
                    z2 = false;
                }
            }
            if (z2) {
                return iInitAuthByFilePath;
            }
            if (z) {
                yTDeviceInfo = new YTDeviceInfo();
                deviceInfo = getDeviceInfo(context, yTDeviceInfo);
                if (deviceInfo != 0) {
                    if (f61348b != 0) {
                        Log.e(f61347a, "getDeviceInfo failed: " + deviceInfo);
                    }
                    return deviceInfo;
                }
            } else {
                yTDeviceInfo = null;
            }
            fetchLicenseResultFetchLicenseOnline = new YTFetchLicenseHelper().fetchLicenseOnline(context, str, str3, str4, yTDeviceInfo);
            if (fetchLicenseResultFetchLicenseOnline.error_code == 0) {
                iInitAuthByString = initAuthByString(fetchLicenseResultFetchLicenseOnline.license, str4);
                if ((fetchLicenseResultFetchLicenseOnline.auth_type.equals("test") || !fetchLicenseResultFetchLicenseOnline.bind_type.equals("APP")) && iInitAuthByString == 0) {
                }
                if (z3) {
                    return iInitAuthByString;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(Base64.decode(fetchLicenseResultFetchLicenseOnline.license, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return 0;
                } catch (FileNotFoundException e) {
                    if (f61348b == 0) {
                        return -10;
                    }
                    Log.e(f61347a, "cache file not found: " + str2);
                    e.printStackTrace();
                    Log.e("YTCommon", "YouTo Auth：read auth file error,Failed to read the file, please check whether the APP has READ_EXTERNAL_STORAGE permission。");
                    return -10;
                } catch (IOException e2) {
                    if (f61348b == 0) {
                        return -4;
                    }
                    Log.e(f61347a, "io error: " + str2);
                    e2.printStackTrace();
                    return -4;
                }
            }
            if (f61348b != 0) {
                Log.e(f61347a, "fetch license failed: http_status: " + fetchLicenseResultFetchLicenseOnline.http_status + " error_code: " + fetchLicenseResultFetchLicenseOnline.error_code + " error_msg: " + fetchLicenseResultFetchLicenseOnline.error_msg);
            }
            iInitAuthByString = fetchLicenseResultFetchLicenseOnline.error_code;
            if (f61348b != 0) {
                nativePrintAuthResult(iInitAuthByString);
            }
            z3 = false;
            if (z3) {
                return iInitAuthByString;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            fileOutputStream2.write(Base64.decode(fetchLicenseResultFetchLicenseOnline.license, 0));
            fileOutputStream2.flush();
            fileOutputStream2.close();
            return 0;
        }
        iInitAuthByFilePath = 1002;
        z2 = true;
        if (z2) {
            return iInitAuthByFilePath;
        }
        if (z) {
            yTDeviceInfo = new YTDeviceInfo();
            deviceInfo = getDeviceInfo(context, yTDeviceInfo);
            if (deviceInfo != 0) {
                if (f61348b != 0) {
                    Log.e(f61347a, "getDeviceInfo failed: " + deviceInfo);
                }
                return deviceInfo;
            }
        } else {
            yTDeviceInfo = null;
        }
        fetchLicenseResultFetchLicenseOnline = new YTFetchLicenseHelper().fetchLicenseOnline(context, str, str3, str4, yTDeviceInfo);
        if (fetchLicenseResultFetchLicenseOnline.error_code == 0) {
            iInitAuthByString = initAuthByString(fetchLicenseResultFetchLicenseOnline.license, str4);
            z3 = fetchLicenseResultFetchLicenseOnline.auth_type.equals("test") ? true : true;
            if (z3) {
                return iInitAuthByString;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
            fileOutputStream3.write(Base64.decode(fetchLicenseResultFetchLicenseOnline.license, 0));
            fileOutputStream3.flush();
            fileOutputStream3.close();
            return 0;
        }
        if (f61348b != 0) {
            Log.e(f61347a, "fetch license failed: http_status: " + fetchLicenseResultFetchLicenseOnline.http_status + " error_code: " + fetchLicenseResultFetchLicenseOnline.error_code + " error_msg: " + fetchLicenseResultFetchLicenseOnline.error_msg);
        }
        iInitAuthByString = fetchLicenseResultFetchLicenseOnline.error_code;
        if (f61348b != 0) {
            nativePrintAuthResult(iInitAuthByString);
        }
        z3 = false;
        if (z3) {
            return iInitAuthByString;
        }
        FileOutputStream fileOutputStream4 = new FileOutputStream(file);
        fileOutputStream4.write(Base64.decode(fetchLicenseResultFetchLicenseOnline.license, 0));
        fileOutputStream4.flush();
        fileOutputStream4.close();
        return 0;
    }

    public static native int nativeGetDeviceInfo(YTDeviceInfo yTDeviceInfo);

    public static native int nativeInitAuthByAssets(String str, String str2);

    public static native int nativeInitAuthByString(String str, String str2);

    public static native int nativeInitAuthForQQ();

    public static native void nativePrintAuthResult(int i);

    public static native void nativeSetEnableLog(int i);

    public static void setEnableLog(int i) {
        nativeSetEnableLog(i);
        f61348b = i;
    }
}
