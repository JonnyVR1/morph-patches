package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class CameraSdkUnzipException extends FeedException {
    public CameraSdkUnzipException(String str) {
        super(str);
    }

    public static void reportCameraSdkUnzipExceptionn(String str) {
        CrashHelper.m81296c(new CameraSdkUnzipException(str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
