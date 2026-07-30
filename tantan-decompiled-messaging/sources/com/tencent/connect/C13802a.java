package com.tencent.connect;

import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

/* JADX INFO: renamed from: com.tencent.connect.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13802a {
    /* JADX INFO: renamed from: a */
    public static boolean m81985a(String str, IUiListener iUiListener, int i, String str2, String str3) {
        if (!Tencent.isPermissionNotGranted()) {
            return false;
        }
        SLog.m84309i(str, "permission not granted");
        if (iUiListener == null) {
            return true;
        }
        iUiListener.onError(new UiError(i, str2, str3));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81984a(String str, IUiListener iUiListener) {
        return m81985a(str, iUiListener, -6, Constants.MSG_PERMISSION_NOT_GRANTED, Constants.MSG_PERMISSION_NOT_GRANTED);
    }
}
