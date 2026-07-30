package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class BottomCommentIndexException extends FeedException {
    public BottomCommentIndexException(String str) {
        super(str);
    }

    public static void reportBottomCommentIndexOutOfBounds(String str, String str2) {
        CrashHelper.m82479c(new MomentPostFailedExcepion("MomentId: " + str + "\nParentMessageId:" + str2 + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
