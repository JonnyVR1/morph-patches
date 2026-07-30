package com.p046p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes12.dex */
public class BottomCommentIndexException extends FeedException {
    public BottomCommentIndexException(String str) {
        super(str);
    }

    public static void reportBottomCommentIndexOutOfBounds(String str, String str2) {
        CrashHelper.m81296c(new MomentPostFailedExcepion("MomentId: " + str + "\nParentMessageId:" + str2 + "\nActStackInfo:" + FeedException.getActStackInfo() + "\n Trace: " + FeedException.getTrace(new Exception())));
    }
}
