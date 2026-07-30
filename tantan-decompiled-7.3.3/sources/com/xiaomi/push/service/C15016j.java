package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.xiaomi.push.service.j */
/* JADX INFO: loaded from: classes2.dex */
public class C15016j {
    /* JADX INFO: renamed from: a */
    public static ComponentName m87842a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null) {
                return null;
            }
            boolean zIsEmpty = TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.targetActivity);
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            return new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, zIsEmpty ? activityInfo.name : activityInfo.targetActivity);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87843a(Context context, ComponentName componentName) {
        try {
            new Intent().setComponent(componentName);
            context.getPackageManager().getActivityInfo(componentName, 128);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
