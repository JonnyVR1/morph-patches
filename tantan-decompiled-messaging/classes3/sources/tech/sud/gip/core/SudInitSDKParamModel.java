package tech.sud.gip.core;

import android.content.Context;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SudInitSDKParamModel {
    private static final String FILE_TAG = "SudInitSDKParamModel";
    private static String _TAG = "SudInitSdkParamModel";
    public String appId;
    public String appKey;
    public Context context;
    public boolean isTestEnv = true;
    public String userId;

    public boolean check() {
        if (this.context == null) {
            SudLogger.m10034e(_TAG, "Please check context invalid");
            LogUtils.file(FILE_TAG, "Please check context invalid");
            return false;
        }
        String str = this.appId;
        if (str == null || str.isEmpty()) {
            SudLogger.m10034e(_TAG, "Please check appId invalid");
            LogUtils.file(FILE_TAG, "Please check appId invalid");
            return false;
        }
        String str2 = this.appKey;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        SudLogger.m10034e(_TAG, "Please check appKey invalid");
        LogUtils.file(FILE_TAG, "Please check appKey invalid");
        return false;
    }
}
