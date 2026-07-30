package p153l;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class jej {
    /* JADX INFO: renamed from: a */
    public static void m144567a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(iGlGetError);
        MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, str2);
        azk0.m101074a(str2);
    }
}
