package com.tencent.rtmp;

import android.content.Context;
import android.util.Log;
import com.tencent.liteav.C14156p;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.C14035f;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class TXLiveBase {
    private static final String FILE_MD5_FFMPEG_ARM = "___md5_libtxffmpeg_arm_md5______";
    private static final String FILE_MD5_FFMPEG_V64 = "___md5_libtxffmpeg_v64_md5______";
    private static final String FILE_MD5_FFMPEG_V7A = "___md5_libtxffmpeg_v7a_md5______";
    private static final String FILE_MD5_LITEAV_ARM = "___md5_libliteavsdk_arm_md5_____";
    private static final String FILE_MD5_LITEAV_V64 = "___md5_libliteavsdk_v64_md5_____";
    private static final String FILE_MD5_LITEAV_V7A = "___md5_libliteavsdk_v7a_md5_____";
    private static final String FILE_MD5_SATURN_ARM = "___md5_libsaturn_arm_md5________";
    private static final String FILE_MD5_SATURN_V64 = "___md5_libsaturn_v64_md5________";
    private static final String FILE_MD5_SATURN_V7A = "___md5_libsaturn_v7a_md5________";
    private static final String FILE_MD5_TRAE_ARM = "___md5_libtraeimp_arm_md5_______";
    private static final String FILE_MD5_TRAE_V64 = "___md5_libtraeimp_v64_md5_______";
    private static final String FILE_MD5_TRAE_V7A = "___md5_libtraeimp_v7a_md5_______";
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    private static ITXLiveBaseListener listener;

    /* JADX INFO: renamed from: com.tencent.rtmp.TXLiveBase$a */
    public static class C14404a implements TXCLog.InterfaceC14038a {
        private C14404a() {
        }

        @Override // com.tencent.liteav.basic.log.TXCLog.InterfaceC14038a
        /* JADX INFO: renamed from: a */
        public void mo82975a(int i, String str, String str2) {
            if (TXLiveBase.listener != null) {
                TXLiveBase.listener.OnLog(i, str, str2);
            }
        }
    }

    private TXLiveBase() {
    }

    private static String getFileMD5(String str, String str2) {
        File file = new File(str, str2);
        MessageDigest messageDigest = null;
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
        }
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public static String getPituSDKVersion() {
        return C14156p.m83760a();
    }

    public static String getSDKVersionStr() {
        return TXCCommonUtil.getSDKVersionStr();
    }

    public static boolean isLibraryPathValid(String str) {
        String fileMD5 = getFileMD5(str, "libliteavsdk.so");
        String fileMD6 = getFileMD5(str, "libsaturn.so");
        String fileMD7 = getFileMD5(str, "libtxffmpeg.so");
        String fileMD8 = getFileMD5(str, "libtraeimp-rtmp.so");
        Log.e(TAG, "MD5-CHECK-V64 libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V64 = ___md5_libliteavsdk_v64_md5_____");
        Log.e(TAG, "MD5-CHECK-V64 libsaturn    = " + fileMD6 + " FILE_MD5_SATURN_V64 = ___md5_libsaturn_v64_md5________");
        Log.e(TAG, "MD5-CHECK-V64 libtxffmpeg  = " + fileMD7 + " FILE_MD5_FFMPEG_V64 = ___md5_libtxffmpeg_v64_md5______");
        Log.e(TAG, "MD5-CHECK-V64 libtraeimpl  = " + fileMD8 + " FILE_MD5_TRAE_V64   = ___md5_libtraeimp_v64_md5_______");
        if (fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V64) && fileMD6 != null && fileMD6.equalsIgnoreCase(FILE_MD5_SATURN_V64) && fileMD7 != null && fileMD7.equalsIgnoreCase(FILE_MD5_FFMPEG_V64) && fileMD8 != null && fileMD8.equalsIgnoreCase(FILE_MD5_TRAE_V64)) {
            return true;
        }
        Log.e(TAG, "MD5-CHECK-V7A libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V7A = ___md5_libliteavsdk_v7a_md5_____");
        Log.e(TAG, "MD5-CHECK-V7A libsaturn    = " + fileMD6 + " FILE_MD5_SATURN_V7A = ___md5_libsaturn_v7a_md5________");
        Log.e(TAG, "MD5-CHECK-V7A libtxffmpeg  = " + fileMD7 + " FILE_MD5_FFMPEG_V7A = ___md5_libtxffmpeg_v7a_md5______");
        Log.e(TAG, "MD5-CHECK-V7A libtraeimpl  = " + fileMD8 + " FILE_MD5_TRAE_V7A   = ___md5_libtraeimp_v7a_md5_______");
        if (fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V7A) && fileMD6 != null && fileMD6.equalsIgnoreCase(FILE_MD5_SATURN_V7A) && fileMD7 != null && fileMD7.equalsIgnoreCase(FILE_MD5_FFMPEG_V7A) && fileMD8 != null && fileMD8.equalsIgnoreCase(FILE_MD5_TRAE_V7A)) {
            return true;
        }
        Log.e(TAG, "MD5-CHECK-ARM libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_ARM = ___md5_libliteavsdk_arm_md5_____");
        Log.e(TAG, "MD5-CHECK-ARM libsaturn    = " + fileMD6 + " FILE_MD5_SATURN_ARM = ___md5_libsaturn_arm_md5________");
        Log.e(TAG, "MD5-CHECK-ARM libtxffmpeg  = " + fileMD7 + " FILE_MD5_FFMPEG_ARM = ___md5_libtxffmpeg_arm_md5______");
        Log.e(TAG, "MD5-CHECK-ARM libtraeimpl  = " + fileMD8 + " FILE_MD5_TRAE_ARM   = ___md5_libtraeimp_arm_md5_______");
        return fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_ARM) && fileMD6 != null && fileMD6.equalsIgnoreCase(FILE_MD5_SATURN_ARM) && fileMD7 != null && fileMD7.equalsIgnoreCase(FILE_MD5_FFMPEG_ARM) && fileMD8 != null && fileMD8.equalsIgnoreCase(FILE_MD5_TRAE_ARM);
    }

    public static void setAppID(String str) {
        TXCCommonUtil.setAppID(str);
    }

    public static void setAppVersion(String str) {
        TXCDRApi.txSetAppVersion(str);
        TXCCommonUtil.setAppVersion(str);
    }

    public static void setConsoleEnabled(boolean z) {
        TXCLog.setConsoleEnabled(z);
    }

    public static void setLibraryPath(String str) {
        C14052f.m83047b(str);
    }

    public static void setListener(ITXLiveBaseListener iTXLiveBaseListener) {
        TXCLog.setListener(new C14404a());
        listener = iTXLiveBaseListener;
    }

    public static void setLogLevel(int i) {
        TXCLog.setLevel(i);
    }

    public static void setPituLicencePath(String str) {
        TXCCommonUtil.setPituLicencePath(str);
    }

    public static void setUserId(String str) {
        TXCCommonUtil.setUserId(str);
    }

    public String getLicenceInfo(Context context) {
        C14035f c14035f = new C14035f();
        LicenceCheck.m82924a().m82951a(c14035f, context);
        return c14035f.f58442a;
    }

    public void setLicence(Context context, String str, String str2) {
        LicenceCheck.m82924a().m82953a(context, str, str2);
    }
}
