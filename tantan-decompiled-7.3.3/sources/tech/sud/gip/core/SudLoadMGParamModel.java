package tech.sud.gip.core;

import android.app.Activity;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SudLoadMGParamModel {
    private static String FILE_TAG = "SudLoadMGParamModel";
    private static String _TAG = "SudLoadMgParamModel";
    public Activity activity;
    public String authorizationSecret;
    public String code;
    public String language;
    public int loadMGMode = 0;
    public long mgId;
    public String roomId;
    public String userId;

    public boolean check() {
        if (this.activity == null) {
            SudLogger.m222813e(_TAG, "Please check activity invalid");
            LogUtils.file(FILE_TAG, "Please check activity invalid");
            return false;
        }
        String str = this.userId;
        if (str == null || str.isEmpty()) {
            SudLogger.m222813e(_TAG, "Please check userId invalid");
            LogUtils.file(FILE_TAG, "Please check userId invalid");
            return false;
        }
        String str2 = this.roomId;
        if (str2 == null || str2.isEmpty()) {
            SudLogger.m222813e(_TAG, "Please check roomId invalid");
            LogUtils.file(FILE_TAG, "Please check roomId invalid");
            return false;
        }
        String str3 = this.code;
        if (str3 == null || str3.isEmpty()) {
            SudLogger.m222813e(_TAG, "Please check code invalid");
            LogUtils.file(FILE_TAG, "Please check code invalid");
            return false;
        }
        if (this.mgId <= 0) {
            SudLogger.m222813e(_TAG, "Please check mgId invalid");
            LogUtils.file(FILE_TAG, "Please check mgId invalid");
            return false;
        }
        String str4 = this.language;
        if (str4 == null || str4.isEmpty()) {
            SudLogger.m222819w(_TAG, "Please check language is null or empty");
            LogUtils.file(FILE_TAG, "Please check language is null or empty");
        }
        int i = this.loadMGMode;
        if (i != 0) {
            if (i != 1) {
                String str5 = String.format("Please check loadMgMode=%d invalid, not support this value", Integer.valueOf(i));
                SudLogger.m222813e(_TAG, str5);
                LogUtils.file(FILE_TAG, str5);
                return false;
            }
            String str6 = this.authorizationSecret;
            if (str6 == null || str6.isEmpty()) {
                SudLogger.m222813e(_TAG, "Please check authorizationSecret invalid, loadMgMode=1");
                LogUtils.file(FILE_TAG, "Please check authorizationSecret invalid, loadMgMode=1");
                return false;
            }
        }
        return true;
    }
}
