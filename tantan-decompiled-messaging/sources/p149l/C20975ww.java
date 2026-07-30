package p149l;

import com.p046p1.mobile.account_core.exception.AccountSdkDataException;
import com.p046p1.mobile.account_core.request_data.JsonData;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: renamed from: l.ww */
/* JADX INFO: loaded from: classes8.dex */
public class C20975ww {
    /* JADX INFO: renamed from: a */
    public static void m205790a(String str, JsonData jsonData) {
        String json;
        if (jsonData != null) {
            try {
                json = jsonData.toJson();
            } catch (Exception unused) {
                json = "json fail";
            }
        } else {
            json = "null data";
        }
        m205791b(str, json);
    }

    /* JADX INFO: renamed from: b */
    public static void m205791b(String str, String str2) {
        CrashHelper.m81301h(new AccountSdkDataException("error_post:" + str + ",detail:" + str2), "account_sdk", CrashHelper.ReportLevel.p1);
    }
}
