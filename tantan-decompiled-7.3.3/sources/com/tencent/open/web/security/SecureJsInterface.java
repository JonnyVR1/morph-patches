package com.tencent.open.web.security;

import com.tencent.open.C14521b;
import com.tencent.open.log.SLog;
import p153l.azk0;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public class SecureJsInterface extends C14521b.b {
    public static boolean isPWDEdit = false;

    /* JADX INFO: renamed from: a */
    private String f61210a;

    public void clearAllEdit() {
        SLog.m85492i("openSDK_LOG.SecureJsInterface", "-->clear all edit.");
        try {
            JniInterface.clearAllPWD();
        } catch (Exception e) {
            SLog.m85490e("openSDK_LOG.SecureJsInterface", "-->clear all edit exception: " + e.getMessage());
            iig0.m140070a(e);
        }
    }

    public void curPosFromJS(String str) {
        int i;
        SLog.m85488d("openSDK_LOG.SecureJsInterface", "-->curPosFromJS: " + str);
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            SLog.m85491e("openSDK_LOG.SecureJsInterface", "-->curPosFromJS number format exception.", e);
            i = -1;
        }
        if (i < 0) {
            azk0.m101074a("position is illegal.");
            return;
        }
        boolean z = C14563a.f61212b;
        if (z) {
            if (JniInterface.BackSpaceChar(z, i)) {
                C14563a.f61212b = false;
            }
        } else {
            String str2 = C14563a.f61211a;
            this.f61210a = str2;
            JniInterface.insetTextToArray(i, str2, str2.length());
            SLog.m85496v("openSDK_LOG.SecureJsInterface", "curPosFromJS mKey: " + this.f61210a);
        }
    }

    @Override // com.tencent.open.C14521b.b
    public boolean customCallback() {
        return true;
    }

    public String getMD5FromNative() {
        SLog.m85492i("openSDK_LOG.SecureJsInterface", "-->get md5 form native");
        try {
            String pWDKeyToMD5 = JniInterface.getPWDKeyToMD5(null);
            SLog.m85496v("openSDK_LOG.SecureJsInterface", "-->getMD5FromNative, MD5= " + pWDKeyToMD5);
            return pWDKeyToMD5;
        } catch (Exception e) {
            SLog.m85490e("openSDK_LOG.SecureJsInterface", "-->get md5 form native exception: " + e.getMessage());
            iig0.m140070a(e);
            return null;
        }
    }

    public void isPasswordEdit(String str) {
        int i;
        SLog.m85492i("openSDK_LOG.SecureJsInterface", "-->is pswd edit, flag: " + str);
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            SLog.m85490e("openSDK_LOG.SecureJsInterface", "-->is pswd edit exception: " + e.getMessage());
            i = -1;
        }
        if (i != 0 && i != 1) {
            azk0.m101074a("is pswd edit flag is illegal.");
        } else if (i == 0) {
            isPWDEdit = false;
        } else if (i == 1) {
            isPWDEdit = true;
        }
    }
}
