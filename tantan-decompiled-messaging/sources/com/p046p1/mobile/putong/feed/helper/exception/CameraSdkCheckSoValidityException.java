package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class CameraSdkCheckSoValidityException extends FeedException {
    public CameraSdkCheckSoValidityException(String str) {
        super(str);
    }

    public static void reportCameraSdkCheckSoValidityException(String str) {
        CrashHelper.m81296c(new CameraSdkCheckSoValidityException(str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
