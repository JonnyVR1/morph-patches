package com.tencent.youtu.ytagreflectlivecheck.jni;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class YTAGReflectLiveCheckJNIInterface {
    public static int TIME_REGULATION_LOOSE = 1;
    public static int TIME_REGULATION_STRICT = 0;
    public static int compressReflectionImageScore = 95;
    public static YTAGReflectLiveCheckJNIInterface instance;
    public static Lock instanceLock = new ReentrantLock();
    public static IYtLoggerListener loggerListener;
    public long FRnativePtr;
    public Context context = null;

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public YTAGReflectLiveCheckJNIInterface() {
        FRNativeConstructor();
    }

    public static native String FRGenConfigData(int i, String str);

    public static native String FRVersion();

    public static native void SetActStr(String str);

    public static native void SetPipelineVersion(String str);

    public static synchronized void clearInstance() {
        try {
            instanceLock.lock();
            YTAGReflectLiveCheckJNIInterface yTAGReflectLiveCheckJNIInterface = instance;
            if (yTAGReflectLiveCheckJNIInterface != null) {
                yTAGReflectLiveCheckJNIInterface.FRNativeDestructor();
                instance = null;
            }
            instanceLock.unlock();
        } catch (Throwable th) {
            instanceLock.unlock();
            throw th;
        }
    }

    public static void compressTest(Bitmap bitmap, int i) {
        try {
            File file = new File("/sdcard/reflect/");
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = "/sdcard/reflect/" + i + "/";
            File file2 = new File(str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str, "mytestInJava_" + System.currentTimeMillis() + ".jpg"));
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static native void configNativeLog(boolean z);

    public static byte[] encodeJpeg(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, compressReflectionImageScore, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static synchronized YTAGReflectLiveCheckJNIInterface getInstance() {
        try {
            instanceLock.lock();
            if (instance == null) {
                instance = new YTAGReflectLiveCheckJNIInterface();
            }
            instanceLock.unlock();
        } catch (Throwable th) {
            instanceLock.unlock();
            throw th;
        }
        return instance;
    }

    public static String modelVersion() {
        return "";
    }

    public static void nativeLog(int i, String str) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTAGReflectLiveCheckJNIInterface.nativeLog]", str);
        }
    }

    public static String sdkVersion() {
        return "";
    }

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static native int updateParam(String str, String str2);

    public native int FRDoDetectionYuvs(boolean z, int i);

    public native FullPack FRGetAGin();

    public native int FRGetChangePoint();

    public native int FRGetConfigBegin();

    public native int FRGetConfigEnd();

    public native int FRGetISOCaptureTimeVecSize();

    public native double FRGetISObackup();

    public native int FRGetISOchangeFrame();

    public native double FRGetISOmin();

    public native int FRGetTriggerTime();

    public native int FRInit(boolean z, String str, int i, long[] jArr, float f);

    public native void FRNativeConstructor();

    public native void FRNativeDestructor();

    public native void FRPushCaptureTime(Timeval timeval);

    public native void FRPushISOCaptureTime(Timeval timeval);

    public native void FRPushISOImgYuv(byte[] bArr, int i, int i2);

    public native void FRPushYuv(byte[] bArr, int i, int i2, Timeval timeval, int i3, float[] fArr);

    public native int FRRelease();

    public native void FRSetBegin(Timeval timeval);

    public native void FRSetChangePointTime(Timeval timeval);

    public native void FRSetDoingDelayCalc(boolean z);

    public native void FRSetEnd(Timeval timeval);

    public native void FRSetISObackup(double d);

    public native void FRSetISOchangeFrame(int i);

    public native void FRSetISOchangeTime(Timeval timeval);

    public static void nativeLog(String str, String str2) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static byte[] encodeJpeg(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 99, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
