package p153l;

import com.p051p1.mobile.account_core.exception.AccountSdkDataException;
import com.p051p1.mobile.account_core.request_data.JsonData;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: renamed from: l.qw */
/* JADX INFO: loaded from: classes8.dex */
public class C19682qw {
    /* JADX INFO: renamed from: a */
    public static void m178399a(String str, JsonData jsonData) {
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
        m178400b(str, json);
    }

    /* JADX INFO: renamed from: b */
    public static void m178400b(String str, String str2) {
        CrashHelper.m82484h(new AccountSdkDataException("error_post:" + str + ",detail:" + str2), "account_sdk", CrashHelper.ReportLevel.p1);
    }
}
