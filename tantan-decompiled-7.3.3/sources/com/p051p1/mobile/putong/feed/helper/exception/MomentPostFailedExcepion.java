package com.p051p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class MomentPostFailedExcepion extends FeedException {
    public MomentPostFailedExcepion(String str) {
        super(str);
    }

    public static void reportMomentPostFailed(Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder("isFollowAb: ");
        sb.append(z);
        sb.append("\nerror:");
        sb.append(th == null ? "null" : th.toString());
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.m82479c(new MomentPostFailedExcepion(sb.toString()));
    }
}
