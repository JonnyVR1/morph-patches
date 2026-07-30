package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class CameraSdkUnzipException extends FeedException {
    public CameraSdkUnzipException(String str) {
        super(str);
    }

    public static void reportCameraSdkUnzipExceptionn(String str) {
        CrashHelper.m82479c(new CameraSdkUnzipException(str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
