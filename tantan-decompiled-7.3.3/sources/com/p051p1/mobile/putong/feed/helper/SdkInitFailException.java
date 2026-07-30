package com.p051p1.mobile.putong.feed.helper;

import com.p051p1.mobile.putong.feed.helper.exception.FeedException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.be00;
import p153l.uc4;

/* JADX INFO: loaded from: classes13.dex */
public class SdkInitFailException extends FeedException {
    public SdkInitFailException(String str) {
        super(str);
    }

    public static void reportSdkInitFail() {
        StringBuilder sb = new StringBuilder("CameraSdkHelper.loaded: ");
        sb.append(uc4.m195359i());
        sb.append(",CameraSdkHelper.inited: ");
        sb.append(uc4.f178404b);
        sb.append(",MoMediaManager.mAppId:");
        sb.append(NullChecker.m82486a(be00.f76323a) ? be00.f76323a.m20607a() : "null");
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.m82479c(new SdkInitFailException(sb.toString()));
    }
}
