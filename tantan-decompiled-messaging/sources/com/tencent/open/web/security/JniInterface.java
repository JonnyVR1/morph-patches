package com.tencent.open.web.security;

import android.content.Context;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14390h;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class JniInterface {
    public static boolean isJniOk = false;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    /* JADX INFO: renamed from: d1 */
    public static native String m84522d1(String str);

    /* JADX INFO: renamed from: d2 */
    public static native String m84523d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    public static void loadSo() {
        if (isJniOk) {
            return;
        }
        try {
            Context contextM84404a = C14390h.m84404a();
            if (contextM84404a == null) {
                SLog.m84309i("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + AuthAgent.SECURE_LIB_NAME);
                return;
            }
            if (!new File(contextM84404a.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME).exists()) {
                SLog.m84309i("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + AuthAgent.SECURE_LIB_NAME);
                return;
            }
            System.load(contextM84404a.getFilesDir().toString() + "/" + AuthAgent.SECURE_LIB_NAME);
            isJniOk = true;
            StringBuilder sb = new StringBuilder("-->load lib success:");
            sb.append(AuthAgent.SECURE_LIB_NAME);
            SLog.m84309i("openSDK_LOG.JniInterface", sb.toString());
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.JniInterface", "-->load lib error:" + AuthAgent.SECURE_LIB_NAME, th);
        }
    }
}
