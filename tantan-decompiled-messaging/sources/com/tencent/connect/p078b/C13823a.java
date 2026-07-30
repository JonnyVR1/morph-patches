package com.tencent.connect.p078b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: com.tencent.connect.b.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13823a {
    /* JADX INFO: renamed from: a */
    public static boolean m82140a(Activity activity) {
        ComponentName callingActivity;
        String packageName;
        if (activity == null || (callingActivity = activity.getCallingActivity()) == null || (packageName = callingActivity.getPackageName()) == null) {
            return true;
        }
        return !packageName.equals(activity.getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public static void m82139a(Intent intent) {
        if (intent != null) {
            intent.setFlags(intent.getFlags() & (-196));
        }
    }
}
