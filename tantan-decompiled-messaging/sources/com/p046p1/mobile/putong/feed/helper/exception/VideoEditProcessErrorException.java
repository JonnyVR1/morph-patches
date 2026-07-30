package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class VideoEditProcessErrorException extends FeedException {
    public VideoEditProcessErrorException(String str) {
        super(str);
    }

    public static void reportVideoEditProcessError(int i, int i2, String str) {
        CrashHelper.m81296c(new VideoEditProcessErrorException("视频合成失败，请重试 what: " + i + "\nerrorCode:" + i2 + "\nmsg:" + str + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
