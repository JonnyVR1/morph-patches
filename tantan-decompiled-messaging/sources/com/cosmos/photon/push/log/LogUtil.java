package com.cosmos.photon.push.log;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.mdlog.XLogImpl;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import p149l.mc90;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {
    public static final String STATISTIC_COMMON_HEADER = "common";
    public static final String STATISTIC_LOG = "mmpush_sdk";

    private static String getFilePrefix(Context context) {
        return "mdlog_" + getProcessSuffix(context);
    }

    public static String getProcessSuffix(Context context) {
        String strM153989a = mc90.m153989a(context);
        if (TextUtils.equals(strM153989a, context.getPackageName())) {
            return BLiveTraceServerLocation.main;
        }
        return (strM153989a == null || !strM153989a.contains(":") || strM153989a.indexOf(":") <= 0) ? "" : strM153989a.substring(strM153989a.indexOf(":") + 1);
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
