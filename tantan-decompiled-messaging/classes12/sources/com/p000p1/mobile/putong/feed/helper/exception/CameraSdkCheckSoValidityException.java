package com.p000p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraSdkCheckSoValidityException extends FeedException {
    public CameraSdkCheckSoValidityException(String str) {
        super(str);
    }

    public static void reportCameraSdkCheckSoValidityException(String str) {
        CrashHelper.c(new CameraSdkCheckSoValidityException(str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
