package com.p000p1.mobile.putong.feed.helper.exception;

import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailHeaderBottomViewNullException extends FeedException {
    public MomentDetailHeaderBottomViewNullException(String str) {
        super(str);
    }

    public static void reportContentViewNull(Moment moment) {
        StringBuilder sb = new StringBuilder("Moment id: ");
        sb.append(moment == null ? "null" : ((DbObject) moment).id);
        sb.append("\nmoment.owner:");
        sb.append(moment != null ? moment.owner : "null");
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.c(new MomentDetailHeaderBottomViewNullException(sb.toString()));
    }
}
