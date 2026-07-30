package com.cosmos.photon.push.log;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.mdlog.XLogImpl;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import p153l.qk90;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {
    public static final String STATISTIC_COMMON_HEADER = "common";
    public static final String STATISTIC_LOG = "mmpush_sdk";

    private static String getFilePrefix(Context context) {
        return "mdlog_" + getProcessSuffix(context);
    }

    public static String getProcessSuffix(Context context) {
        String strM176942a = qk90.m176942a(context);
        if (TextUtils.equals(strM176942a, context.getPackageName())) {
            return BLiveTraceServerLocation.main;
        }
        return (strM176942a == null || !strM176942a.contains(":") || strM176942a.indexOf(":") <= 0) ? "" : strM176942a.substring(strM176942a.indexOf(":") + 1);
    }

    public static void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        XLogImpl.open(true, 0, context.getCacheDir().getAbsolutePath(), str, getFilePrefix(context));
        XLogImpl.appenderSetMaxFileSize(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        MDLog.setLogImp(new XLogImpl());
    }

    public static void setLogOpen(boolean z) {
        MDLog.setConsoleLogOpen(z);
        MDLog.setLevel(z ? 0 : 7);
        MDLog.setOpenStackInfo(true);
        PushLogger.DEBUG = z;
    }
}
