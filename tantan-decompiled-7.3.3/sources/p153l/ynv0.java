package p153l;

import android.opengl.EGL14;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
public final class ynv0 {
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public static boolean m216956a(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
