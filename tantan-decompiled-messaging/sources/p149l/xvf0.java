package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class xvf0 {
    /* JADX INFO: renamed from: a */
    public static void m211279a(String str, String str2, String str3, Object... objArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.MODULE;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        l3fVar.f125897p = str3;
        l3fVar.f125882a = 1;
        l3fVar.f125904w = m211280b(objArr);
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m211280b(Object... objArr) {
        n11.m157329b((objArr.length & 1) != 0);
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < objArr.length; i += 2) {
            if (objArr[i] == null) {
                objArr[i] = "null";
            }
            int i2 = i + 1;
            if (objArr[i2] == null) {
                objArr[i2] = "null";
            }
            try {
                jSONObject.put(objArr[i].toString(), objArr[i2].toString());
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m211281c(String str, Object... objArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125900s = str;
        l3fVar.f125895n = "";
        l3fVar.f125882a = 1;
        l3fVar.f125904w = m211280b(objArr);
        zvf0.m220391m(l3fVar);
    }
}
