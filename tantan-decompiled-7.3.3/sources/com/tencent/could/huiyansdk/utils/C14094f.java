package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import p153l.j26;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.f */
/* JADX INFO: loaded from: classes12.dex */
public class C14094f {

    /* JADX INFO: renamed from: a */
    public static final String[] f58357a = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: b */
    public static final String[] f58358b = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: a */
    public static boolean m83586a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (j26.m143188a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
