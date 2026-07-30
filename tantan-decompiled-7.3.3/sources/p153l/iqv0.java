package p153l;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.gms.internal.ads.zzet;

/* JADX INFO: loaded from: classes6.dex */
public final class iqv0 {
    /* JADX INFO: renamed from: a */
    public static void m141726a() throws zzet {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new zzet(sb.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m141727b(boolean z, String str) throws zzet {
        if (!z) {
            throw new zzet(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m141728c(Context context) {
        int i = mpw0.f137957a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(mpw0.f137959c) || "XT1650".equals(mpw0.f137960d))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return ynv0.m216956a("EGL_EXT_protected_content");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m141729d() {
        int i = mpw0.f137957a;
        return ynv0.m216956a("EGL_KHR_surfaceless_context");
    }
}
