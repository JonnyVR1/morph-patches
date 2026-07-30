package com.tencent.could.huiyansdk.utils;

import android.content.Context;
import p149l.e16;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.f */
/* JADX INFO: loaded from: classes2.dex */
public class C13931f {

    /* JADX INFO: renamed from: a */
    public static final String[] f57509a = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: b */
    public static final String[] f57510b = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: a */
    public static boolean m82403a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (e16.m114373a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
