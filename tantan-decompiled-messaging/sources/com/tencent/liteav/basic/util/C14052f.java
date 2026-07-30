package com.tencent.liteav.basic.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14008a;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.f */
/* JADX INFO: loaded from: classes2.dex */
public class C14052f {

    /* JADX INFO: renamed from: a */
    public static long f58507a = 0;

    /* JADX INFO: renamed from: b */
    private static boolean f58508b = true;

    /* JADX INFO: renamed from: c */
    private static String f58509c = "";

    /* JADX INFO: renamed from: d */
    private static int f58510d = 0;

    /* JADX INFO: renamed from: e */
    private static long f58511e = 0;

    /* JADX INFO: renamed from: f */
    private static boolean f58512f = false;

    /* JADX INFO: renamed from: g */
    private static C14047a<C14048b> f58513g = new C14047a<>(new C14047a.a<C14048b>() { // from class: com.tencent.liteav.basic.util.f.1
        @Override // com.tencent.liteav.basic.util.C14047a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C14048b mo83013a() {
            return new C14048b();
        }
    });

    /* JADX INFO: renamed from: h */
    private static final Object f58514h = new Object();

    /* JADX INFO: renamed from: i */
    private static boolean f58515i = false;

    /* JADX INFO: renamed from: j */
    private static int[] f58516j = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000, 7350};

    /* JADX INFO: renamed from: a */
    public static boolean m83041a(String str, String str2) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        if (str == null || str2 == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (!new File(str).exists()) {
                return false;
            }
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    File file = new File(str2);
                    if (file.exists()) {
                        file.delete();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                        mediaMetadataRetriever.release();
                        return true;
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (mediaMetadataRetriever == null) {
                            throw th;
                        }
                        mediaMetadataRetriever.release();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaMetadataRetriever = null;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever = null;
        }
        TXCLog.m82967e("TXCSystemUtil", "get video thumb failed.", e);
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused3) {
            }
        }
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.release();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m83048b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Error e) {
            e.toString();
            return false;
        } catch (Exception e2) {
            e2.toString();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m83050c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m83052d(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            System.currentTimeMillis();
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m83053e(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            TXCLog.m82967e("TXCSystemUtil", "getNetworkType: error occurred.", e);
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 9) {
            return 5;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getType() != 0) {
            return 0;
        }
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
    }

    /* JADX INFO: renamed from: f */
    public static boolean m83056f() {
        boolean z;
        synchronized (f58514h) {
            try {
                if (!f58515i) {
                    m83040a("txffmpeg");
                    m83040a("traeimp-rtmp");
                    f58515i = m83040a("liteavsdk");
                }
                z = f58515i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public static String m83057g() {
        return f58509c;
    }

    /* JADX INFO: renamed from: c */
    public static String m83049c() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: d */
    public static String m83051d() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: f */
    public static String m83055f(Context context) {
        return TXCDRApi.getDevUUID(context, TXCDRApi.getSimulateIDFA(context));
    }

    /* JADX INFO: renamed from: b */
    public static int m83044b() {
        if (!f58512f && (f58511e == 0 || TXCTimeUtil.getTimeTick() - f58511e >= 15000)) {
            f58512f = true;
            AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.basic.util.f.2
                @Override // java.lang.Runnable
                public void run() {
                    System.currentTimeMillis();
                    boolean unused = C14052f.f58512f = false;
                    try {
                        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                        Debug.getMemoryInfo(memoryInfo);
                        int totalPss = memoryInfo.getTotalPss();
                        long unused2 = C14052f.f58511e = TXCTimeUtil.getTimeTick();
                        int unused3 = C14052f.f58510d = totalPss / 1024;
                    } catch (Exception unused4) {
                    }
                }
            });
            return f58510d;
        }
        return f58510d;
    }

    /* JADX INFO: renamed from: b */
    public static String m83046b(Context context) {
        return TXCDRApi.getSimulateIDFA(context);
    }

    /* JADX INFO: renamed from: b */
    public static void m83047b(String str) {
        f58509c = str;
    }

    /* JADX INFO: renamed from: e */
    public static String m83054e() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: a */
    public static int[] m83043a() {
        if (f58508b) {
            f58508b = false;
            f58513g.m83012a().m83016a();
            return new int[]{0, 0};
        }
        return f58513g.m83012a().m83016a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83039a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager.getRunningTasks(1) == null) {
                TXCLog.m82966e("TXCSystemUtil", "running task is null, ams is abnormal!!!");
                return false;
            }
            ActivityManager.RunningTaskInfo runningTaskInfo = activityManager.getRunningTasks(1).get(0);
            if (runningTaskInfo != null && runningTaskInfo.topActivity != null) {
                return !runningTaskInfo.topActivity.getPackageName().equals(context.getPackageName());
            }
            TXCLog.m82966e("TXCSystemUtil", "failed to get RunningTaskInfo");
            return false;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m83038a(WeakReference<InterfaceC14007b> weakReference, String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", str);
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str2 != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2);
        }
        m83035a(weakReference, i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static void m83036a(WeakReference<InterfaceC14007b> weakReference, int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        m83035a(weakReference, i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static void m83035a(WeakReference<InterfaceC14007b> weakReference, int i, Bundle bundle) {
        InterfaceC14007b interfaceC14007b;
        if (weakReference == null || (interfaceC14007b = weakReference.get()) == null) {
            return;
        }
        interfaceC14007b.onNotifyEvent(i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static void m83037a(WeakReference<InterfaceC14007b> weakReference, String str, int i, Bundle bundle) {
        InterfaceC14007b interfaceC14007b;
        if (weakReference == null || (interfaceC14007b = weakReference.get()) == null) {
            return;
        }
        bundle.putString("EVT_USERID", str);
        interfaceC14007b.onNotifyEvent(i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static C14008a m83034a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i * i4;
        int i8 = i2 * i3;
        if (i7 >= i8) {
            i6 = i8 / i4;
            i5 = i2;
        } else {
            i5 = i7 / i3;
            i6 = i;
        }
        return new C14008a(i > i6 ? (i - i6) >> 1 : 0, i2 > i5 ? (i2 - i5) >> 1 : 0, i6, i5);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83040a(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Error e) {
            e.toString();
            return m83048b(f58509c, str);
        } catch (Exception e2) {
            e2.toString();
            return m83048b(f58509c, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m83031a(int i) {
        int[] iArr;
        int i2 = 0;
        while (true) {
            iArr = f58516j;
            if (i2 >= iArr.length || iArr[i2] == i) {
                break;
            }
            i2++;
        }
        if (i2 >= iArr.length) {
            return -1;
        }
        return i2;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    public static MediaFormat m83033a(int i, int i2, int i3) {
        int iM83031a = m83031a(i);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(0, (byte) ((i3 << 3) | (iM83031a >> 1)));
        byteBufferAllocate.put(1, (byte) (((iM83031a & 1) << 7) | (i2 << 3)));
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        mediaFormatCreateAudioFormat.setInteger("channel-count", i2);
        mediaFormatCreateAudioFormat.setInteger("sample-rate", i);
        mediaFormatCreateAudioFormat.setByteBuffer("csd-0", byteBufferAllocate);
        return mediaFormatCreateAudioFormat;
    }
}
