package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class CameraSdkCheckSoValidityException extends FeedException {
    public CameraSdkCheckSoValidityException(String str) {
        super(str);
    }

    public static void reportCameraSdkCheckSoValidityException(String str) {
        CrashHelper.m82479c(new CameraSdkCheckSoValidityException(str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
