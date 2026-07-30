package com.tencent.connect.p083b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: com.tencent.connect.b.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13986a {
    /* JADX INFO: renamed from: a */
    public static boolean m83323a(Activity activity) {
        ComponentName callingActivity;
        String packageName;
        if (activity == null || (callingActivity = activity.getCallingActivity()) == null || (packageName = callingActivity.getPackageName()) == null) {
            return true;
        }
        return !packageName.equals(activity.getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public static void m83322a(Intent intent) {
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
    }
}
