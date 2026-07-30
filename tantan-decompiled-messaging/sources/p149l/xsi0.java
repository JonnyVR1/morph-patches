package p149l;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.SystemClock;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class xsi0 {

    /* JADX INFO: renamed from: a */
    public static boolean f194276a = false;

    /* JADX INFO: renamed from: a */
    public static void m210760a(List<String> list) {
        m210761b(list, "Build.BRAND=" + Build.BRAND);
        m210761b(list, "Build.MODEL=" + Build.MODEL);
        m210761b(list, "Build.VERSION.SDK_INT=" + Build.VERSION.SDK_INT);
        m210761b(list, "Build.VERSION.RELEASE=" + Build.VERSION.RELEASE);
        m210761b(list, "Build.VERSION.CODENAME=" + Build.VERSION.CODENAME);
    }

    /* JADX INFO: renamed from: b */
    public static void m210761b(List<String> list, String str) {
        if (list.size() == 0) {
            list.add(str);
            return;
        }
        list.add(SignParameters.NEW_LINE + str);
    }

    /* JADX INFO: renamed from: c */
    public static float m210762c(float f, float f2, float f3) {
        if (f2 <= f3) {
            f3 = f2;
            f2 = f3;
        }
        if (f > f2) {
            return f2;
        }
        return f < f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m210763d(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m210764e(float f) {
        return m210763d(f, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public static AssetFileDescriptor m210765f(Context context, String str) {
        AssetManager assets;
        if (context != null && (assets = context.getResources().getAssets()) != null) {
            try {
                return assets.openFd(str);
            } catch (IOException e) {
                m210769j(e);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0017 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0017: PHI (r0v5 android.graphics.Bitmap) = (r0v12 android.graphics.Bitmap), (r0v8 android.graphics.Bitmap) binds: [B:22:0x002c, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r1v7 java.io.InputStream) = (r1v15 java.io.InputStream), (r1v16 java.io.InputStream) binds: [B:22:0x002c, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: g */
    public static Bitmap m210766g(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        InputStream inputStream;
        Bitmap bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        ?? r0 = 0;
        bitmapDecodeStream = null;
        if (context != null) {
            ?? assets = context.getResources().getAssets();
            try {
                if (assets != 0) {
                    try {
                        inputStreamOpen = assets.open(str);
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                            assets = inputStreamOpen;
                            inputStream = inputStreamOpen;
                            if (inputStreamOpen != null) {
                                try {
                                    inputStream.close();
                                    assets = inputStream;
                                } catch (Exception e) {
                                    m210769j(e);
                                    assets = e;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            m210769j(e);
                            assets = inputStreamOpen;
                            inputStream = inputStreamOpen;
                            if (inputStreamOpen != null) {
                                inputStream.close();
                                assets = inputStream;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        inputStreamOpen = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r0 != 0) {
                            try {
                                r0.close();
                            } catch (Exception e4) {
                                m210769j(e4);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = assets;
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: h */
    public static long m210767h() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m210768i(float f, float f2, float f3) {
        if (m210763d(f, f2) || m210763d(f, f3)) {
            return true;
        }
        return f > f2 && f < f3;
    }

    /* JADX INFO: renamed from: j */
    public static void m210769j(Exception exc) {
        if (f194276a) {
            exc.printStackTrace();
        }
    }
}
