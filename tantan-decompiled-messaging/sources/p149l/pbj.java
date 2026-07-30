package p149l;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class pbj {
    /* JADX INFO: renamed from: a */
    public static void m168211a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(iGlGetError);
        MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, str2);
        upk0.m194883a(str2);
    }
}
