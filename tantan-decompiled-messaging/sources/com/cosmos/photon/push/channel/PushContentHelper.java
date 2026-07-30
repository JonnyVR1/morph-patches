package com.cosmos.photon.push.channel;

import android.net.Uri;
import android.os.Bundle;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;

/* JADX INFO: loaded from: classes.dex */
public class PushContentHelper {
    public static final String CONTENT_URI = "content://%s.push.provider";

    public static Bundle executeAction(String str, String str2, Bundle bundle) {
        try {
            return AppContext.getContext().getContentResolver().call(Uri.parse(String.format(CONTENT_URI, str)), str2, (String) null, bundle);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.CHANNEL, th);
            return null;
        }
    }
}
