package com.p000p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraSdkUnzipException extends FeedException {
    public CameraSdkUnzipException(String str) {
        super(str);
    }

    public static void reportCameraSdkUnzipExceptionn(String str) {
        CrashHelper.c(new CameraSdkUnzipException(str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
