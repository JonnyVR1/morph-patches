package com.meituan.robust;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public class RobustApkHashUtils {
    private static String robustApkHashValue;

    private static String readFirstLine(Context context, String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            try {
                String line = bufferedReader2.readLine();
                try {
                    bufferedReader2.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (IOException unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return "";
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String readRobustApkHash(Context context) {
        if (TextUtils.isEmpty(robustApkHashValue)) {
            robustApkHashValue = readRobustApkHashFile(context);
        }
        return robustApkHashValue;
    }

    private static String readRobustApkHashFile(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return readFirstLine(context, Constants.ROBUST_APK_HASH_FILE_NAME);
        } catch (Throwable unused) {
            return "";
        }
    }
}
