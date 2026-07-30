package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGPException extends FeedException {
    public FeedGPException(String str) {
        super(str);
    }

    public static void reportMomentDetailTopViewExc(String str) {
        CrashHelper.m82479c(new FeedGPException("Exception in moment detail top view\n and from:" + str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }

    public static void reportPushFromGp(String str) {
        CrashHelper.m82479c(new FeedGPException("Exception is push from GP ：" + str));
    }
}
