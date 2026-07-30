package com.tencent.open.web.security;

import android.content.Context;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14553h;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class JniInterface {
    public static boolean isJniOk = false;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    /* JADX INFO: renamed from: d1 */
    public static native String m85705d1(String str);

    /* JADX INFO: renamed from: d2 */
    public static native String m85706d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    public static void loadSo() {
        if (isJniOk) {
            return;
        }
        try {
            Context contextM85587a = C14553h.m85587a();
            if (contextM85587a == null) {
                SLog.m85492i("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + AuthAgent.SECURE_LIB_NAME);
                return;
            }
            if (!new File(contextM85587a.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                SLog.m85492i("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + AuthAgent.SECURE_LIB_NAME);
                return;
            }
            System.load(contextM85587a.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
            isJniOk = true;
            StringBuilder sb = new StringBuilder("-->load lib success:");
            sb.append(AuthAgent.SECURE_LIB_NAME);
            SLog.m85492i("openSDK_LOG.JniInterface", sb.toString());
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.JniInterface", "-->load lib error:" + AuthAgent.SECURE_LIB_NAME, th);
        }
    }
}
