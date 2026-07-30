package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.provider.Settings;
import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes.dex */
public class UniqueAndroidId implements IUniqueId {
    public static final String IDTAG = "androidId";
    private static final String TAG = "UniqueAndroidId";

    private static String getAndroidId(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if ("9774d56d682e549c".equals(string)) {
                return null;
            }
            return string;
        } catch (Throwable th) {
            MDLog.m7451v(TAG, th.getMessage());
            return null;
        }
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getTag() {
        return IDTAG;
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getUniqueId(Context context) {
        return getAndroidId(context);
    }
}
