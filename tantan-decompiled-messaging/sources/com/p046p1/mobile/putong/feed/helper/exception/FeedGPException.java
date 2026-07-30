package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGPException extends FeedException {
    public FeedGPException(String str) {
        super(str);
    }

    public static void reportMomentDetailTopViewExc(String str) {
        CrashHelper.m81296c(new FeedGPException("Exception in moment detail top view\n and from:" + str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }

    public static void reportPushFromGp(String str) {
        CrashHelper.m81296c(new FeedGPException("Exception is push from GP ：" + str));
    }
}
