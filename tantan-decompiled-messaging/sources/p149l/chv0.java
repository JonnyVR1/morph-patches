package p149l;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.gms.internal.ads.zzet;

/* JADX INFO: loaded from: classes6.dex */
public final class chv0 {
    /* JADX INFO: renamed from: a */
    public static void m106992a() throws zzet {
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
    public static void m106993b(boolean z, String str) throws zzet {
        if (!z) {
            throw new zzet(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m106994c(Context context) {
        int i = ggw0.f102568a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(ggw0.f102570c) || "XT1650".equals(ggw0.f102571d))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return sev0.m183722a("EGL_EXT_protected_content");
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m106995d() {
        int i = ggw0.f102568a;
        return sev0.m183722a("EGL_KHR_surfaceless_context");
    }
}
