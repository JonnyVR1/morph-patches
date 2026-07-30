package com.p000p1.mobile.putong.feed.helper.exception;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
        CrashHelper.c(new MomentPostFailedExcepion(sb.toString()));
    }
}
