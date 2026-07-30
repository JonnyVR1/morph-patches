package com.tencent.open.web.security;

import com.tencent.open.C14358b;
import com.tencent.open.log.SLog;
import p149l.aag0;
import p149l.upk0;

/* JADX INFO: loaded from: classes2.dex */
public class SecureJsInterface extends C14358b.b {
    public static boolean isPWDEdit = false;

    /* JADX INFO: renamed from: a */
    private String f60362a;

    public void clearAllEdit() {
        SLog.m84309i("openSDK_LOG.SecureJsInterface", "-->clear all edit.");
        try {
            JniInterface.clearAllPWD();
        } catch (Exception e) {
            SLog.m84307e("openSDK_LOG.SecureJsInterface", "-->clear all edit exception: " + e.getMessage());
            aag0.m95543a(e);
        }
    }

    public void curPosFromJS(String str) {
        int i;
        SLog.m84305d("openSDK_LOG.SecureJsInterface", "-->curPosFromJS: " + str);
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            SLog.m84308e("openSDK_LOG.SecureJsInterface", "-->curPosFromJS number format exception.", e);
            i = -1;
        }
        if (i < 0) {
            upk0.m194883a("position is illegal.");
            return;
        }
        boolean z = C14400a.f60364b;
        if (z) {
            if (JniInterface.BackSpaceChar(z, i)) {
                C14400a.f60364b = false;
            }
        } else {
            String str2 = C14400a.f60363a;
            this.f60362a = str2;
            JniInterface.insetTextToArray(i, str2, str2.length());
            SLog.m84313v("openSDK_LOG.SecureJsInterface", "curPosFromJS mKey: " + this.f60362a);
        }
    }

    @Override // com.tencent.open.C14358b.b
    public boolean customCallback() {
        return true;
    }

    public String getMD5FromNative() {
        SLog.m84309i("openSDK_LOG.SecureJsInterface", "-->get md5 form native");
        try {
            String pWDKeyToMD5 = JniInterface.getPWDKeyToMD5(null);
            SLog.m84313v("openSDK_LOG.SecureJsInterface", "-->getMD5FromNative, MD5= " + pWDKeyToMD5);
            return pWDKeyToMD5;
        } catch (Exception e) {
            SLog.m84307e("openSDK_LOG.SecureJsInterface", "-->get md5 form native exception: " + e.getMessage());
            aag0.m95543a(e);
            return null;
        }
    }

    public void isPasswordEdit(String str) {
        int i;
        SLog.m84309i("openSDK_LOG.SecureJsInterface", "-->is pswd edit, flag: " + str);
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            SLog.m84307e("openSDK_LOG.SecureJsInterface", "-->is pswd edit exception: " + e.getMessage());
            i = -1;
        }
        if (i != 0 && i != 1) {
            upk0.m194883a("is pswd edit flag is illegal.");
        } else if (i == 0) {
            isPWDEdit = false;
        } else if (i == 1) {
            isPWDEdit = true;
        }
    }
}
