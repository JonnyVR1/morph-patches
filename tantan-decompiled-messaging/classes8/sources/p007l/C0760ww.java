package p007l;

import com.p003p1.mobile.account_core.exception.AccountSdkDataException;
import com.p003p1.mobile.account_core.request_data.JsonData;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: renamed from: l.ww */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0760ww {
    /* JADX INFO: renamed from: a */
    public static void m11389a(String str, JsonData jsonData) {
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
        m11390b(str, json);
    }

    /* JADX INFO: renamed from: b */
    public static void m11390b(String str, String str2) {
        CrashHelper.h(new AccountSdkDataException("error_post:" + str + ",detail:" + str2), "account_sdk", CrashHelper.ReportLevel.p1);
    }
}
